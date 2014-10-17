package text;

public class Parrafo extends Compuesto {

    public Parrafo() {
        super();
    }

    @Override
    public void add(Componente componente) {
        if (!componente.isCompuesto())
            this.addComponente(componente);
        else
            throw new UnsupportedOperationException("Operacion no es soportada");

    }

    @Override
    public void remove(Componente componente) {
        if (!isCompuesto())
            this.removeComponente(componente);
        else
            throw new UnsupportedOperationException("Operacion no es soportada");

    }

    @Override
    public String dibujarString() {
        return "\n";
    }

}
