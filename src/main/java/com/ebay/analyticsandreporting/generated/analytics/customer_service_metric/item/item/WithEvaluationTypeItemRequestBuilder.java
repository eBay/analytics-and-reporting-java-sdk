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

package com.ebay.analyticsandreporting.generated.analytics.customer_service_metric.item.item;

import com.ebay.analyticsandreporting.generated.analytics.models.ErrorResponse;
import com.ebay.analyticsandreporting.generated.analytics.models.GetCustomerServiceMetricResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /customer_service_metric/{customer_service_metric_type}/{evaluation_type}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithEvaluationTypeItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithEvaluationTypeItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithEvaluationTypeItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/customer_service_metric/{customer_service_metric_type}/{evaluation_type}?evaluation_marketplace_id={evaluation_marketplace_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithEvaluationTypeItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithEvaluationTypeItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/customer_service_metric/{customer_service_metric_type}/{evaluation_type}?evaluation_marketplace_id={evaluation_marketplace_id}", rawUrl);
    }
    /**
     * Use this method to retrieve a seller&apos;s performance and rating for the customer service metric.  &lt;br&gt;&lt;br&gt;Control the response from the &lt;b&gt;getCustomerServiceMetric&lt;/b&gt; method using the following path and query parameters: &lt;ul&gt;&lt;li&gt;&lt;b&gt;customer_service_metric_type&lt;/b&gt; controls the type of customer service transactions evaluated for the metric rating.&lt;/li&gt; &lt;li&gt;&lt;b&gt;evaluation_type&lt;/b&gt; controls the period you want to review.&lt;/li&gt; &lt;li&gt;&lt;b&gt;evaluation_marketplace_id&lt;/b&gt; specifies the target marketplace for the evaluation.&lt;/li&gt;&lt;/ul&gt; Currently, metric data is returned for only peer benchmarking. For details on the workings of peer benchmarking, see &lt;a href=&quot;https://www.ebay.com/help/policies/selling-policies/seller-performance-policy/service-metrics-policy?id=4769&quot; title=&quot;eBay Help pages&quot; target=&quot;_blank&quot;&gt;Service metrics policy&lt;/a&gt;.  &lt;br&gt;&lt;br&gt;For details on using and understanding the response from this method, see &lt;a href=&quot;/api-docs/sell/static/performance/customer-service-metric.html&quot; title=&quot;Selling Integration Guide&quot; target=&quot;_blank&quot;&gt;Interpreting customer service metric ratings&lt;/a&gt;.
     * @return a {@link GetCustomerServiceMetricResponse}
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 401 status code
     * @throws ErrorResponse When receiving a 403 status code
     * @throws ErrorResponse When receiving a 404 status code
     * @throws ErrorResponse When receiving a 409 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public GetCustomerServiceMetricResponse get() {
        return get(null);
    }
    /**
     * Use this method to retrieve a seller&apos;s performance and rating for the customer service metric.  &lt;br&gt;&lt;br&gt;Control the response from the &lt;b&gt;getCustomerServiceMetric&lt;/b&gt; method using the following path and query parameters: &lt;ul&gt;&lt;li&gt;&lt;b&gt;customer_service_metric_type&lt;/b&gt; controls the type of customer service transactions evaluated for the metric rating.&lt;/li&gt; &lt;li&gt;&lt;b&gt;evaluation_type&lt;/b&gt; controls the period you want to review.&lt;/li&gt; &lt;li&gt;&lt;b&gt;evaluation_marketplace_id&lt;/b&gt; specifies the target marketplace for the evaluation.&lt;/li&gt;&lt;/ul&gt; Currently, metric data is returned for only peer benchmarking. For details on the workings of peer benchmarking, see &lt;a href=&quot;https://www.ebay.com/help/policies/selling-policies/seller-performance-policy/service-metrics-policy?id=4769&quot; title=&quot;eBay Help pages&quot; target=&quot;_blank&quot;&gt;Service metrics policy&lt;/a&gt;.  &lt;br&gt;&lt;br&gt;For details on using and understanding the response from this method, see &lt;a href=&quot;/api-docs/sell/static/performance/customer-service-metric.html&quot; title=&quot;Selling Integration Guide&quot; target=&quot;_blank&quot;&gt;Interpreting customer service metric ratings&lt;/a&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetCustomerServiceMetricResponse}
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 401 status code
     * @throws ErrorResponse When receiving a 403 status code
     * @throws ErrorResponse When receiving a 404 status code
     * @throws ErrorResponse When receiving a 409 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public GetCustomerServiceMetricResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("401", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("403", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("409", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorResponse::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetCustomerServiceMetricResponse::createFromDiscriminatorValue);
    }
    /**
     * Use this method to retrieve a seller&apos;s performance and rating for the customer service metric.  &lt;br&gt;&lt;br&gt;Control the response from the &lt;b&gt;getCustomerServiceMetric&lt;/b&gt; method using the following path and query parameters: &lt;ul&gt;&lt;li&gt;&lt;b&gt;customer_service_metric_type&lt;/b&gt; controls the type of customer service transactions evaluated for the metric rating.&lt;/li&gt; &lt;li&gt;&lt;b&gt;evaluation_type&lt;/b&gt; controls the period you want to review.&lt;/li&gt; &lt;li&gt;&lt;b&gt;evaluation_marketplace_id&lt;/b&gt; specifies the target marketplace for the evaluation.&lt;/li&gt;&lt;/ul&gt; Currently, metric data is returned for only peer benchmarking. For details on the workings of peer benchmarking, see &lt;a href=&quot;https://www.ebay.com/help/policies/selling-policies/seller-performance-policy/service-metrics-policy?id=4769&quot; title=&quot;eBay Help pages&quot; target=&quot;_blank&quot;&gt;Service metrics policy&lt;/a&gt;.  &lt;br&gt;&lt;br&gt;For details on using and understanding the response from this method, see &lt;a href=&quot;/api-docs/sell/static/performance/customer-service-metric.html&quot; title=&quot;Selling Integration Guide&quot; target=&quot;_blank&quot;&gt;Interpreting customer service metric ratings&lt;/a&gt;.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Use this method to retrieve a seller&apos;s performance and rating for the customer service metric.  &lt;br&gt;&lt;br&gt;Control the response from the &lt;b&gt;getCustomerServiceMetric&lt;/b&gt; method using the following path and query parameters: &lt;ul&gt;&lt;li&gt;&lt;b&gt;customer_service_metric_type&lt;/b&gt; controls the type of customer service transactions evaluated for the metric rating.&lt;/li&gt; &lt;li&gt;&lt;b&gt;evaluation_type&lt;/b&gt; controls the period you want to review.&lt;/li&gt; &lt;li&gt;&lt;b&gt;evaluation_marketplace_id&lt;/b&gt; specifies the target marketplace for the evaluation.&lt;/li&gt;&lt;/ul&gt; Currently, metric data is returned for only peer benchmarking. For details on the workings of peer benchmarking, see &lt;a href=&quot;https://www.ebay.com/help/policies/selling-policies/seller-performance-policy/service-metrics-policy?id=4769&quot; title=&quot;eBay Help pages&quot; target=&quot;_blank&quot;&gt;Service metrics policy&lt;/a&gt;.  &lt;br&gt;&lt;br&gt;For details on using and understanding the response from this method, see &lt;a href=&quot;/api-docs/sell/static/performance/customer-service-metric.html&quot; title=&quot;Selling Integration Guide&quot; target=&quot;_blank&quot;&gt;Interpreting customer service metric ratings&lt;/a&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithEvaluationTypeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithEvaluationTypeItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithEvaluationTypeItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Use this method to retrieve a seller&apos;s performance and rating for the customer service metric.  &lt;br&gt;&lt;br&gt;Control the response from the &lt;b&gt;getCustomerServiceMetric&lt;/b&gt; method using the following path and query parameters: &lt;ul&gt;&lt;li&gt;&lt;b&gt;customer_service_metric_type&lt;/b&gt; controls the type of customer service transactions evaluated for the metric rating.&lt;/li&gt; &lt;li&gt;&lt;b&gt;evaluation_type&lt;/b&gt; controls the period you want to review.&lt;/li&gt; &lt;li&gt;&lt;b&gt;evaluation_marketplace_id&lt;/b&gt; specifies the target marketplace for the evaluation.&lt;/li&gt;&lt;/ul&gt; Currently, metric data is returned for only peer benchmarking. For details on the workings of peer benchmarking, see &lt;a href=&quot;https://www.ebay.com/help/policies/selling-policies/seller-performance-policy/service-metrics-policy?id=4769&quot; title=&quot;eBay Help pages&quot; target=&quot;_blank&quot;&gt;Service metrics policy&lt;/a&gt;.  &lt;br&gt;&lt;br&gt;For details on using and understanding the response from this method, see &lt;a href=&quot;/api-docs/sell/static/performance/customer-service-metric.html&quot; title=&quot;Selling Integration Guide&quot; target=&quot;_blank&quot;&gt;Interpreting customer service metric ratings&lt;/a&gt;.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Use this query parameter to specify the Marketplace ID to evaluate for the customer service metrics and benchmark data.  &lt;br&gt;&lt;br&gt;Customer service metrics are supported for the following eBay marketplaces, and the unique identifier (enum) of the marketplace must be used in this field:&lt;ul&gt;&lt;li&gt;&lt;b&gt;Australia&lt;/b&gt; (&lt;code&gt;EBAY_AU&lt;/code&gt;)&lt;/li&gt;&lt;li&gt;&lt;b&gt;Canada&lt;/b&gt; (&lt;code&gt;EBAY_CA&lt;/code&gt;) &lt;/li&gt;&lt;li&gt;&lt;b&gt;France&lt;/b&gt; (&lt;code&gt;EBAY_FR&lt;/code&gt;) &lt;/li&gt;&lt;li&gt;&lt;b&gt;Germany&lt;/b&gt; (&lt;code&gt;EBAY_DE&lt;/code&gt;) &lt;/li&gt;&lt;li&gt;&lt;b&gt;Great Britain&lt;/b&gt; (&lt;code&gt;EBAY_GB&lt;/code&gt;) &lt;/li&gt;&lt;li&gt;&lt;b&gt;Italy&lt;/b&gt; (&lt;code&gt;EBAY_IT&lt;/code&gt;) &lt;/li&gt;&lt;li&gt;&lt;b&gt;Spain&lt;/b&gt; (&lt;code&gt;EBAY_ES&lt;/code&gt;) &lt;/li&gt;&lt;li&gt;&lt;b&gt;United States&lt;/b&gt; (&lt;code&gt;EBAY_US&lt;/code&gt;) &lt;/li&gt;&lt;/ul&gt;
         */
        @jakarta.annotation.Nullable
        public String evaluationMarketplaceId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("evaluation_marketplace_id", evaluationMarketplaceId);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
