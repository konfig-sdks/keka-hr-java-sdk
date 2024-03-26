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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * ScorecardSectionDTO
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ScorecardSectionDTO {
  public static final String SERIALIZED_NAME_SECTION_NAME = "sectionName";
  @SerializedName(SERIALIZED_NAME_SECTION_NAME)
  private String sectionName;

  public static final String SERIALIZED_NAME_SKILL_TITLE = "skillTitle";
  @SerializedName(SERIALIZED_NAME_SKILL_TITLE)
  private String skillTitle;

  public static final String SERIALIZED_NAME_SKILL_SCORE = "skillScore";
  @SerializedName(SERIALIZED_NAME_SKILL_SCORE)
  private String skillScore;

  public static final String SERIALIZED_NAME_SECTION_COMMENTS = "sectionComments";
  @SerializedName(SERIALIZED_NAME_SECTION_COMMENTS)
  private String sectionComments;

  public ScorecardSectionDTO() {
  }

  public ScorecardSectionDTO sectionName(String sectionName) {
    
    
    
    
    this.sectionName = sectionName;
    return this;
  }

   /**
   * Get sectionName
   * @return sectionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSectionName() {
    return sectionName;
  }


  public void setSectionName(String sectionName) {
    
    
    
    this.sectionName = sectionName;
  }


  public ScorecardSectionDTO skillTitle(String skillTitle) {
    
    
    
    
    this.skillTitle = skillTitle;
    return this;
  }

   /**
   * Get skillTitle
   * @return skillTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSkillTitle() {
    return skillTitle;
  }


  public void setSkillTitle(String skillTitle) {
    
    
    
    this.skillTitle = skillTitle;
  }


  public ScorecardSectionDTO skillScore(String skillScore) {
    
    
    
    
    this.skillScore = skillScore;
    return this;
  }

   /**
   * Get skillScore
   * @return skillScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSkillScore() {
    return skillScore;
  }


  public void setSkillScore(String skillScore) {
    
    
    
    this.skillScore = skillScore;
  }


  public ScorecardSectionDTO sectionComments(String sectionComments) {
    
    
    
    
    this.sectionComments = sectionComments;
    return this;
  }

   /**
   * Get sectionComments
   * @return sectionComments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSectionComments() {
    return sectionComments;
  }


  public void setSectionComments(String sectionComments) {
    
    
    
    this.sectionComments = sectionComments;
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
   * @return the ScorecardSectionDTO instance itself
   */
  public ScorecardSectionDTO putAdditionalProperty(String key, Object value) {
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
    ScorecardSectionDTO scorecardSectionDTO = (ScorecardSectionDTO) o;
    return Objects.equals(this.sectionName, scorecardSectionDTO.sectionName) &&
        Objects.equals(this.skillTitle, scorecardSectionDTO.skillTitle) &&
        Objects.equals(this.skillScore, scorecardSectionDTO.skillScore) &&
        Objects.equals(this.sectionComments, scorecardSectionDTO.sectionComments)&&
        Objects.equals(this.additionalProperties, scorecardSectionDTO.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sectionName, skillTitle, skillScore, sectionComments, additionalProperties);
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
    sb.append("class ScorecardSectionDTO {\n");
    sb.append("    sectionName: ").append(toIndentedString(sectionName)).append("\n");
    sb.append("    skillTitle: ").append(toIndentedString(skillTitle)).append("\n");
    sb.append("    skillScore: ").append(toIndentedString(skillScore)).append("\n");
    sb.append("    sectionComments: ").append(toIndentedString(sectionComments)).append("\n");
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
    openapiFields.add("sectionName");
    openapiFields.add("skillTitle");
    openapiFields.add("skillScore");
    openapiFields.add("sectionComments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ScorecardSectionDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ScorecardSectionDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScorecardSectionDTO is not found in the empty JSON string", ScorecardSectionDTO.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("sectionName").isJsonNull() && (jsonObj.get("sectionName") != null && !jsonObj.get("sectionName").isJsonNull()) && !jsonObj.get("sectionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sectionName").toString()));
      }
      if (!jsonObj.get("skillTitle").isJsonNull() && (jsonObj.get("skillTitle") != null && !jsonObj.get("skillTitle").isJsonNull()) && !jsonObj.get("skillTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skillTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skillTitle").toString()));
      }
      if (!jsonObj.get("skillScore").isJsonNull() && (jsonObj.get("skillScore") != null && !jsonObj.get("skillScore").isJsonNull()) && !jsonObj.get("skillScore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skillScore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skillScore").toString()));
      }
      if (!jsonObj.get("sectionComments").isJsonNull() && (jsonObj.get("sectionComments") != null && !jsonObj.get("sectionComments").isJsonNull()) && !jsonObj.get("sectionComments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionComments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sectionComments").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScorecardSectionDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScorecardSectionDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScorecardSectionDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScorecardSectionDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<ScorecardSectionDTO>() {
           @Override
           public void write(JsonWriter out, ScorecardSectionDTO value) throws IOException {
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
           public ScorecardSectionDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ScorecardSectionDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ScorecardSectionDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScorecardSectionDTO
  * @throws IOException if the JSON string is invalid with respect to ScorecardSectionDTO
  */
  public static ScorecardSectionDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScorecardSectionDTO.class);
  }

 /**
  * Convert an instance of ScorecardSectionDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

