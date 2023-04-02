package day12_switch_statements;

import java.util.Scanner;

/*  Ask a user to enter Browser
     * */
public class Browser {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your browser: ");
        String browser=input.next();

        System.out.println("Enter a URL: ");
        String URL= input.next();

        switch (browser) {
            case "chrome" :
            case "Chrome" :
            case "CHROME" :
                System.out.println("Going into the " +URL+ " in " + browser + " browser");
                break;
            case "edge" :
                System.out.println("Going into the " +URL+ " in " + browser + " browser");
                break;
            case "safari" :
                System.out.println("Going into the " +URL+ " in " + browser + " browser");
                break;
            case "firefox" :
                System.out.println("Going into the " +URL+ " in " + browser + " browser");
                break;
            default:
                System.out.println(browser + "is invalid browser type");
        }

    }
}
