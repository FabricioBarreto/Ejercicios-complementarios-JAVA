package Level_1;
import java.util.Scanner;

public class DatosPersonales_8
{

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Nombre y Apellido:");
        String nombre = entrada.nextLine();
        System.out.println("Edad:");
        String edad = entrada.nextLine();
        System.out.println("Dirección:");
        String direccion = entrada.nextLine();
        System.out.println("Ciudad:");
        String ciudad = entrada.nextLine();

        String cadena = ciudad + " - " + direccion + " - " + edad + " - " + nombre;
        System.out.print(cadena);

    }
}