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
 * This field specifies the transaction &lt;i&gt;lookback period&lt;/i&gt; used for the evaluation. &lt;br&gt;&lt;br&gt;The &lt;b&gt;evaluation_type&lt;/b&gt; value specified in the request is returned in this field. There are two possible values:  &lt;ul&gt;&lt;li&gt;&lt;code&gt;CURRENT&lt;/code&gt; &amp;ndash; A monthly evaluation that occurs on the 20th of every month.&lt;/li&gt; &lt;li&gt;&lt;code&gt;PROJECTED&lt;/code&gt; &amp;ndash; A daily evaluation that provides a projection of how the seller is currently performing with regards to the upcoming evaluation period.&lt;/li&gt;&lt;/ul&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EvaluationTypeEnum implements ValuedEnum {
    CURRENT("CURRENT"),
    PROJECTED("PROJECTED");
    public final String value;
    EvaluationTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EvaluationTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CURRENT": return CURRENT;
            case "PROJECTED": return PROJECTED;
            default: return null;
        }
    }
}
