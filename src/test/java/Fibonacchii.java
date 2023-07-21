import java.math.BigDecimal;
import java.math.RoundingMode;

public class Fibonacchii {

    public static void main(String[] args) {
        int n = 10;
        BigDecimal fibonacciNumber = fibonacciBinet(n);
        System.out.println("Число Фибоначчи для n = " + n + ": " + fibonacciNumber);
    }

    public static BigDecimal fibonacciBinet(int n) {
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2; // Золотое сечение
        double psi = (1 - sqrt5) / 2; // Обратное золотое сечение

        BigDecimal fibN = BigDecimal.valueOf((Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5);
        return fibN.setScale(0, RoundingMode.HALF_UP);
    }
}
