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

package com.ebay.analyticsandreporting.generated.analytics.seller_standards_profile;

import com.ebay.analyticsandreporting.generated.analytics.models.FindSellerStandardsProfilesResponse;
import com.ebay.analyticsandreporting.generated.analytics.seller_standards_profile.item.WithProgramItemRequestBuilder;
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
 * Builds and executes requests for operations under /seller_standards_profile
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SellerStandardsProfileRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.analyticsandreporting.generated.analytics.seller_standards_profile.item collection
     * @param program This path parameter is used to specify the seller standards program for which metrics and metadata will be retrieved. &lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/analytics/types/ssp:ProgramEnum&quot; target=&quot;_blank&quot;&gt;ProgramEnum&lt;/a&gt; for a list of supported values.
     * @return a {@link WithProgramItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithProgramItemRequestBuilder byProgram(@jakarta.annotation.Nonnull final String program) {
        Objects.requireNonNull(program);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("program", program);
        return new WithProgramItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link SellerStandardsProfileRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SellerStandardsProfileRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/seller_standards_profile", pathParameters);
    }
    /**
     * Instantiates a new {@link SellerStandardsProfileRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SellerStandardsProfileRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/seller_standards_profile", rawUrl);
    }
    /**
     * This call retrieves all the standards profiles for the associated seller.  &lt;br&gt;&lt;br&gt;A &lt;i&gt;standards profile &lt;/i&gt; is a set of eBay seller metrics and the seller&apos;s associated compliance values (either &lt;code&gt;TOP_RATED&lt;/code&gt;, &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, or &lt;code&gt;BELOW_STANDARD&lt;/code&gt;).  &lt;br&gt;&lt;br&gt;A seller&apos;s multiple profiles are distinguished by two criteria, a &quot;program&quot; and a &quot;cycle.&quot; A profile&apos;s &lt;i&gt;program &lt;/i&gt; is one of three regions where the seller may have done business, or &lt;code&gt;PROGRAM_GLOBAL&lt;/code&gt; to indicate all marketplaces where the seller has done business. The &lt;i&gt;cycle&lt;/i&gt; value specifies whether the standards compliance values were determined at the last official eBay evaluation or at the time of the request.
     * @return a {@link FindSellerStandardsProfilesResponse}
     */
    @jakarta.annotation.Nullable
    public FindSellerStandardsProfilesResponse get() {
        return get(null);
    }
    /**
     * This call retrieves all the standards profiles for the associated seller.  &lt;br&gt;&lt;br&gt;A &lt;i&gt;standards profile &lt;/i&gt; is a set of eBay seller metrics and the seller&apos;s associated compliance values (either &lt;code&gt;TOP_RATED&lt;/code&gt;, &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, or &lt;code&gt;BELOW_STANDARD&lt;/code&gt;).  &lt;br&gt;&lt;br&gt;A seller&apos;s multiple profiles are distinguished by two criteria, a &quot;program&quot; and a &quot;cycle.&quot; A profile&apos;s &lt;i&gt;program &lt;/i&gt; is one of three regions where the seller may have done business, or &lt;code&gt;PROGRAM_GLOBAL&lt;/code&gt; to indicate all marketplaces where the seller has done business. The &lt;i&gt;cycle&lt;/i&gt; value specifies whether the standards compliance values were determined at the last official eBay evaluation or at the time of the request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link FindSellerStandardsProfilesResponse}
     */
    @jakarta.annotation.Nullable
    public FindSellerStandardsProfilesResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, FindSellerStandardsProfilesResponse::createFromDiscriminatorValue);
    }
    /**
     * This call retrieves all the standards profiles for the associated seller.  &lt;br&gt;&lt;br&gt;A &lt;i&gt;standards profile &lt;/i&gt; is a set of eBay seller metrics and the seller&apos;s associated compliance values (either &lt;code&gt;TOP_RATED&lt;/code&gt;, &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, or &lt;code&gt;BELOW_STANDARD&lt;/code&gt;).  &lt;br&gt;&lt;br&gt;A seller&apos;s multiple profiles are distinguished by two criteria, a &quot;program&quot; and a &quot;cycle.&quot; A profile&apos;s &lt;i&gt;program &lt;/i&gt; is one of three regions where the seller may have done business, or &lt;code&gt;PROGRAM_GLOBAL&lt;/code&gt; to indicate all marketplaces where the seller has done business. The &lt;i&gt;cycle&lt;/i&gt; value specifies whether the standards compliance values were determined at the last official eBay evaluation or at the time of the request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This call retrieves all the standards profiles for the associated seller.  &lt;br&gt;&lt;br&gt;A &lt;i&gt;standards profile &lt;/i&gt; is a set of eBay seller metrics and the seller&apos;s associated compliance values (either &lt;code&gt;TOP_RATED&lt;/code&gt;, &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, or &lt;code&gt;BELOW_STANDARD&lt;/code&gt;).  &lt;br&gt;&lt;br&gt;A seller&apos;s multiple profiles are distinguished by two criteria, a &quot;program&quot; and a &quot;cycle.&quot; A profile&apos;s &lt;i&gt;program &lt;/i&gt; is one of three regions where the seller may have done business, or &lt;code&gt;PROGRAM_GLOBAL&lt;/code&gt; to indicate all marketplaces where the seller has done business. The &lt;i&gt;cycle&lt;/i&gt; value specifies whether the standards compliance values were determined at the last official eBay evaluation or at the time of the request.
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
     * @return a {@link SellerStandardsProfileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SellerStandardsProfileRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SellerStandardsProfileRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
