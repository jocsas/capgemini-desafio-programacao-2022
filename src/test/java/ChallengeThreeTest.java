import com.capgemini.ChallengeThree;
import com.capgemini.ChallengeTwo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChallengeThreeTest {
    @BeforeEach
        void setUp(){
    }

    @Test
    void getAnagrams() {
        assertEquals(ChallengeThree.getAnagrams("ovo"), 2);
        assertEquals(ChallengeThree.getAnagrams("ifailuhkqq"), 3);
    }
}
