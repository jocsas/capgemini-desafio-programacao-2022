import com.capgemini.ChallengeOne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChallengeOneTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void buildStair() {
        assertEquals(String.valueOf(ChallengeOne.buildStair(6)), """       
                                                                         *
                                                                        **
                                                                       ***
                                                                      ****
                                                                     *****
                                                                    ******""");
    }
}