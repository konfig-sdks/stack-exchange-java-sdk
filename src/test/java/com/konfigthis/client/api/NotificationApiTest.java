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
import com.konfigthis.client.model.InboxItemsInner;
import com.konfigthis.client.model.NotificationsInner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationApi
 */
@Disabled
public class NotificationApiTest {

    private static NotificationApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new NotificationApi(apiClient);
    }

    /**
     * Returns the unread items in the user identified by access_token&#39;s inbox.   This method requires an access_token, with a scope containing \&quot;read_inbox\&quot;.   This method returns a list of inbox items. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUnreadItemsInInboxTest() throws ApiException {
        String site = null;
        Integer pagesize = null;
        Integer page = null;
        String filter = null;
        String paramCallback = null;
        Integer since = null;
        List<InboxItemsInner> response = api.getUnreadItemsInInbox(site)
                .pagesize(pagesize)
                .page(page)
                .filter(filter)
                .paramCallback(paramCallback)
                .since(since)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a user&#39;s unread notifications, given an access_token.   This method requires an access_token, with a scope containing \&quot;read_inbox\&quot;.   This method returns a list of notifications. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUnreadItemsInInbox_0Test() throws ApiException {
        String site = null;
        Integer pagesize = null;
        Integer page = null;
        String filter = null;
        String paramCallback = null;
        List<NotificationsInner> response = api.getUnreadItemsInInbox_0(site)
                .pagesize(pagesize)
                .page(page)
                .filter(filter)
                .paramCallback(paramCallback)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a user&#39;s notifications.   This method requires an access_token, with a scope containing \&quot;read_inbox\&quot;.   This method returns a list of notifications. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserNotificationsTest() throws ApiException {
        Integer pagesize = null;
        Integer page = null;
        String filter = null;
        String paramCallback = null;
        List<NotificationsInner> response = api.getUserNotifications()
                .pagesize(pagesize)
                .page(page)
                .filter(filter)
                .paramCallback(paramCallback)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a user&#39;s notifications, given an access_token.   This method requires an access_token, with a scope containing \&quot;read_inbox\&quot;.   This method returns a list of notifications. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserNotificationsListTest() throws ApiException {
        String site = null;
        Integer pagesize = null;
        Integer page = null;
        String filter = null;
        String paramCallback = null;
        List<NotificationsInner> response = api.getUserNotificationsList(site)
                .pagesize(pagesize)
                .page(page)
                .filter(filter)
                .paramCallback(paramCallback)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a user&#39;s unread notifications.   This method requires an access_token, with a scope containing \&quot;read_inbox\&quot;.   This method returns a list of notifications. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserUnreadNotificationsTest() throws ApiException {
        Integer pagesize = null;
        Integer page = null;
        String filter = null;
        String paramCallback = null;
        List<NotificationsInner> response = api.getUserUnreadNotifications()
                .pagesize(pagesize)
                .page(page)
                .filter(filter)
                .paramCallback(paramCallback)
                .execute();
        // TODO: test validations
    }

}
