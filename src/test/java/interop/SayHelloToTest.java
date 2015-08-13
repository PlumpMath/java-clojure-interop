package interop;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SayHelloToTest {
  @Test
  public void returnsTheMessageFromClojure() {
    assertThat(Core.sayHelloTo("John"), is("Incorrect expectation"));
  }
}
