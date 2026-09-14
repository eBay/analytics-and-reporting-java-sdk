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
 * Indicates the data type of the returned metric. Possible values are: &lt;code&gt;AMOUNT&lt;/code&gt;, &lt;code&gt;BOOLEAN&lt;/code&gt;, &lt;code&gt;DATE&lt;/code&gt;, &lt;code&gt;FRACTION&lt;/code&gt;, &lt;code&gt;NUMBER&lt;/code&gt;, and &lt;code&gt;STRING&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SspDataTypeEnum implements ValuedEnum {
    AMOUNT("AMOUNT"),
    BOOLEAN("BOOLEAN"),
    DATE("DATE"),
    FRACTION("FRACTION"),
    NUMBER("NUMBER"),
    STRING("STRING");
    public final String value;
    SspDataTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SspDataTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "AMOUNT": return AMOUNT;
            case "BOOLEAN": return BOOLEAN;
            case "DATE": return DATE;
            case "FRACTION": return FRACTION;
            case "NUMBER": return NUMBER;
            case "STRING": return STRING;
            default: return null;
        }
    }
}
