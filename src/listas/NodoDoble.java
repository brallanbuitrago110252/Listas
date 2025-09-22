
package listas;


public class NodoDoble {
    private int dato;
    NodoDoble ligaI;
    NodoDoble ligaD;

    public NodoDoble(int dato, NodoDoble ligaI, NodoDoble ligaD) {
        
        
        this.dato = dato;
        this.ligaI = ligaI;
        this.ligaD = ligaD;
        
        
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoDoble getLigaI() {
        return ligaI;
    }

    public void setLigaI(NodoDoble ligaI) {
        this.ligaI = ligaI;
    }

    public NodoDoble getLigaD() {
        return ligaD;
    }

    public void setLigaD(NodoDoble ligaD) {
        this.ligaD = ligaD;
    }
    
    
    
            
        
        
    
}
