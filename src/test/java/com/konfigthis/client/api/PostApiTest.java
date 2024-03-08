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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.CommentsInner;
import com.konfigthis.client.model.CreatedComment;
import com.konfigthis.client.model.PostsInner;
import com.konfigthis.client.model.RevisionsInner;
import com.konfigthis.client.model.SuggestedEditsInner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PostApi
 */
@Disabled
public class PostApiTest {

    private static PostApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PostApi(apiClient);
    }

    /**
     * Create a new comment.   Use an access_token with write_access to create a new comment on a post.   This method returns the created comment. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCommentTest() throws ApiException {
        Integer id = null;
        String site = null;
        String filter = null;
        String paramCallback = null;
        String body = null;
        Boolean preview = null;
        CreatedComment response = api.addComment(id, site)
                .filter(filter)
                .paramCallback(paramCallback)
                .body(body)
                .preview(preview)
                .execute();
        // TODO: test validations
    }

    /**
     * Gets the comments on the posts identified in ids, regardless of the type of the posts.   This method is meant for cases when you are unsure of the type of the post id provided. Generally, this would be due to obtaining the post id directly from a user.   {ids} can contain up to 100 semicolon delimited ids, to find ids programatically look for post_id, answer_id, or question_id on post, answer, and question objects respectively.   The sorts accepted by this method operate on the follow fields of the comment object:  - creation - creation_date  - votes - score   creation is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate.     This method returns a list of comments. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void commentsByIdsGetTest() throws ApiException {
        String ids = null;
        String site = null;
        String order = null;
        String max = null;
        String min = null;
        String sort = null;
        Integer fromdate = null;
        Integer todate = null;
        Integer pagesize = null;
        Integer page = null;
        String filter = null;
        String paramCallback = null;
        List<CommentsInner> response = api.commentsByIdsGet(ids, site)
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
        // TODO: test validations
    }

    /**
     * Fetches all posts (questions and answers) on the site.   In many ways this method is the union of /questions and /answers, returning both sets of data albeit only the common fields.   Most applications should use the question or answer specific methods, but /posts is available for those rare cases where any activity is of intereset. Examples of such queries would be: \&quot;all posts on Jan. 1st 2011\&quot; or \&quot;top 10 posts by score of all time\&quot;.   The sorts accepted by this method operate on the follow fields of the post object:  - activity - last_activity_date  - creation - creation_date  - votes - score   activity is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate.     This method returns a list of posts. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllPostsTest() throws ApiException {
        String site = null;
        String order = null;
        String max = null;
        String min = null;
        String sort = null;
        Integer fromdate = null;
        Integer todate = null;
        Integer pagesize = null;
        Integer page = null;
        String filter = null;
        String paramCallback = null;
        List<PostsInner> response = api.getAllPosts(site)
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
        // TODO: test validations
    }

    /**
     * Returns edit revisions for the posts identified in ids.   {ids} can contain up to 100 semicolon delimited ids, to find ids programatically look for post_id, answer_id, or question_id on post, answer, and question objects respectively.   This method returns a list of revisions. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPostRevisionsByIdsTest() throws ApiException {
        String ids = null;
        String site = null;
        Integer fromdate = null;
        Integer todate = null;
        Integer pagesize = null;
        Integer page = null;
        String filter = null;
        String paramCallback = null;
        List<RevisionsInner> response = api.getPostRevisionsByIds(ids, site)
                .fromdate(fromdate)
                .todate(todate)
                .pagesize(pagesize)
                .page(page)
                .filter(filter)
                .paramCallback(paramCallback)
                .execute();
        // TODO: test validations
    }

    /**
     * Fetches a set of posts by ids.   This method is meant for grabbing an object when unsure whether an id identifies a question or an answer. This is most common with user entered data.   {ids} can contain up to 100 semicolon delimited ids, to find ids programatically look for post_id, answer_id, or question_id on post, answer, and question objects respectively.   The sorts accepted by this method operate on the follow fields of the post object:  - activity - last_activity_date  - creation - creation_date  - votes - score   activity is the default sort.    It is possible to create moderately complex queries using sort, min, max, fromdate, and todate.     This method returns a list of posts. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPostsByIdsTest() throws ApiException {
        String ids = null;
        String site = null;
        String order = null;
        String max = null;
        String min = null;
        String sort = null;
        Integer fromdate = null;
        Integer todate = null;
        Integer pagesize = null;
        Integer page = null;
        String filter = null;
        String paramCallback = null;
        List<PostsInner> response = api.getPostsByIds(ids, site)
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
        // TODO: test validations
    }

    /**
     * Returns suggsted edits on the posts identified in ids.    - creation - creation_date  - approval - approval_date  - rejection - rejection_date   creation is the default sort.    {ids} can contain up to 100 semicolon delimited ids, to find ids programatically look for post_id, answer_id, or question_id on post, answer, and question objects respectively.     This method returns a list of suggested-edits. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSuggestedEditsTest() throws ApiException {
        String ids = null;
        String site = null;
        String order = null;
        String max = null;
        String min = null;
        String sort = null;
        Integer fromdate = null;
        Integer todate = null;
        Integer pagesize = null;
        Integer page = null;
        String filter = null;
        String paramCallback = null;
        List<SuggestedEditsInner> response = api.listSuggestedEdits(ids, site)
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
        // TODO: test validations
    }

}
