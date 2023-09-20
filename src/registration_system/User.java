package registration_system;

public abstract class User {
    private String name;
    private String idNumber;

    public User(String n, String id) {
        name = n;
        idNumber = id;
    }
}
