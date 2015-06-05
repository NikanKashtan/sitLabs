package by.bsuir.webphoto.buzhiskaya.logic.impl;

import by.bsuir.webphoto.buzhiskaya.controller.JspPageName;
import by.bsuir.webphoto.buzhiskaya.logic.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Veronika on 24.03.2015.
 */
public class NoSuchCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return JspPageName.ERROR_PAGE;
    }
}
