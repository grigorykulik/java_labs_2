import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MinTest {

    @Test
    public void shouldReturnMinInteger() {
        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        int actualResult=Main.getGenericMin(list, 0, 2);

        assertEquals(actualResult, 1);
    }

    @Test
    public void shouldReturnMinDouble() {
        List<Double> list=new ArrayList<>();

        list.add(1000.25);
        list.add(180.0);
        list.add(4.0);

        double actualResult=Main.getGenericMin(list, 0, 2);

        assertEquals(actualResult, 180.0);
    }

    @Test
    public void shouldThrowExceptionWhenGivenEmptyList() {
        List<Float> list=new ArrayList<>();

        Exception e=assertThrows(IllegalArgumentException.class, ()->{
            Main.getGenericMin(list,0, 5);
        });

        String expectedMessage = "Either array is null or empty or indices are out of bounds";
        assertTrue(e.getMessage().contains(expectedMessage));

    }

    @Test
    public void shouldThrowExceptionWhenGivenNullArray() {
        List<String> list=null;

        Exception e=assertThrows(IllegalArgumentException.class, ()->{
            Main.getGenericMin(list,0, 2);
        });

        String expectedMessage = "Either array is null or empty or indices are out of bounds";
        assertTrue(e.getMessage().contains(expectedMessage));
    }

    @Test
    public void shouldThrowExceptionWhenGivenIllegalIndices() {
        List<Integer> list=new ArrayList<>();

        list.add(99);
        list.add(33);
        list.add(5);

        Exception e1=assertThrows(IndexOutOfBoundsException.class, ()-> {
            Main.getGenericMin(list, -1, 1);
        });
        assertTrue(e1.getMessage().contains("Illegal indices have been passed as arguments."));

        Exception e2=assertThrows(IndexOutOfBoundsException.class, ()-> {
            Main.getGenericMin(list, 1, 3);
        });
        assertTrue(e2.getMessage().contains("Illegal indices have been passed as arguments."));

    }

    @Test
    public void shouldReturnTheCorrectValueIfBothIndicesAreEqual() {
        List<Double> list=new ArrayList<>();

        list.add(11.0);
        list.add(12.0);
        list.add(13.0);

        Double actualResult=Main.getGenericMin(list, 0, 0);
        assertEquals(actualResult, 11.0);
    }
}
