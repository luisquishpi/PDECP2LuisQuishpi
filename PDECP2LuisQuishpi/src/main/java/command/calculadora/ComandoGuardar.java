package command.calculadora;

import upm.jbb.IO;

public class ComandoGuardar extends ComandoMementable {

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
        this.getOriginador().setTotal(this.getOriginador().getTotal());
        this.getGestorMementos().addMemento(IO.in.readString("Memento: "),
                this.getOriginador().createMemento());

    }

}
