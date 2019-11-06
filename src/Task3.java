import java.util.ArrayList;

//The prime factors of 13195 are 5, 7, 13 and 29.
//
//        What is the largest prime factor of the number 600851475143 ?

public class Task3 {
    public static void main(String[] args) {
        long num = 600851475143L;
        ArrayList<Integer> list = new ArrayList<>();

        int j = 2;
        while (true){
            if (num == 1) break;
            if (num % j == 0){
                list.add(j);
                num = num / j;
                j = 2;
                continue;
            }
            j++;
        }
        System.out.println(list);
    }
}
