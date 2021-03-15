public class Main {

    public static void main(String[] args) {
        int[] array={1, 2, 3, 4};
        boolean s;

        System.out.println("Initial array: ");
        for (int i:array) {
            System.out.print(i+" ");
        }

        s=swap(0, 3, array);

        System.out.println("\nSwap successful: "+s);
        System.out.println("Modified array: ");
        for (int i:array) {
            System.out.print(i+" ");
        }

        s=swap(0, 5, array);
        System.out.println("\nSwap successful: "+s);
        System.out.println("Modified array: ");
        for (int i:array) {
            System.out.print(i+" ");
        }
    }

    public static boolean swap (int i, int j, int[] array) {
        boolean success = false;
        int temp = 0;

        try {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            success=true;
            return success;
        } catch (ArrayIndexOutOfBoundsException e) {
            return success;
        }
    }

}

