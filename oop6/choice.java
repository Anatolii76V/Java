import java.util.Scanner;

public class choice {

    private Scanner input;

    public
    choice() {
        input = new Scanner(System.in);
    }

    public String chooseTypeNumber() {
        System.out.println("\n выберите тип чисел: комплексные 1 \n или вещественные 2  ");
        if (input.next().equals("2")) {
            return "2";

        } else {
            return "1";
        }

    }

    public String chooseExitContue() {
        System.out.println("\n Вы хотите продолжить? Ввод 'y'/'n' - да/нет ");
        String in = input.next();
        while (!(in.equals("y") || in.equals("n"))) {
            System.out.println("\n Ошибка ввода!\n Вы хотите продолжить? Ввод 'y'/'n' - да/нет ");
            in = input.next();
        }
        return in;
    }

}