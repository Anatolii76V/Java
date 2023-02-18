//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> array = new LinkedList<>();
        for (int i = 0; i < 11; i++) {
            array.add((int) (Math.random() * 99));
        }
        int element = (int) ((Math.random() * 99));
        System.out.printf("Рандомный список: %s \n", array);
        System.out.printf("Добавление элемента в конец списка: %s \n", enqueue(array, +element));
        System.out.println("Добавляемый элемент " + element);
        System.out.printf("Первый элемент списка: %s \n", dequeue(array));
        System.out.printf("Список без первого элемента : %s \n", array);
        System.out.printf("Первый элемент списка: %s \n", first(array));
    }

    public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int element) {
        list.addLast(element); // Метод добавляет элемент в конец списка

        return list;
    }
    public static int dequeue(LinkedList<Integer> list) {
        int n = list.getFirst(); // Метод получает первый элемент
        list.removeFirst(); // Метод удаляет первый элемент из начала списка
        return n;
    }
    public static int first(LinkedList<Integer> list) {
        return list.getFirst(); // Метод получает первый элемент
    }
}