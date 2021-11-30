import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FactorialDeList_4 {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(1, 2, 4, 4, 4);

        Set<Integer> factorizado = numeros.stream()
                .map(n -> factorizar(n))
                .collect(Collectors.toSet());

        System.out.println(factorizado);
    }

    public static int factorizar(int num){
        int res = 1;
        while(num != 0){
            res = res * num;
            num--;
        }
        return res;
    }
}
