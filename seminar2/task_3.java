//В файле содержится строка с данными:
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class task_3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/user/IdeaProjects/seminar2/src/myfale.json"))) {
            String data;
            while ((data = br.readLine()) != null) {
                sb.append(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, String> map = new HashMap<>();
        String sb1 = sb.substring(1, sb.length() - 1);
        String[] keys = sb1.toString().replace("{", "").
                replace("\"", "").
                replaceAll("\\s", "").
                split("},");

        for (String data : keys) {
            String[] person = data.split(",");
            for (String keyValues : person) {
                String[] keyValue = keyValues.replace("}", "").split(":");
                String key = keyValue[0];
                String value = keyValue[1];
                map.put(key, value);
            }
            System.out.printf("Студент %s получил %s по предмету %s.\n", map.get("фамилия"),
                    map.get("оценка"), map.get("предмет"));
        }
    }
}
