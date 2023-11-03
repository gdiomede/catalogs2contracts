

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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Address
 */

// CHECKSTYLE:OFF
public class Address 
// CHECKSTYLE:ON
{
  @JsonProperty("name")
  private String name;

  @JsonProperty("uniqueName")
  private String uniqueName;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("fax")
  private String fax;

  @JsonProperty("lines")
  private List<String> lines = new ArrayList<>();

  @JsonProperty("city")
  private String city;

  @JsonProperty("state")
  private String state;

  @JsonProperty("postalCode")
  private String postalCode;

  @JsonProperty("country")
  private String country;

  @JsonAnySetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the name of this {@link Address} instance and return the same instance.
   *
   * @param name  The name of this {@link Address}
   * @return The same instance of this {@link Address} class
   */
   @Nonnull public Address name(@Nonnull final String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name  The name of this {@link Address} instance.
  **/
  @Nonnull public String getName() {
    return name;
  }

  /**
  * Set the name of this {@link Address} instance.
  *
  * @param name  The name of this {@link Address}
  */
  public void setName( @Nonnull final String name) {
    this.name = name;
  }

   /**
   * Set the uniqueName of this {@link Address} instance and return the same instance.
   *
   * @param uniqueName  The uniqueName of this {@link Address}
   * @return The same instance of this {@link Address} class
   */
   @Nonnull public Address uniqueName(@Nonnull final String uniqueName) {
    this.uniqueName = uniqueName;
    return this;
  }

   /**
   * Get uniqueName
   * @return uniqueName  The uniqueName of this {@link Address} instance.
  **/
  @Nonnull public String getUniqueName() {
    return uniqueName;
  }

  /**
  * Set the uniqueName of this {@link Address} instance.
  *
  * @param uniqueName  The uniqueName of this {@link Address}
  */
  public void setUniqueName( @Nonnull final String uniqueName) {
    this.uniqueName = uniqueName;
  }

   /**
   * Set the phone of this {@link Address} instance and return the same instance.
   *
   * @param phone  The phone of this {@link Address}
   * @return The same instance of this {@link Address} class
   */
   @Nonnull public Address phone(@Nonnull final String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone  The phone of this {@link Address} instance.
  **/
  @Nonnull public String getPhone() {
    return phone;
  }

  /**
  * Set the phone of this {@link Address} instance.
  *
  * @param phone  The phone of this {@link Address}
  */
  public void setPhone( @Nonnull final String phone) {
    this.phone = phone;
  }

   /**
   * Set the fax of this {@link Address} instance and return the same instance.
   *
   * @param fax  The fax of this {@link Address}
   * @return The same instance of this {@link Address} class
   */
   @Nonnull public Address fax(@Nonnull final String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax  The fax of this {@link Address} instance.
  **/
  @Nonnull public String getFax() {
    return fax;
  }

  /**
  * Set the fax of this {@link Address} instance.
  *
  * @param fax  The fax of this {@link Address}
  */
  public void setFax( @Nonnull final String fax) {
    this.fax = fax;
  }

   /**
   * Set the lines of this {@link Address} instance and return the same instance.
   *
   * @param lines  The lines of this {@link Address}
   * @return The same instance of this {@link Address} class
   */
   @Nonnull public Address lines(@Nonnull final List<String> lines) {
    this.lines = lines;
    return this;
  }
  /**
  * Add one Lines instance to this {@link Address}.
  * @param linesItem The Lines that should be added
  * @return The same instance of type {@link Address}
  */
  @Nonnull public Address addLinesItem( @Nonnull final String linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines  The lines of this {@link Address} instance.
  **/
  @Nonnull public List<String> getLines() {
    return lines;
  }

  /**
  * Set the lines of this {@link Address} instance.
  *
  * @param lines  The lines of this {@link Address}
  */
  public void setLines( @Nonnull final List<String> lines) {
    this.lines = lines;
  }

   /**
   * Set the city of this {@link Address} instance and return the same instance.
   *
   * @param city  The city of this {@link Address}
   * @return The same instance of this {@link Address} class
   */
   @Nonnull public Address city(@Nonnull final String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city  The city of this {@link Address} instance.
  **/
  @Nonnull public String getCity() {
    return city;
  }

  /**
  * Set the city of this {@link Address} instance.
  *
  * @param city  The city of this {@link Address}
  */
  public void setCity( @Nonnull final String city) {
    this.city = city;
  }

   /**
   * Set the state of this {@link Address} instance and return the same instance.
   *
   * @param state  The state of this {@link Address}
   * @return The same instance of this {@link Address} class
   */
   @Nonnull public Address state(@Nonnull final String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state  The state of this {@link Address} instance.
  **/
  @Nonnull public String getState() {
    return state;
  }

  /**
  * Set the state of this {@link Address} instance.
  *
  * @param state  The state of this {@link Address}
  */
  public void setState( @Nonnull final String state) {
    this.state = state;
  }

   /**
   * Set the postalCode of this {@link Address} instance and return the same instance.
   *
   * @param postalCode  The postalCode of this {@link Address}
   * @return The same instance of this {@link Address} class
   */
   @Nonnull public Address postalCode(@Nonnull final String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode  The postalCode of this {@link Address} instance.
  **/
  @Nonnull public String getPostalCode() {
    return postalCode;
  }

  /**
  * Set the postalCode of this {@link Address} instance.
  *
  * @param postalCode  The postalCode of this {@link Address}
  */
  public void setPostalCode( @Nonnull final String postalCode) {
    this.postalCode = postalCode;
  }

   /**
   * Set the country of this {@link Address} instance and return the same instance.
   *
   * @param country  The country of this {@link Address}
   * @return The same instance of this {@link Address} class
   */
   @Nonnull public Address country(@Nonnull final String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country  The country of this {@link Address} instance.
  **/
  @Nonnull public String getCountry() {
    return country;
  }

  /**
  * Set the country of this {@link Address} instance.
  *
  * @param country  The country of this {@link Address}
  */
  public void setCountry( @Nonnull final String country) {
    this.country = country;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link Address}.
   * @return The set of properties names
   */
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of the {@link Address}.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("Address has no field with name '" + name + "'.");
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
    final Address address = (Address) o;
    return Objects.equals(this.cloudSdkCustomFields, address.cloudSdkCustomFields) &&
        Objects.equals(this.name, address.name) &&
        Objects.equals(this.uniqueName, address.uniqueName) &&
        Objects.equals(this.phone, address.phone) &&
        Objects.equals(this.fax, address.fax) &&
        Objects.equals(this.lines, address.lines) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.country, address.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uniqueName, phone, fax, lines, city, state, postalCode, country, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uniqueName: ").append(toIndentedString(uniqueName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

