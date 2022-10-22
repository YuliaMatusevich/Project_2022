import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    //Test Data:
         //   ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}


    @Test
    public void minMaxAve_HappyPath_PositiveNumbers(){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 6;
        int[]expectedResult = {3,7,5};

        int[] actualResult = new MinMaxAve().minMavAve(array, a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void minMaxAve_HappyPath_AllEqualNumbers(){
        int [] array = {2,2,2,2,2};
        int a = 1;
        int b = 3;
        int[]expectedResult = {2,2,2};

        int[] actualResult = new MinMaxAve().minMavAve(array, a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //Negative
    @Test
    public void minMaxAve_HappyPath_NullArray(){
        int [] array = null;
        int a = 1;
        int b = 3;
        int[]expectedResult = {};

        int[] actualResult = new MinMaxAve().minMavAve(array, a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void minMaxAve_HappyPath_EmptyArray(){
        int [] array = {};
        int a = 1;
        int b = 3;
        int[]expectedResult = {};

        int[] actualResult = new MinMaxAve().minMavAve(array, a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void minMaxAve_HappyPath_abEquals(){
        int [] array = {1,2,3,4,5};
        int a = 1;
        int b = 1;
        int[]expectedResult = {};

        int[] actualResult = new MinMaxAve().minMavAve(array, a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void minMaxAve_HappyPath_abNegative(){
        int [] array = {1,2,3,4,5};
        int a = -1;
        int b = 3;
        int[]expectedResult = {};

        int[] actualResult = new MinMaxAve().minMavAve(array, a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void minMaxAve_HappyPath_aMoreThanB(){
        int [] array = {1,2,3,4,5};
        int a = 3;
        int b = 0;
        int[]expectedResult = {};

        int[] actualResult = new MinMaxAve().minMavAve(array, a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void minMaxAve_HappyPath_bMoreThanArrayLength(){
        int [] array = {1,2,3,4,5};
        int a = 3;
        int b = 6;
        int[]expectedResult = {};

        int[] actualResult = new MinMaxAve().minMavAve(array, a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }


}
