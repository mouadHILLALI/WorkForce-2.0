package workforcemanger.workforce.controller;

import workforcemanger.workforce.dto.EmployeeDTO;
import workforcemanger.workforce.service.EmployeeService.EmployeeServices;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "employee" , value = "/employee")
public class EmployeeServlet extends HttpServlet {
    final EmployeeServices employeeServices = new EmployeeServices();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String action = req.getParameter("action");
    switch (action) {
        case "create":
            create(req,resp);
            break;
        case "update":
            break;
    }
    }
    public void create(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setUserName(req.getParameter("name"));
            employeeDTO.setEmail(req.getParameter("email"));
            employeeDTO.setPhoneNumber(req.getParameter("phone"));
            employeeDTO.setAddress(req.getParameter("address"));
            employeeDTO.setSalary(Double.valueOf(req.getParameter("salary")));
            employeeDTO.setChildrenCount(Integer.valueOf(req.getParameter("childrenCount")));
            employeeDTO.setDateOfBirth(LocalDate.parse(req.getParameter("dateOfBirth")));
            employeeDTO.setHireDate(LocalDate.parse(req.getParameter("dateOfHiring")));
            employeeDTO.setPosition(req.getParameter("position"));
            employeeDTO.setSocialSecurityNumber(req.getParameter("socialSecurityNumber"));
            employeeDTO = employeeServices.createEmployee(employeeDTO);
            req.getSession().setAttribute("employee", employeeDTO);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/views/admin.jsp");
            res.setContentType("text/html");
            dispatcher.forward(req, res);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
