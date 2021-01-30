package hsos.cho.srv.login.boundary;

import hsos.cho.srv.settings.entity.Properties;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("")
public class DefaultDispatchServlet extends HttpServlet {

    @Inject
    Properties properties;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.sendRedirect(properties.controllerservlet);
    }


}