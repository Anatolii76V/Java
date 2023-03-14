import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AddTask {

    int maxID = 0;
    String addInfo = "";

    public AddTask() {

    }


    public void writeInPlaner() throws IOException {

        FileWriter addTask = new FileWriter("/home/user/ myFile.txt", true);

        String addInfo = addInfo();

        addTask.append(addInfo);
        addTask.append("\n");
        addTask.close();

    }

    public String addInfo() throws IOException {

        int id = maxID();

        addInfo = addInfo + (id + 1) + ";";

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String nowDate = formatter.format(date);
        addInfo = addInfo + nowDate + ";";

        Scanner in = new Scanner(System.in, "Cp866");

        System.out.println("Введите фамилию задачи");
        addInfo = addInfo + in.nextLine() + ";";

        System.out.println("Введте дату в формате дд-мм-гггг");
        addInfo = addInfo + in.nextLine() + ";";

        System.out.println("О задаче");
        addInfo = addInfo + in.nextLine() + ";";

        System.out.println("Введите приоритет задачи (1 - низкий, 2 - средний, 3 - высокий)");
        addInfo = addInfo + in.nextLine();

        return addInfo;
    }

    public int maxID() throws IOException {
        PrintTask printTask = new PrintTask();
        ArrayList<String[]> taskShare = printTask.taskShare(printTask.taskArrayList());
        String[] temp0 = taskShare.get(0);
        maxID = Integer.parseInt(temp0[0]);
        for (int i = 0; i < taskShare.size(); i++) {
            String[] temp = taskShare.get(i);

            if (Integer.parseInt(temp[0]) > maxID) {
                maxID = Integer.parseInt(temp[0]);
            }
        }
        return maxID;
    }

}
