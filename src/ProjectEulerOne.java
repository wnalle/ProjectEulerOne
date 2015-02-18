/**
 * Calculates the sum of all numbers between 0 and some upper limit
 * that are multiples of either 3 or 5.
 *
 * Created by wgnalle on 2/1/2015.
 */
public class ProjectEulerOne {

  /**
   * Calls the CalculateTotal function with the default
   * parameter of 1000.
   *
   * @param args Ignored
   */
  public static void main(String[] args) {

    int sum = calculateTotal(1000);

    System.out.println("The sum is: " + sum);
  }

  /**
   * Calculates the sum of all values from 0 to some upper limit value.
   *
   * @param upperLimit The maximum value to check for calculating the sum of multiples of 3 and 5.
   *
   * @return The sum of all multiples of either 3 or 5 between 0 and the value <code>upperLimit</code>
   */
  public static int calculateTotal(int upperLimit) {
    int sum = 0;

    for (int i = 0; i <= upperLimit; i++) {
      if ((i % 3 == 0) || (i % 5 == 0)) {
        sum += i;
      }
    }

    return sum;
  }
}
