public class Main {
    public static void main(String[] args) {

        Car Ferrari = new Car("Ferrari", "Purosangue", 2023, 5000, 400);
        Truck Volvo = new Truck("Volvo", "FH", 2019, 40000, 1500, 8);

        System.out.println("Ferrari Purosangue Info:");
        Ferrari.printInfo();
        System.out.println();

        System.out.println("Volvo Info:");
        Volvo.printInfo();
    }
}


