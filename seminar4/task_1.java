//Дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 13; i++) {
            arr.add(random.nextInt(99));
        }
        System.out.println("Рандомный список: " +arr);
        Collections.reverse(arr);
        System.out.println("Перевернутый список:  " + arr);
    }

}