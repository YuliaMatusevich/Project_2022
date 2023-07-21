package utils;

public class Utils {

    // ANSI COLORS

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    //СHECK IF ARRAY IS NOT NULL AND IS NOT EMPTY  //int, double, long, char, String

    public static boolean basicValidArray(int[] array){
        if(array != null && array.length > 0){
            return true;
        }
        return false;
    }

    public static boolean basicValidArray(double[] array){
        if(array != null && array.length > 0){
            return true;
        }
        return false;
    }

    public static boolean basicValidArray(long[] array){
        if(array != null && array.length > 0){
            return true;
        }
        return false;
    }

    public static boolean basicValidArray(char[] array){
        if(array != null && array.length > 0){
            return true;
        }
        return false;
    }

    public static boolean basicValidArray(String[] array){
        if(array != null && array.length > 0){
            return true;
        }
        return false;
    }

    //СHECK IF STRING IS NOT NULL AND IS NOT BLANK(NOT EMPTY AND DOES NOT CONSIST OF ONLY SPACES)

    public static boolean basicValidString(String text){
        if(text != null && !text.isBlank()){
            return true;
        }
        return false;
    }

    // FIND RIRST DIVISOR IN A SEQUENCE
    public static int findFirstDivisor_CE(int start, int end, int step) {
        int firstDev;

        if (start % step == 0) {
            firstDev = start;

            return firstDev;

        } else if ((start < end)) {
            if (step > 0) {
                for (int i = start; i <= start + step && i <= end; i++) {
                    if (i % step == 0) {
                        firstDev = i;

                        return firstDev;
                    }
                }
            }
        } else if ((start > end)) {
            if (step < 0) {
                for (int i = start; i >= start + step && i >= end; i--) {
                    if (i % step == 0) {
                        firstDev = i;

                        return firstDev;
                    }
                }
            }
        } return Integer.MIN_VALUE;
    }

    //GENERATE A SEQUENCE WITH STEP = "STEP" (INCREASING OR DECREASING)

    public static int [] createSequenceOfMultiples(int start, int end, int step) {
        int firstDiv = findFirstDivisor_CE(start, end, step);
        int l = (Math.abs(end/ step - firstDiv/step)) + 1;
        int[] array = new int[l];

        if (firstDiv == Integer.MIN_VALUE) {
            return new int[0];

        } else if (start < end) {
            if (step > 0) {
                l = 0;
                for (int i = firstDiv; i <= end; i += step, l++) {
                    if (l < array.length && i <= Integer.MAX_VALUE) {
                        array[l] = i;
                    } else {
                        break;
                    }

                }

                return array;

            }
        } else if (start > end) {
            if (step < 0) {
                l = 0;
                for (int i = firstDiv; i >= end; i += step, l++) {
                    if (l < array.length && i >= Integer.MIN_VALUE) {
                        array[l] = i;
                    } else{
                        break;
                    }

                }
                return array;
            }
        }

        return new int[0];
    }

    // COUNT INCREASING ARRAY LENGTH - OEVEN NUMBERS

    public static int countArrayLengthEvenIncreasing(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i += 2) {
            count++;
        }
        return count;
    }

    // COUNT INCREASING ARRAY LENGTH - ODD NUMBERS

    public static int countArrayLengthOddIncreasing(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i += 2) {
            count++;
        }
        return count;
    }

    // COUNT DECREASING ARRAY LENGTH - EVEN NUMBERS

    public static int countArrayLengthEvenDecreasing(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i -= 2) {
            count++;
        }
        return count;
    }

    // COUNT DECREASING ARRAY LENGTH - ODD NUMBERS

    public static int countArrayLengthOddDecreasing(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i += 2) {
            count++;
        }
        return count;
    }

    // COUNT AVERAGE AMOUNT OF ARRAY ELEMENTS
    public static int countAverageAmountOfArray(int[] array) {
        int sum = 0;
        if (basicValidArray(array)){
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum / array.length;
        }
        return Integer.MIN_VALUE;
    }

    //COUNT MATH RANDOM INT NUMBER IN AN INTERVAL BETWEEN TWO NUMBERS
    public static int generateMathRandomBetweenTwoNumbers(int a, int b) {
        int c;
        if (a < b) {
            c = (int) ((b - a) * Math.random() + 1);
            return c;
        } else if (a > b) {
            c = (int) ((a - b) * Math.random() + 1);
            return c;
        }
        return Integer.MIN_VALUE;
    }




    public static void main(String[] args) {

    }















}
