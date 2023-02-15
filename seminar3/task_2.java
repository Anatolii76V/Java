// Дан произвольный список целых чисел. Удалить из него чётные числа.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 13;
        List<Integer> lst = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            lst.add(random.nextInt(99));
        }
        System.out.println("Произвольный список: " + lst);

        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) % 2 == 0) {
                lst.remove(lst.get(i));
                i--;
            }
        }

        System.out.println("Чётные числа удалены: " + lst);
    }
}