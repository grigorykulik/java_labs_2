import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

    }

    public static <T extends Comparable> T getGenericMin(List<T> list, int a, int b) {

        T min;

        // Be consistent and return nulls or throw an exception?
        if (list==null || list.isEmpty()) return null;
        else {
            try {
                    min=list.get(a);

                    for (int i=a+1; i<b; i++) {
                        if (min.compareTo(list.get(b))>0) min=list.get(i);
                    }
            }

            catch (IndexOutOfBoundsException e) {
                Logger.getGlobal().info("Illegal indices passed as arguments");

                // I know this is a bad practice to return nulls but I haven't come up with an appropriate
                // solution so far
                return null;
            }
        }

        return min;
    }
}
