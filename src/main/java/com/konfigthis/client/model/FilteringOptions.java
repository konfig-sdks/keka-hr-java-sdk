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
import com.konfigthis.client.model.FilterValue;
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
 * FilteringOptions
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FilteringOptions {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private Map<String, FilterValue> filters = null;

  public static final String SERIALIZED_NAME_IS_ENABLE = "isEnable";
  @SerializedName(SERIALIZED_NAME_IS_ENABLE)
  private Boolean isEnable;

  public static final String SERIALIZED_NAME_SEARCH_KEY = "searchKey";
  @SerializedName(SERIALIZED_NAME_SEARCH_KEY)
  private String searchKey;

  public FilteringOptions() {
  }

  
  public FilteringOptions(
     Boolean isEnable
  ) {
    this();
    this.isEnable = isEnable;
  }

  public FilteringOptions filters(Map<String, FilterValue> filters) {
    
    
    
    
    this.filters = filters;
    return this;
  }

  public FilteringOptions putFiltersItem(String key, FilterValue filtersItem) {
    if (this.filters == null) {
      this.filters = new HashMap<>();
    }
    this.filters.put(key, filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, FilterValue> getFilters() {
    return filters;
  }


  public void setFilters(Map<String, FilterValue> filters) {
    
    
    
    this.filters = filters;
  }


   /**
   * Get isEnable
   * @return isEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsEnable() {
    return isEnable;
  }




  public FilteringOptions searchKey(String searchKey) {
    
    
    
    
    this.searchKey = searchKey;
    return this;
  }

   /**
   * Get searchKey
   * @return searchKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSearchKey() {
    return searchKey;
  }


  public void setSearchKey(String searchKey) {
    
    
    
    this.searchKey = searchKey;
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
   * @return the FilteringOptions instance itself
   */
  public FilteringOptions putAdditionalProperty(String key, Object value) {
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
    FilteringOptions filteringOptions = (FilteringOptions) o;
    return Objects.equals(this.filters, filteringOptions.filters) &&
        Objects.equals(this.isEnable, filteringOptions.isEnable) &&
        Objects.equals(this.searchKey, filteringOptions.searchKey)&&
        Objects.equals(this.additionalProperties, filteringOptions.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, isEnable, searchKey, additionalProperties);
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
    sb.append("class FilteringOptions {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    isEnable: ").append(toIndentedString(isEnable)).append("\n");
    sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
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
    openapiFields.add("filters");
    openapiFields.add("isEnable");
    openapiFields.add("searchKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FilteringOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FilteringOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FilteringOptions is not found in the empty JSON string", FilteringOptions.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("searchKey").isJsonNull() && (jsonObj.get("searchKey") != null && !jsonObj.get("searchKey").isJsonNull()) && !jsonObj.get("searchKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilteringOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilteringOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilteringOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilteringOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<FilteringOptions>() {
           @Override
           public void write(JsonWriter out, FilteringOptions value) throws IOException {
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
           public FilteringOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FilteringOptions instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FilteringOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilteringOptions
  * @throws IOException if the JSON string is invalid with respect to FilteringOptions
  */
  public static FilteringOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilteringOptions.class);
  }

 /**
  * Convert an instance of FilteringOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

