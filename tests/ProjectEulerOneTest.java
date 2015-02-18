import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class ProjectEulerOneTest {

  private ProjectEulerOne projectEulerOne;

  @Before
  public void setUp() throws Exception {
    projectEulerOne = new ProjectEulerOne();
  }

  @Test
  public void testCalculateTotal() throws Exception {
    assertEquals(234168, projectEulerOne.calculateTotal(1000));
  }
}