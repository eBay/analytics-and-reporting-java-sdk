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
 * This type defines the metadata header fields.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MetadataHeader implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The key value used for the report. &lt;br&gt;&lt;br&gt;For example: &lt;code&gt;&quot;key&quot;: &quot;LISTING_ID&quot;&lt;/code&gt;
     */
    private String key;
    /**
     * The list of dimension key values used for the report header. Each list element contains the key name, its data type, and its localized name.  &lt;br&gt;&lt;br&gt;For example: &lt;p&gt;&lt;code&gt;&quot;metadataKeys&quot;: [&lt;br&gt;&amp;nbsp;&amp;nbsp;&quot;key&quot;: &quot;LISTING_TITLE&quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&quot;localizedName&quot;: &quot;Listing title&quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&quot;dataType&quot;: &quot;STRING&quot;&lt;/code&gt;&lt;/p&gt;
     */
    private java.util.List<Definition> metadataKeys;
    /**
     * Instantiates a new {@link MetadataHeader} and sets the default values.
     */
    public MetadataHeader() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MetadataHeader}
     */
    @jakarta.annotation.Nonnull
    public static MetadataHeader createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MetadataHeader();
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
        deserializerMap.put("key", (n) -> { this.setKey(n.getStringValue()); });
        deserializerMap.put("metadataKeys", (n) -> { this.setMetadataKeys(n.getCollectionOfObjectValues(Definition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the key property value. The key value used for the report. &lt;br&gt;&lt;br&gt;For example: &lt;code&gt;&quot;key&quot;: &quot;LISTING_ID&quot;&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKey() {
        return this.key;
    }
    /**
     * Gets the metadataKeys property value. The list of dimension key values used for the report header. Each list element contains the key name, its data type, and its localized name.  &lt;br&gt;&lt;br&gt;For example: &lt;p&gt;&lt;code&gt;&quot;metadataKeys&quot;: [&lt;br&gt;&amp;nbsp;&amp;nbsp;&quot;key&quot;: &quot;LISTING_TITLE&quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&quot;localizedName&quot;: &quot;Listing title&quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&quot;dataType&quot;: &quot;STRING&quot;&lt;/code&gt;&lt;/p&gt;
     * @return a {@link java.util.List<Definition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Definition> getMetadataKeys() {
        return this.metadataKeys;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("key", this.getKey());
        writer.writeCollectionOfObjectValues("metadataKeys", this.getMetadataKeys());
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
     * Sets the key property value. The key value used for the report. &lt;br&gt;&lt;br&gt;For example: &lt;code&gt;&quot;key&quot;: &quot;LISTING_ID&quot;&lt;/code&gt;
     * @param value Value to set for the key property.
     */
    public void setKey(@jakarta.annotation.Nullable final String value) {
        this.key = value;
    }
    /**
     * Sets the metadataKeys property value. The list of dimension key values used for the report header. Each list element contains the key name, its data type, and its localized name.  &lt;br&gt;&lt;br&gt;For example: &lt;p&gt;&lt;code&gt;&quot;metadataKeys&quot;: [&lt;br&gt;&amp;nbsp;&amp;nbsp;&quot;key&quot;: &quot;LISTING_TITLE&quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&quot;localizedName&quot;: &quot;Listing title&quot;,&lt;br&gt;&amp;nbsp;&amp;nbsp;&quot;dataType&quot;: &quot;STRING&quot;&lt;/code&gt;&lt;/p&gt;
     * @param value Value to set for the metadataKeys property.
     */
    public void setMetadataKeys(@jakarta.annotation.Nullable final java.util.List<Definition> value) {
        this.metadataKeys = value;
    }
}
