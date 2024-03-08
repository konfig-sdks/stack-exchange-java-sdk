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
import com.konfigthis.client.model.InboxItemsInnerSiteStyling;
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
 * InboxItemsInnerSite
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InboxItemsInnerSite {
  public static final String SERIALIZED_NAME_ALIASES = "aliases";
  @SerializedName(SERIALIZED_NAME_ALIASES)
  private List<Object> aliases = null;

  public static final String SERIALIZED_NAME_API_SITE_PARAMETER = "api_site_parameter";
  @SerializedName(SERIALIZED_NAME_API_SITE_PARAMETER)
  private String apiSiteParameter;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private String audience;

  public static final String SERIALIZED_NAME_CLOSED_BETA_DATE = "closed_beta_date";
  @SerializedName(SERIALIZED_NAME_CLOSED_BETA_DATE)
  private Integer closedBetaDate;

  public static final String SERIALIZED_NAME_FAVICON_URL = "favicon_url";
  @SerializedName(SERIALIZED_NAME_FAVICON_URL)
  private String faviconUrl;

  public static final String SERIALIZED_NAME_HIGH_RESOLUTION_ICON_URL = "high_resolution_icon_url";
  @SerializedName(SERIALIZED_NAME_HIGH_RESOLUTION_ICON_URL)
  private String highResolutionIconUrl;

  public static final String SERIALIZED_NAME_ICON_URL = "icon_url";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl;

  public static final String SERIALIZED_NAME_LAUNCH_DATE = "launch_date";
  @SerializedName(SERIALIZED_NAME_LAUNCH_DATE)
  private Integer launchDate;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_MARKDOWN_EXTENSIONS = "markdown_extensions";
  @SerializedName(SERIALIZED_NAME_MARKDOWN_EXTENSIONS)
  private List<Object> markdownExtensions = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPEN_BETA_DATE = "open_beta_date";
  @SerializedName(SERIALIZED_NAME_OPEN_BETA_DATE)
  private Integer openBetaDate;

  public static final String SERIALIZED_NAME_RELATED_SITES = "related_sites";
  @SerializedName(SERIALIZED_NAME_RELATED_SITES)
  private List<Object> relatedSites = null;

  public static final String SERIALIZED_NAME_SITE_STATE = "site_state";
  @SerializedName(SERIALIZED_NAME_SITE_STATE)
  private String siteState;

  public static final String SERIALIZED_NAME_SITE_TYPE = "site_type";
  @SerializedName(SERIALIZED_NAME_SITE_TYPE)
  private String siteType;

  public static final String SERIALIZED_NAME_SITE_URL = "site_url";
  @SerializedName(SERIALIZED_NAME_SITE_URL)
  private String siteUrl;

  public static final String SERIALIZED_NAME_STYLING = "styling";
  @SerializedName(SERIALIZED_NAME_STYLING)
  private InboxItemsInnerSiteStyling styling;

  public static final String SERIALIZED_NAME_TWITTER_ACCOUNT = "twitter_account";
  @SerializedName(SERIALIZED_NAME_TWITTER_ACCOUNT)
  private String twitterAccount;

  public InboxItemsInnerSite() {
  }

  public InboxItemsInnerSite aliases(List<Object> aliases) {
    
    
    
    
    this.aliases = aliases;
    return this;
  }

  public InboxItemsInnerSite addAliasesItem(Object aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Get aliases
   * @return aliases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getAliases() {
    return aliases;
  }


  public void setAliases(List<Object> aliases) {
    
    
    
    this.aliases = aliases;
  }


  public InboxItemsInnerSite apiSiteParameter(String apiSiteParameter) {
    
    
    
    
    this.apiSiteParameter = apiSiteParameter;
    return this;
  }

   /**
   * Get apiSiteParameter
   * @return apiSiteParameter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiSiteParameter() {
    return apiSiteParameter;
  }


  public void setApiSiteParameter(String apiSiteParameter) {
    
    
    
    this.apiSiteParameter = apiSiteParameter;
  }


  public InboxItemsInnerSite audience(String audience) {
    
    
    
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAudience() {
    return audience;
  }


  public void setAudience(String audience) {
    
    
    
    this.audience = audience;
  }


  public InboxItemsInnerSite closedBetaDate(Integer closedBetaDate) {
    
    
    
    
    this.closedBetaDate = closedBetaDate;
    return this;
  }

   /**
   * Get closedBetaDate
   * @return closedBetaDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClosedBetaDate() {
    return closedBetaDate;
  }


  public void setClosedBetaDate(Integer closedBetaDate) {
    
    
    
    this.closedBetaDate = closedBetaDate;
  }


  public InboxItemsInnerSite faviconUrl(String faviconUrl) {
    
    
    
    
    this.faviconUrl = faviconUrl;
    return this;
  }

   /**
   * Get faviconUrl
   * @return faviconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFaviconUrl() {
    return faviconUrl;
  }


  public void setFaviconUrl(String faviconUrl) {
    
    
    
    this.faviconUrl = faviconUrl;
  }


  public InboxItemsInnerSite highResolutionIconUrl(String highResolutionIconUrl) {
    
    
    
    
    this.highResolutionIconUrl = highResolutionIconUrl;
    return this;
  }

   /**
   * Get highResolutionIconUrl
   * @return highResolutionIconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHighResolutionIconUrl() {
    return highResolutionIconUrl;
  }


  public void setHighResolutionIconUrl(String highResolutionIconUrl) {
    
    
    
    this.highResolutionIconUrl = highResolutionIconUrl;
  }


  public InboxItemsInnerSite iconUrl(String iconUrl) {
    
    
    
    
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * Get iconUrl
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIconUrl() {
    return iconUrl;
  }


  public void setIconUrl(String iconUrl) {
    
    
    
    this.iconUrl = iconUrl;
  }


  public InboxItemsInnerSite launchDate(Integer launchDate) {
    
    
    
    
    this.launchDate = launchDate;
    return this;
  }

   /**
   * Get launchDate
   * @return launchDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLaunchDate() {
    return launchDate;
  }


  public void setLaunchDate(Integer launchDate) {
    
    
    
    this.launchDate = launchDate;
  }


  public InboxItemsInnerSite logoUrl(String logoUrl) {
    
    
    
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    
    
    
    this.logoUrl = logoUrl;
  }


  public InboxItemsInnerSite markdownExtensions(List<Object> markdownExtensions) {
    
    
    
    
    this.markdownExtensions = markdownExtensions;
    return this;
  }

  public InboxItemsInnerSite addMarkdownExtensionsItem(Object markdownExtensionsItem) {
    if (this.markdownExtensions == null) {
      this.markdownExtensions = new ArrayList<>();
    }
    this.markdownExtensions.add(markdownExtensionsItem);
    return this;
  }

   /**
   * Get markdownExtensions
   * @return markdownExtensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getMarkdownExtensions() {
    return markdownExtensions;
  }


  public void setMarkdownExtensions(List<Object> markdownExtensions) {
    
    
    
    this.markdownExtensions = markdownExtensions;
  }


  public InboxItemsInnerSite name(String name) {
    
    
    
    
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


  public InboxItemsInnerSite openBetaDate(Integer openBetaDate) {
    
    
    
    
    this.openBetaDate = openBetaDate;
    return this;
  }

   /**
   * Get openBetaDate
   * @return openBetaDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOpenBetaDate() {
    return openBetaDate;
  }


  public void setOpenBetaDate(Integer openBetaDate) {
    
    
    
    this.openBetaDate = openBetaDate;
  }


  public InboxItemsInnerSite relatedSites(List<Object> relatedSites) {
    
    
    
    
    this.relatedSites = relatedSites;
    return this;
  }

  public InboxItemsInnerSite addRelatedSitesItem(Object relatedSitesItem) {
    if (this.relatedSites == null) {
      this.relatedSites = new ArrayList<>();
    }
    this.relatedSites.add(relatedSitesItem);
    return this;
  }

   /**
   * Get relatedSites
   * @return relatedSites
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getRelatedSites() {
    return relatedSites;
  }


  public void setRelatedSites(List<Object> relatedSites) {
    
    
    
    this.relatedSites = relatedSites;
  }


  public InboxItemsInnerSite siteState(String siteState) {
    
    
    
    
    this.siteState = siteState;
    return this;
  }

   /**
   * Get siteState
   * @return siteState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSiteState() {
    return siteState;
  }


  public void setSiteState(String siteState) {
    
    
    
    this.siteState = siteState;
  }


  public InboxItemsInnerSite siteType(String siteType) {
    
    
    
    
    this.siteType = siteType;
    return this;
  }

   /**
   * Get siteType
   * @return siteType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSiteType() {
    return siteType;
  }


  public void setSiteType(String siteType) {
    
    
    
    this.siteType = siteType;
  }


  public InboxItemsInnerSite siteUrl(String siteUrl) {
    
    
    
    
    this.siteUrl = siteUrl;
    return this;
  }

   /**
   * Get siteUrl
   * @return siteUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSiteUrl() {
    return siteUrl;
  }


  public void setSiteUrl(String siteUrl) {
    
    
    
    this.siteUrl = siteUrl;
  }


  public InboxItemsInnerSite styling(InboxItemsInnerSiteStyling styling) {
    
    
    
    
    this.styling = styling;
    return this;
  }

   /**
   * Get styling
   * @return styling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InboxItemsInnerSiteStyling getStyling() {
    return styling;
  }


  public void setStyling(InboxItemsInnerSiteStyling styling) {
    
    
    
    this.styling = styling;
  }


  public InboxItemsInnerSite twitterAccount(String twitterAccount) {
    
    
    
    
    this.twitterAccount = twitterAccount;
    return this;
  }

   /**
   * Get twitterAccount
   * @return twitterAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTwitterAccount() {
    return twitterAccount;
  }


  public void setTwitterAccount(String twitterAccount) {
    
    
    
    this.twitterAccount = twitterAccount;
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
   * @return the InboxItemsInnerSite instance itself
   */
  public InboxItemsInnerSite putAdditionalProperty(String key, Object value) {
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
    InboxItemsInnerSite inboxItemsInnerSite = (InboxItemsInnerSite) o;
    return Objects.equals(this.aliases, inboxItemsInnerSite.aliases) &&
        Objects.equals(this.apiSiteParameter, inboxItemsInnerSite.apiSiteParameter) &&
        Objects.equals(this.audience, inboxItemsInnerSite.audience) &&
        Objects.equals(this.closedBetaDate, inboxItemsInnerSite.closedBetaDate) &&
        Objects.equals(this.faviconUrl, inboxItemsInnerSite.faviconUrl) &&
        Objects.equals(this.highResolutionIconUrl, inboxItemsInnerSite.highResolutionIconUrl) &&
        Objects.equals(this.iconUrl, inboxItemsInnerSite.iconUrl) &&
        Objects.equals(this.launchDate, inboxItemsInnerSite.launchDate) &&
        Objects.equals(this.logoUrl, inboxItemsInnerSite.logoUrl) &&
        Objects.equals(this.markdownExtensions, inboxItemsInnerSite.markdownExtensions) &&
        Objects.equals(this.name, inboxItemsInnerSite.name) &&
        Objects.equals(this.openBetaDate, inboxItemsInnerSite.openBetaDate) &&
        Objects.equals(this.relatedSites, inboxItemsInnerSite.relatedSites) &&
        Objects.equals(this.siteState, inboxItemsInnerSite.siteState) &&
        Objects.equals(this.siteType, inboxItemsInnerSite.siteType) &&
        Objects.equals(this.siteUrl, inboxItemsInnerSite.siteUrl) &&
        Objects.equals(this.styling, inboxItemsInnerSite.styling) &&
        Objects.equals(this.twitterAccount, inboxItemsInnerSite.twitterAccount)&&
        Objects.equals(this.additionalProperties, inboxItemsInnerSite.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, apiSiteParameter, audience, closedBetaDate, faviconUrl, highResolutionIconUrl, iconUrl, launchDate, logoUrl, markdownExtensions, name, openBetaDate, relatedSites, siteState, siteType, siteUrl, styling, twitterAccount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboxItemsInnerSite {\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    apiSiteParameter: ").append(toIndentedString(apiSiteParameter)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    closedBetaDate: ").append(toIndentedString(closedBetaDate)).append("\n");
    sb.append("    faviconUrl: ").append(toIndentedString(faviconUrl)).append("\n");
    sb.append("    highResolutionIconUrl: ").append(toIndentedString(highResolutionIconUrl)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    launchDate: ").append(toIndentedString(launchDate)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    markdownExtensions: ").append(toIndentedString(markdownExtensions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openBetaDate: ").append(toIndentedString(openBetaDate)).append("\n");
    sb.append("    relatedSites: ").append(toIndentedString(relatedSites)).append("\n");
    sb.append("    siteState: ").append(toIndentedString(siteState)).append("\n");
    sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
    sb.append("    siteUrl: ").append(toIndentedString(siteUrl)).append("\n");
    sb.append("    styling: ").append(toIndentedString(styling)).append("\n");
    sb.append("    twitterAccount: ").append(toIndentedString(twitterAccount)).append("\n");
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
    openapiFields.add("aliases");
    openapiFields.add("api_site_parameter");
    openapiFields.add("audience");
    openapiFields.add("closed_beta_date");
    openapiFields.add("favicon_url");
    openapiFields.add("high_resolution_icon_url");
    openapiFields.add("icon_url");
    openapiFields.add("launch_date");
    openapiFields.add("logo_url");
    openapiFields.add("markdown_extensions");
    openapiFields.add("name");
    openapiFields.add("open_beta_date");
    openapiFields.add("related_sites");
    openapiFields.add("site_state");
    openapiFields.add("site_type");
    openapiFields.add("site_url");
    openapiFields.add("styling");
    openapiFields.add("twitter_account");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InboxItemsInnerSite
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InboxItemsInnerSite.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InboxItemsInnerSite is not found in the empty JSON string", InboxItemsInnerSite.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("aliases") != null && !jsonObj.get("aliases").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `aliases` to be an array in the JSON string but got `%s`", jsonObj.get("aliases").toString()));
      }
      if ((jsonObj.get("api_site_parameter") != null && !jsonObj.get("api_site_parameter").isJsonNull()) && !jsonObj.get("api_site_parameter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_site_parameter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_site_parameter").toString()));
      }
      if ((jsonObj.get("audience") != null && !jsonObj.get("audience").isJsonNull()) && !jsonObj.get("audience").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audience` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audience").toString()));
      }
      if ((jsonObj.get("favicon_url") != null && !jsonObj.get("favicon_url").isJsonNull()) && !jsonObj.get("favicon_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `favicon_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("favicon_url").toString()));
      }
      if ((jsonObj.get("high_resolution_icon_url") != null && !jsonObj.get("high_resolution_icon_url").isJsonNull()) && !jsonObj.get("high_resolution_icon_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `high_resolution_icon_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("high_resolution_icon_url").toString()));
      }
      if ((jsonObj.get("icon_url") != null && !jsonObj.get("icon_url").isJsonNull()) && !jsonObj.get("icon_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon_url").toString()));
      }
      if ((jsonObj.get("logo_url") != null && !jsonObj.get("logo_url").isJsonNull()) && !jsonObj.get("logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("markdown_extensions") != null && !jsonObj.get("markdown_extensions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `markdown_extensions` to be an array in the JSON string but got `%s`", jsonObj.get("markdown_extensions").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("related_sites") != null && !jsonObj.get("related_sites").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `related_sites` to be an array in the JSON string but got `%s`", jsonObj.get("related_sites").toString()));
      }
      if ((jsonObj.get("site_state") != null && !jsonObj.get("site_state").isJsonNull()) && !jsonObj.get("site_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `site_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("site_state").toString()));
      }
      if ((jsonObj.get("site_type") != null && !jsonObj.get("site_type").isJsonNull()) && !jsonObj.get("site_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `site_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("site_type").toString()));
      }
      if ((jsonObj.get("site_url") != null && !jsonObj.get("site_url").isJsonNull()) && !jsonObj.get("site_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `site_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("site_url").toString()));
      }
      // validate the optional field `styling`
      if (jsonObj.get("styling") != null && !jsonObj.get("styling").isJsonNull()) {
        InboxItemsInnerSiteStyling.validateJsonObject(jsonObj.getAsJsonObject("styling"));
      }
      if ((jsonObj.get("twitter_account") != null && !jsonObj.get("twitter_account").isJsonNull()) && !jsonObj.get("twitter_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twitter_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twitter_account").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InboxItemsInnerSite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InboxItemsInnerSite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InboxItemsInnerSite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InboxItemsInnerSite.class));

       return (TypeAdapter<T>) new TypeAdapter<InboxItemsInnerSite>() {
           @Override
           public void write(JsonWriter out, InboxItemsInnerSite value) throws IOException {
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
           public InboxItemsInnerSite read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InboxItemsInnerSite instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InboxItemsInnerSite given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InboxItemsInnerSite
  * @throws IOException if the JSON string is invalid with respect to InboxItemsInnerSite
  */
  public static InboxItemsInnerSite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InboxItemsInnerSite.class);
  }

 /**
  * Convert an instance of InboxItemsInnerSite to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

