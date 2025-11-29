/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author jacop
 */
public class Pubblicazione {
    private String titolo;
    private int annoP;

    public Pubblicazione(String titolo, int annoP){
        this.titolo=titolo;
        this.annoP=annoP;
    }

    public int getAnnoP() {
        return annoP;
    }

    public String getTitolo() {
        return titolo;
    }
    public boolean titleSearch(String t){
        return this.titolo.equalsIgnoreCase(t);
    }
    public String toString() {
        return "Pubblicazione{" + "titolo=" + titolo + ", annoP=" + annoP + '}';
    }
    
    
}
