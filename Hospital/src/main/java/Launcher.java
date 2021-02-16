import Stategy.AppointmentDoctorStrategy;
import Stategy.Head_PhysicianAppointmentStrategy;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.net.URL;
import java.security.ProtectionDomain;
import java.sql.Connection;

public class Launcher {

    public static void main(String[] args) throws Exception {

        Reseption reseption = new Reseption();
        Connection connection = null;
        AppointmentDoctorStrategy head_PhysicianAppointmentStrategy = new Head_PhysicianAppointmentStrategy("Boris", "Ivanov", "09.02.2021");
        PersonMapper personMapper = new PersonMapper(connection);
        //personMapper.findById(1);
        reseption.record(head_PhysicianAppointmentStrategy);

        Server server = new Server(8080);

        ProtectionDomain domain = Launcher.class.getProtectionDomain();
        URL location = domain.getCodeSource().getLocation();

        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/app");
        webAppContext.setWar(location.toExternalForm());

        server.setHandler(webAppContext);
        server.start();
        server.join();
    }
}
