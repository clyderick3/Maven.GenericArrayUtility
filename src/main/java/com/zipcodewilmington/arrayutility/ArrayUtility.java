package com.zipcodewilmington.arrayutility;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T>{
private T[] inputArray;
private ArrayList<T> newList;


    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
        this.newList = new ArrayList<T>();
        this.newList.addAll(Arrays.asList(inputArray));
    }


    public T[] removeValue(T valueToRemove) {
        //use for loop to removeValue.
        int removeCount = getNumberOfOccurrences(valueToRemove);
        int count = 0;

        T[] outputArray = Arrays.copyOf(this.inputArray, this.inputArray.length - removeCount);

        for (T item : newList) {
            if (!item.equals(valueToRemove)) {
                outputArray[count++] = item;
            }
        }
        return outputArray;
    }

//        ArrayList<T> list = new ArrayList<>(Arrays.asList(inputArray));
//
//        while (list.contains(valueToRemove)){
//            list.remove(valueToRemove);
//        }
//        T[] arr = (T[])list.toArray(new String[0]);
//        return arr;

//        int count = 0;
//        T[] results = new T[];
//        for (int i = 0; i < inputArray.length; i++){
//            if (inputArray[i] != valueToRemove){
//                results += inputArray[i];
//                count++;
    //}
        //}
//        return results;
//        return null;

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
        ArrayList<T> firstList = new ArrayList<>(Arrays.asList(inputArray));
        ArrayList<T> secondList = new ArrayList<>(Arrays.asList(arrayToMerge));

        firstList.addAll(secondList);
        Integer number = 0;
        T mostCommon = null;

        for(T element : firstList){
            if (getNumberOfOccurrences(element) > number) {
                number = getNumberOfOccurrences(element);
                mostCommon = element;
            }
        }
        return mostCommon;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        return getNumberOfOccurrences(valueToEvaluate) + getNumberOfOccurrences(valueToEvaluate, arrayToMerge);
    }
}
