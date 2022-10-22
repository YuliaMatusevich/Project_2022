public class ManipulationsWithArrays {
    //Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
    // Метод возвращает массив тех же чисел, умноженных на number
    //Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}

    public int[] multiplyArrayByNumber(int[] array, int number){
        if(array != null && array.length > 0){
            for(int i = 0; i < array.length; i++){
                if (number == 0){
                    array[i] = 0;

                } else if (array[i] <= Integer.MAX_VALUE / number
                        && array[i] >= Integer.MIN_VALUE / number
                        && number != 0){

                    array[i] = array[i] * number;

                } else {
                    return new int[0];
                }
            } return array;

        } return new int[0];
    }

    //Написать метод toDoubleArray(), который принимает на вход массив целых чисел,
    // и возвращает массив типа double[] из тех же чисел
    //Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}

    public double[] toDoubleArray(int[] array){
        if(array != null && array.length > 0){
            double[] newArray = new double [array.length];
           for(int i = 0; i < array.length; i++){
               newArray[i] = (double) array[i];

            } return newArray;

        } return new double[0];
    }

    //    Написать метод toIntArray(), который принимает на вход массив типа double[],
    //    и возвращает массив типа int[] из тех же чисел
    //Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}

    public int[] toIntArray(double[] array){
        if(array != null && array.length > 0){
            int[] newArray = new int [array.length];
            for(int i = 0; i < array.length; i++){
                newArray[i] = (int) array[i];

            } return newArray;

        } return new int[0];
    }
    //Написать метод toStringArray(), который принимает на вход массив целых чисел,
    // и возвращает массив типа String[] из тех же чисел
    // (желательно не использовать метод .toString(), нужно переводить вручную)
    //Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}

    public String [] toStringArray(int [] array){
        if(array != null && array.length > 0){
            String [] newArray = new String [array.length];
            for(int i = 0; i < array.length; i++){
                newArray[i] = String.valueOf(array[i]);

            } return newArray;

        } return new String[0];

    }

    //Перегрузить метод toStringArray() параметром double[].
    // Этот метод должен возвращать массив типа String[] (желательно не использовать метод .toString(),
    // нужно переводить вручную)
    //Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}

    public String [] toStringArray(double [] array){
        if(array != null && array.length > 0){
            String [] newArray = new String [array.length];
            for(int i = 0; i < array.length; i++){
                newArray[i] = String.valueOf(array[i]);

            } return newArray;

        } return new String[0];

    }

// В классе ManipulationsWithArrays написать метод getTheGreaterHalf(), который принимает массив целых чисел,
// и возвращает  массив из суммарно бОльшей первой или второй половины входящего массива

    public int[] getTheGreaterHalf(int [] array) {
        if (array != null && array.length > 0) {
            if (array.length % 2 == 0) {
                int sum1 = 0;
                int sum2 = 0;
                int middleLength = array.length / 2;
                for (int i = 0; i < middleLength; i++) {
                    sum1 = sum1 + array[i];
                }
                for (int i = middleLength; i < array.length; i++) {
                    sum2 = sum2 + array[i];
                }
                int[] newArray = new int[array.length / 2];
                if (sum1 > sum2) {
                    int j = 0;
                    for (int i = 0; i < middleLength - 1; i++) {
                        newArray[j] = array[i];

                    }
                    return newArray;

                } else if (sum1 < sum2) {
                    int j = 0;
                    for (int i = middleLength; i < array.length; i++) {
                        newArray[j] = array[i];
                        j++;

                    }
                    return newArray;

                }

            } return new int[0];


        } return new int[0];


    }


}
