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
import com.konfigthis.client.model.QuestionsInner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FavoriteApi
 */
@Disabled
public class FavoriteApiTest {

    private static FavoriteApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new FavoriteApi(apiClient);
    }

    /**
     * Returns the questions favorites by the user associated with the given access_token.   This method returns a list of questions. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserFavoritesTest() throws ApiException {
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
        List<QuestionsInner> response = api.getUserFavorites(site)
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
