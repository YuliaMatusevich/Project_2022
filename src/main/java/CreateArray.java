import java.util.Arrays;

public class CreateArray {

    //В голубой папке java создать класс CreateArray,
    // написать в этом классе метод createIntArray(), который принимает на вход 5 целых чисел,
    // и возвращает массив из этих же чисел.
    //Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}

    public int[] createIntArray(int a, int b, int c, int d, int e){
        int [] array = {a,b,c,d,e};

        return array;
    }


    //Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double,
    // и возвращает массив из этих же чисел
    //Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}

    public double[] createDoubleArray(double a, double b, double c, double d, double e){
        double [] array = {a,b,c,d,e};

        return array;
    }

    //Написать метод createStringArray(), который принимает на вход 5 слов,
    // и возвращает массив из этих слов
    //Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}

    public String[] createStringArray(String a, String b, String c, String d, String e){
        String [] array = {a,b,c,d,e};

        return array;
    }

// В классе CreateArray написать метод multiplesOf(), который принимает на вход
// целое положительные число number в пределах от 1 включительно до 10 включительно,
// и возвращает таблицу умножения на это число в виде массива
//Например, multiplesOf(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

    public int[] multiplesOf(int number){
        int[] array = new int [11];
        if(number > 0 && number <= Integer.MAX_VALUE / 10){
            for (int i = 0; i <= 10; i++){
                array[i] = i * number;
            }
            return array;
        }
           return new int[0];
    }





}
