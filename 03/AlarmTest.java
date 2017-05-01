import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class AlarmTest {

  // create a mock object
  @Mock
  private static Temperature mock_temperature;

  // Define the class to inject mock
  @InjectMocks
  private Alarm alarm = new Alarm();

  @Test
  public void testIsHot() {
    when(mock_temperature.now()).thenReturn(50);
    assertTrue(alarm.isHot());
  }

  @Test
  public void testIsHotWithTemperatureZero() {
    when(mock_temperature.now()).thenReturn(0);
    assertEquals(false, alarm.isHot());
  }

  //Write positive test and negative test for isCold

}
