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
import com.konfigthis.client.model.ScorecardSectionDTO;
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
 * ScoreCardDTO
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ScoreCardDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_CANDIDATE_ID = "candidateId";
  @SerializedName(SERIALIZED_NAME_CANDIDATE_ID)
  private String candidateId;

  public static final String SERIALIZED_NAME_STAGE_ID = "stageId";
  @SerializedName(SERIALIZED_NAME_STAGE_ID)
  private String stageId;

  public static final String SERIALIZED_NAME_INTERVIEW_ID = "interviewId";
  @SerializedName(SERIALIZED_NAME_INTERVIEW_ID)
  private String interviewId;

  public static final String SERIALIZED_NAME_OVERALL_FEEDBACK_DECISION = "overallFeedbackDecision";
  @SerializedName(SERIALIZED_NAME_OVERALL_FEEDBACK_DECISION)
  private String overallFeedbackDecision;

  public static final String SERIALIZED_NAME_OVERALL_COMMENTS = "overallComments";
  @SerializedName(SERIALIZED_NAME_OVERALL_COMMENTS)
  private String overallComments;

  public static final String SERIALIZED_NAME_FEEDBACK_SUBMITTED_BY_NAME = "feedbackSubmittedByName";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_SUBMITTED_BY_NAME)
  private String feedbackSubmittedByName;

  public static final String SERIALIZED_NAME_SECTIONS = "sections";
  @SerializedName(SERIALIZED_NAME_SECTIONS)
  private List<ScorecardSectionDTO> sections = null;

  public ScoreCardDTO() {
  }

  public ScoreCardDTO id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ScoreCardDTO jobId(String jobId) {
    
    
    
    
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobId() {
    return jobId;
  }


  public void setJobId(String jobId) {
    
    
    
    this.jobId = jobId;
  }


  public ScoreCardDTO candidateId(String candidateId) {
    
    
    
    
    this.candidateId = candidateId;
    return this;
  }

   /**
   * Get candidateId
   * @return candidateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCandidateId() {
    return candidateId;
  }


  public void setCandidateId(String candidateId) {
    
    
    
    this.candidateId = candidateId;
  }


  public ScoreCardDTO stageId(String stageId) {
    
    
    
    
    this.stageId = stageId;
    return this;
  }

   /**
   * Get stageId
   * @return stageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStageId() {
    return stageId;
  }


  public void setStageId(String stageId) {
    
    
    
    this.stageId = stageId;
  }


  public ScoreCardDTO interviewId(String interviewId) {
    
    
    
    
    this.interviewId = interviewId;
    return this;
  }

   /**
   * Get interviewId
   * @return interviewId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInterviewId() {
    return interviewId;
  }


  public void setInterviewId(String interviewId) {
    
    
    
    this.interviewId = interviewId;
  }


  public ScoreCardDTO overallFeedbackDecision(String overallFeedbackDecision) {
    
    
    
    
    this.overallFeedbackDecision = overallFeedbackDecision;
    return this;
  }

   /**
   * Get overallFeedbackDecision
   * @return overallFeedbackDecision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOverallFeedbackDecision() {
    return overallFeedbackDecision;
  }


  public void setOverallFeedbackDecision(String overallFeedbackDecision) {
    
    
    
    this.overallFeedbackDecision = overallFeedbackDecision;
  }


  public ScoreCardDTO overallComments(String overallComments) {
    
    
    
    
    this.overallComments = overallComments;
    return this;
  }

   /**
   * Get overallComments
   * @return overallComments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOverallComments() {
    return overallComments;
  }


  public void setOverallComments(String overallComments) {
    
    
    
    this.overallComments = overallComments;
  }


  public ScoreCardDTO feedbackSubmittedByName(String feedbackSubmittedByName) {
    
    
    
    
    this.feedbackSubmittedByName = feedbackSubmittedByName;
    return this;
  }

   /**
   * Get feedbackSubmittedByName
   * @return feedbackSubmittedByName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFeedbackSubmittedByName() {
    return feedbackSubmittedByName;
  }


  public void setFeedbackSubmittedByName(String feedbackSubmittedByName) {
    
    
    
    this.feedbackSubmittedByName = feedbackSubmittedByName;
  }


  public ScoreCardDTO sections(List<ScorecardSectionDTO> sections) {
    
    
    
    
    this.sections = sections;
    return this;
  }

  public ScoreCardDTO addSectionsItem(ScorecardSectionDTO sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

   /**
   * Get sections
   * @return sections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ScorecardSectionDTO> getSections() {
    return sections;
  }


  public void setSections(List<ScorecardSectionDTO> sections) {
    
    
    
    this.sections = sections;
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
   * @return the ScoreCardDTO instance itself
   */
  public ScoreCardDTO putAdditionalProperty(String key, Object value) {
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
    ScoreCardDTO scoreCardDTO = (ScoreCardDTO) o;
    return Objects.equals(this.id, scoreCardDTO.id) &&
        Objects.equals(this.jobId, scoreCardDTO.jobId) &&
        Objects.equals(this.candidateId, scoreCardDTO.candidateId) &&
        Objects.equals(this.stageId, scoreCardDTO.stageId) &&
        Objects.equals(this.interviewId, scoreCardDTO.interviewId) &&
        Objects.equals(this.overallFeedbackDecision, scoreCardDTO.overallFeedbackDecision) &&
        Objects.equals(this.overallComments, scoreCardDTO.overallComments) &&
        Objects.equals(this.feedbackSubmittedByName, scoreCardDTO.feedbackSubmittedByName) &&
        Objects.equals(this.sections, scoreCardDTO.sections)&&
        Objects.equals(this.additionalProperties, scoreCardDTO.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jobId, candidateId, stageId, interviewId, overallFeedbackDecision, overallComments, feedbackSubmittedByName, sections, additionalProperties);
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
    sb.append("class ScoreCardDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    candidateId: ").append(toIndentedString(candidateId)).append("\n");
    sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
    sb.append("    interviewId: ").append(toIndentedString(interviewId)).append("\n");
    sb.append("    overallFeedbackDecision: ").append(toIndentedString(overallFeedbackDecision)).append("\n");
    sb.append("    overallComments: ").append(toIndentedString(overallComments)).append("\n");
    sb.append("    feedbackSubmittedByName: ").append(toIndentedString(feedbackSubmittedByName)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("jobId");
    openapiFields.add("candidateId");
    openapiFields.add("stageId");
    openapiFields.add("interviewId");
    openapiFields.add("overallFeedbackDecision");
    openapiFields.add("overallComments");
    openapiFields.add("feedbackSubmittedByName");
    openapiFields.add("sections");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ScoreCardDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ScoreCardDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScoreCardDTO is not found in the empty JSON string", ScoreCardDTO.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonNull() && (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("jobId").isJsonNull() && (jsonObj.get("jobId") != null && !jsonObj.get("jobId").isJsonNull()) && !jsonObj.get("jobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobId").toString()));
      }
      if (!jsonObj.get("candidateId").isJsonNull() && (jsonObj.get("candidateId") != null && !jsonObj.get("candidateId").isJsonNull()) && !jsonObj.get("candidateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `candidateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("candidateId").toString()));
      }
      if (!jsonObj.get("stageId").isJsonNull() && (jsonObj.get("stageId") != null && !jsonObj.get("stageId").isJsonNull()) && !jsonObj.get("stageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stageId").toString()));
      }
      if (!jsonObj.get("interviewId").isJsonNull() && (jsonObj.get("interviewId") != null && !jsonObj.get("interviewId").isJsonNull()) && !jsonObj.get("interviewId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interviewId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interviewId").toString()));
      }
      if (!jsonObj.get("overallFeedbackDecision").isJsonNull() && (jsonObj.get("overallFeedbackDecision") != null && !jsonObj.get("overallFeedbackDecision").isJsonNull()) && !jsonObj.get("overallFeedbackDecision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `overallFeedbackDecision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("overallFeedbackDecision").toString()));
      }
      if (!jsonObj.get("overallComments").isJsonNull() && (jsonObj.get("overallComments") != null && !jsonObj.get("overallComments").isJsonNull()) && !jsonObj.get("overallComments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `overallComments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("overallComments").toString()));
      }
      if (!jsonObj.get("feedbackSubmittedByName").isJsonNull() && (jsonObj.get("feedbackSubmittedByName") != null && !jsonObj.get("feedbackSubmittedByName").isJsonNull()) && !jsonObj.get("feedbackSubmittedByName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedbackSubmittedByName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feedbackSubmittedByName").toString()));
      }
      if (jsonObj.get("sections") != null && !jsonObj.get("sections").isJsonNull()) {
        JsonArray jsonArraysections = jsonObj.getAsJsonArray("sections");
        if (jsonArraysections != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sections").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sections` to be an array in the JSON string but got `%s`", jsonObj.get("sections").toString()));
          }

          // validate the optional field `sections` (array)
          for (int i = 0; i < jsonArraysections.size(); i++) {
            ScorecardSectionDTO.validateJsonObject(jsonArraysections.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScoreCardDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScoreCardDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScoreCardDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScoreCardDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<ScoreCardDTO>() {
           @Override
           public void write(JsonWriter out, ScoreCardDTO value) throws IOException {
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
           public ScoreCardDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ScoreCardDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ScoreCardDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScoreCardDTO
  * @throws IOException if the JSON string is invalid with respect to ScoreCardDTO
  */
  public static ScoreCardDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScoreCardDTO.class);
  }

 /**
  * Convert an instance of ScoreCardDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

