package Task3_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] ar1 = {"88", "21", "34"};
        String[] ar2 = {"88", "21", "34"};
        boolean result = compareArrays(ar1, ar2);
        System.out.println(result);
    }

    public static <T> boolean compareArrays(T[] arr1, T[] arr2){
        if(arr1.length == arr2.length){
            return Arrays.equals(arr1, arr2);
        }
        else {
            System.out.println("Длина массивов не равная");
            return false;
        }
    }
}
