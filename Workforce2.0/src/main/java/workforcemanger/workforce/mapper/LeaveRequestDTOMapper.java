package workforcemanger.workforce.mapper;

import workforcemanger.workforce.dto.LeaveRequestDTO;
import workforcemanger.workforce.entity.LeaveRequest;

public class LeaveRequestDTOMapper {

    public LeaveRequestDTOMapper() {}

    public LeaveRequest dtoToLeaveRequest(LeaveRequestDTO leaveRequestDTO) {
        try {
            LeaveRequest leaveRequest = new LeaveRequest();
            leaveRequest.setLeaveRequestId(leaveRequestDTO.getLeaveRequestId());
            leaveRequest.setStartDate(leaveRequestDTO.getStartDate());
            leaveRequest.setEndDate(leaveRequestDTO.getEndDate());
            leaveRequest.setLeaveReason(leaveRequestDTO.getLeaveReason());
            leaveRequest.setStatus(leaveRequestDTO.getStatus());
            leaveRequest.setSupportingDocs(leaveRequestDTO.getSupportingDocs());
            leaveRequest.setLeaveBalance(leaveRequestDTO.getLeaveBalance());
            leaveRequest.setEmployeeId(leaveRequestDTO.getEmployeeId());
            return leaveRequest;
        } catch (Exception e) {
            throw new RuntimeException("Error mapping LeaveRequestDTO to LeaveRequest", e);
        }
    }

    public LeaveRequestDTO leaveRequestToDto(LeaveRequest leaveRequest) {
        try {
            LeaveRequestDTO leaveRequestDTO = new LeaveRequestDTO();
            leaveRequestDTO.setLeaveRequestId(leaveRequest.getLeaveRequestId());
            leaveRequestDTO.setStartDate(leaveRequest.getStartDate());
            leaveRequestDTO.setEndDate(leaveRequest.getEndDate());
            leaveRequestDTO.setLeaveReason(leaveRequest.getLeaveReason());
            leaveRequestDTO.setStatus(leaveRequest.getStatus());
            leaveRequestDTO.setSupportingDocs(leaveRequest.getSupportingDocs());
            leaveRequestDTO.setLeaveBalance(leaveRequest.getLeaveBalance());
            leaveRequestDTO.setEmployeeId(leaveRequest.getEmployeeId());
            return leaveRequestDTO;
        } catch (Exception e) {
            throw new RuntimeException("Error mapping LeaveRequest to LeaveRequestDTO", e);
        }
    }
}
