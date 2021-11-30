import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FiltrandoValores_1{

	public static void main(String[] args) {

		List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        
		List<String> frase = palabras.stream()
				.filter(p -> p != null && p != "")
					.collect(Collectors.toList());

		System.out.println(frase);
	}
}