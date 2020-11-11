package com.jetbrains;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // COMPARISON OPERATORS ( == != <= >= )
        int x = 1;
        int y = 1;
        System.out.println(x == y); // Outputs True
        System.out.println(x != y); // Outputs False

        // LOGICAL OPERATORS ( AND:&& OR:|| NOT:! )
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; // AND operator &&
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; // !hasCriminalRecord checks for not having record
        System.out.println(isEligible);

        // IF STATEMENTS
        int temp = 32;
        if (temp > 30) {
            System.out.println("its a hot day"); // Watch out for the {} and indentation
        } else if (temp > 20)
            System.out.println("Nice day");
        else
            System.out.println("cold day");

        // SIMPLIFYING IF STATEMENTS
        int income = 120_000;
        boolean hasBigIncome;
        if (income > 100_000) // Note that we did not need {} after the if here but we did need to declare the variable outside the if first otherwise it cant be accessed from outside.
            hasBigIncome = true;
        else
            hasBigIncome = false;
        System.out.println(hasBigIncome);

        // EVEN SIMPLER WAY TO DO IF
        int counters = 100;
        boolean hasMostCounters = counters > 90; // This is a short way to do same as previous 2 IF's
        System.out.println(hasMostCounters);

        // THE TERNARY OPERATOR ( [condition value] [first value] : [other value])
        int customerPoints = 46;
        String className = customerPoints < 40 ? "Basic Membership" : "Premium Membership"; // Same as if, if points < 40 then basic membership otherwise premium membership
        System.out.println(className);

        // SWITCH STATEMENTS
        String role = "moderator"; // Same as if, elif and else

        switch (role) {
            case "admin":
                System.out.println("you are an admin");
                break;

            case "moderator":
                System.out.println("You are a moderator");
                break;

            default:
                System.out.println("You are a guest");
        }
        // FOR LOOPS
        for (int i = 0; i < 5; i++)
            System.out.println("Hello"); // Prints hello while i is < 5 but 1 gets added to i after every loop

        // WHILE LOOPS
        Scanner scanner = new Scanner(System.in); // Scanner outside loop so it isn't created multiple times
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Type Quit to exit the program");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        // DO WHILE LOOPS
        Scanner scanner2 = new Scanner(System.in);
        String input2 = "";
        do {
            System.out.println("Type Quit to exit the program (DO WHILE)"); // Does same as above but gets executed at least once
            input2 = scanner2.next().toLowerCase();
            System.out.println(input2);
        } while (!input2.equals("quit"));

        // BREAK AND CONTINUE
        Scanner scanner3 = new Scanner(System.in);
        String input3 = "";
        while (true) {
            System.out.println("Type Quit to exit the program (BREAKS AND CONTINUE)");
            input3 = scanner3.next().toLowerCase();
            if (input3.equals("pass")) // Continue will loop back to top of loop
                continue;
            if (input3.equals("quit")) // Break will end the loop
                break;
            System.out.println(input3);
        }

        // FOR EACH LOOPS (iterate over arrays)
        String[] fruits = {"Apple", "Banana", "Orange"};
        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        for (String fruit : fruits)
            System.out.println(fruit);
    }
}
