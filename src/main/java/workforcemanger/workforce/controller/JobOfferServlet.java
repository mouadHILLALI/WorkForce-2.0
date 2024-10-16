package workforcemanger.workforce.controller;

import workforcemanger.workforce.entity.JobOffer;
import workforcemanger.workforce.service.GenericService.GenericServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "jobOffer" , value = "/offer")
public class JobOfferServlet extends HttpServlet {
    final GenericServiceImpl genericService = new GenericServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String action = req.getParameter("action");
    switch (action) {
        case "create":
            createJobOffer(req, resp);
            break;
    }
    }
    public void createJobOffer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            System.out.println("Create Job Offer");
            String title = request.getParameter("Title");
            String description = request.getParameter("Description");
            String Requirements = request.getParameter("Requirements");
            int salary = Integer.parseInt(request.getParameter("salary"));
            LocalDate validity = LocalDate.parse(request.getParameter("validityDate"));
            int hrId = Integer.parseInt(request.getParameter("id"));
            String status = "valid";
            JobOffer jobOffer = new JobOffer(title , description , Requirements , LocalDate.now() , salary ,status ,validity , hrId );
            Object obj = genericService.create(jobOffer);
            response.getWriter().print(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
