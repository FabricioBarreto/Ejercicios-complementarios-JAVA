package Level_2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CiudadesFavoritas_1 {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){

        List<String> ciudades = new ArrayList<>();
        String agregar=null;
        
        System.out.println("Primer ciudad favorita:");
        agregar = entrada.nextLine();
        ciudades.add(agregar);
        System.out.println("Segunda ciudad favorita:");
        agregar = entrada.nextLine();
        ciudades.add(agregar);
        System.out.println("Tercer ciudad favorita:");
        agregar = entrada.nextLine();
        ciudades.add(agregar);

        for(int i=0; i < ciudades.size(); i++){
            System.out.println("#"+ (i+1) + "-" + (ciudades.get(i)));
        }
    }
}
