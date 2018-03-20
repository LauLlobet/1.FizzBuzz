package fizzBuzz;

class MultipleCheckedInteger{
    private int value;

    MultipleCheckedInteger(int s) {
        value = s;
    }

    boolean isMultipleOf(int multiple){
        return value%multiple == 0;
    }
}
