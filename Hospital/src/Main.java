public class Main {

    public static void main(String[] args) {
        Reseption reseption = new Reseption();
        AppointmentDoctorStrategy head_PhysicianAppointmentStrategy = new Head_PhysicianAppointmentStrategy("Boris", "Ivanov", "09.02.2021");

        reseption.record(head_PhysicianAppointmentStrategy);
    }
}
