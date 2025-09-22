
package listas;

import java.util.Scanner;

public class lista {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        int opcionPrincipal,opcionmenus;
        
        Scanner sc = new Scanner(System.in);
        
        ListaSimplementeLigada lista1 = new ListaSimplementeLigada();
        ListaSimplementeLigadaCircular lista2 = new  ListaSimplementeLigadaCircular();
        ListaDoblementeLigada lista3 = new ListaDoblementeLigada();
        
        do{

            System.out.println("Menu Litas");
            System.out.println(" 1 Listas Simplemnte Ligadas");
            System.out.println(" 2 Listas simplente Ligadas circular");
            System.out.println(" 3 Lista doblemente ligada");
            System.out.println(" 4 Lista doblemente ligadas circularmente");

            opcionPrincipal = sc.nextInt(); 

            switch(opcionPrincipal)
            {
                case 1:
                    do
                    {
                    System.out.println("Listas Simplemnte Ligadas");
                    System.out.println("1 Insertar al inicio");
                    System.out.println("2 Insertar al final");
                    System.out.println("3 Insertar medio posicion");
                    System.out.println("4 Borrar Inicio");
                    System.out.println("5 Borra Final");
                    System.out.println("6 Borrar medio por valor");
                    System.out.println("7 mostrar lista");
                    System.out.println("8 salir ");
                    
                    opcionmenus = sc.nextInt();
                    
                    switch(opcionmenus){
                        case 1:
                            int dato;
                            System.out.println("Ingrese el valor");
                            dato = sc.nextInt();
                            lista1.insertarInicio(dato);
                            break;
                            
                        case 2:                            
                            System.out.println("Ingrese el valor");
                            dato = sc.nextInt();
                            lista1.InsertarFinal(dato);
                            break;  
                            
                        case 3:
                            System.out.println("Ingrese el valor");
                            dato = sc.nextInt();
                            System.out.println("Ingrese la posicion insertar");
                            int pos = sc.nextInt();
                            lista1.InsertarMedioPosicion(dato, pos);
                            break;
                        case 4:                           
                           lista1.BorrarInicio();
                           break;
                           
                        case 5:                                                   
                           lista1.BorrarFinal();
                           break;
                           
                        case 6:                           
                            System.out.println("Ingrese el valor que desea eliminar");
                            int valor = sc.nextInt();
                            lista1.BorrarMedioPorValor(valor);
                            break;
                            
                        case 7:                           
                            lista1.MostrarLista();
                            break;
                            
                        case 8:
                            System.out.println("Saliendo");
                            break;
                            
                        default:
                            System.out.println(" Ingreso una opcion no valida ");                            
                           
                    }
                    }while(opcionmenus != 8);

                break;

                case 2:
                    do
                    {
                    System.out.println("Lista Simplemnte Ligada Circular");
                    System.out.println("1 Insertar al inicio");
                    System.out.println("2 Insertar al final");
                    System.out.println("3 Insertar medio posicion");
                    System.out.println("4 Borrar Inicio");
                    System.out.println("5 Borra Final");
                    System.out.println("6 Borrar medio por valor");
                    System.out.println("7 mostrar lista");
                    System.out.println("8 salir ");
                    
                    opcionmenus = sc.nextInt();
                    
                    switch(opcionmenus){
                        case 1:
                            int dato;
                            System.out.println("Ingrese el valor");
                            dato = sc.nextInt();
                            lista2.insertarInicio(dato);
                            break;
                            
                        case 2:                            
                            System.out.println("Ingrese el valor");
                            dato = sc.nextInt();
                            lista2.InsertarFinal(dato);
                            break;  
                            
                        case 3:
                            System.out.println("Ingrese el valor");
                            dato = sc.nextInt();
                            System.out.println("Ingrese la posicion insertar");
                            int pos = sc.nextInt();
                            lista2.InsertarMedioPosicion(dato, pos);
                            break;
                            
                        case 4:                           
                           lista2.BorrarInicio();
                           break;
                           
                        case 5:                                                   
                           lista2.BorrarFinal();
                           break;
                           
                        case 6:                           
                            System.out.println("Ingrese el valor que desea eliminar");
                            int valor = sc.nextInt();
                            lista2.BorrarMedioPorValor(valor);
                            break;
                            
                        case 7:                           
                            lista2.MostrarLista();
                            break;
                            
                        case 8:
                            System.out.println("Saliendo");
                            break;
                            
                        default:
                            System.out.println(" Ingreso una opcion no valida ");                            
                           
                    }
                    }while(opcionmenus != 8);

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
            
        }while(opcionPrincipal != 5);
    }
}
        
            
        
        
        
    
        
    
    

