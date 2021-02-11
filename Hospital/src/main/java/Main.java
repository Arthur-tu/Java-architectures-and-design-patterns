import Stategy.AppointmentDoctorStrategy;
import Stategy.Head_PhysicianAppointmentStrategy;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        Reseption reseption = new Reseption();
        Connection connection = null;
        AppointmentDoctorStrategy head_PhysicianAppointmentStrategy = new Head_PhysicianAppointmentStrategy("Boris", "Ivanov", "09.02.2021");
        PersonMapper personMapper = new PersonMapper(connection);
        personMapper.findById(1);

        reseption.record(head_PhysicianAppointmentStrategy);
    }
}
