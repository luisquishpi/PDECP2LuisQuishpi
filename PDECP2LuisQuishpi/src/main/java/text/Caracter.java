package text;

public class Caracter extends Componente {

    private char caracter;

    public Caracter(char caracter) {
        this.caracter = caracter;
    }

    @Override
    public void add(Componente componente) {
        if (componente.isCompuesto())
            throw new UnsupportedOperationException("Operación no soportada");

    }

    @Override
    public void remove(Componente componente) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isCompuesto() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String dibujar(boolean mayuscula) {
        if(mayuscula){
            return ("" + caracter).toUpperCase();
            }
            return ""+caracter;
    }

}
