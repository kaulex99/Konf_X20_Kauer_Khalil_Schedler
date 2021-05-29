package at.fhj.iit.cashregister;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests CashRegister implementation
 *
 * @author Fabian Schedler, Alexander Kauer, Adam Khalil
 * @see CashRegister
 */
class CashRegisterTest {

    private CashRegister cashRegister;

    @BeforeEach
    void setUp() {
        cashRegister = new CashRegister();
    }

    @Test
    void sell() {
        // TODO @Fabian implement
    }

    @Test
    void getNoneAlcoholicRevenue() {
        // TODO @Fabian implement
    }

    @Test
    void getLowAlcoholicRevenue() {
        // TODO @Adam implement
    }

    @Test
    void getHighAlcoholicRevenue() {
        // TODO @Adam implement
    }

    @Test
    void getDayRevenue() {
        // TODO @Alex implement
    }

    @Test
    void getPersonRevenue() {
        // TODO @Alex implement
    }

    @Test
    void getPersonDayRevenue() {
        // TODO @Alex implement
    }
}