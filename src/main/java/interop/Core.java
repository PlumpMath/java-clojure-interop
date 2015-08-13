package interop;

public class Core {
    public static String sayHelloTo(String person) {
        return (String) Clj.fn("interop.core", "say-hello-to").invoke(person);
    }
}
