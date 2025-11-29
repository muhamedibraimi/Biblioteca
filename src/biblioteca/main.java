/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

/**
 *
 * @author jacop
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Libro l1 = new Libro ("La guerra", 1998, "Arthur Kodeck", 341, true);
       Libro l2 = new Libro ("Distanza in pochi", 2025, "Aurora Fiacchetti", 165, true);
       Rivista r1 = new Rivista("Vogue", 2025, 5, 6);
       Biblioteca b1 = new Biblioteca(3);
       System.out.println(r1.getTitolo());
       b1.aggiungiPub(r1);
       b1.aggiungiPub(l2);
       b1.aggiungiPub(l1);
       System.out.println(b1.toString());
       System.out.println(b1.cercaPub("Vogue"));
    }
    
}
