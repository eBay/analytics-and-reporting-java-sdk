package com.ebay.analyticsandreporting.exceptions;

/**
 * Base exception for Analytics and Reporting SDK errors.
 */
public class AnalyticsAndReportingException extends RuntimeException {
    public AnalyticsAndReportingException(String message) {
        super(message);
    }

    public AnalyticsAndReportingException(String message, Throwable cause) {
        super(message, cause);
    }
}
