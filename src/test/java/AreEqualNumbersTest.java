import org.testng.Assert;
import org.testng.annotations.Test;

public class AreEqualNumbersTest {
    //Test Data:
    //            89, 89
    //    Expected result: 0
    //            -89, 89
    //    Expected result: -1
    //            89, -89
    //    Expected result: 1

    @Test
    public void equalNumbers_Equals_HappyPath(){
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        int actualResult = new AreEqualNumbers().equalNumbers(a,b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    public void equalNumbers_aLessThanB_HappyPath(){
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        int actualResult = new AreEqualNumbers().equalNumbers(a,b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    public void equalNumbers_aMoreThanB_HappyPath(){
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        int actualResult = new AreEqualNumbers().equalNumbers(a,b);

        Assert.assertEquals(actualResult, expectedResult);
    }


}
