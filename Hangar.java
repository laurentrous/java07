public class Hangar {

    public static void main(String[] args) {
        Car clio = new Car("Clio", 10000);
        System.out.println(clio.doStuff());

        Boat titanic = new Boat("Titanic", 2000);
        System.out.println(titanic.doStuff());
    }
}