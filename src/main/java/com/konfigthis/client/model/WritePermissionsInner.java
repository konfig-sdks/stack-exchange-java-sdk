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
 * WritePermissionsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WritePermissionsInner {
  public static final String SERIALIZED_NAME_CAN_ADD = "can_add";
  @SerializedName(SERIALIZED_NAME_CAN_ADD)
  private Boolean canAdd;

  public static final String SERIALIZED_NAME_CAN_DELETE = "can_delete";
  @SerializedName(SERIALIZED_NAME_CAN_DELETE)
  private Boolean canDelete;

  public static final String SERIALIZED_NAME_CAN_EDIT = "can_edit";
  @SerializedName(SERIALIZED_NAME_CAN_EDIT)
  private Boolean canEdit;

  public static final String SERIALIZED_NAME_MAX_DAILY_ACTIONS = "max_daily_actions";
  @SerializedName(SERIALIZED_NAME_MAX_DAILY_ACTIONS)
  private Integer maxDailyActions;

  public static final String SERIALIZED_NAME_MIN_SECONDS_BETWEEN_ACTIONS = "min_seconds_between_actions";
  @SerializedName(SERIALIZED_NAME_MIN_SECONDS_BETWEEN_ACTIONS)
  private Integer minSecondsBetweenActions;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "object_type";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public WritePermissionsInner() {
  }

  public WritePermissionsInner canAdd(Boolean canAdd) {
    
    
    
    
    this.canAdd = canAdd;
    return this;
  }

   /**
   * Get canAdd
   * @return canAdd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanAdd() {
    return canAdd;
  }


  public void setCanAdd(Boolean canAdd) {
    
    
    
    this.canAdd = canAdd;
  }


  public WritePermissionsInner canDelete(Boolean canDelete) {
    
    
    
    
    this.canDelete = canDelete;
    return this;
  }

   /**
   * Get canDelete
   * @return canDelete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanDelete() {
    return canDelete;
  }


  public void setCanDelete(Boolean canDelete) {
    
    
    
    this.canDelete = canDelete;
  }


  public WritePermissionsInner canEdit(Boolean canEdit) {
    
    
    
    
    this.canEdit = canEdit;
    return this;
  }

   /**
   * Get canEdit
   * @return canEdit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanEdit() {
    return canEdit;
  }


  public void setCanEdit(Boolean canEdit) {
    
    
    
    this.canEdit = canEdit;
  }


  public WritePermissionsInner maxDailyActions(Integer maxDailyActions) {
    
    
    
    
    this.maxDailyActions = maxDailyActions;
    return this;
  }

   /**
   * Get maxDailyActions
   * @return maxDailyActions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxDailyActions() {
    return maxDailyActions;
  }


  public void setMaxDailyActions(Integer maxDailyActions) {
    
    
    
    this.maxDailyActions = maxDailyActions;
  }


  public WritePermissionsInner minSecondsBetweenActions(Integer minSecondsBetweenActions) {
    
    
    
    
    this.minSecondsBetweenActions = minSecondsBetweenActions;
    return this;
  }

   /**
   * Get minSecondsBetweenActions
   * @return minSecondsBetweenActions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinSecondsBetweenActions() {
    return minSecondsBetweenActions;
  }


  public void setMinSecondsBetweenActions(Integer minSecondsBetweenActions) {
    
    
    
    this.minSecondsBetweenActions = minSecondsBetweenActions;
  }


  public WritePermissionsInner objectType(String objectType) {
    
    
    
    
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObjectType() {
    return objectType;
  }


  public void setObjectType(String objectType) {
    
    
    
    this.objectType = objectType;
  }


  public WritePermissionsInner userId(Integer userId) {
    
    
    
    
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
   * @return the WritePermissionsInner instance itself
   */
  public WritePermissionsInner putAdditionalProperty(String key, Object value) {
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
    WritePermissionsInner writePermissionsInner = (WritePermissionsInner) o;
    return Objects.equals(this.canAdd, writePermissionsInner.canAdd) &&
        Objects.equals(this.canDelete, writePermissionsInner.canDelete) &&
        Objects.equals(this.canEdit, writePermissionsInner.canEdit) &&
        Objects.equals(this.maxDailyActions, writePermissionsInner.maxDailyActions) &&
        Objects.equals(this.minSecondsBetweenActions, writePermissionsInner.minSecondsBetweenActions) &&
        Objects.equals(this.objectType, writePermissionsInner.objectType) &&
        Objects.equals(this.userId, writePermissionsInner.userId)&&
        Objects.equals(this.additionalProperties, writePermissionsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canAdd, canDelete, canEdit, maxDailyActions, minSecondsBetweenActions, objectType, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WritePermissionsInner {\n");
    sb.append("    canAdd: ").append(toIndentedString(canAdd)).append("\n");
    sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
    sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
    sb.append("    maxDailyActions: ").append(toIndentedString(maxDailyActions)).append("\n");
    sb.append("    minSecondsBetweenActions: ").append(toIndentedString(minSecondsBetweenActions)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
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
    openapiFields.add("can_add");
    openapiFields.add("can_delete");
    openapiFields.add("can_edit");
    openapiFields.add("max_daily_actions");
    openapiFields.add("min_seconds_between_actions");
    openapiFields.add("object_type");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WritePermissionsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WritePermissionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WritePermissionsInner is not found in the empty JSON string", WritePermissionsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("object_type") != null && !jsonObj.get("object_type").isJsonNull()) && !jsonObj.get("object_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WritePermissionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WritePermissionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WritePermissionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WritePermissionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<WritePermissionsInner>() {
           @Override
           public void write(JsonWriter out, WritePermissionsInner value) throws IOException {
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
           public WritePermissionsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WritePermissionsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WritePermissionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WritePermissionsInner
  * @throws IOException if the JSON string is invalid with respect to WritePermissionsInner
  */
  public static WritePermissionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WritePermissionsInner.class);
  }

 /**
  * Convert an instance of WritePermissionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
