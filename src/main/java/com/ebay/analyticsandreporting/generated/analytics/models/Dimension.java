package com.ebay.analyticsandreporting.generated.analytics.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The fields in this complex type define the dimension, or attributes, by which the associated customer service metric and benchmark data is measured.  &lt;br&gt;&lt;br&gt;The value of &lt;b&gt;dimensionKey&lt;/b&gt; gets set according to the configuration of the input request. The &lt;b&gt;name&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; pair further define dimension under the key.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Dimension implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * &lt;b&gt;dimensionKey&lt;/b&gt; defines the basis against which the seller&apos;s customer service metric is measured.  &lt;br&gt;&lt;br&gt;The value of this field gets set according to the value of the &lt;b&gt;customer_service_metric_type&lt;/b&gt; input parameter. The following input configurations return the responses shown: &lt;ul&gt;&lt;li&gt;&lt;code&gt;ITEM_NOT_AS_DESCRIBED&lt;/code&gt; &amp;ndash; Returns benchmark ratings based on L1 listing categories, so the result shows metrics where the &lt;b&gt;dimensionKey&lt;/b&gt; is set to &lt;code&gt;LISTING_CATEGORY&lt;/code&gt;.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;ITEM_NOT_RECEIVED&lt;/code&gt; &amp;ndash; Returns benchmark ratings based on world shipping regions, so the result shows metrics where the &lt;b&gt;dimensionKey&lt;/b&gt; is set to &lt;code&gt;SHIPPING_REGION&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;The shipping region is indicated by the associated &lt;b&gt;value&lt;/b&gt; field. For specifics on world shipping regions, see the FAQ section on the following page: &lt;a href=&quot;https://www.ebay.com/help/selling/selling/monitor-service-metrics?id=4785&quot; title=&quot;eBay Help page&quot; target=&quot;_blank&quot;&gt;Monitor your service metrics&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/api:DimensionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String dimensionKey;
    /**
     * The dimension name returned in this field depends on the &lt;b&gt;dimensionKey&lt;/b&gt;: &lt;ul&gt;&lt;li&gt;If  &lt;b&gt;dimensionKey&lt;/b&gt; is set to &lt;code&gt;SHIPPING_REGION&lt;/code&gt;, this field is set to one of following values, which represent established shipping corridors: &lt;ul&gt;&lt;li&gt;&lt;code&gt;Domestic&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;International: Mature region&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;International: Emerging region&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;  &lt;li&gt;If &lt;b&gt;dimensionKey&lt;/b&gt; is set to &lt;code&gt;LISTING_CATEGORY&lt;/code&gt;, this field is set to the name of the primary (L1) category in which the items being rated were listed.&lt;/li&gt;&lt;/ul&gt;
     */
    private String name;
    /**
     * The value returned in this field depends on the &lt;b&gt;dimensionKey&lt;/b&gt;.  &lt;br&gt;&lt;br&gt;If &lt;b&gt;dimensionKey&lt;/b&gt; equals &lt;code&gt;LISTING_CATEGORY&lt;/code&gt;, the value returned in this field is the category ID of the primary (L1) category in which the items being rated were listed.  &lt;br&gt;&lt;br&gt;If &lt;b&gt;dimensionKey&lt;/b&gt; equals &lt;code&gt;SHIPPING_REGION&lt;/code&gt;, one of the following values is returned:  &lt;ul&gt;&lt;li&gt;&lt;code&gt;DOMESTIC&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;INTERNATIONAL_MATURED_REGION&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;INTERNATIONAL_EMERGING_REGION&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private String value;
    /**
     * Instantiates a new {@link Dimension} and sets the default values.
     */
    public Dimension() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Dimension}
     */
    @jakarta.annotation.Nonnull
    public static Dimension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Dimension();
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
     * Gets the dimensionKey property value. &lt;b&gt;dimensionKey&lt;/b&gt; defines the basis against which the seller&apos;s customer service metric is measured.  &lt;br&gt;&lt;br&gt;The value of this field gets set according to the value of the &lt;b&gt;customer_service_metric_type&lt;/b&gt; input parameter. The following input configurations return the responses shown: &lt;ul&gt;&lt;li&gt;&lt;code&gt;ITEM_NOT_AS_DESCRIBED&lt;/code&gt; &amp;ndash; Returns benchmark ratings based on L1 listing categories, so the result shows metrics where the &lt;b&gt;dimensionKey&lt;/b&gt; is set to &lt;code&gt;LISTING_CATEGORY&lt;/code&gt;.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;ITEM_NOT_RECEIVED&lt;/code&gt; &amp;ndash; Returns benchmark ratings based on world shipping regions, so the result shows metrics where the &lt;b&gt;dimensionKey&lt;/b&gt; is set to &lt;code&gt;SHIPPING_REGION&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;The shipping region is indicated by the associated &lt;b&gt;value&lt;/b&gt; field. For specifics on world shipping regions, see the FAQ section on the following page: &lt;a href=&quot;https://www.ebay.com/help/selling/selling/monitor-service-metrics?id=4785&quot; title=&quot;eBay Help page&quot; target=&quot;_blank&quot;&gt;Monitor your service metrics&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/api:DimensionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDimensionKey() {
        return this.dimensionKey;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("dimensionKey", (n) -> { this.setDimensionKey(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The dimension name returned in this field depends on the &lt;b&gt;dimensionKey&lt;/b&gt;: &lt;ul&gt;&lt;li&gt;If  &lt;b&gt;dimensionKey&lt;/b&gt; is set to &lt;code&gt;SHIPPING_REGION&lt;/code&gt;, this field is set to one of following values, which represent established shipping corridors: &lt;ul&gt;&lt;li&gt;&lt;code&gt;Domestic&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;International: Mature region&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;International: Emerging region&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;  &lt;li&gt;If &lt;b&gt;dimensionKey&lt;/b&gt; is set to &lt;code&gt;LISTING_CATEGORY&lt;/code&gt;, this field is set to the name of the primary (L1) category in which the items being rated were listed.&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the value property value. The value returned in this field depends on the &lt;b&gt;dimensionKey&lt;/b&gt;.  &lt;br&gt;&lt;br&gt;If &lt;b&gt;dimensionKey&lt;/b&gt; equals &lt;code&gt;LISTING_CATEGORY&lt;/code&gt;, the value returned in this field is the category ID of the primary (L1) category in which the items being rated were listed.  &lt;br&gt;&lt;br&gt;If &lt;b&gt;dimensionKey&lt;/b&gt; equals &lt;code&gt;SHIPPING_REGION&lt;/code&gt;, one of the following values is returned:  &lt;ul&gt;&lt;li&gt;&lt;code&gt;DOMESTIC&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;INTERNATIONAL_MATURED_REGION&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;INTERNATIONAL_EMERGING_REGION&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
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
        writer.writeStringValue("dimensionKey", this.getDimensionKey());
        writer.writeStringValue("name", this.getName());
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
     * Sets the dimensionKey property value. &lt;b&gt;dimensionKey&lt;/b&gt; defines the basis against which the seller&apos;s customer service metric is measured.  &lt;br&gt;&lt;br&gt;The value of this field gets set according to the value of the &lt;b&gt;customer_service_metric_type&lt;/b&gt; input parameter. The following input configurations return the responses shown: &lt;ul&gt;&lt;li&gt;&lt;code&gt;ITEM_NOT_AS_DESCRIBED&lt;/code&gt; &amp;ndash; Returns benchmark ratings based on L1 listing categories, so the result shows metrics where the &lt;b&gt;dimensionKey&lt;/b&gt; is set to &lt;code&gt;LISTING_CATEGORY&lt;/code&gt;.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;ITEM_NOT_RECEIVED&lt;/code&gt; &amp;ndash; Returns benchmark ratings based on world shipping regions, so the result shows metrics where the &lt;b&gt;dimensionKey&lt;/b&gt; is set to &lt;code&gt;SHIPPING_REGION&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;The shipping region is indicated by the associated &lt;b&gt;value&lt;/b&gt; field. For specifics on world shipping regions, see the FAQ section on the following page: &lt;a href=&quot;https://www.ebay.com/help/selling/selling/monitor-service-metrics?id=4785&quot; title=&quot;eBay Help page&quot; target=&quot;_blank&quot;&gt;Monitor your service metrics&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/api:DimensionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the dimensionKey property.
     */
    public void setDimensionKey(@jakarta.annotation.Nullable final String value) {
        this.dimensionKey = value;
    }
    /**
     * Sets the name property value. The dimension name returned in this field depends on the &lt;b&gt;dimensionKey&lt;/b&gt;: &lt;ul&gt;&lt;li&gt;If  &lt;b&gt;dimensionKey&lt;/b&gt; is set to &lt;code&gt;SHIPPING_REGION&lt;/code&gt;, this field is set to one of following values, which represent established shipping corridors: &lt;ul&gt;&lt;li&gt;&lt;code&gt;Domestic&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;International: Mature region&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;International: Emerging region&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;  &lt;li&gt;If &lt;b&gt;dimensionKey&lt;/b&gt; is set to &lt;code&gt;LISTING_CATEGORY&lt;/code&gt;, this field is set to the name of the primary (L1) category in which the items being rated were listed.&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the value property value. The value returned in this field depends on the &lt;b&gt;dimensionKey&lt;/b&gt;.  &lt;br&gt;&lt;br&gt;If &lt;b&gt;dimensionKey&lt;/b&gt; equals &lt;code&gt;LISTING_CATEGORY&lt;/code&gt;, the value returned in this field is the category ID of the primary (L1) category in which the items being rated were listed.  &lt;br&gt;&lt;br&gt;If &lt;b&gt;dimensionKey&lt;/b&gt; equals &lt;code&gt;SHIPPING_REGION&lt;/code&gt;, one of the following values is returned:  &lt;ul&gt;&lt;li&gt;&lt;code&gt;DOMESTIC&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;INTERNATIONAL_MATURED_REGION&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;INTERNATIONAL_EMERGING_REGION&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
