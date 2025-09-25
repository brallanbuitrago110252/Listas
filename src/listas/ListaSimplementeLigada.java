
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
    
    public void InsertarMedioPosicion(int dato, int pos)
    {
        Nodo x = new Nodo(dato);
        Nodo p = punta;
        if ((punta == null ) || (pos <= 1))
        {
            System.out.println("La lista esta vacia ");
        }else{                        
            int contador = 1;
            while(p.getEnlace()!=null && contador < pos -1)
            {
                p = p.getEnlace();
                contador ++;                
            }
            x.setEnlace(p.getEnlace());
            p.setEnlace(x);
        } 
    }
        

    public void BorrarInicio() {
        
        Nodo p = punta;
        if(punta != null){
            p = p.getEnlace();
            while(p.getEnlace()!=null)
            {
                p = p.getEnlace();
            }
            p.setEnlace(punta);
        }else{
            System.out.println("La lista está vacia ");
        }
        
    }
    public void BorrarFinal(){
        
        Nodo p = punta;        
        if(punta != null)
        {
              while(p.getEnlace().getEnlace()!= null){
                p =  p.getEnlace();               
              }
              p.setEnlace(null);            
        }else{
            System.out.println(" la lista esta vacia ");                            
            }
                    
        
    }
    
    public void BorrarMedioPorValor(int valor)
    {
     Nodo p = punta;
     Nodo x = new Nodo (valor);
     x = p;
     if(punta != null)
     {            
         while(p.getEnlace()!=null)
         { 
             if(p.getDato()== valor)
             {
                 p = p.getEnlace();
                 x.setEnlace(p);
                 System.out.println("Eliminando nodo");                 
             }else
             {
                 x = p;
                 p = p.getEnlace();
                                
             }
             p.setEnlace(x);
         }         
     }else{
         System.out.println("La lista esta vacia ");
     }        
    }
    
    public void MostrarLista()
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
           
        
}    
           

