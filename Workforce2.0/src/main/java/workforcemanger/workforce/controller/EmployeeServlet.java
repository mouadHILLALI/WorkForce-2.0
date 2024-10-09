package workforcemanger.workforce.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "employee" , value = "/employee")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String action = req.getParameter("action");
    switch (action) {
        case "create":
            create();
            break;
        case "update":
            break;
    }
    }
    public void create(){
        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
