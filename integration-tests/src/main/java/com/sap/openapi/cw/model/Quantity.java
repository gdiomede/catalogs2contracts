

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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Quantity
 */

// CHECKSTYLE:OFF
public class Quantity 
// CHECKSTYLE:ON
{
  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("unitOfMeasureName")
  private String unitOfMeasureName;

  @JsonProperty("unitOfMeasureCode")
  private String unitOfMeasureCode;

  @JsonAnySetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the amount of this {@link Quantity} instance and return the same instance.
   *
   * @param amount  The amount of this {@link Quantity}
   * @return The same instance of this {@link Quantity} class
   */
   @Nonnull public Quantity amount(@Nonnull final BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount  The amount of this {@link Quantity} instance.
  **/
  @Nonnull public BigDecimal getAmount() {
    return amount;
  }

  /**
  * Set the amount of this {@link Quantity} instance.
  *
  * @param amount  The amount of this {@link Quantity}
  */
  public void setAmount( @Nonnull final BigDecimal amount) {
    this.amount = amount;
  }

   /**
   * Set the unitOfMeasureName of this {@link Quantity} instance and return the same instance.
   *
   * @param unitOfMeasureName  The unitOfMeasureName of this {@link Quantity}
   * @return The same instance of this {@link Quantity} class
   */
   @Nonnull public Quantity unitOfMeasureName(@Nonnull final String unitOfMeasureName) {
    this.unitOfMeasureName = unitOfMeasureName;
    return this;
  }

   /**
   * Get unitOfMeasureName
   * @return unitOfMeasureName  The unitOfMeasureName of this {@link Quantity} instance.
  **/
  @Nonnull public String getUnitOfMeasureName() {
    return unitOfMeasureName;
  }

  /**
  * Set the unitOfMeasureName of this {@link Quantity} instance.
  *
  * @param unitOfMeasureName  The unitOfMeasureName of this {@link Quantity}
  */
  public void setUnitOfMeasureName( @Nonnull final String unitOfMeasureName) {
    this.unitOfMeasureName = unitOfMeasureName;
  }

   /**
   * Set the unitOfMeasureCode of this {@link Quantity} instance and return the same instance.
   *
   * @param unitOfMeasureCode  The unitOfMeasureCode of this {@link Quantity}
   * @return The same instance of this {@link Quantity} class
   */
   @Nonnull public Quantity unitOfMeasureCode(@Nonnull final String unitOfMeasureCode) {
    this.unitOfMeasureCode = unitOfMeasureCode;
    return this;
  }

   /**
   * Get unitOfMeasureCode
   * @return unitOfMeasureCode  The unitOfMeasureCode of this {@link Quantity} instance.
  **/
  @Nonnull public String getUnitOfMeasureCode() {
    return unitOfMeasureCode;
  }

  /**
  * Set the unitOfMeasureCode of this {@link Quantity} instance.
  *
  * @param unitOfMeasureCode  The unitOfMeasureCode of this {@link Quantity}
  */
  public void setUnitOfMeasureCode( @Nonnull final String unitOfMeasureCode) {
    this.unitOfMeasureCode = unitOfMeasureCode;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link Quantity}.
   * @return The set of properties names
   */
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of the {@link Quantity}.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("Quantity has no field with name '" + name + "'.");
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
    final Quantity quantity = (Quantity) o;
    return Objects.equals(this.cloudSdkCustomFields, quantity.cloudSdkCustomFields) &&
        Objects.equals(this.amount, quantity.amount) &&
        Objects.equals(this.unitOfMeasureName, quantity.unitOfMeasureName) &&
        Objects.equals(this.unitOfMeasureCode, quantity.unitOfMeasureCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, unitOfMeasureName, unitOfMeasureCode, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class Quantity {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    unitOfMeasureName: ").append(toIndentedString(unitOfMeasureName)).append("\n");
    sb.append("    unitOfMeasureCode: ").append(toIndentedString(unitOfMeasureCode)).append("\n");
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
