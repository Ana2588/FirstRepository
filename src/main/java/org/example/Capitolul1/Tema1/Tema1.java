package org.example.Capitolul1.Tema1;

import java.util.Scanner;

public class Tema1 {
    public static void main(String[] args) {
        myVariables ();
        //EX.1
        System.out.println("Imi place Java");
        //EX.2
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        //EX.3
        //Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic.
        int varstaAna=24;
        int diferentaVarsta=6;
        int varstaDavid= varstaAna - diferentaVarsta;
        System.out.println("Varsta lui David este: " + varstaDavid);
        //EX.4

        Scanner scannerText = new Scanner(System.in);
        System.out.print("Introduceți o propoziție: ");
        String propozitie = scannerText.nextLine();
        System.out.println("Ați introdus: " + propozitie);

        scannerText.close();

        //EX.8
        int t = 2;
        int b = 12;

        //b = t * b;
        b = t + b; //am eliminat comentariul acesta

        t = b - t;
        b = b - t;

        System.out.println(t);
        System.out.println(b);

    }
    //Ex.5
    public static void myVariables() {
        int myNumber= 77;
        System.out.println("Numar intreg:" + myNumber);
        String name="Ioana";
        System.out.println("Text:" + name);
        boolean myBool = true;
        System.out.println("Boolean:" + myBool);
    }

}
