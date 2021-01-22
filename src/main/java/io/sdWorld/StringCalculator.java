package io.sdWorld;

public class StringCalculator {

    public int add(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        return sumNumbers(numbers);
    }

    private int sumNumbers(String numbers) {
        return convertToInt(numbers);
    }

    private int convertToInt(String numbers) {
        return Integer.parseInt(numbers);
    }

}
