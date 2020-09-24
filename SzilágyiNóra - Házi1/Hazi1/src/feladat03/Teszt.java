/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat03;

/**
 * Ebben a Teszt osztályban létrehozunk két Rectangle típusú objektumot adott paraméterekkel.
 * Ezután kiíratjuk az egyes téglalapok szélességét, magasságát, területét és kerületét ebben a sorrendben a standard kimenetre.
 * @author szila
 */
public class Teszt {
    public static void main(String[] args) {
        
        /**
         * Példányosítás során létrehozunk 2 új objektumot.
         */
        Rectangle r1 = new Rectangle(4,40);
        Rectangle r2 = new Rectangle(3.5,35.9);
        
        /**
         * Kiíratjuk az objektumokat a képernyőre.
         */
        System.out.println("r1" + r1);
        System.out.println("r2" + r2);
        
    }
}
