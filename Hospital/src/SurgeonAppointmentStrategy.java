import Entity.Doctor;

import java.util.Date;

public final class SurgeonAppointmentStrategy implements AppointmentDoctorStrategy {
    private final String name;
    private final String surname;
    private final String date;

    SurgeonAppointmentStrategy(String name, String surname, String date) {
        this.date = date;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void record(Doctor doctor) {
        System.out.println("Appointment with a Surgeon has been created");
    }
}
