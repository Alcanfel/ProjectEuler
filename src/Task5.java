public class Task5 {

//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

    public static void main(String[] args) {
        int j = 1;
        while (true) {
            int k = 0;
            for (int i = 1; i <= 20; i++){
                if (j%i != 0){
                    break;
                } else k += 1;
            }
            if (k == 20) {
                System.out.println(j);
                break;
            }

            j++;
        }
    }
}
