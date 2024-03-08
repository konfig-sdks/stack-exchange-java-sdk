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
import com.konfigthis.client.model.InboxItemsInnerSite;
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
 * InboxItemsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InboxItemsInner {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ANSWER_ID = "answer_id";
  @SerializedName(SERIALIZED_NAME_ANSWER_ID)
  private Integer answerId;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_COMMENT_ID = "comment_id";
  @SerializedName(SERIALIZED_NAME_COMMENT_ID)
  private Integer commentId;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private Integer creationDate;

  public static final String SERIALIZED_NAME_IS_UNREAD = "is_unread";
  @SerializedName(SERIALIZED_NAME_IS_UNREAD)
  private Boolean isUnread;

  public static final String SERIALIZED_NAME_ITEM_TYPE = "item_type";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE)
  private String itemType;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_QUESTION_ID = "question_id";
  @SerializedName(SERIALIZED_NAME_QUESTION_ID)
  private Integer questionId;

  public static final String SERIALIZED_NAME_SITE = "site";
  @SerializedName(SERIALIZED_NAME_SITE)
  private InboxItemsInnerSite site;

  public InboxItemsInner() {
  }

  public InboxItemsInner title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public InboxItemsInner answerId(Integer answerId) {
    
    
    
    
    this.answerId = answerId;
    return this;
  }

   /**
   * Get answerId
   * @return answerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAnswerId() {
    return answerId;
  }


  public void setAnswerId(Integer answerId) {
    
    
    
    this.answerId = answerId;
  }


  public InboxItemsInner body(String body) {
    
    
    
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    
    
    
    this.body = body;
  }


  public InboxItemsInner commentId(Integer commentId) {
    
    
    
    
    this.commentId = commentId;
    return this;
  }

   /**
   * Get commentId
   * @return commentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCommentId() {
    return commentId;
  }


  public void setCommentId(Integer commentId) {
    
    
    
    this.commentId = commentId;
  }


  public InboxItemsInner creationDate(Integer creationDate) {
    
    
    
    
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


  public InboxItemsInner isUnread(Boolean isUnread) {
    
    
    
    
    this.isUnread = isUnread;
    return this;
  }

   /**
   * Get isUnread
   * @return isUnread
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsUnread() {
    return isUnread;
  }


  public void setIsUnread(Boolean isUnread) {
    
    
    
    this.isUnread = isUnread;
  }


  public InboxItemsInner itemType(String itemType) {
    
    
    
    
    this.itemType = itemType;
    return this;
  }

   /**
   * Get itemType
   * @return itemType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getItemType() {
    return itemType;
  }


  public void setItemType(String itemType) {
    
    
    
    this.itemType = itemType;
  }


  public InboxItemsInner link(String link) {
    
    
    
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    
    
    
    this.link = link;
  }


  public InboxItemsInner questionId(Integer questionId) {
    
    
    
    
    this.questionId = questionId;
    return this;
  }

   /**
   * Get questionId
   * @return questionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuestionId() {
    return questionId;
  }


  public void setQuestionId(Integer questionId) {
    
    
    
    this.questionId = questionId;
  }


  public InboxItemsInner site(InboxItemsInnerSite site) {
    
    
    
    
    this.site = site;
    return this;
  }

   /**
   * Get site
   * @return site
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InboxItemsInnerSite getSite() {
    return site;
  }


  public void setSite(InboxItemsInnerSite site) {
    
    
    
    this.site = site;
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
   * @return the InboxItemsInner instance itself
   */
  public InboxItemsInner putAdditionalProperty(String key, Object value) {
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
    InboxItemsInner inboxItemsInner = (InboxItemsInner) o;
    return Objects.equals(this.title, inboxItemsInner.title) &&
        Objects.equals(this.answerId, inboxItemsInner.answerId) &&
        Objects.equals(this.body, inboxItemsInner.body) &&
        Objects.equals(this.commentId, inboxItemsInner.commentId) &&
        Objects.equals(this.creationDate, inboxItemsInner.creationDate) &&
        Objects.equals(this.isUnread, inboxItemsInner.isUnread) &&
        Objects.equals(this.itemType, inboxItemsInner.itemType) &&
        Objects.equals(this.link, inboxItemsInner.link) &&
        Objects.equals(this.questionId, inboxItemsInner.questionId) &&
        Objects.equals(this.site, inboxItemsInner.site)&&
        Objects.equals(this.additionalProperties, inboxItemsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, answerId, body, commentId, creationDate, isUnread, itemType, link, questionId, site, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboxItemsInner {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    answerId: ").append(toIndentedString(answerId)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    isUnread: ").append(toIndentedString(isUnread)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("answer_id");
    openapiFields.add("body");
    openapiFields.add("comment_id");
    openapiFields.add("creation_date");
    openapiFields.add("is_unread");
    openapiFields.add("item_type");
    openapiFields.add("link");
    openapiFields.add("question_id");
    openapiFields.add("site");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InboxItemsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InboxItemsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InboxItemsInner is not found in the empty JSON string", InboxItemsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull()) && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if ((jsonObj.get("item_type") != null && !jsonObj.get("item_type").isJsonNull()) && !jsonObj.get("item_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_type").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      // validate the optional field `site`
      if (jsonObj.get("site") != null && !jsonObj.get("site").isJsonNull()) {
        InboxItemsInnerSite.validateJsonObject(jsonObj.getAsJsonObject("site"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InboxItemsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InboxItemsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InboxItemsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InboxItemsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<InboxItemsInner>() {
           @Override
           public void write(JsonWriter out, InboxItemsInner value) throws IOException {
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
           public InboxItemsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InboxItemsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InboxItemsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InboxItemsInner
  * @throws IOException if the JSON string is invalid with respect to InboxItemsInner
  */
  public static InboxItemsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InboxItemsInner.class);
  }

 /**
  * Convert an instance of InboxItemsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

