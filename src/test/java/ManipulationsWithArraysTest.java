import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    //Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
    @Test
    public void myltiplyArrayByNumber_HappyPath(){
        int [] array = {1, 2, 3, 4, 5};
        int number = 0;

        int [] expectedResult = {0,0,0,0,0};

        int [] actualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //Negative

    @Test
    public void myltiplyArrayByNumber_Null(){
        int [] array = null;
        int number = 3;

        int [] expectedResult = {};

        int [] actualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void myltiplyArrayByNumber_Empty(){
        int [] array = {};
        int number = 3;

        int [] expectedResult = {};

        int [] actualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}

    @Test
    public void intToDoubleArray_HappyPath(){
        int []array = {1, 2, 3, 4, 5};
        double [] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

        double [] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Negative
    @Test
    public void intToDoubleArray_Null(){
        int []array = null;
        double [] expectedResult = {};

        double [] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void intToDoubleArray_Empty(){
        int []array = {};
        double [] expectedResult = {};

        double [] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}

    @Test
    public void doubleToIntArray_HappyPath(){
        double []array = {1.1, 2.5, 3.7, 4.0, 5.5};
        int [] expectedResult = {1, 2, 3, 4, 5};

        int [] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //Negative
    @Test
    public void doubleToIntArray_Null(){
        double []array = null;
        int [] expectedResult = {};

        int [] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void doubleToIntArray_Empty(){
        double []array = {};
        int [] expectedResult = {};

        int [] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
    @Test
    public void intToStringArray_HappyPath(){
        int []array = {1, 2, 3, 4, 5};
        String [] expectedResult = {"1", "2", "3", "4", "5"};

        String [] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //Negative

    @Test
    public void intToStringArray_Null(){
        int []array = null;
        String [] expectedResult = {};

        String [] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void intToStringArray_Empty(){
        int []array = {};
        String [] expectedResult = {};

        String [] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}
    @Test
    public void doubleToStringArray_HappyPath(){
        double []array = {1.1, 2.5, 3.7, 4.0, 5.5};
        String [] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};

        String [] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    // В классе ManipulationsWithArrays написать метод getTheGreaterHalf(), который принимает массив целых чисел,
    // и возвращает  массив из суммарно бОльшей первой или второй половины входящего массива

    @Test
    public void getTheGreaterHalfOfArray_HappyPath(){

        int [] array = {1,2,3,4,5,6,7,8};
        int [] expectedResult = {5,6,7,8};

        int [] actualResult = new ManipulationsWithArrays(). getTheGreaterHalf(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


}
