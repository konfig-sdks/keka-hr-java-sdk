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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.AuthenticationGetAccessTokenRequest;
import com.konfigthis.client.model.AuthenticationGetAccessTokenResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AuthenticationApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuthenticationApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AuthenticationApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getAccessTokenCall(String grantType, String scope, String clientId, String clientSecret, String apiKey, AuthenticationGetAccessTokenRequest authenticationGetAccessTokenRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = authenticationGetAccessTokenRequest;

        // create path and map variables
        String localVarPath = "/connect/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (grantType != null) {
            localVarFormParams.put("grant_type", grantType);
        }

        if (scope != null) {
            localVarFormParams.put("scope", scope);
        }

        if (clientId != null) {
            localVarFormParams.put("client_id", clientId);
        }

        if (clientSecret != null) {
            localVarFormParams.put("client_secret", clientSecret);
        }

        if (apiKey != null) {
            localVarFormParams.put("api_key", apiKey);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAccessTokenValidateBeforeCall(String grantType, String scope, String clientId, String clientSecret, String apiKey, AuthenticationGetAccessTokenRequest authenticationGetAccessTokenRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new ApiException("Missing the required parameter 'grantType' when calling getAccessToken(Async)");
        }

        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getAccessToken(Async)");
        }

        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling getAccessToken(Async)");
        }

        // verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new ApiException("Missing the required parameter 'clientSecret' when calling getAccessToken(Async)");
        }

        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling getAccessToken(Async)");
        }

        return getAccessTokenCall(grantType, scope, clientId, clientSecret, apiKey, authenticationGetAccessTokenRequest, _callback);

    }


    private ApiResponse<AuthenticationGetAccessTokenResponse> getAccessTokenWithHttpInfo(String grantType, String scope, String clientId, String clientSecret, String apiKey, AuthenticationGetAccessTokenRequest authenticationGetAccessTokenRequest) throws ApiException {
        okhttp3.Call localVarCall = getAccessTokenValidateBeforeCall(grantType, scope, clientId, clientSecret, apiKey, authenticationGetAccessTokenRequest, null);
        Type localVarReturnType = new TypeToken<AuthenticationGetAccessTokenResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAccessTokenAsync(String grantType, String scope, String clientId, String clientSecret, String apiKey, AuthenticationGetAccessTokenRequest authenticationGetAccessTokenRequest, final ApiCallback<AuthenticationGetAccessTokenResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAccessTokenValidateBeforeCall(grantType, scope, clientId, clientSecret, apiKey, authenticationGetAccessTokenRequest, _callback);
        Type localVarReturnType = new TypeToken<AuthenticationGetAccessTokenResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAccessTokenRequestBuilder {
        private final String grantType;
        private final String scope;
        private final String clientId;
        private final String clientSecret;
        private final String apiKey;

        private GetAccessTokenRequestBuilder(String grantType, String scope, String clientId, String clientSecret, String apiKey) {
            this.grantType = grantType;
            this.scope = scope;
            this.clientId = clientId;
            this.clientSecret = clientSecret;
            this.apiKey = apiKey;
        }

        /**
         * Build call for getAccessToken
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            AuthenticationGetAccessTokenRequest authenticationGetAccessTokenRequest = buildBodyParams();
            return getAccessTokenCall(grantType, scope, clientId, clientSecret, apiKey, authenticationGetAccessTokenRequest, _callback);
        }

        private AuthenticationGetAccessTokenRequest buildBodyParams() {
            AuthenticationGetAccessTokenRequest authenticationGetAccessTokenRequest = new AuthenticationGetAccessTokenRequest();
            authenticationGetAccessTokenRequest.grantType(this.grantType);
            authenticationGetAccessTokenRequest.scope(this.scope);
            authenticationGetAccessTokenRequest.clientId(this.clientId);
            authenticationGetAccessTokenRequest.clientSecret(this.clientSecret);
            authenticationGetAccessTokenRequest.apiKey(this.apiKey);
            return authenticationGetAccessTokenRequest;
        }

        /**
         * Execute getAccessToken request
         * @return AuthenticationGetAccessTokenResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public AuthenticationGetAccessTokenResponse execute() throws ApiException {
            AuthenticationGetAccessTokenRequest authenticationGetAccessTokenRequest = buildBodyParams();
            ApiResponse<AuthenticationGetAccessTokenResponse> localVarResp = getAccessTokenWithHttpInfo(grantType, scope, clientId, clientSecret, apiKey, authenticationGetAccessTokenRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAccessToken request with HTTP info returned
         * @return ApiResponse&lt;AuthenticationGetAccessTokenResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AuthenticationGetAccessTokenResponse> executeWithHttpInfo() throws ApiException {
            AuthenticationGetAccessTokenRequest authenticationGetAccessTokenRequest = buildBodyParams();
            return getAccessTokenWithHttpInfo(grantType, scope, clientId, clientSecret, apiKey, authenticationGetAccessTokenRequest);
        }

        /**
         * Execute getAccessToken request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AuthenticationGetAccessTokenResponse> _callback) throws ApiException {
            AuthenticationGetAccessTokenRequest authenticationGetAccessTokenRequest = buildBodyParams();
            return getAccessTokenAsync(grantType, scope, clientId, clientSecret, apiKey, authenticationGetAccessTokenRequest, _callback);
        }
    }

    /**
     * Generate Access Token
     * Use this API to fetch access token by passing authentication parameters ( grant_type, scope, client_id, client_secret, api_key) as form-url encoded in the body.
     * @param grantType  (required)
     * @param scope  (required)
     * @param clientId  (required)
     * @param clientSecret  (required)
     * @param apiKey  (required)
     * @return GetAccessTokenRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public GetAccessTokenRequestBuilder getAccessToken(String grantType, String scope, String clientId, String clientSecret, String apiKey) throws IllegalArgumentException {
        if (grantType == null) throw new IllegalArgumentException("\"grantType\" is required but got null");
            

        if (scope == null) throw new IllegalArgumentException("\"scope\" is required but got null");
            

        if (clientId == null) throw new IllegalArgumentException("\"clientId\" is required but got null");
            

        if (clientSecret == null) throw new IllegalArgumentException("\"clientSecret\" is required but got null");
            

        if (apiKey == null) throw new IllegalArgumentException("\"apiKey\" is required but got null");
            

        return new GetAccessTokenRequestBuilder(grantType, scope, clientId, clientSecret, apiKey);
    }
}
