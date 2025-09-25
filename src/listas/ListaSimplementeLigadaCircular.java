
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
        if (punta!=null)
        {
            do
            {
                p = p.getEnlace();
            }while(p.getEnlace()!= punta);
            p.setEnlace(x);
            x.setEnlace(punta);
            punta = x;
        }else
        {
            punta = x;
            x.setEnlace(punta);
            System.out.println("La lista esta vacia ");
        }
    }
    
    public void InsertarFinal(int dato){
        Nodo x = new Nodo(dato);
        Nodo p = punta;
        
        if (punta==null){            
            punta = x;
            x.setEnlace(punta);
            System.out.println("La lista esta vacia");
        }else
        {
            do
            {
                p = p.getEnlace();
            }while(p.getEnlace()!=punta);
            p.setEnlace(x);            
        }
        x.setEnlace(punta);
    }
                        
            
    
     public void InsertarMedioPosicion(int dato, int pos){
        Nodo x = new Nodo(dato);
        
        if(punta == null)
        {
            punta = x;
            x.setEnlace(punta);
            System.out.println("La lista esta vacia");
        }else
        {
            int contador = 1;
            Nodo p = punta;
            while(p.getEnlace()!=punta&&contador< pos -1)
            {
                p = p.getEnlace();
            }
            x.setEnlace(p.getEnlace());
            p.setEnlace(x);
        }
                                
     }     
    
     public void BorrarInicio ()
     {
         Nodo p = punta;         
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
         while(p.getEnlace()!=punta){
             p = p.getEnlace();
         }
         x = punta.getEnlace();
         p.setEnlace(x);
         punta = x;
     }   
     
     public void BorrarFinal()
     {
         Nodo p = punta;
         Nodo x;
         if(punta==null)
         {
             p = p.getEnlace();
             System.out.println("La lista esta vacia");
             p.setEnlace(punta);
         }else
         {
             do
             {
                 p = p.getEnlace();                 
             }while(p.getEnlace().getEnlace()!= punta);             
             x = p.getEnlace();
             x.setEnlace(punta);
         }         
     }
     
     public void BorrarMedioPorValor(int valor)
     {
         Nodo p= punta;
         Nodo x;
         
         if(p==null)
         {
             p = p.getEnlace();
             System.out.println("La lista esta vacia");
             p.setEnlace(punta);             
         }else
         {
             do
             {
                 p = p.getEnlace();
             }while(p.getEnlace().getDato()!=valor);
                                       
         }
         
         
     }
     
     public void MostrarLista()
     {
         Nodo p = punta;    
         if(punta!=null)
         {
             do
             {
                 System.out.println(p.getDato());
                 {
                     System.out.println(" ");
                 }                 
             }while(p!=punta);
             
          }else{
             System.out.println("La lista esta vacia ");                                
         }
         System.out.println(" -"); 
     }    
}
