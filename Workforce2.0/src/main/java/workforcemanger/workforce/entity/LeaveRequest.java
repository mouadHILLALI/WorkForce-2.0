package workforcemanger.workforce.entity;

import workforcemanger.workforce.enums.StatusEnum;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "leave_requests")
public class LeaveRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int leaveRequestId;

    private LocalDate startDate;
    private LocalDate endDate;

    private String leaveReason;

    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    private String supportingDocs;
    private int leaveBalance;

    @Column(name = "employee_id")
    private int employeeId;

    public LeaveRequest() {}


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
}
