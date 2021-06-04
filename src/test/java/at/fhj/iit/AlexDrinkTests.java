package at.fhj.iit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests the implementation of AlexDrink
 *
 * @author Alexander Kauer
 * @version 1.0
 * @see AlexDrink
 */
public class AlexDrinkTests {

    private AlexDrink drink;

    /**
     * setup everything for testing AlexDrink
     */
    @BeforeEach
    void setUp() {
        Liquid l = new Liquid("", 12.2, 20);
        drink = new AlexDrink("Alex's special drink", l);
    }

    /**
     * Verify all values
     */
    @Test
    @DisplayName("Verify all properties of drink")
    void checkValues() {
        assertEquals(12.2, drink.getVolume());
        assertEquals(40, drink.getAlcoholPercent());
    }

    /**
     * Check if the toString formatting is correct
     */
    @Test
    @DisplayName("Check toString formatting")
    void checkToString() {
        assertEquals("Alex's special drink has 40.0%", drink.toString());
    }

    /**
     * Check if the drink is alcoholic
     */
    @Test
    @DisplayName("Check if it is alcoholic")
    void checkIfAlcoholic() {
        assertTrue(drink.isAlcoholic());
    }

    /**
     * Check if the price of the drink is calculated correctly
     */
    @Test
    @DisplayName("Testing get price method")
    void getPriceTest() {
        assertEquals(5.3, drink.getPrice());
    }

    /**
     * Clean everything after testing
     */
    @AfterEach
    void tearDown() {
        drink = null;
        //add other teardown logic if necessary
    }
}
