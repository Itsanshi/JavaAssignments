public class Q15 {
        public static int gcd(int a, int b) {
            if (b == 0) {
                return a;
            } else {
                return gcd(b, a % b);
            }
        }

        public static void main(String[] args) {
            int a = 24;
            int b = 36;
            int gcd = gcd(a, b);
            System.out.printf("The GCD of %d and %d is %d", a, b, gcd);
        }
    }

