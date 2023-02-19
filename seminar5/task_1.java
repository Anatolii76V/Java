//Телефонной книга с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task_1 {
    public static void main(String[] args) {
        Map< String, List<String>> phoneBook = new HashMap<>();
        phoneBook.putIfAbsent ("Иванов", List.of("89055055005","89991112222"));
        phoneBook.putIfAbsent ("Петров", List.of("89105053030","89888855522"));
        phoneBook.putIfAbsent ("Сидоров", List.of("89303216569","89653256598"));
        phoneBook.putIfAbsent ("Федоров", List.of("89600238574","89456123212"));
        phoneBook.putIfAbsent ("Семенов", List.of("89001112233","89136366926"));

        for (Map.Entry< String, List<String>> item:phoneBook.entrySet()) {
            System.out.println("Ключ: "+item.getKey()+"  Значение: "+item.getValue());
        }
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Введите фамилию : ");
        String str = in.nextLine();
        System.out.println("Контакт: "+phoneBook.get(str));

        in.close();
    }

}
