package se.lexicon.mb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Workshop_Part2 {

    static Scanner scanner = new Scanner (System.in);

    static double number = 0;
    static double result = 0;
    static int choice = 0;

    public static void main(String[] args) {
        exchangeResult();
    }

    public static void exchangeResult(){
        while (true){
              String menu = """
                Currency Converter App
                1. Convert SEK to USD
                2. Convert USD to SEK
                3. Convert SEK to Euro
                4. Convert Euro to SEK
                0. Exit
                """;
        System.out.println(menu);

        int choice = getIntInput ("Enter your choice:");
        switch (choice) {
                   case 0:
                       System.out.println("Goodbye!");
                       return;
                   case 1:
                       System.out.println("Enter amount in SEK");
                       double sek1 = getDoubleInput();
                       double usd1 = sek1 * 0.104;
                       getDateTimeComponents();
                       System.out.print("Amount USD: " + usd1);
                       break;
                   case 2:
                       System.out.println("Enter amount in USD");
                       double usd2 = getDoubleInput();
                       double sek2 = usd2 * 9.66;
                       getDateTimeComponents();
                       System.out.print("Amount SEK: " + sek2);
                       break;
                   case 3:
                       System.out.println("Enter amount in SEK");
                       double sek3 = getDoubleInput();
                       double euro3 = sek3 * 11.07;
                       getDateTimeComponents();
                       System.out.print("Amount EUR: " + euro3);
                       break;
                   case 4:
                       System.out.println("Enter amount in EUR");
                       double euro4 = getDoubleInput();
                       double sek4 = euro4 * 0.090;
                       getDateTimeComponents();
                       System.out.print("Amount EUR: " + euro4);
                       break;
                   default:
                       System.out.println("Invalid choice. Try again");
               }
                      if(!getAnswer()) {
                          System.out.println("Goodbye!");
                          return;
                      }
            }
        }
    public static int getIntInput(String message) {
        while (true) {
            System.out.println(message);
            String input = scanner.next();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a valid number (0-4)");
            }
        }
    }
    public static double getDoubleInput() {
        while (true) {
            String input = scanner.next();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount. Please enter a valid number:");
            }
        }
    }

        public static boolean getAnswer () {
        while(true) {
            System.out.println("\n Continue? (y/n):");
            String answer = scanner.next();
          switch (answer.toLowerCase()) {
              case "y":
                  return true;
              case "n":
                      return false;
              default:
                  System.out.println("Invalid answer. Please enter 'y' or 'n'");
          }
          }
        }
    public static void getDateTimeComponents(){
        LocalDateTime current = LocalDateTime.now();
        LocalDate dateComp= current.toLocalDate();
        LocalTime timeComp = current.toLocalTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm");
        String formaterTime = timeComp.format(formatter);
        System.out.println("date:" + dateComp);
        System.out.println("time:" + formaterTime);
    }

    }




