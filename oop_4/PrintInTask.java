import java.util.ArrayList;

public class PrintInTask {
    private final ArrayList<String[]> taskShare;

    public PrintInTask(ArrayList<String[]> taskShare) {
        this.taskShare = taskShare;
    }

    public void printTask(int prioritet) {

        for (String[] element : taskShare) {
            if (prioritet == 1 && element[5].equals("1")) {
                for (int i = 0; i < element.length; i++) {
                    System.out.print(element[i] + " ");
                }
                System.out.print("\n");
            } else if (prioritet == 2 && element[5].equals("2")) {
                for (int i = 0; i < element.length; i++) {
                    System.out.print(element[i] + " ");
                }
                System.out.print("\n");
            } else if (prioritet == 3 && element[5].equals("3")) {
                for (int i = 0; i < element.length; i++) {
                    System.out.print(element[i] + " ");
                }
                System.out.print("\n");
            }
        }

    }

}