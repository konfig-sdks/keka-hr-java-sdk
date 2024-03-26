# TasksApi

All URIs are relative to *https://.keka.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTaskIdentifier**](TasksApi.md#createTaskIdentifier) | **POST** /psa/projects/{projectId}/tasks | Create a task |
| [**getAll**](TasksApi.md#getAll) | **GET** /psa/projects/{projectId}/tasks | Get project tasks. |
| [**listTimeEntriesBetweenDates**](TasksApi.md#listTimeEntriesBetweenDates) | **GET** /psa/projects/{projectId}/tasks/{taskId}/timeentries | Get project task time entries. |
| [**updateTask**](TasksApi.md#updateTask) | **PUT** /psa/projects/{projectId}/tasks/{taskId} | Update a task |


<a name="createTaskIdentifier"></a>
# **createTaskIdentifier**
> StringResponse createTaskIdentifier(projectId).projectTask(projectTask).execute();

Create a task

Create project task and returns created task identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    String projectId = "projectId_example";
    String name = "name_example";
    OffsetDateTime startDate = OffsetDateTime.now();
    OffsetDateTime endDate = OffsetDateTime.now();
    String projectId = "projectId_example"; // The project identifier.
    String description = "description_example";
    TaskBillingType taskBillingType = TaskBillingType.fromValue("0");
    List<String> assignedTo = Arrays.asList();
    Double estimatedHours = 3.4D;
    String phaseId = "phaseId_example";
    try {
      StringResponse result = client
              .tasks
              .createTaskIdentifier(projectId, name, startDate, endDate, projectId)
              .description(description)
              .taskBillingType(taskBillingType)
              .assignedTo(assignedTo)
              .estimatedHours(estimatedHours)
              .phaseId(phaseId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSucceeded());
      System.out.println(result.getMessage());
      System.out.println(result.getErrors());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#createTaskIdentifier");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StringResponse> response = client
              .tasks
              .createTaskIdentifier(projectId, name, startDate, endDate, projectId)
              .description(description)
              .taskBillingType(taskBillingType)
              .assignedTo(assignedTo)
              .estimatedHours(estimatedHours)
              .phaseId(phaseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#createTaskIdentifier");
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
| **projectId** | **String**| The project identifier. | |
| **projectTask** | [**ProjectTask**](ProjectTask.md)| The project task. | [optional] |

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

<a name="getAll"></a>
# **getAll**
> APIProjectTaskPagedResponse getAll(projectId).lastModified(lastModified).pageNumber(pageNumber).pageSize(pageSize).execute();

Get project tasks.

Gets the project tasks.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    String projectId = "projectId_example"; // The project identifier.
    OffsetDateTime lastModified = OffsetDateTime.now(); // Date/time when this time off request was last modified, in ISO 8601 format (YYYY-MM-DDThh:mm:ss±hh:mm).
    Integer pageNumber = 56;
    Integer pageSize = 56; // Represents how many results you'd like to retrieve per request (page). Default is 100. Max is 200
    try {
      APIProjectTaskPagedResponse result = client
              .tasks
              .getAll(projectId)
              .lastModified(lastModified)
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
      System.err.println("Exception when calling TasksApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIProjectTaskPagedResponse> response = client
              .tasks
              .getAll(projectId)
              .lastModified(lastModified)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getAll");
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
| **projectId** | **String**| The project identifier. | |
| **lastModified** | **OffsetDateTime**| Date/time when this time off request was last modified, in ISO 8601 format (YYYY-MM-DDThh:mm:ss±hh:mm). | [optional] |
| **pageNumber** | **Integer**|  | [optional] |
| **pageSize** | **Integer**| Represents how many results you&#39;d like to retrieve per request (page). Default is 100. Max is 200 | [optional] |

### Return type

[**APIProjectTaskPagedResponse**](APIProjectTaskPagedResponse.md)

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

<a name="listTimeEntriesBetweenDates"></a>
# **listTimeEntriesBetweenDates**
> APITimesheetEntryPagedResponse listTimeEntriesBetweenDates(projectId, taskId).from(from).to(to).employeeIds(employeeIds).pageNumber(pageNumber).pageSize(pageSize).execute();

Get project task time entries.

Gets the project task time entries between selected from and to date range.If both &#x60;from&#x60; and &#x60;to&#x60; are not specified, last 30 days records are returned.From &#x60;date&#x60; should be before &#x60;to&#x60; date.The difference between &#x60;from&#x60; and &#x60;to&#x60; date cannot be more than **90** days.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    String projectId = "projectId_example"; // The project identifier.
    String taskId = "taskId_example"; // The task identifier.
    OffsetDateTime from = OffsetDateTime.now(); // Date from records to retrieve. If not specified defaults to `to - 30` days.
    OffsetDateTime to = OffsetDateTime.now(); // Date to records can be retrieved. If not specified defaults to `today`.
    String employeeIds = "employeeIds_example"; // Comma separated list of one or more Employee ids you'd like to filter on.
    Integer pageNumber = 56;
    Integer pageSize = 56; // Represents how many results you'd like to retrieve per request (page). Default is 100. Max is 200
    try {
      APITimesheetEntryPagedResponse result = client
              .tasks
              .listTimeEntriesBetweenDates(projectId, taskId)
              .from(from)
              .to(to)
              .employeeIds(employeeIds)
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
      System.err.println("Exception when calling TasksApi#listTimeEntriesBetweenDates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APITimesheetEntryPagedResponse> response = client
              .tasks
              .listTimeEntriesBetweenDates(projectId, taskId)
              .from(from)
              .to(to)
              .employeeIds(employeeIds)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#listTimeEntriesBetweenDates");
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
| **projectId** | **String**| The project identifier. | |
| **taskId** | **String**| The task identifier. | |
| **from** | **OffsetDateTime**| Date from records to retrieve. If not specified defaults to &#x60;to - 30&#x60; days. | [optional] |
| **to** | **OffsetDateTime**| Date to records can be retrieved. If not specified defaults to &#x60;today&#x60;. | [optional] |
| **employeeIds** | **String**| Comma separated list of one or more Employee ids you&#39;d like to filter on. | [optional] |
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

<a name="updateTask"></a>
# **updateTask**
> BooleanResponse updateTask(projectId, taskId).updateProjectTask(updateProjectTask).execute();

Update a task

Update project task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    String projectId = "projectId_example"; // The project identifier.
    String taskId = "taskId_example"; // The task identifier.
    String description = "description_example";
    String name = "name_example";
    TaskBillingType taskBillingType = TaskBillingType.fromValue("0");
    List<String> assignedTo = Arrays.asList();
    OffsetDateTime startDate = OffsetDateTime.now();
    OffsetDateTime endDate = OffsetDateTime.now();
    Double estimatedHours = 3.4D;
    String phaseId = "phaseId_example";
    try {
      BooleanResponse result = client
              .tasks
              .updateTask(projectId, taskId)
              .description(description)
              .name(name)
              .taskBillingType(taskBillingType)
              .assignedTo(assignedTo)
              .startDate(startDate)
              .endDate(endDate)
              .estimatedHours(estimatedHours)
              .phaseId(phaseId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSucceeded());
      System.out.println(result.getMessage());
      System.out.println(result.getErrors());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#updateTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BooleanResponse> response = client
              .tasks
              .updateTask(projectId, taskId)
              .description(description)
              .name(name)
              .taskBillingType(taskBillingType)
              .assignedTo(assignedTo)
              .startDate(startDate)
              .endDate(endDate)
              .estimatedHours(estimatedHours)
              .phaseId(phaseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#updateTask");
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
| **projectId** | **String**| The project identifier. | |
| **taskId** | **String**| The task identifier. | |
| **updateProjectTask** | [**UpdateProjectTask**](UpdateProjectTask.md)| The project task. | [optional] |

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

