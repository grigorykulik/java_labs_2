import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

    }

    public static <T extends Comparable> T getGenericMin(List<T> list, int a, int b) throws IllegalArgumentException,
            ArrayIndexOutOfBoundsException {

        T min;

        // Be consistent and return nulls or throw an exception?
        if (list==null || list.isEmpty()) {
            throw new IllegalArgumentException("Either array is null or empty or indices are out of bounds");
        } else if (a<0 || a>=list.size() || b<0 || b>=list.size()) {
                throw new ArrayIndexOutOfBoundsException("Illegal indices have been passed as arguments.");
            } else {
                min=list.get(a);

                for (int i=a; i<b; i++) {
                    if (min.compareTo(list.get(i))>0) {
                        min=list.get(i);
                    }
                }
            }

        return min;
    }
}
