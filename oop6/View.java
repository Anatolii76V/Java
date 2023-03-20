import java.util.Scanner;

public class View implements CheckOnCorrectInput {
    public static String getArithmeticReal() {
        String input;
        do {
            System.out.println("Введите арифметическое действие, например: 2 + 3, используя + - / *");
            input = new Scanner(System.in).nextLine();
        } while (CheckOnCorrectInput.checkRealExpression(input));
        return input;
    }

    public static String[] getArithmeticComplex() {
        String[] complexOperand = new String[3];

        do {
            System.out.println("Введите первое комплексное число в формате 'x + yi': ");
            complexOperand[0] = new Scanner(System.in).nextLine();
        } while (CheckOnCorrectInput.checkComplexExpression(complexOperand[0]));
        complexOperand[0] = complexOperand[0].replaceAll("i", "");

        do {
            System.out.println("Введите операцию: '+' '-' '*' '/' ");
            complexOperand[1] = new Scanner(System.in).nextLine();
        } while (!(complexOperand[1].equals("+") || complexOperand[1].equals("-") || complexOperand[1].equals("*") || complexOperand[1].equals("/")));


        do {
            System.out.println("Введите второе комплексное число в формате 'x + yi': ");
            complexOperand[2] = new Scanner(System.in).nextLine();
        } while (CheckOnCorrectInput.checkComplexExpression(complexOperand[2]));
        complexOperand[2] = complexOperand[2].replaceAll("i", "");

        System.out.println("\n Операция ÷:");


        System.out.println("(" + complexOperand[0] + "i) " + complexOperand[1] + " (" + complexOperand[2] + "i)");
        return complexOperand;
    }

    public static void printResultRealExpression(double str) {
        System.out.println("\n Результат: ");
        System.out.println((str));
    }
}