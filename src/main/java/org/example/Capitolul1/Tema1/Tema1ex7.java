package org.example.Tema1;

import java.util.Scanner;

public class Tema1ex7 {
    public static void main(String[] args) {
        Scanner citire = new Scanner(System.in);

        System.out.print("Introduceți un număr: ");
        double numar = citire.nextDouble();

        System.out.println("Rezultatul sumei cu 5: " + (numar + 5));
        System.out.println("Rezultatul scăderii cu 12.3: " + (numar - 12.3));
        System.out.println("Rezultatul înmulțirii cu -3.2: " + (numar * -3.2));
        System.out.println("Rezultatul împărțirii cu 4: " + (numar / 4));
        System.out.println("Rezultatul modulului cu 6: " + (numar % 6));

        citire.close();

    }
}
