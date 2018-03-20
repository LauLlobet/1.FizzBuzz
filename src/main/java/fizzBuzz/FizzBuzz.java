package fizzBuzz;

class FizzBuzz {
    String doIt(int s) {
        if(isMultipleOfThree(s)){
            return "fizz";
        }
        if(isMultipleOfFive(s)){
            return "buzz";
        }
        return s+"";
    }

    private boolean isMultipleOfThree(int number){
        return number == 3;
    }

    private boolean isMultipleOfFive(int number){
        return number == 5;
    }
}
