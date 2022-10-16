package Lecture1;

public class Main {
    static int x = 1;
    static  int y = 1;
    public static void who(int n){
        int count = 0;
        while ( n != 1) {
             n = n % 2 == 0 ? (n / 2) : (n * 3) + 1;
             count++;
            System.out.println(n);
        }
        System.out.println("Iteration number: " + count);

    }
    static{
        System.out.println("S1");
    }
    static{
        System.out.println("S2");
    }
    {
        System.out.println("constr block");
    }
    Main(){
        System.out.println("Constructor");
    }
    public static void main(String...args){


        y = ++x;
        System.out.println(y);
        System.out.println(y);
        who(10);
        Main n = new Main();
    }
}
