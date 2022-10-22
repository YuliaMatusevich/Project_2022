import java.util.Arrays;

public class MinMaxAve {

    //Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
    // Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
    // и среднее среди всех значений между 2-мя индексами.

    public int[] minMavAve(int[] array, int a, int b) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        if (array != null && array.length > 0 && a >= 0 && b > 0 && a < b && b < array.length ) {
            for (int i = a; i <= b; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }
            int sum = 0;
                for (int i = a; i <= b; i++) {
                    sum = sum + array[i];
                }
                int ave = sum / ((b - a) + 1);
            int[] newArray = {min, max, ave};

            return newArray;
        }
        return new int[0];
    }
}
