import org.testng.Assert;
import org.testng.annotations.Test;

public class Multiply_7_9_11_Test {
    @Test
    public void multiply_7_9_11_HappyPath_7and9(){
        int number = 63;
        String expectedResult = "Good number";

        String actualResult = new Multiply_7_9_11().multiply_7_9_11(number);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void multiply_7_9_11_HappyPath_only9(){
        int number = 27;
        String expectedResult = "Bad number";

        String actualResult = new Multiply_7_9_11().multiply_7_9_11(number);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void multiply_7_9_11_HappyPath_9and11(){
        int number = 99;
        String expectedResult = "Bad number";

        String actualResult = new Multiply_7_9_11().multiply_7_9_11(number);

        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    public void multiply_7_9_11_HappyPath_only11() {
        int number = 33;
        String expectedResult = "Poor number";

        String actualResult = new Multiply_7_9_11().multiply_7_9_11(number);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void multiply_7_9_11_HappyPath_Zero(){
        int number = 0;
        String expectedResult = "Good number";

        String actualResult = new Multiply_7_9_11().multiply_7_9_11(number);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void multiply_7_9_11_HappyPath_7and9and11(){
        int number = 693;
        String expectedResult = "Good number";

        String actualResult = new Multiply_7_9_11().multiply_7_9_11(number);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //Negative
    @Test
    public void multiply_7_9_11_HappyPath_only7(){
        int number = 14;
        String expectedResult = "-1";

        String actualResult = new Multiply_7_9_11().multiply_7_9_11(number);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void multiply_7_9_11_HappyPath_not7_9_11(){
        int number = 23;
        String expectedResult = "-1";

        String actualResult = new Multiply_7_9_11().multiply_7_9_11(number);

        Assert.assertEquals(actualResult, expectedResult);

    }

}
