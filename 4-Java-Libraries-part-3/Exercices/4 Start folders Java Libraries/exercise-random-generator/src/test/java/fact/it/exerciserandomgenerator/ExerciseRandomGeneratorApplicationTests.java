package fact.it.exerciserandomgenerator;

import fact.it.exerciserandomgenerator.model.RandomGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ExerciseRandomGeneratorApplicationTests {

    @Test
    public void testConstructorWithoutParametersAndGetters(){
        RandomGenerator r = new RandomGenerator();
        assertEquals(1, r.getMinimum());
        assertEquals(5, r.getMaximum());
    }

    @Test
    public void testConstructorWithParametersAndGetters(){
        RandomGenerator r = new RandomGenerator(7, 10);
        assertEquals(7, r.getMinimum());
        assertEquals(10, r.getMaximum());
    }


    @Test
    public void testSetters() {
        RandomGenerator r = new RandomGenerator(7, 10);
        r.setMinimum(12);
        assertEquals(12, r.getMinimum());
        r.setMaximum(75);
        assertEquals(75, r.getMaximum());
    }

    /**
     * Test of getRandom method, of class RandomGenerator.
     */
    @Test
    public void testGetRandom() {
        RandomGenerator r = new RandomGenerator(10, 19);
        for (int i = 0; i < 500; i++) {
            assertTrue(r.getRandom() <= 18);
            assertTrue(r.getRandom()>=10);
        }
    }

}
