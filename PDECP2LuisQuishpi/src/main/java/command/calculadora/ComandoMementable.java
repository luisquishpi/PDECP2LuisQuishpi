package command.calculadora;

public abstract class ComandoMementable implements Comando {
    private GestorMementos<Calculadora> gestorMementos;
    private CalculadoraMementable calculadoraMementable;
    
    public ComandoMementable(CalculadoraMementable originador,
            GestorMementos<Calculadora> gestorMementos) {
        this.calculadoraMementable=originador;
        this.gestorMementos = gestorMementos;
    }

    public CalculadoraMementable getOriginador() {
        return this.calculadoraMementable;
    }
    public GestorMementos<Calculadora> getGestorMementos() {
        return this.gestorMementos;
    }

    @Override
    public abstract String name();

    @Override
    public abstract void execute();
}
