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
 * A complex type that defines the data records returned in the report.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MetadataRecord implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of data in a row returned in the traffic report. The data in each of the cells match the labels in headers of the report.
     */
    private java.util.List<Value> metadataValues;
    /**
     * A complex type that contains a value, plus the veracity of that value.
     */
    private Value value;
    /**
     * Instantiates a new {@link MetadataRecord} and sets the default values.
     */
    public MetadataRecord() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MetadataRecord}
     */
    @jakarta.annotation.Nonnull
    public static MetadataRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MetadataRecord();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("metadataValues", (n) -> { this.setMetadataValues(n.getCollectionOfObjectValues(Value::createFromDiscriminatorValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getObjectValue(Value::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the metadataValues property value. A list of data in a row returned in the traffic report. The data in each of the cells match the labels in headers of the report.
     * @return a {@link java.util.List<Value>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Value> getMetadataValues() {
        return this.metadataValues;
    }
    /**
     * Gets the value property value. A complex type that contains a value, plus the veracity of that value.
     * @return a {@link Value}
     */
    @jakarta.annotation.Nullable
    public Value getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("metadataValues", this.getMetadataValues());
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
     * Sets the metadataValues property value. A list of data in a row returned in the traffic report. The data in each of the cells match the labels in headers of the report.
     * @param value Value to set for the metadataValues property.
     */
    public void setMetadataValues(@jakarta.annotation.Nullable final java.util.List<Value> value) {
        this.metadataValues = value;
    }
    /**
     * Sets the value property value. A complex type that contains a value, plus the veracity of that value.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Value value) {
        this.value = value;
    }
}
