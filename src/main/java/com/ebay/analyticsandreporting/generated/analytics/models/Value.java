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
 * A complex type that contains a value, plus the veracity of that value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Value implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If set to &lt;code&gt;true&lt;/code&gt;, this flag indicates the value in the &lt;b&gt;value&lt;/b&gt; field is valid as computed.  &lt;br&gt;&lt;br&gt;A value of &lt;code&gt;false&lt;/code&gt; indicates one or more of the values used to calculate the value was invalid. The occurrence of this is a rare, however consider this case: suppose a buyer navigates to a View Item page at 11:59 pm (the end of the day) and purchases the item at 12:05am the next day. In this case, the item would have been purchased with &lt;code&gt;0&lt;/code&gt; views for the day.
     */
    private Boolean applicable;
    /**
     * The value of the report data.
     */
    private ValueValue value;
    /**
     * Instantiates a new {@link Value} and sets the default values.
     */
    public Value() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Value}
     */
    @jakarta.annotation.Nonnull
    public static Value createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Value();
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
     * Gets the applicable property value. If set to &lt;code&gt;true&lt;/code&gt;, this flag indicates the value in the &lt;b&gt;value&lt;/b&gt; field is valid as computed.  &lt;br&gt;&lt;br&gt;A value of &lt;code&gt;false&lt;/code&gt; indicates one or more of the values used to calculate the value was invalid. The occurrence of this is a rare, however consider this case: suppose a buyer navigates to a View Item page at 11:59 pm (the end of the day) and purchases the item at 12:05am the next day. In this case, the item would have been purchased with &lt;code&gt;0&lt;/code&gt; views for the day.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicable() {
        return this.applicable;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("applicable", (n) -> { this.setApplicable(n.getBooleanValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getObjectValue(ValueValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value of the report data.
     * @return a {@link ValueValue}
     */
    @jakarta.annotation.Nullable
    public ValueValue getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("applicable", this.getApplicable());
        writer.writeObjectValue("value", this.getValue());
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
     * Sets the applicable property value. If set to &lt;code&gt;true&lt;/code&gt;, this flag indicates the value in the &lt;b&gt;value&lt;/b&gt; field is valid as computed.  &lt;br&gt;&lt;br&gt;A value of &lt;code&gt;false&lt;/code&gt; indicates one or more of the values used to calculate the value was invalid. The occurrence of this is a rare, however consider this case: suppose a buyer navigates to a View Item page at 11:59 pm (the end of the day) and purchases the item at 12:05am the next day. In this case, the item would have been purchased with &lt;code&gt;0&lt;/code&gt; views for the day.
     * @param value Value to set for the applicable property.
     */
    public void setApplicable(@jakarta.annotation.Nullable final Boolean value) {
        this.applicable = value;
    }
    /**
     * Sets the value property value. The value of the report data.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final ValueValue value) {
        this.value = value;
    }
}
