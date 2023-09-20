package hello_world;

public class FarewellerDriver {
    public static void main(String[] args) {
        // Create a reference to a Fareweller object
        // called 'f', and set that reference to a
        // Fareweller object that remembers the name "Andy"
        Fareweller f1 = new Fareweller("Andy");
        Fareweller f2 = new Fareweller();

        System.out.println(f1.generateGoodbye());
        System.out.println(f2.generateGoodbye());
    }
}
