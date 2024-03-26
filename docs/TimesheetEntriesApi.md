# TimesheetEntriesApi

All URIs are relative to *https://.keka.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBetweenDates**](TimesheetEntriesApi.md#getBetweenDates) | **GET** /psa/timeentries | Get project timesheet entries. |


<a name="getBetweenDates"></a>
# **getBetweenDates**
> APITimesheetEntryPagedResponse getBetweenDates().from(from).to(to).employeeIds(employeeIds).projectIds(projectIds).taskIds(taskIds).pageNumber(pageNumber).pageSize(pageSize).execute();

Get project timesheet entries.

Gets the time entries between selected from and to date range.If both &#x60;from&#x60; and &#x60;to&#x60; are not specified, last 30 days records are returned.From &#x60;date&#x60; should be before &#x60;to&#x60; date.The difference between &#x60;from&#x60; and &#x60;to&#x60; date cannot be more than **90** days.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetEntriesApi;
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
    OffsetDateTime from = OffsetDateTime.now(); // Date from records to retrieve. If not specified defaults to `to - 30` days.
    OffsetDateTime to = OffsetDateTime.now(); // Date to records can be retrieved. If not specified defaults to `today`.
    String employeeIds = "employeeIds_example"; // Comma separated list of one or more Employee ids you'd like to filter on.
    String projectIds = "projectIds_example"; // Comma separated list of one or more project ids you'd like to filter on.
    String taskIds = "taskIds_example"; // Comma separated list of one or more task ids you'd like to filter on.
    Integer pageNumber = 56;
    Integer pageSize = 56; // Represents how many results you'd like to retrieve per request (page). Default is 100. Max is 200
    try {
      APITimesheetEntryPagedResponse result = client
              .timesheetEntries
              .getBetweenDates()
              .from(from)
              .to(to)
              .employeeIds(employeeIds)
              .projectIds(projectIds)
              .taskIds(taskIds)
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
      System.err.println("Exception when calling TimesheetEntriesApi#getBetweenDates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APITimesheetEntryPagedResponse> response = client
              .timesheetEntries
              .getBetweenDates()
              .from(from)
              .to(to)
              .employeeIds(employeeIds)
              .projectIds(projectIds)
              .taskIds(taskIds)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetEntriesApi#getBetweenDates");
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
| **from** | **OffsetDateTime**| Date from records to retrieve. If not specified defaults to &#x60;to - 30&#x60; days. | [optional] |
| **to** | **OffsetDateTime**| Date to records can be retrieved. If not specified defaults to &#x60;today&#x60;. | [optional] |
| **employeeIds** | **String**| Comma separated list of one or more Employee ids you&#39;d like to filter on. | [optional] |
| **projectIds** | **String**| Comma separated list of one or more project ids you&#39;d like to filter on. | [optional] |
| **taskIds** | **String**| Comma separated list of one or more task ids you&#39;d like to filter on. | [optional] |
| **pageNumber** | **Integer**|  | [optional] |
| **pageSize** | **Integer**| Represents how many results you&#39;d like to retrieve per request (page). Default is 100. Max is 200 | [optional] |

### Return type

[**APITimesheetEntryPagedResponse**](APITimesheetEntryPagedResponse.md)

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

