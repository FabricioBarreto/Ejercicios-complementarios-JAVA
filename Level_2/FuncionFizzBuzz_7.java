package Level_2;

import java.util.ArrayList;
import java.util.List;

public class FuncionFizzBuzz_7 {
     public static void main(String[] args) {
        fizzBuzzFuncion(1,5);
        fizzBuzzFuncion(1,7);
    }

    public static void fizzBuzzFuncion(int nro1,int nro2){

        List<String> listaDeNumeros = new ArrayList<>();

        while(nro1 < nro2){
            
            String nro= String.valueOf(nro1);
            
            if(nro1%2 == 0 && nro1%3 == 0){
                listaDeNumeros.add("FizzBuzz");
            }
            else if(nro1%2 == 0){
                listaDeNumeros.add("Fizz");
            }
            else if(nro1%3 == 0){
                listaDeNumeros.add("Buzz");
            }
            else{
                listaDeNumeros.add(nro);
            }
            nro1++;
        }
        System.out.println(listaDeNumeros);
    }
}
