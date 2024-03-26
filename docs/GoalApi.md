# GoalApi

All URIs are relative to *https://.keka.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listWithHierarchy**](GoalApi.md#listWithHierarchy) | **GET** /pms/goals | Gets goal list. |
| [**updateProgress**](GoalApi.md#updateProgress) | **PUT** /pms/goals/{goalId}/progress | Update goal progress |


<a name="listWithHierarchy"></a>
# **listWithHierarchy**
> APIGoalPagedResponse listWithHierarchy().goalIds(goalIds).timeFrameIds(timeFrameIds).employeeIds(employeeIds).from(from).to(to).pageNumber(pageNumber).pageSize(pageSize).execute();

Gets goal list.

Gets all goals along with parent goal and child goals

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalApi;
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
    String goalIds = "goalIds_example"; // Comma separated list of one or more Goal ids you'd like to filter on.
    String timeFrameIds = "timeFrameIds_example"; // Comma separated list of one or more Time Frame ids you'd like to filter on.
    String employeeIds = "employeeIds_example"; // Comma separated list of one or more Employee ids you'd like to filter on.
    OffsetDateTime from = OffsetDateTime.now(); // Date/time when goal time period will start, in ISO 8601 format (YYYY-MM-DDThh:mm:ss±hh). If not specified  defaults `to` - 60 days.
    OffsetDateTime to = OffsetDateTime.now(); // Date/time when goal time period will end, in ISO 8601 format (YYYY-MM-DDThh:mm:ss±hh). If not specified  defaults `from` + 60 days.
    Integer pageNumber = 56;
    Integer pageSize = 56; // Represents how many results you'd like to retrieve per request (page). Default is 100. Max is 200
    try {
      APIGoalPagedResponse result = client
              .goal
              .listWithHierarchy()
              .goalIds(goalIds)
              .timeFrameIds(timeFrameIds)
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
      System.err.println("Exception when calling GoalApi#listWithHierarchy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIGoalPagedResponse> response = client
              .goal
              .listWithHierarchy()
              .goalIds(goalIds)
              .timeFrameIds(timeFrameIds)
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
      System.err.println("Exception when calling GoalApi#listWithHierarchy");
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
| **goalIds** | **String**| Comma separated list of one or more Goal ids you&#39;d like to filter on. | [optional] |
| **timeFrameIds** | **String**| Comma separated list of one or more Time Frame ids you&#39;d like to filter on. | [optional] |
| **employeeIds** | **String**| Comma separated list of one or more Employee ids you&#39;d like to filter on. | [optional] |
| **from** | **OffsetDateTime**| Date/time when goal time period will start, in ISO 8601 format (YYYY-MM-DDThh:mm:ss±hh). If not specified  defaults &#x60;to&#x60; - 60 days. | [optional] |
| **to** | **OffsetDateTime**| Date/time when goal time period will end, in ISO 8601 format (YYYY-MM-DDThh:mm:ss±hh). If not specified  defaults &#x60;from&#x60; + 60 days. | [optional] |
| **pageNumber** | **Integer**|  | [optional] |
| **pageSize** | **Integer**| Represents how many results you&#39;d like to retrieve per request (page). Default is 100. Max is 200 | [optional] |

### Return type

[**APIGoalPagedResponse**](APIGoalPagedResponse.md)

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

<a name="updateProgress"></a>
# **updateProgress**
> BooleanResponse updateProgress(goalId).apIUpdateGoalProgress(apIUpdateGoalProgress).execute();

Update goal progress

Update the goal progress

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalApi;
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
    Double currentValue = 3.4D;
    GoalStatus status = GoalStatus.fromValue("0");
    String updatedBy = "updatedBy_example";
    String goalId = "goalId_example"; // The goal identifier.
    String note = "note_example";
    try {
      BooleanResponse result = client
              .goal
              .updateProgress(currentValue, status, updatedBy, goalId)
              .note(note)
              .execute();
      System.out.println(result);
      System.out.println(result.getSucceeded());
      System.out.println(result.getMessage());
      System.out.println(result.getErrors());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalApi#updateProgress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BooleanResponse> response = client
              .goal
              .updateProgress(currentValue, status, updatedBy, goalId)
              .note(note)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalApi#updateProgress");
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
| **goalId** | **String**| The goal identifier. | |
| **apIUpdateGoalProgress** | [**APIUpdateGoalProgress**](APIUpdateGoalProgress.md)| The update goal progress view. | [optional] |

### Return type

[**BooleanResponse**](BooleanResponse.md)

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

