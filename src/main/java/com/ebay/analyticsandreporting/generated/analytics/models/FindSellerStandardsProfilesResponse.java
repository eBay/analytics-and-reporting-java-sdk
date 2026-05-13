package com.ebay.analyticsandreporting.generated.analytics.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The response container for a list of seller profiles.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FindSellerStandardsProfilesResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of the seller&apos;s standards profiles.  &lt;br&gt;&lt;br&gt;A &quot;standards profile&quot; is a set of eBay seller standards categories and the values related to the associated seller.  &lt;br&gt;&lt;br&gt;Profiles are distinguished by a combination of cycle and program values. The &quot;program&quot; value specifies the region to which the data is from. The &quot;cycle&quot; value specifies whether the values were determined just now, or if the values are from the last official eBay seller standards evaluation.
     */
    private java.util.List<StandardsProfile> standardsProfiles;
    /**
     * Instantiates a new {@link FindSellerStandardsProfilesResponse} and sets the default values.
     */
    public FindSellerStandardsProfilesResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FindSellerStandardsProfilesResponse}
     */
    @jakarta.annotation.Nonnull
    public static FindSellerStandardsProfilesResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FindSellerStandardsProfilesResponse();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("standardsProfiles", (n) -> { this.setStandardsProfiles(n.getCollectionOfObjectValues(StandardsProfile::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the standardsProfiles property value. A list of the seller&apos;s standards profiles.  &lt;br&gt;&lt;br&gt;A &quot;standards profile&quot; is a set of eBay seller standards categories and the values related to the associated seller.  &lt;br&gt;&lt;br&gt;Profiles are distinguished by a combination of cycle and program values. The &quot;program&quot; value specifies the region to which the data is from. The &quot;cycle&quot; value specifies whether the values were determined just now, or if the values are from the last official eBay seller standards evaluation.
     * @return a {@link java.util.List<StandardsProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<StandardsProfile> getStandardsProfiles() {
        return this.standardsProfiles;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("standardsProfiles", this.getStandardsProfiles());
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
     * Sets the standardsProfiles property value. A list of the seller&apos;s standards profiles.  &lt;br&gt;&lt;br&gt;A &quot;standards profile&quot; is a set of eBay seller standards categories and the values related to the associated seller.  &lt;br&gt;&lt;br&gt;Profiles are distinguished by a combination of cycle and program values. The &quot;program&quot; value specifies the region to which the data is from. The &quot;cycle&quot; value specifies whether the values were determined just now, or if the values are from the last official eBay seller standards evaluation.
     * @param value Value to set for the standardsProfiles property.
     */
    public void setStandardsProfiles(@jakarta.annotation.Nullable final java.util.List<StandardsProfile> value) {
        this.standardsProfiles = value;
    }
}
