import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    //Проверьте работу метода на числах 555, 0 и -555.

    @Test
    public void isPositiveNumber_PositiveCheck_HappyPath(){
        int a = 555;
        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void isPositiveNumber_ZeroCheck_HappyPath(){
        int a = 0;
        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void isNegativeNumber_NegativeCheck_HappyPath(){
        int a = -555;
        boolean expectedResult = false;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);

        Assert.assertEquals(actualResult, expectedResult);

    }


}
