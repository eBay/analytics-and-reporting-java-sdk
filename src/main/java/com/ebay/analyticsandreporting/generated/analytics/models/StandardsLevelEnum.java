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
 * The seller level for this metric, which indicates how well the seller is doing in meeting eBay&apos;s standards for this metric. Possible values are &lt;code&gt;TOP_RATED&lt;/code&gt;, &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, and &lt;code&gt;BELOW_STANDARD&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum StandardsLevelEnum implements ValuedEnum {
    TOP_RATED("TOP_RATED"),
    ABOVE_STANDARD("ABOVE_STANDARD"),
    BELOW_STANDARD("BELOW_STANDARD");
    public final String value;
    StandardsLevelEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static StandardsLevelEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "TOP_RATED": return TOP_RATED;
            case "ABOVE_STANDARD": return ABOVE_STANDARD;
            case "BELOW_STANDARD": return BELOW_STANDARD;
            default: return null;
        }
    }
}
