import Entity.Doctor;

public class Reseption {
    App app = new App();

    public void record (AppointmentDoctorStrategy appointmentStrategy) {
      Doctor doctor = app.getDoctor();
      appointmentStrategy.record(doctor);
    }

}
