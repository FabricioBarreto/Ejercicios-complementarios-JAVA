package Level_1;
import java.util.Scanner;

public class Factorial_4
{
    static Scanner entrada = new Scanner (System.in);

    public static void main(String[] args){
        int factorial=1;

        System.out.println("Ingrese un número para obtener su factorial:");
        int nro1=entrada.nextInt();
        int nro2=nro1;

        while(nro1 != 0){
            factorial = factorial * nro1;
            nro1--;
        }
        System.out.println("El factorial de " + nro2 + " es: " + factorial);
    }
}
