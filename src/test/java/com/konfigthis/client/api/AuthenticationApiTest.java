/*
 * Requisition
 * Here's our story,  It all began with the frustration of using software that sucks. Prior to starting Keka, our core team was a 100 person business that needed an easy to use software for managing employees. We looked everywhere and all we found were software that was lousy and hard to use. We felt SME businesses in India deserved something better. Something awesome actually!  Thus emerged Keka!
 *
 * The version of the OpenAPI document: v1
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
import com.konfigthis.client.model.AuthenticationGetAccessTokenRequest;
import com.konfigthis.client.model.AuthenticationGetAccessTokenResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationApi
 */
@Disabled
public class AuthenticationApiTest {

    private static AuthenticationApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AuthenticationApi(apiClient);
    }

    /**
     * Generate Access Token
     *
     * Use this API to fetch access token by passing authentication parameters ( grant_type, scope, client_id, client_secret, api_key) as form-url encoded in the body.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccessTokenTest() throws ApiException {
        String grantType = null;
        String scope = null;
        String clientId = null;
        String clientSecret = null;
        String apiKey = null;
        AuthenticationGetAccessTokenResponse response = api.getAccessToken(grantType, scope, clientId, clientSecret, apiKey)
                .execute();
        // TODO: test validations
    }

}