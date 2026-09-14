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

package com.ebay.analyticsandreporting.generated.analytics.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This enum defines the basis against which the seller&apos;s customer service metric is measured.  &lt;br&gt;&lt;br&gt;The value of this field gets set according to the value of the &lt;b&gt;customer_service_metric_type&lt;/b&gt; input parameter. The following input configurations return the responses shown: &lt;ul&gt;&lt;li&gt;&lt;code&gt;ITEM_NOT_AS_DESCRIBED&lt;/code&gt; &amp;ndash; Returns benchmark ratings based on L1 listing categories, so the result shows metrics where the &lt;b&gt;dimensionKey&lt;/b&gt; is set to &lt;code&gt;LISTING_CATEGORY&lt;/code&gt;.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;ITEM_NOT_RECEIVED&lt;/code&gt; &amp;ndash; Returns benchmark ratings based on world shipping regions, so the result shows metrics where the &lt;b&gt;dimensionKey&lt;/b&gt; is set to &lt;code&gt;SHIPPING_REGION&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;The shipping region is indicated by the associated &lt;b&gt;value&lt;/b&gt; field. For specifics on world shipping regions, see the FAQ section on the following page: &lt;a href=&quot;https://www.ebay.com/help/selling/selling/monitor-service-metrics?id=4785&quot; title=&quot;eBay Help page&quot; target=&quot;_blank&quot;&gt;Monitor your service metrics&lt;/a&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DimensionTypeEnum implements ValuedEnum {
    LISTING_CATEGORY("LISTING_CATEGORY"),
    SHIPPING_REGION("SHIPPING_REGION");
    public final String value;
    DimensionTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DimensionTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "LISTING_CATEGORY": return LISTING_CATEGORY;
            case "SHIPPING_REGION": return SHIPPING_REGION;
            default: return null;
        }
    }
}
