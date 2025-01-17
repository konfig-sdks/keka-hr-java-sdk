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
import com.konfigthis.client.model.CandidateNoteDTO;
import com.konfigthis.client.model.InterviewDTO;
import com.konfigthis.client.model.JobApplicationFieldsDTO;
import com.konfigthis.client.model.JobCandidateDetailsDTO;
import com.konfigthis.client.model.JobDTO;
import java.time.OffsetDateTime;
import com.konfigthis.client.model.ScoreCardDTO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobsApi
 */
@Disabled
public class JobsApiTest {

    private static JobsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new JobsApi(apiClient);
    }

    /**
     * Adds candidate note
     *
     * Updated the candidate
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCandidateNoteTest() throws ApiException {
        String candidateId = null;
        String jobId = null;
        List<String> tags = null;
        String comments = null;
        String response = api.addCandidateNote(candidateId, jobId)
                .tags(tags)
                .comments(comments)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all jobs
     *
     * Get all Published, Confidential and Archived jobs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllPublishedJobsTest() throws ApiException {
        OffsetDateTime lastModified = null;
        Integer jobStatus = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        List<JobDTO> response = api.getAllPublishedJobs()
                .lastModified(lastModified)
                .jobStatus(jobStatus)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Get application fields
     *
     * Get job application fields
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getApplicationFieldsTest() throws ApiException {
        String jobId = null;
        List<JobApplicationFieldsDTO> response = api.getApplicationFields(jobId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get interview scheduled and completed for a job candidate
     *
     * Get interview scheduled and completed for a job and a candidate
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCandidateInterviewsTest() throws ApiException {
        String candidateId = null;
        String jobId = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        List<InterviewDTO> response = api.getCandidateInterviews(candidateId, jobId)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Get scorecard of a specified candidate for a job candidate
     *
     * Get the scorecards which are submitted for a specified job candidate
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCandidateScorecardsTest() throws ApiException {
        String candidateId = null;
        String jobId = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        List<ScoreCardDTO> response = api.getCandidateScorecards(candidateId, jobId)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Get job candidates
     *
     * Get active or archived candidates in a specified job
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCandidatesTest() throws ApiException {
        String jobId = null;
        Boolean isArchived = null;
        OffsetDateTime lastModified = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        List<JobCandidateDetailsDTO> response = api.getCandidates(jobId)
                .isArchived(isArchived)
                .lastModified(lastModified)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Post a job candidate
     *
     * Post a candidate to a specified job
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postCandidateTest() throws ApiException {
        String jobId = null;
        String response = api.postCandidate(jobId)
                .execute();
        // TODO: test validations
    }

    /**
     * Updated a candidate
     *
     * Updated the candidate
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCandidateTest() throws ApiException {
        String candidateId = null;
        String jobId = null;
        String response = api.updateCandidate(candidateId, jobId)
                .execute();
        // TODO: test validations
    }

}
