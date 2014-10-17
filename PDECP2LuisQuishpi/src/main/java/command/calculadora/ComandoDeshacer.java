package command.calculadora;

import upm.jbb.IO;

public class ComandoDeshacer extends ComandoMementable {

    CalculadoraMementable calculadoraMementable;

    public ComandoDeshacer(CalculadoraMementable originador,
            GestorMementos<Calculadora> gestorMementos) {
        super(originador, gestorMementos);
    }

    @Override
    public String name() {
        return "Deshacer";
    }

    @Override
    public void execute() {
        Calculadora calculadoraDeshacer = this.getGestorMementos().getMemento(
                (String) IO.in.select(this.getGestorMementos().keys(), "Deshacer"));
        this.calculadoraMementable.restoreMemento(calculadoraDeshacer);
    }

}
