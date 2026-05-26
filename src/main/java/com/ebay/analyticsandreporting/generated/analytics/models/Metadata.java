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
 * Type the defines the metadata information of the report. This includes the headers and the individual metadata records.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Metadata implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Type that defines the metadata header fields.
     */
    private MetadataHeader metadataHeader;
    /**
     * A list of the individual report records.
     */
    private java.util.List<MetadataRecord> metadataRecords;
    /**
     * Instantiates a new {@link Metadata} and sets the default values.
     */
    public Metadata() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Metadata}
     */
    @jakarta.annotation.Nonnull
    public static Metadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Metadata();
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
        deserializerMap.put("metadataHeader", (n) -> { this.setMetadataHeader(n.getObjectValue(MetadataHeader::createFromDiscriminatorValue)); });
        deserializerMap.put("metadataRecords", (n) -> { this.setMetadataRecords(n.getCollectionOfObjectValues(MetadataRecord::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the metadataHeader property value. Type that defines the metadata header fields.
     * @return a {@link MetadataHeader}
     */
    @jakarta.annotation.Nullable
    public MetadataHeader getMetadataHeader() {
        return this.metadataHeader;
    }
    /**
     * Gets the metadataRecords property value. A list of the individual report records.
     * @return a {@link java.util.List<MetadataRecord>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MetadataRecord> getMetadataRecords() {
        return this.metadataRecords;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("metadataHeader", this.getMetadataHeader());
        writer.writeCollectionOfObjectValues("metadataRecords", this.getMetadataRecords());
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
     * Sets the metadataHeader property value. Type that defines the metadata header fields.
     * @param value Value to set for the metadataHeader property.
     */
    public void setMetadataHeader(@jakarta.annotation.Nullable final MetadataHeader value) {
        this.metadataHeader = value;
    }
    /**
     * Sets the metadataRecords property value. A list of the individual report records.
     * @param value Value to set for the metadataRecords property.
     */
    public void setMetadataRecords(@jakarta.annotation.Nullable final java.util.List<MetadataRecord> value) {
        this.metadataRecords = value;
    }
}
