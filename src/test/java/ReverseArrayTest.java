import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {

    //Test Data:
    //{2, 7, 3, 10} → {10, 3, 7, 2}

    @Test
    public void reverseArray_HappyPath(){

        int[] array = {2, 7, 3, 10};
        int [] expectedResult = {10, 3, 7, 2};

        int [] actualResult = new ReverseArray().reverseArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //Negative
    @Test
    public void reverseArray_Null(){

        int[] array = null;
        int [] expectedResult = {};

        int [] actualResult = new ReverseArray().reverseArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }


    @Test
    public void reverseArray_Empty(){

        int[] array = {};
        int [] expectedResult = {};

        int [] actualResult = new ReverseArray().reverseArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }





}
