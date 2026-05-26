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
 * This complex type defines the benchmark data, which includes the &lt;b&gt;average&lt;/b&gt; value of the metric for the group (the benchmark) and the seller&apos;s overall &lt;b&gt;rating&lt;/b&gt; when compared to the benchmark.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MetricBenchmark implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If this field is present, it indicates that the rating given to the seller was &quot;adjusted&quot; for one reason or another.  &lt;br&gt;&lt;br&gt;If eBay determines that the normal rating of a seller is impacted by circumstances beyond their control, they can issue an override to adjust the rating given to the seller. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/api:RatingAdjustmentTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String adjustment;
    /**
     * This field returns the &quot;basis&quot; by which the benchmark is calculated for the customer service metric type. &lt;br&gt;&lt;br&gt;Currently, the only supported basis is &lt;code&gt;PEER_BENCHMARK&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/api:BenchmarkTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String basis;
    /**
     * This complex type defines the fields that comprise the benchmark against which the seller&apos;s performance is compared. The comparison determines the seller&apos;s rating for the metric.
     */
    private BenchmarkMetadata metadata;
    /**
     * This field returns seller&apos;s rating for the customer service metric.  &lt;br&gt;&lt;br&gt;The rating is set to a value that equals the relative deviation between the seller&apos;s metric value and the benchmark value for the customer service metric.  &lt;br&gt;&lt;br&gt;Deviation values range from &lt;code&gt;LOW&lt;/code&gt; to &lt;code&gt;VERY HIGH&lt;/code&gt;, and the lower the deviation, the better the seller rating. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/api:RatingTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String rating;
    /**
     * Instantiates a new {@link MetricBenchmark} and sets the default values.
     */
    public MetricBenchmark() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MetricBenchmark}
     */
    @jakarta.annotation.Nonnull
    public static MetricBenchmark createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MetricBenchmark();
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
     * Gets the adjustment property value. If this field is present, it indicates that the rating given to the seller was &quot;adjusted&quot; for one reason or another.  &lt;br&gt;&lt;br&gt;If eBay determines that the normal rating of a seller is impacted by circumstances beyond their control, they can issue an override to adjust the rating given to the seller. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/api:RatingAdjustmentTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdjustment() {
        return this.adjustment;
    }
    /**
     * Gets the basis property value. This field returns the &quot;basis&quot; by which the benchmark is calculated for the customer service metric type. &lt;br&gt;&lt;br&gt;Currently, the only supported basis is &lt;code&gt;PEER_BENCHMARK&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/api:BenchmarkTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBasis() {
        return this.basis;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("adjustment", (n) -> { this.setAdjustment(n.getStringValue()); });
        deserializerMap.put("basis", (n) -> { this.setBasis(n.getStringValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(BenchmarkMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("rating", (n) -> { this.setRating(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the metadata property value. This complex type defines the fields that comprise the benchmark against which the seller&apos;s performance is compared. The comparison determines the seller&apos;s rating for the metric.
     * @return a {@link BenchmarkMetadata}
     */
    @jakarta.annotation.Nullable
    public BenchmarkMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the rating property value. This field returns seller&apos;s rating for the customer service metric.  &lt;br&gt;&lt;br&gt;The rating is set to a value that equals the relative deviation between the seller&apos;s metric value and the benchmark value for the customer service metric.  &lt;br&gt;&lt;br&gt;Deviation values range from &lt;code&gt;LOW&lt;/code&gt; to &lt;code&gt;VERY HIGH&lt;/code&gt;, and the lower the deviation, the better the seller rating. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/api:RatingTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRating() {
        return this.rating;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("adjustment", this.getAdjustment());
        writer.writeStringValue("basis", this.getBasis());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeStringValue("rating", this.getRating());
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
     * Sets the adjustment property value. If this field is present, it indicates that the rating given to the seller was &quot;adjusted&quot; for one reason or another.  &lt;br&gt;&lt;br&gt;If eBay determines that the normal rating of a seller is impacted by circumstances beyond their control, they can issue an override to adjust the rating given to the seller. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/api:RatingAdjustmentTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the adjustment property.
     */
    public void setAdjustment(@jakarta.annotation.Nullable final String value) {
        this.adjustment = value;
    }
    /**
     * Sets the basis property value. This field returns the &quot;basis&quot; by which the benchmark is calculated for the customer service metric type. &lt;br&gt;&lt;br&gt;Currently, the only supported basis is &lt;code&gt;PEER_BENCHMARK&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/api:BenchmarkTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the basis property.
     */
    public void setBasis(@jakarta.annotation.Nullable final String value) {
        this.basis = value;
    }
    /**
     * Sets the metadata property value. This complex type defines the fields that comprise the benchmark against which the seller&apos;s performance is compared. The comparison determines the seller&apos;s rating for the metric.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final BenchmarkMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the rating property value. This field returns seller&apos;s rating for the customer service metric.  &lt;br&gt;&lt;br&gt;The rating is set to a value that equals the relative deviation between the seller&apos;s metric value and the benchmark value for the customer service metric.  &lt;br&gt;&lt;br&gt;Deviation values range from &lt;code&gt;LOW&lt;/code&gt; to &lt;code&gt;VERY HIGH&lt;/code&gt;, and the lower the deviation, the better the seller rating. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/api:RatingTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the rating property.
     */
    public void setRating(@jakarta.annotation.Nullable final String value) {
        this.rating = value;
    }
}
