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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.GroupPagedResponse;
import com.konfigthis.client.model.GroupTypePagedResponse;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
@Disabled
public class GroupsApiTest {

    private static GroupsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GroupsApi(apiClient);
    }

    /**
     * Get all Groups
     *
     * Get all Groups
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        String groupTypeIds = null;
        String systemGroupTypes = null;
        OffsetDateTime lastModified = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        GroupPagedResponse response = api.getAll()
                .groupTypeIds(groupTypeIds)
                .systemGroupTypes(systemGroupTypes)
                .lastModified(lastModified)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all Group Types
     *
     * Gets all Group Types.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllGroupTypesTest() throws ApiException {
        Integer pageNumber = null;
        Integer pageSize = null;
        GroupTypePagedResponse response = api.getAllGroupTypes()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

}
