import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    //Test Data:
    //{0, 1, 2, 3, 4, 5} → 15
    //{-7, -3} → -10

    @Test
    public void arraySum_HappyPath_PositiveNumbers(){

        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void arraySum_HappyPath_NegativeAndPositiveNumbers(){

        int[] array = {0, 1, -2, 3, 4, -5};
        int expectedResult = 1;

        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //Negative
    @Test
    public void arraySum_nullArray_Negative(){

        int[] array = null;
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void arraySum_EmptyArray_Negative(){

        int[] array = {};
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


}
