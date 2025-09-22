
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
            do
            {
                p = p.getEnlace();
            }while(p.getEnlace()!=punta);
            p.setEnlace(x);
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
             p.setEnlace(x);   
        }
        x.setEnlace(punta);            
    }
    
    
    
    
     public void InsertarMedioPosicion(int dato, int pos){
        Nodo x = new Nodo(dato);
        Nodo p = punta;
        int contador = 1;
        
        if( punta ==null || pos <=1)
        {
            System.out.println("La lista esta vacia");
        }else
        {
            do
            {             
            p = p.getEnlace();
                           
            }while(p.getEnlace()!=null && contador < pos -1);            
                p = p.getEnlace();
                contador ++; 
            }
            x.setEnlace(p.getEnlace());
            p.setEnlace(punta);   
                                
        }     
    
     public void BorrarInicio ()
     {
         Nodo p = punta;
         Nodo aux = new Nodo;
         Nodo x;
         
         if(punta == null)
         {
             p = p.getEnlace();
             if(p.getEnlace()== null)
             {
                p.setEnlace(punta);
                System.out.println("La lista esta vacia");
             }                              
         }
         p = punta;
         while(p.getEnlace()!=punta){
             aux = p.getEnlace();
         }
         x = punta.getEnlace();
         aux.setEnlace(x);
         punta = x;
     }   
     
     public void BorrarFinal()
     {
         
     }
}

