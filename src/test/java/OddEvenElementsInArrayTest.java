import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenElementsInArrayTest {

    @Test
    public void countOddEvenElementsInArray_HappyPath() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedResult = {4, 5};

        int[] actualResult = new OddEvenElementsInArray().countOddEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void countOddEvenInArrayTo2xArray_HappyPath(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] expectedResult = {{2, 4, 6, 8},{1, 3, 5, 7, 9}};

        int [][] actualResult = new OddEvenElementsInArray().createOddEvenArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

}
