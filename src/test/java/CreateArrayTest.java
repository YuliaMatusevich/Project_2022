import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

    //Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}

    @Test
    public void createIntArray_HappyPath(){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int []expectedResult = {1, 2, 3, 4, 5};

        int [] actualResult = new CreateArray().createIntArray(a,b,c,d,e);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
    @Test
    public void createDoubleArray_HappyPath(){
        double a = 1.1;
        double b = 2.5;
        double c = 3.7;
        double d = 4.0;
        double e = 5.5;
        double []expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};

        double [] actualResult = new CreateArray().createDoubleArray(a,b,c,d,e);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
    @Test
    public void createStringArray_HappyPath(){
        String a = "It";
        String b = "was";
        String c = "an";
        String d = "apple";
        String e = "pie";
        String []expectedResult = {"It", "was","an", "apple", "pie"};

        String [] actualResult = new CreateArray().createStringArray(a,b,c,d,e);

        Assert.assertEquals(actualResult, expectedResult);
    }


    //Например, multiplesOf(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

    @Test
    public void multiplesOf_HappyPath(){
        int number = 2;
        int [] expectedResult = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int [] actualResult = new CreateArray().multiplesOf(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //Negative
    @Test
    public void multiplesOf_HappyPath_NegativeNumber(){
        int number = -3;
        int [] expectedResult = {};

        int [] actualResult = new CreateArray().multiplesOf(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multiplesOf_HappyPath_HugeNumber(){
        int number = 500000000;
        int [] expectedResult = {};

        int [] actualResult = new CreateArray().multiplesOf(number);

        Assert.assertEquals(actualResult, expectedResult);
    }



}
