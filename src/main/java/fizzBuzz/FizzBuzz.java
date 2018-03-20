package fizzBuzz;

class FizzBuzz {
    String doIt(int s) {

        MultipleCheckedInteger number = new MultipleCheckedInteger(s);
        if(number.isMultipleOf(3) && number.isMultipleOf(5)){
            return "fizzbuzz";
        }
        if(number.isMultipleOf(3)){
            return "fizz";
        }
        if(number.isMultipleOf(5)){
            return "buzz";
        }
        return s+"";
    }

    public static void main(String[] args){
        FizzBuzz fizzBuzz = new FizzBuzz();

        for(int i=1; i<100; i++){
            String fb2number = fizzBuzz.doIt(i);
            System.out.println(fb2number);
        }
    }
}
