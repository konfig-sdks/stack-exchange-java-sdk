# InformationApi

All URIs are relative to *https://api.stackexchange.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getStatistics**](InformationApi.md#getStatistics) | **GET** /info |  |
| [**getTagsList**](InformationApi.md#getTagsList) | **GET** /tags |  |


<a name="getStatistics"></a>
# **getStatistics**
> InfoObject getStatistics(site).execute();



Returns a collection of statistics about the site.   Data to facilitate per-site customization, discover related sites, and aggregate statistics is all returned by this method.   This data is cached very aggressively, by design. Query sparingly, ideally no more than once an hour.   This method returns an info object. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InformationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    try {
      InfoObject result = client
              .information
              .getStatistics(site)
              .execute();
      System.out.println(result);
      System.out.println(result.getAnswersPerMinute());
      System.out.println(result.getApiRevision());
      System.out.println(result.getBadgesPerMinute());
      System.out.println(result.getNewActiveUsers());
      System.out.println(result.getQuestionsPerMinute());
      System.out.println(result.getSite());
      System.out.println(result.getTotalAccepted());
      System.out.println(result.getTotalAnswers());
      System.out.println(result.getTotalBadges());
      System.out.println(result.getTotalComments());
      System.out.println(result.getTotalQuestions());
      System.out.println(result.getTotalUnanswered());
      System.out.println(result.getTotalUsers());
      System.out.println(result.getTotalVotes());
    } catch (ApiException e) {
      System.err.println("Exception when calling InformationApi#getStatistics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InfoObject> response = client
              .information
              .getStatistics(site)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InformationApi#getStatistics");
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

### Return type

[**InfoObject**](InfoObject.md)

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

<a name="getTagsList"></a>
# **getTagsList**
> List&lt;TagsInner&gt; getTagsList(site).inname(inname).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns the tags found on a site.   The inname parameter lets a consumer filter down to tags that contain a certain substring. For example, inname&#x3D;own would return both \&quot;download\&quot; and \&quot;owner\&quot; amongst others.   This method returns a list of tags.   The sorts accepted by this method operate on the follow fields of the tag object:  - popular - count  - activity - the creation_date of the last question asked with the tag  - name - name   popular is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InformationApi;
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
              .information
              .getTagsList(site)
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
      System.err.println("Exception when calling InformationApi#getTagsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TagsInner>> response = client
              .information
              .getTagsList(site)
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
      System.err.println("Exception when calling InformationApi#getTagsList");
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

