import java.util.Date;

/*
 * Class for every flying transport
 * with engine, static wings and interior
 */
public class Airplane extends Transport{

    /*
     * Class constructor with full initialization
     */
    public Airplane(String name, int weight, Date releaseDate) {
        super(name, weight, releaseDate);
    }

    /*
     * Method overrides Transport behavior
     * and changes it to show a flying
     * movement type.
     */
    @Override
    public void move() {
        System.out.println("Move by flying");;
    }
}