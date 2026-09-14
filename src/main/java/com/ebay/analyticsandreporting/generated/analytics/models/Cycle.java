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
 * A complex type that specifies the profile&apos;s evaluation cycle (&lt;code&gt;CURRENT&lt;/code&gt; or &lt;code&gt;PROJECTED&lt;/code&gt;), the date the evaluation was calculated, and  the month to which the evaluation pertains.  &lt;br&gt;&lt;br&gt;Each program has at least one cycle, but a program can include both cycle types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Cycle implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The cycle type, either &lt;code&gt;CURRENT&lt;/code&gt; or &lt;code&gt;PROJECTED&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;code&gt;CURRENT&lt;/code&gt; means the profile&apos;s metrics values are from the most recent official eBay  monthly standards evaluation. &lt;code&gt;PROJECTED&lt;/code&gt; means the profile values were determined when the profile was requested.
     */
    private CycleTypeEnum cycleType;
    /**
     * The date and time at which the standard compliance values were determined for the profile.  &lt;br&gt;&lt;br&gt;The time stamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-04T07:09:00.000Z&lt;/code&gt;
     */
    private String evaluationDate;
    /**
     * The month in which the currently effective seller level was computed.  &lt;br&gt;&lt;br&gt;The value is always formatted as &lt;code&gt;YYYY-MM&lt;/code&gt;. If the cycle is &lt;code&gt;CURRENT&lt;/code&gt;, this value is the month and year the of the last eBay compliance evaluation. If this is for a &lt;code&gt;PROJECTED&lt;/code&gt; cycle, the value is the month and year of the next scheduled evaluation. Because eBay does official evaluations around the 20th of each month, a &lt;code&gt;PROJECTED&lt;/code&gt; value may indicate either the current or the next month.
     */
    private String evaluationMonth;
    /**
     * Instantiates a new {@link Cycle} and sets the default values.
     */
    public Cycle() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Cycle}
     */
    @jakarta.annotation.Nonnull
    public static Cycle createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Cycle();
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
     * Gets the cycleType property value. The cycle type, either &lt;code&gt;CURRENT&lt;/code&gt; or &lt;code&gt;PROJECTED&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;code&gt;CURRENT&lt;/code&gt; means the profile&apos;s metrics values are from the most recent official eBay  monthly standards evaluation. &lt;code&gt;PROJECTED&lt;/code&gt; means the profile values were determined when the profile was requested.
     * @return a {@link CycleTypeEnum}
     */
    @jakarta.annotation.Nullable
    public CycleTypeEnum getCycleType() {
        return this.cycleType;
    }
    /**
     * Gets the evaluationDate property value. The date and time at which the standard compliance values were determined for the profile.  &lt;br&gt;&lt;br&gt;The time stamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-04T07:09:00.000Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEvaluationDate() {
        return this.evaluationDate;
    }
    /**
     * Gets the evaluationMonth property value. The month in which the currently effective seller level was computed.  &lt;br&gt;&lt;br&gt;The value is always formatted as &lt;code&gt;YYYY-MM&lt;/code&gt;. If the cycle is &lt;code&gt;CURRENT&lt;/code&gt;, this value is the month and year the of the last eBay compliance evaluation. If this is for a &lt;code&gt;PROJECTED&lt;/code&gt; cycle, the value is the month and year of the next scheduled evaluation. Because eBay does official evaluations around the 20th of each month, a &lt;code&gt;PROJECTED&lt;/code&gt; value may indicate either the current or the next month.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEvaluationMonth() {
        return this.evaluationMonth;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("cycleType", (n) -> { this.setCycleType(n.getEnumValue(CycleTypeEnum::forValue)); });
        deserializerMap.put("evaluationDate", (n) -> { this.setEvaluationDate(n.getStringValue()); });
        deserializerMap.put("evaluationMonth", (n) -> { this.setEvaluationMonth(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("cycleType", this.getCycleType());
        writer.writeStringValue("evaluationDate", this.getEvaluationDate());
        writer.writeStringValue("evaluationMonth", this.getEvaluationMonth());
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
     * Sets the cycleType property value. The cycle type, either &lt;code&gt;CURRENT&lt;/code&gt; or &lt;code&gt;PROJECTED&lt;/code&gt;. &lt;br&gt;&lt;br&gt;&lt;code&gt;CURRENT&lt;/code&gt; means the profile&apos;s metrics values are from the most recent official eBay  monthly standards evaluation. &lt;code&gt;PROJECTED&lt;/code&gt; means the profile values were determined when the profile was requested.
     * @param value Value to set for the cycleType property.
     */
    public void setCycleType(@jakarta.annotation.Nullable final CycleTypeEnum value) {
        this.cycleType = value;
    }
    /**
     * Sets the evaluationDate property value. The date and time at which the standard compliance values were determined for the profile.  &lt;br&gt;&lt;br&gt;The time stamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Universal Coordinated Time (UTC) clock. &lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2018-08-04T07:09:00.000Z&lt;/code&gt;
     * @param value Value to set for the evaluationDate property.
     */
    public void setEvaluationDate(@jakarta.annotation.Nullable final String value) {
        this.evaluationDate = value;
    }
    /**
     * Sets the evaluationMonth property value. The month in which the currently effective seller level was computed.  &lt;br&gt;&lt;br&gt;The value is always formatted as &lt;code&gt;YYYY-MM&lt;/code&gt;. If the cycle is &lt;code&gt;CURRENT&lt;/code&gt;, this value is the month and year the of the last eBay compliance evaluation. If this is for a &lt;code&gt;PROJECTED&lt;/code&gt; cycle, the value is the month and year of the next scheduled evaluation. Because eBay does official evaluations around the 20th of each month, a &lt;code&gt;PROJECTED&lt;/code&gt; value may indicate either the current or the next month.
     * @param value Value to set for the evaluationMonth property.
     */
    public void setEvaluationMonth(@jakarta.annotation.Nullable final String value) {
        this.evaluationMonth = value;
    }
}
