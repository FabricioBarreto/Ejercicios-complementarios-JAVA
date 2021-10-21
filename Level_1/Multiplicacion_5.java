package Level_1;
import java.util.Scanner;

public class Multiplicacion_5
{
    static Scanner entrada = new Scanner (System.in);

    public static void main(String[] args){

        System.out.println("Ingrese un número:");
        int nro1=entrada.nextInt();
        System.out.println("Ingrese el segundo número:");
        int nro2=entrada.nextInt();
        int res=0;

        for(int i=0; i<=nro1; i++){
            res = res + nro1;
        }

        System.out.println(nro1 + "x" + nro2 + "=" + res);
    }
}
