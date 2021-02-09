import Entity.*;

import java.util.Scanner;

public class App {
    private DoctorForm doctorForm;
    Scanner scanner = new Scanner(System.in);

    public Doctor getDoctor() {
        String domainDoctor = scanner.nextLine().toLowerCase();
        DoctorFactory doctorFactory;

        if (domainDoctor.startsWith("head")) {
            doctorFactory = new Head_PhysicianFactory();
        } else if (domainDoctor.startsWith("sur")) {
            doctorFactory = new SurgeonFactory();
        } else if (domainDoctor.startsWith("traum")) {
            doctorFactory = new TraumatologistFactory();
        } else {
            System.out.println("There is no doctor in the hospital ");
            return null;
        }
        doctorForm = new DoctorForm(doctorFactory);
        return null;
    }
}
