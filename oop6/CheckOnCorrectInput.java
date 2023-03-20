import java.util.Objects;

public interface CheckOnCorrectInput {
    public static boolean checkRealExpression(String expressionReal) {
        String[] str = expressionReal.split(" ");

        if (str.length != 3) {
            System.out.println(" неправильное выражение");
//            System.out.println(str.length);
            return true;
        }

        switch (str[1]) {
            case "+":
                return false;
            case "-":
                return false;
            case "/":
                return false;
            case "*":
                return false;
            default:
                System.out.println(" неправильная арифметическая операция");
                return true;
        }

    }

    public static boolean checkComplexExpression(String expressionComplex) {

        String[] str = expressionComplex.split(" ");
        if (str.length != 3) {
            System.out.println(" неправильное выражение");
//            System.out.println(str.length);
            return true;
        }
        if (Objects.equals(str[1], "+") || Objects.equals(str[1], "-")) {
//                System.out.println(Arrays.toString(str));
            if (str[2].endsWith("i")) return false;
            else {
                System.out.println(" неверно: в конце должно быть 'i");
                return true;
            }
        } else {
            System.out.println(" неправильная арифметическая операция, ввод + или - ");
            return true;
        }
    }


}
