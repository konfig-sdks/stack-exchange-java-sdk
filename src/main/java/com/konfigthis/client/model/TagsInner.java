/*
 * StackExchange
 * Stack Exchange is a network of 130+ Q&A communities including Stack Overflow. 
 *
 * The version of the OpenAPI document: 2.0
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
import java.util.ArrayList;
import java.util.List;

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
 * TagsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TagsInner {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_HAS_SYNONYMS = "has_synonyms";
  @SerializedName(SERIALIZED_NAME_HAS_SYNONYMS)
  private Boolean hasSynonyms;

  public static final String SERIALIZED_NAME_IS_MODERATOR_ONLY = "is_moderator_only";
  @SerializedName(SERIALIZED_NAME_IS_MODERATOR_ONLY)
  private Boolean isModeratorOnly;

  public static final String SERIALIZED_NAME_IS_REQUIRED = "is_required";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED)
  private Boolean isRequired;

  public static final String SERIALIZED_NAME_LAST_ACTIVITY_DATE = "last_activity_date";
  @SerializedName(SERIALIZED_NAME_LAST_ACTIVITY_DATE)
  private Integer lastActivityDate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SYNONYMS = "synonyms";
  @SerializedName(SERIALIZED_NAME_SYNONYMS)
  private List<Object> synonyms = null;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public TagsInner() {
  }

  public TagsInner count(Integer count) {
    
    
    
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    
    
    
    this.count = count;
  }


  public TagsInner hasSynonyms(Boolean hasSynonyms) {
    
    
    
    
    this.hasSynonyms = hasSynonyms;
    return this;
  }

   /**
   * Get hasSynonyms
   * @return hasSynonyms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasSynonyms() {
    return hasSynonyms;
  }


  public void setHasSynonyms(Boolean hasSynonyms) {
    
    
    
    this.hasSynonyms = hasSynonyms;
  }


  public TagsInner isModeratorOnly(Boolean isModeratorOnly) {
    
    
    
    
    this.isModeratorOnly = isModeratorOnly;
    return this;
  }

   /**
   * Get isModeratorOnly
   * @return isModeratorOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsModeratorOnly() {
    return isModeratorOnly;
  }


  public void setIsModeratorOnly(Boolean isModeratorOnly) {
    
    
    
    this.isModeratorOnly = isModeratorOnly;
  }


  public TagsInner isRequired(Boolean isRequired) {
    
    
    
    
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Get isRequired
   * @return isRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsRequired() {
    return isRequired;
  }


  public void setIsRequired(Boolean isRequired) {
    
    
    
    this.isRequired = isRequired;
  }


  public TagsInner lastActivityDate(Integer lastActivityDate) {
    
    
    
    
    this.lastActivityDate = lastActivityDate;
    return this;
  }

   /**
   * Get lastActivityDate
   * @return lastActivityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastActivityDate() {
    return lastActivityDate;
  }


  public void setLastActivityDate(Integer lastActivityDate) {
    
    
    
    this.lastActivityDate = lastActivityDate;
  }


  public TagsInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public TagsInner synonyms(List<Object> synonyms) {
    
    
    
    
    this.synonyms = synonyms;
    return this;
  }

  public TagsInner addSynonymsItem(Object synonymsItem) {
    if (this.synonyms == null) {
      this.synonyms = new ArrayList<>();
    }
    this.synonyms.add(synonymsItem);
    return this;
  }

   /**
   * Get synonyms
   * @return synonyms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getSynonyms() {
    return synonyms;
  }


  public void setSynonyms(List<Object> synonyms) {
    
    
    
    this.synonyms = synonyms;
  }


  public TagsInner userId(Integer userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUserId() {
    return userId;
  }


  public void setUserId(Integer userId) {
    
    
    
    this.userId = userId;
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
   * @return the TagsInner instance itself
   */
  public TagsInner putAdditionalProperty(String key, Object value) {
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
    TagsInner tagsInner = (TagsInner) o;
    return Objects.equals(this.count, tagsInner.count) &&
        Objects.equals(this.hasSynonyms, tagsInner.hasSynonyms) &&
        Objects.equals(this.isModeratorOnly, tagsInner.isModeratorOnly) &&
        Objects.equals(this.isRequired, tagsInner.isRequired) &&
        Objects.equals(this.lastActivityDate, tagsInner.lastActivityDate) &&
        Objects.equals(this.name, tagsInner.name) &&
        Objects.equals(this.synonyms, tagsInner.synonyms) &&
        Objects.equals(this.userId, tagsInner.userId)&&
        Objects.equals(this.additionalProperties, tagsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, hasSynonyms, isModeratorOnly, isRequired, lastActivityDate, name, synonyms, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagsInner {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    hasSynonyms: ").append(toIndentedString(hasSynonyms)).append("\n");
    sb.append("    isModeratorOnly: ").append(toIndentedString(isModeratorOnly)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("has_synonyms");
    openapiFields.add("is_moderator_only");
    openapiFields.add("is_required");
    openapiFields.add("last_activity_date");
    openapiFields.add("name");
    openapiFields.add("synonyms");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TagsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TagsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TagsInner is not found in the empty JSON string", TagsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("synonyms") != null && !jsonObj.get("synonyms").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `synonyms` to be an array in the JSON string but got `%s`", jsonObj.get("synonyms").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TagsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TagsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TagsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TagsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TagsInner>() {
           @Override
           public void write(JsonWriter out, TagsInner value) throws IOException {
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
           public TagsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TagsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TagsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TagsInner
  * @throws IOException if the JSON string is invalid with respect to TagsInner
  */
  public static TagsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TagsInner.class);
  }

 /**
  * Convert an instance of TagsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

