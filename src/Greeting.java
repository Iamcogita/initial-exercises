public class Greeting {

    public static void main(String[] args) {
        // greeting("Delilah"); // Should return "Hello, Delilah"
        // greeting("Francis"); // Should return "Hello, Francis!"

        greeting("Delilah");
        greeting("Francis");

    }

    // You should implement a method that receives a name and returns a greeting message with said name included
    // NOTE: You might have to change the method declaration itself
    private static String greeting(String name) {
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
