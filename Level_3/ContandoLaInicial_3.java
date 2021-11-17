import java.util.List;

public class ContandoLaInicial_3 {
    public static void main(String[] args){

        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        int cont = 0;

        for(String palabra : palabras){
           if (palabra.startsWith("b") || palabra.startsWith("B") ){
            cont ++;
           }
        }
        System.out.print(cont);
    }
}
