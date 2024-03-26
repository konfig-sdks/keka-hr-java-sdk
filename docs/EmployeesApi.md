# EmployeesApi

All URIs are relative to *https://.keka.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmployee**](EmployeesApi.md#createEmployee) | **POST** /hris/employees | Create an Employee |
| [**getAll**](EmployeesApi.md#getAll) | **GET** /hris/employees | Get all Employees |
| [**getAllUpdateFields**](EmployeesApi.md#getAllUpdateFields) | **GET** /hris/employees/updatefields | Get all update fields |
| [**getById**](EmployeesApi.md#getById) | **GET** /hris/employees/{id} | Get an Employee |
| [**updateJobDetails**](EmployeesApi.md#updateJobDetails) | **PUT** /hris/employees/{id}/jobdetails | Update employee job details |
| [**updatePersonalDetails**](EmployeesApi.md#updatePersonalDetails) | **PUT** /hris/employees/{id}/personaldetails | Update Employee personal details |


<a name="createEmployee"></a>
# **createEmployee**
> StringResponse createEmployee().employee(employee).execute();

Create an Employee

Create an Employee and returns created employee identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    String displayName = "displayName_example";
    String firstName = "firstName_example";
    String lastName = "lastName_example";
    String email = "email_example";
    Gender gender = Gender.fromValue("0");
    OffsetDateTime dateOfBirth = OffsetDateTime.now();
    OffsetDateTime dateJoined = OffsetDateTime.now();
    String department = "department_example";
    String businessUnit = "businessUnit_example";
    String jobTitle = "jobTitle_example";
    String location = "location_example";
    String employeeNumber = "employeeNumber_example";
    String middleName = "middleName_example";
    String mobileNumber = "mobileNumber_example";
    String secondaryJobTitle = "secondaryJobTitle_example";
    try {
      StringResponse result = client
              .employees
              .createEmployee(displayName, firstName, lastName, email, gender, dateOfBirth, dateJoined, department, businessUnit, jobTitle, location)
              .employeeNumber(employeeNumber)
              .middleName(middleName)
              .mobileNumber(mobileNumber)
              .secondaryJobTitle(secondaryJobTitle)
              .execute();
      System.out.println(result);
      System.out.println(result.getSucceeded());
      System.out.println(result.getMessage());
      System.out.println(result.getErrors());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#createEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StringResponse> response = client
              .employees
              .createEmployee(displayName, firstName, lastName, email, gender, dateOfBirth, dateJoined, department, businessUnit, jobTitle, location)
              .employeeNumber(employeeNumber)
              .middleName(middleName)
              .mobileNumber(mobileNumber)
              .secondaryJobTitle(secondaryJobTitle)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#createEmployee");
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
| **employee** | [**Employee**](Employee.md)| The employee. | [optional] |

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
> EmployeeProfilePagedResponse getAll().employeeIds(employeeIds).employeeNumbers(employeeNumbers).employmentStatus(employmentStatus).inProbation(inProbation).inNoticePeriod(inNoticePeriod).lastModified(lastModified).pageNumber(pageNumber).pageSize(pageSize).execute();

Get all Employees

Gets all employees / the specified employees based on employee search parameters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    String employeeNumbers = "employeeNumbers_example"; // Comma separated list of one or more Employee numbers you'd like to filter on.
    String employmentStatus = "employmentStatus_example"; // Comma separated list of one or more Employment Status you'd like to filter on, allowed values are Working, Relieved.
    Boolean inProbation = false; // Fetches employees who are in probation. The allowed value is true or false.
    Boolean inNoticePeriod = false; // Fetches employees who are in notice period. The allowed value is true or false.
    OffsetDateTime lastModified = OffsetDateTime.now(); // Date/time when this time off request was last modified, in ISO 8601 format (YYYY-MM-DDThh:mm:ss±hh:mm).
    Integer pageNumber = 56;
    Integer pageSize = 56; // Represents how many results you'd like to retrieve per request (page). Default is 100. Max is 200
    try {
      EmployeeProfilePagedResponse result = client
              .employees
              .getAll()
              .employeeIds(employeeIds)
              .employeeNumbers(employeeNumbers)
              .employmentStatus(employmentStatus)
              .inProbation(inProbation)
              .inNoticePeriod(inNoticePeriod)
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
      System.err.println("Exception when calling EmployeesApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeProfilePagedResponse> response = client
              .employees
              .getAll()
              .employeeIds(employeeIds)
              .employeeNumbers(employeeNumbers)
              .employmentStatus(employmentStatus)
              .inProbation(inProbation)
              .inNoticePeriod(inNoticePeriod)
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
      System.err.println("Exception when calling EmployeesApi#getAll");
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
| **employeeNumbers** | **String**| Comma separated list of one or more Employee numbers you&#39;d like to filter on. | [optional] |
| **employmentStatus** | **String**| Comma separated list of one or more Employment Status you&#39;d like to filter on, allowed values are Working, Relieved. | [optional] |
| **inProbation** | **Boolean**| Fetches employees who are in probation. The allowed value is true or false. | [optional] [default to false] |
| **inNoticePeriod** | **Boolean**| Fetches employees who are in notice period. The allowed value is true or false. | [optional] [default to false] |
| **lastModified** | **OffsetDateTime**| Date/time when this time off request was last modified, in ISO 8601 format (YYYY-MM-DDThh:mm:ss±hh:mm). | [optional] |
| **pageNumber** | **Integer**|  | [optional] |
| **pageSize** | **Integer**| Represents how many results you&#39;d like to retrieve per request (page). Default is 100. Max is 200 | [optional] |

### Return type

[**EmployeeProfilePagedResponse**](EmployeeProfilePagedResponse.md)

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

<a name="getAllUpdateFields"></a>
# **getAllUpdateFields**
> EmployeeFieldResponse getAllUpdateFields().pageNumber(pageNumber).pageSize(pageSize).execute();

Get all update fields

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
      EmployeeFieldResponse result = client
              .employees
              .getAllUpdateFields()
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getSucceeded());
      System.out.println(result.getMessage());
      System.out.println(result.getErrors());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getAllUpdateFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeFieldResponse> response = client
              .employees
              .getAllUpdateFields()
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getAllUpdateFields");
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

[**EmployeeFieldResponse**](EmployeeFieldResponse.md)

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

<a name="getById"></a>
# **getById**
> EmployeeProfileResponse getById(id).execute();

Get an Employee

Get an employee with specified identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    String id = "id_example"; // The identifier.
    try {
      EmployeeProfileResponse result = client
              .employees
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSucceeded());
      System.out.println(result.getMessage());
      System.out.println(result.getErrors());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeProfileResponse> response = client
              .employees
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getById");
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
| **id** | **String**| The identifier. | |

### Return type

[**EmployeeProfileResponse**](EmployeeProfileResponse.md)

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

<a name="updateJobDetails"></a>
# **updateJobDetails**
> BooleanResponse updateJobDetails(id).jobDetailsUpdateRequest(jobDetailsUpdateRequest).execute();

Update employee job details

Update employee job details.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    String id = "id_example"; // The identifier.
    String employeeNumber = "employeeNumber_example";
    String location = "location_example";
    String businessUnit = "businessUnit_example";
    String department = "department_example";
    String jobTitle = "jobTitle_example";
    String reportingManager = "reportingManager_example";
    String attendanceNumber = "attendanceNumber_example";
    TimeType timeType = TimeType.fromValue("0");
    String attendanceCaptureScheme = "attendanceCaptureScheme_example";
    String expensePolicy = "expensePolicy_example";
    String noticePeriod = "noticePeriod_example";
    String holidayList = "holidayList_example";
    String costCenter = "costCenter_example";
    String payBand = "payBand_example";
    String payGrade = "payGrade_example";
    Map<String, Object> customFields = new HashMap();
    try {
      BooleanResponse result = client
              .employees
              .updateJobDetails(id)
              .employeeNumber(employeeNumber)
              .location(location)
              .businessUnit(businessUnit)
              .department(department)
              .jobTitle(jobTitle)
              .reportingManager(reportingManager)
              .attendanceNumber(attendanceNumber)
              .timeType(timeType)
              .attendanceCaptureScheme(attendanceCaptureScheme)
              .expensePolicy(expensePolicy)
              .noticePeriod(noticePeriod)
              .holidayList(holidayList)
              .costCenter(costCenter)
              .payBand(payBand)
              .payGrade(payGrade)
              .customFields(customFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getSucceeded());
      System.out.println(result.getMessage());
      System.out.println(result.getErrors());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateJobDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BooleanResponse> response = client
              .employees
              .updateJobDetails(id)
              .employeeNumber(employeeNumber)
              .location(location)
              .businessUnit(businessUnit)
              .department(department)
              .jobTitle(jobTitle)
              .reportingManager(reportingManager)
              .attendanceNumber(attendanceNumber)
              .timeType(timeType)
              .attendanceCaptureScheme(attendanceCaptureScheme)
              .expensePolicy(expensePolicy)
              .noticePeriod(noticePeriod)
              .holidayList(holidayList)
              .costCenter(costCenter)
              .payBand(payBand)
              .payGrade(payGrade)
              .customFields(customFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateJobDetails");
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
| **id** | **String**| The identifier. | |
| **jobDetailsUpdateRequest** | [**JobDetailsUpdateRequest**](JobDetailsUpdateRequest.md)| The job details. | [optional] |

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

<a name="updatePersonalDetails"></a>
# **updatePersonalDetails**
> BooleanResponse updatePersonalDetails(id).personalDetailsUpdateRequest(personalDetailsUpdateRequest).execute();

Update Employee personal details

Update Employee personal details.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    String id = "id_example"; // The identifier.
    String displayName = "displayName_example";
    String firstName = "firstName_example";
    String middleName = "middleName_example";
    String lastName = "lastName_example";
    Gender gender = Gender.fromValue("0");
    OffsetDateTime dateOfBirth = OffsetDateTime.now();
    String workPhone = "workPhone_example";
    String homePhone = "homePhone_example";
    String personalEmail = "personalEmail_example";
    String skypeId = "skypeId_example";
    MaritalStatus maritalStatus = MaritalStatus.fromValue("0");
    OffsetDateTime marriageDate = OffsetDateTime.now();
    List<Relation> relations = Arrays.asList();
    BloodGroup bloodGroup = BloodGroup.fromValue("0");
    Address currentAddress = new Address();
    Address permanentAddress = new Address();
    String professionalSummary = "professionalSummary_example";
    Map<String, Object> customFields = new HashMap();
    try {
      BooleanResponse result = client
              .employees
              .updatePersonalDetails(id)
              .displayName(displayName)
              .firstName(firstName)
              .middleName(middleName)
              .lastName(lastName)
              .gender(gender)
              .dateOfBirth(dateOfBirth)
              .workPhone(workPhone)
              .homePhone(homePhone)
              .personalEmail(personalEmail)
              .skypeId(skypeId)
              .maritalStatus(maritalStatus)
              .marriageDate(marriageDate)
              .relations(relations)
              .bloodGroup(bloodGroup)
              .currentAddress(currentAddress)
              .permanentAddress(permanentAddress)
              .professionalSummary(professionalSummary)
              .customFields(customFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getSucceeded());
      System.out.println(result.getMessage());
      System.out.println(result.getErrors());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updatePersonalDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BooleanResponse> response = client
              .employees
              .updatePersonalDetails(id)
              .displayName(displayName)
              .firstName(firstName)
              .middleName(middleName)
              .lastName(lastName)
              .gender(gender)
              .dateOfBirth(dateOfBirth)
              .workPhone(workPhone)
              .homePhone(homePhone)
              .personalEmail(personalEmail)
              .skypeId(skypeId)
              .maritalStatus(maritalStatus)
              .marriageDate(marriageDate)
              .relations(relations)
              .bloodGroup(bloodGroup)
              .currentAddress(currentAddress)
              .permanentAddress(permanentAddress)
              .professionalSummary(professionalSummary)
              .customFields(customFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updatePersonalDetails");
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
| **id** | **String**| The identifier. | |
| **personalDetailsUpdateRequest** | [**PersonalDetailsUpdateRequest**](PersonalDetailsUpdateRequest.md)| The personal details. | [optional] |

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

