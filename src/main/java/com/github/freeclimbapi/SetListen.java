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
import com.github.freeclimbapi.AddToConference;
import com.github.freeclimbapi.CreateConference;
import com.github.freeclimbapi.Dequeue;
import com.github.freeclimbapi.Enqueue;
import com.github.freeclimbapi.GetDigits;
import com.github.freeclimbapi.GetSpeech;
import com.github.freeclimbapi.Hangup;
import com.github.freeclimbapi.OutDial;
import com.github.freeclimbapi.Park;
import com.github.freeclimbapi.Pause;
import com.github.freeclimbapi.PerclCommand;
import com.github.freeclimbapi.Play;
import com.github.freeclimbapi.PlayEarlyMedia;
import com.github.freeclimbapi.RecordUtterance;
import com.github.freeclimbapi.Redirect;
import com.github.freeclimbapi.Reject;
import com.github.freeclimbapi.RemoveFromConference;
import com.github.freeclimbapi.Say;
import com.github.freeclimbapi.SendDigits;
import com.github.freeclimbapi.SetListen;
import com.github.freeclimbapi.SetListenAllOf;
import com.github.freeclimbapi.SetTalk;
import com.github.freeclimbapi.Sms;
import com.github.freeclimbapi.StartRecordCall;
import com.github.freeclimbapi.TerminateConference;
import com.github.freeclimbapi.Unpark;
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
 * The &#x60;SetListen&#x60; command enables or disables the listen privilege for a Conference Participant provided both calls are in the same conference. The Participant can hear what the other participants are saying only if this privilege is enabled.
 */
@ApiModel(description = "The `SetListen` command enables or disables the listen privilege for a Conference Participant provided both calls are in the same conference. The Participant can hear what the other participants are saying only if this privilege is enabled.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SetListen extends PerclCommand {
  public static final String SERIALIZED_NAME_CALL_ID = "callId";
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  private String callId;

  public static final String SERIALIZED_NAME_LISTEN = "listen";
  @SerializedName(SERIALIZED_NAME_LISTEN)
  private Boolean listen;

  public SetListen() { 
    this.command = this.getClass().getSimpleName();
  }

  public SetListen callId(String callId) {
    
    this.callId = callId;
    return this;
  }

   /**
   * ID of the call leg that is to be assigned the listen privilege. The Call must be in a Conference or an error will be triggered.
   * @return callId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID of the call leg that is to be assigned the listen privilege. The Call must be in a Conference or an error will be triggered.")

  public String getCallId() {
    return callId;
  }


  public void setCallId(String callId) {
    this.callId = callId;
  }


  public SetListen listen(Boolean listen) {
    
    this.listen = listen;
    return this;
  }

   /**
   * Specifying &#x60;false&#x60; will silence the Conference for this Participant.
   * @return listen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifying `false` will silence the Conference for this Participant.")

  public Boolean getListen() {
    return listen;
  }


  public void setListen(Boolean listen) {
    this.listen = listen;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetListen setListen = (SetListen) o;
    return Objects.equals(this.callId, setListen.callId) &&
        Objects.equals(this.listen, setListen.listen) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callId, listen, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetListen {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    listen: ").append(toIndentedString(listen)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public Map<String, Callable<Object>> attributeTypeMap() {
    Map<String, Callable<Object>> attributes = new HashMap();
    attributes.put("callId", () -> this.getCallId());
    attributes.put("listen", () -> this.getListen());
    return attributes;
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

