package Level_1;
import java.util.Scanner;

public class Operaciones_2
{
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args)
    {
        int num1,num2,suma,resta,mult,div,mod;

        System.out.println("Ingrese los números:");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        
        suma = num1+num2;
        resta = num1-num2;
        mult = num1*num2;
        div = num1/num2;
        mod = num1%num2;

        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + mult);
        System.out.println(num1 + " / " + num2 + " = " + div);
        System.out.println(num1 + " % " + num2 + " = " + mod);
    }
}