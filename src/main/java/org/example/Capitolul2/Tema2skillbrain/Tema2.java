package org.example.Capitolul2.Tema2skillbrain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Tema2 {
    public static void cerinta1() {
        Scanner citire = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int numar = citire.nextInt();
        citire.close();

        //Random randomNr = new Random();
        //int numarRandom = randomNr.nextInt();
        int numarRandom = (int) (Math.random() * 101);
        System.out.println("Numarul introdus: " + numar);
        System.out.println("Numarul generat aleatoriu: " + numarRandom);

        if (numar < numarRandom) {
            System.out.println("Numarul introdus" + numar + "este mai mic decat " + numarRandom);
        } else {
            System.out.println("Numarul este mai mare.");
        }

    }
    public static void cerinta2() {
        Scanner citire2 = new Scanner(System.in);
        System.out.println("Introduceti un caracter ('a','s','i','p','m'):");
        char caracter = citire2.next().charAt(0);
        System.out.println("Introduceti primul numar:");
        int numar1 = citire2.nextInt();
        System.out.println("Introduceti al doilea numar:");
        int numar2 = citire2.nextInt();

        int rezultat;
        switch (caracter) {
            case 'a':
                rezultat = numar1 + numar2;
                System.out.println("Rezultatul adunarii:" + rezultat);
                break;
            case 's':
                rezultat = numar1 - numar2;
                System.out.println("Diferenta celor doua numare este: " + rezultat);
                break;
            case 'i':
                rezultat = numar1 * numar2;
                System.out.println("Inmultirea celor doua numere este: " + rezultat);
                break;
            case 'p':
                rezultat = numar1 / numar2;
                System.out.println("Impartirea celor doua numere este: " + rezultat);
                break;
            case 'm':
                rezultat = numar1 % numar2;
                System.out.println("Modulul celor doua numere este: " + rezultat);
                break;
            default:
                System.out.println("Caracterul introdus nu este valid.");
        }
    }
    public static void cerinta3() {
        int[][] numbers = {{1,2,3,4,5}, {11,12,13,14,15},{21,22,23,24,25}};
        System.out.println("Primele elemente: " +(numbers[0][0]) + " si " + (numbers[0][1]));
        System.out.println("Ultimele elemente: " + (numbers[2][3]) + " si " + (numbers[2][4]));
    }


    public static void cerinta4() {
        char[] arrayC = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        for (int i = 0; i < arrayC.length; i += 2) {
            System.out.println("Numarul de pe pozitia " + i + " este " + arrayC[i]);
        }

    }
    public static void cerinta5() {
        double[] arrayD = {2.5, 4.5, 6.7, 8.4};
        for (int i = 0; i < arrayD.length; i++) {
            if (arrayD[i] == 4.5) {
                System.out.println("Afiseaza pe ecran elementul " + arrayD[i] + " este egal cu 4.5");
            }
            if (arrayD[i] > 5) {
                System.out.println("Elementul peste 5 " + arrayD[i]);
            }
        }
    }

    public static void cerinta6() {
        int[] elemente = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < elemente.length; i++) {
            if (i == 2) {
                continue;
            } else if (i == 7) {
                break;
            } else {
                System.out.println("Index valid:" + i);
            }
        }
    }

    public static void cerinta7() {
        ArrayList<Integer> listaInt = new ArrayList<Integer>();
        listaInt.add(1);
        listaInt.add(4);
        listaInt.add(10);
        listaInt.add(20);
        listaInt.add(15);
        int suma = 0;
        for (Integer i : listaInt) {
            suma += i;
        }
        System.out.println("Suma tuturor elementelor: " + suma);
    }
    public static void cerinta8() {
        int[] numbers1 = {2, 4, 6};
        boolean arrayGol = numbers1.length == 0;
        System.out.println("Array-ul este gol: " + arrayGol);
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(10);
        numbers2.add(5);
        numbers2.add(15);
        boolean listaGoala = numbers2.isEmpty();
        System.out.println("Lista este goala: " + listaGoala);
    }

    public static void cerinta9() {
        ArrayList<Integer> liste = new ArrayList<Integer>();
        liste.add(20);
        liste.add(120);
        liste.add(50);
        liste.add(110);
        liste.add(190);

        Collections.sort(liste);
        System.out.println("Elementele din array aranjate in original:" + liste);

        Collections.sort(liste, Collections.reverseOrder());
        System.out.println("Elementele din array aranjate descrecator: " + liste);


        Integer[] liste2 = {2, 14, 5,24, 77,7, 709};
        Arrays.sort(liste2);
        System.out.println("Sortare crescatoare" + Arrays.toString(liste2));


        Arrays.sort(liste2, Collections.reverseOrder());
        System.out.println("Sortare descrescatoare: " + Arrays.toString(liste2));
    }


}

