package se.lexicon;

import java.util.Arrays;

public class StringExercises {
    public static void main(String[] args) {
        // Exercise 1: length of the String "Java" is 4.
        String str = "Java";
        System.out.println(str.length());

        // Exercise 2: The 6th index in the string "Long example sentence" is x
        String str2 = "Long example sentence";
        System.out.println(str2.charAt(6));

        // Exercise 2.5: o in Even "longer example sentence" has the index 6
        String str25 = "Even longer example sentence";
        System.out.println(str25.indexOf("o"));

        // Exercise 3
        String str3 = "Ok this is not as long";
        System.out.println(str3.substring(11, 22));

        // Exercise 4
        String str4 = "CAPS EQUALS SCREAMING";
        String str4LowerCase = str4.toLowerCase();
        System.out.println(str4LowerCase);
        String str4UpperCase = str4LowerCase.toUpperCase();
        System.out.println(str4UpperCase);

        // Exercise 5
        String str5 = "Java is the worst programming language!";
        String str5CorrectVersion = str5.replace("worst", "best");
        System.out.println(str5CorrectVersion);

        // Exercise 6 the output of "\tJ\ta\tv\ta\t" after trimming it is "J  a  v  a"
        String str6 = "\tJ\ta\tv\ta\t";
        System.out.println(str6.trim());

        // Exercise 7
        int exer7 = 20;
        String str7 = String.valueOf(exer7);
        System.out.println("String after parsing int to it: " + str7);
        str7 = str7.concat("20");
        System.out.println("String after adding 20 to it: " + str7);

        // Exercise 8
        String str8 = "Oil and Water";
        String[] str8Arr = str8.split("and");
        System.out.println("Oil: " + str8Arr[0]);
        System.out.println("Water: " + str8Arr[1].trim());

        // Exercise 9
        String str9 = "Carl,Susie,Fredrick,Bob,Erik";
        String[] str9NameArr = str9.split(",");
        for (String item : str9NameArr){
            System.out.println(item);
        }

        // Exercise 10
        String str10 = "ThisShouldBeConverted";
        char[] str10CharArr = str10.toCharArray();
        for (char character : str10CharArr){
            System.out.println(character);
        }

        // Exercise 11
        char[] exercise11CharArr = {'J','a','v','a'};

        String str11 = new String(exercise11CharArr);
        System.out.println("Creating a new string and adding the array as a argument to the constructor: " + str11);

        String str11ValueOf = String.valueOf(exercise11CharArr);
        System.out.println("String.valueOf: " + str11ValueOf);



    }
}
