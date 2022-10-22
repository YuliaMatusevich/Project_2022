public class SumArray {

    //Написать алгоритм SumArray, который возвращает сумму всех чисел массива
    //


    public int sumArray(int [] array){

        if(array!=null && array.length > 0){
            int sum = 0;
            for(int i = 0; i <array.length; i++){
               sum = sum + array[i];

            }return sum;
        } return Integer.MIN_VALUE;
    }





}
