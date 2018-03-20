package fizzBuzz;

class FizzBuzz {
    String doIt(int s) {

        MultipleCheckedInteger number = new MultipleCheckedInteger(s);
        if(number.isMultipleOfThree()){
            return "fizz";
        }
        if(number.isMultipleOfFive()){
            return "buzz";
        }
        return s+"";
    }
}
