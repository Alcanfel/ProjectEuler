public class Task4 {

//    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//    Find the largest palindrome made from the product of two 3-digit numbers.

    public static void main(String[] args) {
        int m = 0;
        int result = 0;
        int a = 0;

        for (int i = 0; i < 100; i++){
            for (int j = 0; j < 100; j++){
                m = i * j;
                StringBuilder num = new StringBuilder(String.valueOf(m));
                a = Integer.parseInt(num.reverse().toString());
                if (m == a) {
                    if (result < m){
                        result = m;
                    }
                }
            }
        }
        System.out.println(result);

    }
}
