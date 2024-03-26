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
import com.konfigthis.client.model.FieldItem;
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
 * EmployeeField
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeeField {
  public static final String SERIALIZED_NAME_PROFILE_FIELDS = "profileFields";
  @SerializedName(SERIALIZED_NAME_PROFILE_FIELDS)
  private List<FieldItem> profileFields = null;

  public static final String SERIALIZED_NAME_JOB_FIELDS = "jobFields";
  @SerializedName(SERIALIZED_NAME_JOB_FIELDS)
  private List<FieldItem> jobFields = null;

  public EmployeeField() {
  }

  public EmployeeField profileFields(List<FieldItem> profileFields) {
    
    
    
    
    this.profileFields = profileFields;
    return this;
  }

  public EmployeeField addProfileFieldsItem(FieldItem profileFieldsItem) {
    if (this.profileFields == null) {
      this.profileFields = new ArrayList<>();
    }
    this.profileFields.add(profileFieldsItem);
    return this;
  }

   /**
   * Get profileFields
   * @return profileFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FieldItem> getProfileFields() {
    return profileFields;
  }


  public void setProfileFields(List<FieldItem> profileFields) {
    
    
    
    this.profileFields = profileFields;
  }


  public EmployeeField jobFields(List<FieldItem> jobFields) {
    
    
    
    
    this.jobFields = jobFields;
    return this;
  }

  public EmployeeField addJobFieldsItem(FieldItem jobFieldsItem) {
    if (this.jobFields == null) {
      this.jobFields = new ArrayList<>();
    }
    this.jobFields.add(jobFieldsItem);
    return this;
  }

   /**
   * Get jobFields
   * @return jobFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FieldItem> getJobFields() {
    return jobFields;
  }


  public void setJobFields(List<FieldItem> jobFields) {
    
    
    
    this.jobFields = jobFields;
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
   * @return the EmployeeField instance itself
   */
  public EmployeeField putAdditionalProperty(String key, Object value) {
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
    EmployeeField employeeField = (EmployeeField) o;
    return Objects.equals(this.profileFields, employeeField.profileFields) &&
        Objects.equals(this.jobFields, employeeField.jobFields)&&
        Objects.equals(this.additionalProperties, employeeField.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileFields, jobFields, additionalProperties);
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
    sb.append("class EmployeeField {\n");
    sb.append("    profileFields: ").append(toIndentedString(profileFields)).append("\n");
    sb.append("    jobFields: ").append(toIndentedString(jobFields)).append("\n");
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
    openapiFields.add("profileFields");
    openapiFields.add("jobFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeField.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeField is not found in the empty JSON string", EmployeeField.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("profileFields") != null && !jsonObj.get("profileFields").isJsonNull()) {
        JsonArray jsonArrayprofileFields = jsonObj.getAsJsonArray("profileFields");
        if (jsonArrayprofileFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("profileFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `profileFields` to be an array in the JSON string but got `%s`", jsonObj.get("profileFields").toString()));
          }

          // validate the optional field `profileFields` (array)
          for (int i = 0; i < jsonArrayprofileFields.size(); i++) {
            FieldItem.validateJsonObject(jsonArrayprofileFields.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("jobFields") != null && !jsonObj.get("jobFields").isJsonNull()) {
        JsonArray jsonArrayjobFields = jsonObj.getAsJsonArray("jobFields");
        if (jsonArrayjobFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("jobFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `jobFields` to be an array in the JSON string but got `%s`", jsonObj.get("jobFields").toString()));
          }

          // validate the optional field `jobFields` (array)
          for (int i = 0; i < jsonArrayjobFields.size(); i++) {
            FieldItem.validateJsonObject(jsonArrayjobFields.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeField.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeField>() {
           @Override
           public void write(JsonWriter out, EmployeeField value) throws IOException {
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
           public EmployeeField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeField instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeField
  * @throws IOException if the JSON string is invalid with respect to EmployeeField
  */
  public static EmployeeField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeField.class);
  }

 /**
  * Convert an instance of EmployeeField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

