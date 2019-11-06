public class Task10 {


//    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//    Find the sum of all the primes below two million.

    public static void main(String[] args) {
        int[] res = eratosthen(2000000);
        getSumm(res);

    }
    public static int[] eratosthen(int n){
        int[] array = new int[n];
        for (int i = 0; i < array.length ; i++) {
            array[i]=i;
        }
        array[1]=0;

        for (int i = 2; i < array.length; i++) {
            for (int j = i + i; j < array.length ; j+=i) {
                array[j] = 0;
            }

        }
        return array;
    }

    public static void getSumm(int[] s){
        int result = 0;
        for (int temp: s
        ) {
            result+=temp;
        }
        System.out.println(result);
    }
}

