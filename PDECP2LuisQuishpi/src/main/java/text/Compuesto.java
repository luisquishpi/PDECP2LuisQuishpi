package text;

import java.util.ArrayList;
import java.util.List;

public abstract class Compuesto extends Componente {

    public List<Componente> listaComponentes;

    public Compuesto() {
        listaComponentes = new ArrayList<Componente>();
    }

    @Override
    public abstract void add(Componente componente);

    @Override
    public abstract void remove(Componente componente);

    @Override
    public boolean isCompuesto() {
        return true;
    }

    public abstract String dibujarString();

    @Override
    public String dibujar(boolean mayuscula) {
        String s = "";
        for (Componente comp : listaComponentes) {
            s += comp.dibujar(mayuscula);
        }
        return s + this.dibujarString();
    }

    public void addComponente(Componente componente) {
        if (componente != null)
            this.listaComponentes.add(componente);
    }

    public void removeComponente(Componente componente) {
        this.listaComponentes.remove(componente);
    }

}
