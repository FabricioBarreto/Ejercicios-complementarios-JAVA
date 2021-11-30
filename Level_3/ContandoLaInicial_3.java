import java.util.List;
import java.util.stream.Collectors;

public class ContandoLaInicial_3 {
    public static void main(String[] args){

        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");

        long cont = palabras.stream()
                .filter(p -> p.startsWith("B") || p.startsWith("b"))
                        .count();

        System.out.print(cont);
    }
}
