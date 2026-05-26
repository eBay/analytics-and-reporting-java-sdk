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
 * This complex type defines a the customer service metrics and seller benchmark performance related to a given dimension.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DimensionMetric implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The fields in this complex type define the dimension, or attributes, by which the associated customer service metric and benchmark data is measured.  &lt;br&gt;&lt;br&gt;The value of &lt;b&gt;dimensionKey&lt;/b&gt; gets set according to the configuration of the input request. The &lt;b&gt;name&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; pair further define dimension under the key.
     */
    private Dimension dimension;
    /**
     * This is a list of &lt;b&gt;Metric&lt;/b&gt; elements where each element contains data and information related to the transactions grouped by the associated &lt;b&gt;dimension&lt;/b&gt;.
     */
    private java.util.List<Metric> metrics;
    /**
     * Instantiates a new {@link DimensionMetric} and sets the default values.
     */
    public DimensionMetric() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DimensionMetric}
     */
    @jakarta.annotation.Nonnull
    public static DimensionMetric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DimensionMetric();
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
     * Gets the dimension property value. The fields in this complex type define the dimension, or attributes, by which the associated customer service metric and benchmark data is measured.  &lt;br&gt;&lt;br&gt;The value of &lt;b&gt;dimensionKey&lt;/b&gt; gets set according to the configuration of the input request. The &lt;b&gt;name&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; pair further define dimension under the key.
     * @return a {@link Dimension}
     */
    @jakarta.annotation.Nullable
    public Dimension getDimension() {
        return this.dimension;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("dimension", (n) -> { this.setDimension(n.getObjectValue(Dimension::createFromDiscriminatorValue)); });
        deserializerMap.put("metrics", (n) -> { this.setMetrics(n.getCollectionOfObjectValues(Metric::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the metrics property value. This is a list of &lt;b&gt;Metric&lt;/b&gt; elements where each element contains data and information related to the transactions grouped by the associated &lt;b&gt;dimension&lt;/b&gt;.
     * @return a {@link java.util.List<Metric>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Metric> getMetrics() {
        return this.metrics;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("dimension", this.getDimension());
        writer.writeCollectionOfObjectValues("metrics", this.getMetrics());
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
     * Sets the dimension property value. The fields in this complex type define the dimension, or attributes, by which the associated customer service metric and benchmark data is measured.  &lt;br&gt;&lt;br&gt;The value of &lt;b&gt;dimensionKey&lt;/b&gt; gets set according to the configuration of the input request. The &lt;b&gt;name&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; pair further define dimension under the key.
     * @param value Value to set for the dimension property.
     */
    public void setDimension(@jakarta.annotation.Nullable final Dimension value) {
        this.dimension = value;
    }
    /**
     * Sets the metrics property value. This is a list of &lt;b&gt;Metric&lt;/b&gt; elements where each element contains data and information related to the transactions grouped by the associated &lt;b&gt;dimension&lt;/b&gt;.
     * @param value Value to set for the metrics property.
     */
    public void setMetrics(@jakarta.annotation.Nullable final java.util.List<Metric> value) {
        this.metrics = value;
    }
}
