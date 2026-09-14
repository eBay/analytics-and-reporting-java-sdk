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
 * The cycle type, either &lt;code&gt;CURRENT&lt;/code&gt; or &lt;code&gt;PROJECTED&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;code&gt;CURRENT&lt;/code&gt; means the profile&apos;s metrics values are from the most recent official eBay  monthly standards evaluation. &lt;code&gt;PROJECTED&lt;/code&gt; means the profile values were determined when the profile was requested.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CycleTypeEnum implements ValuedEnum {
    CURRENT("CURRENT"),
    PROJECTED("PROJECTED");
    public final String value;
    CycleTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CycleTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CURRENT": return CURRENT;
            case "PROJECTED": return PROJECTED;
            default: return null;
        }
    }
}
