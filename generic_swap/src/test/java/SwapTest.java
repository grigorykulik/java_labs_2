import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SwapTest {
    @Test
    @DisplayName("Test with Objects with legal indices")
    public void testWithObjectsLegalIndices() {
        Object o1=new Object();
        Object o2=new Object();
        Object o3=new Object();

        ArrayList<Object> al=new ArrayList<>();

        al.add(o1);
        al.add(o2);
        al.add(o3);

        Main.swap(al, 0, 2);

        assertEquals(al.get(0), o3);
        assertEquals(al.get(2), o1);
    }

    @Test
    @DisplayName("Test with illegal indices")
    public void testWithObjectsIllegalIndices() {
        Object o1=new Object();
        Object o2=new Object();
        Object o3=new Object();

        ArrayList<Object> al=new ArrayList<>();

        al.add(o1);
        al.add(o2);
        al.add(o3);

        Main.swap(al, 0, 3);

        assertEquals(al.get(0), o1);
        assertEquals(al.get(2), o3);
    }

}
