package com.ebay.analyticsandreporting.generated.analytics.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This complex type defines the fields that comprise the benchmark against which the seller&apos;s performance is compared. The comparison determines the seller&apos;s rating for the metric.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BenchmarkMetadata implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field returns the average value for the group, as defined by the specified &lt;b&gt;basis&lt;/b&gt;.  &lt;br&gt;&lt;br&gt;When the benchmark &lt;b&gt;basis&lt;/b&gt; is set to &lt;code&gt;PEER_BENCHMARK&lt;/code&gt;, the value returned in this field is the benchmark value to which the seller&apos;s metric &lt;b&gt;value&lt;/b&gt; is compared to determine the seller&apos;s rating for the customer service metric.
     */
    private String average;
    /**
     * Instantiates a new {@link BenchmarkMetadata} and sets the default values.
     */
    public BenchmarkMetadata() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BenchmarkMetadata}
     */
    @jakarta.annotation.Nonnull
    public static BenchmarkMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BenchmarkMetadata();
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
     * Gets the average property value. This field returns the average value for the group, as defined by the specified &lt;b&gt;basis&lt;/b&gt;.  &lt;br&gt;&lt;br&gt;When the benchmark &lt;b&gt;basis&lt;/b&gt; is set to &lt;code&gt;PEER_BENCHMARK&lt;/code&gt;, the value returned in this field is the benchmark value to which the seller&apos;s metric &lt;b&gt;value&lt;/b&gt; is compared to determine the seller&apos;s rating for the customer service metric.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAverage() {
        return this.average;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("average", (n) -> { this.setAverage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("average", this.getAverage());
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
     * Sets the average property value. This field returns the average value for the group, as defined by the specified &lt;b&gt;basis&lt;/b&gt;.  &lt;br&gt;&lt;br&gt;When the benchmark &lt;b&gt;basis&lt;/b&gt; is set to &lt;code&gt;PEER_BENCHMARK&lt;/code&gt;, the value returned in this field is the benchmark value to which the seller&apos;s metric &lt;b&gt;value&lt;/b&gt; is compared to determine the seller&apos;s rating for the customer service metric.
     * @param value Value to set for the average property.
     */
    public void setAverage(@jakarta.annotation.Nullable final String value) {
        this.average = value;
    }
}
