import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {

    public String[] fizzBuzz(int start, int end){

        if (start <= end){
            String[] array = new String[end - start + 1];

            for (int i = 0; i < array.length && start <= end; i++) {
                if (start % 3 == 0 && start % 5 == 0) {
                    array[i] = "FizzBuzz";
                } else if (start % 3 == 0) {
                    array[i] = "Fizz";
                } else if (start % 5 == 0) {
                    array[i] = "Buzz";
                } else{
                    array[i] = String.valueOf(start);
                }

                start++;
            }

            return array;
        }
        return new String[0];
    }

    public static String fizzBuzz1(int[] num){
        String str = "";
        for (int n : num) {
            if (n % 3 == 0 && n % 5 == 0) {
                str += "FizzBuzz ";
            } else if (n % 3 == 0) {
                str += "Fizz ";
            } else if (n % 5 == 0) {
                str += "Buzz ";
            } else {
                str += n + " ";
            }
        }
       return str;
    }

    public static List <String> fizzBuzz2(List<Integer> numbers){

        return numbers
                .stream()
                .map(n -> n % 3 == 0 && n % 5 == 0 ? "FizzBuzz" :
                        (n % 3 == 0) ? "Fizz" :
                        (n % 5 == 0) ? "Buzz" : String.valueOf(n))
                        .collect(Collectors.toList());
    }

    public static String fizzBuzz3(String numbers){
        String [] nums = numbers.replace(" ",""). split(",");
        StringBuilder sb = new StringBuilder();
        for(String n : nums){
            int number = Integer.parseInt(n);
                if(number % 3 == 0 && number % 5 == 0){
                    sb.append("FizzBuzz, ");
                } else if(number % 3 == 0){
                    sb.append("Fizz, ");
                }else if(number % 5 == 0){
                    sb.append("Buzz, ");
                } else {
                 sb.append(n).append(", ");
                }
        }
        return sb. toString(). substring(0, sb.toString().length() - 2);
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz1(new int []{1, 21,4,-15,0, -50, 34}));

        System.out.println(fizzBuzz2(Arrays.asList(1, 21, 4, -15, 0, -50, 34)));

        System.out.println(fizzBuzz3("1, 21, 4, -15, 0, -50, 34"));
    }
}

