package com.ebay.analyticsandreporting.configuration;

import java.net.URI;
import java.util.Set;
import java.util.HashSet;

/**
 * Configuration for the Analytics and Reporting SDK.
 * Provides base URL for the Analytics API and optional fallback access token.
 */
public final class AnalyticsAndReportingConfiguration {
    // Base URL for Analytics API
    private String analyticsBaseUrl = "https://api.ebay.com/sell/analytics/v1";

    private String accessToken;  // static fallback; per-call token takes precedence
    private boolean diagnosticLogging = false;

    /**
     * Default request options (headers) applied to all SDK calls.
     * Per-call RequestOptions will override these.
     */
    private RequestOptions defaultRequestOptions = new RequestOptions();

    // Getters and setters
    public String getAnalyticsBaseUrl() { return analyticsBaseUrl; }
    public void setAnalyticsBaseUrl(String analyticsBaseUrl) { this.analyticsBaseUrl = analyticsBaseUrl; }

    public String getAccessToken() { return accessToken; }
    public void setAccessToken(String accessToken) { this.accessToken = accessToken; }

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
}
