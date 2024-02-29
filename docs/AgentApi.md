# AgentApi

All URIs are relative to *https://agent.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**agentCreateAgent**](AgentApi.md#agentCreateAgent) | **POST** /v1/{tenantId}/agent/create |  |
| [**agentGetAgent**](AgentApi.md#agentGetAgent) | **GET** /v1/{tenantId}/agent/{id} |  |
| [**agentListAgents**](AgentApi.md#agentListAgents) | **POST** /v1/{tenantId}/agent/list/page-size/{pageSize} |  |
| [**agentUpdateAgent**](AgentApi.md#agentUpdateAgent) | **PUT** /v1/{tenantId}/agent/{id} |  |


<a id="agentCreateAgent"></a>
# **agentCreateAgent**
> AgentAgentEntity agentCreateAgent(tenantId, body)



### Example
```java
// Import classes:
import GeminiCommerce_Agent.ApiClient;
import GeminiCommerce_Agent.ApiException;
import GeminiCommerce_Agent.Configuration;
import GeminiCommerce_Agent.auth.*;
import GeminiCommerce_Agent.models.*;
import org.openapitools.client.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://agent.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AgentApi apiInstance = new AgentApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    AgentCreateAgentRequest body = new AgentCreateAgentRequest(); // AgentCreateAgentRequest | 
    try {
      AgentAgentEntity result = apiInstance.agentCreateAgent(tenantId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#agentCreateAgent");
      System.err.println("Status code: " + e.getCode());
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
| **tenantId** | **String**|  | |
| **body** | [**AgentCreateAgentRequest**](AgentCreateAgentRequest.md)|  | |

### Return type

[**AgentAgentEntity**](AgentAgentEntity.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="agentGetAgent"></a>
# **agentGetAgent**
> AgentAgentEntity agentGetAgent(tenantId, id)



### Example
```java
// Import classes:
import GeminiCommerce_Agent.ApiClient;
import GeminiCommerce_Agent.ApiException;
import GeminiCommerce_Agent.Configuration;
import GeminiCommerce_Agent.auth.*;
import GeminiCommerce_Agent.models.*;
import org.openapitools.client.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://agent.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AgentApi apiInstance = new AgentApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String id = "id_example"; // String | 
    try {
      AgentAgentEntity result = apiInstance.agentGetAgent(tenantId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#agentGetAgent");
      System.err.println("Status code: " + e.getCode());
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
| **tenantId** | **String**|  | |
| **id** | **String**|  | |

### Return type

[**AgentAgentEntity**](AgentAgentEntity.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="agentListAgents"></a>
# **agentListAgents**
> AgentListResponse agentListAgents(tenantId, pageSize, body)



### Example
```java
// Import classes:
import GeminiCommerce_Agent.ApiClient;
import GeminiCommerce_Agent.ApiException;
import GeminiCommerce_Agent.Configuration;
import GeminiCommerce_Agent.auth.*;
import GeminiCommerce_Agent.models.*;
import org.openapitools.client.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://agent.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AgentApi apiInstance = new AgentApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    Long pageSize = 56L; // Long | 
    AgentListAgentsRequest body = new AgentListAgentsRequest(); // AgentListAgentsRequest | 
    try {
      AgentListResponse result = apiInstance.agentListAgents(tenantId, pageSize, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#agentListAgents");
      System.err.println("Status code: " + e.getCode());
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
| **tenantId** | **String**|  | |
| **pageSize** | **Long**|  | |
| **body** | [**AgentListAgentsRequest**](AgentListAgentsRequest.md)|  | |

### Return type

[**AgentListResponse**](AgentListResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="agentUpdateAgent"></a>
# **agentUpdateAgent**
> AgentAgentEntity agentUpdateAgent(tenantId, id, body)



### Example
```java
// Import classes:
import GeminiCommerce_Agent.ApiClient;
import GeminiCommerce_Agent.ApiException;
import GeminiCommerce_Agent.Configuration;
import GeminiCommerce_Agent.auth.*;
import GeminiCommerce_Agent.models.*;
import org.openapitools.client.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://agent.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AgentApi apiInstance = new AgentApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String id = "id_example"; // String | 
    AgentUpdateAgentRequest body = new AgentUpdateAgentRequest(); // AgentUpdateAgentRequest | 
    try {
      AgentAgentEntity result = apiInstance.agentUpdateAgent(tenantId, id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#agentUpdateAgent");
      System.err.println("Status code: " + e.getCode());
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
| **tenantId** | **String**|  | |
| **id** | **String**|  | |
| **body** | [**AgentUpdateAgentRequest**](AgentUpdateAgentRequest.md)|  | |

### Return type

[**AgentAgentEntity**](AgentAgentEntity.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

