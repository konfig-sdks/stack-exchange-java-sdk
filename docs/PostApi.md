# PostApi

All URIs are relative to *https://api.stackexchange.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addComment**](PostApi.md#addComment) | **POST** /posts/{id}/comments/add |  |
| [**commentsByIdsGet**](PostApi.md#commentsByIdsGet) | **GET** /posts/{ids}/comments |  |
| [**getAllPosts**](PostApi.md#getAllPosts) | **GET** /posts |  |
| [**getPostRevisionsByIds**](PostApi.md#getPostRevisionsByIds) | **GET** /posts/{ids}/revisions |  |
| [**getPostsByIds**](PostApi.md#getPostsByIds) | **GET** /posts/{ids} |  |
| [**listSuggestedEdits**](PostApi.md#listSuggestedEdits) | **GET** /posts/{ids}/suggested-edits |  |


<a name="addComment"></a>
# **addComment**
> CreatedComment addComment(id, site).filter(filter).paramCallback(paramCallback).body(body).preview(preview).execute();



Create a new comment.   Use an access_token with write_access to create a new comment on a post.   This method returns the created comment. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PostApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    Integer id = 56;
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    String body = "body_example";
    Boolean preview = true;
    try {
      CreatedComment result = client
              .post
              .addComment(id, site)
              .filter(filter)
              .paramCallback(paramCallback)
              .body(body)
              .preview(preview)
              .execute();
      System.out.println(result);
      System.out.println(result.getBody());
      System.out.println(result.getBodyMarkdown());
      System.out.println(result.getCanFlag());
      System.out.println(result.getCommentId());
      System.out.println(result.getCreationDate());
      System.out.println(result.getEdited());
      System.out.println(result.getLink());
      System.out.println(result.getOwner());
      System.out.println(result.getPostId());
      System.out.println(result.getPostType());
      System.out.println(result.getReplyToUser());
      System.out.println(result.getScore());
      System.out.println(result.getUpvoted());
    } catch (ApiException e) {
      System.err.println("Exception when calling PostApi#addComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreatedComment> response = client
              .post
              .addComment(id, site)
              .filter(filter)
              .paramCallback(paramCallback)
              .body(body)
              .preview(preview)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PostApi#addComment");
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
| **id** | **Integer**|  | |
| **site** | **String**| Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \&quot;stackoverflow.com\&quot;), or a short form identified by api_site_parameter on the site object.  | |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |
| **body** | **String**|  | [optional] |
| **preview** | **Boolean**|  | [optional] |

### Return type

[**CreatedComment**](CreatedComment.md)

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

<a name="commentsByIdsGet"></a>
# **commentsByIdsGet**
> List&lt;CommentsInner&gt; commentsByIdsGet(ids, site).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Gets the comments on the posts identified in ids, regardless of the type of the posts.   This method is meant for cases when you are unsure of the type of the post id provided. Generally, this would be due to obtaining the post id directly from a user.   {ids} can contain up to 100 semicolon delimited ids, to find ids programatically look for post_id, answer_id, or question_id on post, answer, and question objects respectively.   The sorts accepted by this method operate on the follow fields of the comment object:  - creation - creation_date  - votes - score   creation is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate.     This method returns a list of comments. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PostApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String ids = "ids_example"; // Number list (semicolon delimited).
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    String order = "desc";
    String max = "max_example"; // sort = creation => date sort = votes => number 
    String min = "min_example"; // sort = creation => date sort = votes => number 
    String sort = "creation";
    Integer fromdate = 56; // Unix date.
    Integer todate = 56; // Unix date.
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<CommentsInner> result = client
              .post
              .commentsByIdsGet(ids, site)
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
      System.err.println("Exception when calling PostApi#commentsByIdsGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CommentsInner>> response = client
              .post
              .commentsByIdsGet(ids, site)
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
      System.err.println("Exception when calling PostApi#commentsByIdsGet");
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
| **ids** | **String**| Number list (semicolon delimited). | |
| **site** | **String**| Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \&quot;stackoverflow.com\&quot;), or a short form identified by api_site_parameter on the site object.  | |
| **order** | **String**|  | [optional] [enum: desc, asc] |
| **max** | **String**| sort &#x3D; creation &#x3D;&gt; date sort &#x3D; votes &#x3D;&gt; number  | [optional] |
| **min** | **String**| sort &#x3D; creation &#x3D;&gt; date sort &#x3D; votes &#x3D;&gt; number  | [optional] |
| **sort** | **String**|  | [optional] [enum: creation, votes] |
| **fromdate** | **Integer**| Unix date. | [optional] |
| **todate** | **Integer**| Unix date. | [optional] |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |

### Return type

[**List&lt;CommentsInner&gt;**](CommentsInner.md)

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

<a name="getAllPosts"></a>
# **getAllPosts**
> List&lt;PostsInner&gt; getAllPosts(site).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Fetches all posts (questions and answers) on the site.   In many ways this method is the union of /questions and /answers, returning both sets of data albeit only the common fields.   Most applications should use the question or answer specific methods, but /posts is available for those rare cases where any activity is of intereset. Examples of such queries would be: \&quot;all posts on Jan. 1st 2011\&quot; or \&quot;top 10 posts by score of all time\&quot;.   The sorts accepted by this method operate on the follow fields of the post object:  - activity - last_activity_date  - creation - creation_date  - votes - score   activity is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate.     This method returns a list of posts. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PostApi;
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
    String max = "max_example"; // sort = activity => date sort = creation => date sort = votes => number 
    String min = "min_example"; // sort = activity => date sort = creation => date sort = votes => number 
    String sort = "activity";
    Integer fromdate = 56; // Unix date.
    Integer todate = 56; // Unix date.
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<PostsInner> result = client
              .post
              .getAllPosts(site)
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
      System.err.println("Exception when calling PostApi#getAllPosts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PostsInner>> response = client
              .post
              .getAllPosts(site)
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
      System.err.println("Exception when calling PostApi#getAllPosts");
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
| **max** | **String**| sort &#x3D; activity &#x3D;&gt; date sort &#x3D; creation &#x3D;&gt; date sort &#x3D; votes &#x3D;&gt; number  | [optional] |
| **min** | **String**| sort &#x3D; activity &#x3D;&gt; date sort &#x3D; creation &#x3D;&gt; date sort &#x3D; votes &#x3D;&gt; number  | [optional] |
| **sort** | **String**|  | [optional] [enum: activity, creation, votes] |
| **fromdate** | **Integer**| Unix date. | [optional] |
| **todate** | **Integer**| Unix date. | [optional] |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |

### Return type

[**List&lt;PostsInner&gt;**](PostsInner.md)

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

<a name="getPostRevisionsByIds"></a>
# **getPostRevisionsByIds**
> List&lt;RevisionsInner&gt; getPostRevisionsByIds(ids, site).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns edit revisions for the posts identified in ids.   {ids} can contain up to 100 semicolon delimited ids, to find ids programatically look for post_id, answer_id, or question_id on post, answer, and question objects respectively.   This method returns a list of revisions. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PostApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String ids = "ids_example"; // Number list (semicolon delimited).
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    Integer fromdate = 56; // Unix date.
    Integer todate = 56; // Unix date.
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<RevisionsInner> result = client
              .post
              .getPostRevisionsByIds(ids, site)
              .fromdate(fromdate)
              .todate(todate)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PostApi#getPostRevisionsByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<RevisionsInner>> response = client
              .post
              .getPostRevisionsByIds(ids, site)
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
      System.err.println("Exception when calling PostApi#getPostRevisionsByIds");
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
| **ids** | **String**| Number list (semicolon delimited). | |
| **site** | **String**| Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \&quot;stackoverflow.com\&quot;), or a short form identified by api_site_parameter on the site object.  | |
| **fromdate** | **Integer**| Unix date. | [optional] |
| **todate** | **Integer**| Unix date. | [optional] |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |

### Return type

[**List&lt;RevisionsInner&gt;**](RevisionsInner.md)

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

<a name="getPostsByIds"></a>
# **getPostsByIds**
> List&lt;PostsInner&gt; getPostsByIds(ids, site).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Fetches a set of posts by ids.   This method is meant for grabbing an object when unsure whether an id identifies a question or an answer. This is most common with user entered data.   {ids} can contain up to 100 semicolon delimited ids, to find ids programatically look for post_id, answer_id, or question_id on post, answer, and question objects respectively.   The sorts accepted by this method operate on the follow fields of the post object:  - activity - last_activity_date  - creation - creation_date  - votes - score   activity is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate.     This method returns a list of posts. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PostApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String ids = "ids_example"; // Number list (semicolon delimited).
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    String order = "desc";
    String max = "max_example"; // sort = activity => date sort = creation => date sort = votes => number 
    String min = "min_example"; // sort = activity => date sort = creation => date sort = votes => number 
    String sort = "activity";
    Integer fromdate = 56; // Unix date.
    Integer todate = 56; // Unix date.
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<PostsInner> result = client
              .post
              .getPostsByIds(ids, site)
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
      System.err.println("Exception when calling PostApi#getPostsByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PostsInner>> response = client
              .post
              .getPostsByIds(ids, site)
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
      System.err.println("Exception when calling PostApi#getPostsByIds");
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
| **ids** | **String**| Number list (semicolon delimited). | |
| **site** | **String**| Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \&quot;stackoverflow.com\&quot;), or a short form identified by api_site_parameter on the site object.  | |
| **order** | **String**|  | [optional] [enum: desc, asc] |
| **max** | **String**| sort &#x3D; activity &#x3D;&gt; date sort &#x3D; creation &#x3D;&gt; date sort &#x3D; votes &#x3D;&gt; number  | [optional] |
| **min** | **String**| sort &#x3D; activity &#x3D;&gt; date sort &#x3D; creation &#x3D;&gt; date sort &#x3D; votes &#x3D;&gt; number  | [optional] |
| **sort** | **String**|  | [optional] [enum: activity, creation, votes] |
| **fromdate** | **Integer**| Unix date. | [optional] |
| **todate** | **Integer**| Unix date. | [optional] |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |

### Return type

[**List&lt;PostsInner&gt;**](PostsInner.md)

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

<a name="listSuggestedEdits"></a>
# **listSuggestedEdits**
> List&lt;SuggestedEditsInner&gt; listSuggestedEdits(ids, site).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns suggsted edits on the posts identified in ids.    - creation - creation_date  - approval - approval_date  - rejection - rejection_date   creation is the default sort.    {ids} can contain up to 100 semicolon delimited ids, to find ids programatically look for post_id, answer_id, or question_id on post, answer, and question objects respectively.     This method returns a list of suggested-edits. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PostApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String ids = "ids_example"; // Number list (semicolon delimited).
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    String order = "desc";
    String max = "max_example"; // sort = creation => date sort = approval => date sort = rejection => date 
    String min = "min_example"; // sort = creation => date sort = approval => date sort = rejection => date 
    String sort = "creation";
    Integer fromdate = 56; // Unix date.
    Integer todate = 56; // Unix date.
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<SuggestedEditsInner> result = client
              .post
              .listSuggestedEdits(ids, site)
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
      System.err.println("Exception when calling PostApi#listSuggestedEdits");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<SuggestedEditsInner>> response = client
              .post
              .listSuggestedEdits(ids, site)
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
      System.err.println("Exception when calling PostApi#listSuggestedEdits");
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
| **ids** | **String**| Number list (semicolon delimited). | |
| **site** | **String**| Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \&quot;stackoverflow.com\&quot;), or a short form identified by api_site_parameter on the site object.  | |
| **order** | **String**|  | [optional] [enum: desc, asc] |
| **max** | **String**| sort &#x3D; creation &#x3D;&gt; date sort &#x3D; approval &#x3D;&gt; date sort &#x3D; rejection &#x3D;&gt; date  | [optional] |
| **min** | **String**| sort &#x3D; creation &#x3D;&gt; date sort &#x3D; approval &#x3D;&gt; date sort &#x3D; rejection &#x3D;&gt; date  | [optional] |
| **sort** | **String**|  | [optional] [enum: creation, approval, rejection] |
| **fromdate** | **Integer**| Unix date. | [optional] |
| **todate** | **Integer**| Unix date. | [optional] |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |

### Return type

[**List&lt;SuggestedEditsInner&gt;**](SuggestedEditsInner.md)

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

