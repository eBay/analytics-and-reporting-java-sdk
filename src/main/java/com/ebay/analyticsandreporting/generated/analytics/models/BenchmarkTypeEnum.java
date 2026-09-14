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
 * This field returns the &quot;basis&quot; by which the benchmark is calculated for the customer service metric type. &lt;br&gt;&lt;br&gt;Currently, the only supported basis is &lt;code&gt;PEER_BENCHMARK&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BenchmarkTypeEnum implements ValuedEnum {
    PEER_BENCHMARK("PEER_BENCHMARK");
    public final String value;
    BenchmarkTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BenchmarkTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PEER_BENCHMARK": return PEER_BENCHMARK;
            default: return null;
        }
    }
}
