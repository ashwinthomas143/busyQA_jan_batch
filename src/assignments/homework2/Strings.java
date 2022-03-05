//Provided by Thomas Ashwin Varghese
// To BusyQA - Simran and Harsha

package assignments.homework2;

import org.w3c.dom.ls.LSOutput;

public class Strings {
    public static void main(String[] args) {

        String string1 = "string 1";
        String string2 = "string 1";
        String string3 = "string  2";
        System.out.println();

        System.out.println("String 1 : " + string1);
        System.out.println("String 2 : " + string2);
        System.out.println("String 3 : " + string3);
        System.out.println("String 1 equals String 2 : " + (string1 == string2));
        System.out.println("String 1 equals String 3 : " + (string1 == string3));
        System.out.println();

        //Concat
        String part1 = string1.concat(string2);
        System.out.println("Concatenation of string 1 and 2 : " + part1);
        String part2 = part1.concat(string3);
        System.out.println("Concatenation of string 1,2 and 3 : " + part2);
        System.out.println();

        //Length
        System.out.println("The length of string 1 : " + string1.length());
        System.out.println("The length of string 2 : " + string2.length());
        System.out.println("The length of string 3 : " + string3.length());
        System.out.println();

        //Substring
        String subpart2 = part2.substring(0, 8);
        System.out.println("Use of substring to give back string1 : " + subpart2);
        System.out.println();

        //Uppercase
        System.out.println("Use of uppercase : " + string3.toUpperCase());
        System.out.println();

        //Lowercase
        System.out.println("Use of lowercase : " + string3.toLowerCase());
        System.out.println();

        //Reverse a String
        char a;
        String reversedstring = "";
        for (int i = part2.length() - 1; i >= 0; i--) {
            a = part2.charAt(i);
            reversedstring = reversedstring + a;
        }

        System.out.println("The reverese of concatenation of string 1,2 and 3 : " + reversedstring);
        System.out.println();

        //Count repeated characters:
        char letter = 's';

        int count = 0;
        for (int i = 0; i <= part2.length() - 1; i++) {
            if (letter == part2.charAt(i)) {
                count++;
            }
        }

        System.out.println("Concatenation of string 1,2 and 3 : " + part2);
        System.out.println("The letter " + letter + " appears a total of " + count + " times in the above displayed string.");
        System.out.println();

        //Word Counter
        String sentence = "These are the words I am typing";
        int wordCount = 0;
        char space = ' ';
        for (int i = 0; i < sentence.length() - 1; i++) {
            if (space == sentence.charAt(i)) {
                wordCount++;
            }
        }
        System.out.println("Sentence : " + sentence);
        System.out.println("There are " + wordCount + " words in the above sentence");
        System.out.println();

        //Convert Integer to String
        Integer xyz = 233;
        String xyzstring = Integer.toString(xyz);
        System.out.println("Type of 233 initially : " + xyz.getClass());
        System.out.println("Type of 233 finally : " + xyzstring.getClass());
        System.out.println();

        //Convert String to Integer
        String zyx = "233";
        Integer zyxinteger = Integer.parseInt(zyx);
        System.out.println("Type of 233 initially : " + zyx.getClass());
        System.out.println("Type of 233 finally : " + zyxinteger.getClass());
        System.out.println();

        //Space Deleter
        String sentence1 = "These are the words I am typing";
        char space1 = ' ';
        String sentencenospace = "";
        for (int i = 0; i < sentence1.length() - 1; i++) {
            if (space1 != sentence1.charAt(i)) {
                sentencenospace += sentence1.charAt(i);
            }
        }
        System.out.println("Sentence : " + sentence1);
        System.out.println("Sentence without space : " + sentencenospace);
        System.out.println();


        //Palindrome Checker

        String word = "sdfsdfsd";
        String reversedword = "";
        boolean flag = false;

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedword += word.charAt(i);

        }
        System.out.println("The entered word is : " + word);
        System.out.println("The reversed word is : " + reversedword);

        System.out.println("Is the word equal to the reversed word ?  " + word.equals(reversedword));

    }


}


