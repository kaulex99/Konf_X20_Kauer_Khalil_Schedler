package at.fhj.iit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests the implementation of AdamsDrink
 *
 * @author Adam Khalil
 * @version 1.0
 * @see AdamsDrink
 */
public class AdamsDrinkTest {

    private AdamsDrink drink;

    /**
     * Instantiates a AdamsDrink for each individual test
     */
    @BeforeEach
    public void setUp() {
        Liquid liquid = new Liquid("beverage", 6, 10);
        drink = new AdamsDrink("drinkName", liquid);
    }

    /**
     * Cleans everything after testing
     */
    @AfterEach
    public void tearDown() {
        drink = null;
        //add other teardown logic if necessary
    }

    /**
     * Checks the alcohol percentage calculation
     */
    @Test
    @DisplayName("Check if the alcohol percentage calculation works correctly")
    public void AlcoholPercent() {
        assertEquals(4, drink.getAlcoholPercent());
    }

    /**
     * Checks the drink name
     */
    @Test
    @DisplayName("Verify that the to string only returns the name")
    public void testToString() {
        assertEquals("drinkName", drink.toString());
    }

    /**
     * Checks the volume calculation
     */
    @Test
    @DisplayName("Check if one gets added to the volume")
    public void getVolume() {
        assertEquals(7, drink.getVolume());
    }

    /**
     * Checks the the isAlcoholic determination
     */
    @Test
    @DisplayName("Check if the drink is alcoholic")
    public void isAlcoholic() {
        assertTrue(drink.isAlcoholic());
    }

    /**
     * Checks the price calculation
     */
    @Test
    @DisplayName("Get price test")
    public void getPriceTest() {
        assertEquals(8.4, drink.getPrice());
    }
}