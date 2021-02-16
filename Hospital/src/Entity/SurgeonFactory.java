package Entity;

public class SurgeonFactory implements DoctorFactory {
    @Override
    public Doctor createDoctor() {
        return new Surgeon();
    }
}
