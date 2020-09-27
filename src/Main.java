import java.util.Date;

/*
 * Class of entry point for a program
 */
public class Main {

    /*
     * main function. Program entry point
     */
    public static void main(String[] args) {

        Transport car = new Car("Pejo", 1300, new Date(new Date().getTime() - 10000000));
        Transport ship = new Ship("Titanik", 9999999, new Date(new Date().getTime() + 1000000));
        Transport airplane = new Airplane("Airbus", 14000, new Date(new Date().getTime() - 99990000));

        car.move();
        ship.move();
        airplane.move();
    }
}