
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> lst = new ArrayList<>();
        int size = 13;
        for (int i = 0; i < size; i++) {
            int array = rand.nextInt(99);
            lst.add(array);
        }
        System.out.println("Задан список ArrayList: "+lst);

        int min_n = Collections.min(lst);
        int max_n = Collections.max(lst);
        int sum_list = lst.stream().mapToInt(Integer::intValue).sum();
        int average = sum_list / size;
        System.out.printf("Минимальное число в списке: %d,\nМаксимальное число в списке: %d," +
                "\nСреднее арифметическое в списке %d", min_n, max_n, average);
    }
}