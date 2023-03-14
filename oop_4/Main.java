import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        PrintTask printTask = new PrintTask();
        ArrayList<String> task = printTask.taskArrayList();
        ArrayList<String[]> taskShare = printTask.taskShare(task);

        PrintInTask taskInPrint = new PrintInTask(taskShare);


        AddTask addTask = new AddTask();

        Talking ask = new Talking();

        Scanner in = new Scanner(System.in);

        ask.firstQuestion();

        int chois = in.nextInt();
        if (chois == 1) {
            printTask.printTask(taskShare);
        } else if (chois == 2) {

            ask.choisTask();
            int choisTask = in.nextInt();
            taskInPrint.printTask(choisTask);

        } else if (chois == 3) {
            addTask.writeInPlaner();

        } else
            System.out.println("Не верный ввод");
    }
}