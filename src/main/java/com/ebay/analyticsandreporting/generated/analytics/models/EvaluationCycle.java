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
 * This complex type describes the start and end dates of the of the time period over which the associated benchmark is computed.  &lt;br&gt;&lt;br&gt;All timestamps are based on Mountain Standard Time (MST).  &lt;br&gt;&lt;br&gt;The timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EvaluationCycle implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * End date and time of the transaction lookback range. All timestamps are based on Mountain Standard Time (MST).  &lt;br&gt;&lt;br&gt;The timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.
     */
    private String endDate;
    /**
     * The ISO-8601 date and time at which the seller was evaluated for this customer service metric rating.
     */
    private String evaluationDate;
    /**
     * This field specifies the transaction &lt;i&gt;lookback period&lt;/i&gt; used for the evaluation. &lt;br&gt;&lt;br&gt;The &lt;b&gt;evaluation_type&lt;/b&gt; value specified in the request is returned in this field. There are two possible values:  &lt;ul&gt;&lt;li&gt;&lt;code&gt;CURRENT&lt;/code&gt; &amp;ndash; A monthly evaluation that occurs on the 20th of every month.&lt;/li&gt; &lt;li&gt;&lt;code&gt;PROJECTED&lt;/code&gt; &amp;ndash; A daily evaluation that provides a projection of how the seller is currently performing with regards to the upcoming evaluation period.&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/api:EvaluationTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String evaluationType;
    /**
     * The start date and time of the transaction lookback range. All timestamps are based on Mountain Standard Time (MST).  &lt;br&gt;&lt;br&gt;The timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-04T07:09:00.000Z&lt;/code&gt;
     */
    private String startDate;
    /**
     * Instantiates a new {@link EvaluationCycle} and sets the default values.
     */
    public EvaluationCycle() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EvaluationCycle}
     */
    @jakarta.annotation.Nonnull
    public static EvaluationCycle createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluationCycle();
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
     * Gets the endDate property value. End date and time of the transaction lookback range. All timestamps are based on Mountain Standard Time (MST).  &lt;br&gt;&lt;br&gt;The timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEndDate() {
        return this.endDate;
    }
    /**
     * Gets the evaluationDate property value. The ISO-8601 date and time at which the seller was evaluated for this customer service metric rating.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEvaluationDate() {
        return this.evaluationDate;
    }
    /**
     * Gets the evaluationType property value. This field specifies the transaction &lt;i&gt;lookback period&lt;/i&gt; used for the evaluation. &lt;br&gt;&lt;br&gt;The &lt;b&gt;evaluation_type&lt;/b&gt; value specified in the request is returned in this field. There are two possible values:  &lt;ul&gt;&lt;li&gt;&lt;code&gt;CURRENT&lt;/code&gt; &amp;ndash; A monthly evaluation that occurs on the 20th of every month.&lt;/li&gt; &lt;li&gt;&lt;code&gt;PROJECTED&lt;/code&gt; &amp;ndash; A daily evaluation that provides a projection of how the seller is currently performing with regards to the upcoming evaluation period.&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/api:EvaluationTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEvaluationType() {
        return this.evaluationType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getStringValue()); });
        deserializerMap.put("evaluationDate", (n) -> { this.setEvaluationDate(n.getStringValue()); });
        deserializerMap.put("evaluationType", (n) -> { this.setEvaluationType(n.getStringValue()); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the startDate property value. The start date and time of the transaction lookback range. All timestamps are based on Mountain Standard Time (MST).  &lt;br&gt;&lt;br&gt;The timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-04T07:09:00.000Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStartDate() {
        return this.startDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("endDate", this.getEndDate());
        writer.writeStringValue("evaluationDate", this.getEvaluationDate());
        writer.writeStringValue("evaluationType", this.getEvaluationType());
        writer.writeStringValue("startDate", this.getStartDate());
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
     * Sets the endDate property value. End date and time of the transaction lookback range. All timestamps are based on Mountain Standard Time (MST).  &lt;br&gt;&lt;br&gt;The timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.
     * @param value Value to set for the endDate property.
     */
    public void setEndDate(@jakarta.annotation.Nullable final String value) {
        this.endDate = value;
    }
    /**
     * Sets the evaluationDate property value. The ISO-8601 date and time at which the seller was evaluated for this customer service metric rating.
     * @param value Value to set for the evaluationDate property.
     */
    public void setEvaluationDate(@jakarta.annotation.Nullable final String value) {
        this.evaluationDate = value;
    }
    /**
     * Sets the evaluationType property value. This field specifies the transaction &lt;i&gt;lookback period&lt;/i&gt; used for the evaluation. &lt;br&gt;&lt;br&gt;The &lt;b&gt;evaluation_type&lt;/b&gt; value specified in the request is returned in this field. There are two possible values:  &lt;ul&gt;&lt;li&gt;&lt;code&gt;CURRENT&lt;/code&gt; &amp;ndash; A monthly evaluation that occurs on the 20th of every month.&lt;/li&gt; &lt;li&gt;&lt;code&gt;PROJECTED&lt;/code&gt; &amp;ndash; A daily evaluation that provides a projection of how the seller is currently performing with regards to the upcoming evaluation period.&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/analytics/types/api:EvaluationTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the evaluationType property.
     */
    public void setEvaluationType(@jakarta.annotation.Nullable final String value) {
        this.evaluationType = value;
    }
    /**
     * Sets the startDate property value. The start date and time of the transaction lookback range. All timestamps are based on Mountain Standard Time (MST).  &lt;br&gt;&lt;br&gt;The timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-04T07:09:00.000Z&lt;/code&gt;
     * @param value Value to set for the startDate property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final String value) {
        this.startDate = value;
    }
}
