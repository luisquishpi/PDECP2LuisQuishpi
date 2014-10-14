package command.calculadora;

public class ComandoIniciar implements Comando {

    Calculadora calculadora;

    public ComandoIniciar(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public String name() {
        return "Iniciar";
    }

    @Override
    public void execute() {
        this.calculadora.iniciar();

    }

}
