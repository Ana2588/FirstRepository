package org.example.Tema1;

import java.util.Scanner;

public class Tema1ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți primul număr: ");
        int primulNumar = scanner.nextInt();

        System.out.print("Introduceți al doilea număr: ");
        int alDoileaNumar = scanner.nextInt();

        System.out.println("Ati introdus primul număr: " + primulNumar);
        System.out.println("Ati introdus al doilea număr: " + alDoileaNumar);

        scanner.close();
    }
}
