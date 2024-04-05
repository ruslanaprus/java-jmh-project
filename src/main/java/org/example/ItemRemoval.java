package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ItemRemoval {
    public static void concurrentModificationOne() {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7)
        );

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number == 2) {
                iterator.remove();
            }
        }
    }

    public static void concurrentModificationTwo() {
        int[] prices = new int[]{1, 2, 3, 4, 2, 5, 6, 2, 7};
        int toRemove = 2;
        int[] newPrices = Arrays.stream(prices)
                .filter(price -> price != toRemove)
                .toArray();
    }

    public static void concurrentModificationThree() {
        int[] prices = new int[]{1, 2, 3, 4, 2, 5, 6, 2, 7};
        int toRemove = 2;
        // Use a for loop to remove elements with the specified value
        int newSize = 0; // New size of the array without elements to be removed
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                prices[newSize++] = prices[i];
            }
        }

        // Resize the array if necessary
        int[] newArray = Arrays.copyOf(prices, newSize);
    }

}
