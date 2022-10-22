public class OddEvenValuesInArray {

    //Написать метод countEvenValuesInArray(),
    // который принимает на вход массив целых чисел,
    // и возвращает количество четных чисел в этом массиве

    public int countEvenValuesInArray(int[]array) {
        if (array != null && array.length > 0) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    count++;
                }
            }
            return count;

        } return 0;
    }

    //Написать метод countOddValuesInArray(),
    // который принимает на вход массив целых чисел,
    // и возвращает количество нечетных чисел в этом массиве

    public int countOddValuesInArray(int[]array) {
        if (array != null && array.length > 0) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    count++;
                }
            }
            return count;

        } return 0;
    }


    //В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(),
    // который принимает на вход массив целых чисел и число number.
    // Метод возвращает значение true, если все элементы массива больше number, иначе возвращает false

    public boolean areValuesGreaterThanNumber(int[]array, int number){
        int count = 0;
        if(array != null && array.length > 0){
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= number) {
                    continue;
                } count++;
            }
            if(count == array.length){
                return true;

            } return false;

        } return false;
    }








}


