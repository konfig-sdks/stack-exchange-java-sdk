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
 * TopTagObjectsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TopTagObjectsInner {
  public static final String SERIALIZED_NAME_ANSWER_COUNT = "answer_count";
  @SerializedName(SERIALIZED_NAME_ANSWER_COUNT)
  private Integer answerCount;

  public static final String SERIALIZED_NAME_ANSWER_SCORE = "answer_score";
  @SerializedName(SERIALIZED_NAME_ANSWER_SCORE)
  private Integer answerScore;

  public static final String SERIALIZED_NAME_QUESTION_COUNT = "question_count";
  @SerializedName(SERIALIZED_NAME_QUESTION_COUNT)
  private Integer questionCount;

  public static final String SERIALIZED_NAME_QUESTION_SCORE = "question_score";
  @SerializedName(SERIALIZED_NAME_QUESTION_SCORE)
  private Integer questionScore;

  public static final String SERIALIZED_NAME_TAG_NAME = "tag_name";
  @SerializedName(SERIALIZED_NAME_TAG_NAME)
  private String tagName;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public TopTagObjectsInner() {
  }

  public TopTagObjectsInner answerCount(Integer answerCount) {
    
    
    
    
    this.answerCount = answerCount;
    return this;
  }

   /**
   * Get answerCount
   * @return answerCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAnswerCount() {
    return answerCount;
  }


  public void setAnswerCount(Integer answerCount) {
    
    
    
    this.answerCount = answerCount;
  }


  public TopTagObjectsInner answerScore(Integer answerScore) {
    
    
    
    
    this.answerScore = answerScore;
    return this;
  }

   /**
   * Get answerScore
   * @return answerScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAnswerScore() {
    return answerScore;
  }


  public void setAnswerScore(Integer answerScore) {
    
    
    
    this.answerScore = answerScore;
  }


  public TopTagObjectsInner questionCount(Integer questionCount) {
    
    
    
    
    this.questionCount = questionCount;
    return this;
  }

   /**
   * Get questionCount
   * @return questionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuestionCount() {
    return questionCount;
  }


  public void setQuestionCount(Integer questionCount) {
    
    
    
    this.questionCount = questionCount;
  }


  public TopTagObjectsInner questionScore(Integer questionScore) {
    
    
    
    
    this.questionScore = questionScore;
    return this;
  }

   /**
   * Get questionScore
   * @return questionScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuestionScore() {
    return questionScore;
  }


  public void setQuestionScore(Integer questionScore) {
    
    
    
    this.questionScore = questionScore;
  }


  public TopTagObjectsInner tagName(String tagName) {
    
    
    
    
    this.tagName = tagName;
    return this;
  }

   /**
   * Get tagName
   * @return tagName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTagName() {
    return tagName;
  }


  public void setTagName(String tagName) {
    
    
    
    this.tagName = tagName;
  }


  public TopTagObjectsInner userId(Integer userId) {
    
    
    
    
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
   * @return the TopTagObjectsInner instance itself
   */
  public TopTagObjectsInner putAdditionalProperty(String key, Object value) {
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
    TopTagObjectsInner topTagObjectsInner = (TopTagObjectsInner) o;
    return Objects.equals(this.answerCount, topTagObjectsInner.answerCount) &&
        Objects.equals(this.answerScore, topTagObjectsInner.answerScore) &&
        Objects.equals(this.questionCount, topTagObjectsInner.questionCount) &&
        Objects.equals(this.questionScore, topTagObjectsInner.questionScore) &&
        Objects.equals(this.tagName, topTagObjectsInner.tagName) &&
        Objects.equals(this.userId, topTagObjectsInner.userId)&&
        Objects.equals(this.additionalProperties, topTagObjectsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answerCount, answerScore, questionCount, questionScore, tagName, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopTagObjectsInner {\n");
    sb.append("    answerCount: ").append(toIndentedString(answerCount)).append("\n");
    sb.append("    answerScore: ").append(toIndentedString(answerScore)).append("\n");
    sb.append("    questionCount: ").append(toIndentedString(questionCount)).append("\n");
    sb.append("    questionScore: ").append(toIndentedString(questionScore)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
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
    openapiFields.add("answer_count");
    openapiFields.add("answer_score");
    openapiFields.add("question_count");
    openapiFields.add("question_score");
    openapiFields.add("tag_name");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TopTagObjectsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TopTagObjectsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TopTagObjectsInner is not found in the empty JSON string", TopTagObjectsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("tag_name") != null && !jsonObj.get("tag_name").isJsonNull()) && !jsonObj.get("tag_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TopTagObjectsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TopTagObjectsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TopTagObjectsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TopTagObjectsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TopTagObjectsInner>() {
           @Override
           public void write(JsonWriter out, TopTagObjectsInner value) throws IOException {
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
           public TopTagObjectsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TopTagObjectsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TopTagObjectsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TopTagObjectsInner
  * @throws IOException if the JSON string is invalid with respect to TopTagObjectsInner
  */
  public static TopTagObjectsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TopTagObjectsInner.class);
  }

 /**
  * Convert an instance of TopTagObjectsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

