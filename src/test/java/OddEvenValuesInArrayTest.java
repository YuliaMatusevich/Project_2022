import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {

    @Test
    public void countEvenValuesInArray_HappyPath(){
        int[] array = {1,5,12,-6,88,11,0,-56};
        int expectedResult = 5;

        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //Negative
    @Test
    public void countEvenValuesInArray_Null(){
        int[] array = null;
        int expectedResult = 0;

        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void countEvenValuesInArray_Empty(){
        int[] array = {};
        int expectedResult = 0;

        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    /////////

    @Test
    public void countOddValuesInArray_HappyPath(){
        int[] array = {1,5,12,-6,88,-11,0,-56};
        int expectedResult = 3;

        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //Negative
    @Test
    public void countOddValuesInArray_Null(){
        int[] array = null;
        int expectedResult = 0;

        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void countOddValuesInArray_Empty(){
        int[] array = {};
        int expectedResult = 0;

        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        Assert.assertEquals(actualResult,expectedResult);
    }


    //
    @Test
    public void ValuesGreaterThanNumber_HappyPath(){
        int [] array= {2, 3, 4, 5};
        int number = 1;
        boolean expectedResult = true;

        boolean actualResult = new OddEvenValuesInArray().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    public void ValuesGreaterThanNumber_OneInvalid(){
        int [] array= {-2, 3, 4, 5};
        int number = 1;
        boolean expectedResult = false;

        boolean actualResult = new OddEvenValuesInArray().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //Negative

    @Test
    public void ValuesGreaterThanNumber_Empty(){
        int [] array= {};
        int number = 1;
        boolean expectedResult = false;

        boolean actualResult = new OddEvenValuesInArray().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);

    }





}
