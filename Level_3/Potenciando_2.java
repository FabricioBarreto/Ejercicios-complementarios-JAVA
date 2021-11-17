import java.util.ArrayList;
import java.util.List;

public class Potenciando_2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        List<Integer> potenciados = new ArrayList<>();
        for(Integer numero : numeros){
            int num = (int) Math.pow(numero,2);
            potenciados.add(num);
        }
        System.out.println(potenciados);
    }
}
