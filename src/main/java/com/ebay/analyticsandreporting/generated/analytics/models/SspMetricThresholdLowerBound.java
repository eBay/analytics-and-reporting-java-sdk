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
 * Specifies the lowest number &lt;b&gt;value&lt;/b&gt; can be and still qualify for the currently assigned seller level.  &lt;br&gt;&lt;br&gt;For example, if a seller is assigned the level &lt;code&gt;ABOVE_STANDARD&lt;/code&gt; for the &lt;b&gt;ROCKS_INVENTORY&lt;/b&gt; metric, and &lt;b&gt;thresholdLowerBound&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, having fewer than 10 rocks in inventory would result in the seller dropping a level to &lt;code&gt;BELOW_STANDARD&lt;/code&gt;. See &lt;code&gt;thresholdMetaData&lt;/code&gt; to determine if the lower bound value is inclusive or exclusive.  &lt;br&gt;&lt;br&gt;The lower bound value is optional. For example, if the seller is below standard for this metric, there is no value they can go below for it to further lower their compliance level. Note that each program can have different metric-threshold levels.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Depending on the metric being returned, this field can be returned as an Integer, Boolean, Amount, Fraction, or Double.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SspMetricThresholdLowerBound implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Instantiates a new {@link SspMetricThresholdLowerBound} and sets the default values.
     */
    public SspMetricThresholdLowerBound() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SspMetricThresholdLowerBound}
     */
    @jakarta.annotation.Nonnull
    public static SspMetricThresholdLowerBound createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SspMetricThresholdLowerBound();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(0);
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
}
