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
 * Type that defines the fields of the individual record of the report.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Record implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list where each element contains either the string &lt;code&gt;DAY&lt;/code&gt; (if the &lt;b&gt;dimension&lt;/b&gt; is &lt;code&gt;DAY&lt;/code&gt;), or the listing ID for which the record&apos;s metric data is computed. A second array member, &lt;b&gt;applicable&lt;/b&gt;, is always &lt;code&gt;true&lt;/code&gt; for dimension values.
     */
    private java.util.List<Value> dimensionValues;
    /**
     * A list where each element contains a &lt;b&gt;value&lt;/b&gt; field that indicates the record&apos;s value for the metric. Each element also contains an &lt;b&gt;applicable&lt;/b&gt; field that indicates the veracity of the computed &lt;b&gt;value&lt;/b&gt;.   &lt;br&gt;&lt;br&gt;Note that there are no metric names or IDs associated with the values returned in this array. The metadata to which these values relate can be found in the key values in &lt;b&gt;metadataKeys&lt;/b&gt;. The order of the metric values in this array equals the order of the key values in &lt;b&gt;metadataHeader&lt;/b&gt;.
     */
    private java.util.List<Value> metricValues;
    /**
     * Instantiates a new {@link Record} and sets the default values.
     */
    public Record() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Record}
     */
    @jakarta.annotation.Nonnull
    public static Record createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Record();
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
     * Gets the dimensionValues property value. A list where each element contains either the string &lt;code&gt;DAY&lt;/code&gt; (if the &lt;b&gt;dimension&lt;/b&gt; is &lt;code&gt;DAY&lt;/code&gt;), or the listing ID for which the record&apos;s metric data is computed. A second array member, &lt;b&gt;applicable&lt;/b&gt;, is always &lt;code&gt;true&lt;/code&gt; for dimension values.
     * @return a {@link java.util.List<Value>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Value> getDimensionValues() {
        return this.dimensionValues;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("dimensionValues", (n) -> { this.setDimensionValues(n.getCollectionOfObjectValues(Value::createFromDiscriminatorValue)); });
        deserializerMap.put("metricValues", (n) -> { this.setMetricValues(n.getCollectionOfObjectValues(Value::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the metricValues property value. A list where each element contains a &lt;b&gt;value&lt;/b&gt; field that indicates the record&apos;s value for the metric. Each element also contains an &lt;b&gt;applicable&lt;/b&gt; field that indicates the veracity of the computed &lt;b&gt;value&lt;/b&gt;.   &lt;br&gt;&lt;br&gt;Note that there are no metric names or IDs associated with the values returned in this array. The metadata to which these values relate can be found in the key values in &lt;b&gt;metadataKeys&lt;/b&gt;. The order of the metric values in this array equals the order of the key values in &lt;b&gt;metadataHeader&lt;/b&gt;.
     * @return a {@link java.util.List<Value>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Value> getMetricValues() {
        return this.metricValues;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("dimensionValues", this.getDimensionValues());
        writer.writeCollectionOfObjectValues("metricValues", this.getMetricValues());
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
     * Sets the dimensionValues property value. A list where each element contains either the string &lt;code&gt;DAY&lt;/code&gt; (if the &lt;b&gt;dimension&lt;/b&gt; is &lt;code&gt;DAY&lt;/code&gt;), or the listing ID for which the record&apos;s metric data is computed. A second array member, &lt;b&gt;applicable&lt;/b&gt;, is always &lt;code&gt;true&lt;/code&gt; for dimension values.
     * @param value Value to set for the dimensionValues property.
     */
    public void setDimensionValues(@jakarta.annotation.Nullable final java.util.List<Value> value) {
        this.dimensionValues = value;
    }
    /**
     * Sets the metricValues property value. A list where each element contains a &lt;b&gt;value&lt;/b&gt; field that indicates the record&apos;s value for the metric. Each element also contains an &lt;b&gt;applicable&lt;/b&gt; field that indicates the veracity of the computed &lt;b&gt;value&lt;/b&gt;.   &lt;br&gt;&lt;br&gt;Note that there are no metric names or IDs associated with the values returned in this array. The metadata to which these values relate can be found in the key values in &lt;b&gt;metadataKeys&lt;/b&gt;. The order of the metric values in this array equals the order of the key values in &lt;b&gt;metadataHeader&lt;/b&gt;.
     * @param value Value to set for the metricValues property.
     */
    public void setMetricValues(@jakarta.annotation.Nullable final java.util.List<Value> value) {
        this.metricValues = value;
    }
}
