package text;

public abstract class Componente {
    
    public abstract void add(Componente componente);

    public abstract void remove(Componente componente);

    public abstract boolean isCompuesto();

    public abstract String dibujar(boolean mayuscula);

}
