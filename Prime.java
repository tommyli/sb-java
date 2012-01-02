import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Prime {
  public static void main (String[] args) {
    List<Integer> primes = new ArrayList<Integer>();
    for (int i = 2; i <= Integer.parseInt(args[0]); i++) {
      boolean isPrime = true;
      for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        primes.add(i);
      }
    }
    System.out.println(primes);
  }
}
