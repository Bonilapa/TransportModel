import java.util.Date;

/*
 * Class for every water transport
 * with a square-rigged craft with
 * at least three masts
 */
public class Ship extends Transport{

    /*
     * Class constructor with full initialization
     */
    public Ship(String name, int weight, Date releaseDate) {
        super(name, weight, releaseDate);
    }

    /*
     * Method overrides Transport behavior
     * and changes it to show a swimming
     * movement type.
     */
    @Override
    public void move() {
        System.out.println("Move by swimming");;
    }
}