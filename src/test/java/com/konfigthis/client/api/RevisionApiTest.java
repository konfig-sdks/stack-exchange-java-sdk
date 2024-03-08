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
import com.konfigthis.client.model.RevisionsInner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RevisionApi
 */
@Disabled
public class RevisionApiTest {

    private static RevisionApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new RevisionApi(apiClient);
    }

    /**
     * Returns edit revisions identified by ids in {ids}.   {ids} can contain up to 20 semicolon delimited ids, to find ids programatically look for revision_guid on revision objects. Note that unlike most other id types in the API, revision_guid is a string.   This method returns a list of revisions. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listRevisionsByIdsTest() throws ApiException {
        String ids = null;
        String site = null;
        Integer fromdate = null;
        Integer todate = null;
        Integer pagesize = null;
        Integer page = null;
        String filter = null;
        String paramCallback = null;
        List<RevisionsInner> response = api.listRevisionsByIds(ids, site)
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
