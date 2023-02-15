//Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации с логированием запишем в консоли.
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Logger;


public class task_2 {

    public static void main(String[] args) throws IOException {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Неотссортированный массив " + Arrays.toString(array));
        Logger loger = Logger.getLogger(task_2.class.getName());
        FileHandler fHandler = new FileHandler("Task2_2.txt");
        SimpleFormatter sFormatter = new SimpleFormatter();
        fHandler.setFormatter(sFormatter);
        loger.addHandler(fHandler);
        int temp;
        boolean sorted = false;
        int n = 0;

        while (!sorted) {
            n++;
            sorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
            loger.info(Arrays.toString(array));
            System.out.println(n + " - " + "В процессе сортировки " + Arrays.toString(array));
        }
        System.out.println("Отссортированный массив " + Arrays.toString(array));
    }
}
