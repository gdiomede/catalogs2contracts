

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
 * Department
 */

// CHECKSTYLE:OFF
public class Department 
// CHECKSTYLE:ON
{
  @JsonProperty("uniqueName")
  private String uniqueName;

  @JsonProperty("name")
  private String name;

  @JsonAnySetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the uniqueName of this {@link Department} instance and return the same instance.
   *
   * @param uniqueName  The uniqueName of this {@link Department}
   * @return The same instance of this {@link Department} class
   */
   @Nonnull public Department uniqueName(@Nonnull final String uniqueName) {
    this.uniqueName = uniqueName;
    return this;
  }

   /**
   * Get uniqueName
   * @return uniqueName  The uniqueName of this {@link Department} instance.
  **/
  @Nonnull public String getUniqueName() {
    return uniqueName;
  }

  /**
  * Set the uniqueName of this {@link Department} instance.
  *
  * @param uniqueName  The uniqueName of this {@link Department}
  */
  public void setUniqueName( @Nonnull final String uniqueName) {
    this.uniqueName = uniqueName;
  }

   /**
   * Set the name of this {@link Department} instance and return the same instance.
   *
   * @param name  The name of this {@link Department}
   * @return The same instance of this {@link Department} class
   */
   @Nonnull public Department name(@Nonnull final String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name  The name of this {@link Department} instance.
  **/
  @Nonnull public String getName() {
    return name;
  }

  /**
  * Set the name of this {@link Department} instance.
  *
  * @param name  The name of this {@link Department}
  */
  public void setName( @Nonnull final String name) {
    this.name = name;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link Department}.
   * @return The set of properties names
   */
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of the {@link Department}.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("Department has no field with name '" + name + "'.");
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
    final Department department = (Department) o;
    return Objects.equals(this.cloudSdkCustomFields, department.cloudSdkCustomFields) &&
        Objects.equals(this.uniqueName, department.uniqueName) &&
        Objects.equals(this.name, department.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueName, name, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class Department {\n");
    sb.append("    uniqueName: ").append(toIndentedString(uniqueName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

