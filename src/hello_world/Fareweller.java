package hello_world;

public class Fareweller {
    // This is the state of a Fareweller object. It remembers
    // the name of the person to say farewell to.
    private String name;

    public Fareweller() {
        name = "Home-Slice";
    }

    public Fareweller(String n) {
        name = n;
    }

    public String generateGoodbye() {
        return "Farewell, " + name;
    }
}
