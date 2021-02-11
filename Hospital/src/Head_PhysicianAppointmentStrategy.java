import Entity.Doctor;

import java.util.Date;

public final class Head_PhysicianAppointmentStrategy implements AppointmentDoctorStrategy {
    private final String name;
    private final String surname;
    private final String date;

    Head_PhysicianAppointmentStrategy(String name, String surname, String date) {
        this.date = date;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void record(Doctor doctor) {
        System.out.println("Appointment with a Head_Physician has been created ");
    }
}
