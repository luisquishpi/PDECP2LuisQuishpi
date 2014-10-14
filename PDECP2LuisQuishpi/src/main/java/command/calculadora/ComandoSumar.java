package command.calculadora;

import upm.jbb.IO;

public class ComandoSumar implements Comando {

    Calculadora calculadora;
    public ComandoSumar(Calculadora calculadora){
        this.calculadora=calculadora;
    }
    @Override
    public String name() {
        return "Sumar";
    }

    @Override
    public void execute() {
        this.calculadora.sumar(IO.in.readInt("Valor:"));

    }

}
