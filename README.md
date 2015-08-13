# java-clojure-interop
An initial template for Java projects using Clojure code.

## Run the tests
Running `gradle test --info` will print like:

```
... build information ...

interop.SayHelloToTest > returnsTheMessageFromClojure FAILED
    java.lang.AssertionError:
    Expected: is "Incorrect expectation"
         but: was "Hello John! This message comes from Clojure!"
        at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)
        at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:8)
        at interop.SayHelloToTest.returnsTheMessageFromClojure(SayHelloToTest.java:11)

1 test completed, 1 failed

... more build information ...
```

They will also generate more detailed reports:
* HTML: at `build/reports/tests/index.html`
* XML: at `build/test-results/TEST-helloWorld.MainTest.xml`
* Binary: at `build/test-results/binary/test/*`

## Compile jar
`gradle shadowJar` will create the jar at `build/libs/interop.jar`.

## Run jar
`java -jar build/libs/interop.jar` will print "Hello John! This message comes from Clojure!"
