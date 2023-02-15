//В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder.
// Значения null не включаются в запрос.

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;



public class task_1 {
    public static void main(String[] args) {
        createSqlRequest(getSubString(getStrInFile("myFile.txt")));
    }
    static String getStrInFile(String myFile) {
        String str = "";
        File fo = new File("/home/user/ myFile.txt");
        try {
            FileInputStream isO = new FileInputStream(fo);
            int i = -1;
            while ((i = isO.read()) != -1) {
                str += (char) i;
            }
            System.out.println("Данные из файла: " + str);
            return str;
        } catch (IOException ex) {
            System.out.println("Нет файла: ");
        }
        return myFile;
    }
    static String[] getSubString(String str) {
        String str1 = str.substring(1, str.length() - 1).replace("\\", "");
        String[] array = str1.split(", ");
        ArrayList<String> keyValue = new ArrayList<>();
        for (String arr : array) {
            String[] lst = arr.split(":");
            if (!arr.contains("null")) {
                keyValue.add(lst[0]);
                keyValue.add(lst[1]);
            }
        }
        String[] arrays = keyValue.toArray(new String[0]);
        return arrays;
    }
    static void createSqlRequest (String[]val){
        int z = val.length;
        StringBuilder requestSQL = new StringBuilder();
        requestSQL.append("SELECT * FROM students WHERE ");
        int count = 0;
        for (int i = 0; i < z - 2; i += 2) {
            requestSQL.append(val[i], 1, val[i].length() - 1).append(" = ").append(val[i + 1]).append(" AND ");
            count += 2;
        }
        requestSQL.append(val[count], 1, val[count].length() - 1).append(" = ").append(val[count + 1]).append(";");
        System.out.println("SQL-запрос: " + requestSQL);
    }
}

