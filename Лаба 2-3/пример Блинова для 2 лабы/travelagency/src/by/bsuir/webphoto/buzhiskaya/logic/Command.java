package by.bsuir.webphoto.buzhiskaya.logic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Veronika on 24.03.2015.
 */
public interface Command {
    public String execute(HttpServletRequest request, HttpServletResponse response);
}
