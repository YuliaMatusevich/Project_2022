public class Multiply_7_9_11 {

//If M is multiple of 7 and 9 then return "Good Number".
//If M is only multiple of 9 and not of 7  then return "Bad Number"
//If M is only multiple of 11 then return "Poor Number"
//If M doesn't satisfy any of the above conditions then return "-1"


    public String multiply_7_9_11 (int number){
        if(number % 9 == 0){
            if(number % 7 == 0){

                return "Good number";

            } else if (number % 7 != 0){

                return "Bad number";
            }
        } else if (number % 11 == 0){

            return "Poor number";

        } return "-1";

    }



    public static String checkTheNumber(int M) {
        String result = "";

        if ((M % 7 != 0) && (M % 9 != 0) && (M % 11 != 0)){

            return "-1";
        } else {
            if (M % 7 == 0 && M % 9 == 0) {

                result += "Good Number" + " ";
            }
            if (M % 9 == 0 && M % 7 != 0) {

                result += "Bad Number" + " ";
            }
            if (M % 11 == 0) {

                result += "Poor Number" + " ";
            }

            return result;
        }
    }


}
