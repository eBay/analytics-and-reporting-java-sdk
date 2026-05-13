package com.ebay.analyticsandreporting.generated.analytics.customer_service_metric.item;

import com.ebay.analyticsandreporting.generated.analytics.customer_service_metric.item.item.WithEvaluationTypeItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /customer_service_metric/{customer_service_metric_type}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithCustomerServiceMetricTypeItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.analyticsandreporting.generated.analytics.customer_service_metric.item.item collection
     * @param evaluation_type Use this path parameter to specify the evaluation period to use for the performance metrics. See &lt;a href=&quot;/api-docs/sell/analytics/types/api:EvaluationTypeEnum&quot; target=&quot;_blank&quot;&gt; EvaluationTypeEnum&lt;/a&gt; for more information on the supported values.
     * @return a {@link WithEvaluationTypeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithEvaluationTypeItemRequestBuilder byEvaluation_type(@jakarta.annotation.Nonnull final String evaluation_type) {
        Objects.requireNonNull(evaluation_type);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("evaluation_type", evaluation_type);
        return new WithEvaluationTypeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithCustomerServiceMetricTypeItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCustomerServiceMetricTypeItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/customer_service_metric/{customer_service_metric_type}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithCustomerServiceMetricTypeItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCustomerServiceMetricTypeItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/customer_service_metric/{customer_service_metric_type}", rawUrl);
    }
}
