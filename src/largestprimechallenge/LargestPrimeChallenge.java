package largestprimechallenge;

public class LargestPrimeChallenge {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int maxPrime = 1;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                while (number % i == 0) {
                    maxPrime = i;
                    number /= i;
                }
            }
        }
        return (number == 1) ? maxPrime : number;
    }

}
