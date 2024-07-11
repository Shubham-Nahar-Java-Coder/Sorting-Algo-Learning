package MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static int[] merge(int[] array1, int[] array2){
        int[] mergeArray = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while(i < array1.length && j <array2.length){
            if(array1[i] < array2[j]){
                mergeArray[index] = array1[i];
                index++;
                i++;
            }else{
                mergeArray[index] = array2[j];
                index++;
                j++;
            }
        }
        while(i <array1.length){
            mergeArray[index] = array1[i];
            index++;
            i++;
        }
        while(j < array2.length){
            mergeArray[index] = array2[j];
            index++;
            j++;
        }
        return mergeArray;
    }

    public static int[] mergeSort(int[] array){
        if(array.length == 1){
            return array;
        }

        int midIndex = array.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] array1 = {2,4,6,8};
        int[] array2 = {1,3,5};

        System.out.println("Merge Function for sorted Array: "+Arrays.toString(merge(array1, array2)));

        int[] array = {9, 9, 0, 1, 6, 3, 8, 7, 4, 5};

        System.out.println("MergeSort Function: "+Arrays.toString(mergeSort(array)));
    }
}
