import Entity.DoctorFactory;
import Entity.Head_PhysicianFactory;
import Entity.SurgeonFactory;
import Entity.TraumatologistFactory;

import java.util.Scanner;

public class App {
    private DoctorForm doctorForm;
    Scanner scanner = new Scanner(System.in);


    public void getDoctor() {
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
            return;
        }
        doctorForm = new DoctorForm(doctorFactory);
    }
}
