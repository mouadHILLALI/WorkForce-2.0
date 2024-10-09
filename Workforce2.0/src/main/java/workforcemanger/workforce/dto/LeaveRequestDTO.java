package workforcemanger.workforce.dto;

import workforcemanger.workforce.enums.StatusEnum;

import java.time.LocalDate;

public class LeaveRequestDTO {
    private int leaveRequestId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String leaveReason;
    private StatusEnum status;
    private String supportingDocs;
    private int leaveBalance;
    private int employeeId;


    public LeaveRequestDTO() {}

    public LeaveRequestDTO(int leaveRequestId, LocalDate startDate, LocalDate endDate, String leaveReason, StatusEnum status, String supportingDocs, int leaveBalance, int employeeId) {
        this.leaveRequestId = leaveRequestId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.leaveReason = leaveReason;
        this.status = status;
        this.supportingDocs = supportingDocs;
        this.leaveBalance = leaveBalance;
        this.employeeId = employeeId;
    }

    public int getLeaveRequestId() {
        return leaveRequestId;
    }

    public void setLeaveRequestId(int leaveRequestId) {
        this.leaveRequestId = leaveRequestId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getSupportingDocs() {
        return supportingDocs;
    }

    public void setSupportingDocs(String supportingDocs) {
        this.supportingDocs = supportingDocs;
    }

    public int getLeaveBalance() {
        return leaveBalance;
    }

    public void setLeaveBalance(int leaveBalance) {
        this.leaveBalance = leaveBalance;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "LeaveRequestDTO{" +
                "leaveRequestId=" + leaveRequestId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", leaveReason='" + leaveReason + '\'' +
                ", status=" + status +
                ", supportingDocs='" + supportingDocs + '\'' +
                ", leaveBalance=" + leaveBalance +
                ", employeeId=" + employeeId +
                '}';
    }
}
