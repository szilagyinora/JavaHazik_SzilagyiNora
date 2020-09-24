/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat06;

/**
 * Ebben a Teszt osztályban létrehozunk 3 különböző egyenletrendszer objektumot, 
 * majd megjelenítjük mindhárom esetben a megoldást.
 * @author szila
 */
public class Teszt {
    public static void main(String[] args) {
        
        /**
         * Példányosítás során létrehozunk 3 új objektumot tetszőleges paraméterekkel.
         */
        LinearEquation le1 = new LinearEquation(0,0,0,0,0,0);
        LinearEquation le2 = new LinearEquation(1,2,3,4,5,6);
        LinearEquation le3 = new LinearEquation(21,30,22,45,10,2);
        
        /**
         * Kiíratjuk az eredményeket a képernyőre.
         */
        System.out.println("le1 esetében: " + le1);
        System.out.println("\nle2 esetében: " + le2);
        System.out.println("\nle3 esetében: " + le3);
        
    }
}
