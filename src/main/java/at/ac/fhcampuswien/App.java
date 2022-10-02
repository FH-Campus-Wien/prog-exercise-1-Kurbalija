package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901\n" +
                "         __\n" +
                " _(\\    |@@|\n" +
                "(__/\\__ \\--/ __\n" +
                "   \\___|----|  |   __\n" +
                "       \\ }{ /\\ )_ / _\\\n" +
                "       /\\__/\\ \\__O (__\n" +
                "      (--/\\--)    \\__/\n" +
                "      _)(  )(_\n" +
                "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
      char z1 = 'Z';
      int z2 = 0xface;
      int z3 = 012;
      long z4 = 80L;
      double z5 = 44e-1f;
      float z6 = 5.5f;
      double z7 = 8.88e1;
      double z8 = 99.9;

      int sum = (int)z1 + z2 + z3 + (int)z4 + (int)z5 + (int)z6 + (int)z7 + (int)z8;
      System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner eingabe = new Scanner(System.in);
        int zahl1 = eingabe.nextInt();
        int zahl2 = eingabe.nextInt();
        int ergebnis = zahl1 + zahl2;
        System.out.println(ergebnis);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = eingabe.nextInt();
        System.out.print("y: ");
        int y = eingabe.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap:");
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner eingabe = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = eingabe.nextInt();
        System.out.print("n2: ");
        int n2 = eingabe.nextInt();
        if (n1 > n2) {
            System.out.println("n1 > n2");
        }
        if (n1 < n2) {
            System.out.println("n2 > n1");
        }
        if (n1 == n2) {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int zahl = eingabe.nextInt();
        if (zahl < 0 || zahl >= 100000) {
            System.out.println("Invalid Revenue");
        } else {
            if (zahl < 20000) {
                System.out.println("Poor Sales Revenue");
            }
            if (zahl >= 20000 && zahl < 50000) {
                System.out.println("Average Sales Revenue");
            }
            if (zahl >= 50000 && zahl < 80000) {
                System.out.println("Good Sales Revenue");
            }
            if (zahl >= 80000) {
                System.out.println("Excellent Sales Revenue");
            }
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int zahl = eingabe.nextInt();
        switch (zahl) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;
        }
    }

    //todo Task 9
    public void leapyear(){
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Year: ");
        int jahr = eingabe.nextInt();
        if (jahr % 4 == 0 && jahr % 400 == 0)  {
            if (jahr % 100 == 0 && jahr % 400 != 0) {
                System.out.println("Not a Leapyear");
            } else {
                System.out.println("Leapyear");
            }
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner eingabe = new Scanner(System.in);
        while (true) {
            System.out.print("Number: ");
            int zahl = eingabe.nextInt();
            if (zahl < 1000) {
                int a = zahl % 10;
                zahl = zahl / 10;
                int b = zahl % 10;
                zahl = zahl / 10;
                int c = zahl % 10;
                System.out.printf("%d%d%d\n", a, b, c);
                break;
            }
        }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();

    }
}