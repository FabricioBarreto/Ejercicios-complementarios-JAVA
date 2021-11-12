package Level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class BarajaFrancesa_3 {
    public static void main(String[] args) {

        List<Integer> baraja = new ArrayList<Integer>();

        baraja.add(2);baraja.add(3);baraja.add(4);baraja.add(5);baraja.add(6);baraja.add(7);baraja.add(8);baraja.add(9);baraja.add(10);baraja.add(11);baraja.add(12);baraja.add(13);baraja.add(14);
        System.out.println(baraja);

        Collections.reverse(baraja);
        System.out.println(baraja);

        Collections.shuffle(baraja);
        System.out.println(baraja);

        Collections.sort(baraja);
        System.out.println(baraja);

    }
}
