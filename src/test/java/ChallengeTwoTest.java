import com.capgemini.ChallengeTwo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChallengeTwoTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testIfIsValidPassword() {
        assertEquals(ChallengeTwo.isValid("Ya3"), false);
    }
}