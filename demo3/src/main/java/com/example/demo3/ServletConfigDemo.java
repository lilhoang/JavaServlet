package com.example.demo3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(urlPatterns = {"/test-config"}, initParams = {
//        @WebInitParam(name = "name",value = "Hoang")
//})
public class ServletConfigDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = super.getServletConfig().getInitParameter("name");

        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();

        printWriter.println("xin chao" + name);

    }
}
