package Configuration;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.mysql.jdbc.AbandonedConnectionCleanupThread;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

public class MyWebAppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("************** Starting up! **************");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("************** Shutting down! **************");
        System.out.println("Destroying Context...");
        System.out.println("Calling MySQL AbandonedConnectionCleanupThread checkedShutdown");
        try {
			AbandonedConnectionCleanupThread.shutdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        ClassLoader cl = Thread.currentThread().getContextClassLoader();

        Enumeration<Driver> drivers = DriverManager.getDrivers();
        while (drivers.hasMoreElements()) {
            Driver driver = drivers.nextElement();

            if (driver.getClass().getClassLoader() == cl) {
                try {
                    System.out.println("Deregistering JDBC driver {}");
                    DriverManager.deregisterDriver(driver);

                } catch (SQLException ex) {
                    System.out.println("Error deregistering JDBC driver {}");
                    ex.printStackTrace();
                }
            } else {
                System.out.println("Not deregistering JDBC driver {} as it does not belong to this webapp's ClassLoader");
            }
        }
    }

}