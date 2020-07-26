package GeekBrains;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        try {String[][] array = new String[][]{
                {"1","2","5","21"},
                {"1","2","9","-991"},
                {"1","2","0","21"},
                {"1","992","5","21"}
        };
            checkArray(array);
        }catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }
    }
    static void checkArray(String[][] array) throws MyArrayDataException, MyArraySizeException{
        if (array.length == 0){
            throw new MyArraySizeException("Invalid array size");
        }
        int a1 = array.length;
        int a2 = array[0].length;
        if(a1 != 4 || a2 != 4) {
            throw new MyArraySizeException("Invalid array size");
        }
        int a;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
               try {
                   a = Integer.valueOf(array[i][j]);
                   sum += a;
               } catch (NumberFormatException e){
                   throw new MyArrayDataException(String.format("Input error in stroke %s, column %s",i+1, j+1, e));
               }
            }
        }
        System.out.println("Sum = " + sum);
    }
}
