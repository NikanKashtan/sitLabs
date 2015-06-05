package by.bsuir.webphoto.buzhiskaya.controller;

import by.bsuir.webphoto.buzhiskaya.logic.Command;
import by.bsuir.webphoto.buzhiskaya.logic.CommandHelper;
import com.sun.net.httpserver.HttpServer;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Veronika on 24.03.2015.
 */
public class Controller extends HttpServlet implements Servlet {

    private CommandHelper commandHelper = CommandHelper.getInstance();

   public Controller(){
       super();
   }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) {
        doPost (request,response);
    }
    protected void doPost (HttpServletRequest request, HttpServletResponse response) {
        String commandName=request.getParameter(RequestParameterName.COMMAND_NAME);
        Command command= commandHelper.getCommand(commandName);
        String page = null;
        try {
            page = command.execute(request,response);
            RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
            rd.forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
