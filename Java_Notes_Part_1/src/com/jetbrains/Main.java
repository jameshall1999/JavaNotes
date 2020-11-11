package com.jetbrains;
import java.util.Arrays;
import java.util.Date;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // PRINTS
        byte myNum = 3;
        System.out.println("Hello World Again");
        System.out.println(myNum);

        // PRIMATIVE TYPES - Store simple values
        byte age = 30; // int Variable takes 4 byte of mem so using byte is better (-127 to 127)
        int viewsCount = 123_456_789; // Numbers can be split by _ to make them readable
        long longs = 3_123_456_789L; // Need to use L to show it is a long
        float price = 10.99F; // Java sees as long, F tells its a float
        char letter = 'A';
        boolean isEligible = false;

        //REFERENCE TYPES - Store complex objects (we use new them such as with arrays)
        Date now = new Date();
        System.out.println(now); // typed sout to auto generate blank system println

        //STRINGS
        String message = " Hello World" + "!!   ";
        System.out.println(message.endsWith("!!")); // Will be Ture as message ends with !!
        System.out.println(message.startsWith("!!")); // Will be False
        System.out.println(message.length()); // Print length of message - will be 13
        System.out.println(message.indexOf("e")); // Prints index of "e" - Will be 1
        System.out.println(message.replace("!", "*")); // Replace ! with *
        System.out.println(message.toLowerCase()); // Prints message as lowercase also try toUppercase
        System.out.println(message.trim()); // Removes whitespace before and after string

        //ESCAPE SEQUENCES
        String quotesPlease = "Quote --> \"me\""; // Use \ if you want to use quotes in a string
        System.out.println(quotesPlease);
        String newLine = "Put new on a \nnew line"; // newline escape
        System.out.println(newLine);

        //ARRAYS
        int[] myArray = {2, 3, 5, 1, 4}; // Created an array
        Arrays.sort(myArray); // Sorts Array
        System.out.println(myArray); // This will NOT print the array items but the memory location instead
        System.out.println(Arrays.toString(myArray)); // Will print array values

        //Multi-Dimensional Arrays
        int [][] multi = { {1,2,3},{4,5,6} }; // 2 rows with 3 columns e.g [0,0,0], [0,0,0]
        multi[0][0] = 1;
        System.out.println(Arrays.deepToString(multi)); // use deepToString for multi arrays

        //CONSTANTS
        final float PI = 3.14F;

        //ARITHMETIC EXPRESSIONS (MATHS)
        int mathNum = 3 + 2; // Can also use - * / and %
        System.out.println(mathNum);
        double decimalNum = (double)10 / (double)3; // need to use double if you don't want it to round
        System.out.println(decimalNum);
        int prioritynum = 10 + 3 * 2; // This will be 16 as * and / have higher priority. See below for fix
        System.out.println(prioritynum);
        int newprioritynum = (10 + 3) * 2; // Brackets always have highest priority (26)
        System.out.println(newprioritynum);

        //CASTING
        short x = 1;
        int y = x + 2; // This is implicit casting as java stores x as an int here not a byte under a hidden var name
        System.out.println(y);
        // convert chain - byte > short > int > long || float > double
        double v = 1.1;
        int q = (int)v + 2;
        System.out.println(q); // This is explicit casting, need to tell java that x needs to be rounded
        String toconv = "1";
        int converted = Integer.parseInt(toconv) + 2; // converts, can also do double.parseDouble or byte.parseByte ect
        System.out.println(converted);

        // MATHS CLASS
        int mathround = Math.round(1.1F);
        System.out.println(mathround); // Rounds number
        int mathceil = (int)Math.ceil(1.1F);
        System.out.println(mathceil); // Rounds up, needed to cast the float to int
        int mathfloor = (int)Math.floor(1.1F);
        System.out.println(mathfloor); // Rounds down, needed to cast the float to int
        int mathmax = Math.max(1,2);
        System.out.println(mathmax); // Print largest of the numbers, can also use min
        double mathrandom = Math.random() * 100;
        System.out.println(mathrandom); // Random number between 0 and 100, needs to be double
        double round_math_random = Math.round(Math.random() * 100);
        System.out.println(round_math_random); // Same as above but rounds to integer

        // FORMATTING NUMBERS
        NumberFormat currency = NumberFormat.getCurrencyInstance(); // var currency saved as get currency instance
        String money = currency.format(1234567.891); // Money uses the created var currency to display parameters as currency
        System.out.println(money);

        String perc = NumberFormat.getPercentInstance().format(0.1); // This does the same as above but for percentages and removes the top line making it shorter
        System.out.println(perc);

        //READING INPUT
        Scanner scanner = new Scanner(System.in); // System.in refers to the terminal so that java can read input from it
        System.out.println("TYPE YOUR AGE HERE !!!!!!!!!!!!!!!!!!!!!!");
        byte My_age = scanner.nextByte(); // Byte used for numbers
        System.out.println("You are " + My_age);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("TYPE YOUR NAME HERE !!!!!!!!!!!!!!!!!!!!!!");
        String My_name = scanner2.nextLine().trim(); // NextLine used for strings, trim is optional, gets rid of spaces before and after
        System.out.println("Your name is " + My_name);


    }
}
