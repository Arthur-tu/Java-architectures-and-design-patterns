public class RecordNotFoundException extends Exception {
    public RecordNotFoundException(int idPerson) {
        System.out.println("person not found with id = " + idPerson);
      return;
    }
}
