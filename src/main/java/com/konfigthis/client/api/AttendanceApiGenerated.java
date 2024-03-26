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


import com.konfigthis.client.model.AttendanceSummaryPagedResponse;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AttendanceApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AttendanceApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AttendanceApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getRecordsInRangeCall(String employeeIds, OffsetDateTime from, OffsetDateTime to, Integer pageNumber, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/time/attendance";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (employeeIds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("employeeIds", employeeIds));
        }

        if (from != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from", from));
        }

        if (to != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("to", to));
        }

        if (pageNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageNumber", pageNumber));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call getRecordsInRangeValidateBeforeCall(String employeeIds, OffsetDateTime from, OffsetDateTime to, Integer pageNumber, Integer pageSize, final ApiCallback _callback) throws ApiException {
        return getRecordsInRangeCall(employeeIds, from, to, pageNumber, pageSize, _callback);

    }


    private ApiResponse<AttendanceSummaryPagedResponse> getRecordsInRangeWithHttpInfo(String employeeIds, OffsetDateTime from, OffsetDateTime to, Integer pageNumber, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getRecordsInRangeValidateBeforeCall(employeeIds, from, to, pageNumber, pageSize, null);
        Type localVarReturnType = new TypeToken<AttendanceSummaryPagedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getRecordsInRangeAsync(String employeeIds, OffsetDateTime from, OffsetDateTime to, Integer pageNumber, Integer pageSize, final ApiCallback<AttendanceSummaryPagedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRecordsInRangeValidateBeforeCall(employeeIds, from, to, pageNumber, pageSize, _callback);
        Type localVarReturnType = new TypeToken<AttendanceSummaryPagedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetRecordsInRangeRequestBuilder {
        private String employeeIds;
        private OffsetDateTime from;
        private OffsetDateTime to;
        private Integer pageNumber;
        private Integer pageSize;

        private GetRecordsInRangeRequestBuilder() {
        }

        /**
         * Set employeeIds
         * @param employeeIds Comma separated list of one or more Employee ids you&#39;d like to filter on. (optional)
         * @return GetRecordsInRangeRequestBuilder
         */
        public GetRecordsInRangeRequestBuilder employeeIds(String employeeIds) {
            this.employeeIds = employeeIds;
            return this;
        }
        
        /**
         * Set from
         * @param from Date from records to retrieve. If not specified defaults to &#x60;to - 30&#x60; days. (optional)
         * @return GetRecordsInRangeRequestBuilder
         */
        public GetRecordsInRangeRequestBuilder from(OffsetDateTime from) {
            this.from = from;
            return this;
        }
        
        /**
         * Set to
         * @param to Date to records can be retrieved. If not specified defaults to &#x60;today&#x60;. (optional)
         * @return GetRecordsInRangeRequestBuilder
         */
        public GetRecordsInRangeRequestBuilder to(OffsetDateTime to) {
            this.to = to;
            return this;
        }
        
        /**
         * Set pageNumber
         * @param pageNumber  (optional)
         * @return GetRecordsInRangeRequestBuilder
         */
        public GetRecordsInRangeRequestBuilder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        
        /**
         * Set pageSize
         * @param pageSize Represents how many results you&#39;d like to retrieve per request (page). Default is 100. Max is 200 (optional)
         * @return GetRecordsInRangeRequestBuilder
         */
        public GetRecordsInRangeRequestBuilder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        
        /**
         * Build call for getRecordsInRange
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getRecordsInRangeCall(employeeIds, from, to, pageNumber, pageSize, _callback);
        }


        /**
         * Execute getRecordsInRange request
         * @return AttendanceSummaryPagedResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         </table>
         */
        public AttendanceSummaryPagedResponse execute() throws ApiException {
            ApiResponse<AttendanceSummaryPagedResponse> localVarResp = getRecordsInRangeWithHttpInfo(employeeIds, from, to, pageNumber, pageSize);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getRecordsInRange request with HTTP info returned
         * @return ApiResponse&lt;AttendanceSummaryPagedResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AttendanceSummaryPagedResponse> executeWithHttpInfo() throws ApiException {
            return getRecordsInRangeWithHttpInfo(employeeIds, from, to, pageNumber, pageSize);
        }

        /**
         * Execute getRecordsInRange request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AttendanceSummaryPagedResponse> _callback) throws ApiException {
            return getRecordsInRangeAsync(employeeIds, from, to, pageNumber, pageSize, _callback);
        }
    }

    /**
     * Get all Attendance Records
     * Gets all Attendance records between date range &#x60;from&#x60; and &#x60;to&#x60;.If both &#x60;from&#x60; and &#x60;to&#x60; are not specified, last 30 days records are returned.From &#x60;date&#x60; should be before &#x60;to&#x60; date.The difference between &#x60;from&#x60; and &#x60;to&#x60; date cannot be more than **90** days.
     * @return GetRecordsInRangeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public GetRecordsInRangeRequestBuilder getRecordsInRange() throws IllegalArgumentException {
        return new GetRecordsInRangeRequestBuilder();
    }
}