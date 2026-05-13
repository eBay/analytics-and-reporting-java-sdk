package com.ebay.analyticsandreporting.generated.analytics.customer_service_metric;

import com.ebay.analyticsandreporting.generated.analytics.customer_service_metric.item.WithCustomerServiceMetricTypeItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /customer_service_metric
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerServiceMetricRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.analyticsandreporting.generated.analytics.customer_service_metric.item collection
     * @param customer_service_metric_type Use this path parameter to specify the type of customer service metrics and benchmark data you want returned for the seller. Supported types are:&lt;br&gt; &lt;ul&gt;&lt;li&gt;&lt;code&gt;ITEM_NOT_AS_DESCRIBED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;ITEM_NOT_RECEIVED&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link WithCustomerServiceMetricTypeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCustomerServiceMetricTypeItemRequestBuilder byCustomer_service_metric_type(@jakarta.annotation.Nonnull final String customer_service_metric_type) {
        Objects.requireNonNull(customer_service_metric_type);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("customer_service_metric_type", customer_service_metric_type);
        return new WithCustomerServiceMetricTypeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CustomerServiceMetricRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CustomerServiceMetricRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/customer_service_metric", pathParameters);
    }
    /**
     * Instantiates a new {@link CustomerServiceMetricRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CustomerServiceMetricRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/customer_service_metric", rawUrl);
    }
}
