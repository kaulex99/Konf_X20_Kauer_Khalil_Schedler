package at.fhj.iit;

public class AlexDrink extends FabiDrink {
    AlexDrink(String name, Liquid mainLiquid) {
        super(name, mainLiquid);
    }

    @Override
    public double getAlcoholPercent() {
        return Math.max(40,super.getAlcoholPercent());
    }

    @Override
    public String toString() {
        return name + " has " + getAlcoholPercent() + "%";
    }
}
