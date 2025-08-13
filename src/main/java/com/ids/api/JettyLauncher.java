package com.ids.api;

import com.ids.api.controller.ViewDataController;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class JettyLauncher {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

        // Register servlet
        context.addServlet(new ServletHolder(new ViewDataController()), "/view-data");

        server.start();
        System.out.println("✅ Jetty running at http://localhost:8080/view-data");
        server.join();
    }
}
