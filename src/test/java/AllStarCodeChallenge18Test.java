import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllStarCodeChallenge18Test {

    @Test
    public void testSomething() {
        assertEquals(1, AllStarCodeChallenge18.strCount("Hello", 'o'));
        assertEquals(2, AllStarCodeChallenge18.strCount("Hello", 'l'));
        assertEquals(0, AllStarCodeChallenge18.strCount("", 'z'));
    }

}
