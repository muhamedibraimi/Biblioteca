/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author jacop
 */
public class Rivista extends Pubblicazione{
    private int meseP;
    private int numP;
    
    public Rivista(String titolo, int annoP, int meseP, int numP){
        super(titolo, annoP);
        this.meseP=meseP;
        this.numP=numP;
    }

    @Override
    public String toString() {
        return "Rivista{" + super.toString()+ "meseP=" + meseP + ", numP=" + numP + '}';
    }
    
}
