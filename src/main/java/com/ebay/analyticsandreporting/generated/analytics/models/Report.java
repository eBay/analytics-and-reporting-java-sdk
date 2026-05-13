package com.ebay.analyticsandreporting.generated.analytics.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The complex type that defines that defines the report.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Report implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A complex type containing the header of the report and the type of data containted in the rows of the report.
     */
    private java.util.List<Metadata> dimensionMetadata;
    /**
     *   &lt;br&gt;&lt;br&gt;The time stamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Universal Coordinated Time (UTC) clock.  &lt;br&gt;&lt;br&gt;If you specify an end date that is beyond the &lt;a href=&quot;#response.lastUpdatedDate&quot;&gt;lastUpdatedDate&lt;/a&gt; value, eBay returns a report that contains data only up to the lastUpdateDate date. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     */
    private String endDate;
    /**
     * Type that defines the headers for the dimension keys and metrics returned in the report.
     */
    private Header header;
    /**
     * The date and time, in ISO 8601 format, that indicates the last time the data returned in the report was updated.
     */
    private String lastUpdatedDate;
    /**
     * A complex type containing the individual data records for the traffic report.
     */
    private java.util.List<Record> records;
    /**
     * The start date of the date range used to calculate the report, in ISO 8601 format.
     */
    private String startDate;
    /**
     * An array of any process errors or warnings that were generated during the processing of the call processing.
     */
    private java.util.List<Error> warnings;
    /**
     * Instantiates a new {@link Report} and sets the default values.
     */
    public Report() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Report}
     */
    @jakarta.annotation.Nonnull
    public static Report createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Report();
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
     * Gets the dimensionMetadata property value. A complex type containing the header of the report and the type of data containted in the rows of the report.
     * @return a {@link java.util.List<Metadata>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Metadata> getDimensionMetadata() {
        return this.dimensionMetadata;
    }
    /**
     * Gets the endDate property value.   &lt;br&gt;&lt;br&gt;The time stamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Universal Coordinated Time (UTC) clock.  &lt;br&gt;&lt;br&gt;If you specify an end date that is beyond the &lt;a href=&quot;#response.lastUpdatedDate&quot;&gt;lastUpdatedDate&lt;/a&gt; value, eBay returns a report that contains data only up to the lastUpdateDate date. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEndDate() {
        return this.endDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("dimensionMetadata", (n) -> { this.setDimensionMetadata(n.getCollectionOfObjectValues(Metadata::createFromDiscriminatorValue)); });
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getStringValue()); });
        deserializerMap.put("header", (n) -> { this.setHeader(n.getObjectValue(Header::createFromDiscriminatorValue)); });
        deserializerMap.put("lastUpdatedDate", (n) -> { this.setLastUpdatedDate(n.getStringValue()); });
        deserializerMap.put("records", (n) -> { this.setRecords(n.getCollectionOfObjectValues(Record::createFromDiscriminatorValue)); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getStringValue()); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfObjectValues(Error::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the header property value. Type that defines the headers for the dimension keys and metrics returned in the report.
     * @return a {@link Header}
     */
    @jakarta.annotation.Nullable
    public Header getHeader() {
        return this.header;
    }
    /**
     * Gets the lastUpdatedDate property value. The date and time, in ISO 8601 format, that indicates the last time the data returned in the report was updated.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * Gets the records property value. A complex type containing the individual data records for the traffic report.
     * @return a {@link java.util.List<Record>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Record> getRecords() {
        return this.records;
    }
    /**
     * Gets the startDate property value. The start date of the date range used to calculate the report, in ISO 8601 format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStartDate() {
        return this.startDate;
    }
    /**
     * Gets the warnings property value. An array of any process errors or warnings that were generated during the processing of the call processing.
     * @return a {@link java.util.List<Error>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Error> getWarnings() {
        return this.warnings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("dimensionMetadata", this.getDimensionMetadata());
        writer.writeStringValue("endDate", this.getEndDate());
        writer.writeObjectValue("header", this.getHeader());
        writer.writeStringValue("lastUpdatedDate", this.getLastUpdatedDate());
        writer.writeCollectionOfObjectValues("records", this.getRecords());
        writer.writeStringValue("startDate", this.getStartDate());
        writer.writeCollectionOfObjectValues("warnings", this.getWarnings());
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
     * Sets the dimensionMetadata property value. A complex type containing the header of the report and the type of data containted in the rows of the report.
     * @param value Value to set for the dimensionMetadata property.
     */
    public void setDimensionMetadata(@jakarta.annotation.Nullable final java.util.List<Metadata> value) {
        this.dimensionMetadata = value;
    }
    /**
     * Sets the endDate property value.   &lt;br&gt;&lt;br&gt;The time stamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Universal Coordinated Time (UTC) clock.  &lt;br&gt;&lt;br&gt;If you specify an end date that is beyond the &lt;a href=&quot;#response.lastUpdatedDate&quot;&gt;lastUpdatedDate&lt;/a&gt; value, eBay returns a report that contains data only up to the lastUpdateDate date. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     * @param value Value to set for the endDate property.
     */
    public void setEndDate(@jakarta.annotation.Nullable final String value) {
        this.endDate = value;
    }
    /**
     * Sets the header property value. Type that defines the headers for the dimension keys and metrics returned in the report.
     * @param value Value to set for the header property.
     */
    public void setHeader(@jakarta.annotation.Nullable final Header value) {
        this.header = value;
    }
    /**
     * Sets the lastUpdatedDate property value. The date and time, in ISO 8601 format, that indicates the last time the data returned in the report was updated.
     * @param value Value to set for the lastUpdatedDate property.
     */
    public void setLastUpdatedDate(@jakarta.annotation.Nullable final String value) {
        this.lastUpdatedDate = value;
    }
    /**
     * Sets the records property value. A complex type containing the individual data records for the traffic report.
     * @param value Value to set for the records property.
     */
    public void setRecords(@jakarta.annotation.Nullable final java.util.List<Record> value) {
        this.records = value;
    }
    /**
     * Sets the startDate property value. The start date of the date range used to calculate the report, in ISO 8601 format.
     * @param value Value to set for the startDate property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final String value) {
        this.startDate = value;
    }
    /**
     * Sets the warnings property value. An array of any process errors or warnings that were generated during the processing of the call processing.
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final java.util.List<Error> value) {
        this.warnings = value;
    }
}
