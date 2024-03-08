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
 * TagSynonymsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TagSynonymsInner {
  public static final String SERIALIZED_NAME_APPLIED_COUNT = "applied_count";
  @SerializedName(SERIALIZED_NAME_APPLIED_COUNT)
  private Integer appliedCount;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private Integer creationDate;

  public static final String SERIALIZED_NAME_FROM_TAG = "from_tag";
  @SerializedName(SERIALIZED_NAME_FROM_TAG)
  private String fromTag;

  public static final String SERIALIZED_NAME_LAST_APPLIED_DATE = "last_applied_date";
  @SerializedName(SERIALIZED_NAME_LAST_APPLIED_DATE)
  private Integer lastAppliedDate;

  public static final String SERIALIZED_NAME_TO_TAG = "to_tag";
  @SerializedName(SERIALIZED_NAME_TO_TAG)
  private String toTag;

  public TagSynonymsInner() {
  }

  public TagSynonymsInner appliedCount(Integer appliedCount) {
    
    
    
    
    this.appliedCount = appliedCount;
    return this;
  }

   /**
   * Get appliedCount
   * @return appliedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAppliedCount() {
    return appliedCount;
  }


  public void setAppliedCount(Integer appliedCount) {
    
    
    
    this.appliedCount = appliedCount;
  }


  public TagSynonymsInner creationDate(Integer creationDate) {
    
    
    
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(Integer creationDate) {
    
    
    
    this.creationDate = creationDate;
  }


  public TagSynonymsInner fromTag(String fromTag) {
    
    
    
    
    this.fromTag = fromTag;
    return this;
  }

   /**
   * Get fromTag
   * @return fromTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFromTag() {
    return fromTag;
  }


  public void setFromTag(String fromTag) {
    
    
    
    this.fromTag = fromTag;
  }


  public TagSynonymsInner lastAppliedDate(Integer lastAppliedDate) {
    
    
    
    
    this.lastAppliedDate = lastAppliedDate;
    return this;
  }

   /**
   * Get lastAppliedDate
   * @return lastAppliedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastAppliedDate() {
    return lastAppliedDate;
  }


  public void setLastAppliedDate(Integer lastAppliedDate) {
    
    
    
    this.lastAppliedDate = lastAppliedDate;
  }


  public TagSynonymsInner toTag(String toTag) {
    
    
    
    
    this.toTag = toTag;
    return this;
  }

   /**
   * Get toTag
   * @return toTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getToTag() {
    return toTag;
  }


  public void setToTag(String toTag) {
    
    
    
    this.toTag = toTag;
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
   * @return the TagSynonymsInner instance itself
   */
  public TagSynonymsInner putAdditionalProperty(String key, Object value) {
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
    TagSynonymsInner tagSynonymsInner = (TagSynonymsInner) o;
    return Objects.equals(this.appliedCount, tagSynonymsInner.appliedCount) &&
        Objects.equals(this.creationDate, tagSynonymsInner.creationDate) &&
        Objects.equals(this.fromTag, tagSynonymsInner.fromTag) &&
        Objects.equals(this.lastAppliedDate, tagSynonymsInner.lastAppliedDate) &&
        Objects.equals(this.toTag, tagSynonymsInner.toTag)&&
        Objects.equals(this.additionalProperties, tagSynonymsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedCount, creationDate, fromTag, lastAppliedDate, toTag, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagSynonymsInner {\n");
    sb.append("    appliedCount: ").append(toIndentedString(appliedCount)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    fromTag: ").append(toIndentedString(fromTag)).append("\n");
    sb.append("    lastAppliedDate: ").append(toIndentedString(lastAppliedDate)).append("\n");
    sb.append("    toTag: ").append(toIndentedString(toTag)).append("\n");
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
    openapiFields.add("applied_count");
    openapiFields.add("creation_date");
    openapiFields.add("from_tag");
    openapiFields.add("last_applied_date");
    openapiFields.add("to_tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TagSynonymsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TagSynonymsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TagSynonymsInner is not found in the empty JSON string", TagSynonymsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("from_tag") != null && !jsonObj.get("from_tag").isJsonNull()) && !jsonObj.get("from_tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from_tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from_tag").toString()));
      }
      if ((jsonObj.get("to_tag") != null && !jsonObj.get("to_tag").isJsonNull()) && !jsonObj.get("to_tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to_tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to_tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TagSynonymsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TagSynonymsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TagSynonymsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TagSynonymsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TagSynonymsInner>() {
           @Override
           public void write(JsonWriter out, TagSynonymsInner value) throws IOException {
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
           public TagSynonymsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TagSynonymsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TagSynonymsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TagSynonymsInner
  * @throws IOException if the JSON string is invalid with respect to TagSynonymsInner
  */
  public static TagSynonymsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TagSynonymsInner.class);
  }

 /**
  * Convert an instance of TagSynonymsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

