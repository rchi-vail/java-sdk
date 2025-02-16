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

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * CreateConferenceAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateConferenceAllOf {
  public static final String SERIALIZED_NAME_ACTION_URL = "actionUrl";
  @SerializedName(SERIALIZED_NAME_ACTION_URL)
  private String actionUrl;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private Boolean alias;

  public static final String SERIALIZED_NAME_PLAY_BEEP = "playBeep";
  @SerializedName(SERIALIZED_NAME_PLAY_BEEP)
  private String playBeep;

  public static final String SERIALIZED_NAME_RECORD = "record";
  @SerializedName(SERIALIZED_NAME_RECORD)
  private Boolean record;

  public static final String SERIALIZED_NAME_STATUS_CALLBACK_URL = "statusCallbackUrl";
  @SerializedName(SERIALIZED_NAME_STATUS_CALLBACK_URL)
  private Boolean statusCallbackUrl;

  public static final String SERIALIZED_NAME_WAIT_URL = "waitUrl";
  @SerializedName(SERIALIZED_NAME_WAIT_URL)
  private String waitUrl;

  public CreateConferenceAllOf() { 
  }

  public CreateConferenceAllOf actionUrl(String actionUrl) {
    
    this.actionUrl = actionUrl;
    return this;
  }

   /**
   *  This URL is invoked once the Conference is successfully created. Actions on the Conference, such as adding Participants, can be performed via the PerCL script returned in the response. 
   * @return actionUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = " This URL is invoked once the Conference is successfully created. Actions on the Conference, such as adding Participants, can be performed via the PerCL script returned in the response. ")

  public String getActionUrl() {
    return actionUrl;
  }


  public void setActionUrl(String actionUrl) {
    this.actionUrl = actionUrl;
  }


  public CreateConferenceAllOf alias(Boolean alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Descriptive name for the Conference. 
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Descriptive name for the Conference. ")

  public Boolean getAlias() {
    return alias;
  }


  public void setAlias(Boolean alias) {
    this.alias = alias;
  }


  public CreateConferenceAllOf playBeep(String playBeep) {
    
    this.playBeep = playBeep;
    return this;
  }

   /**
   * Indicates whether to play a beep when a Participant enters or leaves the Conference. either &#x60;always&#x60;, &#x60;never&#x60;, &#x60;entryOnly&#x60;, or &#x60;exitOnly&#x60;. Leaving this unset will make conference default to &#x60;always&#x60; 
   * @return playBeep
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether to play a beep when a Participant enters or leaves the Conference. either `always`, `never`, `entryOnly`, or `exitOnly`. Leaving this unset will make conference default to `always` ")

  public String getPlayBeep() {
    return playBeep;
  }


  public void setPlayBeep(String playBeep) {
    this.playBeep = playBeep;
  }


  public CreateConferenceAllOf record(Boolean record) {
    
    this.record = record;
    return this;
  }

   /**
   * When set to &#x60;true&#x60;, the entire Conference is recorded. The &#x60;statusCallbackUrl&#x60; of the Conference will receive a &#x60;conferenceRecordingEnded&#x60; Webhook when the Conference transitions from the &#x60;inProgress&#x60; to empty state.
   * @return record
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When set to `true`, the entire Conference is recorded. The `statusCallbackUrl` of the Conference will receive a `conferenceRecordingEnded` Webhook when the Conference transitions from the `inProgress` to empty state.")

  public Boolean getRecord() {
    return record;
  }


  public void setRecord(Boolean record) {
    this.record = record;
  }


  public CreateConferenceAllOf statusCallbackUrl(Boolean statusCallbackUrl) {
    
    this.statusCallbackUrl = statusCallbackUrl;
    return this;
  }

   /**
   * This URL is invoked when the status of the Conference changes or when a recording of the Conference has become available.
   * @return statusCallbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This URL is invoked when the status of the Conference changes or when a recording of the Conference has become available.")

  public Boolean getStatusCallbackUrl() {
    return statusCallbackUrl;
  }


  public void setStatusCallbackUrl(Boolean statusCallbackUrl) {
    this.statusCallbackUrl = statusCallbackUrl;
  }


  public CreateConferenceAllOf waitUrl(String waitUrl) {
    
    this.waitUrl = waitUrl;
    return this;
  }

   /**
   * If specified, this URL provides the custom hold music for the Conference when it is in the populated state. This attribute is always fetched using HTTP GET and is fetched just once – when the Conference is created. The URL must be an audio file that is reachable and readable by FreeClimb.
   * @return waitUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, this URL provides the custom hold music for the Conference when it is in the populated state. This attribute is always fetched using HTTP GET and is fetched just once – when the Conference is created. The URL must be an audio file that is reachable and readable by FreeClimb.")

  public String getWaitUrl() {
    return waitUrl;
  }


  public void setWaitUrl(String waitUrl) {
    this.waitUrl = waitUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConferenceAllOf createConferenceAllOf = (CreateConferenceAllOf) o;
    return Objects.equals(this.actionUrl, createConferenceAllOf.actionUrl) &&
        Objects.equals(this.alias, createConferenceAllOf.alias) &&
        Objects.equals(this.playBeep, createConferenceAllOf.playBeep) &&
        Objects.equals(this.record, createConferenceAllOf.record) &&
        Objects.equals(this.statusCallbackUrl, createConferenceAllOf.statusCallbackUrl) &&
        Objects.equals(this.waitUrl, createConferenceAllOf.waitUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionUrl, alias, playBeep, record, statusCallbackUrl, waitUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConferenceAllOf {\n");
    sb.append("    actionUrl: ").append(toIndentedString(actionUrl)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    playBeep: ").append(toIndentedString(playBeep)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    statusCallbackUrl: ").append(toIndentedString(statusCallbackUrl)).append("\n");
    sb.append("    waitUrl: ").append(toIndentedString(waitUrl)).append("\n");
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

