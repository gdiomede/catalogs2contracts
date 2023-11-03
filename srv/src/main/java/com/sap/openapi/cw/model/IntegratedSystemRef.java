

/*
 * Contract Workspace Modification API
 * This Contract Workspace API allows a client application to : -Create the Contract workspace using Ariba TemplateID -Update the Contract workspace using ContractID -Change the state of the contract workspace, identified by the ContractID, to amend or complete amendment. -Deletes the Contract workspace procurement using ContractID
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.openapi.cw.model;

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
 * IntegratedSystemRef
 */

// CHECKSTYLE:OFF
public class IntegratedSystemRef 
// CHECKSTYLE:ON
{
  @JsonProperty("integratedSystemName")
  private String integratedSystemName;

  @JsonProperty("integratedSystemID")
  private String integratedSystemID;

  @JsonProperty("status")
  private String status;

  @JsonProperty("type")
  private String type;

  @JsonProperty("urlData")
  private String urlData;

  @JsonAnySetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the integratedSystemName of this {@link IntegratedSystemRef} instance and return the same instance.
   *
   * @param integratedSystemName  The integratedSystemName of this {@link IntegratedSystemRef}
   * @return The same instance of this {@link IntegratedSystemRef} class
   */
   @Nonnull public IntegratedSystemRef integratedSystemName(@Nonnull final String integratedSystemName) {
    this.integratedSystemName = integratedSystemName;
    return this;
  }

   /**
   * Get integratedSystemName
   * @return integratedSystemName  The integratedSystemName of this {@link IntegratedSystemRef} instance.
  **/
  @Nonnull public String getIntegratedSystemName() {
    return integratedSystemName;
  }

  /**
  * Set the integratedSystemName of this {@link IntegratedSystemRef} instance.
  *
  * @param integratedSystemName  The integratedSystemName of this {@link IntegratedSystemRef}
  */
  public void setIntegratedSystemName( @Nonnull final String integratedSystemName) {
    this.integratedSystemName = integratedSystemName;
  }

   /**
   * Set the integratedSystemID of this {@link IntegratedSystemRef} instance and return the same instance.
   *
   * @param integratedSystemID  The integratedSystemID of this {@link IntegratedSystemRef}
   * @return The same instance of this {@link IntegratedSystemRef} class
   */
   @Nonnull public IntegratedSystemRef integratedSystemID(@Nonnull final String integratedSystemID) {
    this.integratedSystemID = integratedSystemID;
    return this;
  }

   /**
   * Get integratedSystemID
   * @return integratedSystemID  The integratedSystemID of this {@link IntegratedSystemRef} instance.
  **/
  @Nonnull public String getIntegratedSystemID() {
    return integratedSystemID;
  }

  /**
  * Set the integratedSystemID of this {@link IntegratedSystemRef} instance.
  *
  * @param integratedSystemID  The integratedSystemID of this {@link IntegratedSystemRef}
  */
  public void setIntegratedSystemID( @Nonnull final String integratedSystemID) {
    this.integratedSystemID = integratedSystemID;
  }

   /**
   * Set the status of this {@link IntegratedSystemRef} instance and return the same instance.
   *
   * @param status  The status of this {@link IntegratedSystemRef}
   * @return The same instance of this {@link IntegratedSystemRef} class
   */
   @Nonnull public IntegratedSystemRef status(@Nonnull final String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status  The status of this {@link IntegratedSystemRef} instance.
  **/
  @Nonnull public String getStatus() {
    return status;
  }

  /**
  * Set the status of this {@link IntegratedSystemRef} instance.
  *
  * @param status  The status of this {@link IntegratedSystemRef}
  */
  public void setStatus( @Nonnull final String status) {
    this.status = status;
  }

   /**
   * Set the type of this {@link IntegratedSystemRef} instance and return the same instance.
   *
   * @param type  The type of this {@link IntegratedSystemRef}
   * @return The same instance of this {@link IntegratedSystemRef} class
   */
   @Nonnull public IntegratedSystemRef type(@Nonnull final String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type  The type of this {@link IntegratedSystemRef} instance.
  **/
  @Nonnull public String getType() {
    return type;
  }

  /**
  * Set the type of this {@link IntegratedSystemRef} instance.
  *
  * @param type  The type of this {@link IntegratedSystemRef}
  */
  public void setType( @Nonnull final String type) {
    this.type = type;
  }

   /**
   * Set the urlData of this {@link IntegratedSystemRef} instance and return the same instance.
   *
   * @param urlData  The urlData of this {@link IntegratedSystemRef}
   * @return The same instance of this {@link IntegratedSystemRef} class
   */
   @Nonnull public IntegratedSystemRef urlData(@Nonnull final String urlData) {
    this.urlData = urlData;
    return this;
  }

   /**
   * Get urlData
   * @return urlData  The urlData of this {@link IntegratedSystemRef} instance.
  **/
  @Nonnull public String getUrlData() {
    return urlData;
  }

  /**
  * Set the urlData of this {@link IntegratedSystemRef} instance.
  *
  * @param urlData  The urlData of this {@link IntegratedSystemRef}
  */
  public void setUrlData( @Nonnull final String urlData) {
    this.urlData = urlData;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link IntegratedSystemRef}.
   * @return The set of properties names
   */
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of the {@link IntegratedSystemRef}.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("IntegratedSystemRef has no field with name '" + name + "'.");
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
    final IntegratedSystemRef integratedSystemRef = (IntegratedSystemRef) o;
    return Objects.equals(this.cloudSdkCustomFields, integratedSystemRef.cloudSdkCustomFields) &&
        Objects.equals(this.integratedSystemName, integratedSystemRef.integratedSystemName) &&
        Objects.equals(this.integratedSystemID, integratedSystemRef.integratedSystemID) &&
        Objects.equals(this.status, integratedSystemRef.status) &&
        Objects.equals(this.type, integratedSystemRef.type) &&
        Objects.equals(this.urlData, integratedSystemRef.urlData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integratedSystemName, integratedSystemID, status, type, urlData, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class IntegratedSystemRef {\n");
    sb.append("    integratedSystemName: ").append(toIndentedString(integratedSystemName)).append("\n");
    sb.append("    integratedSystemID: ").append(toIndentedString(integratedSystemID)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    urlData: ").append(toIndentedString(urlData)).append("\n");
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
