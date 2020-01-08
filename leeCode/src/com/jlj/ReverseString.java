package com.jlj;

public class ReverseString {

    public static String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder("");
        int index = 0;
        StringBuilder result = new StringBuilder("");
        while (index < s.length()){
            if (s.charAt(index) != ' '){
                stringBuilder.append(s.charAt(index));
            } else {
                result.append(stringBuilder.reverse().toString()).append(' ');
                stringBuilder.delete(0, stringBuilder.length());
            }
            index++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        reverseWords("Let's take LeetCode contest");
    }
}
