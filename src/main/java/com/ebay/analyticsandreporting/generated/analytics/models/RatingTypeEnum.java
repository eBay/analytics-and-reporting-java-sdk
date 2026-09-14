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
 * This field returns seller&apos;s rating for the customer service metric.  &lt;br&gt;&lt;br&gt;The rating is set to a value that equals the relative deviation between the seller&apos;s metric value and the benchmark value for the customer service metric.  &lt;br&gt;&lt;br&gt;Deviation values range from &lt;code&gt;LOW&lt;/code&gt; to &lt;code&gt;VERY HIGH&lt;/code&gt;, and the lower the deviation, the better the seller rating.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RatingTypeEnum implements ValuedEnum {
    LOW("LOW"),
    AVERAGE("AVERAGE"),
    HIGH("HIGH"),
    VERY_HIGH("VERY_HIGH"),
    NOT_APPLICABLE("NOT_APPLICABLE");
    public final String value;
    RatingTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RatingTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "LOW": return LOW;
            case "AVERAGE": return AVERAGE;
            case "HIGH": return HIGH;
            case "VERY_HIGH": return VERY_HIGH;
            case "NOT_APPLICABLE": return NOT_APPLICABLE;
            default: return null;
        }
    }
}
