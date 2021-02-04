package fit.core;

import java.util.HashMap;
import java.util.Map;

public class AttendanceHelper {

    public static Map<String, Boolean> random(int quantidade, int probabilidade) {

        Map<String, Boolean> lista = new HashMap<>();
        
        var resultado = quantidade * probabilidade / 100;
        for (int x = 0; x < quantidade; x++) {
            lista.put("test " + x, (x < resultado));
        }

        return lista;
    }

}