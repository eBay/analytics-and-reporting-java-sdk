# Analytics and Reporting Java SDK

A production-ready Java SDK for eBay Analytics and Reporting APIs, providing unified access to seller performance metrics, customer service ratings, traffic reports, and seller standards profiles.

## Features

- **Seller Standards Profile API**: Retrieve seller performance ratings and compliance metrics (2 operations)
- **Customer Service Metric API**: Get customer service performance ratings and benchmarks (1 operation)
- **Traffic Report API**: Access listing traffic data, impressions, and sales metrics (1 operation)
- **Per-Call Authentication**: Token can be passed per-call or set globally
- **Strong Typing**: Kiota-generated types with public abstraction layer
- **Custom Headers Support**: Per-call and global header configuration via RequestOptions
- **Java 17+**: Modern Java with synchronous APIs

## Architecture

```
src/main/java/com/ebay/analyticsandreporting/
├── generated/                    # Kiota-generated REST clients (package-private)
│   └── analytics/
├── clients/
│   └── rest/
│       └── AnalyticsClient.java  # REST client wrapper (public API)
├── configuration/                # SDK configuration and auth
├── exceptions/                   # SDK exceptions
└── AnalyticsAndReportingClient.java  # Main SDK facade
```

## Installation

```bash
# Build from source
mvn clean install

# Publish to local Maven repository
mvn install -DskipTests
```

Then add the dependency to your project:

```xml
<dependency>
    <groupId>com.ebay</groupId>
    <artifactId>analytics-and-reporting-java-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Quick Start

### 1. Basic Usage

```java
import com.ebay.analyticsandreporting.AnalyticsAndReportingClient;
import com.ebay.analyticsandreporting.configuration.AnalyticsAndReportingConfiguration;

var config = new AnalyticsAndReportingConfiguration();
config.setAccessToken("your-ebay-oauth-token");

try (var sdk = new AnalyticsAndReportingClient(config)) {
    // Get all seller standards profiles
    var profiles = sdk.analytics.findSellerStandardsProfiles(null, null);
    System.out.println("Standards Profiles: " + profiles);
}
```

### 2. Per-Call Token (Multi-Tenant)

```java
var config = new AnalyticsAndReportingConfiguration();
// No global token set

try (var sdk = new AnalyticsAndReportingClient(config)) {
    // Pass token per-call for multi-tenant scenarios
    String userToken = getUserTokenFromRequest();
    var profiles = sdk.analytics.findSellerStandardsProfiles(userToken, null);
}
```

### 3. Custom Headers (RequestOptions)

```java
import com.ebay.analyticsandreporting.configuration.RequestOptions;

var config = new AnalyticsAndReportingConfiguration();
config.setAccessToken("token");

// Set default headers for ALL calls
config.getDefaultRequestOptions().addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");
config.getDefaultRequestOptions().addHeader("Accept-Language", "en-US");

try (var sdk = new AnalyticsAndReportingClient(config)) {
    // Per-call headers override defaults
    var options = new RequestOptions();
    options.addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_UK");  // Override marketplace
    options.addHeader("X-Request-ID", "correlation-123");     // Add correlation ID
    
    var profiles = sdk.analytics.findSellerStandardsProfiles(null, options);
}
```

### 4. Seller Standards Profile

```java
// Get all standards profiles
var allProfiles = sdk.analytics.findSellerStandardsProfiles(token, null);

// Get a specific profile by program and cycle
var currentUSProfile = sdk.analytics.getSellerStandardsProfile(
    "PROGRAM_US",      // program: PROGRAM_DE, PROGRAM_GLOBAL, PROGRAM_MOTORS_US, PROGRAM_US
    "CURRENT",         // cycle: CURRENT or PROJECTED
    token,
    null
);

System.out.println("Rating: " + currentUSProfile.getStandardsLevel());
System.out.println("Metrics: " + currentUSProfile.getMetrics());
```

### 5. Customer Service Metric

```java
// Get customer service metric rating
var metric = sdk.analytics.getCustomerServiceMetric(
    "ITEM_NOT_AS_DESCRIBED",  // customerServiceMetricType: ITEM_NOT_AS_DESCRIBED or ITEM_NOT_RECEIVED
    "CURRENT",                // evaluationType: CURRENT or PROJECTED
    "EBAY_US",               // evaluationMarketplaceId (required)
    token,
    null
);

System.out.println("Rating: " + metric.getRate());
System.out.println("Benchmark: " + metric.getBenchmarkData());
```

### 6. Traffic Report

```java
// Get traffic report with filters
var report = sdk.analytics.getTrafficReport(
    "DAY",                                                 // dimension: DAY or LISTING
    "marketplace_ids:{EBAY_US},date_range:[20240101..20240131]",  // filter
    "CLICK_THROUGH_RATE,TRANSACTION,LISTING_IMPRESSION_TOTAL",   // metric (comma-separated)
    "-TRANSACTION",                                        // sort (prefix with - for descending)
    token,
    null
);

System.out.println("Start Date: " + report.getStartDate());
System.out.println("End Date: " + report.getEndDate());
System.out.println("Last Updated: " + report.getLastUpdatedDate());
System.out.println("Records: " + report.getRecords());

// Get listing-specific traffic
var listingReport = sdk.analytics.getTrafficReport(
    "LISTING",
    "marketplace_ids:{EBAY_US},listing_ids:{12345|67890},date_range:[20240101..20240131]",
    "LISTING_VIEWS_TOTAL,SALES_CONVERSION_RATE",
    null,
    token,
    null
);
```

## Configuration

### AnalyticsAndReportingConfiguration Options

```java
var config = new AnalyticsAndReportingConfiguration();

// Base URL (defaults to api.ebay.com)
config.setAnalyticsBaseUrl("https://api.ebay.com");

