

# RequisitionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**requisitionFor** | **String** |  |  [optional] |
|**jobNumber** | **String** |  |  [optional] |
|**department** | **String** |  |  [optional] |
|**subDepartment** | **String** |  |  [optional] |
|**requestedBy** | **String** |  |  [optional] |
|**requestedOn** | **OffsetDateTime** |  |  [optional] |
|**locations** | **List&lt;String&gt;** |  |  [optional] |
|**status** | **RequisitionRequestStatus** |  |  [optional] |
|**isPriority** | **Boolean** |  |  [optional] |
|**budget** | **String** |  |  [optional] |
|**openPositions** | **Integer** |  |  [optional] |
|**hired** | **Integer** |  |  [optional] |
|**requisitionTypes** | **List&lt;Integer&gt;** |  |  [optional] |
|**toBeReplaced** | [**List&lt;ReplacementEmployee&gt;**](ReplacementEmployee.md) |  |  [optional] |
|**jobType** | **JobType** |  |  [optional] |
|**targetHiringDate** | **OffsetDateTime** |  |  [optional] |
|**isArchived** | **Boolean** |  |  [optional] |
|**additionalComments** | **String** |  |  [optional] |
|**additionalFields** | [**List&lt;CustomField&gt;**](CustomField.md) |  |  [optional] |



