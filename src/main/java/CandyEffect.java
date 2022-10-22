public class CandyEffect {

    // Поиск первого кратного числа
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


    //Построение массива кратных "step" чисел

    public static int [] multyUseSequence(int start, int end, int step) {
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




}
