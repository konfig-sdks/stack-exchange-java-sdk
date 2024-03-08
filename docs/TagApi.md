# TagApi

All URIs are relative to *https://api.stackexchange.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFaqQuestions**](TagApi.md#getFaqQuestions) | **GET** /tags/{tags}/faq |  |
| [**getModeratorOnlyTagsList**](TagApi.md#getModeratorOnlyTagsList) | **GET** /tags/moderator-only |  |
| [**getRelatedTags**](TagApi.md#getRelatedTags) | **GET** /tags/{tags}/related |  |
| [**getTagInfo**](TagApi.md#getTagInfo) | **GET** /tags/{tags}/info |  |
| [**getTagWikis**](TagApi.md#getTagWikis) | **GET** /tags/{tags}/wikis |  |
| [**getTopAskersByPeriod**](TagApi.md#getTopAskersByPeriod) | **GET** /tags/{tag}/top-askers/{period} |  |
| [**getUserTagsList**](TagApi.md#getUserTagsList) | **GET** /me/tags |  |
| [**getUserTopQuestions**](TagApi.md#getUserTopQuestions) | **GET** /me/tags/{tags}/top-questions |  |
| [**getUserTopTagsList**](TagApi.md#getUserTopTagsList) | **GET** /me/top-question-tags |  |
| [**listRequiredTags**](TagApi.md#listRequiredTags) | **GET** /tags/required |  |
| [**listSynonyms**](TagApi.md#listSynonyms) | **GET** /tags/{tags}/synonyms |  |
| [**synonymsList**](TagApi.md#synonymsList) | **GET** /tags/synonyms |  |


<a name="getFaqQuestions"></a>
# **getFaqQuestions**
> List&lt;QuestionsInner&gt; getFaqQuestions(tags, site).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns the frequently asked questions for the given set of tags in {tags}.   For a question to be returned, it must have all the tags in {tags} and be considered \&quot;frequently asked\&quot;. The exact algorithm for determining whether a question is considered a FAQ is subject to change at any time.   {tags} can contain up to 5 individual tags per request.   This method returns a list of questions. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String tags = "tags_example"; // String list (semicolon delimited).
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<QuestionsInner> result = client
              .tag
              .getFaqQuestions(tags, site)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getFaqQuestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<QuestionsInner>> response = client
              .tag
              .getFaqQuestions(tags, site)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getFaqQuestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tags** | **String**| String list (semicolon delimited). | |
| **site** | **String**| Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \&quot;stackoverflow.com\&quot;), or a short form identified by api_site_parameter on the site object.  | |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |

### Return type

[**List&lt;QuestionsInner&gt;**](QuestionsInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | bad_parameter Ã¢â‚¬â€œ 400 An invalid parameter was passed, this includes even \&quot;high level\&quot; parameters like key or site.  |  -  |
| **401** | access_token_required Ã¢â‚¬â€œ 401 A method that requires an access token (obtained via authentication) was called without one.  |  -  |
| **402** | invalid_access_token Ã¢â‚¬â€œ 402 An invalid access token was passed to a method.  |  -  |
| **403** | access_denied Ã¢â‚¬â€œ 403 A method which requires certain permissions was called with an access token that lacks those permissions.  |  -  |
| **404** | no_method Ã¢â‚¬â€œ 404 An attempt was made to call a method that does not exist. Note, calling methods that expect numeric ids (like /users/{ids}) with non-numeric ids can also result in this error.  |  -  |
| **405** | key_required Ã¢â‚¬â€œ 405 A method was called in a manner that requires an application key (generally, with an access token), but no key was passed.  |  -  |
| **406** | access_token_compromised Ã¢â‚¬â€œ 406 An access token is no longer believed to be secure, normally because it was used on a non-HTTPS call. The access token will be invalidated if this error is returned.  |  -  |
| **500** | internal_error Ã¢â‚¬â€œ 500 An unexpected error occurred in the API. It has been logged, and Stack Exchange developers have been notified. You should report these errors on Stack Apps if you want to be notified when they&#39;re fixed.  |  -  |
| **502** | throttle_violation Ã¢â‚¬â€œ 502 An application has violated part of the rate limiting contract, so the request was terminated.  |  -  |
| **503** | temporarily_unavailable Ã¢â‚¬â€œ 503 Some or all of the API is unavailable. Applications should backoff on requests to the method invoked.  |  -  |

<a name="getModeratorOnlyTagsList"></a>
# **getModeratorOnlyTagsList**
> List&lt;TagsInner&gt; getModeratorOnlyTagsList(site).inname(inname).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns the tags found on a site that only moderators can use.   The inname parameter lets a consumer filter down to tags that contain a certain substring. For example, inname&#x3D;own would return both \&quot;download\&quot; and \&quot;owner\&quot; amongst others.   This method returns a list of tags.   The sorts accepted by this method operate on the follow fields of the tag object:  - popular - count  - activity - the creation_date of the last question asked with the tag  - name - name   popular is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    String inname = "inname_example";
    String order = "desc";
    String max = "max_example"; // sort = popular => number sort = activity => date sort = name => string 
    String min = "min_example"; // sort = popular => number sort = activity => date sort = name => string 
    String sort = "popular";
    Integer fromdate = 56; // Unix date.
    Integer todate = 56; // Unix date.
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<TagsInner> result = client
              .tag
              .getModeratorOnlyTagsList(site)
              .inname(inname)
              .order(order)
              .max(max)
              .min(min)
              .sort(sort)
              .fromdate(fromdate)
              .todate(todate)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getModeratorOnlyTagsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TagsInner>> response = client
              .tag
              .getModeratorOnlyTagsList(site)
              .inname(inname)
              .order(order)
              .max(max)
              .min(min)
              .sort(sort)
              .fromdate(fromdate)
              .todate(todate)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getModeratorOnlyTagsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **site** | **String**| Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \&quot;stackoverflow.com\&quot;), or a short form identified by api_site_parameter on the site object.  | |
| **inname** | **String**|  | [optional] |
| **order** | **String**|  | [optional] [enum: desc, asc] |
| **max** | **String**| sort &#x3D; popular &#x3D;&gt; number sort &#x3D; activity &#x3D;&gt; date sort &#x3D; name &#x3D;&gt; string  | [optional] |
| **min** | **String**| sort &#x3D; popular &#x3D;&gt; number sort &#x3D; activity &#x3D;&gt; date sort &#x3D; name &#x3D;&gt; string  | [optional] |
| **sort** | **String**|  | [optional] [enum: popular, activity, name] |
| **fromdate** | **Integer**| Unix date. | [optional] |
| **todate** | **Integer**| Unix date. | [optional] |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |

### Return type

[**List&lt;TagsInner&gt;**](TagsInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | bad_parameter Ã¢â‚¬â€œ 400 An invalid parameter was passed, this includes even \&quot;high level\&quot; parameters like key or site.  |  -  |
| **401** | access_token_required Ã¢â‚¬â€œ 401 A method that requires an access token (obtained via authentication) was called without one.  |  -  |
| **402** | invalid_access_token Ã¢â‚¬â€œ 402 An invalid access token was passed to a method.  |  -  |
| **403** | access_denied Ã¢â‚¬â€œ 403 A method which requires certain permissions was called with an access token that lacks those permissions.  |  -  |
| **404** | no_method Ã¢â‚¬â€œ 404 An attempt was made to call a method that does not exist. Note, calling methods that expect numeric ids (like /users/{ids}) with non-numeric ids can also result in this error.  |  -  |
| **405** | key_required Ã¢â‚¬â€œ 405 A method was called in a manner that requires an application key (generally, with an access token), but no key was passed.  |  -  |
| **406** | access_token_compromised Ã¢â‚¬â€œ 406 An access token is no longer believed to be secure, normally because it was used on a non-HTTPS call. The access token will be invalidated if this error is returned.  |  -  |
| **500** | internal_error Ã¢â‚¬â€œ 500 An unexpected error occurred in the API. It has been logged, and Stack Exchange developers have been notified. You should report these errors on Stack Apps if you want to be notified when they&#39;re fixed.  |  -  |
| **502** | throttle_violation Ã¢â‚¬â€œ 502 An application has violated part of the rate limiting contract, so the request was terminated.  |  -  |
| **503** | temporarily_unavailable Ã¢â‚¬â€œ 503 Some or all of the API is unavailable. Applications should backoff on requests to the method invoked.  |  -  |

<a name="getRelatedTags"></a>
# **getRelatedTags**
> List&lt;TagsInner&gt; getRelatedTags(tags, site).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns the tags that are most related to those in {tags}.   Including multiple tags in {tags} is equivalent to asking for \&quot;tags related to tag #1 and tag #2\&quot; not \&quot;tags related to tag #1 or tag #2\&quot;.   count on tag objects returned is the number of question with that tag that also share all those in {tags}.   {tags} can contain up to 4 individual tags per request.   This method returns a list of tags. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String tags = "tags_example"; // String list (semicolon delimited).
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<TagsInner> result = client
              .tag
              .getRelatedTags(tags, site)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getRelatedTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TagsInner>> response = client
              .tag
              .getRelatedTags(tags, site)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getRelatedTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tags** | **String**| String list (semicolon delimited). | |
| **site** | **String**| Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \&quot;stackoverflow.com\&quot;), or a short form identified by api_site_parameter on the site object.  | |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |

### Return type

[**List&lt;TagsInner&gt;**](TagsInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | bad_parameter Ã¢â‚¬â€œ 400 An invalid parameter was passed, this includes even \&quot;high level\&quot; parameters like key or site.  |  -  |
| **401** | access_token_required Ã¢â‚¬â€œ 401 A method that requires an access token (obtained via authentication) was called without one.  |  -  |
| **402** | invalid_access_token Ã¢â‚¬â€œ 402 An invalid access token was passed to a method.  |  -  |
| **403** | access_denied Ã¢â‚¬â€œ 403 A method which requires certain permissions was called with an access token that lacks those permissions.  |  -  |
| **404** | no_method Ã¢â‚¬â€œ 404 An attempt was made to call a method that does not exist. Note, calling methods that expect numeric ids (like /users/{ids}) with non-numeric ids can also result in this error.  |  -  |
| **405** | key_required Ã¢â‚¬â€œ 405 A method was called in a manner that requires an application key (generally, with an access token), but no key was passed.  |  -  |
| **406** | access_token_compromised Ã¢â‚¬â€œ 406 An access token is no longer believed to be secure, normally because it was used on a non-HTTPS call. The access token will be invalidated if this error is returned.  |  -  |
| **500** | internal_error Ã¢â‚¬â€œ 500 An unexpected error occurred in the API. It has been logged, and Stack Exchange developers have been notified. You should report these errors on Stack Apps if you want to be notified when they&#39;re fixed.  |  -  |
| **502** | throttle_violation Ã¢â‚¬â€œ 502 An application has violated part of the rate limiting contract, so the request was terminated.  |  -  |
| **503** | temporarily_unavailable Ã¢â‚¬â€œ 503 Some or all of the API is unavailable. Applications should backoff on requests to the method invoked.  |  -  |

<a name="getTagInfo"></a>
# **getTagInfo**
> List&lt;TagsInner&gt; getTagInfo(tags, site).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns tag objects representing the tags in {tags} found on the site.   This method diverges from the standard naming patterns to avoid to conflicting with existing methods, due to the free form nature of tag names.   This method returns a list of tags.   The sorts accepted by this method operate on the follow fields of the tag object:  - popular - count  - activity - the creation_date of the last question asked with the tag  - name - name   popular is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String tags = "tags_example"; // String list (semicolon delimited).
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    String order = "desc";
    String max = "max_example"; // sort = popular => number sort = activity => date sort = name => string 
    String min = "min_example"; // sort = popular => number sort = activity => date sort = name => string 
    String sort = "popular";
    Integer fromdate = 56; // Unix date.
    Integer todate = 56; // Unix date.
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<TagsInner> result = client
              .tag
              .getTagInfo(tags, site)
              .order(order)
              .max(max)
              .min(min)
              .sort(sort)
              .fromdate(fromdate)
              .todate(todate)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getTagInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TagsInner>> response = client
              .tag
              .getTagInfo(tags, site)
              .order(order)
              .max(max)
              .min(min)
              .sort(sort)
              .fromdate(fromdate)
              .todate(todate)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getTagInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tags** | **String**| String list (semicolon delimited). | |
| **site** | **String**| Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \&quot;stackoverflow.com\&quot;), or a short form identified by api_site_parameter on the site object.  | |
| **order** | **String**|  | [optional] [enum: desc, asc] |
| **max** | **String**| sort &#x3D; popular &#x3D;&gt; number sort &#x3D; activity &#x3D;&gt; date sort &#x3D; name &#x3D;&gt; string  | [optional] |
| **min** | **String**| sort &#x3D; popular &#x3D;&gt; number sort &#x3D; activity &#x3D;&gt; date sort &#x3D; name &#x3D;&gt; string  | [optional] |
| **sort** | **String**|  | [optional] [enum: popular, activity, name] |
| **fromdate** | **Integer**| Unix date. | [optional] |
| **todate** | **Integer**| Unix date. | [optional] |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |

### Return type

[**List&lt;TagsInner&gt;**](TagsInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | bad_parameter Ã¢â‚¬â€œ 400 An invalid parameter was passed, this includes even \&quot;high level\&quot; parameters like key or site.  |  -  |
| **401** | access_token_required Ã¢â‚¬â€œ 401 A method that requires an access token (obtained via authentication) was called without one.  |  -  |
| **402** | invalid_access_token Ã¢â‚¬â€œ 402 An invalid access token was passed to a method.  |  -  |
| **403** | access_denied Ã¢â‚¬â€œ 403 A method which requires certain permissions was called with an access token that lacks those permissions.  |  -  |
| **404** | no_method Ã¢â‚¬â€œ 404 An attempt was made to call a method that does not exist. Note, calling methods that expect numeric ids (like /users/{ids}) with non-numeric ids can also result in this error.  |  -  |
| **405** | key_required Ã¢â‚¬â€œ 405 A method was called in a manner that requires an application key (generally, with an access token), but no key was passed.  |  -  |
| **406** | access_token_compromised Ã¢â‚¬â€œ 406 An access token is no longer believed to be secure, normally because it was used on a non-HTTPS call. The access token will be invalidated if this error is returned.  |  -  |
| **500** | internal_error Ã¢â‚¬â€œ 500 An unexpected error occurred in the API. It has been logged, and Stack Exchange developers have been notified. You should report these errors on Stack Apps if you want to be notified when they&#39;re fixed.  |  -  |
| **502** | throttle_violation Ã¢â‚¬â€œ 502 An application has violated part of the rate limiting contract, so the request was terminated.  |  -  |
| **503** | temporarily_unavailable Ã¢â‚¬â€œ 503 Some or all of the API is unavailable. Applications should backoff on requests to the method invoked.  |  -  |

<a name="getTagWikis"></a>
# **getTagWikis**
> List&lt;TagWikisInner&gt; getTagWikis(tags, site).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns the wikis that go with the given set of tags in {tags}.   Be aware that not all tags have wikis.   {tags} can contain up to 20 individual tags per request.   This method returns a list of tag wikis. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String tags = "tags_example"; // String list (semicolon delimited).
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<TagWikisInner> result = client
              .tag
              .getTagWikis(tags, site)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getTagWikis");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TagWikisInner>> response = client
              .tag
              .getTagWikis(tags, site)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getTagWikis");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tags** | **String**| String list (semicolon delimited). | |
| **site** | **String**| Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \&quot;stackoverflow.com\&quot;), or a short form identified by api_site_parameter on the site object.  | |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |

### Return type

[**List&lt;TagWikisInner&gt;**](TagWikisInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | bad_parameter Ã¢â‚¬â€œ 400 An invalid parameter was passed, this includes even \&quot;high level\&quot; parameters like key or site.  |  -  |
| **401** | access_token_required Ã¢â‚¬â€œ 401 A method that requires an access token (obtained via authentication) was called without one.  |  -  |
| **402** | invalid_access_token Ã¢â‚¬â€œ 402 An invalid access token was passed to a method.  |  -  |
| **403** | access_denied Ã¢â‚¬â€œ 403 A method which requires certain permissions was called with an access token that lacks those permissions.  |  -  |
| **404** | no_method Ã¢â‚¬â€œ 404 An attempt was made to call a method that does not exist. Note, calling methods that expect numeric ids (like /users/{ids}) with non-numeric ids can also result in this error.  |  -  |
| **405** | key_required Ã¢â‚¬â€œ 405 A method was called in a manner that requires an application key (generally, with an access token), but no key was passed.  |  -  |
| **406** | access_token_compromised Ã¢â‚¬â€œ 406 An access token is no longer believed to be secure, normally because it was used on a non-HTTPS call. The access token will be invalidated if this error is returned.  |  -  |
| **500** | internal_error Ã¢â‚¬â€œ 500 An unexpected error occurred in the API. It has been logged, and Stack Exchange developers have been notified. You should report these errors on Stack Apps if you want to be notified when they&#39;re fixed.  |  -  |
| **502** | throttle_violation Ã¢â‚¬â€œ 502 An application has violated part of the rate limiting contract, so the request was terminated.  |  -  |
| **503** | temporarily_unavailable Ã¢â‚¬â€œ 503 Some or all of the API is unavailable. Applications should backoff on requests to the method invoked.  |  -  |

<a name="getTopAskersByPeriod"></a>
# **getTopAskersByPeriod**
> List&lt;TagScoreObjectsInner&gt; getTopAskersByPeriod(tag, period, site).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns the top 30 askers active in a single tag, of either all-time or the last 30 days.   This is a view onto the data presented on the tag info page on the sites.   This method returns a list of tag score objects. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String tag = "tag_example";
    String period = "all_time";
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<TagScoreObjectsInner> result = client
              .tag
              .getTopAskersByPeriod(tag, period, site)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getTopAskersByPeriod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TagScoreObjectsInner>> response = client
              .tag
              .getTopAskersByPeriod(tag, period, site)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getTopAskersByPeriod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tag** | **String**|  | |
| **period** | **String**|  | [enum: all_time, month] |
| **site** | **String**| Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \&quot;stackoverflow.com\&quot;), or a short form identified by api_site_parameter on the site object.  | |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |

### Return type

[**List&lt;TagScoreObjectsInner&gt;**](TagScoreObjectsInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | bad_parameter Ã¢â‚¬â€œ 400 An invalid parameter was passed, this includes even \&quot;high level\&quot; parameters like key or site.  |  -  |
| **401** | access_token_required Ã¢â‚¬â€œ 401 A method that requires an access token (obtained via authentication) was called without one.  |  -  |
| **402** | invalid_access_token Ã¢â‚¬â€œ 402 An invalid access token was passed to a method.  |  -  |
| **403** | access_denied Ã¢â‚¬â€œ 403 A method which requires certain permissions was called with an access token that lacks those permissions.  |  -  |
| **404** | no_method Ã¢â‚¬â€œ 404 An attempt was made to call a method that does not exist. Note, calling methods that expect numeric ids (like /users/{ids}) with non-numeric ids can also result in this error.  |  -  |
| **405** | key_required Ã¢â‚¬â€œ 405 A method was called in a manner that requires an application key (generally, with an access token), but no key was passed.  |  -  |
| **406** | access_token_compromised Ã¢â‚¬â€œ 406 An access token is no longer believed to be secure, normally because it was used on a non-HTTPS call. The access token will be invalidated if this error is returned.  |  -  |
| **500** | internal_error Ã¢â‚¬â€œ 500 An unexpected error occurred in the API. It has been logged, and Stack Exchange developers have been notified. You should report these errors on Stack Apps if you want to be notified when they&#39;re fixed.  |  -  |
| **502** | throttle_violation Ã¢â‚¬â€œ 502 An application has violated part of the rate limiting contract, so the request was terminated.  |  -  |
| **503** | temporarily_unavailable Ã¢â‚¬â€œ 503 Some or all of the API is unavailable. Applications should backoff on requests to the method invoked.  |  -  |

<a name="getUserTagsList"></a>
# **getUserTagsList**
> List&lt;TagsInner&gt; getUserTagsList(site).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns the tags the user identified by the access_token passed is active in.   This method returns a list of tags. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    String order = "desc";
    String max = "max_example"; // sort = popular => number sort = activity => date sort = name => string 
    String min = "min_example"; // sort = popular => number sort = activity => date sort = name => string 
    String sort = "popular";
    Integer fromdate = 56; // Unix date.
    Integer todate = 56; // Unix date.
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<TagsInner> result = client
              .tag
              .getUserTagsList(site)
              .order(order)
              .max(max)
              .min(min)
              .sort(sort)
              .fromdate(fromdate)
              .todate(todate)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getUserTagsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TagsInner>> response = client
              .tag
              .getUserTagsList(site)
              .order(order)
              .max(max)
              .min(min)
              .sort(sort)
              .fromdate(fromdate)
              .todate(todate)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getUserTagsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **site** | **String**| Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \&quot;stackoverflow.com\&quot;), or a short form identified by api_site_parameter on the site object.  | |
| **order** | **String**|  | [optional] [enum: desc, asc] |
| **max** | **String**| sort &#x3D; popular &#x3D;&gt; number sort &#x3D; activity &#x3D;&gt; date sort &#x3D; name &#x3D;&gt; string  | [optional] |
| **min** | **String**| sort &#x3D; popular &#x3D;&gt; number sort &#x3D; activity &#x3D;&gt; date sort &#x3D; name &#x3D;&gt; string  | [optional] |
| **sort** | **String**|  | [optional] [enum: popular, activity, name] |
| **fromdate** | **Integer**| Unix date. | [optional] |
| **todate** | **Integer**| Unix date. | [optional] |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |

### Return type

[**List&lt;TagsInner&gt;**](TagsInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | bad_parameter Ã¢â‚¬â€œ 400 An invalid parameter was passed, this includes even \&quot;high level\&quot; parameters like key or site.  |  -  |
| **401** | access_token_required Ã¢â‚¬â€œ 401 A method that requires an access token (obtained via authentication) was called without one.  |  -  |
| **402** | invalid_access_token Ã¢â‚¬â€œ 402 An invalid access token was passed to a method.  |  -  |
| **403** | access_denied Ã¢â‚¬â€œ 403 A method which requires certain permissions was called with an access token that lacks those permissions.  |  -  |
| **404** | no_method Ã¢â‚¬â€œ 404 An attempt was made to call a method that does not exist. Note, calling methods that expect numeric ids (like /users/{ids}) with non-numeric ids can also result in this error.  |  -  |
| **405** | key_required Ã¢â‚¬â€œ 405 A method was called in a manner that requires an application key (generally, with an access token), but no key was passed.  |  -  |
| **406** | access_token_compromised Ã¢â‚¬â€œ 406 An access token is no longer believed to be secure, normally because it was used on a non-HTTPS call. The access token will be invalidated if this error is returned.  |  -  |
| **500** | internal_error Ã¢â‚¬â€œ 500 An unexpected error occurred in the API. It has been logged, and Stack Exchange developers have been notified. You should report these errors on Stack Apps if you want to be notified when they&#39;re fixed.  |  -  |
| **502** | throttle_violation Ã¢â‚¬â€œ 502 An application has violated part of the rate limiting contract, so the request was terminated.  |  -  |
| **503** | temporarily_unavailable Ã¢â‚¬â€œ 503 Some or all of the API is unavailable. Applications should backoff on requests to the method invoked.  |  -  |

<a name="getUserTopQuestions"></a>
# **getUserTopQuestions**
> List&lt;QuestionsInner&gt; getUserTopQuestions(tags, site).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns the top 30 questions the user associated with the given access_token has posted in response to questions with the given tags.   This method returns a list of questions. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String tags = "tags_example"; // String list (semicolon delimited).
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    String order = "desc";
    String max = "max_example"; // sort = activity => date sort = creation => date sort = votes => number sort = hot => none sort = week => none sort = month => none sort = relevance => none 
    String min = "min_example"; // sort = activity => date sort = creation => date sort = votes => number sort = hot => none sort = week => none sort = month => none sort = relevance => none 
    String sort = "activity";
    Integer fromdate = 56; // Unix date.
    Integer todate = 56; // Unix date.
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<QuestionsInner> result = client
              .tag
              .getUserTopQuestions(tags, site)
              .order(order)
              .max(max)
              .min(min)
              .sort(sort)
              .fromdate(fromdate)
              .todate(todate)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getUserTopQuestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<QuestionsInner>> response = client
              .tag
              .getUserTopQuestions(tags, site)
              .order(order)
              .max(max)
              .min(min)
              .sort(sort)
              .fromdate(fromdate)
              .todate(todate)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getUserTopQuestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tags** | **String**| String list (semicolon delimited). | |
| **site** | **String**| Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \&quot;stackoverflow.com\&quot;), or a short form identified by api_site_parameter on the site object.  | |
| **order** | **String**|  | [optional] [enum: desc, asc] |
| **max** | **String**| sort &#x3D; activity &#x3D;&gt; date sort &#x3D; creation &#x3D;&gt; date sort &#x3D; votes &#x3D;&gt; number sort &#x3D; hot &#x3D;&gt; none sort &#x3D; week &#x3D;&gt; none sort &#x3D; month &#x3D;&gt; none sort &#x3D; relevance &#x3D;&gt; none  | [optional] |
| **min** | **String**| sort &#x3D; activity &#x3D;&gt; date sort &#x3D; creation &#x3D;&gt; date sort &#x3D; votes &#x3D;&gt; number sort &#x3D; hot &#x3D;&gt; none sort &#x3D; week &#x3D;&gt; none sort &#x3D; month &#x3D;&gt; none sort &#x3D; relevance &#x3D;&gt; none  | [optional] |
| **sort** | **String**|  | [optional] [enum: activity, creation, votes, hot, week, month, relevance] |
| **fromdate** | **Integer**| Unix date. | [optional] |
| **todate** | **Integer**| Unix date. | [optional] |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |

### Return type

[**List&lt;QuestionsInner&gt;**](QuestionsInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | bad_parameter Ã¢â‚¬â€œ 400 An invalid parameter was passed, this includes even \&quot;high level\&quot; parameters like key or site.  |  -  |
| **401** | access_token_required Ã¢â‚¬â€œ 401 A method that requires an access token (obtained via authentication) was called without one.  |  -  |
| **402** | invalid_access_token Ã¢â‚¬â€œ 402 An invalid access token was passed to a method.  |  -  |
| **403** | access_denied Ã¢â‚¬â€œ 403 A method which requires certain permissions was called with an access token that lacks those permissions.  |  -  |
| **404** | no_method Ã¢â‚¬â€œ 404 An attempt was made to call a method that does not exist. Note, calling methods that expect numeric ids (like /users/{ids}) with non-numeric ids can also result in this error.  |  -  |
| **405** | key_required Ã¢â‚¬â€œ 405 A method was called in a manner that requires an application key (generally, with an access token), but no key was passed.  |  -  |
| **406** | access_token_compromised Ã¢â‚¬â€œ 406 An access token is no longer believed to be secure, normally because it was used on a non-HTTPS call. The access token will be invalidated if this error is returned.  |  -  |
| **500** | internal_error Ã¢â‚¬â€œ 500 An unexpected error occurred in the API. It has been logged, and Stack Exchange developers have been notified. You should report these errors on Stack Apps if you want to be notified when they&#39;re fixed.  |  -  |
| **502** | throttle_violation Ã¢â‚¬â€œ 502 An application has violated part of the rate limiting contract, so the request was terminated.  |  -  |
| **503** | temporarily_unavailable Ã¢â‚¬â€œ 503 Some or all of the API is unavailable. Applications should backoff on requests to the method invoked.  |  -  |

<a name="getUserTopTagsList"></a>
# **getUserTopTagsList**
> List&lt;TopTagObjectsInner&gt; getUserTopTagsList(site).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns the user identified by access_token&#39;s top 30 tags by question score.   This method returns a list of top tag objects. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<TopTagObjectsInner> result = client
              .tag
              .getUserTopTagsList(site)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getUserTopTagsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TopTagObjectsInner>> response = client
              .tag
              .getUserTopTagsList(site)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getUserTopTagsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **site** | **String**| Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \&quot;stackoverflow.com\&quot;), or a short form identified by api_site_parameter on the site object.  | |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |

### Return type

[**List&lt;TopTagObjectsInner&gt;**](TopTagObjectsInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | bad_parameter Ã¢â‚¬â€œ 400 An invalid parameter was passed, this includes even \&quot;high level\&quot; parameters like key or site.  |  -  |
| **401** | access_token_required Ã¢â‚¬â€œ 401 A method that requires an access token (obtained via authentication) was called without one.  |  -  |
| **402** | invalid_access_token Ã¢â‚¬â€œ 402 An invalid access token was passed to a method.  |  -  |
| **403** | access_denied Ã¢â‚¬â€œ 403 A method which requires certain permissions was called with an access token that lacks those permissions.  |  -  |
| **404** | no_method Ã¢â‚¬â€œ 404 An attempt was made to call a method that does not exist. Note, calling methods that expect numeric ids (like /users/{ids}) with non-numeric ids can also result in this error.  |  -  |
| **405** | key_required Ã¢â‚¬â€œ 405 A method was called in a manner that requires an application key (generally, with an access token), but no key was passed.  |  -  |
| **406** | access_token_compromised Ã¢â‚¬â€œ 406 An access token is no longer believed to be secure, normally because it was used on a non-HTTPS call. The access token will be invalidated if this error is returned.  |  -  |
| **500** | internal_error Ã¢â‚¬â€œ 500 An unexpected error occurred in the API. It has been logged, and Stack Exchange developers have been notified. You should report these errors on Stack Apps if you want to be notified when they&#39;re fixed.  |  -  |
| **502** | throttle_violation Ã¢â‚¬â€œ 502 An application has violated part of the rate limiting contract, so the request was terminated.  |  -  |
| **503** | temporarily_unavailable Ã¢â‚¬â€œ 503 Some or all of the API is unavailable. Applications should backoff on requests to the method invoked.  |  -  |

<a name="listRequiredTags"></a>
# **listRequiredTags**
> List&lt;TagsInner&gt; listRequiredTags(site).inname(inname).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns the tags found on a site that fulfill required tag constraints on questions.   The inname parameter lets a consumer filter down to tags that contain a certain substring. For example, inname&#x3D;own would return both \&quot;download\&quot; and \&quot;owner\&quot; amongst others.   This method returns a list of tags.   The sorts accepted by this method operate on the follow fields of the tag object:  - popular - count  - activity - the creation_date of the last question asked with the tag  - name - name   popular is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    String inname = "inname_example";
    String order = "desc";
    String max = "max_example"; // sort = popular => number sort = activity => date sort = name => string 
    String min = "min_example"; // sort = popular => number sort = activity => date sort = name => string 
    String sort = "popular";
    Integer fromdate = 56; // Unix date.
    Integer todate = 56; // Unix date.
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<TagsInner> result = client
              .tag
              .listRequiredTags(site)
              .inname(inname)
              .order(order)
              .max(max)
              .min(min)
              .sort(sort)
              .fromdate(fromdate)
              .todate(todate)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#listRequiredTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TagsInner>> response = client
              .tag
              .listRequiredTags(site)
              .inname(inname)
              .order(order)
              .max(max)
              .min(min)
              .sort(sort)
              .fromdate(fromdate)
              .todate(todate)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#listRequiredTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **site** | **String**| Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \&quot;stackoverflow.com\&quot;), or a short form identified by api_site_parameter on the site object.  | |
| **inname** | **String**|  | [optional] |
| **order** | **String**|  | [optional] [enum: desc, asc] |
| **max** | **String**| sort &#x3D; popular &#x3D;&gt; number sort &#x3D; activity &#x3D;&gt; date sort &#x3D; name &#x3D;&gt; string  | [optional] |
| **min** | **String**| sort &#x3D; popular &#x3D;&gt; number sort &#x3D; activity &#x3D;&gt; date sort &#x3D; name &#x3D;&gt; string  | [optional] |
| **sort** | **String**|  | [optional] [enum: popular, activity, name] |
| **fromdate** | **Integer**| Unix date. | [optional] |
| **todate** | **Integer**| Unix date. | [optional] |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |

### Return type

[**List&lt;TagsInner&gt;**](TagsInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | bad_parameter Ã¢â‚¬â€œ 400 An invalid parameter was passed, this includes even \&quot;high level\&quot; parameters like key or site.  |  -  |
| **401** | access_token_required Ã¢â‚¬â€œ 401 A method that requires an access token (obtained via authentication) was called without one.  |  -  |
| **402** | invalid_access_token Ã¢â‚¬â€œ 402 An invalid access token was passed to a method.  |  -  |
| **403** | access_denied Ã¢â‚¬â€œ 403 A method which requires certain permissions was called with an access token that lacks those permissions.  |  -  |
| **404** | no_method Ã¢â‚¬â€œ 404 An attempt was made to call a method that does not exist. Note, calling methods that expect numeric ids (like /users/{ids}) with non-numeric ids can also result in this error.  |  -  |
| **405** | key_required Ã¢â‚¬â€œ 405 A method was called in a manner that requires an application key (generally, with an access token), but no key was passed.  |  -  |
| **406** | access_token_compromised Ã¢â‚¬â€œ 406 An access token is no longer believed to be secure, normally because it was used on a non-HTTPS call. The access token will be invalidated if this error is returned.  |  -  |
| **500** | internal_error Ã¢â‚¬â€œ 500 An unexpected error occurred in the API. It has been logged, and Stack Exchange developers have been notified. You should report these errors on Stack Apps if you want to be notified when they&#39;re fixed.  |  -  |
| **502** | throttle_violation Ã¢â‚¬â€œ 502 An application has violated part of the rate limiting contract, so the request was terminated.  |  -  |
| **503** | temporarily_unavailable Ã¢â‚¬â€œ 503 Some or all of the API is unavailable. Applications should backoff on requests to the method invoked.  |  -  |

<a name="listSynonyms"></a>
# **listSynonyms**
> List&lt;TagSynonymsInner&gt; listSynonyms(tags, site).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Gets all the synonyms that point to the tags identified in {tags}. If you&#39;re looking to discover all the tag synonyms on a site, use the /tags/synonyms methods instead of call this method on all tags.   {tags} can contain up to 20 individual tags per request.   The sorts accepted by this method operate on the follow fields of the tag_synonym object:  - creation - creation_date  - applied - applied_count  - activity - last_applied_date   creation is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate.     This method returns a list of tag synonyms. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String tags = "tags_example"; // String list (semicolon delimited).
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    String order = "desc";
    String max = "max_example"; // sort = creation => date sort = applied => number sort = activity => date 
    String min = "min_example"; // sort = creation => date sort = applied => number sort = activity => date 
    String sort = "creation";
    Integer fromdate = 56; // Unix date.
    Integer todate = 56; // Unix date.
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<TagSynonymsInner> result = client
              .tag
              .listSynonyms(tags, site)
              .order(order)
              .max(max)
              .min(min)
              .sort(sort)
              .fromdate(fromdate)
              .todate(todate)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#listSynonyms");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TagSynonymsInner>> response = client
              .tag
              .listSynonyms(tags, site)
              .order(order)
              .max(max)
              .min(min)
              .sort(sort)
              .fromdate(fromdate)
              .todate(todate)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#listSynonyms");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tags** | **String**| String list (semicolon delimited). | |
| **site** | **String**| Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \&quot;stackoverflow.com\&quot;), or a short form identified by api_site_parameter on the site object.  | |
| **order** | **String**|  | [optional] [enum: desc, asc] |
| **max** | **String**| sort &#x3D; creation &#x3D;&gt; date sort &#x3D; applied &#x3D;&gt; number sort &#x3D; activity &#x3D;&gt; date  | [optional] |
| **min** | **String**| sort &#x3D; creation &#x3D;&gt; date sort &#x3D; applied &#x3D;&gt; number sort &#x3D; activity &#x3D;&gt; date  | [optional] |
| **sort** | **String**|  | [optional] [enum: creation, applied, activity] |
| **fromdate** | **Integer**| Unix date. | [optional] |
| **todate** | **Integer**| Unix date. | [optional] |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |

### Return type

[**List&lt;TagSynonymsInner&gt;**](TagSynonymsInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | bad_parameter Ã¢â‚¬â€œ 400 An invalid parameter was passed, this includes even \&quot;high level\&quot; parameters like key or site.  |  -  |
| **401** | access_token_required Ã¢â‚¬â€œ 401 A method that requires an access token (obtained via authentication) was called without one.  |  -  |
| **402** | invalid_access_token Ã¢â‚¬â€œ 402 An invalid access token was passed to a method.  |  -  |
| **403** | access_denied Ã¢â‚¬â€œ 403 A method which requires certain permissions was called with an access token that lacks those permissions.  |  -  |
| **404** | no_method Ã¢â‚¬â€œ 404 An attempt was made to call a method that does not exist. Note, calling methods that expect numeric ids (like /users/{ids}) with non-numeric ids can also result in this error.  |  -  |
| **405** | key_required Ã¢â‚¬â€œ 405 A method was called in a manner that requires an application key (generally, with an access token), but no key was passed.  |  -  |
| **406** | access_token_compromised Ã¢â‚¬â€œ 406 An access token is no longer believed to be secure, normally because it was used on a non-HTTPS call. The access token will be invalidated if this error is returned.  |  -  |
| **500** | internal_error Ã¢â‚¬â€œ 500 An unexpected error occurred in the API. It has been logged, and Stack Exchange developers have been notified. You should report these errors on Stack Apps if you want to be notified when they&#39;re fixed.  |  -  |
| **502** | throttle_violation Ã¢â‚¬â€œ 502 An application has violated part of the rate limiting contract, so the request was terminated.  |  -  |
| **503** | temporarily_unavailable Ã¢â‚¬â€œ 503 Some or all of the API is unavailable. Applications should backoff on requests to the method invoked.  |  -  |

<a name="synonymsList"></a>
# **synonymsList**
> List&lt;TagSynonymsInner&gt; synonymsList(site).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns all tag synonyms found a site.   When searching for synonyms of specific tags, it is better to use /tags/{tags}/synonyms over this method.   The sorts accepted by this method operate on the follow fields of the tag_synonym object:  - creation - creation_date  - applied - applied_count  - activity - last_applied_date   creation is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate.     This method returns a list of tag_synonyms. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TagApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    String order = "desc";
    String max = "max_example"; // sort = creation => date sort = applied => number sort = activity => date 
    String min = "min_example"; // sort = creation => date sort = applied => number sort = activity => date 
    String sort = "creation";
    Integer fromdate = 56; // Unix date.
    Integer todate = 56; // Unix date.
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<TagSynonymsInner> result = client
              .tag
              .synonymsList(site)
              .order(order)
              .max(max)
              .min(min)
              .sort(sort)
              .fromdate(fromdate)
              .todate(todate)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#synonymsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TagSynonymsInner>> response = client
              .tag
              .synonymsList(site)
              .order(order)
              .max(max)
              .min(min)
              .sort(sort)
              .fromdate(fromdate)
              .todate(todate)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#synonymsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **site** | **String**| Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \&quot;stackoverflow.com\&quot;), or a short form identified by api_site_parameter on the site object.  | |
| **order** | **String**|  | [optional] [enum: desc, asc] |
| **max** | **String**| sort &#x3D; creation &#x3D;&gt; date sort &#x3D; applied &#x3D;&gt; number sort &#x3D; activity &#x3D;&gt; date  | [optional] |
| **min** | **String**| sort &#x3D; creation &#x3D;&gt; date sort &#x3D; applied &#x3D;&gt; number sort &#x3D; activity &#x3D;&gt; date  | [optional] |
| **sort** | **String**|  | [optional] [enum: creation, applied, activity] |
| **fromdate** | **Integer**| Unix date. | [optional] |
| **todate** | **Integer**| Unix date. | [optional] |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |

### Return type

[**List&lt;TagSynonymsInner&gt;**](TagSynonymsInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | bad_parameter Ã¢â‚¬â€œ 400 An invalid parameter was passed, this includes even \&quot;high level\&quot; parameters like key or site.  |  -  |
| **401** | access_token_required Ã¢â‚¬â€œ 401 A method that requires an access token (obtained via authentication) was called without one.  |  -  |
| **402** | invalid_access_token Ã¢â‚¬â€œ 402 An invalid access token was passed to a method.  |  -  |
| **403** | access_denied Ã¢â‚¬â€œ 403 A method which requires certain permissions was called with an access token that lacks those permissions.  |  -  |
| **404** | no_method Ã¢â‚¬â€œ 404 An attempt was made to call a method that does not exist. Note, calling methods that expect numeric ids (like /users/{ids}) with non-numeric ids can also result in this error.  |  -  |
| **405** | key_required Ã¢â‚¬â€œ 405 A method was called in a manner that requires an application key (generally, with an access token), but no key was passed.  |  -  |
| **406** | access_token_compromised Ã¢â‚¬â€œ 406 An access token is no longer believed to be secure, normally because it was used on a non-HTTPS call. The access token will be invalidated if this error is returned.  |  -  |
| **500** | internal_error Ã¢â‚¬â€œ 500 An unexpected error occurred in the API. It has been logged, and Stack Exchange developers have been notified. You should report these errors on Stack Apps if you want to be notified when they&#39;re fixed.  |  -  |
| **502** | throttle_violation Ã¢â‚¬â€œ 502 An application has violated part of the rate limiting contract, so the request was terminated.  |  -  |
| **503** | temporarily_unavailable Ã¢â‚¬â€œ 503 Some or all of the API is unavailable. Applications should backoff on requests to the method invoked.  |  -  |

