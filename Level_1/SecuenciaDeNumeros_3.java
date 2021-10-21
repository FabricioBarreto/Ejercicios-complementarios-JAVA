package Level_1;

import java.util.Scanner;

public class SecuenciaDeNumeros_3
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese el número a secuenciar:");
        int num = entrada.nextInt();
        int vuelta = 0;

        for(int i=0; num>i; i++){
            vuelta = vuelta+1;
            for(int j=0; vuelta>j; j++){
                System.out.print(j+1);
            }
            System.out.println("");
        }
        entrada.close();
    }
}
