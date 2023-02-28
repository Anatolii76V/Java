//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.






import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notebook Hp250 = new Notebook("HP", "Black", "Windous", 15.6, 8, "256", "SSD");
        Notebook Hp300 = new Notebook("HP", "silver", "Linux", 15.6, 16, "512", "SSD");
        Notebook SamsungPN180 = new Notebook("Samsung", "Black", "Windous", 15.6, 8, "512", "SSD");
        Notebook SamsungH200 = new Notebook("Samsung", "Blue", "Windous", 17.0, 16, "1024", "SSD");
        Notebook MSI123G = new Notebook("MSI", "Red", "Windous", 15.6, 32, "2048", "SSD");
        Notebook MSI100G = new Notebook("MSI", "Black", "Linux", 15.6, 16, "2048", "SSD");
        Notebook Asus500 = new Notebook("ASUS", "Silver", "Windous", 15.6, 16, "1024", "SSD");
        Notebook Asus550 = new Notebook("ASUS", "Silver", "Linux", 15.6, 16, "512", "SSD");

        List<Notebook> notebookList = List.of(Hp250, Hp300, SamsungPN180, SamsungH200, MSI123G, MSI100G, Asus500, Asus550);

        System.out.println("Выберите параметр для поиска:\n" +
                "1 - по цвету: Black , Blue , Red , Silver\n" +
                "2 - по бренду: HP , Samsung , MSI , ASUS\n" +
                "3 - по операционной системе: Windous , Linux\n" +
                "4 - по объему ЖД: 256 , 512 , 1024 , 2048\n");
        Scanner in = new Scanner(System.in);
        int choiceUser = in.nextInt();
        if (choiceUser == 1) System.out.println("Какой цвет: ");
        if (choiceUser == 2) System.out.println("Какой бренд: ");
        if (choiceUser == 3) System.out.println("Какая операционная система: ");
        if (choiceUser == 4) System.out.println("Какой объём ЖД: ");
        Scanner sc = new Scanner(System.in);
        String UserSearch = sc.nextLine();

        if (choiceUser == 1) {
            System.out.println("Выбор по цвету: ");
            for (Notebook color : notebookList) {
                if (UserSearch.equalsIgnoreCase(color.getColor())) {
                    System.out.println(color.printInfo());
                }
            }


        } else if (choiceUser == 2) {
            System.out.println("Выбор по бренду: ");
            for (Notebook brand : notebookList) {
                if (UserSearch.equalsIgnoreCase(brand.getBrand())) {
                    System.out.println(brand.printInfo());
                }
            }
        } else if (choiceUser == 3) {
            System.out.println("Выбор по Операционной системе: ");
            for (Notebook OS : notebookList) {
                if (UserSearch.equalsIgnoreCase(OS.getOS())) {
                    System.out.println(OS.printInfo());
                }
            }
        } else if (choiceUser == 4) {
            System.out.println("Выбор по объёму ЖД: ");
            for (Notebook hard : notebookList) {
                if (UserSearch.equalsIgnoreCase(hard.getHard())) {
                    System.out.println(hard.printInfo());
                }
            }
        } else {
            System.out.println("Ошибка ввода.");
        }
        in.close();

    }


}
