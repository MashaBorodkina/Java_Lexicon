package se.lexicon.mb.JavaFundamental_Part1;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = "Maria ";
        System.out.println("Hello");
        System.out.println(name);
        System.out.println("Hello\n" + name);
        getUserInput();
        calculate();
        getArithmeticMean ();
        getUserName();
        calculateNew();
        guessNumber();
        dateTime();
    }

    public static void getUserInput() {
        System.out.println("Enter a year");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "Year is a leap");
        } else {
            System.out.println(year + "Year is a nor leap");
        }
    }

    public static void calculate() {

        //Sum
        System.out.println("Enter your first number for adding");
        int add1 = scanner.nextInt();
        System.out.println("Enter your second number for adding");
        int add2 = scanner.nextInt();
        System.out.println(add1 + "+" + add2 + "=" + (add1 + add2));

        //Multiplication
        System.out.println("Enter your first number for multiplication");
        int mult1 = scanner.nextInt();
        System.out.println("Enter your second number for multiplication");
        int mult2 = scanner.nextInt();
        System.out.println(mult1 + "*" + mult2 + "=" + (mult1 * mult2));

        //Division
        System.out.println("Enter your first number for division");
        int div1 = scanner.nextInt();
        System.out.println("Enter your second number for division");
        int div2 = scanner.nextInt();
        if (div2 != 0) {
            System.out.println(div1 + "/" + div2 + "=" + (div1 / div2));
        } else {
            System.out.println("Cannot divided by zero");
        }
        //Subtraction
        System.out.println("Enter your first number for subtraction");
        int sub1 = scanner.nextInt();
        System.out.println("Enter your second number for subtraction");
        int sub2 = scanner.nextInt();
        System.out.println(sub1 + "-" + sub2 + "=" + (sub1 - sub2));
    }

    public static void getArithmeticMean (){
        System.out.println("Enter your first number");
        int num01 = scanner.nextInt();
        System.out.println("Enter your second number for subtraction");
        int num02 = scanner.nextInt();
        System.out.println("Enter your third number for subtraction");
        int num03 = scanner.nextInt();
        System.out.println("Enter your fourth number for subtraction");
        int num04 = scanner.nextInt();
        if (num04 != 0) {
            System.out.println("(" + num01 + "+" + num02 + "+" + num03 + ")" + "/" + num04 + "=" + ((num01+num02+num03)/num04));
        } else {
            System.out.println("Cannot divided by zero");
        }
    }

    public static void getUserName() {
        System.out.println("Enter your first name");
        String name = scanner.nextLine();
        if (!name.trim().isEmpty()) {
            System.out.println("Hello " + name);
        } else {
            System.out.println("Goodbye!");
        }
    }
    public static void calculateNew() {

        System.out.println("Enter your first number for calculating");
        int value1 = scanner.nextInt();
        System.out.println("Enter your second number for calculating");
        int value2 = scanner.nextInt();
        System.out.println(value1 + "+" + value2 + "=" + (value1 + value2));
        System.out.println(value1 + "-" + value2 + "=" + (value1 - value2));
        System.out.println(value1 + "*" + value2 + "=" + (value1 * value2));
        if (value2!=0) {
            System.out.println(value1 + "/" + value2 + "=" + (value1 / value2));
        } else {
            System.out.println("Cannot to divided by zero");
        }
    }

    public static void guessNumber() {
        int randomInt = (int) (Math.random() * 500) + 1;
        int userInt = 0;
        while(userInt != randomInt) {
            System.out.println("Enter a number from 1 to 500 to guess what the computer has thought of");
            userInt = scanner.nextInt();
            if(userInt<randomInt) {
                System.out.println("Your number " + userInt + ";" + "your guess was too small. Try again" );
            } else if (userInt>randomInt) {
                System.out.println("Your number " + userInt + ";" + "your guess was too big. Try again" );
            } else {
                System.out.println("Your number " + userInt + ";" + "Yes! You guessed it!" );
            }

        }
    }

    public static void dateTime() {
        System.out.println("Enter any number two digits or more");
        int time = scanner.nextInt();
        int hour = time / 3600;
        int min = (time % 3600) / 60;
        int sec = time % 60;

        System.out.printf("%02d:%02d:%02d", hour, min, sec);
    }
}

