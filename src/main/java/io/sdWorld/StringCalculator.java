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
        ArrayList<Integer> numberList = new ArrayList<>();
        String[] stringNumbers = filterNumbers(numbers);
        for(String number : stringNumbers){
            numberList.add(Integer.parseInt(number));
        }
        return numberList;
    }

    private String[] filterNumbers(String numbers) {
        if(numbers.contains("\n") ){
            numbers = numbers.replace("\n", ",");
        }
        return numbers.split(",");
    }

}
