/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author jacop
 */
public class Libro extends Pubblicazione{
    private String autore;
    private int nPagine;
    private boolean disponibile;
    
    public Libro(String titolo, int annoP, String autore, int nPagine, boolean disponibile){
        super(titolo, annoP);
        this.autore=autore;
        this.nPagine=nPagine;
        this.disponibile=disponibile;
    }

    public int getnPagine() {
        return nPagine;
    }

    public String getAutore() {
        return autore;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    @Override
    public String toString() {
        return "Libro{" +super.toString()+ "autore=" + autore + ", nPagine=" + nPagine + ", disponibile=" + disponibile + '}';
    }
    
}
