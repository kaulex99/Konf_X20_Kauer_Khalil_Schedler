package at.fhj.iit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Alexander Kauer
 * @version 1.0
 * @see AlexDrink
 */
public class AlexDrinkTests {

    private AlexDrink drink;

    @BeforeEach
    void setUp(){
        Liquid l = new Liquid("", 12.2, 20);
        drink = new AlexDrink("Alex's special drink", l);
    }

    @Test
    @DisplayName("Verify all properties of drink")
    void checkValues() {
        assertEquals(12.2, drink.getVolume());
        assertEquals(40, drink.getAlcoholPercent());
    }

    @Test
    @DisplayName("Check toString formatting")
    void checkToString(){
        assertEquals("Alex's special drink has 40.0%", drink.toString());
    }

    @Test
    @DisplayName("Check if it is alcoholic")
    void checkIfAlcoholic(){
        assertTrue(drink.isAlcoholic());
    }

    @AfterEach
    void tearDown() {
        drink = null;
        //add other teardown logic if necessary
    }
}
