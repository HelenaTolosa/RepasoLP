package es.ceed.ArrayList;

import es.ceed.ArrayList.Ordenador;
import es.ceed.ArrayList.PlayArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        int n = 0;        
        ArrayList<Integer> aleatorios;
        Scanner entrada=new Scanner(System.in);// se declara e inicializa una instancia  de la clase Scanner.        

        System.out.print("Lista de números aleatorios\n" );
        System.out.print("===========================\n" );
        System.out.print("Ingrese un numero: ");
        n = entrada.nextInt();   
        aleatorios = PlayArrayList.randomListInit(n);
        PlayArrayList.printRamdonList(aleatorios);
        
        
        
        
        

        System.out.print("\nLista de Ordenadores\n" );
        System.out.print("====================\n\n" );

        Ordenador ord1 = new Ordenador("ORD0001");
        Ordenador ord2 = new Ordenador("ORD0002");
        Ordenador ord3 = new Ordenador("ORD0003");
        Ordenador ord4 = new Ordenador("ORD0004");

        //PASO 1 . Creamos y añadimos los ordenadores a un ArrayList denominado ordenadores
        System.out.print("\nPASO1 Añadimos los ordenadores a la lista\n" );
        System.out.print("===========================================\n\n" );
        ArrayList<Ordenador> ordenadores=new ArrayList<Ordenador>();
        ordenadores.add(ord1);
        ordenadores.add(ord2);
        ordenadores.add(ord3);
	ordenadores.add(ord4);
        System.out.print("\nPASO1 Añadimos los ordenadores a la lista\n" );
        System.out.print("===========================================\n\n" );


        // PASO 2. Lee/Recupera el ordenador que ocupe la posición 2 en la lista, Muestralo por consola (print)
       
        System.out.print("\nPASO2 Visualiza ordenador posción 2\n" );
        System.out.print("===================================\n\n" );
        System.out.println(ordenadores.get(2));


        // PASO 3. Elimina el ordenador que ocupe la posición 3 en la lista
        System.out.print("\nPASO3 Eliminamos el elemento que ocupa la posición 3\n" );
        System.out.print("======================================================\n\n" );
        ordenadores.remove(3);

        // PASO 4. Muestra por consola, utilzando print y un for todos los elementos de la lista,
        // no se debería mostrar el elemento 3

        System.out.print("\nPASO4 Muestra todos los ordenadores de la lista 2\n" );
        System.out.print("=================================================\n\n" );
        for( int i = 0 ; i < ordenadores.size() ; i++ ){
            System.out.println( ordenadores.get( i ) );
        }
        
        // for (Ordenador Ord :Ordenadores){
        //    system.out.println (ord);}

        // PASO 5. Protege la lista de duplicados, es decir, no deberían existir dos ordenadores con la misma referencia
        // en la lista, para ello será necesario implementar el método equals en Ordenador (ya hecho) y utilizar de forma
        // correcta el método  contains de ArrayList
        System.out.print("\nPASO5 Comprueba que el ordenador con la misma referencia ya existe en la lista\n" );
        System.out.print("==============================================================================\n" );
        
        while(true) {
            //por teclado me pida la referencia
            System.out.print("Ingrese un numero de referencia: ");
            String ref = entrada.nextLine();
            if (ref.equalsIgnoreCase("exit")) {
                System.out.print("Saliendo..... ");
                break;
            }
            //creamos nuevo ordenador con la referncia introducida
            Ordenador o = new Ordenador(ref);
            if (ordenadores.contains(o)){
                System.out.println("ERROR, el ordenador ya existe, intentalo de nuevo");
            }else{
                ordenadores.add(o);
            }
        }
        
       

        
       
        
        

    }
}

/* Ejemplo de ejecución

Lista de Ordenadores
====================


PASO1 Añadimos los ordenadores a la lista
===========================================


PASO2 Visualiza ordenador posción 2
===================================

Ordenador{ref='ORD0003'}

PASO3 Eliminamos el elemento que ocupa la posición 3
======================================================


PASO4 Muestra todos los ordenadores de la lista 2
=================================================

Ordenador{ref='ORD0001'}
Ordenador{ref='ORD0002'}
Ordenador{ref='ORD0003'}

PASO5 Comprueba que el ordenador con la misma referencia ya existe en la lista
==============================================================================
ORD0002 Ya existe


 */
