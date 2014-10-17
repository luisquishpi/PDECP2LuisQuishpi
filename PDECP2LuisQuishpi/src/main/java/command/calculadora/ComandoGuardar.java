package command.calculadora;

import upm.jbb.IO;

public class ComandoGuardar extends ComandoMementable {

    CalculadoraMementable calculadoraMementable;
    
    public ComandoGuardar(CalculadoraMementable originador,
            GestorMementos<Calculadora> gestorMementos) {
        super(originador, gestorMementos);
    }

    @Override
    public String name() {
        return "Guardar";
    }

    @Override
    public void execute() {
        this.calculadoraMementable.setTotal(this.calculadoraMementable.getTotal());
        this.getGestorMementos().addMemento(IO.in.readString("Memento: "),
                this.calculadoraMementable.createMemento());

    }

}
