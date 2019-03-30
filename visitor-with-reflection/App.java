public class App {
    public static void main(String[] args) {
        CarCollection cars = new CarCollection();

        cars.attach(new Ferrari("black"));
        cars.attach(new Ferrari("white"));
        cars.attach(new Ferrari("black"));

        cars.attach(new Maserati("black"));
        cars.attach(new Maserati("black"));
        cars.attach(new Maserati("white"));

        cars.print();

        System.out.println("-----Apply RedFerrariVisitor ------");
        cars.accept(new RedFerrariVisitor());
        cars.print();

        System.out.println("-----Apply AllCarVisitor ------");
        cars.accept(new AllCarVisitor());
        cars.print();

    }
    
}