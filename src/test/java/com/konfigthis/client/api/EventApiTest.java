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
import com.konfigthis.client.model.EventsInner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventApi
 */
@Disabled
public class EventApiTest {

    private static EventApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EventApi(apiClient);
    }

    /**
     * Returns a stream of events that have occurred on the site.   The API considers the following \&quot;events\&quot;:  - posting a question  - posting an answer  - posting a comment  - editing a post  - creating a user          Events are only accessible for 15 minutes after they occurred, and by default only events in the last 5 minutes are returned. You can specify the age of the oldest event returned by setting the since parameter.   It is advised that developers batch events by ids and make as few subsequent requests to other methods as possible.   This method returns a list of events. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEventsTest() throws ApiException {
        String site = null;
        Integer pagesize = null;
        Integer page = null;
        String filter = null;
        String paramCallback = null;
        Integer since = null;
        List<EventsInner> response = api.listEvents(site)
                .pagesize(pagesize)
                .page(page)
                .filter(filter)
                .paramCallback(paramCallback)
                .since(since)
                .execute();
        // TODO: test validations
    }

}
