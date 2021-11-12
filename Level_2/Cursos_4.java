package Level_2;

import java.util.ArrayList;
import java.util.List;
;

public class Cursos_4 {
    public static void main(String[] args) {

        List<String> alumnos = new ArrayList<String>();
        
        alumnos.add("Esteban");alumnos.add("Karen");
        alumnos.add("Nelson");alumnos.add("Gladys");
        alumnos.add("Enrique");alumnos.add("Estrella");
        alumnos.add("Lorenzo");alumnos.add("Macarena");
        alumnos.add("Brian");alumnos.add("Ana");
        alumnos.add("Mateo");alumnos.add("Luana");
        
        List<String> curso_1 = new ArrayList<String>(alumnos.subList(0, 4));
        System.out.println(curso_1);
        List<String> curso_2 = new ArrayList<String>(alumnos.subList(4, 8));
        System.out.println(curso_2);
        List<String> curso_3 = new ArrayList<String>(alumnos.subList(8, 12));
        System.out.println(curso_3);
    }
}
