package biblioteca;

/**
 * @author jacop
 */
public class Biblioteca {
    private Pubblicazione[] p;
    private int nPub;
    
    public Biblioteca(int num){
        p = new Pubblicazione[num];
        nPub=0;
    }
    public void aggiungiPub(Pubblicazione pub){
        if(nPub<p.length){
            p[nPub]=pub;
            nPub++;
        }
    }
    public Pubblicazione cercaPub(String titolo){
        Pubblicazione ris= null;
        for(int i = 0; i<nPub && ris == null; i++){
            if(p[i].titleSearch(p[i].getTitolo())){
                ris=p[i];
            }
        }
        return ris;
    }
    public Libro presta(String t){
        Libro l= null;
        Pubblicazione pub = cercaPub(t);
        if (pub instanceof Libro) {
            l = (Libro) pub; 
        }
        return l;
    }

    @Override
    public String toString() {
        String txt = "";
        for(int i = 0; i<nPub;i++){
           txt+= "\n##"+ p[i].toString();
        }
        return txt;
    }
    
}
