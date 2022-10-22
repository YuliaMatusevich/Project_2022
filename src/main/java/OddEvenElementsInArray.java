import java.util.Arrays;

public class OddEvenElementsInArray {


    //В классе OddEvenElementsInArray написать метод countOddEvenValuesInArray(),
    // который принимает на вход массив целых чисел
    // и возвращает массив int[2], который содержит количество четных и нечетных элементов входящего массива

    public int [] countOddEvenValuesInArray(int []array){
        int [] newArray = new int[2];
        newArray[0] = new OddEvenValuesInArray().countEvenValuesInArray(array);
        newArray[1] = new OddEvenValuesInArray(). countOddValuesInArray(array);

        return newArray;

    }


    //В классе OddEvenElementsInArray написать метод createOddEvenArray(),
    // который принимает массив целых случайных чисел,
    // и возвращает двумерный массив (массив четных и массив нечетных чисел)

    public int [][] createOddEvenArray(int[]array){

        int [] array1 = {1,2,3,4,5,6,7,8,9};
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                countEven++;
            } else if (array[i] % 2 != 0){
                countOdd++;
            }
        }                                       //допускаю, что тут нужно условие только если odd и even равны,
                                                // чтобы были равны по длине строки в 2 мерном массиве
        int length;
        if(countOdd >= countEven){
            length = countOdd;
        } else {
            length = countEven;
        }
        int[][] newArray = new int[2][length];
        int m = 0;
        int k =0;
        for(int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                int temp = array[i];
                newArray[0][m] = temp;
                m++;
            }
            if(array[i] % 2 != 0){
                int temp = array[i];
                newArray[1][k] = temp;
                k++;
            }
        }
          return newArray;
    }

}
