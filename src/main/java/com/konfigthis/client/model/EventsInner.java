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
 * EventsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EventsInner {
  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private Integer creationDate;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_EXCERPT = "excerpt";
  @SerializedName(SERIALIZED_NAME_EXCERPT)
  private String excerpt;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_THE_ID_OF_THE_OBJECT_ANSWER_COMMA_COMMENT_COMMA_QUESTION_COMMA_OR_USER_THE_EVENT_DESCRIBES = "the id of the object (answer, comment, question, or user) the event describes";
  @SerializedName(SERIALIZED_NAME_THE_ID_OF_THE_OBJECT_ANSWER_COMMA_COMMENT_COMMA_QUESTION_COMMA_OR_USER_THE_EVENT_DESCRIBES)
  private Integer theIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes;

  public EventsInner() {
  }

  public EventsInner creationDate(Integer creationDate) {
    
    
    
    
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


  public EventsInner eventType(String eventType) {
    
    
    
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    
    
    
    this.eventType = eventType;
  }


  public EventsInner excerpt(String excerpt) {
    
    
    
    
    this.excerpt = excerpt;
    return this;
  }

   /**
   * Get excerpt
   * @return excerpt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExcerpt() {
    return excerpt;
  }


  public void setExcerpt(String excerpt) {
    
    
    
    this.excerpt = excerpt;
  }


  public EventsInner link(String link) {
    
    
    
    
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


  public EventsInner theIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes(Integer theIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes) {
    
    
    
    
    this.theIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes = theIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes;
    return this;
  }

   /**
   * Get theIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes
   * @return theIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTheIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes() {
    return theIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes;
  }


  public void setTheIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes(Integer theIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes) {
    
    
    
    this.theIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes = theIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes;
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
   * @return the EventsInner instance itself
   */
  public EventsInner putAdditionalProperty(String key, Object value) {
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
    EventsInner eventsInner = (EventsInner) o;
    return Objects.equals(this.creationDate, eventsInner.creationDate) &&
        Objects.equals(this.eventType, eventsInner.eventType) &&
        Objects.equals(this.excerpt, eventsInner.excerpt) &&
        Objects.equals(this.link, eventsInner.link) &&
        Objects.equals(this.theIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes, eventsInner.theIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes)&&
        Objects.equals(this.additionalProperties, eventsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, eventType, excerpt, link, theIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsInner {\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    excerpt: ").append(toIndentedString(excerpt)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    theIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes: ").append(toIndentedString(theIdOfTheObjectAnswerCommaCommentCommaQuestionCommaOrUserTheEventDescribes)).append("\n");
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
    openapiFields.add("creation_date");
    openapiFields.add("event_type");
    openapiFields.add("excerpt");
    openapiFields.add("link");
    openapiFields.add("the id of the object (answer, comment, question, or user) the event describes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EventsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EventsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventsInner is not found in the empty JSON string", EventsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("event_type") != null && !jsonObj.get("event_type").isJsonNull()) && !jsonObj.get("event_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_type").toString()));
      }
      if ((jsonObj.get("excerpt") != null && !jsonObj.get("excerpt").isJsonNull()) && !jsonObj.get("excerpt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `excerpt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("excerpt").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EventsInner>() {
           @Override
           public void write(JsonWriter out, EventsInner value) throws IOException {
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
           public EventsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EventsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EventsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventsInner
  * @throws IOException if the JSON string is invalid with respect to EventsInner
  */
  public static EventsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventsInner.class);
  }

 /**
  * Convert an instance of EventsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

