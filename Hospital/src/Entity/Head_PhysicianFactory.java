package Entity;

public class Head_PhysicianFactory implements DoctorFactory {

    @Override
    public Doctor createDoctor() {
        return new Head_Physician();
    }
}
