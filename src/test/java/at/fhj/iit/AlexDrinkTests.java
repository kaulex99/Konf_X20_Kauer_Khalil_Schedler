package at.fhj.iit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Alexander Kauer
 * @version 1.0
 * @since 2021-04-15
 * @see AlexDrink
 */
public class AlexDrinkTests {

    private static AlexDrink drink;

    @BeforeAll
    static void setUp(){
        Liquid l = new Liquid("", 12.2, 20);
        drink = new AlexDrink("Alex's special drink", l);
    }

    @Test
    @DisplayName("Verify all properties of drink")
    public void checkValues() {
        assertEquals(12.2, drink.getVolume());
        assertEquals(40, drink.getAlcoholPercent());
    }

    @AfterAll
    static void tearDown() {
        drink = null;
    }
}
