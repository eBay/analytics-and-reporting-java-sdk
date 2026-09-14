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
 * Indicates the program used to generate the profile data. Values can be &lt;code&gt;PROGRAM_DE&lt;/code&gt;, &lt;code&gt;PROGRAM_UK&lt;/code&gt;, &lt;code&gt;PROGRAM_US&lt;/code&gt;, or &lt;code&gt;PROGRAM_GLOBAL&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProgramEnum implements ValuedEnum {
    PROGRAM_DE("PROGRAM_DE"),
    PROGRAM_UK("PROGRAM_UK"),
    PROGRAM_US("PROGRAM_US"),
    PROGRAM_GLOBAL("PROGRAM_GLOBAL");
    public final String value;
    ProgramEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProgramEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PROGRAM_DE": return PROGRAM_DE;
            case "PROGRAM_UK": return PROGRAM_UK;
            case "PROGRAM_US": return PROGRAM_US;
            case "PROGRAM_GLOBAL": return PROGRAM_GLOBAL;
            default: return null;
        }
    }
}
