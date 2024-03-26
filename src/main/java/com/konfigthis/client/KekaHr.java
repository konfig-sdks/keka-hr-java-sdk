package com.konfigthis.client;

import com.konfigthis.client.api.AssetApi;
import com.konfigthis.client.api.AssetCategoryApi;
import com.konfigthis.client.api.AssetConditionApi;
import com.konfigthis.client.api.AssetTypeApi;
import com.konfigthis.client.api.AttendanceApi;
import com.konfigthis.client.api.AttendanceCaptureSchemeApi;
import com.konfigthis.client.api.AuthenticationApi;
import com.konfigthis.client.api.BadgeApi;
import com.konfigthis.client.api.ClientsApi;
import com.konfigthis.client.api.CurrencyApi;
import com.konfigthis.client.api.DepartmentsApi;
import com.konfigthis.client.api.EmployeesApi;
import com.konfigthis.client.api.ExpenseApi;
import com.konfigthis.client.api.ExpenseCategoryApi;
import com.konfigthis.client.api.ExpensePolicyApi;
import com.konfigthis.client.api.GoalApi;
import com.konfigthis.client.api.GroupsApi;
import com.konfigthis.client.api.HolidayCalendarApi;
import com.konfigthis.client.api.JobTitleApi;
import com.konfigthis.client.api.JobsApi;
import com.konfigthis.client.api.LeaveBalanceApi;
import com.konfigthis.client.api.LeaveRequestsApi;
import com.konfigthis.client.api.LeaveTypesApi;
import com.konfigthis.client.api.LocationsApi;
import com.konfigthis.client.api.NoticePeriodApi;
import com.konfigthis.client.api.PayBandsApi;
import com.konfigthis.client.api.PayCyclesApi;
import com.konfigthis.client.api.PayGradesApi;
import com.konfigthis.client.api.PayGroupsApi;
import com.konfigthis.client.api.PraiseApi;
import com.konfigthis.client.api.ProjectPhasesApi;
import com.konfigthis.client.api.ProjectsApi;
import com.konfigthis.client.api.RequisitionRequestApi;
import com.konfigthis.client.api.SalaryComponentsApi;
import com.konfigthis.client.api.TalentPoolApi;
import com.konfigthis.client.api.TasksApi;
import com.konfigthis.client.api.TimeFramesApi;
import com.konfigthis.client.api.TimesheetEntriesApi;

public class KekaHr {
    private ApiClient apiClient;
    public final AssetApi asset;
    public final AssetCategoryApi assetCategory;
    public final AssetConditionApi assetCondition;
    public final AssetTypeApi assetType;
    public final AttendanceApi attendance;
    public final AttendanceCaptureSchemeApi attendanceCaptureScheme;
    public final AuthenticationApi authentication;
    public final BadgeApi badge;
    public final ClientsApi clients;
    public final CurrencyApi currency;
    public final DepartmentsApi departments;
    public final EmployeesApi employees;
    public final ExpenseApi expense;
    public final ExpenseCategoryApi expenseCategory;
    public final ExpensePolicyApi expensePolicy;
    public final GoalApi goal;
    public final GroupsApi groups;
    public final HolidayCalendarApi holidayCalendar;
    public final JobTitleApi jobTitle;
    public final JobsApi jobs;
    public final LeaveBalanceApi leaveBalance;
    public final LeaveRequestsApi leaveRequests;
    public final LeaveTypesApi leaveTypes;
    public final LocationsApi locations;
    public final NoticePeriodApi noticePeriod;
    public final PayBandsApi payBands;
    public final PayCyclesApi payCycles;
    public final PayGradesApi payGrades;
    public final PayGroupsApi payGroups;
    public final PraiseApi praise;
    public final ProjectPhasesApi projectPhases;
    public final ProjectsApi projects;
    public final RequisitionRequestApi requisitionRequest;
    public final SalaryComponentsApi salaryComponents;
    public final TalentPoolApi talentPool;
    public final TasksApi tasks;
    public final TimeFramesApi timeFrames;
    public final TimesheetEntriesApi timesheetEntries;

    public KekaHr() {
        this(null);
    }

    public KekaHr(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.asset = new AssetApi(this.apiClient);
        this.assetCategory = new AssetCategoryApi(this.apiClient);
        this.assetCondition = new AssetConditionApi(this.apiClient);
        this.assetType = new AssetTypeApi(this.apiClient);
        this.attendance = new AttendanceApi(this.apiClient);
        this.attendanceCaptureScheme = new AttendanceCaptureSchemeApi(this.apiClient);
        this.authentication = new AuthenticationApi(this.apiClient);
        this.badge = new BadgeApi(this.apiClient);
        this.clients = new ClientsApi(this.apiClient);
        this.currency = new CurrencyApi(this.apiClient);
        this.departments = new DepartmentsApi(this.apiClient);
        this.employees = new EmployeesApi(this.apiClient);
        this.expense = new ExpenseApi(this.apiClient);
        this.expenseCategory = new ExpenseCategoryApi(this.apiClient);
        this.expensePolicy = new ExpensePolicyApi(this.apiClient);
        this.goal = new GoalApi(this.apiClient);
        this.groups = new GroupsApi(this.apiClient);
        this.holidayCalendar = new HolidayCalendarApi(this.apiClient);
        this.jobTitle = new JobTitleApi(this.apiClient);
        this.jobs = new JobsApi(this.apiClient);
        this.leaveBalance = new LeaveBalanceApi(this.apiClient);
        this.leaveRequests = new LeaveRequestsApi(this.apiClient);
        this.leaveTypes = new LeaveTypesApi(this.apiClient);
        this.locations = new LocationsApi(this.apiClient);
        this.noticePeriod = new NoticePeriodApi(this.apiClient);
        this.payBands = new PayBandsApi(this.apiClient);
        this.payCycles = new PayCyclesApi(this.apiClient);
        this.payGrades = new PayGradesApi(this.apiClient);
        this.payGroups = new PayGroupsApi(this.apiClient);
        this.praise = new PraiseApi(this.apiClient);
        this.projectPhases = new ProjectPhasesApi(this.apiClient);
        this.projects = new ProjectsApi(this.apiClient);
        this.requisitionRequest = new RequisitionRequestApi(this.apiClient);
        this.salaryComponents = new SalaryComponentsApi(this.apiClient);
        this.talentPool = new TalentPoolApi(this.apiClient);
        this.tasks = new TasksApi(this.apiClient);
        this.timeFrames = new TimeFramesApi(this.apiClient);
        this.timesheetEntries = new TimesheetEntriesApi(this.apiClient);
    }

}
