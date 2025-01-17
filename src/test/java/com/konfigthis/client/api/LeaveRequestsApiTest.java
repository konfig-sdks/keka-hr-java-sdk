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
import com.konfigthis.client.model.LeaveRequestPagedResponse;
import java.time.OffsetDateTime;
import com.konfigthis.client.model.PostLeaveRequest;
import com.konfigthis.client.model.SessionType;
import com.konfigthis.client.model.StringResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LeaveRequestsApi
 */
@Disabled
public class LeaveRequestsApiTest {

    private static LeaveRequestsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LeaveRequestsApi(apiClient);
    }

    /**
     * Create an Leave Request
     *
     * Create an leave request and returns leave request identifier.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRequestIdentifierTest() throws ApiException {
        String employeeId = null;
        String requestedBy = null;
        OffsetDateTime fromDate = null;
        OffsetDateTime toDate = null;
        String leaveTypeId = null;
        String reason = null;
        SessionType fromSession = null;
        SessionType toSession = null;
        String note = null;
        StringResponse response = api.createRequestIdentifier(employeeId, requestedBy, fromDate, toDate, leaveTypeId, reason)
                .fromSession(fromSession)
                .toSession(toSession)
                .note(note)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all Leave Requests
     *
     * Get all the leaves in the organization between &#x60;from&#x60; and &#x60;to&#x60; date.If both &#x60;from&#x60; and &#x60;to&#x60; are not specified, last 30 days records are returned.&#x60;from&#x60; date should be before &#x60;to&#x60; date.The difference between &#x60;from&#x60; and &#x60;to&#x60; date cannot be more than **90** days.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllBetweenDatesTest() throws ApiException {
        String employeeIds = null;
        OffsetDateTime from = null;
        OffsetDateTime to = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        LeaveRequestPagedResponse response = api.getAllBetweenDates()
                .employeeIds(employeeIds)
                .from(from)
                .to(to)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

}
