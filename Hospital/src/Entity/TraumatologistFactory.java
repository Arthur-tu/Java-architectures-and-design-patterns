package Entity;

public class TraumatologistFactory implements DoctorFactory {
    @Override
    public Doctor createDoctor() {
        return new Traumatologist();
    }
}
