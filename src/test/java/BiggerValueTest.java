import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {
    //Test Data:
    //3333, 9999
    @Test
    public void biggerValueOfTwoPositiveNumbers_happyPath(){
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        int actualResult = new BiggerValue().biggerValueOfTwo(a,b);

        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test
    public void biggerValueOfTwoAnySignNumbers_happyPath(){
        int a = 3333;
        int b = -9999;
        int expectedResult = 3333;

        int actualResult = new BiggerValue().biggerValueOfTwo(a,b);

        Assert.assertEquals(actualResult,expectedResult);

    }
    @Test
    public void biggerValueOfTwoNumbers_ZeroCheck_happyPath(){
        int a = -3333;
        int b = 0;
        int expectedResult = 0;

        int actualResult = new BiggerValue().biggerValueOfTwo(a,b);

        Assert.assertEquals(actualResult,expectedResult);

    }

    public void biggerValueOfTwoNumbers_TwoEquals_happyPath(){
        int a = 3333;
        int b = 3333;
        int expectedResult = 3333;

        int actualResult = new BiggerValue().biggerValueOfTwo(a,b);

        Assert.assertEquals(actualResult,expectedResult);

    }




}
