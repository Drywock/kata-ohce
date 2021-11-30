package net.efrei.ohce;

public class Reverser {
    public static  String reverse(String inputString) {
        StringBuilder sb = new StringBuilder();
        final String reversedString = sb.append(inputString).reverse().toString();

        return reversedString.equals(inputString) ? reversedString+"\nBonita Palabra" : reversedString;
    }
}
