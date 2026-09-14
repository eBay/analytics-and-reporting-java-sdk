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
 * This complex data type defines the details of the customer service metric and benchmark data related to the associated &lt;b&gt;dimension&lt;/b&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApiMetric implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This complex type defines a set of benchmark data, which includes the &lt;b&gt;average&lt;/b&gt; rating for the group included in the benchmark evaluation and the seller&apos;s calculated customer service metric rating for the benchmark.  &lt;br&gt;&lt;br&gt;This container is returned only if the associated &lt;b&gt;metricKey&lt;/b&gt; value is &lt;code&gt;RATE&lt;/code&gt;.
     */
    private MetricBenchmark benchmark;
    /**
     * Returned when &lt;b&gt;metricKey&lt;/b&gt; equals &lt;code&gt;COUNT&lt;/code&gt;, this field returns an array of  seller data where each set of data is grouped according by an overarching &lt;b&gt;basis&lt;/b&gt;.  &lt;br&gt;&lt;br&gt;When the seller distribution is returned, the numeric value of the associated &lt;b&gt;value&lt;/b&gt; container equals the sum of the transactions where the seller meets the criteria of the customer service metric type for the given &lt;b&gt;dimension&lt;/b&gt; during the &lt;b&gt;evaluationCycle&lt;/b&gt;.
     */
    private java.util.List<MetricDistribution> distributions;
    /**
     * This field indicates the customer service metric being returned in the associated &lt;b&gt;metrics&lt;/b&gt; container. The field is set as follows: &lt;ul&gt;&lt;li&gt;&lt;code&gt;TRANSACTION_COUNT&lt;/code&gt; &amp;ndash; When set to this value, the associated &lt;b&gt;value&lt;/b&gt; field returns the number of transactions completed in the peer group for the metric being evaluated in the associated &lt;b&gt;dimension&lt;/b&gt; and &lt;b&gt;evaluationCycle&lt;/b&gt;.&lt;/li&gt; &lt;li&gt;&lt;code&gt;COUNT&lt;/code&gt; &amp;ndash; When set to this value, the associated &lt;b&gt;value&lt;/b&gt; field is set to the number of transactions completed by the seller for the metric being evaluated in the associated &lt;b&gt;dimension&lt;/b&gt; and &lt;b&gt;evaluationCycle&lt;/b&gt;.&lt;/li&gt; &lt;li&gt;&lt;code&gt;RATE&lt;/code&gt; &amp;ndash; When set to this value, the fields in the associated container return the seller&apos;s calculated &lt;b&gt;value&lt;/b&gt; for the associated customer service metric along with the benchmark data against which the seller is evaluated.  &lt;br&gt;&lt;br&gt;Specifically, when &lt;b&gt;metricKey&lt;/b&gt; is set to &lt;code&gt;RATE&lt;/code&gt;, the associated &lt;b&gt;value&lt;/b&gt; field is set to the value of &lt;b&gt;metricKey&lt;/b&gt; &lt;code&gt;TRANSACTION_COUNT&lt;/code&gt; divided by the value of &lt;b&gt;metricKey&lt;/b&gt; &lt;code&gt;COUNT&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;The &lt;b&gt;benchmark.rating&lt;/b&gt; value is the seller&apos;s rating for the metric in the associated &lt;b&gt;dimension&lt;/b&gt; and &lt;b&gt;evaluationCycle&lt;/b&gt;.&lt;/li&gt;&lt;/ul&gt;
     */
    private String metricKey;
    /**
     * This field is set to the seller&apos;s numeric rating for the associated &lt;b&gt;metricKey&lt;/b&gt; for the given &lt;b&gt;dimension&lt;/b&gt; during the &lt;b&gt;evaluationCycle&lt;/b&gt;.  &lt;br&gt;&lt;br&gt;To determine the seller&apos;s rating for this metric, the value of this field is compared to the average metric value of the group.
     */
    private String value;
    /**
     * Instantiates a new {@link ApiMetric} and sets the default values.
     */
    public ApiMetric() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApiMetric}
     */
    @jakarta.annotation.Nonnull
    public static ApiMetric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApiMetric();
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
     * Gets the benchmark property value. This complex type defines a set of benchmark data, which includes the &lt;b&gt;average&lt;/b&gt; rating for the group included in the benchmark evaluation and the seller&apos;s calculated customer service metric rating for the benchmark.  &lt;br&gt;&lt;br&gt;This container is returned only if the associated &lt;b&gt;metricKey&lt;/b&gt; value is &lt;code&gt;RATE&lt;/code&gt;.
     * @return a {@link MetricBenchmark}
     */
    @jakarta.annotation.Nullable
    public MetricBenchmark getBenchmark() {
        return this.benchmark;
    }
    /**
     * Gets the distributions property value. Returned when &lt;b&gt;metricKey&lt;/b&gt; equals &lt;code&gt;COUNT&lt;/code&gt;, this field returns an array of  seller data where each set of data is grouped according by an overarching &lt;b&gt;basis&lt;/b&gt;.  &lt;br&gt;&lt;br&gt;When the seller distribution is returned, the numeric value of the associated &lt;b&gt;value&lt;/b&gt; container equals the sum of the transactions where the seller meets the criteria of the customer service metric type for the given &lt;b&gt;dimension&lt;/b&gt; during the &lt;b&gt;evaluationCycle&lt;/b&gt;.
     * @return a {@link java.util.List<MetricDistribution>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MetricDistribution> getDistributions() {
        return this.distributions;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("benchmark", (n) -> { this.setBenchmark(n.getObjectValue(MetricBenchmark::createFromDiscriminatorValue)); });
        deserializerMap.put("distributions", (n) -> { this.setDistributions(n.getCollectionOfObjectValues(MetricDistribution::createFromDiscriminatorValue)); });
        deserializerMap.put("metricKey", (n) -> { this.setMetricKey(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the metricKey property value. This field indicates the customer service metric being returned in the associated &lt;b&gt;metrics&lt;/b&gt; container. The field is set as follows: &lt;ul&gt;&lt;li&gt;&lt;code&gt;TRANSACTION_COUNT&lt;/code&gt; &amp;ndash; When set to this value, the associated &lt;b&gt;value&lt;/b&gt; field returns the number of transactions completed in the peer group for the metric being evaluated in the associated &lt;b&gt;dimension&lt;/b&gt; and &lt;b&gt;evaluationCycle&lt;/b&gt;.&lt;/li&gt; &lt;li&gt;&lt;code&gt;COUNT&lt;/code&gt; &amp;ndash; When set to this value, the associated &lt;b&gt;value&lt;/b&gt; field is set to the number of transactions completed by the seller for the metric being evaluated in the associated &lt;b&gt;dimension&lt;/b&gt; and &lt;b&gt;evaluationCycle&lt;/b&gt;.&lt;/li&gt; &lt;li&gt;&lt;code&gt;RATE&lt;/code&gt; &amp;ndash; When set to this value, the fields in the associated container return the seller&apos;s calculated &lt;b&gt;value&lt;/b&gt; for the associated customer service metric along with the benchmark data against which the seller is evaluated.  &lt;br&gt;&lt;br&gt;Specifically, when &lt;b&gt;metricKey&lt;/b&gt; is set to &lt;code&gt;RATE&lt;/code&gt;, the associated &lt;b&gt;value&lt;/b&gt; field is set to the value of &lt;b&gt;metricKey&lt;/b&gt; &lt;code&gt;TRANSACTION_COUNT&lt;/code&gt; divided by the value of &lt;b&gt;metricKey&lt;/b&gt; &lt;code&gt;COUNT&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;The &lt;b&gt;benchmark.rating&lt;/b&gt; value is the seller&apos;s rating for the metric in the associated &lt;b&gt;dimension&lt;/b&gt; and &lt;b&gt;evaluationCycle&lt;/b&gt;.&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMetricKey() {
        return this.metricKey;
    }
    /**
     * Gets the value property value. This field is set to the seller&apos;s numeric rating for the associated &lt;b&gt;metricKey&lt;/b&gt; for the given &lt;b&gt;dimension&lt;/b&gt; during the &lt;b&gt;evaluationCycle&lt;/b&gt;.  &lt;br&gt;&lt;br&gt;To determine the seller&apos;s rating for this metric, the value of this field is compared to the average metric value of the group.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("benchmark", this.getBenchmark());
        writer.writeCollectionOfObjectValues("distributions", this.getDistributions());
        writer.writeStringValue("metricKey", this.getMetricKey());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the benchmark property value. This complex type defines a set of benchmark data, which includes the &lt;b&gt;average&lt;/b&gt; rating for the group included in the benchmark evaluation and the seller&apos;s calculated customer service metric rating for the benchmark.  &lt;br&gt;&lt;br&gt;This container is returned only if the associated &lt;b&gt;metricKey&lt;/b&gt; value is &lt;code&gt;RATE&lt;/code&gt;.
     * @param value Value to set for the benchmark property.
     */
    public void setBenchmark(@jakarta.annotation.Nullable final MetricBenchmark value) {
        this.benchmark = value;
    }
    /**
     * Sets the distributions property value. Returned when &lt;b&gt;metricKey&lt;/b&gt; equals &lt;code&gt;COUNT&lt;/code&gt;, this field returns an array of  seller data where each set of data is grouped according by an overarching &lt;b&gt;basis&lt;/b&gt;.  &lt;br&gt;&lt;br&gt;When the seller distribution is returned, the numeric value of the associated &lt;b&gt;value&lt;/b&gt; container equals the sum of the transactions where the seller meets the criteria of the customer service metric type for the given &lt;b&gt;dimension&lt;/b&gt; during the &lt;b&gt;evaluationCycle&lt;/b&gt;.
     * @param value Value to set for the distributions property.
     */
    public void setDistributions(@jakarta.annotation.Nullable final java.util.List<MetricDistribution> value) {
        this.distributions = value;
    }
    /**
     * Sets the metricKey property value. This field indicates the customer service metric being returned in the associated &lt;b&gt;metrics&lt;/b&gt; container. The field is set as follows: &lt;ul&gt;&lt;li&gt;&lt;code&gt;TRANSACTION_COUNT&lt;/code&gt; &amp;ndash; When set to this value, the associated &lt;b&gt;value&lt;/b&gt; field returns the number of transactions completed in the peer group for the metric being evaluated in the associated &lt;b&gt;dimension&lt;/b&gt; and &lt;b&gt;evaluationCycle&lt;/b&gt;.&lt;/li&gt; &lt;li&gt;&lt;code&gt;COUNT&lt;/code&gt; &amp;ndash; When set to this value, the associated &lt;b&gt;value&lt;/b&gt; field is set to the number of transactions completed by the seller for the metric being evaluated in the associated &lt;b&gt;dimension&lt;/b&gt; and &lt;b&gt;evaluationCycle&lt;/b&gt;.&lt;/li&gt; &lt;li&gt;&lt;code&gt;RATE&lt;/code&gt; &amp;ndash; When set to this value, the fields in the associated container return the seller&apos;s calculated &lt;b&gt;value&lt;/b&gt; for the associated customer service metric along with the benchmark data against which the seller is evaluated.  &lt;br&gt;&lt;br&gt;Specifically, when &lt;b&gt;metricKey&lt;/b&gt; is set to &lt;code&gt;RATE&lt;/code&gt;, the associated &lt;b&gt;value&lt;/b&gt; field is set to the value of &lt;b&gt;metricKey&lt;/b&gt; &lt;code&gt;TRANSACTION_COUNT&lt;/code&gt; divided by the value of &lt;b&gt;metricKey&lt;/b&gt; &lt;code&gt;COUNT&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;The &lt;b&gt;benchmark.rating&lt;/b&gt; value is the seller&apos;s rating for the metric in the associated &lt;b&gt;dimension&lt;/b&gt; and &lt;b&gt;evaluationCycle&lt;/b&gt;.&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the metricKey property.
     */
    public void setMetricKey(@jakarta.annotation.Nullable final String value) {
        this.metricKey = value;
    }
    /**
     * Sets the value property value. This field is set to the seller&apos;s numeric rating for the associated &lt;b&gt;metricKey&lt;/b&gt; for the given &lt;b&gt;dimension&lt;/b&gt; during the &lt;b&gt;evaluationCycle&lt;/b&gt;.  &lt;br&gt;&lt;br&gt;To determine the seller&apos;s rating for this metric, the value of this field is compared to the average metric value of the group.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
