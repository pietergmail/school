package ui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogInHandler extends RequestHandler {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        return "logIn.jsp";
    }
}
