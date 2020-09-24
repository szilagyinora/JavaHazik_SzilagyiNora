/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat05;

/**
 * Ebben a Test osztályban 3 objektumot hozunk létre  majd megjeleníttetjük a diszkriminánson alapuló eredményt.
 * @author szila
 */
public class Test {
    public static void main(String[] args) {
        
        /**
         * Példányosítás során létrehozunk 3 új objektumot tetszőleges paraméterekkel.
         */
        QuadraticEquation qe1 = new QuadraticEquation(4, -3, 5);
        QuadraticEquation qe2 = new QuadraticEquation(-1, 8.5, 4);
        QuadraticEquation qe3 = new QuadraticEquation(2, 10.3, 7.6);
        
        /**
         * Kiíratjuk az eredményeket a képernyőre.
         */
        System.out.println("qe1 eredménye:\n" + qe1);
        System.out.println("\nqe2 eredménye:\n" + qe2);
        System.out.println("\nqe3 eredménye:\n" + qe3);
        
    }
}
