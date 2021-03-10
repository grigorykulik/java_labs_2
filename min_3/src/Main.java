public class Main {
    public static void main(String[] args) {
        System.out.println(min3(1, 2, 3));
        System.out.println(min3(2, 1, 3));
        System.out.println(min3(3, 2, 1));
        System.out.println(min3(-1, -2, -3));
    }

    public static int min3(int a, int b, int c) {
        int min=a;

        if (b<a) min=b;
        if (c<b) min=c;

        return min;
    }
}
