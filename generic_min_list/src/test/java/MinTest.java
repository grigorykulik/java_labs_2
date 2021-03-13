import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

        list.add(10.25);
        list.add(180.0);
        list.add(4.0);

        double actualResult=Main.getGenericMin(list, 1, 2);

        assertEquals(actualResult, 180.0);
    }

    @Test
    public void shouldReturnNullIfArrayIsEmpty() {
        List<Float> list=new ArrayList<>();

        Float actualResult=Main.getGenericMin(list,0, 5);

        assertEquals(actualResult, null);
    }

    @Test
    public void shouldReturnNullIfArrayIsNull() {
        List<String> list=null;

        String actualResult=Main.getGenericMin(list, 0, 2);

        assertEquals(actualResult, null);
    }

    @Test
    public void shouldReturnNullIfIllegalIndices() {
        List<Integer> list=new ArrayList<>();

        list.add(99);
        list.add(33);
        list.add(5);

        Integer actualResult=Main.getGenericMin(list, -1, 1);
        assertEquals(actualResult, null);

        Integer actualResult2=Main.getGenericMin(list, 1, 3);
        assertEquals(actualResult2, null);
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
