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
 * If this field is present, it indicates that the rating given to the seller was &quot;adjusted&quot; for one reason or another.  &lt;br&gt;&lt;br&gt;If eBay determines that the normal rating of a seller is impacted by circumstances beyond their control, they can issue an override to adjust the rating given to the seller.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RatingAdjustmentTypeEnum implements ValuedEnum {
    OVERRIDE("OVERRIDE");
    public final String value;
    RatingAdjustmentTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RatingAdjustmentTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "OVERRIDE": return OVERRIDE;
            default: return null;
        }
    }
}
