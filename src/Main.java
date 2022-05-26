import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = sc.nextLine();
        System.out.println("Hello " + name + "! Do you have account with us?");
        String account = sc.nextLine();
        if (account.equals("yes")) {
            System.out.println("Great! Please enter your account number!");
        } else if (account.equals("no")) {
            System.out.println("Do you want to create a new account?");
        } else {
            System.out.println("Please contact our customer support.");
        }


        String reply =sc.nextLine();
        System.out.println("Thank you!");
        //needed to have entry, but no need to show. Other way?

        System.out.println("Can I help you with anything else?");
        String q = sc.nextLine();
        if (q.equals("yes")) {
            System.out.println("What is your question?");
        } else  {
            System.out.println("Have a good day!");
        }


    }
}