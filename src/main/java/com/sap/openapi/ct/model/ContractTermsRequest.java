

/*
 * Contract Terms Management API
 * This Contract Terms Management allows a client application to : - create a contract term in the specified contract workspace and a contract request for the corresponding compliance contract in the specified buyer realm. The API creates the Contract Terms Document in the specified contract workspace and then, calls the Compliance Contract Request API using the Contract Terms Document ID  and the buyer realm name as input. If the Compliance Contract Request Object is successfully created, then the API returns the ACC Contract Request ID to the client; otherwise, it sends an error message to the client. - retrieve details including contract term ID, contract request ID and contract ID for the specified contract workspace ID. The response contains the contract terms document details like title, owner, status etc and the compliance contract request details like Contract Request ID (CRID), Contract ID (CID), etc. associated with the contract workspace. - synchronize the contract line item information of a contract workspace with the linked compliance contract by specifying the IDs of the contract workspace and the compliance contract. If the request is successful, the API initiates an asynchronous job and returns the job ID for reference.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.openapi.ct.model;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * ContractTermsRequest
 */

// CHECKSTYLE:OFF
public class ContractTermsRequest 
// CHECKSTYLE:ON
{
  @JsonProperty("sspRealm")
  private String sspRealm;

  @JsonAnySetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the sspRealm of this {@link ContractTermsRequest} instance and return the same instance.
   *
   * @param sspRealm  SSP Realm Name
   * @return The same instance of this {@link ContractTermsRequest} class
   */
   @Nonnull public ContractTermsRequest sspRealm(@Nonnull final String sspRealm) {
    this.sspRealm = sspRealm;
    return this;
  }

   /**
   * SSP Realm Name
   * @return sspRealm  The sspRealm of this {@link ContractTermsRequest} instance.
  **/
  @Nonnull public String getSspRealm() {
    return sspRealm;
  }

  /**
  * Set the sspRealm of this {@link ContractTermsRequest} instance.
  *
  * @param sspRealm  SSP Realm Name
  */
  public void setSspRealm( @Nonnull final String sspRealm) {
    this.sspRealm = sspRealm;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link ContractTermsRequest}.
   * @return The set of properties names
   */
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of the {@link ContractTermsRequest}.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("ContractTermsRequest has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  @Override
  public boolean equals(@Nullable final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final ContractTermsRequest contractTermsRequest = (ContractTermsRequest) o;
    return Objects.equals(this.cloudSdkCustomFields, contractTermsRequest.cloudSdkCustomFields) &&
        Objects.equals(this.sspRealm, contractTermsRequest.sspRealm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sspRealm, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class ContractTermsRequest {\n");
    sb.append("    sspRealm: ").append(toIndentedString(sspRealm)).append("\n");
    cloudSdkCustomFields.forEach((k,v) -> sb.append("    ").append(k).append(": ").append(toIndentedString(v)).append("\n"));
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(final java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
