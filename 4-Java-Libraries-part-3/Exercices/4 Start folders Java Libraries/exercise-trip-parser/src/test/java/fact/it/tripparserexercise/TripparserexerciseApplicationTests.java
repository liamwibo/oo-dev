package fact.it.tripparserexercise;

import fact.it.tripparserexercise.model.TripParser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TripparserexerciseApplicationTests {

    @Test
    void testParsingCitiesAndDistance() {
        TripParser trip = new TripParser("Brussels-Stockholm-1280.4");

        assertEquals("Brussels", trip.getStartCity());
        assertEquals("Stockholm", trip.getEndCity());
        assertEquals(1280.4, trip.getDistance(), 0.01);
    }

    @Test
    void testCalculateFlightTime() {
        // 450km at 900km/h = 0.5 hours -> Rounds up to 1
        TripParser shortTrip = new TripParser("A-B-450.0");
        assertEquals(1, shortTrip.calculateFlightTime());

        // 901km at 900km/h = 1.001 hours -> Rounds up to 2
        TripParser longTrip = new TripParser("A-B-901.0");
        assertEquals(2, longTrip.calculateFlightTime());
    }

    @Test
    void testGenerateTripCodeFormat() {
        TripParser trip = new TripParser("London-Paris-344");
        String code = trip.generateTripCode();

        // Code should be 6 characters long (LO + 3 digits + S)
        assertEquals(6, code.length());

        // Check start (LO)
        assertTrue(code.startsWith("LO"));

        // Check end (S)
        assertTrue(code.endsWith("S"));
    }

}
