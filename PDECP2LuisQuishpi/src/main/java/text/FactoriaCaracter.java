package text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

    private Map<Character, Caracter> caracteres;

    private static FactoriaCaracter factory = null;

    public FactoriaCaracter() {
        this.caracteres = new HashMap<>();
    }

    public static FactoriaCaracter getFactoria() {
        if (FactoriaCaracter.factory == null)
            FactoriaCaracter.factory = new FactoriaCaracter();
        return FactoriaCaracter.factory;
    }

    public Caracter get(char caracter) {
        if (!this.caracteres.containsKey(caracter)) {
            this.caracteres.put(caracter, new Caracter(caracter));
        }
        return caracteres.get(caracter);
    }
}
