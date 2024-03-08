# SearchApi

All URIs are relative to *https://api.stackexchange.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**siteQuestionsAdvancedSearch**](SearchApi.md#siteQuestionsAdvancedSearch) | **GET** /search/advanced |  |


<a name="siteQuestionsAdvancedSearch"></a>
# **siteQuestionsAdvancedSearch**
> List&lt;QuestionsInner&gt; siteQuestionsAdvancedSearch(site).tagged(tagged).order(order).max(max).min(min).sort(sort).fromdate(fromdate).todate(todate).pagesize(pagesize).page(page).filter(filter).paramCallback(paramCallback).accepted(accepted).answers(answers).body(body).closed(closed).migrated(migrated).notice(notice).nottagged(nottagged).q(q).title(title).url(url).user(user).views(views).wiki(wiki).execute();



Searches a site for any questions which fit the given criteria.   Search criteria are expressed using the following parameters:   - q - a free form text parameter, will match all question properties based on an undocumented algorithm.  - accepted - true to return only questions with accepted answers, false to return only those without. Omit to elide constraint.  - answers - the minimum number of answers returned questions must have.  - body - text which must appear in returned questions&#39; bodies.  - closed - true to return only closed questions, false to return only open ones. Omit to elide constraint.  - migrated - true to return only questions migrated away from a site, false to return only those not. Omit to elide constraint.  - notice - true to return only questions with post notices, false to return only those without. Omit to elide constraint.  - nottagged - a semicolon delimited list of tags, none of which will be present on returned questions.  - tagged - a semicolon delimited list of tags, of which at least one will be present on all returned questions.  - title - text which must appear in returned questions&#39; titles.  - user - the id of the user who must own the questions returned.  - url - a url which must be contained in a post, may include a wildcard.  - views - the minimum number of views returned questions must have.  - wiki - true to return only community wiki questions, false to return only non-community wiki ones. Omit to elide constraint.      At least one additional parameter must be set if nottagged is set, for performance reasons.   The sorts accepted by this method operate on the follow fields of the question object:  - activity - last_activity_date  - creation - creation_date  - votes - score  - relevance - matches the relevance tab on the site itself Does not accept min or max   activity is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate.     This method returns a list of questions. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SearchApi;
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
    String max = "max_example"; // sort = activity => date sort = creation => date sort = votes => number sort = relevance => none 
    String min = "min_example"; // sort = activity => date sort = creation => date sort = votes => number sort = relevance => none 
    String sort = "activity";
    Integer fromdate = 56; // Unix date.
    Integer todate = 56; // Unix date.
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    String accepted = "true";
    Integer answers = 56;
    String body = "body_example";
    String closed = "true";
    String migrated = "true";
    String notice = "true";
    String nottagged = "nottagged_example"; // String list (semicolon delimited).
    String q = "q_example";
    String title = "title_example";
    String url = "url_example";
    Integer user = 56;
    Integer views = 56;
    String wiki = "true";
    try {
      List<QuestionsInner> result = client
              .search
              .siteQuestionsAdvancedSearch(site)
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
              .accepted(accepted)
              .answers(answers)
              .body(body)
              .closed(closed)
              .migrated(migrated)
              .notice(notice)
              .nottagged(nottagged)
              .q(q)
              .title(title)
              .url(url)
              .user(user)
              .views(views)
              .wiki(wiki)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#siteQuestionsAdvancedSearch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<QuestionsInner>> response = client
              .search
              .siteQuestionsAdvancedSearch(site)
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
              .accepted(accepted)
              .answers(answers)
              .body(body)
              .closed(closed)
              .migrated(migrated)
              .notice(notice)
              .nottagged(nottagged)
              .q(q)
              .title(title)
              .url(url)
              .user(user)
              .views(views)
              .wiki(wiki)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#siteQuestionsAdvancedSearch");
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
| **max** | **String**| sort &#x3D; activity &#x3D;&gt; date sort &#x3D; creation &#x3D;&gt; date sort &#x3D; votes &#x3D;&gt; number sort &#x3D; relevance &#x3D;&gt; none  | [optional] |
| **min** | **String**| sort &#x3D; activity &#x3D;&gt; date sort &#x3D; creation &#x3D;&gt; date sort &#x3D; votes &#x3D;&gt; number sort &#x3D; relevance &#x3D;&gt; none  | [optional] |
| **sort** | **String**|  | [optional] [enum: activity, creation, votes, relevance] |
| **fromdate** | **Integer**| Unix date. | [optional] |
| **todate** | **Integer**| Unix date. | [optional] |
| **pagesize** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **filter** | **String**| #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user&#39;s badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \&quot;bake in\&quot; any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \&quot;safe\&quot; filter is mearly an \&quot;unsafe\&quot; one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \&quot;safe\&quot; data is the only accessible data it will be returned even in \&quot;unsafe\&quot; filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters.  | [optional] |
| **paramCallback** | **String**| All API responses are JSON, we do support JSONP with the callback query parameter.  | [optional] |
| **accepted** | **String**|  | [optional] [enum: true, false] |
| **answers** | **Integer**|  | [optional] |
| **body** | **String**|  | [optional] |
| **closed** | **String**|  | [optional] [enum: true, false] |
| **migrated** | **String**|  | [optional] [enum: true, false] |
| **notice** | **String**|  | [optional] [enum: true, false] |
| **nottagged** | **String**| String list (semicolon delimited). | [optional] |
| **q** | **String**|  | [optional] |
| **title** | **String**|  | [optional] |
| **url** | **String**|  | [optional] |
| **user** | **Integer**|  | [optional] |
| **views** | **Integer**|  | [optional] |
| **wiki** | **String**|  | [optional] [enum: true, false] |

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

