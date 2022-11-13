package Lecture9.View;

import java.util.Scanner;

public class ViewHelper {
    private  static final Scanner scanner = new Scanner(System.in);
    public static void printMenu(){
        System.out.println("1 - Add client");
        System.out.println("2 - Add Tour");
        System.out.println("3 - Add Tour or client");
        System.out.println("4 - Exit");

    }
    public static String readString(){
        return scanner.next();
    }
    public static int readNumber(){
        return scanner.nextInt();
    }
    public static void printMSG(String msg){
        System.out.println(msg);
    }
}
