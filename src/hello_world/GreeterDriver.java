package hello_world;

public class GreeterDriver {
    public static void main(String[] args) {
        // Instantiate an object of type Greeter
        // (In Python, this would be 'g = Greeter()'

        // This 'declares' that g is an object of type Greeter
        Greeter g;

        // This defines g as a reference to a newly-created Greeter object
        g = new Greeter("Andy");

        // More common would be doing this in a single line:
        //   Greeter g = new Greeter();

        System.out.println(g.buildHelloFromName());

        // Send 'g' a "sayHello" _message_ with a parameter of 'Andy',
        // and save g's reply in a variable called 'result'
        String result = g.buildHello("Andy");
        System.out.println(result);

        System.out.println(g.buildHelloFromName());
    }
}
