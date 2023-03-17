
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите первое число: ");
            int n1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int n2 = scanner.nextInt();
            int sum = n1 + n2;
            int minus = n1 - n2;
            int multiply = n1 * n2;
            int share = n1 / n2;
            int remdivis = n1 % n2;
            System.out.printf("Сумма = %d\nРазность = %d\nПроизведение = %d\n" +
                    "Частное = %d\nОстаток от деления = %d\n ", sum, minus, multiply, share, remdivis);
        }
    }
}