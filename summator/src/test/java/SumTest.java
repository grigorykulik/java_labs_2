import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {

    Summator s=new Summator();

    @Test
    public void givenTwoPositiveIntegersReturnsTheirSum () {
        int x=20;
        int y=15;

        assertEquals(s.summ(20, 15), 35);
    }

    @Test
    public void givenPositiveAndNegativeNumberReturnsTheirSum() {
        int x=-1;
        int y=5;

        assertEquals(s.summ(x, y), 4);
    }

    @Test
    public void givenIntegerMaxValueAndAnyOtherNumberReturnsZero() {
        int x=Integer.MAX_VALUE;
        int y=1;

        Exception e=assertThrows(ArithmeticException.class, () ->{
            s.summ(x, y);
        });

        String expectedMessage="integer overflow";
        String actualMessage=e.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }
}
