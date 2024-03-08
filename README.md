<div align="left">

[![Visit Stack exchange](./header.png)](https://api.stackexchange.com)

# [Stack exchange](https://api.stackexchange.com)

Stack Exchange is a network of 130+ Q&A communities including Stack Overflow.


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Stack%20Exchange&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>stack-exchange-java-sdk</artifactId>
  <version>2.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:stack-exchange-java-sdk:2.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/stack-exchange-java-sdk-2.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.StackExchange;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccessTokenApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.stackexchange.com/2.0";
    StackExchange client = new StackExchange(configuration);
    String accessTokens = "accessTokens_example"; // String list (semicolon delimited).
    Integer pagesize = 56;
    Integer page = 56;
    String filter = "filter_example"; // #Discussion  The Stack Exchange API allows applications to exclude almost every field returned. For example, if an application did not care about a user's badge counts it could exclude user.badge_counts whenever it calls a method that returns users.  An application excludes fields by creating a filter (via /filter/create) and passing it to a method in the filter parameter.  Filters are immutable and non-expiring. An application can safely \"bake in\" any filters that are created, it is not necessary (or advisable) to create filters at runtime.  The motivation for filters are several fold. Filters allow applications to reduce API responses to just the fields they are concerned with, saving bandwidth. With the list of fields an application is actually concerned with, the API can avoid unneccessary queries thereby decreasing response time (and reducing load on our infrastructure). Finally, filters allow us to be more conservative in what the API returns by default without a proliferation of parameters (as was seen with body, answers, and comments in the 1.x API family).  #Safety  Filters also carry a notion of safety, which is defined as follows. Any string returned as a result of an API call with a safe filter will be inline-able into HTML without script-injection concerns. That is to say, no additional sanitizing (encoding, HTML tag stripping, etc.) will be necessary on returned strings. Applications that wish to handle sanitizing themselves should create an unsafe filter. All filters are safe by default, under the assumption that double-encoding bugs are more desirable than script injections.  Note that this does not mean that \"safe\" filter is mearly an \"unsafe\" one with all fields passed though UrlEncode(...). Many fields can and will contain HTML in all filter types (most notably, the *.body fields).  When using unsafe filters, the API returns the highest fidelity data it can reasonably access for the given request. This means that in cases where the \"safe\" data is the only accessible data it will be returned even in \"unsafe\" filters. Notably the *.body fields are unchanged, as they are stored in that form. Fields that are unchanged between safe and unsafe filters are denoted in their types documentation.  #Built In Filters  The following filters are built in:  default, each type documents which fields are returned under the default filter (for example, answers). withbody, which is default plus the *.body fields none, which is empty total, which includes just .total  #Compatibility with V1.x  For ease of transition from earlier API versions, the filters _b, _ba, _bc, _bca, _a, _ac, and _c are also built in. These are unsafe, and exclude a combination of question and answer body, comments, and answers so as to mimic the body, answers, and comments parameters that have been removed in V2.0. New applications should not use these filters. 
    String paramCallback = "paramCallback_example"; // All API responses are JSON, we do support JSONP with the callback query parameter. 
    try {
      List<AccessTokensInner> result = client
              .accessToken
              .deauthenticateList(accessTokens)
              .pagesize(pagesize)
              .page(page)
              .filter(filter)
              .paramCallback(paramCallback)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessTokenApi#deauthenticateList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<AccessTokensInner>> response = client
              .accessToken
              .deauthenticateList(accessTokens)
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
      System.err.println("Exception when calling AccessTokenApi#deauthenticateList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.stackexchange.com/2.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccessTokenApi* | [**deauthenticateList**](docs/AccessTokenApi.md#deauthenticateList) | **GET** /apps/{accessTokens}/de-authenticate | 
*AccessTokenApi* | [**invalidateList**](docs/AccessTokenApi.md#invalidateList) | **GET** /access-tokens/{accessTokens}/invalidate | 
*AccessTokenApi* | [**listPropertiesForMultipleTokens**](docs/AccessTokenApi.md#listPropertiesForMultipleTokens) | **GET** /access-tokens/{accessTokens} | 
*AnswerApi* | [**getCommentsByIds**](docs/AnswerApi.md#getCommentsByIds) | **GET** /answers/{ids}/comments | 
*AnswerApi* | [**getList**](docs/AnswerApi.md#getList) | **GET** /answers | 
*AnswerApi* | [**getListByIds**](docs/AnswerApi.md#getListByIds) | **GET** /answers/{ids} | 
*AnswerApi* | [**getListByQuestionIds**](docs/AnswerApi.md#getListByQuestionIds) | **GET** /questions/{ids}/answers | 
*AnswerApi* | [**getListOfUnansweredQuestions**](docs/AnswerApi.md#getListOfUnansweredQuestions) | **GET** /questions/unanswered | 
*AnswerApi* | [**getUserAnswersList**](docs/AnswerApi.md#getUserAnswersList) | **GET** /me/answers | 
*AnswerApi* | [**getUserTopAnswers**](docs/AnswerApi.md#getUserTopAnswers) | **GET** /me/tags/{tags}/top-answers | 
*AnswerApi* | [**getUserTopTags**](docs/AnswerApi.md#getUserTopTags) | **GET** /me/top-answer-tags | 
*AnswerApi* | [**listNoAnswerQuestions**](docs/AnswerApi.md#listNoAnswerQuestions) | **GET** /me/questions/no-answers | 
*AnswerApi* | [**listNoAnswerQuestions_0**](docs/AnswerApi.md#listNoAnswerQuestions_0) | **GET** /questions/no-answers | 
*AnswerApi* | [**tagTopAnswerers**](docs/AnswerApi.md#tagTopAnswerers) | **GET** /tags/{tag}/top-answerers/{period} | 
*AnswerApi* | [**userUnansweredQuestionsGet**](docs/AnswerApi.md#userUnansweredQuestionsGet) | **GET** /me/questions/unanswered | 
*AssociatedApi* | [**getUserAccounts**](docs/AssociatedApi.md#getUserAccounts) | **GET** /me/associated | 
*BadgeApi* | [**getAllNamedBadges**](docs/BadgeApi.md#getAllNamedBadges) | **GET** /badges/name | 
*BadgeApi* | [**getBadgesByIds**](docs/BadgeApi.md#getBadgesByIds) | **GET** /badges/{ids} | 
*BadgeApi* | [**getRecentAwardedBadges**](docs/BadgeApi.md#getRecentAwardedBadges) | **GET** /badges/recipients | 
*BadgeApi* | [**getRecentAwardedRecipients**](docs/BadgeApi.md#getRecentAwardedRecipients) | **GET** /badges/{ids}/recipients | 
*BadgeApi* | [**getUserBadges**](docs/BadgeApi.md#getUserBadges) | **GET** /me/badges | 
*BadgeApi* | [**listBadges**](docs/BadgeApi.md#listBadges) | **GET** /badges | 
*BadgeApi* | [**listTagsBadges**](docs/BadgeApi.md#listTagsBadges) | **GET** /badges/tags | 
*CommentApi* | [**deleteAction**](docs/CommentApi.md#deleteAction) | **POST** /comments/{id}/delete | 
*CommentApi* | [**editExisting**](docs/CommentApi.md#editExisting) | **POST** /comments/{id}/edit | 
*CommentApi* | [**getCommentsByIds**](docs/CommentApi.md#getCommentsByIds) | **GET** /comments/{ids} | 
*CommentApi* | [**getCommentsList**](docs/CommentApi.md#getCommentsList) | **GET** /questions/{ids}/comments | 
*CommentApi* | [**getReplyList**](docs/CommentApi.md#getReplyList) | **GET** /me/comments/{toId} | 
*CommentApi* | [**listComments**](docs/CommentApi.md#listComments) | **GET** /comments | 
*CommentApi* | [**listOwnedComments**](docs/CommentApi.md#listOwnedComments) | **GET** /me/comments | 
*EditApi* | [**getUserSuggestedEdits**](docs/EditApi.md#getUserSuggestedEdits) | **GET** /me/suggested-edits | 
*EditApi* | [**listSuggestedEdits**](docs/EditApi.md#listSuggestedEdits) | **GET** /suggested-edits | 
*EditApi* | [**listSuggestedEdits_0**](docs/EditApi.md#listSuggestedEdits_0) | **GET** /suggested-edits/{ids} | 
*ErrorApi* | [**generateError**](docs/ErrorApi.md#generateError) | **GET** /errors/{id} | 
*ErrorApi* | [**listErrors**](docs/ErrorApi.md#listErrors) | **GET** /errors | 
*EventApi* | [**listEvents**](docs/EventApi.md#listEvents) | **GET** /events | 
*FavoriteApi* | [**getUserFavorites**](docs/FavoriteApi.md#getUserFavorites) | **GET** /me/favorites | 
*FilterApi* | [**createFilter**](docs/FilterApi.md#createFilter) | **GET** /filters/create | 
*FilterApi* | [**getFilterDetailsByIds**](docs/FilterApi.md#getFilterDetailsByIds) | **GET** /filters/{filters} | 
*InformationApi* | [**getStatistics**](docs/InformationApi.md#getStatistics) | **GET** /info | 
*InformationApi* | [**getTagsList**](docs/InformationApi.md#getTagsList) | **GET** /tags | 
*MentionApi* | [**userCommentsList**](docs/MentionApi.md#userCommentsList) | **GET** /me/mentioned | 
*MergeApi* | [**getAccountMergeList**](docs/MergeApi.md#getAccountMergeList) | **GET** /me/merges | 
*MessageApi* | [**getInboxItems**](docs/MessageApi.md#getInboxItems) | **GET** /me/inbox | 
*MessageApi* | [**getUnreadItems**](docs/MessageApi.md#getUnreadItems) | **GET** /inbox/unread | 
*MessageApi* | [**listInboxItems**](docs/MessageApi.md#listInboxItems) | **GET** /inbox | 
*NotificationApi* | [**getUnreadItemsInInbox**](docs/NotificationApi.md#getUnreadItemsInInbox) | **GET** /me/inbox/unread | 
*NotificationApi* | [**getUnreadItemsInInbox_0**](docs/NotificationApi.md#getUnreadItemsInInbox_0) | **GET** /me/notifications/unread | 
*NotificationApi* | [**getUserNotifications**](docs/NotificationApi.md#getUserNotifications) | **GET** /notifications | 
*NotificationApi* | [**getUserNotificationsList**](docs/NotificationApi.md#getUserNotificationsList) | **GET** /me/notifications | 
*NotificationApi* | [**getUserUnreadNotifications**](docs/NotificationApi.md#getUserUnreadNotifications) | **GET** /notifications/unread | 
*PermissionApi* | [**getUserWritePermissions**](docs/PermissionApi.md#getUserWritePermissions) | **GET** /me/write-permissions | 
*PostApi* | [**addComment**](docs/PostApi.md#addComment) | **POST** /posts/{id}/comments/add | 
*PostApi* | [**commentsByIdsGet**](docs/PostApi.md#commentsByIdsGet) | **GET** /posts/{ids}/comments | 
*PostApi* | [**getAllPosts**](docs/PostApi.md#getAllPosts) | **GET** /posts | 
*PostApi* | [**getPostRevisionsByIds**](docs/PostApi.md#getPostRevisionsByIds) | **GET** /posts/{ids}/revisions | 
*PostApi* | [**getPostsByIds**](docs/PostApi.md#getPostsByIds) | **GET** /posts/{ids} | 
*PostApi* | [**listSuggestedEdits**](docs/PostApi.md#listSuggestedEdits) | **GET** /posts/{ids}/suggested-edits | 
*PrivilegeApi* | [**getEarnableList**](docs/PrivilegeApi.md#getEarnableList) | **GET** /privileges | 
*PrivilegeApi* | [**getUserPrivileges**](docs/PrivilegeApi.md#getUserPrivileges) | **GET** /me/privileges | 
*QueryApi* | [**similarQuestionsSearch**](docs/QueryApi.md#similarQuestionsSearch) | **GET** /similar | 
*QueryApi* | [**siteQuestionsSearch**](docs/QueryApi.md#siteQuestionsSearch) | **GET** /search | 
*QuestionApi* | [**getAllQuestions**](docs/QuestionApi.md#getAllQuestions) | **GET** /questions | 
*QuestionApi* | [**getByIds**](docs/QuestionApi.md#getByIds) | **GET** /questions/{ids} | 
*QuestionApi* | [**getLinkedQuestions**](docs/QuestionApi.md#getLinkedQuestions) | **GET** /questions/{ids}/linked | 
*QuestionApi* | [**getTimelineEvents**](docs/QuestionApi.md#getTimelineEvents) | **GET** /questions/{ids}/timeline | 
*QuestionApi* | [**getUnacceptedList**](docs/QuestionApi.md#getUnacceptedList) | **GET** /me/questions/unaccepted | 
*QuestionApi* | [**getUserFeatured**](docs/QuestionApi.md#getUserFeatured) | **GET** /me/questions/featured | 
*QuestionApi* | [**getUserQuestionsList**](docs/QuestionApi.md#getUserQuestionsList) | **GET** /me/questions | 
*QuestionApi* | [**listFeaturedQuestions**](docs/QuestionApi.md#listFeaturedQuestions) | **GET** /questions/featured | 
*QuestionApi* | [**listRelatedQuestions**](docs/QuestionApi.md#listRelatedQuestions) | **GET** /questions/{ids}/related | 
*ReputationApi* | [**getFullHistory**](docs/ReputationApi.md#getFullHistory) | **GET** /me/reputation-history/full | 
*ReputationApi* | [**getUserReputationChanges**](docs/ReputationApi.md#getUserReputationChanges) | **GET** /me/reputation | 
*ReputationApi* | [**getUserReputationHistory**](docs/ReputationApi.md#getUserReputationHistory) | **GET** /me/reputation-history | 
*RevisionApi* | [**listRevisionsByIds**](docs/RevisionApi.md#listRevisionsByIds) | **GET** /revisions/{ids} | 
*SearchApi* | [**siteQuestionsAdvancedSearch**](docs/SearchApi.md#siteQuestionsAdvancedSearch) | **GET** /search/advanced | 
*SiteApi* | [**listSites**](docs/SiteApi.md#listSites) | **GET** /sites | 
*TagApi* | [**getFaqQuestions**](docs/TagApi.md#getFaqQuestions) | **GET** /tags/{tags}/faq | 
*TagApi* | [**getModeratorOnlyTagsList**](docs/TagApi.md#getModeratorOnlyTagsList) | **GET** /tags/moderator-only | 
*TagApi* | [**getRelatedTags**](docs/TagApi.md#getRelatedTags) | **GET** /tags/{tags}/related | 
*TagApi* | [**getTagInfo**](docs/TagApi.md#getTagInfo) | **GET** /tags/{tags}/info | 
*TagApi* | [**getTagWikis**](docs/TagApi.md#getTagWikis) | **GET** /tags/{tags}/wikis | 
*TagApi* | [**getTopAskersByPeriod**](docs/TagApi.md#getTopAskersByPeriod) | **GET** /tags/{tag}/top-askers/{period} | 
*TagApi* | [**getUserTagsList**](docs/TagApi.md#getUserTagsList) | **GET** /me/tags | 
*TagApi* | [**getUserTopQuestions**](docs/TagApi.md#getUserTopQuestions) | **GET** /me/tags/{tags}/top-questions | 
*TagApi* | [**getUserTopTagsList**](docs/TagApi.md#getUserTopTagsList) | **GET** /me/top-question-tags | 
*TagApi* | [**listRequiredTags**](docs/TagApi.md#listRequiredTags) | **GET** /tags/required | 
*TagApi* | [**listSynonyms**](docs/TagApi.md#listSynonyms) | **GET** /tags/{tags}/synonyms | 
*TagApi* | [**synonymsList**](docs/TagApi.md#synonymsList) | **GET** /tags/synonyms | 
*TimelineApi* | [**getUserTimeline**](docs/TimelineApi.md#getUserTimeline) | **GET** /me/timeline | 
*UserApi* | [**getAssociatedAccounts**](docs/UserApi.md#getAssociatedAccounts) | **GET** /users/{ids}/associated | 
*UserApi* | [**getCommentsByIds**](docs/UserApi.md#getCommentsByIds) | **GET** /users/{ids}/comments | 
*UserApi* | [**getFavoritesList**](docs/UserApi.md#getFavoritesList) | **GET** /users/{ids}/favorites | 
*UserApi* | [**getFeaturedQuestions**](docs/UserApi.md#getFeaturedQuestions) | **GET** /users/{ids}/questions/featured | 
*UserApi* | [**getFullReputationHistory**](docs/UserApi.md#getFullReputationHistory) | **GET** /users/{id}/reputation-history/full | 
*UserApi* | [**getInboxItems**](docs/UserApi.md#getInboxItems) | **GET** /users/{id}/inbox | 
*UserApi* | [**getInboxUnread**](docs/UserApi.md#getInboxUnread) | **GET** /users/{id}/inbox/unread | 
*UserApi* | [**getNotificationsList**](docs/UserApi.md#getNotificationsList) | **GET** /users/{id}/notifications | 
*UserApi* | [**getPrivilegesList**](docs/UserApi.md#getPrivilegesList) | **GET** /users/{id}/privileges | 
*UserApi* | [**getQuestionsByUserIds**](docs/UserApi.md#getQuestionsByUserIds) | **GET** /users/{ids}/questions | 
*UserApi* | [**getReputationChanges**](docs/UserApi.md#getReputationChanges) | **GET** /users/{ids}/reputation | 
*UserApi* | [**getReputationHistory**](docs/UserApi.md#getReputationHistory) | **GET** /users/{ids}/reputation-history | 
*UserApi* | [**getSuggestedEditsByIds**](docs/UserApi.md#getSuggestedEditsByIds) | **GET** /users/{ids}/suggested-edits | 
*UserApi* | [**getTags**](docs/UserApi.md#getTags) | **GET** /users/{ids}/tags | 
*UserApi* | [**getTopQuestionTags**](docs/UserApi.md#getTopQuestionTags) | **GET** /users/{id}/top-question-tags | 
*UserApi* | [**getTopQuestionsByTags**](docs/UserApi.md#getTopQuestionsByTags) | **GET** /users/{id}/tags/{tags}/top-questions | 
*UserApi* | [**getUnacceptedQuestions**](docs/UserApi.md#getUnacceptedQuestions) | **GET** /users/{ids}/questions/unaccepted | 
*UserApi* | [**getUnansweredQuestions**](docs/UserApi.md#getUnansweredQuestions) | **GET** /users/{ids}/questions/unanswered | 
*UserApi* | [**getUnreadNotifications**](docs/UserApi.md#getUnreadNotifications) | **GET** /users/{id}/notifications/unread | 
*UserApi* | [**getUser**](docs/UserApi.md#getUser) | **GET** /me | 
*UserApi* | [**getUserAnswersList**](docs/UserApi.md#getUserAnswersList) | **GET** /users/{ids}/answers | 
*UserApi* | [**getUserCommentsByIdsAndToid**](docs/UserApi.md#getUserCommentsByIdsAndToid) | **GET** /users/{ids}/comments/{toid} | 
*UserApi* | [**getUserProfilesByIds**](docs/UserApi.md#getUserProfilesByIds) | **GET** /users/{ids} | 
*UserApi* | [**getUserTimelineByIds**](docs/UserApi.md#getUserTimelineByIds) | **GET** /users/{ids}/timeline | 
*UserApi* | [**getUserTopAnswerTags**](docs/UserApi.md#getUserTopAnswerTags) | **GET** /users/{id}/top-answer-tags | 
*UserApi* | [**getUserTopAnswers**](docs/UserApi.md#getUserTopAnswers) | **GET** /users/{id}/tags/{tags}/top-answers | 
*UserApi* | [**getWritePermissions**](docs/UserApi.md#getWritePermissions) | **GET** /users/{id}/write-permissions | 
*UserApi* | [**listAccountMerges**](docs/UserApi.md#listAccountMerges) | **GET** /users/{ids}/merges | 
*UserApi* | [**listElectedModeratorUsers**](docs/UserApi.md#listElectedModeratorUsers) | **GET** /users/moderators/elected | 
*UserApi* | [**listModeratorUsers**](docs/UserApi.md#listModeratorUsers) | **GET** /users/moderators | 
*UserApi* | [**listNoAnswerQuestions**](docs/UserApi.md#listNoAnswerQuestions) | **GET** /users/{ids}/questions/no-answers | 
*UserApi* | [**listUserBadges**](docs/UserApi.md#listUserBadges) | **GET** /users/{ids}/badges | 
*UserApi* | [**listUsers**](docs/UserApi.md#listUsers) | **GET** /users | 
*UserApi* | [**mentionedCommentsList**](docs/UserApi.md#mentionedCommentsList) | **GET** /users/{ids}/mentioned | 


## Documentation for Models

 - [AccessTokensInner](docs/AccessTokensInner.md)
 - [AccountMergeInner](docs/AccountMergeInner.md)
 - [AnswersInner](docs/AnswersInner.md)
 - [AnswersInnerLastEditor](docs/AnswersInnerLastEditor.md)
 - [AnswersInnerLastEditorBadgeCounts](docs/AnswersInnerLastEditorBadgeCounts.md)
 - [BadgesInner](docs/BadgesInner.md)
 - [CommentsInner](docs/CommentsInner.md)
 - [CreatedComment](docs/CreatedComment.md)
 - [Error](docs/Error.md)
 - [ErrorsInner](docs/ErrorsInner.md)
 - [EventsInner](docs/EventsInner.md)
 - [FiltersInner](docs/FiltersInner.md)
 - [InboxItemsInner](docs/InboxItemsInner.md)
 - [InboxItemsInnerSite](docs/InboxItemsInnerSite.md)
 - [InboxItemsInnerSiteStyling](docs/InboxItemsInnerSiteStyling.md)
 - [InfoObject](docs/InfoObject.md)
 - [NetworkUsersInner](docs/NetworkUsersInner.md)
 - [NotificationsInner](docs/NotificationsInner.md)
 - [PostsInner](docs/PostsInner.md)
 - [PrivilegesInner](docs/PrivilegesInner.md)
 - [QuestionTimelineEventsInner](docs/QuestionTimelineEventsInner.md)
 - [QuestionsInner](docs/QuestionsInner.md)
 - [QuestionsInnerClosedDetails](docs/QuestionsInnerClosedDetails.md)
 - [QuestionsInnerMigratedFrom](docs/QuestionsInnerMigratedFrom.md)
 - [QuestionsInnerNotice](docs/QuestionsInnerNotice.md)
 - [ReputationChangesInner](docs/ReputationChangesInner.md)
 - [ReputationHistoryInner](docs/ReputationHistoryInner.md)
 - [RevisionsInner](docs/RevisionsInner.md)
 - [SingleFilter](docs/SingleFilter.md)
 - [SuggestedEditsInner](docs/SuggestedEditsInner.md)
 - [TagScoreObjectsInner](docs/TagScoreObjectsInner.md)
 - [TagSynonymsInner](docs/TagSynonymsInner.md)
 - [TagWikisInner](docs/TagWikisInner.md)
 - [TagsInner](docs/TagsInner.md)
 - [TopTagObjectsInner](docs/TopTagObjectsInner.md)
 - [User](docs/User.md)
 - [UserTimelineObjectsInner](docs/UserTimelineObjectsInner.md)
 - [UsersInner](docs/UsersInner.md)
 - [WritePermissionsInner](docs/WritePermissionsInner.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
