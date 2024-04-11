package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResizingArray {

    public static void main(String[] args) {
        resizingWithArray();
        resizingWithList();
    }
    public static void resizingWithArray() {
        int[] result = new int[0]; // Initialize an empty array

        // Add 20 elements to the array
        for (int i = 0; i < 20; i++) {
            int elementToAdd = i * 2; // Generating some sample values
            result = Arrays.copyOf(result, result.length + 1); // Increase array size by 1
            result[result.length - 1] = elementToAdd; // Assign the new element at the end of the array
        }

        // Display the updated array
//        System.out.println("Updated array:");
//        for (int i = 0; i < result.length; i++) {
//            System.out.println("result[" + i + "] = " + result[i]);
//        }
    }

    public static void resizingWithList() {
        List<Integer> resultList = new ArrayList<>(); // Initialize an empty ArrayList

        // Add 20 elements to the list
        for (int i = 0; i < 20; i++) {
            int elementToAdd = i * 2; // Generating some sample values
            resultList.add(elementToAdd); // Add the new element to the list
        }

        // Display the updated list
//        System.out.println("Updated list:");
//        for (int i = 0; i < resultList.size(); i++) {
//            System.out.println("resultList.get(" + i + ") = " + resultList.get(i));
//        }
    }
}
