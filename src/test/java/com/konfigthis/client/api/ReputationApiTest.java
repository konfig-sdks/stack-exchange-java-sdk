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
import com.konfigthis.client.model.ReputationChangesInner;
import com.konfigthis.client.model.ReputationHistoryInner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReputationApi
 */
@Disabled
public class ReputationApiTest {

    private static ReputationApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ReputationApi(apiClient);
    }

    /**
     * Returns user&#39;s full reputation history, including private events.    This method requires an access_token, with a scope containing \&quot;private_info\&quot;.     This method returns a list of reputation_history. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFullHistoryTest() throws ApiException {
        String site = null;
        Integer pagesize = null;
        Integer page = null;
        String filter = null;
        String paramCallback = null;
        List<ReputationHistoryInner> response = api.getFullHistory(site)
                .pagesize(pagesize)
                .page(page)
                .filter(filter)
                .paramCallback(paramCallback)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns the reputation changed for the user associated with the given access_token.   This method returns a list of reputation changes. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserReputationChangesTest() throws ApiException {
        String site = null;
        String filter = null;
        String paramCallback = null;
        List<ReputationChangesInner> response = api.getUserReputationChanges(site)
                .filter(filter)
                .paramCallback(paramCallback)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns user&#39;s public reputation history.   This method returns a list of reputation_history. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserReputationHistoryTest() throws ApiException {
        String site = null;
        Integer pagesize = null;
        Integer page = null;
        String filter = null;
        String paramCallback = null;
        List<ReputationHistoryInner> response = api.getUserReputationHistory(site)
                .pagesize(pagesize)
                .page(page)
                .filter(filter)
                .paramCallback(paramCallback)
                .execute();
        // TODO: test validations
    }

}
