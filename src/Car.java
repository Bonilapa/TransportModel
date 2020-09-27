import java.util.Date;

/*
 * Class for every land transport
 * with engine, interior and more
 * than 2 wheels
 */
public class Car extends Transport{

    /*
     * Class constructor with full initialization
     */
    public Car(String name, int weight, Date releaseDate) {
        super(name, weight, releaseDate);
    }
}