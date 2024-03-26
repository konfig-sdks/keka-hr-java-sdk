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


import com.konfigthis.client.model.ApiLookupPagedResponse;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AssetCategoryApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AssetCategoryApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AssetCategoryApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getAllCall(String assetCategoryIds, OffsetDateTime lastModified, Integer pageNumber, Integer pageSize, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/assets/categories";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (assetCategoryIds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("assetCategoryIds", assetCategoryIds));
        }

        if (lastModified != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lastModified", lastModified));
        }

        if (pageNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageNumber", pageNumber));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        final String[] localVarAccepts = {
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllValidateBeforeCall(String assetCategoryIds, OffsetDateTime lastModified, Integer pageNumber, Integer pageSize, final ApiCallback _callback) throws ApiException {
        return getAllCall(assetCategoryIds, lastModified, pageNumber, pageSize, _callback);

    }


    private ApiResponse<ApiLookupPagedResponse> getAllWithHttpInfo(String assetCategoryIds, OffsetDateTime lastModified, Integer pageNumber, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getAllValidateBeforeCall(assetCategoryIds, lastModified, pageNumber, pageSize, null);
        Type localVarReturnType = new TypeToken<ApiLookupPagedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAllAsync(String assetCategoryIds, OffsetDateTime lastModified, Integer pageNumber, Integer pageSize, final ApiCallback<ApiLookupPagedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllValidateBeforeCall(assetCategoryIds, lastModified, pageNumber, pageSize, _callback);
        Type localVarReturnType = new TypeToken<ApiLookupPagedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAllRequestBuilder {
        private String assetCategoryIds;
        private OffsetDateTime lastModified;
        private Integer pageNumber;
        private Integer pageSize;

        private GetAllRequestBuilder() {
        }

        /**
         * Set assetCategoryIds
         * @param assetCategoryIds The asset category ids. (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder assetCategoryIds(String assetCategoryIds) {
            this.assetCategoryIds = assetCategoryIds;
            return this;
        }
        
        /**
         * Set lastModified
         * @param lastModified The last modified. (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder lastModified(OffsetDateTime lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        
        /**
         * Set pageNumber
         * @param pageNumber  (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        
        /**
         * Set pageSize
         * @param pageSize Represents how many results you&#39;d like to retrieve per request (page). Default is 100. Max is 200 (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        
        /**
         * Build call for getAll
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAllCall(assetCategoryIds, lastModified, pageNumber, pageSize, _callback);
        }


        /**
         * Execute getAll request
         * @return ApiLookupPagedResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public ApiLookupPagedResponse execute() throws ApiException {
            ApiResponse<ApiLookupPagedResponse> localVarResp = getAllWithHttpInfo(assetCategoryIds, lastModified, pageNumber, pageSize);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAll request with HTTP info returned
         * @return ApiResponse&lt;ApiLookupPagedResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ApiLookupPagedResponse> executeWithHttpInfo() throws ApiException {
            return getAllWithHttpInfo(assetCategoryIds, lastModified, pageNumber, pageSize);
        }

        /**
         * Execute getAll request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ApiLookupPagedResponse> _callback) throws ApiException {
            return getAllAsync(assetCategoryIds, lastModified, pageNumber, pageSize, _callback);
        }
    }

    /**
     * Get all Asset Categories
     * Get all Asset Categories
     * @return GetAllRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public GetAllRequestBuilder getAll() throws IllegalArgumentException {
        return new GetAllRequestBuilder();
    }
}