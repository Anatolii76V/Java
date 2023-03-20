public class Presenter {

    public Presenter() {
    }

    public static void start() throws IllegalAccessException {

        System.out.println("\n Программа для вычисления комплексных и вещественных чисел ");

        choice input = new choice();
        String flag = "y";
        while (flag.equals("y")) {
            if (input.chooseTypeNumber() == "2") {
                String readText = View.getArithmeticReal();
                Parser parserReal = new Parser(readText);
                CalcRealExpression rationalReal = new CalcRealExpression(parserReal);
                View.printResultRealExpression(rationalReal.solveReal());

            } else {
                String[] complexOperand = View.getArithmeticComplex();


                Parser parserComplex = new Parser(complexOperand);

                CalcComplex rationalComplex = new CalcComplex(parserComplex.getNumber1().getReal(), parserComplex.getOperation1(), parserComplex.getNumber1().getImage(),
                        parserComplex.getOperation(), parserComplex.getNumber2().getReal(), parserComplex.getOperation2(), parserComplex.getNumber2().getImage());

                System.out.println("\n Рузультат:");
                System.out.println(rationalComplex.solveComplex());
            }
            flag = input.chooseExitContue();

        }
    }
}