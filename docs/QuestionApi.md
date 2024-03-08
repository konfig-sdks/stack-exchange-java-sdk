# QuestionApi

All URIs are relative to *https://api.stackexchange.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllQuestions**](QuestionApi.md#getAllQuestions) | **GET** /questions |  |
| [**getByIds**](QuestionApi.md#getByIds) | **GET** /questions/{ids} |  |
| [**getLinkedQuestions**](QuestionApi.md#getLinkedQuestions) | **GET** /questions/{ids}/linked |  |
| [**getTimelineEvents**](QuestionApi.md#getTimelineEvents) | **GET** /questions/{ids}/timeline |  |
| [**getUnacceptedList**](QuestionApi.md#getUnacceptedList) | **GET** /me/questions/unaccepted |  |
| [**getUserFeatured**](QuestionApi.md#getUserFeatured) | **GET** /me/questions/featured |  |
| [**getUserQuestionsList**](QuestionApi.md#getUserQuestionsList) | **GET** /me/questions |  |
| [**listFeaturedQuestions**](QuestionApi.md#listFeaturedQuestions) | **GET** /questions/featured |  |
| [**listRelatedQuestions**](QuestionApi.md#listRelatedQuestions) | **GET** /questions/{ids}/related |  |


<a name="getAllQuestions"></a>
# **getAllQuestions**
> List&lt;QuestionsInner&gt; getAllQuestions(site).tagged(tagged).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Gets all the questions on the site.   This method allows you make fairly flexible queries across the entire corpus of questions on a site. For example, getting all questions asked in the the week of Jan 1st 2011 with scores of 10 or more is a single query with parameters sort&#x3D;votes&amp;min&#x3D;10&amp;fromdate&#x3D;1293840000&amp;todate&#x3D;1294444800.   To constrain questions returned to those with a set of tags, use the tagged parameter with a semi-colon delimited list of tags. This is an and contraint, passing tagged&#x3D;c;java will return only those questions with both tags. As such, passing more than 5 tags will always return zero results.   The sorts accepted by this method operate on the follow fields of the question object:  - activity - last_activity_date  - creation - creation_date  - votes - score  - hot - by the formula ordering the hot tab Does not accept min or max  - week - by the formula ordering the week tab Does not accept min or max  - month - by the formula ordering the month tab Does not accept min or max   activity is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate.     This method returns a list of questions. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuestionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    String tagged = "tagged_example"; // String list (semicolon delimited).
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
              .question
              .getAllQuestions(site)
              .tagged(tagged)
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
      System.err.println("Exception when calling QuestionApi#getAllQuestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<QuestionsInner>> response = client
              .question
              .getAllQuestions(site)
              .tagged(tagged)
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
      System.err.println("Exception when calling QuestionApi#getAllQuestions");
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
| **tagged** | **String**| String list (semicolon delimited). | [optional] |
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

<a name="getByIds"></a>
# **getByIds**
> List&lt;QuestionsInner&gt; getByIds(ids, site).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns the questions identified in {ids}.   This is most useful for fetching fresh data when maintaining a cache of question ids, or polling for changes.   {ids} can contain up to 100 semicolon delimited ids, to find ids programatically look for question_id on question objects.   The sorts accepted by this method operate on the follow fields of the question object:  - activity - last_activity_date  - creation - creation_date  - votes - score   activity is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate.     This method returns a list of questions. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuestionApi;
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
      List<QuestionsInner> result = client
              .question
              .getByIds(ids, site)
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
      System.err.println("Exception when calling QuestionApi#getByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<QuestionsInner>> response = client
              .question
              .getByIds(ids, site)
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
      System.err.println("Exception when calling QuestionApi#getByIds");
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

<a name="getLinkedQuestions"></a>
# **getLinkedQuestions**
> List&lt;QuestionsInner&gt; getLinkedQuestions(ids, site).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Gets questions which link to those questions identified in {ids}.   This method only considers questions that are linked within a site, and will never return questions from another Stack Exchange site.   A question is considered \&quot;linked\&quot; when it explicitly includes a hyperlink to another question, there are no other heuristics.   {ids} can contain up to 100 semicolon delimited ids, to find ids programatically look for question_id on question objects.   The sorts accepted by this method operate on the follow fields of the question object:  - activity - last_activity_date  - creation - creation_date  - votes - score  - rank - a priority sort by site applies, subject to change at any time Does not accept min or max   activity is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate.     This method returns a list of questions. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuestionApi;
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
    String max = "max_example"; // sort = activity => date sort = creation => date sort = votes => number sort = rank => none 
    String min = "min_example"; // sort = activity => date sort = creation => date sort = votes => number sort = rank => none 
    String sort = "activity";
    Integer fromdate = 56; // Unix date.
    Integer todate = 56; // Unix date.
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<QuestionsInner> result = client
              .question
              .getLinkedQuestions(ids, site)
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
      System.err.println("Exception when calling QuestionApi#getLinkedQuestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<QuestionsInner>> response = client
              .question
              .getLinkedQuestions(ids, site)
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
      System.err.println("Exception when calling QuestionApi#getLinkedQuestions");
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
| **max** | **String**| sort &#x3D; activity &#x3D;&gt; date sort &#x3D; creation &#x3D;&gt; date sort &#x3D; votes &#x3D;&gt; number sort &#x3D; rank &#x3D;&gt; none  | [optional] |
| **min** | **String**| sort &#x3D; activity &#x3D;&gt; date sort &#x3D; creation &#x3D;&gt; date sort &#x3D; votes &#x3D;&gt; number sort &#x3D; rank &#x3D;&gt; none  | [optional] |
| **sort** | **String**|  | [optional] [enum: activity, creation, votes, rank] |
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

<a name="getTimelineEvents"></a>
# **getTimelineEvents**
> List&lt;QuestionTimelineEventsInner&gt; getTimelineEvents(ids, site).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns a subset of the events that have happened to the questions identified in id.   This provides data similar to that found on a question&#39;s timeline page.   Voting data is scrubbed to deter inferencing of voter identity.   {ids} can contain up to 100 semicolon delimited ids, to find ids programatically look for question_id on question objects.   This method returns a list of question timeline events. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuestionApi;
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
      List<QuestionTimelineEventsInner> result = client
              .question
              .getTimelineEvents(ids, site)
              .fromdate(fromdate)
              .todate(todate)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuestionApi#getTimelineEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<QuestionTimelineEventsInner>> response = client
              .question
              .getTimelineEvents(ids, site)
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
      System.err.println("Exception when calling QuestionApi#getTimelineEvents");
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

[**List&lt;QuestionTimelineEventsInner&gt;**](QuestionTimelineEventsInner.md)

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

<a name="getUnacceptedList"></a>
# **getUnacceptedList**
> List&lt;QuestionsInner&gt; getUnacceptedList(site).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns the questions owned by the user associated with the given access_token that have no accepted answer.   This method returns a list of questions. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuestionApi;
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
      List<QuestionsInner> result = client
              .question
              .getUnacceptedList(site)
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
      System.err.println("Exception when calling QuestionApi#getUnacceptedList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<QuestionsInner>> response = client
              .question
              .getUnacceptedList(site)
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
      System.err.println("Exception when calling QuestionApi#getUnacceptedList");
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

<a name="getUserFeatured"></a>
# **getUserFeatured**
> List&lt;QuestionsInner&gt; getUserFeatured(site).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns the questions that have active bounties offered by the user associated with the given access_token.   This method returns a list of questions. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuestionApi;
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
      List<QuestionsInner> result = client
              .question
              .getUserFeatured(site)
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
      System.err.println("Exception when calling QuestionApi#getUserFeatured");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<QuestionsInner>> response = client
              .question
              .getUserFeatured(site)
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
      System.err.println("Exception when calling QuestionApi#getUserFeatured");
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

<a name="getUserQuestionsList"></a>
# **getUserQuestionsList**
> List&lt;QuestionsInner&gt; getUserQuestionsList(site).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns the questions owned by the user associated with the given access_token.   This method returns a list of questions. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuestionApi;
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
      List<QuestionsInner> result = client
              .question
              .getUserQuestionsList(site)
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
      System.err.println("Exception when calling QuestionApi#getUserQuestionsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<QuestionsInner>> response = client
              .question
              .getUserQuestionsList(site)
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
      System.err.println("Exception when calling QuestionApi#getUserQuestionsList");
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

<a name="listFeaturedQuestions"></a>
# **listFeaturedQuestions**
> List&lt;QuestionsInner&gt; listFeaturedQuestions(site).tagged(tagged).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns all the questions with active bounties in the system.   The sorts accepted by this method operate on the follow fields of the question object:  - activity - last_activity_date  - creation - creation_date  - votes - score   activity is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate.     This method returns a list of questions. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuestionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String site = "site_example"; // Each of these methods operates on a single site at a time, identified by the site parameter. This parameter can be the full domain name (ie. \"stackoverflow.com\"), or a short form identified by api_site_parameter on the site object. 
    String tagged = "tagged_example"; // String list (semicolon delimited).
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
      List<QuestionsInner> result = client
              .question
              .listFeaturedQuestions(site)
              .tagged(tagged)
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
      System.err.println("Exception when calling QuestionApi#listFeaturedQuestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<QuestionsInner>> response = client
              .question
              .listFeaturedQuestions(site)
              .tagged(tagged)
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
      System.err.println("Exception when calling QuestionApi#listFeaturedQuestions");
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
| **tagged** | **String**| String list (semicolon delimited). | [optional] |
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

<a name="listRelatedQuestions"></a>
# **listRelatedQuestions**
> List&lt;QuestionsInner&gt; listRelatedQuestions(ids, site).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).execute();



Returns questions that the site considers related to those identified in {ids}.   The algorithm for determining if questions are related is not documented, and subject to change at any time. Futhermore, these values are very heavily cached, and may not update immediately after a question has been editted. It is also not guaranteed that a question will be considered related to any number (even non-zero) of questions, and a consumer should be able to handle a variable number of returned questions.   {ids} can contain up to 100 semicolon delimited ids, to find ids programatically look for question_id on question objects.   The sorts accepted by this method operate on the follow fields of the question object:  - activity - last_activity_date  - creation - creation_date  - votes - score  - rank - a priority sort by site applies, subject to change at any time Does not accept min or max   activity is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate.     This method returns a list of questions. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuestionApi;
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
    String max = "max_example"; // sort = activity => date sort = creation => date sort = votes => number sort = rank => none 
    String min = "min_example"; // sort = activity => date sort = creation => date sort = votes => number sort = rank => none 
    String sort = "activity";
    Integer fromdate = 56; // Unix date.
    Integer todate = 56; // Unix date.
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<QuestionsInner> result = client
              .question
              .listRelatedQuestions(ids, site)
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
      System.err.println("Exception when calling QuestionApi#listRelatedQuestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<QuestionsInner>> response = client
              .question
              .listRelatedQuestions(ids, site)
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
      System.err.println("Exception when calling QuestionApi#listRelatedQuestions");
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
| **max** | **String**| sort &#x3D; activity &#x3D;&gt; date sort &#x3D; creation &#x3D;&gt; date sort &#x3D; votes &#x3D;&gt; number sort &#x3D; rank &#x3D;&gt; none  | [optional] |
| **min** | **String**| sort &#x3D; activity &#x3D;&gt; date sort &#x3D; creation &#x3D;&gt; date sort &#x3D; votes &#x3D;&gt; number sort &#x3D; rank &#x3D;&gt; none  | [optional] |
| **sort** | **String**|  | [optional] [enum: activity, creation, votes, rank] |
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

