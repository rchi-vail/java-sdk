/*
 * FreeClimb API
 * FreeClimb is a cloud-based application programming interface (API) that puts the power of the Vail platform in your hands. FreeClimb simplifies the process of creating applications that can use a full range of telephony features without requiring specialized or on-site telephony equipment. Using the FreeClimb REST API to write applications is easy! You have the option to use the language of your choice or hit the API directly. Your application can execute a command by issuing a RESTful request to the FreeClimb API. The base URL to send HTTP requests to the FreeClimb REST API is: /apiserver. FreeClimb authenticates and processes your request.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@freeclimb.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.freeclimbapi;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * AccountResultAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountResultAllOf {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_API_KEY = "apiKey";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  /**
   * The type of this account. It is one of: trial or full.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TRIAL("trial"),
    
    FULL("full");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * The status of this account. It is one of: active, suspended, or closed.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    SUSPENDED("suspended"),
    
    CLOSED("closed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_SUBRESOURCE_URIS = "subresourceUris";
  @SerializedName(SERIALIZED_NAME_SUBRESOURCE_URIS)
  private Object subresourceUris;

  public AccountResultAllOf() { 
  }

  public AccountResultAllOf accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * String that uniquely identifies this account resource.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "String that uniquely identifies this account resource.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AccountResultAllOf apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * The API key assigned to this account. This key must be kept a secret by the customer.
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The API key assigned to this account. This key must be kept a secret by the customer.")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public AccountResultAllOf alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * A description for this account.
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this account.")

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public AccountResultAllOf label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * A string that identifies a category or group to which the account belongs.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string that identifies a category or group to which the account belongs.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public AccountResultAllOf type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of this account. It is one of: trial or full.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of this account. It is one of: trial or full.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public AccountResultAllOf status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of this account. It is one of: active, suspended, or closed.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of this account. It is one of: active, suspended, or closed.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public AccountResultAllOf subresourceUris(Object subresourceUris) {
    
    this.subresourceUris = subresourceUris;
    return this;
  }

   /**
   * The list of subresources for this account.
   * @return subresourceUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of subresources for this account.")

  public Object getSubresourceUris() {
    return subresourceUris;
  }


  public void setSubresourceUris(Object subresourceUris) {
    this.subresourceUris = subresourceUris;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountResultAllOf accountResultAllOf = (AccountResultAllOf) o;
    return Objects.equals(this.accountId, accountResultAllOf.accountId) &&
        Objects.equals(this.apiKey, accountResultAllOf.apiKey) &&
        Objects.equals(this.alias, accountResultAllOf.alias) &&
        Objects.equals(this.label, accountResultAllOf.label) &&
        Objects.equals(this.type, accountResultAllOf.type) &&
        Objects.equals(this.status, accountResultAllOf.status) &&
        Objects.equals(this.subresourceUris, accountResultAllOf.subresourceUris);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, apiKey, alias, label, type, status, subresourceUris);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountResultAllOf {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subresourceUris: ").append(toIndentedString(subresourceUris)).append("\n");
    sb.append("}");
    return sb.toString();
  }


  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

