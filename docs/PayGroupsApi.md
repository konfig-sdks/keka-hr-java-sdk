# PayGroupsApi

All URIs are relative to *https://.keka.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAll**](PayGroupsApi.md#getAll) | **GET** /payroll/paygroups | Get all Pay Groups |


<a name="getAll"></a>
# **getAll**
> APIPayGroupViewPagedResponse getAll().pageNumber(pageNumber).pageSize(pageSize).execute();

Get all Pay Groups

Gets all Pay Groups.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayGroupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://.keka.com/api/v1";
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    KekaHr client = new KekaHr(configuration);
    Integer pageNumber = 56;
    Integer pageSize = 56; // Represents how many results you'd like to retrieve per request (page). Default is 100. Max is 200
    try {
      APIPayGroupViewPagedResponse result = client
              .payGroups
              .getAll()
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getSucceeded());
      System.out.println(result.getMessage());
      System.out.println(result.getErrors());
      System.out.println(result.getData());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPageSize());
      System.out.println(result.getFirstPage());
      System.out.println(result.getLastPage());
      System.out.println(result.getTotalPages());
      System.out.println(result.getTotalRecords());
      System.out.println(result.getNextPage());
      System.out.println(result.getPreviousPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayGroupsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIPayGroupViewPagedResponse> response = client
              .payGroups
              .getAll()
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayGroupsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageNumber** | **Integer**|  | [optional] |
| **pageSize** | **Integer**| Represents how many results you&#39;d like to retrieve per request (page). Default is 100. Max is 200 | [optional] |

### Return type

[**APIPayGroupViewPagedResponse**](APIPayGroupViewPagedResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
