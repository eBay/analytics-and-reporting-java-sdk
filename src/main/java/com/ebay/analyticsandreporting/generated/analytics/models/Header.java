package com.ebay.analyticsandreporting.generated.analytics.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Type that defines the headers for the dimension keys and metrics returned in the report.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Header implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of the dimension or metric keys returned in the report. The values for each are is returned in the associated &lt;b&gt;key&lt;/b&gt; fields.
     */
    private java.util.List<Definition> dimensionKeys;
    /**
     * The list of metrics returned in the report. The values for each are is returned in the associated &lt;b&gt;key&lt;/b&gt; fields.
     */
    private java.util.List<Definition> metrics;
    /**
     * Instantiates a new {@link Header} and sets the default values.
     */
    public Header() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Header}
     */
    @jakarta.annotation.Nonnull
    public static Header createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Header();
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
     * Gets the dimensionKeys property value. A list of the dimension or metric keys returned in the report. The values for each are is returned in the associated &lt;b&gt;key&lt;/b&gt; fields.
     * @return a {@link java.util.List<Definition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Definition> getDimensionKeys() {
        return this.dimensionKeys;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("dimensionKeys", (n) -> { this.setDimensionKeys(n.getCollectionOfObjectValues(Definition::createFromDiscriminatorValue)); });
        deserializerMap.put("metrics", (n) -> { this.setMetrics(n.getCollectionOfObjectValues(Definition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the metrics property value. The list of metrics returned in the report. The values for each are is returned in the associated &lt;b&gt;key&lt;/b&gt; fields.
     * @return a {@link java.util.List<Definition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Definition> getMetrics() {
        return this.metrics;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("dimensionKeys", this.getDimensionKeys());
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
     * Sets the dimensionKeys property value. A list of the dimension or metric keys returned in the report. The values for each are is returned in the associated &lt;b&gt;key&lt;/b&gt; fields.
     * @param value Value to set for the dimensionKeys property.
     */
    public void setDimensionKeys(@jakarta.annotation.Nullable final java.util.List<Definition> value) {
        this.dimensionKeys = value;
    }
    /**
     * Sets the metrics property value. The list of metrics returned in the report. The values for each are is returned in the associated &lt;b&gt;key&lt;/b&gt; fields.
     * @param value Value to set for the metrics property.
     */
    public void setMetrics(@jakarta.annotation.Nullable final java.util.List<Definition> value) {
        this.metrics = value;
    }
}
