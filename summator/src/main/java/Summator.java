/**
 * Дан интерфейс. Имплементируйте. Напишите junit-тесты. Один из тестов должен проверять сумму Integer.MAX_VALUE + 1
 */

import java.util.logging.Logger;

public class Summator implements Calculator {
    public static void main(String[] args) {

    }

    public int summ(int x, int y) {
        try {
            return Math.addExact(x, y);
        }

        catch (ArithmeticException e) {
            Logger.getGlobal().info("Integer overflow");
            return 0;
        }
    }
}
