

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
 * Error1
 */

// CHECKSTYLE:OFF
public class Error1 
// CHECKSTYLE:ON
{
  @JsonProperty("errorCode")
  private String errorCode;

  @JsonProperty("message")
  private String message;

  @JsonAnySetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the errorCode of this {@link Error1} instance and return the same instance.
   *
   * @param errorCode  The errorCode of this {@link Error1}
   * @return The same instance of this {@link Error1} class
   */
   @Nonnull public Error1 errorCode(@Nonnull final String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode  The errorCode of this {@link Error1} instance.
  **/
  @Nonnull public String getErrorCode() {
    return errorCode;
  }

  /**
  * Set the errorCode of this {@link Error1} instance.
  *
  * @param errorCode  The errorCode of this {@link Error1}
  */
  public void setErrorCode( @Nonnull final String errorCode) {
    this.errorCode = errorCode;
  }

   /**
   * Set the message of this {@link Error1} instance and return the same instance.
   *
   * @param message  The message of this {@link Error1}
   * @return The same instance of this {@link Error1} class
   */
   @Nonnull public Error1 message(@Nonnull final String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message  The message of this {@link Error1} instance.
  **/
  @Nonnull public String getMessage() {
    return message;
  }

  /**
  * Set the message of this {@link Error1} instance.
  *
  * @param message  The message of this {@link Error1}
  */
  public void setMessage( @Nonnull final String message) {
    this.message = message;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link Error1}.
   * @return The set of properties names
   */
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of the {@link Error1}.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("Error1 has no field with name '" + name + "'.");
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
    final Error1 error1 = (Error1) o;
    return Objects.equals(this.cloudSdkCustomFields, error1.cloudSdkCustomFields) &&
        Objects.equals(this.errorCode, error1.errorCode) &&
        Objects.equals(this.message, error1.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class Error1 {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
