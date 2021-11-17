import java.util.ArrayList;
import java.util.List;

public class FactorialDeList_4 {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(1, 2, 4, 4, 4,5,5);
        List<Integer> factorizado = new ArrayList<>();
        int cont = 0;
        int res = 1;

        for(Integer numero : numeros){
            if(cont != numero){
                cont = numero;
                while(cont != 0){
                    res = res * cont;
                    cont--;
                }
                factorizado.add(res);
            }
            cont = numero;
            res = 1;
        }
        System.out.println(factorizado);
    }
}
