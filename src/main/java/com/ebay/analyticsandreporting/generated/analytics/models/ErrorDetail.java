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
 * An instance of an error or warning as defined by the COS/ETS error handling standard.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ErrorDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The error&apos;s type, with allowed values APPLICATION, BUSINESS, or REQUEST
     */
    private String category;
    /**
     * The domain your service/application is in
     */
    private String domain;
    /**
     * uniquely identifying the error within its Domain.
     */
    private Long errorId;
    /**
     * Identifies specific request elements associated with the error, if any. inputRefId&apos;s response is format specific. For XML, use XPath notation. For JSON, use JSONPath notation.
     */
    private java.util.List<String> inputRefIds;
    /**
     * An expanded version of message that SHOULD be limited to about 100-200 characters.
     */
    private String longMessage;
    /**
     * A device agnostic message that is end user and app developer friendly. It should explain what the error or warning is, and how it can be fixed (in a general sense). The value MUST be limited to 50 or fewer characters. If applicable, it must also be localized in the end user&apos;s requested locale. Refer to Section 6, Error Message Content and Localization.
     */
    private String message;
    /**
     * Identifies specific response elements associated with the error, if any. Path format is the same as inputRefId.
     */
    private java.util.List<String> outputRefIds;
    /**
     * Used to specify information relevant to the end user/client.
     */
    private java.util.List<ErrorParameter> parameters;
    /**
     * Name of the subsystem or subdivision of the domain
     */
    private String subdomain;
    /**
     * Instantiates a new {@link ErrorDetail} and sets the default values.
     */
    public ErrorDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ErrorDetail}
     */
    @jakarta.annotation.Nonnull
    public static ErrorDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ErrorDetail();
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
     * Gets the category property value. The error&apos;s type, with allowed values APPLICATION, BUSINESS, or REQUEST
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.category;
    }
    /**
     * Gets the domain property value. The domain your service/application is in
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomain() {
        return this.domain;
    }
    /**
     * Gets the errorId property value. uniquely identifying the error within its Domain.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getErrorId() {
        return this.errorId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("domain", (n) -> { this.setDomain(n.getStringValue()); });
        deserializerMap.put("errorId", (n) -> { this.setErrorId(n.getLongValue()); });
        deserializerMap.put("inputRefIds", (n) -> { this.setInputRefIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("longMessage", (n) -> { this.setLongMessage(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("outputRefIds", (n) -> { this.setOutputRefIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("parameters", (n) -> { this.setParameters(n.getCollectionOfObjectValues(ErrorParameter::createFromDiscriminatorValue)); });
        deserializerMap.put("subdomain", (n) -> { this.setSubdomain(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inputRefIds property value. Identifies specific request elements associated with the error, if any. inputRefId&apos;s response is format specific. For XML, use XPath notation. For JSON, use JSONPath notation.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getInputRefIds() {
        return this.inputRefIds;
    }
    /**
     * Gets the longMessage property value. An expanded version of message that SHOULD be limited to about 100-200 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLongMessage() {
        return this.longMessage;
    }
    /**
     * Gets the message property value. A device agnostic message that is end user and app developer friendly. It should explain what the error or warning is, and how it can be fixed (in a general sense). The value MUST be limited to 50 or fewer characters. If applicable, it must also be localized in the end user&apos;s requested locale. Refer to Section 6, Error Message Content and Localization.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the outputRefIds property value. Identifies specific response elements associated with the error, if any. Path format is the same as inputRefId.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOutputRefIds() {
        return this.outputRefIds;
    }
    /**
     * Gets the parameters property value. Used to specify information relevant to the end user/client.
     * @return a {@link java.util.List<ErrorParameter>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ErrorParameter> getParameters() {
        return this.parameters;
    }
    /**
     * Gets the subdomain property value. Name of the subsystem or subdivision of the domain
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubdomain() {
        return this.subdomain;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("domain", this.getDomain());
        writer.writeLongValue("errorId", this.getErrorId());
        writer.writeCollectionOfPrimitiveValues("inputRefIds", this.getInputRefIds());
        writer.writeStringValue("longMessage", this.getLongMessage());
        writer.writeStringValue("message", this.getMessage());
        writer.writeCollectionOfPrimitiveValues("outputRefIds", this.getOutputRefIds());
        writer.writeCollectionOfObjectValues("parameters", this.getParameters());
        writer.writeStringValue("subdomain", this.getSubdomain());
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
     * Sets the category property value. The error&apos;s type, with allowed values APPLICATION, BUSINESS, or REQUEST
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.category = value;
    }
    /**
     * Sets the domain property value. The domain your service/application is in
     * @param value Value to set for the domain property.
     */
    public void setDomain(@jakarta.annotation.Nullable final String value) {
        this.domain = value;
    }
    /**
     * Sets the errorId property value. uniquely identifying the error within its Domain.
     * @param value Value to set for the errorId property.
     */
    public void setErrorId(@jakarta.annotation.Nullable final Long value) {
        this.errorId = value;
    }
    /**
     * Sets the inputRefIds property value. Identifies specific request elements associated with the error, if any. inputRefId&apos;s response is format specific. For XML, use XPath notation. For JSON, use JSONPath notation.
     * @param value Value to set for the inputRefIds property.
     */
    public void setInputRefIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.inputRefIds = value;
    }
    /**
     * Sets the longMessage property value. An expanded version of message that SHOULD be limited to about 100-200 characters.
     * @param value Value to set for the longMessage property.
     */
    public void setLongMessage(@jakarta.annotation.Nullable final String value) {
        this.longMessage = value;
    }
    /**
     * Sets the message property value. A device agnostic message that is end user and app developer friendly. It should explain what the error or warning is, and how it can be fixed (in a general sense). The value MUST be limited to 50 or fewer characters. If applicable, it must also be localized in the end user&apos;s requested locale. Refer to Section 6, Error Message Content and Localization.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the outputRefIds property value. Identifies specific response elements associated with the error, if any. Path format is the same as inputRefId.
     * @param value Value to set for the outputRefIds property.
     */
    public void setOutputRefIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.outputRefIds = value;
    }
    /**
     * Sets the parameters property value. Used to specify information relevant to the end user/client.
     * @param value Value to set for the parameters property.
     */
    public void setParameters(@jakarta.annotation.Nullable final java.util.List<ErrorParameter> value) {
        this.parameters = value;
    }
    /**
     * Sets the subdomain property value. Name of the subsystem or subdivision of the domain
     * @param value Value to set for the subdomain property.
     */
    public void setSubdomain(@jakarta.annotation.Nullable final String value) {
        this.subdomain = value;
    }
}
