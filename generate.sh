#!/bin/bash

# Generate Analytics and Reporting Java SDK using Kiota
# Run this script from the analytics-and-reporting directory

set -e

echo "Generating Analytics and Reporting Java SDK with Kiota..."

# Clean previous generated code
rm -rf src/main/java/com/ebay/analyticsandreporting/generated

# Generate from sell_analytics_v1_oas3.yaml
echo "Generating Analytics API client..."
kiota generate \
  -l java \
  -d specs/sell_analytics_v1_oas3.yaml \
  -c AnalyticsApiClient \
  -n com.ebay.analyticsandreporting.generated.analytics \
  -o src/main/java/com/ebay/analyticsandreporting/generated/analytics \
  --ebc --co

echo "Adding license headers to generated files..."
./add-license-headers.sh ./src

echo "Code generation complete!"
echo "Next steps:"
echo "  1. Create wrapper clients in src/main/java/com/ebay/analyticsandreporting/clients/rest/"
echo "  2. Create configuration classes"
echo "  3. Create main facade AnalyticsAndReportingClient.java"
echo "  4. mvn clean install"
