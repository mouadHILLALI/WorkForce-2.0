package workforcemanger.workforce.mapper;

import workforcemanger.workforce.dto.EmployeeDTO;
import workforcemanger.workforce.entity.Employee;

public class EmployeeDTOMapper {

    public EmployeeDTOMapper() {}

    public static Employee DtoToEmployee(EmployeeDTO employeeDTO) {
        try {
            Employee employee = new Employee();
            employee.setId(employeeDTO.getId());
            employee.setUserName(employeeDTO.getUserName());
            employee.setEmail(employeeDTO.getEmail());
            employee.setPhone(employeeDTO.getPhoneNumber());
            employee.setDateOfBirth(employeeDTO.getDateOfBirth());
            employee.setAddress(employeeDTO.getAddress());
            employee.setPosition(employeeDTO.getPosition());
            employee.setHireDate(employeeDTO.getHireDate());
            employee.setSalary(employeeDTO.getSalary());
            employee.setChildrenCount(employeeDTO.getChildrenCount());
            employee.setSocialSecurityNumber(employeeDTO.getSocialSecurityNumber());
            return employee;
        } catch (Exception e) {
            throw new RuntimeException("Error mapping EmployeeDTO to Employee", e);
        }
    }

    public static EmployeeDTO EmployeeToDto(Employee employee) {
        try {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setId(employee.getId());
            employeeDTO.setUserName(employee.getUserName());
            employeeDTO.setEmail(employee.getEmail());
            employeeDTO.setPhoneNumber(employee.getPhone());
            employeeDTO.setDateOfBirth(employee.getDateOfBirth());
            employeeDTO.setAddress(employee.getAddress());
            employeeDTO.setPosition(employee.getPosition());
            employeeDTO.setHireDate(employee.getHireDate());
            employeeDTO.setSalary(employee.getSalary());
            employeeDTO.setChildrenCount(employee.getChildrenCount());
            employeeDTO.setSocialSecurityNumber(employee.getSocialSecurityNumber());
            return employeeDTO;
        } catch (Exception e) {
            throw new RuntimeException("Error mapping Employee to EmployeeDTO", e);
        }
    }
}
