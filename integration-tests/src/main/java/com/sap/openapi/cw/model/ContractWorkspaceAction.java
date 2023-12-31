

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
import com.sap.openapi.cw.model.AmendAttributes;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * ContractWorkspaceAction
 */

// CHECKSTYLE:OFF
public class ContractWorkspaceAction 
// CHECKSTYLE:ON
{
  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    /**
    * The AMEND option of this ContractWorkspaceAction
    */
    AMEND("amend"),
    
    /**
    * The COMPLETEAMENDMENT option of this ContractWorkspaceAction
    */
    COMPLETEAMENDMENT("completeAmendment"),
    
    /**
    * The PUTONHOLD option of this ContractWorkspaceAction
    */
    PUTONHOLD("putOnHold"),
    
    /**
    * The RESUME option of this ContractWorkspaceAction
    */
    RESUME("resume"),
    
    /**
    * The CLOSE option of this ContractWorkspaceAction
    */
    CLOSE("close");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    /**
    * Get the value of the enum
    * @return The enum value
    */
    @JsonValue
    @Nonnull public String getValue() {
      return value;
    }

    /**
    * Get the String value of the enum value.
    * @return The enum value as String
    */
    @Override
    @Nonnull public String toString() {
      return String.valueOf(value);
    }

    /**
    * Get the enum value from a String value
    * @param value The String value
    * @return The enum value of type ContractWorkspaceAction
    */
    @JsonCreator
    @Nonnull public static ActionEnum fromValue(@Nonnull final String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("action")
  private ActionEnum action;

  @JsonProperty("amendAttributes")
  private AmendAttributes amendAttributes;

  @JsonAnySetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the action of this {@link ContractWorkspaceAction} instance and return the same instance.
   *
   * @param action  The action of this {@link ContractWorkspaceAction}
   * @return The same instance of this {@link ContractWorkspaceAction} class
   */
   @Nonnull public ContractWorkspaceAction action(@Nonnull final ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action  The action of this {@link ContractWorkspaceAction} instance.
  **/
  @Nonnull public ActionEnum getAction() {
    return action;
  }

  /**
  * Set the action of this {@link ContractWorkspaceAction} instance.
  *
  * @param action  The action of this {@link ContractWorkspaceAction}
  */
  public void setAction( @Nonnull final ActionEnum action) {
    this.action = action;
  }

   /**
   * Set the amendAttributes of this {@link ContractWorkspaceAction} instance and return the same instance.
   *
   * @param amendAttributes  The amendAttributes of this {@link ContractWorkspaceAction}
   * @return The same instance of this {@link ContractWorkspaceAction} class
   */
   @Nonnull public ContractWorkspaceAction amendAttributes(@Nonnull final AmendAttributes amendAttributes) {
    this.amendAttributes = amendAttributes;
    return this;
  }

   /**
   * Get amendAttributes
   * @return amendAttributes  The amendAttributes of this {@link ContractWorkspaceAction} instance.
  **/
  @Nonnull public AmendAttributes getAmendAttributes() {
    return amendAttributes;
  }

  /**
  * Set the amendAttributes of this {@link ContractWorkspaceAction} instance.
  *
  * @param amendAttributes  The amendAttributes of this {@link ContractWorkspaceAction}
  */
  public void setAmendAttributes( @Nonnull final AmendAttributes amendAttributes) {
    this.amendAttributes = amendAttributes;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link ContractWorkspaceAction}.
   * @return The set of properties names
   */
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of the {@link ContractWorkspaceAction}.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("ContractWorkspaceAction has no field with name '" + name + "'.");
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
    final ContractWorkspaceAction contractWorkspaceAction = (ContractWorkspaceAction) o;
    return Objects.equals(this.cloudSdkCustomFields, contractWorkspaceAction.cloudSdkCustomFields) &&
        Objects.equals(this.action, contractWorkspaceAction.action) &&
        Objects.equals(this.amendAttributes, contractWorkspaceAction.amendAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, amendAttributes, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class ContractWorkspaceAction {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    amendAttributes: ").append(toIndentedString(amendAttributes)).append("\n");
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

