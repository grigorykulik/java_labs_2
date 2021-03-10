public class Main {
    public static void main(String[] args) {
        Spaceship s1=new Spaceship(Integer.MAX_VALUE);
        Spaceship s2=new Spaceship(200);
        Spaceship s3=new Spaceship(300);

        int t=calculateTotalSpeed(s1, s2, s3);
        System.out.println(t);
        System.out.println(calculateAverageSpeed(t));
    }

    public static int calculateTotalSpeed(Spaceship s1, Spaceship s2, Spaceship s3) {
        int totalSpeed=0;

        if (s1.getSpeed()<0 || s2.getSpeed()<0 || s3.getSpeed()<0) {
            System.out.println("Speed cannot be negative");
            return 0;
        }

        else {
            try {
                totalSpeed=Math.addExact(totalSpeed, s1.getSpeed());
                totalSpeed=Math.addExact(totalSpeed, s2.getSpeed());
                totalSpeed=Math.addExact(totalSpeed, s3.getSpeed());
            }

            catch (ArithmeticException e) {
                System.out.println("Integer overflow");
                totalSpeed=0;
            }

        }

        return totalSpeed;
    }

    public static double calculateAverageSpeed(int totalSpeed) {
        return totalSpeed/3;
    }
}
