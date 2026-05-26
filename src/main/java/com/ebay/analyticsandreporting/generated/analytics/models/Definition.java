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

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A complex type that defines a dimension key and metrics in a traffic report.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Definition implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates the data type of the returned dimension. For example, if the &lt;b&gt;dimension&lt;/b&gt; is &lt;code&gt;day&lt;/code&gt;, the data type is &lt;code&gt;DATE&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/ssp:DataTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String dataType;
    /**
     * The value the &lt;b&gt;dimension&lt;/b&gt; or &lt;b&gt;metric&lt;/b&gt; parameter as submitted in the request.
     */
    private String key;
    /**
     * The localized name of the metric or dimension (translated into the language specified in the &lt;b&gt;Accept-Language&lt;/b&gt; HTTP request header). For example, if &lt;b&gt;Accept-Language&lt;/b&gt; is set to &lt;code&gt;de-DE&lt;/code&gt;, the value &quot;day&quot; in the &lt;b&gt;dimension&lt;/b&gt; container is returned as &quot;tag&quot;, and a metric of TRANSACTION is returned as &quot;Transaktionsanzahl&quot;.
     */
    private String localizedName;
    /**
     * Instantiates a new {@link Definition} and sets the default values.
     */
    public Definition() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Definition}
     */
    @jakarta.annotation.Nonnull
    public static Definition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Definition();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the dataType property value. Indicates the data type of the returned dimension. For example, if the &lt;b&gt;dimension&lt;/b&gt; is &lt;code&gt;day&lt;/code&gt;, the data type is &lt;code&gt;DATE&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/ssp:DataTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataType() {
        return this.dataType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("dataType", (n) -> { this.setDataType(n.getStringValue()); });
        deserializerMap.put("key", (n) -> { this.setKey(n.getStringValue()); });
        deserializerMap.put("localizedName", (n) -> { this.setLocalizedName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the key property value. The value the &lt;b&gt;dimension&lt;/b&gt; or &lt;b&gt;metric&lt;/b&gt; parameter as submitted in the request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKey() {
        return this.key;
    }
    /**
     * Gets the localizedName property value. The localized name of the metric or dimension (translated into the language specified in the &lt;b&gt;Accept-Language&lt;/b&gt; HTTP request header). For example, if &lt;b&gt;Accept-Language&lt;/b&gt; is set to &lt;code&gt;de-DE&lt;/code&gt;, the value &quot;day&quot; in the &lt;b&gt;dimension&lt;/b&gt; container is returned as &quot;tag&quot;, and a metric of TRANSACTION is returned as &quot;Transaktionsanzahl&quot;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocalizedName() {
        return this.localizedName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dataType", this.getDataType());
        writer.writeStringValue("key", this.getKey());
        writer.writeStringValue("localizedName", this.getLocalizedName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the dataType property value. Indicates the data type of the returned dimension. For example, if the &lt;b&gt;dimension&lt;/b&gt; is &lt;code&gt;day&lt;/code&gt;, the data type is &lt;code&gt;DATE&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/ssp:DataTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the dataType property.
     */
    public void setDataType(@jakarta.annotation.Nullable final String value) {
        this.dataType = value;
    }
    /**
     * Sets the key property value. The value the &lt;b&gt;dimension&lt;/b&gt; or &lt;b&gt;metric&lt;/b&gt; parameter as submitted in the request.
     * @param value Value to set for the key property.
     */
    public void setKey(@jakarta.annotation.Nullable final String value) {
        this.key = value;
    }
    /**
     * Sets the localizedName property value. The localized name of the metric or dimension (translated into the language specified in the &lt;b&gt;Accept-Language&lt;/b&gt; HTTP request header). For example, if &lt;b&gt;Accept-Language&lt;/b&gt; is set to &lt;code&gt;de-DE&lt;/code&gt;, the value &quot;day&quot; in the &lt;b&gt;dimension&lt;/b&gt; container is returned as &quot;tag&quot;, and a metric of TRANSACTION is returned as &quot;Transaktionsanzahl&quot;.
     * @param value Value to set for the localizedName property.
     */
    public void setLocalizedName(@jakarta.annotation.Nullable final String value) {
        this.localizedName = value;
    }
}