// Authentication
config.setAccessToken("your-token");  // Optional fallback token

// Diagnostics
config.setDiagnosticLogging(true);    // Enable request/response logging

// Default headers (applied to all requests)
config.getDefaultRequestOptions().addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");
config.getDefaultRequestOptions().addHeader("Accept-Language", "en-US");
```

## API Coverage

### Seller Standards Profile (2 operations)
- `findSellerStandardsProfiles()` - Get all standards profiles for the seller
- `getSellerStandardsProfile(program, cycle)` - Get a specific profile by program and cycle

**Programs**: `PROGRAM_DE`, `PROGRAM_GLOBAL`, `PROGRAM_MOTORS_US`, `PROGRAM_US`  
**Cycles**: `CURRENT`, `PROJECTED`

### Customer Service Metric (1 operation)
- `getCustomerServiceMetric(type, evaluationType, marketplaceId)` - Get customer service performance rating

**Metric Types**: `ITEM_NOT_AS_DESCRIBED`, `ITEM_NOT_RECEIVED`  
**Evaluation Types**: `CURRENT`, `PROJECTED`  
**Marketplace IDs**: `EBAY_US`, `EBAY_UK`, `EBAY_DE`, etc.

### Traffic Report (1 operation)
- `getTrafficReport(dimension, filter, metric, sort)` - Get traffic report with configurable dimensions and metrics

**Dimensions**: `DAY`, `LISTING`

**Metrics**:
- `CLICK_THROUGH_RATE` - Click-through rate from search results
- `LISTING_IMPRESSION_SEARCH_RESULTS_PAGE` - Impressions on search results
- `LISTING_IMPRESSION_STORE` - Impressions in seller's store
- `LISTING_IMPRESSION_TOTAL` - Total impressions
- `LISTING_VIEWS_SOURCE_DIRECT` - Direct views
- `LISTING_VIEWS_SOURCE_OFF_EBAY` - Views from external sources
- `LISTING_VIEWS_SOURCE_OTHER_EBAY` - Views from other eBay pages
- `LISTING_VIEWS_SOURCE_SEARCH_RESULTS_PAGE` - Views from search results
- `LISTING_VIEWS_SOURCE_STORE` - Views from store
- `LISTING_VIEWS_TOTAL` - Total views
- `SALES_CONVERSION_RATE` - Sales conversion rate
- `TOTAL_IMPRESSION_TOTAL` - Total impressions across all sources
- `TRANSACTION` - Number of transactions

**Filter Parameters**:
- `date_range` - Required. Format: `[YYYYMMDD..YYYYMMDD]` or ISO 8601 with timezone
- `marketplace_ids` - Required for DAY dimension. Format: `{MARKETPLACE_ID}`
- `listing_ids` - Optional. Format: `{listing1|listing2|...}` (max 200)

**Examples**:
```java
// Daily traffic report for US marketplace
"marketplace_ids:{EBAY_US},date_range:[20240101..20240131]"

// Specific listings
"marketplace_ids:{EBAY_US},listing_ids:{12345|67890},date_range:[20240101..20240131]"

// ISO 8601 with timezone (non-Pacific)
"marketplace_ids:{EBAY_US},date_range:[2024-01-01T02:00:00.000-05:00..2024-01-31T02:00:00.000-05:00]"
```

## Regenerating REST Clients

If the OpenAPI specs are updated:

```bash
./generate.sh
mvn clean install
```

This will regenerate all Kiota clients from the specs in the `specs/` directory.

## Requirements

- Java 17 or higher
- Kiota CLI (for regeneration only)

## Dependencies

- `microsoft.kiota:microsoft-kiota-bundle:1.9.2` - REST client runtime
- `com.squareup.okhttp3:okhttp:4.12.0` - HTTP client
- `com.fasterxml.jackson.core:jackson-databind:2.18.2` - JSON processing

## Project Structure

```
analytics-and-reporting-java-sdk/
├── specs/                       # OpenAPI specs
│   └── sell_analytics_v1_oas3.yaml
├── src/main/java/
│   └── com/ebay/analyticsandreporting/
│       ├── AnalyticsAndReportingClient.java
│       ├── configuration/
│       │   ├── AnalyticsAndReportingConfiguration.java
│       │   ├── TokenContext.java
│       │   ├── RequestOptions.java
│       │   └── KiotaAuthProvider.java
│       ├── clients/
│       │   └── rest/
│       │       └── AnalyticsClient.java
│       ├── generated/           # Kiota-generated (committed)
│       │   └── analytics/
│       └── exceptions/
│           └── AnalyticsAndReportingException.java
├── pom.xml
├── generate.sh
├── operations.json
└── README.md
```

## Consistency with .NET and PHP SDKs

This Java SDK mirrors the architecture of the .NET and PHP Analytics and Reporting SDKs:

- **Same API Coverage**: All Analytics API operations (4 total)
- **Same Auth Pattern**: Per-call token with optional fallback
- **Same Naming**: `AnalyticsAndReportingClient`, `AnalyticsAndReportingConfiguration`
- **Same Structure**: Generated layer + thin abstraction wrappers
- **Same Tooling**: Kiota for REST code generation
- **RequestOptions Support**: Per-call and global custom headers

The main difference is the async model: Java uses synchronous calls with exception handling, .NET uses `Task`, and PHP is synchronous with similar patterns.

## Error Handling

```java
try (var sdk = new AnalyticsAndReportingClient(config)) {
    var profiles = sdk.analytics.findSellerStandardsProfiles(token, null);
} catch (RuntimeException e) {
    // Handle API errors
    System.err.println("Error: " + e.getMessage());
    e.printStackTrace();
}
```

## License

Internal eBay use only.
