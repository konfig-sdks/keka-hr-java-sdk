/*
 * Requisition
 * Here's our story,  It all began with the frustration of using software that sucks. Prior to starting Keka, our core team was a 100 person business that needed an easy to use software for managing employees. We looked everywhere and all we found were software that was lousy and hard to use. We felt SME businesses in India deserved something better. Something awesome actually!  Thus emerged Keka!
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.LeaveTypeStats;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * class represents response.
 */
@ApiModel(description = "class represents response.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LeaveTypeStatsListResponse {
  public static final String SERIALIZED_NAME_SUCCEEDED = "succeeded";
  @SerializedName(SERIALIZED_NAME_SUCCEEDED)
  private Boolean succeeded;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<String> errors = null;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<LeaveTypeStats> data = null;

  public LeaveTypeStatsListResponse() {
  }

  public LeaveTypeStatsListResponse succeeded(Boolean succeeded) {
    
    
    
    
    this.succeeded = succeeded;
    return this;
  }

   /**
   * Gets or sets a value indicating whether this Keka.API.Web.Core.Response&#x60;1 is succeeded.
   * @return succeeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets a value indicating whether this Keka.API.Web.Core.Response`1 is succeeded.")

  public Boolean getSucceeded() {
    return succeeded;
  }


  public void setSucceeded(Boolean succeeded) {
    
    
    
    this.succeeded = succeeded;
  }


  public LeaveTypeStatsListResponse message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * Gets or sets the message.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the message.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
  }


  public LeaveTypeStatsListResponse errors(List<String> errors) {
    
    
    
    
    this.errors = errors;
    return this;
  }

  public LeaveTypeStatsListResponse addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Gets or sets the errors.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the errors.")

  public List<String> getErrors() {
    return errors;
  }


  public void setErrors(List<String> errors) {
    
    
    
    this.errors = errors;
  }


  public LeaveTypeStatsListResponse data(List<LeaveTypeStats> data) {
    
    
    
    
    this.data = data;
    return this;
  }

  public LeaveTypeStatsListResponse addDataItem(LeaveTypeStats dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Gets or sets the data.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the data.")

  public List<LeaveTypeStats> getData() {
    return data;
  }


  public void setData(List<LeaveTypeStats> data) {
    
    
    
    this.data = data;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the LeaveTypeStatsListResponse instance itself
   */
  public LeaveTypeStatsListResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveTypeStatsListResponse leaveTypeStatsListResponse = (LeaveTypeStatsListResponse) o;
    return Objects.equals(this.succeeded, leaveTypeStatsListResponse.succeeded) &&
        Objects.equals(this.message, leaveTypeStatsListResponse.message) &&
        Objects.equals(this.errors, leaveTypeStatsListResponse.errors) &&
        Objects.equals(this.data, leaveTypeStatsListResponse.data)&&
        Objects.equals(this.additionalProperties, leaveTypeStatsListResponse.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(succeeded, message, errors, data, additionalProperties);
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
    sb.append("class LeaveTypeStatsListResponse {\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("succeeded");
    openapiFields.add("message");
    openapiFields.add("errors");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LeaveTypeStatsListResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LeaveTypeStatsListResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LeaveTypeStatsListResponse is not found in the empty JSON string", LeaveTypeStatsListResponse.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("message").isJsonNull() && (jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // ensure the optional json data is an array if present (nullable)
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull() && !jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string or null but got `%s`", jsonObj.get("errors").toString()));
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            LeaveTypeStats.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LeaveTypeStatsListResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LeaveTypeStatsListResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LeaveTypeStatsListResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LeaveTypeStatsListResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<LeaveTypeStatsListResponse>() {
           @Override
           public void write(JsonWriter out, LeaveTypeStatsListResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public LeaveTypeStatsListResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LeaveTypeStatsListResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LeaveTypeStatsListResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LeaveTypeStatsListResponse
  * @throws IOException if the JSON string is invalid with respect to LeaveTypeStatsListResponse
  */
  public static LeaveTypeStatsListResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LeaveTypeStatsListResponse.class);
  }

 /**
  * Convert an instance of LeaveTypeStatsListResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
