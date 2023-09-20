package hello_world;

public class Greeter {
    // This is an instance variable. Every instance of this object
    // will have its own copy of it. The 'private' just means that
    // only things inside this class can access 'name'.
    private String name;

    // This is a constructor that will be instantiated every time I want
    // an object of type Greeter.
    public Greeter(String n) {
        name = n;
    }

    // In Python, I'd write this as:
    //    def say_hello(name):
    // * 'public' means anyone can send the Greeter this message
    // * 'String' means the method will return a String object
    // * 'sayHello' means I receive 'sayHello' messages
    // * '(String name)' means the message contains the 'name', which
    //   is of type String
    //
    // "A Greeter object can be told to say hello."
    public String buildHello(String n) {
        return "Hello, " + n + "!";
    }

    public String buildHelloFromName() {
        return "Hello, " + name + "!";
    }
}
