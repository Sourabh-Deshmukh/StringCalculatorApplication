package io.sdWorld;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public int add(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        return sumNumbers(numbers);
    }

    private int sumNumbers(String numbers) {
        List<Integer> numbersList = convertToInt(numbers);
        int sum = 0;
        for(int number : numbersList){
            sum += number;
        }
        return sum;
    }

    private List<Integer> convertToInt(String numbers) {
        List<Integer> numberList = new ArrayList<Integer>();
        String[] stringNumbers = filterNumbers(numbers);
        for(int iterator = 0 ; iterator < stringNumbers.length; iterator++){
            numberList.add(Integer.parseInt(stringNumbers[iterator]));
        }
        return numberList;
    }

    private String[] filterNumbers(String numbers) {
        return numbers.split(",");
    }

}
