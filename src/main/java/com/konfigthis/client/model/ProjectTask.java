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
import com.konfigthis.client.model.TaskBillingType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * ProjectTask
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProjectTask {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TASK_BILLING_TYPE = "taskBillingType";
  @SerializedName(SERIALIZED_NAME_TASK_BILLING_TYPE)
  private TaskBillingType taskBillingType;

  public static final String SERIALIZED_NAME_ASSIGNED_TO = "assignedTo";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_TO)
  private List<String> assignedTo = null;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_ESTIMATED_HOURS = "estimatedHours";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_HOURS)
  private Double estimatedHours;

  public static final String SERIALIZED_NAME_PHASE_ID = "phaseId";
  @SerializedName(SERIALIZED_NAME_PHASE_ID)
  private String phaseId;

  public ProjectTask() {
  }

  public ProjectTask description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ProjectTask projectId(String projectId) {
    
    
    
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    
    
    
    this.projectId = projectId;
  }


  public ProjectTask name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ProjectTask taskBillingType(TaskBillingType taskBillingType) {
    
    
    
    
    this.taskBillingType = taskBillingType;
    return this;
  }

   /**
   * Get taskBillingType
   * @return taskBillingType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskBillingType getTaskBillingType() {
    return taskBillingType;
  }


  public void setTaskBillingType(TaskBillingType taskBillingType) {
    
    
    
    this.taskBillingType = taskBillingType;
  }


  public ProjectTask assignedTo(List<String> assignedTo) {
    
    
    
    
    this.assignedTo = assignedTo;
    return this;
  }

  public ProjectTask addAssignedToItem(String assignedToItem) {
    if (this.assignedTo == null) {
      this.assignedTo = new ArrayList<>();
    }
    this.assignedTo.add(assignedToItem);
    return this;
  }

   /**
   * Get assignedTo
   * @return assignedTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAssignedTo() {
    return assignedTo;
  }


  public void setAssignedTo(List<String> assignedTo) {
    
    
    
    this.assignedTo = assignedTo;
  }


  public ProjectTask startDate(OffsetDateTime startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    
    
    
    this.startDate = startDate;
  }


  public ProjectTask endDate(OffsetDateTime endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    
    
    
    this.endDate = endDate;
  }


  public ProjectTask estimatedHours(Double estimatedHours) {
    
    
    
    
    this.estimatedHours = estimatedHours;
    return this;
  }

   /**
   * Get estimatedHours
   * @return estimatedHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getEstimatedHours() {
    return estimatedHours;
  }


  public void setEstimatedHours(Double estimatedHours) {
    
    
    
    this.estimatedHours = estimatedHours;
  }


  public ProjectTask phaseId(String phaseId) {
    
    
    
    
    this.phaseId = phaseId;
    return this;
  }

   /**
   * Get phaseId
   * @return phaseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhaseId() {
    return phaseId;
  }


  public void setPhaseId(String phaseId) {
    
    
    
    this.phaseId = phaseId;
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
   * @return the ProjectTask instance itself
   */
  public ProjectTask putAdditionalProperty(String key, Object value) {
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
    ProjectTask projectTask = (ProjectTask) o;
    return Objects.equals(this.description, projectTask.description) &&
        Objects.equals(this.projectId, projectTask.projectId) &&
        Objects.equals(this.name, projectTask.name) &&
        Objects.equals(this.taskBillingType, projectTask.taskBillingType) &&
        Objects.equals(this.assignedTo, projectTask.assignedTo) &&
        Objects.equals(this.startDate, projectTask.startDate) &&
        Objects.equals(this.endDate, projectTask.endDate) &&
        Objects.equals(this.estimatedHours, projectTask.estimatedHours) &&
        Objects.equals(this.phaseId, projectTask.phaseId)&&
        Objects.equals(this.additionalProperties, projectTask.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, projectId, name, taskBillingType, assignedTo, startDate, endDate, estimatedHours, phaseId, additionalProperties);
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
    sb.append("class ProjectTask {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taskBillingType: ").append(toIndentedString(taskBillingType)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    estimatedHours: ").append(toIndentedString(estimatedHours)).append("\n");
    sb.append("    phaseId: ").append(toIndentedString(phaseId)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("projectId");
    openapiFields.add("name");
    openapiFields.add("taskBillingType");
    openapiFields.add("assignedTo");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("estimatedHours");
    openapiFields.add("phaseId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("endDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectTask
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectTask.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectTask is not found in the empty JSON string", ProjectTask.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectTask.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonNull() && (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present (nullable)
      if (jsonObj.get("assignedTo") != null && !jsonObj.get("assignedTo").isJsonNull() && !jsonObj.get("assignedTo").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `assignedTo` to be an array in the JSON string or null but got `%s`", jsonObj.get("assignedTo").toString()));
      }
      if (!jsonObj.get("phaseId").isJsonNull() && (jsonObj.get("phaseId") != null && !jsonObj.get("phaseId").isJsonNull()) && !jsonObj.get("phaseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phaseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phaseId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectTask.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectTask' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectTask> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectTask.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectTask>() {
           @Override
           public void write(JsonWriter out, ProjectTask value) throws IOException {
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
           public ProjectTask read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectTask instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectTask given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectTask
  * @throws IOException if the JSON string is invalid with respect to ProjectTask
  */
  public static ProjectTask fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectTask.class);
  }

 /**
  * Convert an instance of ProjectTask to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
