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
import com.konfigthis.client.model.APIEmployeeLookup;
import com.konfigthis.client.model.APIReviewCycleLookup;
import com.konfigthis.client.model.APIReviewGroupLookup;
import com.konfigthis.client.model.APIReviewRating;
import com.konfigthis.client.model.ReviewStatus;
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
 * APIEmployeeReview
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class APIEmployeeReview {
  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private APIEmployeeLookup employee;

  public static final String SERIALIZED_NAME_REVIEW_GROUP = "reviewGroup";
  @SerializedName(SERIALIZED_NAME_REVIEW_GROUP)
  private APIReviewGroupLookup reviewGroup;

  public static final String SERIALIZED_NAME_REVIEW_CYCLE = "reviewCycle";
  @SerializedName(SERIALIZED_NAME_REVIEW_CYCLE)
  private APIReviewCycleLookup reviewCycle;

  public static final String SERIALIZED_NAME_RATINGS = "ratings";
  @SerializedName(SERIALIZED_NAME_RATINGS)
  private List<APIReviewRating> ratings = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ReviewStatus status;

  public APIEmployeeReview() {
  }

  
  public APIEmployeeReview(
     String id
  ) {
    this();
    this.id = id;
  }

  public APIEmployeeReview summary(String summary) {
    
    
    
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSummary() {
    return summary;
  }


  public void setSummary(String summary) {
    
    
    
    this.summary = summary;
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




  public APIEmployeeReview employee(APIEmployeeLookup employee) {
    
    
    
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public APIEmployeeLookup getEmployee() {
    return employee;
  }


  public void setEmployee(APIEmployeeLookup employee) {
    
    
    
    this.employee = employee;
  }


  public APIEmployeeReview reviewGroup(APIReviewGroupLookup reviewGroup) {
    
    
    
    
    this.reviewGroup = reviewGroup;
    return this;
  }

   /**
   * Get reviewGroup
   * @return reviewGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public APIReviewGroupLookup getReviewGroup() {
    return reviewGroup;
  }


  public void setReviewGroup(APIReviewGroupLookup reviewGroup) {
    
    
    
    this.reviewGroup = reviewGroup;
  }


  public APIEmployeeReview reviewCycle(APIReviewCycleLookup reviewCycle) {
    
    
    
    
    this.reviewCycle = reviewCycle;
    return this;
  }

   /**
   * Get reviewCycle
   * @return reviewCycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public APIReviewCycleLookup getReviewCycle() {
    return reviewCycle;
  }


  public void setReviewCycle(APIReviewCycleLookup reviewCycle) {
    
    
    
    this.reviewCycle = reviewCycle;
  }


  public APIEmployeeReview ratings(List<APIReviewRating> ratings) {
    
    
    
    
    this.ratings = ratings;
    return this;
  }

  public APIEmployeeReview addRatingsItem(APIReviewRating ratingsItem) {
    if (this.ratings == null) {
      this.ratings = new ArrayList<>();
    }
    this.ratings.add(ratingsItem);
    return this;
  }

   /**
   * Get ratings
   * @return ratings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<APIReviewRating> getRatings() {
    return ratings;
  }


  public void setRatings(List<APIReviewRating> ratings) {
    
    
    
    this.ratings = ratings;
  }


  public APIEmployeeReview status(ReviewStatus status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReviewStatus getStatus() {
    return status;
  }


  public void setStatus(ReviewStatus status) {
    
    
    
    this.status = status;
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
   * @return the APIEmployeeReview instance itself
   */
  public APIEmployeeReview putAdditionalProperty(String key, Object value) {
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
    APIEmployeeReview apIEmployeeReview = (APIEmployeeReview) o;
    return Objects.equals(this.summary, apIEmployeeReview.summary) &&
        Objects.equals(this.id, apIEmployeeReview.id) &&
        Objects.equals(this.employee, apIEmployeeReview.employee) &&
        Objects.equals(this.reviewGroup, apIEmployeeReview.reviewGroup) &&
        Objects.equals(this.reviewCycle, apIEmployeeReview.reviewCycle) &&
        Objects.equals(this.ratings, apIEmployeeReview.ratings) &&
        Objects.equals(this.status, apIEmployeeReview.status)&&
        Objects.equals(this.additionalProperties, apIEmployeeReview.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, id, employee, reviewGroup, reviewCycle, ratings, status, additionalProperties);
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
    sb.append("class APIEmployeeReview {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    reviewGroup: ").append(toIndentedString(reviewGroup)).append("\n");
    sb.append("    reviewCycle: ").append(toIndentedString(reviewCycle)).append("\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("summary");
    openapiFields.add("id");
    openapiFields.add("employee");
    openapiFields.add("reviewGroup");
    openapiFields.add("reviewCycle");
    openapiFields.add("ratings");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIEmployeeReview
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIEmployeeReview.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIEmployeeReview is not found in the empty JSON string", APIEmployeeReview.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("summary").isJsonNull() && (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) && !jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      if (!jsonObj.get("id").isJsonNull() && (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `employee`
      if (jsonObj.get("employee") != null && !jsonObj.get("employee").isJsonNull()) {
        APIEmployeeLookup.validateJsonObject(jsonObj.getAsJsonObject("employee"));
      }
      // validate the optional field `reviewGroup`
      if (jsonObj.get("reviewGroup") != null && !jsonObj.get("reviewGroup").isJsonNull()) {
        APIReviewGroupLookup.validateJsonObject(jsonObj.getAsJsonObject("reviewGroup"));
      }
      // validate the optional field `reviewCycle`
      if (jsonObj.get("reviewCycle") != null && !jsonObj.get("reviewCycle").isJsonNull()) {
        APIReviewCycleLookup.validateJsonObject(jsonObj.getAsJsonObject("reviewCycle"));
      }
      if (jsonObj.get("ratings") != null && !jsonObj.get("ratings").isJsonNull()) {
        JsonArray jsonArrayratings = jsonObj.getAsJsonArray("ratings");
        if (jsonArrayratings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ratings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ratings` to be an array in the JSON string but got `%s`", jsonObj.get("ratings").toString()));
          }

          // validate the optional field `ratings` (array)
          for (int i = 0; i < jsonArrayratings.size(); i++) {
            APIReviewRating.validateJsonObject(jsonArrayratings.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIEmployeeReview.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIEmployeeReview' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIEmployeeReview> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIEmployeeReview.class));

       return (TypeAdapter<T>) new TypeAdapter<APIEmployeeReview>() {
           @Override
           public void write(JsonWriter out, APIEmployeeReview value) throws IOException {
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
           public APIEmployeeReview read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             APIEmployeeReview instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of APIEmployeeReview given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIEmployeeReview
  * @throws IOException if the JSON string is invalid with respect to APIEmployeeReview
  */
  public static APIEmployeeReview fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIEmployeeReview.class);
  }

 /**
  * Convert an instance of APIEmployeeReview to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

