// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.analyticsandreporting.clients.rest;

import com.ebay.analyticsandreporting.configuration.AnalyticsAndReportingConfiguration;
import com.ebay.analyticsandreporting.configuration.RequestOptions;
import com.ebay.analyticsandreporting.configuration.TokenContext;
import com.ebay.analyticsandreporting.generated.analytics.AnalyticsApiClient;
import com.ebay.analyticsandreporting.generated.analytics.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.io.InputStream;
import com.microsoft.kiota.serialization.UntypedNode;

public final class AnalyticsClient {
    private final AnalyticsApiClient kiota;
    private final AnalyticsAndReportingConfiguration config;

    public AnalyticsClient(AnalyticsApiClient kiota, AnalyticsAndReportingConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    public CompletableFuture<GetCustomerServiceMetricResponse> getCustomerServiceMetricAsync(
            String customerServiceMetricType, String evaluationType, String evaluationMarketplaceId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.customerServiceMetric().byCustomer_service_metric_type(Params.requireValid("customerServiceMetricType", customerServiceMetricType)).byEvaluation_type(Params.requireValid("evaluationType", evaluationType)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (evaluationMarketplaceId != null) config.queryParameters.evaluationMarketplaceId = evaluationMarketplaceId;
            });
        }));
    }

    public CompletableFuture<FindSellerStandardsProfilesResponse> findSellerStandardsProfilesAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.sellerStandardsProfile().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<StandardsProfile> getSellerStandardsProfileAsync(
            String cycle, String program, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.sellerStandardsProfile().byProgram(Params.requireValid("program", program)).byCycle(Params.requireValid("cycle", cycle)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Report> getTrafficReportAsync(
            String dimension, String filter, String metric, String sort, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.trafficReport().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (dimension != null) config.queryParameters.dimension = dimension;
                if (filter != null) config.queryParameters.filter = filter;
                if (metric != null) config.queryParameters.metric = metric;
                if (sort != null) config.queryParameters.sort = sort;
            });
        }));
    }
}
