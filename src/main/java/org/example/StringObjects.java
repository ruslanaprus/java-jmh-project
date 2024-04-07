package org.example;

public class StringObjects {

    public static String drawQuadOne(int n) {
        StringBuilder square = new StringBuilder();

        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                square.append("*");
                j++;
            }
            square.append("\n");
            i++;
        }

        return square.toString();
    }

    public static String drawQuadTwo(int n) {
        String result = "";

        int lines = n;

        while(lines > 0) {
            lines--;

            int columns = n;
            while(columns > 0) {
                result += "*";
                columns--;
            }

            result += "\n";
        }

        return result;
    }

}
