package command.calculadora;

import upm.jbb.IO;

public class ComandoImprimir implements Comando {

    Calculadora calculadora;
    public ComandoImprimir(Calculadora calculadora){
        this.calculadora=calculadora;
    }
    @Override
    public String name() {
        // TODO Auto-generated method stub
        return "Imprimir";
    }

    @Override
    public void execute() {
        IO.out.println(calculadora.getTotal());

    }

}
