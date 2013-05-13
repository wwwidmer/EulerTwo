package widmer.Euler;

public class EulerDriver {

  /**
         * Algorithm to solve the Seocnd Project Euler Problem Found at :
         * http://projecteuler.net/problem=2 By William Widmer
         */
 
        public static void main(String[] args) {
                fibonacciEvens();
        }
 
        public static int fibonacci(int i) {
                if (i == 0)
                        return 0;
                else if (i == 1)
                        return 1;
                else
                        return fibonacci(i - 1) + fibonacci(i - 2);
        }
 
        public static void fibonacciEvens() {
                int sum = 0;
                for (int i = 1; i < 34; i++) {
                        int f = fibonacci(i);
                        if (f % 2 == 0) {
                                System.out.println(f+" "+sum);
                                sum = sum + f;
                        }
                }
                System.out.println(sum);
        }
 
}
