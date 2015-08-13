package interop;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

public class Clj {
    private static final IFn REQUIRE = Clojure.var("clojure.core", "require");

    public static IFn fn(String namespace, String functionName) {
        REQUIRE.invoke(Clojure.read(namespace));
        return Clojure.var(namespace, functionName);
    }
}
