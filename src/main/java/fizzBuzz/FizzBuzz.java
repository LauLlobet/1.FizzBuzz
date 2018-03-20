package fizzBuzz;

class FizzBuzz {
    String doIt(int s) {

        MultipleCheckedInteger number = new MultipleCheckedInteger(s);
        if(number.isMultipleOf(3)){
            return "fizz";
        }
        if(number.isMultipleOf(5)){
            return "buzz";
        }
        return s+"";
    }
}
