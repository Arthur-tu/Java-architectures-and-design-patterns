import Entity.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper {
    private final Connection connection;

    public PersonMapper(Connection connection) {
        this.connection  = connection;
    }

    public Person findById(int idPerson) throws SQLException, RecordNotFoundException {
        PreparedStatement statement = connection.prepareStatement(
                "SELECT idperson, firstname, lastname FROM person WHERE idperson = ?");
        statement.setInt(1,idPerson);
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Person person = new Person();
                person.setIdPerson(resultSet.getInt(1));
                person.setFirstName(resultSet.getString(2));
                person.setLastName(resultSet.getString(3));
                return person;
            }
        }

        throw new RecordNotFoundException(idPerson);
    }

    public void insert(Person person) {
        // some code
    }

    public void update(Person person) {
       // some code
    }

    public void delete(Person person) {
        // some code
    }
}
