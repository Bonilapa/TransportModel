import java.util.Date;

/*
 * Base class for every transport
 * created by human hands
 */
public class Transport implements Movable {

    protected String name;
    protected int weight;
    protected Date releaseDate;

    /*
     * Disabled class constructor
     * to prevent empty initialization.
     */
    private Transport(){}

    /*
     * Class constructor with full initialization.
     */
    public Transport(String name, int weight, Date releaseDate) {
        this.name = name;
        this.weight = weight;
        this.releaseDate = releaseDate;
    }

    /*
     * Name getter
     */
    public String getName() {
        return name;
    }

    /*
     * Name setter
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * Weight getter
     */
    public int getWeight() {
        return weight;
    }

    /*
     * Weight setter
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    /*
     * Release date getter
     */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /*
     * Release date setter
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /*
     * Method implements Movable behavior
     * and sets it to show a movement type
     * with default value.
     */
    @Override
    public void move() {
        System.out.println("Base kind of move");
    }
}