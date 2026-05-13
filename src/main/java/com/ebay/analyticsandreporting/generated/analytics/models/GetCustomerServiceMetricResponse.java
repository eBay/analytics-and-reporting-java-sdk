package com.ebay.analyticsandreporting.generated.analytics.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This complex data type defines the response data that is returned from a request to &lt;b&gt;getCustomerServiceMetric&lt;/b&gt;.  &lt;br&gt;&lt;br&gt;The &lt;b&gt;dimensionMetrics&lt;/b&gt; object contains the details of the dimension being measured and the calculated customer service metric values. &lt;br&gt;&lt;br&gt;The &lt;b&gt;evaluationCycle&lt;/b&gt; defines the period used to calculate the metric values.  &lt;br&gt;&lt;br&gt;The &lt;b&gt;marketplaceId&lt;/b&gt; is the eBay marketplace for which the metrics are being considered.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetCustomerServiceMetricResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container provides a seller&apos;s customer service &lt;b&gt;metric&lt;/b&gt; performance for a given &lt;b&gt;dimension&lt;/b&gt;.  &lt;br&gt;&lt;br&gt;In the &lt;b&gt;getCustomerServiceMetric&lt;/b&gt; request, specify values for the following request parameters to control the returned dimension and the associated metric values: &lt;ul&gt;&lt;li&gt; &lt;b&gt;customer_service_metric_type&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;evaluation_type&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;evaluation_marketplace_id&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private java.util.List<DimensionMetric> dimensionMetrics;
    /**
     * This complex type describes the start and end dates of the of the time period over which the associated benchmark is computed.  &lt;br&gt;&lt;br&gt;All timestamps are based on Mountain Standard Time (MST).  &lt;br&gt;&lt;br&gt;The timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.
     */
    private EvaluationCycle evaluationCycle;
    /**
     * The eBay marketplace ID of the marketplace upon which the customer service metric evaluation is based.  &lt;br&gt;&lt;br&gt;The &lt;b&gt;customer_service_metric&lt;/b&gt; resource supports a limited set of marketplaces. For a complete list of the supported marketplaces, please see the &lt;a href=&quot;https://www.ebay.com/help/policies/selling-policies/seller-performance-policy/service-metrics-policy?id=4769#section2&quot; title=&quot;eBay Help pages&quot;&gt;Service metrics policy&lt;/a&gt; page. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/bas:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String marketplaceId;
    /**
     * Instantiates a new {@link GetCustomerServiceMetricResponse} and sets the default values.
     */
    public GetCustomerServiceMetricResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetCustomerServiceMetricResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetCustomerServiceMetricResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetCustomerServiceMetricResponse();
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
     * Gets the dimensionMetrics property value. This container provides a seller&apos;s customer service &lt;b&gt;metric&lt;/b&gt; performance for a given &lt;b&gt;dimension&lt;/b&gt;.  &lt;br&gt;&lt;br&gt;In the &lt;b&gt;getCustomerServiceMetric&lt;/b&gt; request, specify values for the following request parameters to control the returned dimension and the associated metric values: &lt;ul&gt;&lt;li&gt; &lt;b&gt;customer_service_metric_type&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;evaluation_type&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;evaluation_marketplace_id&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link java.util.List<DimensionMetric>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DimensionMetric> getDimensionMetrics() {
        return this.dimensionMetrics;
    }
    /**
     * Gets the evaluationCycle property value. This complex type describes the start and end dates of the of the time period over which the associated benchmark is computed.  &lt;br&gt;&lt;br&gt;All timestamps are based on Mountain Standard Time (MST).  &lt;br&gt;&lt;br&gt;The timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.
     * @return a {@link EvaluationCycle}
     */
    @jakarta.annotation.Nullable
    public EvaluationCycle getEvaluationCycle() {
        return this.evaluationCycle;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("dimensionMetrics", (n) -> { this.setDimensionMetrics(n.getCollectionOfObjectValues(DimensionMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("evaluationCycle", (n) -> { this.setEvaluationCycle(n.getObjectValue(EvaluationCycle::createFromDiscriminatorValue)); });
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the marketplaceId property value. The eBay marketplace ID of the marketplace upon which the customer service metric evaluation is based.  &lt;br&gt;&lt;br&gt;The &lt;b&gt;customer_service_metric&lt;/b&gt; resource supports a limited set of marketplaces. For a complete list of the supported marketplaces, please see the &lt;a href=&quot;https://www.ebay.com/help/policies/selling-policies/seller-performance-policy/service-metrics-policy?id=4769#section2&quot; title=&quot;eBay Help pages&quot;&gt;Service metrics policy&lt;/a&gt; page. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/bas:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("dimensionMetrics", this.getDimensionMetrics());
        writer.writeObjectValue("evaluationCycle", this.getEvaluationCycle());
        writer.writeStringValue("marketplaceId", this.getMarketplaceId());
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
     * Sets the dimensionMetrics property value. This container provides a seller&apos;s customer service &lt;b&gt;metric&lt;/b&gt; performance for a given &lt;b&gt;dimension&lt;/b&gt;.  &lt;br&gt;&lt;br&gt;In the &lt;b&gt;getCustomerServiceMetric&lt;/b&gt; request, specify values for the following request parameters to control the returned dimension and the associated metric values: &lt;ul&gt;&lt;li&gt; &lt;b&gt;customer_service_metric_type&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;evaluation_type&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;evaluation_marketplace_id&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the dimensionMetrics property.
     */
    public void setDimensionMetrics(@jakarta.annotation.Nullable final java.util.List<DimensionMetric> value) {
        this.dimensionMetrics = value;
    }
    /**
     * Sets the evaluationCycle property value. This complex type describes the start and end dates of the of the time period over which the associated benchmark is computed.  &lt;br&gt;&lt;br&gt;All timestamps are based on Mountain Standard Time (MST).  &lt;br&gt;&lt;br&gt;The timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.
     * @param value Value to set for the evaluationCycle property.
     */
    public void setEvaluationCycle(@jakarta.annotation.Nullable final EvaluationCycle value) {
        this.evaluationCycle = value;
    }
    /**
     * Sets the marketplaceId property value. The eBay marketplace ID of the marketplace upon which the customer service metric evaluation is based.  &lt;br&gt;&lt;br&gt;The &lt;b&gt;customer_service_metric&lt;/b&gt; resource supports a limited set of marketplaces. For a complete list of the supported marketplaces, please see the &lt;a href=&quot;https://www.ebay.com/help/policies/selling-policies/seller-performance-policy/service-metrics-policy?id=4769#section2&quot; title=&quot;eBay Help pages&quot;&gt;Service metrics policy&lt;/a&gt; page. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/bas:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final String value) {
        this.marketplaceId = value;
    }
}
