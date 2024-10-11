package workforcemanger.workforce.controller;

import workforcemanger.workforce.dto.EmployeeDTO;
import workforcemanger.workforce.dto.UserDTO;
import workforcemanger.workforce.service.EmployeeService.EmployeeServices;
import workforcemanger.workforce.service.UserService.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "user" , value = "/user")
public class UserServlet extends HttpServlet {
    final UserService userService = new UserService();
    final EmployeeServices employeeService = new EmployeeServices();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String action = req.getParameter("action");
    switch (action) {
        case "logout":
            logout(req, resp);
            break;
        case "getAll":
            getAllInfo(req, resp);
        default:
            break;
     }
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action){
            case "register":
                create(req, resp);
                break;
            case "login":
                login(req, resp);
                break;
        }
    }
    public void create(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            UserDTO user = new UserDTO();
            user.setUserName(req.getParameter("username"));
            user.setPassword(req.getParameter("password"));
            user.setEmail(req.getParameter("email"));
            user.setRole("candidate");
            user = userService.createUser(user);
            RequestDispatcher rd = req.getRequestDispatcher("/views/candidate.jsp");
            req.setAttribute("user", user);
            rd.forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.getSession().invalidate();
            RequestDispatcher rd = req.getRequestDispatcher("/views/login.jsp");
            rd.forward(req, resp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            UserDTO user = new UserDTO();
            user.setEmail(req.getParameter("email"));
            user.setPassword(req.getParameter("password"));
            UserDTO loggedInUser = userService.login(user);
            if (loggedInUser != null) {
                System.out.println("role: " + loggedInUser.getRole());
                req.getSession().setAttribute("user", loggedInUser);
                String targetPage;
                switch (loggedInUser.getRole()) {
                    case "candidate":
                        targetPage = "/views/candidate.jsp";
                        break;
                    case "admin":
                        targetPage = "/views/admin.jsp?action=";
                        break;
                    default:
                        targetPage = "/views/login.jsp";
                        break;
                }
                RequestDispatcher rd = req.getRequestDispatcher(targetPage);
                rd.forward(req, resp);
            } else {
                req.setAttribute("loginError", "Invalid email or password.");
                RequestDispatcher rd = req.getRequestDispatcher("/views/login.jsp");
                rd.forward(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("errorMessage", "An error occurred during login. Please try again.");
            RequestDispatcher rd = req.getRequestDispatcher("/views/login.jsp");
            rd.forward(req, resp);
        }
    }
    public void getAllInfo(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException {
        try {
            List<EmployeeDTO> employeeDTOS = employeeService.getAllEmployees();
            req.setAttribute("employeeDTOS", employeeDTOS);
            RequestDispatcher rd = req.getRequestDispatcher("/views/adminEmployeManagement.jsp");
            rd.forward(req, res);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
