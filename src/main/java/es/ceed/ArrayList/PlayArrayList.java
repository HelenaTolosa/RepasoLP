package es.ceed.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PlayArrayList {

    ArrayList<Integer> a;

    //Crear mediante un bucle for una lista de números aleatorios (Math.random) que se almacenarán en un ArrayList
    //El número de elementos a introducir en la lista lo preguntará por consola

    /**
     *
     * @return ArrayList<Integer>>
     */
    public static ArrayList<Integer> randomListInit(Integer n) {
        ArrayList<Integer>aleatorios = new ArrayList();
            
        for (int i=1; i<=n;i++){
            // genera aleatorio y se almacena en un double
            double d =Math.random()*100;
            // convertir de double minus a Double May
            Double dd = new Double (d);
            //optener el valor entero de dd
            Integer ii = dd.intValue();
            
           aleatorios.add(ii);          
        }
        
        return aleatorios;
    }

    /**
     *
     * @param lista
     */
    public static void printRamdonList(ArrayList<Integer> aleatorios) {
        //Utilizar un bucle while y un iterador para recorrer la lista y volcarla por consola siguiendo el formato
        //[ num1, num2, num3, .... ,numN ]
        
        Iterator<Integer> it = aleatorios.iterator();
        
        System.out.print("[");
        while(it.hasNext()){
            Integer e = it.next();
           
           System.out.print(e+ ",");
        }
        System.out.print("]");
    }
}
    
