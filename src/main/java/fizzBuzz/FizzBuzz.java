package fizzBuzz;

class FizzBuzz {
    String doIt(int s) {
        if(isMultipleOfThree(s)){
            return "fizz";
        }
        return s+"";
    }

    private boolean isMultipleOfThree(int number){
        return number == 3;
    }
}
