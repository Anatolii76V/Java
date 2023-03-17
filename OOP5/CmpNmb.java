public class CmpNmb {
    public static String complexNumber(String a, String b) {

        String x[] = a.split("\\+|i");
        String y[] = b.split("\\+|i");

        int a_real = Integer.parseInt(x[0]);
        int a_img = Integer.parseInt(x[1]);
        int b_real = Integer.parseInt(y[0]);
        int b_img = Integer.parseInt(y[1]);

        return (a_real * b_real - a_img * b_img) + "+" +
                (a_real * b_img + a_img * b_real) + "i";
    }

    public static void main(String argc[]){
        String str1 = "1+1i";
        String str2 = "1+1i";
        System.out.println(complexNumber(str1, str2));
    }
}
