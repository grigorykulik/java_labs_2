import java.util.ArrayList;

/**
 * Напишите обобщенный метод для перестановки двух элементов в списке по индексам. Напишите junit-тесты.
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);

        swap(al, 0, 2);

        for (Integer i:al) {
            System.out.println(i);
        }
    }


    public static <T> ArrayList<T>  swap(ArrayList<T> arrayList, int i, int j) {

        try {
            T first=arrayList.get(i);
            T second=arrayList.get(j);

            arrayList.set(i, second);
            arrayList.set(j, first);
        }

        catch (IndexOutOfBoundsException e) {
            System.out.println("Illegal index!");
        }

        return arrayList;
    }
}
