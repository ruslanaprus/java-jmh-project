package org.example;

public class ATM {

    public static int countBanknotesWhileLoop(int sum){
        int[] array = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        int i = 0;

        while (i < array.length) {
            if (sum / array[i] > 0) {
                count += sum / array[i];
                sum = sum % array[i];
            }
            i++;
        }
        return count;
    }

    public static int countBanknotesForLoop(int sum){
        int[] array = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (sum / array[i] > 0) {
                count += sum / array[i];
                sum = sum % array[i];
            }
        }
        return count;
    }

    public static int countBanknotesRecursive(int sum) {
        int[] array = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        return countBanknotesRecursion(sum, array, 0);
    }

    public static int countBanknotesRecursion(int sum, int[] array, int index){
        if (index >= array.length || sum <=0) {
            return 0;
        }

        if (sum / array[index] > 0) {
            int count = sum / array[index];
            return count + countBanknotesRecursion(sum % array[index], array, index);
        }
        return countBanknotesRecursion(sum, array, index + 1);
    }
}
