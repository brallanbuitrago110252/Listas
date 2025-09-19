
package listas;

import java.util.Scanner;

public class lista {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        int opc;
        
        Scanner sc = new Scanner(System.in);
        
        do{

            System.out.println("Menu Litas");
            System.out.println("Listas Simplemnte Ligadas");
            System.out.println("Listas simplente Ligadas circular");
            System.out.println("Lista doblemente ligada");
            System.out.println("Lista doblemente ligadas circularmente");

            opc = sc.nextInt(); 

            switch(opc)
            {
                case 1:
                System.out.println("Listas Simplemnte Ligadas");
                ListaSimplementeLigada lista1 = new ListaSimplementeLigada();
                lista1.insertarInicio(5);
                lista1.InsertarFinal(5);
                lista1.MostrarDatos();
                lista1.BorrarInicio(5);
                lista1.BorrarMedio();

                break;

                case 2:
                    System.out.println("opcion 2");
                    break;
                case 3:
                    System.out.println("opcion 3");
                    break;

                 case 4:
                    System.out.println("opcion 2");
                    break;
                case 5:
                    System.out.println(" Saliendo");
                    break;
            }
            
        }while(opc != 5);
    }
}
        
            
        
        
        
    
        
    
    

