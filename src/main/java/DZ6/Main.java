package DZ6;

public class Main {
    public static void main(String[] args) {

        System.out.println(discriminant());

        System.out.println(factorial(5));
}
    static double a = a = 7.2, b = 5, c = 9;
    static double firstRoot, secondRoot;

    public static double discriminant(){
        double root = b * b - 4 * a * c;

        if (root > 0) {
            firstRoot = (-b + Math.sqrt(root)) / (2 * a);
            secondRoot = (-b - Math.sqrt(root)) / (2 * a);
            System.out.format("First Root = %.2f and Second Root = %.2f", firstRoot, secondRoot);

        }
        else if (root == 0) {
            firstRoot = secondRoot = -b / (2 * a);

            System.out.format(
                    "First Root = Second Root = %.2f;",
                    firstRoot);
        }else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-root) / (2 * a);
            System.out.printf("First Root = %.2f+%.2fi",
                    real, imaginary);
            System.out.printf("\nSecond Root = %.2f-%.2fi",
                    real, imaginary);
        }
            return root;
    }
//////////////////////////////////////\\

    public static int factorial(int f) {
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res = res * i;
        }
        return res;
    }
}