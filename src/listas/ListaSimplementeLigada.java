
package listas;


public class ListaSimplementeLigada {
    private Nodo punta;

    public ListaSimplementeLigada() {
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
            while(p.getEnlace()!=null){
                p = p.getEnlace();
            }
            p.setEnlace(x);
        }
        
    }
    
   
    public void MostrarDatos()
    {
        Nodo p = punta;
        if(punta==null)
        {
            System.out.println("La lista esta vacia ");
       
        }else
        {
            while(p !=null)
            {
                System.out.println(p.getDato());
            p = p.getEnlace();
            }
            
        }
    }

    public void BorrarInicio(int dato) {
        
        if(punta!=null){
            punta =punta.getEnlace();
         
        }else{
            System.out.println("La lista está vacia ");
        }
        
    }
    public void BorrarFinal(){
        
        
        
        
        
        }

    void Insertarmedioposicion(int dato) {
        
    }
        
        
            
          
        
        
        
        
        
       
    
    
}
