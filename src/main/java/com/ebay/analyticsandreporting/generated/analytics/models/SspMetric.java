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
 * A complex type that defines a single metric which is evaluated as a part of a seller&apos;s standards profile.  &lt;br&gt;&lt;br&gt;For the specified metric, the &lt;code&gt;metricKey&lt;/code&gt; value is its name and the &lt;code&gt;level&lt;/code&gt; specifies how the seller is doing meeting eBay&apos;s standards for that metric (either &lt;code&gt;TOP_RATED&lt;/code&gt;, &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, or &lt;code&gt;BELOW_STANDARD&lt;/code&gt;). The metric&apos;s &lt;code&gt;value&lt;/code&gt; is the absolute number of the metric&apos;s value for the associated seller. 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SspMetric implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The seller level for this metric, which indicates how well the seller is doing in meeting eBay&apos;s standards for this metric. Possible values are &lt;code&gt;TOP_RATED&lt;/code&gt;, &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, and &lt;code&gt;BELOW_STANDARD&lt;/code&gt;.
     */
    private StandardsLevelEnum level;
    /**
     * The end date and time, in ISO 8601 format, when the seller was evaluated for this metric.
     */
    private String lookbackEndDate;
    /**
     * The start date and time, in ISO 8601 format, when the seller was evaluated for this metric.
     */
    private String lookbackStartDate;
    /**
     * An internal key string specifying a metric. These are short, abbreviated, strings such as &lt;code&gt;MIN_TXN_COUNT&lt;/code&gt;.
     */
    private String metricKey;
    /**
     * A descriptive name for the metric. For example, &quot;Transaction defect rate.&quot; This value is localized according to the value of the &lt;b&gt;X-EBAY-C-MARKETPLACE-ID&lt;/b&gt; request header.
     */
    private String name;
    /**
     * Specifies the lowest number &lt;b&gt;value&lt;/b&gt; can be and still qualify for the currently assigned seller level.  &lt;br&gt;&lt;br&gt;For example, if a seller is assigned the level &lt;code&gt;ABOVE_STANDARD&lt;/code&gt; for the &lt;b&gt;ROCKS_INVENTORY&lt;/b&gt; metric, and &lt;b&gt;thresholdLowerBound&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, having fewer than 10 rocks in inventory would result in the seller dropping a level to &lt;code&gt;BELOW_STANDARD&lt;/code&gt;. See &lt;code&gt;thresholdMetaData&lt;/code&gt; to determine if the lower bound value is inclusive or exclusive.  &lt;br&gt;&lt;br&gt;The lower bound value is optional. For example, if the seller is below standard for this metric, there is no value they can go below for it to further lower their compliance level. Note that each program can have different metric-threshold levels.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Depending on the metric being returned, this field can be returned as an Integer, Boolean, Amount, Fraction, or Double.&lt;/span&gt;
     */
    private SspMetricThresholdLowerBound thresholdLowerBound;
    /**
     * An expression that indicates the inclusive and exclusive characteristics of the upper and lower threshold boundaries.  &lt;br&gt;&lt;br&gt;A metric&apos;s &lt;b&gt;thresholdLowerBound&lt;/b&gt; and &lt;b&gt;thresholdUpperBound&lt;/b&gt; values specify the boundary values that define the current standard compliance level (&lt;code&gt;TOP_RATED&lt;/code&gt;, &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, or &lt;code&gt;BELOW_STANDARD&lt;/code&gt;). The &lt;b&gt;thresholdMetaData&lt;/b&gt; value consists of two values separated by a comma, which are bounded by either a parenthesis or a square bracket. A parenthesis indicates the adjacent value is exclusive while a square bracket indicates the adjacent value is inclusive (exclusive values are not included in the range while inclusive values are included). The metadata values are either &lt;code&gt;UPPER&lt;/code&gt; or &lt;code&gt;LOWER&lt;/code&gt; and these values can be in any order to indicate the characteristics of the metric. &lt;br&gt;&lt;br&gt;For example, suppose a seller&apos;s level is &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, the lower boundary is &lt;code&gt;200&lt;/code&gt;, the upper boundary is &lt;code&gt;300&lt;/code&gt;, and the value for this field is &lt;code&gt;(LOWER, UPPER]&lt;/code&gt;. This indicates that as long as the value for this metric is an integer from 201 (excluding 200) to 300 (including 300), the metric level is above standard. With this, if the seller wants to get a &lt;code&gt;TOP_RATED&lt;/code&gt; rating for this metric, they&apos;ll have to increase their value to at least 301.
     */
    private String thresholdMetaData;
    /**
     * Specifies the highest number &lt;b&gt;value&lt;/b&gt; can be and still qualify for the currently assigned seller level.  &lt;br&gt;&lt;br&gt;For example, if a seller is assigned the level &lt;code&gt;ABOVE_STANDARD&lt;/code&gt; for the &lt;b&gt;ROCKS_INVENTORY&lt;/b&gt; metric, and the &lt;b&gt;thresholdUpperBound&lt;/b&gt; is set to &lt;code&gt;20&lt;/code&gt;, having more than 20 rocks in inventory would result in the seller rising a lever, to &lt;code&gt;TOP_RATED&lt;/code&gt;. See &lt;code&gt;thresholdMetaData&lt;/code&gt; to determine if the upper bound value is inclusive or exclusive.  &lt;br&gt;&lt;br&gt;The upper bound value is optional. For example, if the seller is top rated for this metric, there is no value they can go above for it to further raise their compliance level. Note that each program can have different metric-threshold levels.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Depending on the metric being returned, this field can be returned as an Integer, Boolean, Amount, Fraction, or Double.&lt;/span&gt;
     */
    private SspMetricThresholdUpperBound thresholdUpperBound;
    /**
     * Indicates the data type of the returned metric. Possible values are: &lt;code&gt;AMOUNT&lt;/code&gt;, &lt;code&gt;BOOLEAN&lt;/code&gt;, &lt;code&gt;DATE&lt;/code&gt;, &lt;code&gt;FRACTION&lt;/code&gt;, &lt;code&gt;NUMBER&lt;/code&gt;, and &lt;code&gt;STRING&lt;/code&gt;.
     */
    private SspDataTypeEnum type;
    /**
     * The seller&apos;s calculated value, or score, for the metric.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Depending on the metric being returned, this field can be returned as an Integer, Boolean, Fraction, or Amount.&lt;/span&gt;
     */
    private SspMetricValue value;
    /**
     * Instantiates a new {@link SspMetric} and sets the default values.
     */
    public SspMetric() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SspMetric}
     */
    @jakarta.annotation.Nonnull
    public static SspMetric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SspMetric();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("level", (n) -> { this.setLevel(n.getEnumValue(StandardsLevelEnum::forValue)); });
        deserializerMap.put("lookbackEndDate", (n) -> { this.setLookbackEndDate(n.getStringValue()); });
        deserializerMap.put("lookbackStartDate", (n) -> { this.setLookbackStartDate(n.getStringValue()); });
        deserializerMap.put("metricKey", (n) -> { this.setMetricKey(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("thresholdLowerBound", (n) -> { this.setThresholdLowerBound(n.getObjectValue(SspMetricThresholdLowerBound::createFromDiscriminatorValue)); });
        deserializerMap.put("thresholdMetaData", (n) -> { this.setThresholdMetaData(n.getStringValue()); });
        deserializerMap.put("thresholdUpperBound", (n) -> { this.setThresholdUpperBound(n.getObjectValue(SspMetricThresholdUpperBound::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(SspDataTypeEnum::forValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getObjectValue(SspMetricValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the level property value. The seller level for this metric, which indicates how well the seller is doing in meeting eBay&apos;s standards for this metric. Possible values are &lt;code&gt;TOP_RATED&lt;/code&gt;, &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, and &lt;code&gt;BELOW_STANDARD&lt;/code&gt;.
     * @return a {@link StandardsLevelEnum}
     */
    @jakarta.annotation.Nullable
    public StandardsLevelEnum getLevel() {
        return this.level;
    }
    /**
     * Gets the lookbackEndDate property value. The end date and time, in ISO 8601 format, when the seller was evaluated for this metric.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLookbackEndDate() {
        return this.lookbackEndDate;
    }
    /**
     * Gets the lookbackStartDate property value. The start date and time, in ISO 8601 format, when the seller was evaluated for this metric.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLookbackStartDate() {
        return this.lookbackStartDate;
    }
    /**
     * Gets the metricKey property value. An internal key string specifying a metric. These are short, abbreviated, strings such as &lt;code&gt;MIN_TXN_COUNT&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMetricKey() {
        return this.metricKey;
    }
    /**
     * Gets the name property value. A descriptive name for the metric. For example, &quot;Transaction defect rate.&quot; This value is localized according to the value of the &lt;b&gt;X-EBAY-C-MARKETPLACE-ID&lt;/b&gt; request header.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the thresholdLowerBound property value. Specifies the lowest number &lt;b&gt;value&lt;/b&gt; can be and still qualify for the currently assigned seller level.  &lt;br&gt;&lt;br&gt;For example, if a seller is assigned the level &lt;code&gt;ABOVE_STANDARD&lt;/code&gt; for the &lt;b&gt;ROCKS_INVENTORY&lt;/b&gt; metric, and &lt;b&gt;thresholdLowerBound&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, having fewer than 10 rocks in inventory would result in the seller dropping a level to &lt;code&gt;BELOW_STANDARD&lt;/code&gt;. See &lt;code&gt;thresholdMetaData&lt;/code&gt; to determine if the lower bound value is inclusive or exclusive.  &lt;br&gt;&lt;br&gt;The lower bound value is optional. For example, if the seller is below standard for this metric, there is no value they can go below for it to further lower their compliance level. Note that each program can have different metric-threshold levels.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Depending on the metric being returned, this field can be returned as an Integer, Boolean, Amount, Fraction, or Double.&lt;/span&gt;
     * @return a {@link SspMetricThresholdLowerBound}
     */
    @jakarta.annotation.Nullable
    public SspMetricThresholdLowerBound getThresholdLowerBound() {
        return this.thresholdLowerBound;
    }
    /**
     * Gets the thresholdMetaData property value. An expression that indicates the inclusive and exclusive characteristics of the upper and lower threshold boundaries.  &lt;br&gt;&lt;br&gt;A metric&apos;s &lt;b&gt;thresholdLowerBound&lt;/b&gt; and &lt;b&gt;thresholdUpperBound&lt;/b&gt; values specify the boundary values that define the current standard compliance level (&lt;code&gt;TOP_RATED&lt;/code&gt;, &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, or &lt;code&gt;BELOW_STANDARD&lt;/code&gt;). The &lt;b&gt;thresholdMetaData&lt;/b&gt; value consists of two values separated by a comma, which are bounded by either a parenthesis or a square bracket. A parenthesis indicates the adjacent value is exclusive while a square bracket indicates the adjacent value is inclusive (exclusive values are not included in the range while inclusive values are included). The metadata values are either &lt;code&gt;UPPER&lt;/code&gt; or &lt;code&gt;LOWER&lt;/code&gt; and these values can be in any order to indicate the characteristics of the metric. &lt;br&gt;&lt;br&gt;For example, suppose a seller&apos;s level is &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, the lower boundary is &lt;code&gt;200&lt;/code&gt;, the upper boundary is &lt;code&gt;300&lt;/code&gt;, and the value for this field is &lt;code&gt;(LOWER, UPPER]&lt;/code&gt;. This indicates that as long as the value for this metric is an integer from 201 (excluding 200) to 300 (including 300), the metric level is above standard. With this, if the seller wants to get a &lt;code&gt;TOP_RATED&lt;/code&gt; rating for this metric, they&apos;ll have to increase their value to at least 301.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThresholdMetaData() {
        return this.thresholdMetaData;
    }
    /**
     * Gets the thresholdUpperBound property value. Specifies the highest number &lt;b&gt;value&lt;/b&gt; can be and still qualify for the currently assigned seller level.  &lt;br&gt;&lt;br&gt;For example, if a seller is assigned the level &lt;code&gt;ABOVE_STANDARD&lt;/code&gt; for the &lt;b&gt;ROCKS_INVENTORY&lt;/b&gt; metric, and the &lt;b&gt;thresholdUpperBound&lt;/b&gt; is set to &lt;code&gt;20&lt;/code&gt;, having more than 20 rocks in inventory would result in the seller rising a lever, to &lt;code&gt;TOP_RATED&lt;/code&gt;. See &lt;code&gt;thresholdMetaData&lt;/code&gt; to determine if the upper bound value is inclusive or exclusive.  &lt;br&gt;&lt;br&gt;The upper bound value is optional. For example, if the seller is top rated for this metric, there is no value they can go above for it to further raise their compliance level. Note that each program can have different metric-threshold levels.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Depending on the metric being returned, this field can be returned as an Integer, Boolean, Amount, Fraction, or Double.&lt;/span&gt;
     * @return a {@link SspMetricThresholdUpperBound}
     */
    @jakarta.annotation.Nullable
    public SspMetricThresholdUpperBound getThresholdUpperBound() {
        return this.thresholdUpperBound;
    }
    /**
     * Gets the type property value. Indicates the data type of the returned metric. Possible values are: &lt;code&gt;AMOUNT&lt;/code&gt;, &lt;code&gt;BOOLEAN&lt;/code&gt;, &lt;code&gt;DATE&lt;/code&gt;, &lt;code&gt;FRACTION&lt;/code&gt;, &lt;code&gt;NUMBER&lt;/code&gt;, and &lt;code&gt;STRING&lt;/code&gt;.
     * @return a {@link SspDataTypeEnum}
     */
    @jakarta.annotation.Nullable
    public SspDataTypeEnum getType() {
        return this.type;
    }
    /**
     * Gets the value property value. The seller&apos;s calculated value, or score, for the metric.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Depending on the metric being returned, this field can be returned as an Integer, Boolean, Fraction, or Amount.&lt;/span&gt;
     * @return a {@link SspMetricValue}
     */
    @jakarta.annotation.Nullable
    public SspMetricValue getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("level", this.getLevel());
        writer.writeStringValue("lookbackEndDate", this.getLookbackEndDate());
        writer.writeStringValue("lookbackStartDate", this.getLookbackStartDate());
        writer.writeStringValue("metricKey", this.getMetricKey());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("thresholdLowerBound", this.getThresholdLowerBound());
        writer.writeStringValue("thresholdMetaData", this.getThresholdMetaData());
        writer.writeObjectValue("thresholdUpperBound", this.getThresholdUpperBound());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the level property value. The seller level for this metric, which indicates how well the seller is doing in meeting eBay&apos;s standards for this metric. Possible values are &lt;code&gt;TOP_RATED&lt;/code&gt;, &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, and &lt;code&gt;BELOW_STANDARD&lt;/code&gt;.
     * @param value Value to set for the level property.
     */
    public void setLevel(@jakarta.annotation.Nullable final StandardsLevelEnum value) {
        this.level = value;
    }
    /**
     * Sets the lookbackEndDate property value. The end date and time, in ISO 8601 format, when the seller was evaluated for this metric.
     * @param value Value to set for the lookbackEndDate property.
     */
    public void setLookbackEndDate(@jakarta.annotation.Nullable final String value) {
        this.lookbackEndDate = value;
    }
    /**
     * Sets the lookbackStartDate property value. The start date and time, in ISO 8601 format, when the seller was evaluated for this metric.
     * @param value Value to set for the lookbackStartDate property.
     */
    public void setLookbackStartDate(@jakarta.annotation.Nullable final String value) {
        this.lookbackStartDate = value;
    }
    /**
     * Sets the metricKey property value. An internal key string specifying a metric. These are short, abbreviated, strings such as &lt;code&gt;MIN_TXN_COUNT&lt;/code&gt;.
     * @param value Value to set for the metricKey property.
     */
    public void setMetricKey(@jakarta.annotation.Nullable final String value) {
        this.metricKey = value;
    }
    /**
     * Sets the name property value. A descriptive name for the metric. For example, &quot;Transaction defect rate.&quot; This value is localized according to the value of the &lt;b&gt;X-EBAY-C-MARKETPLACE-ID&lt;/b&gt; request header.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the thresholdLowerBound property value. Specifies the lowest number &lt;b&gt;value&lt;/b&gt; can be and still qualify for the currently assigned seller level.  &lt;br&gt;&lt;br&gt;For example, if a seller is assigned the level &lt;code&gt;ABOVE_STANDARD&lt;/code&gt; for the &lt;b&gt;ROCKS_INVENTORY&lt;/b&gt; metric, and &lt;b&gt;thresholdLowerBound&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, having fewer than 10 rocks in inventory would result in the seller dropping a level to &lt;code&gt;BELOW_STANDARD&lt;/code&gt;. See &lt;code&gt;thresholdMetaData&lt;/code&gt; to determine if the lower bound value is inclusive or exclusive.  &lt;br&gt;&lt;br&gt;The lower bound value is optional. For example, if the seller is below standard for this metric, there is no value they can go below for it to further lower their compliance level. Note that each program can have different metric-threshold levels.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Depending on the metric being returned, this field can be returned as an Integer, Boolean, Amount, Fraction, or Double.&lt;/span&gt;
     * @param value Value to set for the thresholdLowerBound property.
     */
    public void setThresholdLowerBound(@jakarta.annotation.Nullable final SspMetricThresholdLowerBound value) {
        this.thresholdLowerBound = value;
    }
    /**
     * Sets the thresholdMetaData property value. An expression that indicates the inclusive and exclusive characteristics of the upper and lower threshold boundaries.  &lt;br&gt;&lt;br&gt;A metric&apos;s &lt;b&gt;thresholdLowerBound&lt;/b&gt; and &lt;b&gt;thresholdUpperBound&lt;/b&gt; values specify the boundary values that define the current standard compliance level (&lt;code&gt;TOP_RATED&lt;/code&gt;, &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, or &lt;code&gt;BELOW_STANDARD&lt;/code&gt;). The &lt;b&gt;thresholdMetaData&lt;/b&gt; value consists of two values separated by a comma, which are bounded by either a parenthesis or a square bracket. A parenthesis indicates the adjacent value is exclusive while a square bracket indicates the adjacent value is inclusive (exclusive values are not included in the range while inclusive values are included). The metadata values are either &lt;code&gt;UPPER&lt;/code&gt; or &lt;code&gt;LOWER&lt;/code&gt; and these values can be in any order to indicate the characteristics of the metric. &lt;br&gt;&lt;br&gt;For example, suppose a seller&apos;s level is &lt;code&gt;ABOVE_STANDARD&lt;/code&gt;, the lower boundary is &lt;code&gt;200&lt;/code&gt;, the upper boundary is &lt;code&gt;300&lt;/code&gt;, and the value for this field is &lt;code&gt;(LOWER, UPPER]&lt;/code&gt;. This indicates that as long as the value for this metric is an integer from 201 (excluding 200) to 300 (including 300), the metric level is above standard. With this, if the seller wants to get a &lt;code&gt;TOP_RATED&lt;/code&gt; rating for this metric, they&apos;ll have to increase their value to at least 301.
     * @param value Value to set for the thresholdMetaData property.
     */
    public void setThresholdMetaData(@jakarta.annotation.Nullable final String value) {
        this.thresholdMetaData = value;
    }
    /**
     * Sets the thresholdUpperBound property value. Specifies the highest number &lt;b&gt;value&lt;/b&gt; can be and still qualify for the currently assigned seller level.  &lt;br&gt;&lt;br&gt;For example, if a seller is assigned the level &lt;code&gt;ABOVE_STANDARD&lt;/code&gt; for the &lt;b&gt;ROCKS_INVENTORY&lt;/b&gt; metric, and the &lt;b&gt;thresholdUpperBound&lt;/b&gt; is set to &lt;code&gt;20&lt;/code&gt;, having more than 20 rocks in inventory would result in the seller rising a lever, to &lt;code&gt;TOP_RATED&lt;/code&gt;. See &lt;code&gt;thresholdMetaData&lt;/code&gt; to determine if the upper bound value is inclusive or exclusive.  &lt;br&gt;&lt;br&gt;The upper bound value is optional. For example, if the seller is top rated for this metric, there is no value they can go above for it to further raise their compliance level. Note that each program can have different metric-threshold levels.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Depending on the metric being returned, this field can be returned as an Integer, Boolean, Amount, Fraction, or Double.&lt;/span&gt;
     * @param value Value to set for the thresholdUpperBound property.
     */
    public void setThresholdUpperBound(@jakarta.annotation.Nullable final SspMetricThresholdUpperBound value) {
        this.thresholdUpperBound = value;
    }
    /**
     * Sets the type property value. Indicates the data type of the returned metric. Possible values are: &lt;code&gt;AMOUNT&lt;/code&gt;, &lt;code&gt;BOOLEAN&lt;/code&gt;, &lt;code&gt;DATE&lt;/code&gt;, &lt;code&gt;FRACTION&lt;/code&gt;, &lt;code&gt;NUMBER&lt;/code&gt;, and &lt;code&gt;STRING&lt;/code&gt;.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final SspDataTypeEnum value) {
        this.type = value;
    }
    /**
     * Sets the value property value. The seller&apos;s calculated value, or score, for the metric.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Depending on the metric being returned, this field can be returned as an Integer, Boolean, Fraction, or Amount.&lt;/span&gt;
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final SspMetricValue value) {
        this.value = value;
    }
}
