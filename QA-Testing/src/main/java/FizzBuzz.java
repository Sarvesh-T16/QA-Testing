public class FizzBuzz {

    public String playFizzBuzz(int num1){
        if (num1 % 3 == 0 && num1 % 5 == 0){
            return "FizzBuzz";
        }
        else if (num1 % 3 == 0) {
            return "Fizz";
        }
        else if (num1 % 5 == 0) {
            return"Buzz";
        }
        else {
            return Integer.toString(num1);
        }

    }
}
