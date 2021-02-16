package Entity;

public class Person {
    private int idPerson;
    private String lastName;
    private String firstName;

    public void setIdPerson(int anInt) { this.idPerson = anInt; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() { return idPerson; }

    public String getLastname() { return lastName; }

    public String getFirstname() { return firstName; }

    public Person() {
    }

    public Person(int idPerson, String firstName, String lastName) {
        this.idPerson = idPerson;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
