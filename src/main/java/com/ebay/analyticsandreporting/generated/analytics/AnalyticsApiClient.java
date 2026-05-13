package com.ebay.analyticsandreporting.generated.analytics;

import com.ebay.analyticsandreporting.generated.analytics.customer_service_metric.CustomerServiceMetricRequestBuilder;
import com.ebay.analyticsandreporting.generated.analytics.seller_standards_profile.SellerStandardsProfileRequestBuilder;
import com.ebay.analyticsandreporting.generated.analytics.traffic_report.TrafficReportRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AnalyticsApiClient extends BaseRequestBuilder {
    /**
     * The customer_service_metric property
     * @return a {@link CustomerServiceMetricRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomerServiceMetricRequestBuilder customerServiceMetric() {
        return new CustomerServiceMetricRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The seller_standards_profile property
     * @return a {@link SellerStandardsProfileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SellerStandardsProfileRequestBuilder sellerStandardsProfile() {
        return new SellerStandardsProfileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The traffic_report property
     * @return a {@link TrafficReportRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TrafficReportRequestBuilder trafficReport() {
        return new TrafficReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AnalyticsApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AnalyticsApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api.ebay.com{basePath}");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
