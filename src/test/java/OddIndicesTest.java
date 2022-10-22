import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}

    //Poditive

    @Test
    public void testArrayOddIndeces_HappyPath(){
        int[] array = {-45, 590, 234, 985, 12, 68, 40};
        int[] expectedResult = {-45, 234, 12};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testArrayOddIndeces_ArrayOfTwo_Positive(){
        int[] array = {-45, 590};
        int[] expectedResult = {590};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    //Negative

    @Test
    public void testArrayOddIndeces_ArrayOfOne_Negative(){
        int[] array = {-45};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testNullArrayOddIndeces_Negative(){
        int[] array = null;
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testEmptyArrayOddIndeces_Negative(){
        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult,expectedResult);
    }




}
