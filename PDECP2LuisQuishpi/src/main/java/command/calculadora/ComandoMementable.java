package command.calculadora;

public abstract class ComandoMementable implements Comando {
    private GestorMementos<Calculadora> gestorMementos;

    public ComandoMementable(CalculadoraMementable originador,
            GestorMementos<Calculadora> gestorMementos) {
        this.gestorMementos = gestorMementos;
    }

    public GestorMementos<Calculadora> getGestorMementos() {
        return this.gestorMementos;
    }

    @Override
    public abstract void execute();
}
