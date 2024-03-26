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
import com.konfigthis.client.model.ApplicationStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
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
 * JobApplicationDetailsDTO
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JobApplicationDetailsDTO {
  public static final String SERIALIZED_NAME_JOB_HIRING_STAGE_ID = "jobHiringStageId";
  @SerializedName(SERIALIZED_NAME_JOB_HIRING_STAGE_ID)
  private String jobHiringStageId;

  public static final String SERIALIZED_NAME_MOVEDTO_STAGE_ON = "movedtoStageOn";
  @SerializedName(SERIALIZED_NAME_MOVEDTO_STAGE_ON)
  private String movedtoStageOn;

  public static final String SERIALIZED_NAME_SCREENING_QUESTIONS_RESPONSE = "screeningQuestionsResponse";
  @SerializedName(SERIALIZED_NAME_SCREENING_QUESTIONS_RESPONSE)
  private Map<String, String> screeningQuestionsResponse = null;

  public static final String SERIALIZED_NAME_APPLIED_ON = "appliedOn";
  @SerializedName(SERIALIZED_NAME_APPLIED_ON)
  private String appliedOn;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ApplicationStatus status;

  public static final String SERIALIZED_NAME_SOURCED_BY = "sourcedBy";
  @SerializedName(SERIALIZED_NAME_SOURCED_BY)
  private String sourcedBy;

  public static final String SERIALIZED_NAME_SOURCE_TITLE = "sourceTitle";
  @SerializedName(SERIALIZED_NAME_SOURCE_TITLE)
  private String sourceTitle;

  public static final String SERIALIZED_NAME_ASSIGNED_TO = "assignedTo";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_TO)
  private String assignedTo;

  public static final String SERIALIZED_NAME_ASSIGNED_ON = "assignedOn";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_ON)
  private String assignedOn;

  public JobApplicationDetailsDTO() {
  }

  public JobApplicationDetailsDTO jobHiringStageId(String jobHiringStageId) {
    
    
    
    
    this.jobHiringStageId = jobHiringStageId;
    return this;
  }

   /**
   * Gets or sets the job hiring stage identifier.
   * @return jobHiringStageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the job hiring stage identifier.")

  public String getJobHiringStageId() {
    return jobHiringStageId;
  }


  public void setJobHiringStageId(String jobHiringStageId) {
    
    
    
    this.jobHiringStageId = jobHiringStageId;
  }


  public JobApplicationDetailsDTO movedtoStageOn(String movedtoStageOn) {
    
    
    
    
    this.movedtoStageOn = movedtoStageOn;
    return this;
  }

   /**
   * Gets or sets the moved to current stage on.
   * @return movedtoStageOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the moved to current stage on.")

  public String getMovedtoStageOn() {
    return movedtoStageOn;
  }


  public void setMovedtoStageOn(String movedtoStageOn) {
    
    
    
    this.movedtoStageOn = movedtoStageOn;
  }


  public JobApplicationDetailsDTO screeningQuestionsResponse(Map<String, String> screeningQuestionsResponse) {
    
    
    
    
    this.screeningQuestionsResponse = screeningQuestionsResponse;
    return this;
  }

  public JobApplicationDetailsDTO putScreeningQuestionsResponseItem(String key, String screeningQuestionsResponseItem) {
    if (this.screeningQuestionsResponse == null) {
      this.screeningQuestionsResponse = new HashMap<>();
    }
    this.screeningQuestionsResponse.put(key, screeningQuestionsResponseItem);
    return this;
  }

   /**
   * Gets or sets the screening questions.
   * @return screeningQuestionsResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the screening questions.")

  public Map<String, String> getScreeningQuestionsResponse() {
    return screeningQuestionsResponse;
  }


  public void setScreeningQuestionsResponse(Map<String, String> screeningQuestionsResponse) {
    
    
    
    this.screeningQuestionsResponse = screeningQuestionsResponse;
  }


  public JobApplicationDetailsDTO appliedOn(String appliedOn) {
    
    
    
    
    this.appliedOn = appliedOn;
    return this;
  }

   /**
   * Gets or sets the applied on.
   * @return appliedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the applied on.")

  public String getAppliedOn() {
    return appliedOn;
  }


  public void setAppliedOn(String appliedOn) {
    
    
    
    this.appliedOn = appliedOn;
  }


  public JobApplicationDetailsDTO status(ApplicationStatus status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationStatus getStatus() {
    return status;
  }


  public void setStatus(ApplicationStatus status) {
    
    
    
    this.status = status;
  }


  public JobApplicationDetailsDTO sourcedBy(String sourcedBy) {
    
    
    
    
    this.sourcedBy = sourcedBy;
    return this;
  }

   /**
   * Gets or sets the sourced by.
   * @return sourcedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the sourced by.")

  public String getSourcedBy() {
    return sourcedBy;
  }


  public void setSourcedBy(String sourcedBy) {
    
    
    
    this.sourcedBy = sourcedBy;
  }


  public JobApplicationDetailsDTO sourceTitle(String sourceTitle) {
    
    
    
    
    this.sourceTitle = sourceTitle;
    return this;
  }

   /**
   * Gets or sets the source title.
   * @return sourceTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the source title.")

  public String getSourceTitle() {
    return sourceTitle;
  }


  public void setSourceTitle(String sourceTitle) {
    
    
    
    this.sourceTitle = sourceTitle;
  }


  public JobApplicationDetailsDTO assignedTo(String assignedTo) {
    
    
    
    
    this.assignedTo = assignedTo;
    return this;
  }

   /**
   * Gets or sets the assigned to.
   * @return assignedTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the assigned to.")

  public String getAssignedTo() {
    return assignedTo;
  }


  public void setAssignedTo(String assignedTo) {
    
    
    
    this.assignedTo = assignedTo;
  }


  public JobApplicationDetailsDTO assignedOn(String assignedOn) {
    
    
    
    
    this.assignedOn = assignedOn;
    return this;
  }

   /**
   * Gets or sets the assigned on.
   * @return assignedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the assigned on.")

  public String getAssignedOn() {
    return assignedOn;
  }


  public void setAssignedOn(String assignedOn) {
    
    
    
    this.assignedOn = assignedOn;
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
   * @return the JobApplicationDetailsDTO instance itself
   */
  public JobApplicationDetailsDTO putAdditionalProperty(String key, Object value) {
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
    JobApplicationDetailsDTO jobApplicationDetailsDTO = (JobApplicationDetailsDTO) o;
    return Objects.equals(this.jobHiringStageId, jobApplicationDetailsDTO.jobHiringStageId) &&
        Objects.equals(this.movedtoStageOn, jobApplicationDetailsDTO.movedtoStageOn) &&
        Objects.equals(this.screeningQuestionsResponse, jobApplicationDetailsDTO.screeningQuestionsResponse) &&
        Objects.equals(this.appliedOn, jobApplicationDetailsDTO.appliedOn) &&
        Objects.equals(this.status, jobApplicationDetailsDTO.status) &&
        Objects.equals(this.sourcedBy, jobApplicationDetailsDTO.sourcedBy) &&
        Objects.equals(this.sourceTitle, jobApplicationDetailsDTO.sourceTitle) &&
        Objects.equals(this.assignedTo, jobApplicationDetailsDTO.assignedTo) &&
        Objects.equals(this.assignedOn, jobApplicationDetailsDTO.assignedOn)&&
        Objects.equals(this.additionalProperties, jobApplicationDetailsDTO.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobHiringStageId, movedtoStageOn, screeningQuestionsResponse, appliedOn, status, sourcedBy, sourceTitle, assignedTo, assignedOn, additionalProperties);
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
    sb.append("class JobApplicationDetailsDTO {\n");
    sb.append("    jobHiringStageId: ").append(toIndentedString(jobHiringStageId)).append("\n");
    sb.append("    movedtoStageOn: ").append(toIndentedString(movedtoStageOn)).append("\n");
    sb.append("    screeningQuestionsResponse: ").append(toIndentedString(screeningQuestionsResponse)).append("\n");
    sb.append("    appliedOn: ").append(toIndentedString(appliedOn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sourcedBy: ").append(toIndentedString(sourcedBy)).append("\n");
    sb.append("    sourceTitle: ").append(toIndentedString(sourceTitle)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    assignedOn: ").append(toIndentedString(assignedOn)).append("\n");
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
    openapiFields.add("jobHiringStageId");
    openapiFields.add("movedtoStageOn");
    openapiFields.add("screeningQuestionsResponse");
    openapiFields.add("appliedOn");
    openapiFields.add("status");
    openapiFields.add("sourcedBy");
    openapiFields.add("sourceTitle");
    openapiFields.add("assignedTo");
    openapiFields.add("assignedOn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobApplicationDetailsDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobApplicationDetailsDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobApplicationDetailsDTO is not found in the empty JSON string", JobApplicationDetailsDTO.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("jobHiringStageId").isJsonNull() && (jsonObj.get("jobHiringStageId") != null && !jsonObj.get("jobHiringStageId").isJsonNull()) && !jsonObj.get("jobHiringStageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobHiringStageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobHiringStageId").toString()));
      }
      if (!jsonObj.get("movedtoStageOn").isJsonNull() && (jsonObj.get("movedtoStageOn") != null && !jsonObj.get("movedtoStageOn").isJsonNull()) && !jsonObj.get("movedtoStageOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `movedtoStageOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("movedtoStageOn").toString()));
      }
      if (!jsonObj.get("appliedOn").isJsonNull() && (jsonObj.get("appliedOn") != null && !jsonObj.get("appliedOn").isJsonNull()) && !jsonObj.get("appliedOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appliedOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appliedOn").toString()));
      }
      if (!jsonObj.get("sourcedBy").isJsonNull() && (jsonObj.get("sourcedBy") != null && !jsonObj.get("sourcedBy").isJsonNull()) && !jsonObj.get("sourcedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourcedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourcedBy").toString()));
      }
      if (!jsonObj.get("sourceTitle").isJsonNull() && (jsonObj.get("sourceTitle") != null && !jsonObj.get("sourceTitle").isJsonNull()) && !jsonObj.get("sourceTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceTitle").toString()));
      }
      if (!jsonObj.get("assignedTo").isJsonNull() && (jsonObj.get("assignedTo") != null && !jsonObj.get("assignedTo").isJsonNull()) && !jsonObj.get("assignedTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assignedTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assignedTo").toString()));
      }
      if (!jsonObj.get("assignedOn").isJsonNull() && (jsonObj.get("assignedOn") != null && !jsonObj.get("assignedOn").isJsonNull()) && !jsonObj.get("assignedOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assignedOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assignedOn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobApplicationDetailsDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobApplicationDetailsDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobApplicationDetailsDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobApplicationDetailsDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<JobApplicationDetailsDTO>() {
           @Override
           public void write(JsonWriter out, JobApplicationDetailsDTO value) throws IOException {
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
           public JobApplicationDetailsDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JobApplicationDetailsDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JobApplicationDetailsDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobApplicationDetailsDTO
  * @throws IOException if the JSON string is invalid with respect to JobApplicationDetailsDTO
  */
  public static JobApplicationDetailsDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobApplicationDetailsDTO.class);
  }

 /**
  * Convert an instance of JobApplicationDetailsDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

