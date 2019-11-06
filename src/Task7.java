import java.util.ArrayList;

public class Task7 {

//    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//    What is the 10 001st prime number?
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        int j = 1;
        while(l.size() <= 1001 ){
            int k = 0;
            for (int i = 1; i <= j; i++){
                if ( j%i == 0 ){
                    k+=1;
                }
            }
            if (k==2){
                l.add(j);
            }
            j++;
        }
        System.out.println(l.get(1001));
    }
}
