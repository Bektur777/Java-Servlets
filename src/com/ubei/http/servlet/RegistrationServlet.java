package com.ubei.http.servlet;

import com.ubei.http.dto.CreateUserDto;
import com.ubei.http.exception.ValidationException;
import com.ubei.http.service.UserService;
import com.ubei.http.util.JspHelper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@MultipartConfig(fileSizeThreshold = 1024 * 1024)
@WebServlet(value = "/registration", name = "RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

    private static final UserService userService = UserService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (true) {
            throw new RuntimeException();
        }
        req.setAttribute("roles", List.of("USER", "ADMIN"));
        req.setAttribute("genders", List.of("MALE", "FEMALE"));

        req.getRequestDispatcher(JspHelper.getPath("registration"))
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            userService.create(CreateUserDto.builder()
                    .name(req.getParameter("name"))
                    .birthday(req.getParameter("birth"))
                    .image(req.getPart("image"))
                    .email(req.getParameter("email"))
                    .password(req.getParameter("password"))
                    .role(req.getParameter("role"))
                    .gender(req.getParameter("gender"))
                    .build());
            resp.sendRedirect("/login");
        } catch (ValidationException e) {
            req.setAttribute("errors", e.getErrors());
            doGet(req, resp);
        }
    }
}
