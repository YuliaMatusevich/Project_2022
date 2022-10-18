import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {

    //1. Positive
    //Valid array

    @Test
    public void testValidArray_HappyPath(){
        ///AAA
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};

        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult, expectedResult);


    }
    //2 Positive
    //All elements are equal
    @Test

    public void testValidAllEqualArray_HappyPath(){
        ///AAA
        int[] array = {3,3,3};

        int[] expectedResult = {3,3,3};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult, expectedResult);


    }
    // 3 Negative
    @Test
    public void testNullArrayNegative(){
        ///AAA
        int[] array = null;

        int[] expectedResult = {};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    // Negative
    @Test
    public void testEmptyArrayNegative(){
        ///AAA
        int[] array = {};

        int[] expectedResult = {};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
