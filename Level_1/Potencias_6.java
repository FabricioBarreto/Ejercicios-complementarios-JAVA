package Level_1;
import java.util.Scanner;

public class Potencias_6 
{
    static Scanner entrada = new Scanner (System.in);

    public static void main(String[] args)
    {
         System.out.println("Ingrese el número base:");
         int nro1=entrada.nextInt();
         System.out.println("Ingrese el número exponente:");
         int nro2=entrada.nextInt();
         int res=1;

         for(int i=0; i<nro2; i++){
             res *= nro1;
         }

        System.out.println(nro1 + " eleveado a " + nro2 + " = " + res);
    }
}
