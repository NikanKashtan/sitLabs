package by.bsuir.webphoto.buzhiskaya.logic.impl;

import by.bsuir.webphoto.buzhiskaya.controller.RequestParameterName;
import by.bsuir.webphoto.buzhiskaya.dao.UserDao;
import by.bsuir.webphoto.buzhiskaya.logic.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Veronika on 24.03.2015.
 */
public class LogInCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter(RequestParameterName.USERNAME);
        String userpass = request.getParameter(RequestParameterName.USERPASS);


        return "/error.jsp";
    }
}
