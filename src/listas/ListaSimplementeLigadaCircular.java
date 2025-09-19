
package listas;


public class ListaSimplementeLigadaCircular {
    
    
    private Nodo punta;
    

    public ListaSimplementeLigadaCircular() {
        punta = null;
    }
    

    public Nodo getPunta() {
        return punta;
    }

    public void setPunta(Nodo punta) {
        this.punta = punta;
    }
    public void insertarInicio( int dato){
        Nodo x = new Nodo (dato);
        Nodo p = punta;
        
        
        if (punta != null){
            x.setEnlace(punta);
        }
        punta = x;
    }
    public void InsertarFinal(int dato){
        Nodo x = new Nodo(dato);
        Nodo p = punta;
        if (punta==null){
            punta = x;
        }else{
            do{
                p = p.getEnlace();
            
            }while(p.getEnlace()!=punta);
                
            }
            p.setEnlace(x);
        }
    
     public void InsertarMedio(){
         
         
     }
}

