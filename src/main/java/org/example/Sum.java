package org.example;

public class Sum {
    public static int calcOne(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int calcTwo(int n){
        if(n <= 0)
            return 0;
        return n + calcTwo(n - 1);
    }
}
