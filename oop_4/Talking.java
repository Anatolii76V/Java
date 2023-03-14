public class Talking {
    public void firstQuestion() {
        System.out.println("Что вы хотите сделать?\n"
                + "1. Распечатать задачи\n"
                + "2. Вывести на экран задачи по уровню приоритета\n"
                + "3. Добавить задачу");

    }

    public void choisTask() {
        System.out.println("Выберите, задачу какого приоритера вы хотите вывести на экран:\n"
                + "1 - низкий; 2 - средний; 3 - высокий");
    }
}
