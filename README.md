# eBay Analytics and Reporting Java SDK

A production-ready Java SDK for eBay Analytics and Reporting APIs, providing unified access to seller performance metrics, customer service ratings, and traffic reports.

## Features

- **Analytics API**: Seller standards profiles, customer service metrics, and traffic reports (4 operations)
- **Strong Typing**: Internal Kiota-generated types with public client wrappers
- **Per-call Overrides**: Pass per-request headers and access tokens alongside SDK-wide defaults

## Architecture

```
src/main/java/com/ebay/analyticsandreporting/
├── generated/                              # Kiota-generated REST clients (internal)
│   └── analytics/
├── clients/
│   └── rest/
│       └── AnalyticsClient.java            # REST client wrapper (public API)
├── configuration/                          # SDK configuration and auth
├── exceptions/                             # SDK exceptions
└── AnalyticsAndReportingClient.java        # Main SDK facade
```

## Requirements

- Java 17+
- Maven

## Installation

```xml
<dependency>
    <groupId>com.ebay</groupId>
    <artifactId>analytics-and-reporting-java-sdk</artifactId>
    <version>0.2.0</version>
</dependency>
```

## Quick Start

```java
var config = new AnalyticsAndReportingConfiguration();
config.setAccessToken("your-oauth-token");

try (var sdk = new AnalyticsAndReportingClient(config)) {
    var profiles = sdk.analytics.findSellerStandardsProfiles(null, null);
    var metric = sdk.analytics.getCustomerServiceMetric(
        "ITEM_NOT_AS_DESCRIBED", "CURRENT", "EBAY_US", null, null);
    var report = sdk.analytics.getTrafficReport(
        "DAY", "marketplace_ids:{EBAY_US},date_range:[20240101..20240131]",
        "TRANSACTION,LISTING_IMPRESSION_TOTAL", null, null, null);
}
```

Per-request headers and tokens can be passed to any method:

```java
var options = new RequestOptions();
options.addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");

sdk.analytics.findSellerStandardsProfiles("per-call-token", options);
```

## API Operations

### Analytics API

| Method | Description |
|---|---|
| `findSellerStandardsProfiles` | Get all seller standards profiles |
| `getSellerStandardsProfile` | Get a specific profile by program and cycle |
| `getCustomerServiceMetric` | Get customer service performance rating |
| `getTrafficReport` | Get traffic report with configurable dimensions and metrics |

## Rate Limiting and Retry

The SDK does not include built-in retry logic or rate-limit handling. eBay's APIs return HTTP 429 Too Many Requests when rate limits are exceeded. Implement exponential back-off in your application layer when calling bulk endpoints in loops.

Refer to eBay's API call limits documentation for per-endpoint rate limit details.

---

## Error Handling

```java
try {
    var profiles = sdk.analytics.findSellerStandardsProfiles(null, null);
} catch (AnalyticsAndReportingException ex) {
    System.err.println("SDK error: " + ex.getMessage());
}
```

## Configuration Options

| Property | Default | Description |
|---|---|---|
| `analyticsBaseUrl` | `https://api.ebay.com` | Analytics API base URL |
| `accessToken` | `null` | Static fallback token; per-call token takes precedence |
| `defaultRequestOptions` | `RequestOptions()` | Default headers applied to all SDK calls |
| `diagnosticLogging` | `false` | Enable diagnostic request/response logging |

## Regenerating the SDK

```bash
./generate.sh
mvn clean install
```

## Development

```bash
mvn clean install   # Build and install
mvn test            # Run tests
mvn package         # Package
```

## Specs

- `sell_analytics_v1_oas3.yaml` — Analytics V1

## Dependencies

- **microsoft-kiota-bundle**: REST client generation and runtime
- **okhttp3**: HTTP client
- **jackson-databind**: JSON processing
- **slf4j-api**: Logging facade

## License

Apache 2.0 © 2026 eBay Inc. See [LICENSE](LICENSE) for details.
