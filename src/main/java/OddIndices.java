import java.util.Arrays;

public class OddIndices {
    //Написать алгоритм OddIndices, который принимает массив целых чисел,
    // и возвращает массив значений нечетных индексов
    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}

    public int [] oddIndices (int [] array){
       if (array != null && array.length > 0) {
            int j =0;
            int[] newArray =new int[array.length / 2];      // если индексы нужны будут четные, то длина / 2 +1
            for(int i = 1; i < array.length; i += 2){       //и тут начинать int i = 0.
                newArray[j] = array[i];
                j++;

            } return newArray;

        } return new int[0];
    }

}
