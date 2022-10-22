import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckMultiplesOfNumberTest {

    @Test
    public void checkMultiples_9and7 (){
        int m = 630;
        String expectedResult = "Good Number";

        String actualResult = new CheckMultiplesOfNumber().checkNumberDiv_7_9_11(m);

        Assert.assertEquals(actualResult, expectedResult);


    }

    @Test
    public void checkMultiples_9not7 (){
        int m = 81;
        String expectedResult = "Bad Number";

        String actualResult = new CheckMultiplesOfNumber().checkNumberDiv_7_9_11(m);

        Assert.assertEquals(actualResult, expectedResult);


    }
    @Test
    public void checkMultiples_11 (){
        int m = 22;
        String expectedResult = "Poor Number";

        String actualResult = new CheckMultiplesOfNumber().checkNumberDiv_7_9_11(m);

        Assert.assertEquals(actualResult, expectedResult);


    }





}
