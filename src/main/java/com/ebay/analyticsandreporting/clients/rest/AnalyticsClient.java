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

/**
 * Client for the Sell Analytics API.
 * Provides methods to retrieve seller performance metrics, customer service ratings, and traffic reports.
 */
public final class AnalyticsClient {
    private final AnalyticsApiClient kiota;
    private final AnalyticsAndReportingConfiguration config;

    public AnalyticsClient(AnalyticsApiClient kiota, AnalyticsAndReportingConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    /**
     * Merges default headers from config with per-call headers.
     * Per-call headers override defaults.
     */
    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    // ── Seller Standards Profile ──────────────────────────────────────────

    /**
     * Retrieves all standards profiles for the seller.
     *
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers
     * @return CompletableFuture containing FindSellerStandardsProfilesResponse with all standards profiles
     */
    public CompletableFuture<FindSellerStandardsProfilesResponse> findSellerStandardsProfilesAsync(
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.sellerStandardsProfile().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Retrieves a single standards profile for the seller.
     *
     * @param program PROGRAM_DE, PROGRAM_GLOBAL, PROGRAM_MOTORS_US, or PROGRAM_US
     * @param cycle CURRENT or PROJECTED
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers
     * @return CompletableFuture containing StandardsProfile for the specified program and cycle
     */
    public CompletableFuture<StandardsProfile> getSellerStandardsProfileAsync(
            String program, String cycle, String accessToken, RequestOptions requestOptions) {
        Params.requireValid("program", program);
        Params.requireValid("cycle", cycle);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.sellerStandardsProfile()
                .byProgram(program)
                .byCycle(cycle)
                .get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
        }));
    }

    // ── Customer Service Metric ───────────────────────────────────────────

    /**
     * Retrieves a seller's performance rating for the customer service metric.
     *
     * @param customerServiceMetricType ITEM_NOT_AS_DESCRIBED or ITEM_NOT_RECEIVED
     * @param evaluationType CURRENT or PROJECTED
     * @param evaluationMarketplaceId e.g. EBAY_US (required)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers
     * @return CompletableFuture containing GetCustomerServiceMetricResponse with performance rating
     */
    public CompletableFuture<GetCustomerServiceMetricResponse> getCustomerServiceMetricAsync(
            String customerServiceMetricType,
            String evaluationType,
            String evaluationMarketplaceId,
            String accessToken,
            RequestOptions requestOptions) {
        Params.requireValid("customerServiceMetricType", customerServiceMetricType);
        Params.requireValid("evaluationType", evaluationType);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.customerServiceMetric()
                .byCustomer_service_metric_type(customerServiceMetricType)
                .byEvaluation_type(evaluationType)
                .get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                    if (evaluationMarketplaceId != null) {
                        config.queryParameters.evaluationMarketplaceId = evaluationMarketplaceId;
                    }
                });
        }));
    }

    // ── Traffic Report ────────────────────────────────────────────────────

    /**
     * Returns a traffic report for the seller's listings.
     *
     * @param dimension DAY or LISTING
     * @param filter e.g. "marketplace_ids:{EBAY_US},date_range:[20240101..20240131]"
     * @param metric Comma-separated metrics, e.g. "CLICK_THROUGH_RATE,TRANSACTION"
     * @param sort Metric to sort by; prefix with "-" for descending
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers
     * @return CompletableFuture containing Report with traffic data
     */
    public CompletableFuture<Report> getTrafficReportAsync(
            String dimension,
            String filter,
            String metric,
            String sort,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.trafficReport().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (dimension != null) {
                    config.queryParameters.dimension = dimension;
                }
                if (filter != null) {
                    config.queryParameters.filter = filter;
                }
                if (metric != null) {
                    config.queryParameters.metric = metric;
                }
                if (sort != null) {
                    config.queryParameters.sort = sort;
                }
            });
        }));
    }
}
