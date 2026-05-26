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

package com.ebay.analyticsandreporting;

import com.ebay.analyticsandreporting.clients.rest.AnalyticsClient;
import com.ebay.analyticsandreporting.configuration.AnalyticsAndReportingConfiguration;
import com.ebay.analyticsandreporting.configuration.KiotaAuthProvider;
import com.ebay.analyticsandreporting.generated.analytics.AnalyticsApiClient;
import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;
import com.microsoft.kiota.http.OkHttpRequestAdapter;
import okhttp3.OkHttpClient;
import java.io.Closeable;

/**
 * Main facade for the Analytics and Reporting SDK.
 * Provides unified access to the Sell Analytics API.
 *
 * <pre>{@code
 * var config = new AnalyticsAndReportingConfiguration();
 * config.setAccessToken("your-token");
 *
 * try (var sdk = new AnalyticsAndReportingClient(config)) {
 *     var profiles = sdk.analytics.findSellerStandardsProfiles(null, null);
 *     System.out.println(profiles);
 * }
 * }</pre>
 */
public final class AnalyticsAndReportingClient implements Closeable {
    private final OkHttpClient sharedHttpClient;

    public final AnalyticsClient analytics;

    public AnalyticsAndReportingClient(AnalyticsAndReportingConfiguration config) {
        // Shared OkHttpClient for all REST clients
        this.sharedHttpClient = new OkHttpClient.Builder()
            .build();

        var authProvider = new BaseBearerTokenAuthenticationProvider(new KiotaAuthProvider(config));

        // Analytics API client
        var analyticsAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        analyticsAdapter.setBaseUrl(config.getAnalyticsBaseUrl());
        this.analytics = new AnalyticsClient(new AnalyticsApiClient(analyticsAdapter), config);
    }

    /**
     * Constructor with custom OkHttpClient.
     * Useful for testing or custom HTTP configuration.
     */
    public AnalyticsAndReportingClient(AnalyticsAndReportingConfiguration config, OkHttpClient httpClient) {
        this.sharedHttpClient = httpClient;

        var authProvider = new BaseBearerTokenAuthenticationProvider(new KiotaAuthProvider(config));

        var analyticsAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        analyticsAdapter.setBaseUrl(config.getAnalyticsBaseUrl());
        this.analytics = new AnalyticsClient(new AnalyticsApiClient(analyticsAdapter), config);
    }

    @Override
    public void close() {
        sharedHttpClient.dispatcher().executorService().shutdown();
        sharedHttpClient.connectionPool().evictAll();
    }
}
