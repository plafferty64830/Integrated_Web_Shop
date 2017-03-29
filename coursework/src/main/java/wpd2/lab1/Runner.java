
package wpd2.lab1;

import wpd2.lab1.servlet.DemoServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import wpd2.lab1.servlet.JS;
import wpd2.lab1.servlet.SkuServlet;
import wpd2.lab1.servlet.StyleSheet;

public class Runner {
    @SuppressWarnings("unused")
    private static final Logger LOG = LoggerFactory.getLogger(Runner.class);

    private static final int PORT = 9000;
    private final String shopName;

    private Runner(String shopName) {
        this.shopName = shopName;
    }

    private void start() throws Exception {
        Server server = new Server(PORT);

        ServletContextHandler handler = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS);
        handler.setContextPath("/");
        handler.setInitParameter("org.eclipse.jetty.servlet.Default." + "resourceBase", "target/classes/webapp");

        DemoServlet demoServlet = new DemoServlet(shopName);
        handler.addServlet(new ServletHolder(demoServlet), "/shop/*");

        /*
        DefaultServlet ds = new DefaultServlet();
        handler.addServlet(new ServletHolder(ds), "/");
        */

        SkuServlet skuServlet = new SkuServlet();
        handler.addServlet(new ServletHolder(skuServlet), "/store/*");
        StyleSheet style = new StyleSheet();
        handler.addServlet(new ServletHolder(style), "/store/StyleSheet/*");
        JS jsServlet = new JS();
        handler.addServlet(new ServletHolder(jsServlet), "/store/JS/*");


        server.start();
        LOG.info("Server started, will run until terminated");
        server.join();

    }

    public static void main(String[] args) {
        try {
            LOG.info("starting");
            new Runner("").start();
        } catch (Exception e) {
            LOG.error("Unexpected error running shop: " + e.getMessage());
        }
    }
}
