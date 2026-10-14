

/**
 * @author Mr. Holmer
 * A class representing a shirt, like the kind you wear
 */
public class Shirt {
    private String color;
    private String size;

    /** Constructor for a shirt
     * @param color the colorj of the shirt
     * @param size the size of the shirt
     */
    public Shirt(String color, String size) {
        this.color = color;
        this.size = size;
    }

    /** Get the color of the shirt
     * @return the color of the shirt
     */
    public String getColor() {
        return color;
    }

    /** Get the size of the shirt
     * @return the size of the shirt
     */
    public String getSize() {
        return size;
    }
}