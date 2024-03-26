# LeaveRequestsApi

All URIs are relative to *https://.keka.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRequestIdentifier**](LeaveRequestsApi.md#createRequestIdentifier) | **POST** /time/leaverequests | Create an Leave Request |
| [**getAllBetweenDates**](LeaveRequestsApi.md#getAllBetweenDates) | **GET** /time/leaverequests | Get all Leave Requests |


<a name="createRequestIdentifier"></a>
# **createRequestIdentifier**
> StringResponse createRequestIdentifier().postLeaveRequest(postLeaveRequest).execute();

Create an Leave Request

Create an leave request and returns leave request identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveRequestsApi;
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
    String employeeId = "employeeId_example";
    String requestedBy = "requestedBy_example";
    OffsetDateTime fromDate = OffsetDateTime.now();
    OffsetDateTime toDate = OffsetDateTime.now();
    String leaveTypeId = "leaveTypeId_example";
    String reason = "reason_example";
    SessionType fromSession = SessionType.fromValue("0");
    SessionType toSession = SessionType.fromValue("0");
    String note = "note_example";
    try {
      StringResponse result = client
              .leaveRequests
              .createRequestIdentifier(employeeId, requestedBy, fromDate, toDate, leaveTypeId, reason)
              .fromSession(fromSession)
              .toSession(toSession)
              .note(note)
              .execute();
      System.out.println(result);
      System.out.println(result.getSucceeded());
      System.out.println(result.getMessage());
      System.out.println(result.getErrors());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveRequestsApi#createRequestIdentifier");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StringResponse> response = client
              .leaveRequests
              .createRequestIdentifier(employeeId, requestedBy, fromDate, toDate, leaveTypeId, reason)
              .fromSession(fromSession)
              .toSession(toSession)
              .note(note)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveRequestsApi#createRequestIdentifier");
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
| **postLeaveRequest** | [**PostLeaveRequest**](PostLeaveRequest.md)| The leave request. | [optional] |

### Return type

[**StringResponse**](StringResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="getAllBetweenDates"></a>
# **getAllBetweenDates**
> LeaveRequestPagedResponse getAllBetweenDates().employeeIds(employeeIds).from(from).to(to).pageNumber(pageNumber).pageSize(pageSize).execute();

Get all Leave Requests

Get all the leaves in the organization between &#x60;from&#x60; and &#x60;to&#x60; date.If both &#x60;from&#x60; and &#x60;to&#x60; are not specified, last 30 days records are returned.&#x60;from&#x60; date should be before &#x60;to&#x60; date.The difference between &#x60;from&#x60; and &#x60;to&#x60; date cannot be more than **90** days.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveRequestsApi;
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
    String employeeIds = "employeeIds_example"; // Comma separated list of one or more Employee ids you'd like to filter on.
    OffsetDateTime from = OffsetDateTime.now(); // From date.
    OffsetDateTime to = OffsetDateTime.now(); // To date.
    Integer pageNumber = 56;
    Integer pageSize = 56; // Represents how many results you'd like to retrieve per request (page). Default is 100. Max is 200
    try {
      LeaveRequestPagedResponse result = client
              .leaveRequests
              .getAllBetweenDates()
              .employeeIds(employeeIds)
              .from(from)
              .to(to)
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
      System.err.println("Exception when calling LeaveRequestsApi#getAllBetweenDates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveRequestPagedResponse> response = client
              .leaveRequests
              .getAllBetweenDates()
              .employeeIds(employeeIds)
              .from(from)
              .to(to)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveRequestsApi#getAllBetweenDates");
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
| **employeeIds** | **String**| Comma separated list of one or more Employee ids you&#39;d like to filter on. | [optional] |
| **from** | **OffsetDateTime**| From date. | [optional] |
| **to** | **OffsetDateTime**| To date. | [optional] |
| **pageNumber** | **Integer**|  | [optional] |
| **pageSize** | **Integer**| Represents how many results you&#39;d like to retrieve per request (page). Default is 100. Max is 200 | [optional] |

### Return type

[**LeaveRequestPagedResponse**](LeaveRequestPagedResponse.md)

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

