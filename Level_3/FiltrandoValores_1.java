import java.util.List;
import java.util.ArrayList;

public class FiltrandoValores_1{

	public static void main(String[] args) {

		List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        
		List<String> frase = new ArrayList<>();

		for(String palabra : palabras){
			if (palabra != null && palabra != "")
				frase.add(palabra);
		}
		System.out.println(frase);
	}
}