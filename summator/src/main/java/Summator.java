/**
 * Дан интерфейс. Имплементируйте. Напишите junit-тесты. Один из тестов должен проверять сумму Integer.MAX_VALUE + 1
 */

import java.util.logging.Logger;

public class Summator implements Calculator {
    public static void main(String[] args) {

    }

    public int summ  (int x, int y) throws ArithmeticException {
            return Math.addExact(x, y);
        }
}
