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

package com.ebay.analyticsandreporting.configuration;

import jakarta.annotation.Nullable;
import java.net.URI;
import java.util.Set;
import java.util.HashSet;

/**
 * Configuration for the Analytics and Reporting SDK.
 * Provides base URL for the Analytics API and optional fallback access token.
 */
public final class AnalyticsAndReportingConfiguration {
    private static final String DEFAULT_ANALYTICS_BASE_URL = "https://api.ebay.com/sell/analytics/v1";

    // Base URL for Analytics API (SEC-002: private final)
    private final String analyticsBaseUrl;

    private @Nullable String accessToken;  // static fallback; per-call token takes precedence
    private boolean diagnosticLogging = false;

    /**
     * Default request options (headers) applied to all SDK calls.
     * Per-call RequestOptions will override these.
     */
    private RequestOptions defaultRequestOptions = new RequestOptions();

    /**
     * Default constructor using production eBay API endpoints.
     */
    public AnalyticsAndReportingConfiguration() {
        this.analyticsBaseUrl = DEFAULT_ANALYTICS_BASE_URL;
    }

    /**
     * Constructor accepting custom URL strings.
     * All URLs are validated against the allowed host list (SEC-002).
     *
     * @param analyticsBaseUrl Base URL for the Analytics API
     */
    public AnalyticsAndReportingConfiguration(String analyticsBaseUrl) {
        this.analyticsBaseUrl = validateHost(analyticsBaseUrl);
    }

    // Getters
    public String getAnalyticsBaseUrl() { return analyticsBaseUrl; }

    /**
     * Sets the fallback access token for all SDK calls.
     *
     * <p><strong>Security note (SEC-002):</strong> The token string remains in JVM heap memory
     * until garbage collected and cannot be proactively zeroed. Prefer per-call token passing
     * for sensitive multi-tenant scenarios.
     */
    public void setAccessToken(@Nullable String accessToken) { this.accessToken = accessToken; }
    public @Nullable String getAccessToken() { return accessToken; }

    public boolean isDiagnosticLogging() { return diagnosticLogging; }
    public void setDiagnosticLogging(boolean diagnosticLogging) { this.diagnosticLogging = diagnosticLogging; }

    public RequestOptions getDefaultRequestOptions() { return defaultRequestOptions; }
    public void setDefaultRequestOptions(RequestOptions defaultRequestOptions) { this.defaultRequestOptions = defaultRequestOptions; }

    /**
     * All hostnames tokens may be sent to; used by AllowedHostsValidator.
     */
    public Set<String> getAllowedHosts() {
        Set<String> hosts = new HashSet<>();
        hosts.add(extractHost(analyticsBaseUrl));
        return hosts;
    }

    private String extractHost(String url) {
        try {
            return URI.create(url).getHost();
        } catch (Exception e) {
            return "api.ebay.com"; // fallback
        }
    }

    private String validateHost(String url) {
        try {
            String host = new java.net.URI(url).getHost();
            if (host == null || !getAllowedHosts().contains(host)) {
                throw new IllegalArgumentException("URL host not in allowed list: " + url);
            }
        } catch (java.net.URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URL: " + url, e);
        }
        return url;
    }
}
