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

    public static String drawPatternOne(char[] pattern, int repeatCount){
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < repeatCount){
            int j = 0;
            while (j < pattern.length){
                result.append(pattern[j]);
                j++;
            }
            i++;
        }
        return result.toString();
    }

    public static String drawPatternTwo(char[] pattern, int repeatCount) {
        StringBuilder result = new StringBuilder();
        int i = repeatCount;
        while (i > 0) {
            int j = 0;
            while (j < pattern.length) {
                result.append(pattern[j++]);
            }
            i--;
        }
        return result.toString();
    }

    public static String drawPatternFour(char[] pattern, int repeatCount) {
        String result = "";

        int line = 0;
        while(line < repeatCount) {
            int i = 0;
            while(i < pattern.length) {
                result += pattern[i];
                i++;
            }
            result += "";
            line++;
        }
        return result;
    }


}
