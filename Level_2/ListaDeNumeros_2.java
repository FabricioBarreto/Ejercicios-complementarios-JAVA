package Level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeNumeros_2{ 

   static Scanner entrada = new Scanner(System.in);
   public static void main(String[] args) {
    
      List<Integer> numeros = new ArrayList<>();

      numeros.add(654);numeros.add(55);numeros.add(84);numeros.add(22);numeros.add(40);
      System.out.println(numeros);
      System.out.println("La cantidad de numeros es de: " + numeros.size());

      for(int i:numeros){
         System.out.println(i);
     }

      System.out.println("Número a agregar en el primer espcio:");
      int pnro = entrada.nextInt();
      numeros.add(0,pnro);
      System.out.println("Número a agregar en el ultimo espacio:");
      int unro = entrada.nextInt();
      numeros.add(unro);
      System.out.println(numeros);
      System.out.println("La cantidad de numeros es de: " + numeros.size());
      
      for(int i:numeros){
         System.out.println(i);
     }
   }
}