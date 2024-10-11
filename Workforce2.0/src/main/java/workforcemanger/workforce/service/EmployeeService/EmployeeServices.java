package workforcemanger.workforce.service.EmployeeService;

import workforcemanger.workforce.dto.EmployeeDTO;
import workforcemanger.workforce.entity.Employee;
import workforcemanger.workforce.helper.Validator;
import workforcemanger.workforce.mapper.EmployeeDTOMapper;
import workforcemanger.workforce.repository.Employee.EmployeeRepository;
import workforcemanger.workforce.repository.Employee.EmployeeRepositoryImpl;

import java.util.List;

public class EmployeeServices {
    final EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        try {
//                Employee employee = null;
//                boolean flag = Validator.validateAllFields(employeeDTO.getUserName(),employeeDTO.getEmail(),employeeDTO.getPhoneNumber());
//                if (flag) {
//
//                }else {
//                    throw new IllegalArgumentException("Invalid employee data provided.");
//                }
            Employee employee = employeeRepository.create(EmployeeDTOMapper.DtoToEmployee(employeeDTO));
            return EmployeeDTOMapper.EmployeeToDto(employee);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<EmployeeDTO> getAllEmployees() {
        try {
            return EmployeeDTOMapper.EmployeeListToEmployeeDTOList(employeeRepository.findAll());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
