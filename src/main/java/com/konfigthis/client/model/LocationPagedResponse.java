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
import com.konfigthis.client.model.Location;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
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
 * class represents paged response.
 */
@ApiModel(description = "class represents paged response.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LocationPagedResponse {
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
  private List<Location> data = null;

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "pageNumber";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private Integer pageNumber;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_FIRST_PAGE = "firstPage";
  @SerializedName(SERIALIZED_NAME_FIRST_PAGE)
  private URI firstPage;

  public static final String SERIALIZED_NAME_LAST_PAGE = "lastPage";
  @SerializedName(SERIALIZED_NAME_LAST_PAGE)
  private URI lastPage;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public static final String SERIALIZED_NAME_TOTAL_RECORDS = "totalRecords";
  @SerializedName(SERIALIZED_NAME_TOTAL_RECORDS)
  private Integer totalRecords;

  public static final String SERIALIZED_NAME_NEXT_PAGE = "nextPage";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  private URI nextPage;

  public static final String SERIALIZED_NAME_PREVIOUS_PAGE = "previousPage";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_PAGE)
  private URI previousPage;

  public LocationPagedResponse() {
  }

  public LocationPagedResponse succeeded(Boolean succeeded) {
    
    
    
    
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


  public LocationPagedResponse message(String message) {
    
    
    
    
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


  public LocationPagedResponse errors(List<String> errors) {
    
    
    
    
    this.errors = errors;
    return this;
  }

  public LocationPagedResponse addErrorsItem(String errorsItem) {
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


  public LocationPagedResponse data(List<Location> data) {
    
    
    
    
    this.data = data;
    return this;
  }

  public LocationPagedResponse addDataItem(Location dataItem) {
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

  public List<Location> getData() {
    return data;
  }


  public void setData(List<Location> data) {
    
    
    
    this.data = data;
  }


  public LocationPagedResponse pageNumber(Integer pageNumber) {
    
    
    
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Gets or sets the page number.
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the page number.")

  public Integer getPageNumber() {
    return pageNumber;
  }


  public void setPageNumber(Integer pageNumber) {
    
    
    
    this.pageNumber = pageNumber;
  }


  public LocationPagedResponse pageSize(Integer pageSize) {
    
    
    
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Gets or sets the size of the page.
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the size of the page.")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    
    
    
    this.pageSize = pageSize;
  }


  public LocationPagedResponse firstPage(URI firstPage) {
    
    
    
    
    this.firstPage = firstPage;
    return this;
  }

   /**
   * Gets or sets the first page.
   * @return firstPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the first page.")

  public URI getFirstPage() {
    return firstPage;
  }


  public void setFirstPage(URI firstPage) {
    
    
    
    this.firstPage = firstPage;
  }


  public LocationPagedResponse lastPage(URI lastPage) {
    
    
    
    
    this.lastPage = lastPage;
    return this;
  }

   /**
   * Gets or sets the last page.
   * @return lastPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the last page.")

  public URI getLastPage() {
    return lastPage;
  }


  public void setLastPage(URI lastPage) {
    
    
    
    this.lastPage = lastPage;
  }


  public LocationPagedResponse totalPages(Integer totalPages) {
    
    
    
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Gets or sets the total pages.
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the total pages.")

  public Integer getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(Integer totalPages) {
    
    
    
    this.totalPages = totalPages;
  }


  public LocationPagedResponse totalRecords(Integer totalRecords) {
    
    
    
    
    this.totalRecords = totalRecords;
    return this;
  }

   /**
   * Gets or sets the total records.
   * @return totalRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the total records.")

  public Integer getTotalRecords() {
    return totalRecords;
  }


  public void setTotalRecords(Integer totalRecords) {
    
    
    
    this.totalRecords = totalRecords;
  }


  public LocationPagedResponse nextPage(URI nextPage) {
    
    
    
    
    this.nextPage = nextPage;
    return this;
  }

   /**
   * Gets or sets the next page.
   * @return nextPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the next page.")

  public URI getNextPage() {
    return nextPage;
  }


  public void setNextPage(URI nextPage) {
    
    
    
    this.nextPage = nextPage;
  }


  public LocationPagedResponse previousPage(URI previousPage) {
    
    
    
    
    this.previousPage = previousPage;
    return this;
  }

   /**
   * Gets or sets the previous page.
   * @return previousPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gets or sets the previous page.")

  public URI getPreviousPage() {
    return previousPage;
  }


  public void setPreviousPage(URI previousPage) {
    
    
    
    this.previousPage = previousPage;
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
   * @return the LocationPagedResponse instance itself
   */
  public LocationPagedResponse putAdditionalProperty(String key, Object value) {
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
    LocationPagedResponse locationPagedResponse = (LocationPagedResponse) o;
    return Objects.equals(this.succeeded, locationPagedResponse.succeeded) &&
        Objects.equals(this.message, locationPagedResponse.message) &&
        Objects.equals(this.errors, locationPagedResponse.errors) &&
        Objects.equals(this.data, locationPagedResponse.data) &&
        Objects.equals(this.pageNumber, locationPagedResponse.pageNumber) &&
        Objects.equals(this.pageSize, locationPagedResponse.pageSize) &&
        Objects.equals(this.firstPage, locationPagedResponse.firstPage) &&
        Objects.equals(this.lastPage, locationPagedResponse.lastPage) &&
        Objects.equals(this.totalPages, locationPagedResponse.totalPages) &&
        Objects.equals(this.totalRecords, locationPagedResponse.totalRecords) &&
        Objects.equals(this.nextPage, locationPagedResponse.nextPage) &&
        Objects.equals(this.previousPage, locationPagedResponse.previousPage)&&
        Objects.equals(this.additionalProperties, locationPagedResponse.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(succeeded, message, errors, data, pageNumber, pageSize, firstPage, lastPage, totalPages, totalRecords, nextPage, previousPage, additionalProperties);
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
    sb.append("class LocationPagedResponse {\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    firstPage: ").append(toIndentedString(firstPage)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
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
    openapiFields.add("pageNumber");
    openapiFields.add("pageSize");
    openapiFields.add("firstPage");
    openapiFields.add("lastPage");
    openapiFields.add("totalPages");
    openapiFields.add("totalRecords");
    openapiFields.add("nextPage");
    openapiFields.add("previousPage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LocationPagedResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LocationPagedResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocationPagedResponse is not found in the empty JSON string", LocationPagedResponse.openapiRequiredFields.toString()));
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
            Location.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("firstPage").isJsonNull() && (jsonObj.get("firstPage") != null && !jsonObj.get("firstPage").isJsonNull()) && !jsonObj.get("firstPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstPage").toString()));
      }
      if (!jsonObj.get("lastPage").isJsonNull() && (jsonObj.get("lastPage") != null && !jsonObj.get("lastPage").isJsonNull()) && !jsonObj.get("lastPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastPage").toString()));
      }
      if (!jsonObj.get("nextPage").isJsonNull() && (jsonObj.get("nextPage") != null && !jsonObj.get("nextPage").isJsonNull()) && !jsonObj.get("nextPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPage").toString()));
      }
      if (!jsonObj.get("previousPage").isJsonNull() && (jsonObj.get("previousPage") != null && !jsonObj.get("previousPage").isJsonNull()) && !jsonObj.get("previousPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousPage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocationPagedResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocationPagedResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocationPagedResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocationPagedResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<LocationPagedResponse>() {
           @Override
           public void write(JsonWriter out, LocationPagedResponse value) throws IOException {
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
           public LocationPagedResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LocationPagedResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LocationPagedResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocationPagedResponse
  * @throws IOException if the JSON string is invalid with respect to LocationPagedResponse
  */
  public static LocationPagedResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocationPagedResponse.class);
  }

 /**
  * Convert an instance of LocationPagedResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

