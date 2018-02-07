package Prog1_Test;

import java.util.Arrays;

public class Palindrom_test {
    public static void main(String[] args){
        String testStrings[] = {"lagerregal", "otto", "Lagerregal", "LagerXregal", "Otto", "OtXto", "Test"};
        String[] strings = new String[testStrings.length];
        for (int i = 0; i < testStrings.length; i++) {
            strings[i] = testStrings[i].toLowerCase();
        }
        for (int i = 0; i < strings.length; i++) {
            if (palindromTest(strings[i].toCharArray())) System.out.println(strings[i] + " ist ein Palindrom");
            if (!(palindromTest(strings[i].toCharArray()))) System.out.println(strings[i] + " ist KEIN Palindrom");
        }
    }
static boolean palindromTest(char[] word){
        for (int i = 0; i <= (word.length / 2); i++){
            if (word[i] != word[word.length - 1 - i])
                    return false;
        }
        return true;
        }
}
