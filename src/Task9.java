public class Task9 {


//    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//    a2 + b2 = c2
//
//    For example, 32 + 42 = 9 + 16 = 25 = 52.
//
//    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//    Find the product abc.

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                for (int k = 1; k < 1000; k++) {
                    if (((i * i) + (j * j) == (k * k)) && (i + j + k) == 1000 && (i < j && j < k && i < k)) {
                        System.out.printf("%d %d %d = %d\n", i, j, k, 1000);
                        int reuslt = i * k * j;
                        System.out.println(reuslt);
                    }
                }
            }
        }
    }
}
