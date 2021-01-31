import Entity.Doctor;
import Entity.DoctorFactory;

public class DoctorForm {
    private final Doctor doctor;

    public DoctorForm(DoctorFactory doctorFactory) {
        doctor = doctorFactory.createDoctor();
    }
}
