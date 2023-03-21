public class app {
//Изменим код в методе main(),чтобы создать экземпляр Innerapp с объектом нашего нового класса MyClass.
    public static void main(String[] args) {
        IInterface newClass = new MyClass();
        Innerapp innerapp = new Innerapp(newClass);
        innerapp.write();
    }
}
interface IInterface {
    void print();
}

class Innerapp {
    IInterface v;

    public Innerapp(IInterface v) {
        this.v = v;
    }

    void write() {
        v.print();
    }

}
//    Для того, чтобы заставить этот код работать, мы можем предположить, что у нас есть класс,
//    который реализует интерфейс IInterface.
//        Давайте создадим новый класс с именем MyClass, который реализует метод print().
class MyClass implements IInterface {

    @Override
    public void print() {
        System.out.println("Работает!");
    }
}