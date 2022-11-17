package Lecture9.View;

import java.util.Scanner;

public class ViewHelper {
    private  static final Scanner scanner = new Scanner(System.in);
    public static void printMenu(){
        System.out.println("1 - Add client");
        System.out.println("2 - Add Tour");
        System.out.println("3 - Add Tour or client");
        System.out.println("4 - Delete order");
        System.out.println("5 - Find tours by client");
        System.out.println("6 - Exit");

    }
    public static String readString(String msg){
        System.out.println("Enter " + msg);
        return scanner.next();
    }
    public static int readNumber(String msg){
        System.out.println("Enter " + msg);
        return scanner.nextInt();
    }
    public static boolean readBoolean(String msg){
        System.out.println(" Is client have " + msg);
        return scanner.nextBoolean();
    }
    public static void printMSG(String msg){
        System.out.println(msg);
    }
}
