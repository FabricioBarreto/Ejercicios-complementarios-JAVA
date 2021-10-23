package Level_1;
import java.util.Scanner;

public class DeMinusculaAMayuscula_7{

    static Scanner entrada = new Scanner (System.in);

    public static void main(String[] args)
    {
        System.out.println("Escriba la palabra a modificar:");
        String palabra = entrada.nextLine();
        String enMayusculas="";
        String abcMin ="abcdefghijklmnñopqrstuvwxyz";
        String abcMay ="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        char letra;
        char letraC;
        char letraM;

        for(int i=0; i < palabra.length(); i++){

            letra = palabra.charAt(i);
            
            for(int j=0; j<27;j++){

                letraC = abcMin.charAt(j);
                if(letra == letraC)
                { 
                    letraM = abcMay.charAt(j);
                    enMayusculas += letraM;
                    break;
                }
                  
            }
        }
        System.out.println(enMayusculas);
    }
}