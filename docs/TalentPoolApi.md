# TalentPoolApi

All URIs are relative to *https://.keka.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCandidate**](TalentPoolApi.md#addCandidate) | **POST** /v1/hire/talentpool/{talentPoolId}/candidate | Post a candidate to a talent pool |
| [**getAll**](TalentPoolApi.md#getAll) | **GET** /v1/hire/talentpool | Get all Talent pools |
| [**getApplicationFields**](TalentPoolApi.md#getApplicationFields) | **GET** /v1/hire/talentpool/{talentPoolId}/applicationfields | Get Talent pool application fields |
| [**getCandidates**](TalentPoolApi.md#getCandidates) | **GET** /v1/hire/talentpool/{talentPoolId}/candidates | Get Talent pool candidates |


<a name="addCandidate"></a>
# **addCandidate**
> String addCandidate(talentPoolId, requestBody).execute();

Post a candidate to a talent pool

Post a candidate to a specified talent pool

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TalentPoolApi;
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
    String talentPoolId = "talentPoolId_example";
    try {
      String result = client
              .talentPool
              .addCandidate(talentPoolId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TalentPoolApi#addCandidate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .talentPool
              .addCandidate(talentPoolId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TalentPoolApi#addCandidate");
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
| **talentPoolId** | **String**|  | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |

### Return type

**String**

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
| **500** | Server Error |  -  |

<a name="getAll"></a>
# **getAll**
> List&lt;TalentPoolDTO&gt; getAll().lastModified(lastModified).pageNumber(pageNumber).pageSize(pageSize).execute();

Get all Talent pools

Get all active talent pools

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TalentPoolApi;
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
    OffsetDateTime lastModified = OffsetDateTime.now();
    Integer pageNumber = 56;
    Integer pageSize = 56; // Represents how many results you'd like to retrieve per request (page). Default is 100. Max is 200
    try {
      List<TalentPoolDTO> result = client
              .talentPool
              .getAll()
              .lastModified(lastModified)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TalentPoolApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TalentPoolDTO>> response = client
              .talentPool
              .getAll()
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
      System.err.println("Exception when calling TalentPoolApi#getAll");
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
| **lastModified** | **OffsetDateTime**|  | [optional] |
| **pageNumber** | **Integer**|  | [optional] |
| **pageSize** | **Integer**| Represents how many results you&#39;d like to retrieve per request (page). Default is 100. Max is 200 | [optional] |

### Return type

[**List&lt;TalentPoolDTO&gt;**](TalentPoolDTO.md)

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
| **500** | Server Error |  -  |

<a name="getApplicationFields"></a>
# **getApplicationFields**
> List&lt;TalentPoolApplicationFieldsDTO&gt; getApplicationFields(talentPoolId).execute();

Get Talent pool application fields

Get application fields of a specified talent pool

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TalentPoolApi;
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
    String talentPoolId = "talentPoolId_example";
    try {
      List<TalentPoolApplicationFieldsDTO> result = client
              .talentPool
              .getApplicationFields(talentPoolId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TalentPoolApi#getApplicationFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TalentPoolApplicationFieldsDTO>> response = client
              .talentPool
              .getApplicationFields(talentPoolId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TalentPoolApi#getApplicationFields");
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
| **talentPoolId** | **String**|  | |

### Return type

[**List&lt;TalentPoolApplicationFieldsDTO&gt;**](TalentPoolApplicationFieldsDTO.md)

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
| **500** | Server Error |  -  |

<a name="getCandidates"></a>
# **getCandidates**
> List&lt;TalentPoolCandidateDTO&gt; getCandidates(talentPoolId).lastModified(lastModified).pageNumber(pageNumber).pageSize(pageSize).execute();

Get Talent pool candidates

Get candidates in a specified talent pool

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TalentPoolApi;
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
    String talentPoolId = "talentPoolId_example";
    OffsetDateTime lastModified = OffsetDateTime.now();
    Integer pageNumber = 56;
    Integer pageSize = 56; // Represents how many results you'd like to retrieve per request (page). Default is 100. Max is 200
    try {
      List<TalentPoolCandidateDTO> result = client
              .talentPool
              .getCandidates(talentPoolId)
              .lastModified(lastModified)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TalentPoolApi#getCandidates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TalentPoolCandidateDTO>> response = client
              .talentPool
              .getCandidates(talentPoolId)
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
      System.err.println("Exception when calling TalentPoolApi#getCandidates");
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
| **talentPoolId** | **String**|  | |
| **lastModified** | **OffsetDateTime**|  | [optional] |
| **pageNumber** | **Integer**|  | [optional] |
| **pageSize** | **Integer**| Represents how many results you&#39;d like to retrieve per request (page). Default is 100. Max is 200 | [optional] |

### Return type

[**List&lt;TalentPoolCandidateDTO&gt;**](TalentPoolCandidateDTO.md)

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
| **500** | Server Error |  -  |

