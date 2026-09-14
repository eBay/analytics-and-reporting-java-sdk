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
 * The eBay marketplace ID of the marketplace upon which the customer service metric evaluation is based.  &lt;br&gt;&lt;br&gt;The &lt;b&gt;customer_service_metric&lt;/b&gt; resource supports a limited set of marketplaces. For a complete list of the supported marketplaces, please see the &lt;a href=&quot;https://www.ebay.com/help/policies/selling-policies/seller-performance-policy/service-metrics-policy?id=4769#section2&quot; title=&quot;eBay Help pages&quot; target=&quot;_blank&quot;&gt;Service metrics policy&lt;/a&gt; page.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MarketplaceIdEnum implements ValuedEnum {
    EBAY_AT("EBAY_AT"),
    EBAY_AU("EBAY_AU"),
    EBAY_BE("EBAY_BE"),
    EBAY_CA("EBAY_CA"),
    EBAY_CH("EBAY_CH"),
    EBAY_CN("EBAY_CN"),
    EBAY_CZ("EBAY_CZ"),
    EBAY_DE("EBAY_DE"),
    EBAY_DK("EBAY_DK"),
    EBAY_ES("EBAY_ES"),
    EBAY_FI("EBAY_FI"),
    EBAY_FR("EBAY_FR"),
    EBAY_GB("EBAY_GB"),
    EBAY_GR("EBAY_GR"),
    EBAY_HK("EBAY_HK"),
    EBAY_HU("EBAY_HU"),
    EBAY_ID("EBAY_ID"),
    EBAY_IE("EBAY_IE"),
    EBAY_IL("EBAY_IL"),
    EBAY_IN("EBAY_IN"),
    EBAY_IT("EBAY_IT"),
    EBAY_JP("EBAY_JP"),
    EBAY_MY("EBAY_MY"),
    EBAY_NL("EBAY_NL"),
    EBAY_NO("EBAY_NO"),
    EBAY_NZ("EBAY_NZ"),
    EBAY_PE("EBAY_PE"),
    EBAY_PH("EBAY_PH"),
    EBAY_PL("EBAY_PL"),
    EBAY_PR("EBAY_PR"),
    EBAY_PT("EBAY_PT"),
    EBAY_RU("EBAY_RU"),
    EBAY_SE("EBAY_SE"),
    EBAY_SG("EBAY_SG"),
    EBAY_TH("EBAY_TH"),
    EBAY_TW("EBAY_TW"),
    EBAY_US("EBAY_US"),
    EBAY_VN("EBAY_VN"),
    EBAY_ZA("EBAY_ZA"),
    EBAY_HALF_US("EBAY_HALF_US"),
    EBAY_MOTORS_US("EBAY_MOTORS_US");
    public final String value;
    MarketplaceIdEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MarketplaceIdEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "EBAY_AT": return EBAY_AT;
            case "EBAY_AU": return EBAY_AU;
            case "EBAY_BE": return EBAY_BE;
            case "EBAY_CA": return EBAY_CA;
            case "EBAY_CH": return EBAY_CH;
            case "EBAY_CN": return EBAY_CN;
            case "EBAY_CZ": return EBAY_CZ;
            case "EBAY_DE": return EBAY_DE;
            case "EBAY_DK": return EBAY_DK;
            case "EBAY_ES": return EBAY_ES;
            case "EBAY_FI": return EBAY_FI;
            case "EBAY_FR": return EBAY_FR;
            case "EBAY_GB": return EBAY_GB;
            case "EBAY_GR": return EBAY_GR;
            case "EBAY_HK": return EBAY_HK;
            case "EBAY_HU": return EBAY_HU;
            case "EBAY_ID": return EBAY_ID;
            case "EBAY_IE": return EBAY_IE;
            case "EBAY_IL": return EBAY_IL;
            case "EBAY_IN": return EBAY_IN;
            case "EBAY_IT": return EBAY_IT;
            case "EBAY_JP": return EBAY_JP;
            case "EBAY_MY": return EBAY_MY;
            case "EBAY_NL": return EBAY_NL;
            case "EBAY_NO": return EBAY_NO;
            case "EBAY_NZ": return EBAY_NZ;
            case "EBAY_PE": return EBAY_PE;
            case "EBAY_PH": return EBAY_PH;
            case "EBAY_PL": return EBAY_PL;
            case "EBAY_PR": return EBAY_PR;
            case "EBAY_PT": return EBAY_PT;
            case "EBAY_RU": return EBAY_RU;
            case "EBAY_SE": return EBAY_SE;
            case "EBAY_SG": return EBAY_SG;
            case "EBAY_TH": return EBAY_TH;
            case "EBAY_TW": return EBAY_TW;
            case "EBAY_US": return EBAY_US;
            case "EBAY_VN": return EBAY_VN;
            case "EBAY_ZA": return EBAY_ZA;
            case "EBAY_HALF_US": return EBAY_HALF_US;
            case "EBAY_MOTORS_US": return EBAY_MOTORS_US;
            default: return null;
        }
    }
}
