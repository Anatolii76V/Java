public class CompNum {
    double real, img;
    CompNum(double r, double i){
        this.real = r;
        this.img = i;
    }
    public CompNum sum(CompNum c1, CompNum c2)
    {
        CompNum temp = new CompNum(0, 0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }

    public void main(String args[]) {
        CompNum c1 = new CompNum(5.5, 4);
        CompNum c2 = new CompNum(1.2, 3.5);
        CompNum temp = sum(c1, c2);
        System.out.printf("Сумма : "+ temp.real+" + "+ temp.img +"i");
        System.out.println();
    }
}
