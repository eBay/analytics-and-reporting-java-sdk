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

package com.ebay.analyticsandreporting.generated.analytics.seller_standards_profile.item.item;

import com.ebay.analyticsandreporting.generated.analytics.models.Error;
import com.ebay.analyticsandreporting.generated.analytics.models.ErrorMessageV3;
import com.ebay.analyticsandreporting.generated.analytics.models.StandardsProfile;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Builds and executes requests for operations under /seller_standards_profile/{program}/{cycle}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithCycleItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithCycleItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCycleItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/seller_standards_profile/{program}/{cycle}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithCycleItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCycleItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/seller_standards_profile/{program}/{cycle}", rawUrl);
    }
    /**
     * This call retrieves a single standards profile for the associated seller.  &lt;br&gt;&lt;br&gt;A &lt;i&gt;standards profile &lt;/i&gt; is a set of eBay seller metrics and the seller&apos;s associated compliance values (either &lt;code&gt;TOP_RATED&lt;/code&gt;, &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, or &lt;code&gt;BELOW_STANDARD&lt;/code&gt;).  &lt;br&gt;&lt;br&gt;A seller can have multiple profiles distinguished by two criteria, a &quot;program&quot; and a &quot;cycle.&quot; A profile&apos;s &lt;i&gt;program &lt;/i&gt; is one of three regions where the seller may have done business, or &lt;code&gt;PROGRAM_GLOBAL&lt;/code&gt; to indicate all marketplaces where the seller has done business. The &lt;i&gt;cycle&lt;/i&gt; value specifies whether the standards compliance values were determined at the last official eBay evaluation (&lt;code&gt;CURRENT&lt;/code&gt;) or at the time of the request (&lt;code&gt;PROJECTED&lt;/code&gt;). Both cycle and a program values are required URI parameters for this method.&lt;br&gt;&lt;br&gt;For more information on the interpreting the response payload of this method, see &lt;a href=&quot;/api-docs/sell/static/performance/seller-standards.html&quot; target=&quot;_blank&quot;&gt;Seller standards profile&lt;/a&gt;.
     * @return a {@link StandardsProfile}
     * @throws ErrorMessageV3 When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws ErrorMessageV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public StandardsProfile get() {
        return get(null);
    }
    /**
     * This call retrieves a single standards profile for the associated seller.  &lt;br&gt;&lt;br&gt;A &lt;i&gt;standards profile &lt;/i&gt; is a set of eBay seller metrics and the seller&apos;s associated compliance values (either &lt;code&gt;TOP_RATED&lt;/code&gt;, &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, or &lt;code&gt;BELOW_STANDARD&lt;/code&gt;).  &lt;br&gt;&lt;br&gt;A seller can have multiple profiles distinguished by two criteria, a &quot;program&quot; and a &quot;cycle.&quot; A profile&apos;s &lt;i&gt;program &lt;/i&gt; is one of three regions where the seller may have done business, or &lt;code&gt;PROGRAM_GLOBAL&lt;/code&gt; to indicate all marketplaces where the seller has done business. The &lt;i&gt;cycle&lt;/i&gt; value specifies whether the standards compliance values were determined at the last official eBay evaluation (&lt;code&gt;CURRENT&lt;/code&gt;) or at the time of the request (&lt;code&gt;PROJECTED&lt;/code&gt;). Both cycle and a program values are required URI parameters for this method.&lt;br&gt;&lt;br&gt;For more information on the interpreting the response payload of this method, see &lt;a href=&quot;/api-docs/sell/static/performance/seller-standards.html&quot; target=&quot;_blank&quot;&gt;Seller standards profile&lt;/a&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link StandardsProfile}
     * @throws ErrorMessageV3 When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws ErrorMessageV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public StandardsProfile get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorMessageV3::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorMessageV3::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, StandardsProfile::createFromDiscriminatorValue);
    }
    /**
     * This call retrieves a single standards profile for the associated seller.  &lt;br&gt;&lt;br&gt;A &lt;i&gt;standards profile &lt;/i&gt; is a set of eBay seller metrics and the seller&apos;s associated compliance values (either &lt;code&gt;TOP_RATED&lt;/code&gt;, &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, or &lt;code&gt;BELOW_STANDARD&lt;/code&gt;).  &lt;br&gt;&lt;br&gt;A seller can have multiple profiles distinguished by two criteria, a &quot;program&quot; and a &quot;cycle.&quot; A profile&apos;s &lt;i&gt;program &lt;/i&gt; is one of three regions where the seller may have done business, or &lt;code&gt;PROGRAM_GLOBAL&lt;/code&gt; to indicate all marketplaces where the seller has done business. The &lt;i&gt;cycle&lt;/i&gt; value specifies whether the standards compliance values were determined at the last official eBay evaluation (&lt;code&gt;CURRENT&lt;/code&gt;) or at the time of the request (&lt;code&gt;PROJECTED&lt;/code&gt;). Both cycle and a program values are required URI parameters for this method.&lt;br&gt;&lt;br&gt;For more information on the interpreting the response payload of this method, see &lt;a href=&quot;/api-docs/sell/static/performance/seller-standards.html&quot; target=&quot;_blank&quot;&gt;Seller standards profile&lt;/a&gt;.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This call retrieves a single standards profile for the associated seller.  &lt;br&gt;&lt;br&gt;A &lt;i&gt;standards profile &lt;/i&gt; is a set of eBay seller metrics and the seller&apos;s associated compliance values (either &lt;code&gt;TOP_RATED&lt;/code&gt;, &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, or &lt;code&gt;BELOW_STANDARD&lt;/code&gt;).  &lt;br&gt;&lt;br&gt;A seller can have multiple profiles distinguished by two criteria, a &quot;program&quot; and a &quot;cycle.&quot; A profile&apos;s &lt;i&gt;program &lt;/i&gt; is one of three regions where the seller may have done business, or &lt;code&gt;PROGRAM_GLOBAL&lt;/code&gt; to indicate all marketplaces where the seller has done business. The &lt;i&gt;cycle&lt;/i&gt; value specifies whether the standards compliance values were determined at the last official eBay evaluation (&lt;code&gt;CURRENT&lt;/code&gt;) or at the time of the request (&lt;code&gt;PROJECTED&lt;/code&gt;). Both cycle and a program values are required URI parameters for this method.&lt;br&gt;&lt;br&gt;For more information on the interpreting the response payload of this method, see &lt;a href=&quot;/api-docs/sell/static/performance/seller-standards.html&quot; target=&quot;_blank&quot;&gt;Seller standards profile&lt;/a&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithCycleItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCycleItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithCycleItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
