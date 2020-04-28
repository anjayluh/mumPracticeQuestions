/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angella
 */
public class Exercises {
    public static int poe(int[] a){
        for(int numberIndex = 0; numberIndex < a.length; numberIndex++){
            int leftSum = 0;
            int rightSum = 0;
            for(int n = 0; n < a.length; n++){
                if(n < numberIndex){
                    leftSum += a[n];
                }
                if(n > numberIndex){
                    rightSum += a[n];
                }
            }
            if(leftSum == rightSum){
                return numberIndex;
            }
        }
        return -1;
    }
    public static int[] fthree(int[] first, int[] second){
         
        if(first == null || second == null){
            return null;
        }
        else{
            List<Integer> newList  = new ArrayList<Integer>();
            for(int i = 0; i< first.length; i++){
                int newValue = first[i];
                for(int j = 0; j < second.length; j++){
                    if(newValue == second[j]){
                        newList.add(first[i]);
                    }
                }
            }
            int[] result = new int[newList.size()];
            for (int i = 0; i < result.length; i++) {
                result[i] = newList.get(i);
            }
            return result;
        }
    }
    public static char[] fCopyOfRange(char[] a, int start, int len){
        char[] newArray = new char[len];
        if(start < 0 || len < 0 || start + (len - 1) > a.length) {
            return null;
        }
        else {
            for(int i = start, j = 0; j < len; j++, i++)
                newArray[j] = a[i];
        }
        return newArray;
    }
    public static int f(int[ ] a){
        int X = 0;
        int Y = 0;
        for(int i: a){
            if(i % 2 == 1){
                X += i;
            }
            else{
                Y += i;
            }
        }
        return X - Y;
    }
    public static int checkCenteredArray(int[] array){
        switch(array.length){
            case 0:
                return 0;
            case 1:
                return 1;
            default: 
                if(array.length % 2 == 0){
                    return 0;
                }
                else {
                    int middle = (array.length / 2) + 1;
                    for(int i = 0; i < array.length; i++){
                        if(i != (middle - 1)){
                            if (array[i] < array[middle - 1]){
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
        }
    }
    public static int checkConcatenatedSum(int n, int catlen){
        int tempNum = n;
        int sum = 0;

        while (tempNum > 0) {
            int digit = tempNum % 10;
            tempNum /= 10;
            for (int i = 1, j = 1; j <= catlen; i *= 10, j++) {
                sum += digit * i;
            }
        }
        if (n == sum) return 1;
        return 0;
    }
    public static int isSelfReferential(int[] a){
        if(a == null || a.length == 0)
            return 0;
        for (int i = 0; i <a.length; i++){
            int count = 0;
            for(int value: a){
                if (value == i)
                    count++;
            }
            if (count != a[i]){
                return 0;
            }
        }
        return 1;
    }
    public static int largestAdjacentSum(int[] a){
        int[] sum = new int[a.length - 1];
        int j = 0;
        for (int i = 0; i < a.length - 1; i++){
            sum[j] = a[i] + a[i+1];
            j++;
        }
        int largest = sum[0];
        for (int k = 0; k < sum.length; k++){
            if (largest < sum[k]){
                largest = sum[k];
            }
        }
        return largest;  
    }
    public static int equivalentArrays(String[] arrayOne, String[] arrayTwo){
        for (int i = 0; i < arrayOne.length; i++){
            String arrayOneValue = arrayOne[i];
            for (int j = 0; j < arrayTwo.length; j++){
                if (arrayOneValue.equals(arrayTwo[j])){
                    return 1;
                }
            }
        }
        return 0;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(poe(new int[] {3, 4, 5, 10}));
        fthree(new int[] {1, 2}, null);
        fCopyOfRange(new char[] {'a', 'b', 'c'}, 0, 2);
        f(new int[] {1, 1});
        checkCenteredArray(new int[] {1, 2, 3, 4});
        checkConcatenatedSum(198, 2);
        isSelfReferential(new int [] {1, 2, 1, 0});
        largestAdjacentSum(new int [] {18, -12, 9, -10});
        String[] array1 = {"1", "2", "3" };  // the arrays can be whatever size
        String[] array2 = {"1", "2", "3"};
        equivalentArrays(array1 , array2 );
        
        
    }
    
}
