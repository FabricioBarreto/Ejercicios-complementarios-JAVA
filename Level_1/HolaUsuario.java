package Level_1;

import java.util.Scanner;

public class HolaUsuario {
    
    static Scanner input = new Scanner (System.in);

  public static void main(String[] args)
  {
      System.out.println("A continuación ingrese su nombre:");

      String usuario = input.next();
      
      System.out.println("Hola " + usuario);
  }  
}
