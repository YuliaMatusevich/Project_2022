public class ReverseArray {

    //Написать алгоритм ReverseArray, который принимает на вход массив целых чисел, и возвращает “перевернутый” массив.
    //Test Data:
    //{2, 7, 3, 10} → {10, 3, 7, 2}

    public int[] reverseArray (int [] array){
        int j = 0;
        int [] newArray = new int [array.length];
        if(array != null && array.length > 0){
            for (int i = array.length - 1; i >= 0; i--, j++){
                int temp;
                temp = array[i];
                newArray[j] = temp;

            } return newArray;
        }
        return new int [0];
    }

}
