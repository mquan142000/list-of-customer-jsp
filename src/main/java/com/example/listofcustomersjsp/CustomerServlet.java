package com.example.listofcustomersjsp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

@WebServlet(name = "Customer List", value = "/customer-list")
public class CustomerServlet extends HttpServlet {
    protected List<Customer> customers;

    protected void setup() {
        customers = new ArrayList<>();
        customers.add((new Customer("Nguyen Van A", "1983-08-20", "Ha Noi", "1.jqp")));
        customers.add((new Customer("Nguyen Van B", "1985-09-15", "Da Nang", "2.jqp")));
        customers.add((new Customer("Nguyen Van C", "1983-09-21", "Ha Tay", "3.jqp")));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        setup();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customerlist.jsp");
        request.setAttribute("customerList", customers);
        requestDispatcher.forward(request, response);
    }
}
