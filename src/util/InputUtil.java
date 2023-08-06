package util;

import java.util.Scanner;

public class InputUtil {
    public static int intInput(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        return scanner.nextInt();
    }
    public static String stringInput(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        return scanner.nextLine();
    }
    public static double doubleInput(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        return scanner.nextDouble();
    }

}
