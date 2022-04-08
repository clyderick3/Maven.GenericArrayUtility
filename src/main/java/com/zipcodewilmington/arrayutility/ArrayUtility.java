package com.zipcodewilmington.arrayutility;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T>{
private T[] inputArray;

    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public T[] removeValue(T valueToRemove) {
        return null;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        int count = 0;
        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i] == valueToEvaluate) {
                count++;
            }
        }
        return count;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate, T[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == valueToEvaluate) {
                count++;
            }
        }
        return count;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        return null;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        return getNumberOfOccurrences(valueToEvaluate) + getNumberOfOccurrences(valueToEvaluate, arrayToMerge);
    }
}
