package command.calculadora;

import upm.jbb.IO;

public class ComandoRestar implements Comando {

    Calculadora calculadora;

    public ComandoRestar(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public String name() {
        return "Restar";
    }

    @Override
    public void execute() {
        this.calculadora.restar(IO.in.readInt("Valor:"));

    }

}
