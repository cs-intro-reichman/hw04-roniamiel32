public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[N+1];

        for (int i = 2; i <= N; i++) {
            arr[i] = true;
        }
        
        int p = 2;
        while (p * p <= N){
            if(arr[p]) {
                int multiples = p * p;
                while(multiples <= N){
                    arr[multiples] = false;
                    multiples += p;
                }
            }
            p++;
        }
        System.out.println("Prime numbers up to " + N + ":");

        int count = 0;
        for (int i = 2; i <= N; i++) {
            if (arr[i]){
                System.out.println(i);
                count++;
        }
    }
        int percentPrime = (int)((100.0 * count) / N);

        System.out.println("There are " + count + " primes between 2 and " + N +
    " (" + percentPrime + "% are primes)");   

    }
}
