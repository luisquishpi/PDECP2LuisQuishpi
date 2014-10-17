package text;

public class Texto extends Compuesto {

    public Texto() {
        super();
    }

    @Override
    public void add(Componente componente) {
        if (componente.isCompuesto())
            this.addComponente(componente);
        else
            throw new UnsupportedOperationException("Operación no soportada");

    }

    @Override
    public void remove(Componente componente) {
        listaComponentes.remove(componente);

    }

    @Override
    public String dibujarString() {
        return "---o---\n";
    }

}
