import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число : ");
        int a = s.nextInt();
        System.out.println("Треугольное число = " + Triangle(a) );
    }

    public static int Triangle(int n) {
        if (n == 1) {
            return 1;
        }
        return Triangle(n - 1) + n;
    }
}
