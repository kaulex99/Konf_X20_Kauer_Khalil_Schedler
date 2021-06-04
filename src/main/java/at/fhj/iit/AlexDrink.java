package at.fhj.iit;

/**
 * A special version of FabiDrink with a minimum of 40% alc.
 *
 * @author Alexander Kauer
 * @version 1.0
 */
public class AlexDrink extends FabiDrink {

    /**
     * Initialize an AlexDrink
     *
     * @param name       Name of the drink
     * @param mainLiquid Main type of liquid
     */
    public AlexDrink(String name, Liquid mainLiquid) {
        super(name, mainLiquid);
    }

    /**
     * Calculates the alcohol percentage
     *
     * @return the current amount of alcohol in % (min. 40%)
     */
    @Override
    public double getAlcoholPercent() {
        return Math.max(40, super.getAlcoholPercent());
    }

    /**
     * Checks if the drink is alcoholic - always true
     *
     * @return as the drink has always min 40% of alcohol - it is alcoholic
     */
    @Override
    public boolean isAlcoholic() {
        return true;
    }

    /**
     * Creates a string with all necessary information
     *
     * @return formatted String with all necessary information
     */
    @Override
    public String toString() {
        return name + " has " + getAlcoholPercent() + "%";
    }

    /**
     * Calculates the price of this drink
     *
     * @return the price of this drink
     */
    @Override
    public double getPrice() {
        return 5.3;
    }
}
