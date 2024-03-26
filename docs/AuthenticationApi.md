# AuthenticationApi

All URIs are relative to *https://.keka.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccessToken**](AuthenticationApi.md#getAccessToken) | **POST** /connect/token | Generate Access Token |


<a name="getAccessToken"></a>
# **getAccessToken**
> AuthenticationGetAccessTokenResponse getAccessToken(grantType, scope, clientId, clientSecret, apiKey).authenticationGetAccessTokenRequest(authenticationGetAccessTokenRequest).execute();

Generate Access Token

Use this API to fetch access token by passing authentication parameters ( grant_type, scope, client_id, client_secret, api_key) as form-url encoded in the body.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KekaHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
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
    String grantType = "kekaapi";
    String scope = "kekaapi";
    String clientId = "clientId_example";
    String clientSecret = "clientSecret_example";
    String apiKey = "apiKey_example";
    try {
      AuthenticationGetAccessTokenResponse result = client
              .authentication
              .getAccessToken(grantType, scope, clientId, clientSecret, apiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getTokenType());
      System.out.println(result.getScope());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#getAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthenticationGetAccessTokenResponse> response = client
              .authentication
              .getAccessToken(grantType, scope, clientId, clientSecret, apiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#getAccessToken");
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
| **grantType** | **String**|  | [default to kekaapi] |
| **scope** | **String**|  | [default to kekaapi] |
| **clientId** | **String**|  | |
| **clientSecret** | **String**|  | |
| **apiKey** | **String**|  | |
| **authenticationGetAccessTokenRequest** | [**AuthenticationGetAccessTokenRequest**](AuthenticationGetAccessTokenRequest.md)|  | [optional] |

### Return type

[**AuthenticationGetAccessTokenResponse**](AuthenticationGetAccessTokenResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

