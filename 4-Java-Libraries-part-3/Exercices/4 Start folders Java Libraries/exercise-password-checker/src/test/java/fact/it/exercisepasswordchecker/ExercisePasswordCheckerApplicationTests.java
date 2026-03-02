package fact.it.exercisepasswordchecker;
import org.junit.jupiter.api.Test;

public class ExercisePasswordCheckerApplicationTests {
    @Test
    void testEncrypt() {
        PasswordChecker pc = new PasswordChecker();
        pc.setPassword("Aeroplane");
        // Expecting: A->@, e->3, r->r, o->0, p->p, l->l, a->@, n->n, e->3
        assertEquals("pl@n3@3r0", pc.encrypt());

        pc.setPassword("Password");
        // Expecting: I->1, i->1, o->0
        assertEquals("w0rdP@ss", pc.encrypt());
    }

    @Test
    void testCountUppercase() {
        PasswordChecker pc = new PasswordChecker();
        pc.setPassword("Hello World");
        assertEquals(2, pc.countUppercase()); // H and W

        pc.setPassword("java");
        assertEquals(0, pc.countUppercase());

        pc.setPassword("JAVA");
        assertEquals(4, pc.countUppercase());
    }

    @Test
    void testCheckSafety() {
        PasswordChecker pc = new PasswordChecker();

        // Case 1: Too short, has digit -> Unsafe
        pc.setPassword("Pass1");
        assertEquals("Unsafe", pc.checkSafety());

        // Case 2: Long enough, no digit -> Unsafe
        pc.setPassword("Password");
        assertEquals("Unsafe", pc.checkSafety());

        // Case 3: Long enough and has digit no special character -> Unsafe
        pc.setPassword("P@ssword123");
        assertEquals("Unsafe", pc.checkSafety());

        // Case 4: Long enough and has digit and special character -> Safe
        pc.setPassword("P@ssword123");
        assertEquals("Safe", pc.checkSafety());
    }

    @Test
    void testGettersAndSetters() {
        PasswordChecker pc = new PasswordChecker();
        pc.setPassword("Test");
        assertEquals("Test", pc.getPassword());
    }
}
