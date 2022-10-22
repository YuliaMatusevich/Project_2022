import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    ////Test Data:
    //    //-345 →  “Odd”
    //    //0 →  “Even”
    //    //222222 →  “Even”

    @Test

    public void testOdd_HappyPath(){
        int x = -345;
        String expectedResult = "Odd";

        String actualResult = new OddEven().oddEven(x);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testZero_HappyPath(){
        int x = 0;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(x);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testEven_HappyPath(){
        int x = 222222;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(x);

        Assert.assertEquals(actualResult,expectedResult);
    }




}
