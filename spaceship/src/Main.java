import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Spaceship s1=new Spaceship(Integer.MAX_VALUE);
        Spaceship s2=new Spaceship(200);
        Spaceship s3=new Spaceship(300);

        long t;
        try {
            t=calculateTotalSpeed(s1, s2, s3);
            System.out.println("Average speed:" + calculateAverageSpeed(t));
        } catch (NegativeSpeedException nse) {
            Logger.getGlobal().info(nse.getMessage());
        }

        int minSpeed=getMinimumSpeed(s1, s2, s3);
        System.out.println(minSpeed);
    }

    public static long calculateTotalSpeed(Spaceship s1, Spaceship s2, Spaceship s3) throws NegativeSpeedException {
        long totalSpeed=0;

        if (s1.getSpeed()<0 || s2.getSpeed()<0 || s3.getSpeed()<0) {
            throw new NegativeSpeedException();
        }

        else {
            totalSpeed+=s1.getSpeed();
            totalSpeed+=s2.getSpeed();
            totalSpeed+=s3.getSpeed();
            }

        return totalSpeed;
    }

    public static double calculateAverageSpeed(long totalSpeed) {
        return totalSpeed/3;
    }

    public static int getMinimumSpeed(Spaceship s1, Spaceship s2, Spaceship s3) {
        int min=s1.getSpeed();

        if (s2.getSpeed()<s1.getSpeed()) min=s2.getSpeed();
        if (s3.getSpeed()<s2.getSpeed()) min=s2.getSpeed();

        return min;
    }
}
