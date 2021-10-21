package Level_1;
import java.util.Scanner;

public class HolaUsuario_1
{
  static Scanner entrada = new Scanner (System.in);

  public static void main(String[] args)
  {
    System.out.println("A continuación ingrese su nombre:");

    String usuario = entrada.next();
      
    System.out.println("Hola " + usuario);
  }  
}
