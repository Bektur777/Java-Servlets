package com.ubei.http.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@WebServlet("/dispatcher")
public class DispatcherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("/flights")
//                .forward(req, resp);
//
//        System.out.println();
//        req.getRequestDispatcher("/flights")
//                .include(req, resp);
//
//        PrintWriter writer = resp.getWriter();
//        writer.write("<h1>Hello from include servlet</h1>");

        resp.sendRedirect("/flights");

////        req.setAttribute("1", "1234");
//        requestDispatcher.forward(req, resp);
    }
}
