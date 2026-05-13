package com.ebay.analyticsandreporting.generated.analytics.seller_standards_profile.item;

import com.ebay.analyticsandreporting.generated.analytics.seller_standards_profile.item.item.WithCycleItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /seller_standards_profile/{program}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithProgramItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.analyticsandreporting.generated.analytics.seller_standards_profile.item.item collection
     * @param cycle This path parameter is used to specify the cycle for which metrics and metadata will be retrieved.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/analytics/types/ssp:CycleTypeEnum&quot; target=&quot;_blank&quot;&gt;CycleTypeEnum&lt;/a&gt; for a list of supported values.
     * @return a {@link WithCycleItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCycleItemRequestBuilder byCycle(@jakarta.annotation.Nonnull final String cycle) {
        Objects.requireNonNull(cycle);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cycle", cycle);
        return new WithCycleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithProgramItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProgramItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/seller_standards_profile/{program}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithProgramItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithProgramItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/seller_standards_profile/{program}", rawUrl);
    }
}
