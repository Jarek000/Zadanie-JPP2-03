package pl.sda;

import java.util.Scanner;

public class Main {
    public  static  void  bdf () {
        System.out.println ("bdf");}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz ciąg: ");
        char[] litery = scanner.nextLine().toCharArray();
        System.out.print("Odwrócony ciąg: ");
        for (int i = litery.length - 1; i >= 0; i--) {
            System.out.print(litery[i]);

        }
        System.out.print("\n");
        bdf();
    }

    }

