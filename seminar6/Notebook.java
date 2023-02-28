
public class Notebook {
    private final String brand;
    private final String color;
    private final String OS;
    private final double screenSize;
    private final int ram;
    private final String hard;
    private final String typeDisk;


    public Notebook(String brand, String color,String OS, double screenSize, int ram, String hard, String typeDisk) {
        this.brand = brand;
        this.color = color;
        this.OS = OS;
        this.screenSize = screenSize;
        this.ram = ram;
        this.hard = hard;
        this.typeDisk = typeDisk;
    }
    public String printInfo(){
        System.out.printf("Brand: %s, Color: %s, OS: %s, ScreenSize: %s, RAM: %s, HARD: %s,  TypeDisk: %s",
                brand, color, OS, screenSize, ram, hard, typeDisk);
        return ".";
    }
    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
    public String getOS() {
        return OS;
    }
    public String getHard() {
        return hard;
    }

}
