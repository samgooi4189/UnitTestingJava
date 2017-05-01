import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyClassTest {
  String message = "Hello World";
  MyClass myClass = new MyClass(message);

  @Test
  public void testPrintMessage() {
    assertEquals(message, myClass.printMessage());
  }
}
