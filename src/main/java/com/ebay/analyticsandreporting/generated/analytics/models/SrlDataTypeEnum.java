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
 * Indicates the data type of the returned dimension. For example, if the &lt;b&gt;dimension&lt;/b&gt; is &lt;code&gt;day&lt;/code&gt;, the data type is &lt;code&gt;DATE&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SrlDataTypeEnum implements ValuedEnum {
    NUMBER("NUMBER"),
    STRING("STRING"),
    DATE("DATE");
    public final String value;
    SrlDataTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SrlDataTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NUMBER": return NUMBER;
            case "STRING": return STRING;
            case "DATE": return DATE;
            default: return null;
        }
    }
}
