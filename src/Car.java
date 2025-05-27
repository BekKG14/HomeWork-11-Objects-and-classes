public class Car {

    private String name;
    private int year;
    private String color;
    public Car(String name, int year, String color){
        this.name = name;
        this.year = year;
        this.color = color;
    }
    //Сеттеры
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //Геттеры
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public String getColor() {
        return color;
    }

    public String toString() {
        return "Car{" + "name='" + name + '\'' + ", year=" + year + ", color='" + color + '\'' + '}';
    }
    public static void main(String[] args){
        Car myCar = new Car("BMW", 2025, "Black");
        System.out.println("Это моя машына: "+ myCar.getName() + ", " + myCar.getYear() + " года выпуска. Цвет " + myCar.getColor());
        System.out.println("Это моя малыха: " + myCar.toString());
}
