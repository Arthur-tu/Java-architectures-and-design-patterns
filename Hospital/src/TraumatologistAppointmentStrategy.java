import Entity.Doctor;

import java.util.Date;

public final class TraumatologistAppointmentStrategy implements AppointmentDoctorStrategy{
    private final String name;
    private final String surname;
    private final String date;
    private final int typeOfSeverity;

    TraumatologistAppointmentStrategy(String name, String surname, String date, int typeOfSeverity) {
        this.date = date;
        this.name = name;
        this.surname = surname;
        this.typeOfSeverity = typeOfSeverity;
    }

    @Override
    public void record(Doctor doctor) {
        System.out.println("Appointment with a Traumatologist has been created");
    }
}
