import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintTask {

    ArrayList<String> task = new ArrayList<>();
    ArrayList<String[]> taskShare = new ArrayList<>();
    private Scanner file;

    public PrintTask() {

    }

    public ArrayList<String> taskArrayList() throws IOException {
        FileReader inFile = new FileReader("/home/user/ myFile.txt");
        file = new Scanner(inFile);

        while (file.hasNextLine()) {
            String line = file.nextLine();
            task.add(line);
        }

        return task;

    }

    public ArrayList<String[]> taskShare(ArrayList<String> task) {
        for (String element : task) {

            String[] lineTemp = element.split(";");
            taskShare.add(lineTemp);

        }
        return taskShare;
    }

    public void printTask(ArrayList<String[]> planerSplite) {
        for (String[] element : planerSplite) {

            for (int i = 0; i < element.length; i++) {
                System.out.print(element[i] + " ");
            }
            System.out.print("\n");
        }
    }
}
