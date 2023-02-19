import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class task_2 {
    public static void main(String[] args) {
        String[] listWorkers = {"Иван", "Петр", "Антон", "Федор",  "Иван", "Василий", "Федор", "Антон",
                "Иван","Федор", "Антон", "Василий", "Федор", "Иван", "Петр", "Антон", "Федор", "Сергей",
                "Василий","Антон", "Сергей","Федор", "Петр"};
        HashMap<String, Integer> workers = new HashMap<>();
        for (String i : listWorkers) {
            int newValue = workers.getOrDefault(i, 0) + 1;
            workers.put(i, newValue);
        }
        System.out.println("Подсчет повторений: "+workers);

        Map<String, Integer> sortList = workers.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));
        System.out.println("Отсортированные по убыванию: "+sortList);
    }
}