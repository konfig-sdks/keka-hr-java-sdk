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


import com.konfigthis.client.model.ExpenseCategoryPagedResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ExpenseCategoryApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ExpenseCategoryApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ExpenseCategoryApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getAllCategoriesCall(String expenseCategoryIds, Integer pageNumber, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/expense/categories";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (expenseCategoryIds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("expenseCategoryIds", expenseCategoryIds));
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
    private okhttp3.Call getAllCategoriesValidateBeforeCall(String expenseCategoryIds, Integer pageNumber, Integer pageSize, final ApiCallback _callback) throws ApiException {
        return getAllCategoriesCall(expenseCategoryIds, pageNumber, pageSize, _callback);

    }


    private ApiResponse<ExpenseCategoryPagedResponse> getAllCategoriesWithHttpInfo(String expenseCategoryIds, Integer pageNumber, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getAllCategoriesValidateBeforeCall(expenseCategoryIds, pageNumber, pageSize, null);
        Type localVarReturnType = new TypeToken<ExpenseCategoryPagedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAllCategoriesAsync(String expenseCategoryIds, Integer pageNumber, Integer pageSize, final ApiCallback<ExpenseCategoryPagedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllCategoriesValidateBeforeCall(expenseCategoryIds, pageNumber, pageSize, _callback);
        Type localVarReturnType = new TypeToken<ExpenseCategoryPagedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAllCategoriesRequestBuilder {
        private String expenseCategoryIds;
        private Integer pageNumber;
        private Integer pageSize;

        private GetAllCategoriesRequestBuilder() {
        }

        /**
         * Set expenseCategoryIds
         * @param expenseCategoryIds Comma separated list of one or more  expense categories identifiers you&#39;d like to filter on. (optional)
         * @return GetAllCategoriesRequestBuilder
         */
        public GetAllCategoriesRequestBuilder expenseCategoryIds(String expenseCategoryIds) {
            this.expenseCategoryIds = expenseCategoryIds;
            return this;
        }
        
        /**
         * Set pageNumber
         * @param pageNumber  (optional)
         * @return GetAllCategoriesRequestBuilder
         */
        public GetAllCategoriesRequestBuilder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        
        /**
         * Set pageSize
         * @param pageSize Represents how many results you&#39;d like to retrieve per request (page). Default is 100. Max is 200 (optional)
         * @return GetAllCategoriesRequestBuilder
         */
        public GetAllCategoriesRequestBuilder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        
        /**
         * Build call for getAllCategories
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
            return getAllCategoriesCall(expenseCategoryIds, pageNumber, pageSize, _callback);
        }


        /**
         * Execute getAllCategories request
         * @return ExpenseCategoryPagedResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public ExpenseCategoryPagedResponse execute() throws ApiException {
            ApiResponse<ExpenseCategoryPagedResponse> localVarResp = getAllCategoriesWithHttpInfo(expenseCategoryIds, pageNumber, pageSize);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAllCategories request with HTTP info returned
         * @return ApiResponse&lt;ExpenseCategoryPagedResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ExpenseCategoryPagedResponse> executeWithHttpInfo() throws ApiException {
            return getAllCategoriesWithHttpInfo(expenseCategoryIds, pageNumber, pageSize);
        }

        /**
         * Execute getAllCategories request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<ExpenseCategoryPagedResponse> _callback) throws ApiException {
            return getAllCategoriesAsync(expenseCategoryIds, pageNumber, pageSize, _callback);
        }
    }

    /**
     * Get all Expense Categories
     * Get all Expense Categories
     * @return GetAllCategoriesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public GetAllCategoriesRequestBuilder getAllCategories() throws IllegalArgumentException {
        return new GetAllCategoriesRequestBuilder();
    }
}
