package hr.mcom;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class StartUp implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("StartUpListener --> contextInitialized()");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("StartUpListener --> contextDestroyed()");
    }
}
