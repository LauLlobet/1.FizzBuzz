package fizzBuzz;

class MultipleCheckedInteger{
    private int value;

    MultipleCheckedInteger(int s) {
        value = s;
    }

    boolean isMultipleOfThree(){
        return value == 3;
    }

    boolean isMultipleOfFive(){
        return value == 5;
    }
}
