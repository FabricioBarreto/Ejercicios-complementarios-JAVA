package Level_1;
import java.util.Scanner;

public class CantidadDeLetra_9 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Frase a utilizar:");
        String frase = entrada.nextLine();
        System.out.println("Letra a contar:");
        String letra = entrada.nextLine();
        int pos=0;
        int cont=0;
        
        pos=frase.indexOf(letra);

            while(pos != -1){
                cont++;
                pos=frase.indexOf(letra,pos+1);
             }

        System.out.println("La letra '" + letra + "' se repite " + cont +" veces.");
    }

}
