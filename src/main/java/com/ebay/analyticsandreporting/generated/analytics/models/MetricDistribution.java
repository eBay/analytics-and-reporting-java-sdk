package com.ebay.analyticsandreporting.generated.analytics.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This complex data type describes the metric distribution by basis.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MetricDistribution implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field returns the basis, or the method, by which the metric rating is calculated.
     */
    private String basis;
    /**
     * This field returns a list of name/value pairs, where the &lt;b&gt;name&lt;/b&gt; indicates the distribution being rated and the &lt;b&gt;value&lt;/b&gt; indicates the count of seller transactions that meet the distribution criteria.
     */
    private java.util.List<Distribution> data;
    /**
     * Instantiates a new {@link MetricDistribution} and sets the default values.
     */
    public MetricDistribution() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MetricDistribution}
     */
    @jakarta.annotation.Nonnull
    public static MetricDistribution createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MetricDistribution();
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
     * Gets the basis property value. This field returns the basis, or the method, by which the metric rating is calculated.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBasis() {
        return this.basis;
    }
    /**
     * Gets the data property value. This field returns a list of name/value pairs, where the &lt;b&gt;name&lt;/b&gt; indicates the distribution being rated and the &lt;b&gt;value&lt;/b&gt; indicates the count of seller transactions that meet the distribution criteria.
     * @return a {@link java.util.List<Distribution>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Distribution> getData() {
        return this.data;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("basis", (n) -> { this.setBasis(n.getStringValue()); });
        deserializerMap.put("data", (n) -> { this.setData(n.getCollectionOfObjectValues(Distribution::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("basis", this.getBasis());
        writer.writeCollectionOfObjectValues("data", this.getData());
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
     * Sets the basis property value. This field returns the basis, or the method, by which the metric rating is calculated.
     * @param value Value to set for the basis property.
     */
    public void setBasis(@jakarta.annotation.Nullable final String value) {
        this.basis = value;
    }
    /**
     * Sets the data property value. This field returns a list of name/value pairs, where the &lt;b&gt;name&lt;/b&gt; indicates the distribution being rated and the &lt;b&gt;value&lt;/b&gt; indicates the count of seller transactions that meet the distribution criteria.
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final java.util.List<Distribution> value) {
        this.data = value;
    }
}
