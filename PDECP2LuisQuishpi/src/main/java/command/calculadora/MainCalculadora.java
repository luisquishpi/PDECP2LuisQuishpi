package command.calculadora;

import upm.jbb.IO;

public class MainCalculadora {
    private GestorComandos gestor;

    public MainCalculadora() {
        CalculadoraMementable calc = new CalculadoraMementable();
        GestorMementos<Calculadora> gestorMemento = new GestorMementos<Calculadora>();
        this.gestor = new GestorComandos();
        this.gestor.add(new ComandoSumar(calc));
        this.gestor.add(new ComandoRestar(calc));
        this.gestor.add(new ComandoIniciar(calc));
        this.gestor.add(new ComandoImprimir(calc));
        this.gestor.add(new ComandoGuardar(calc, gestorMemento));
        this.gestor.add(new ComandoDeshacer(calc, gestorMemento));
    }

    public void ejecutar() {
        String key = (String) IO.in.select(this.gestor.keys());
        this.gestor.execute(key);
    }

    public static void main(String[] args) {
        IO.in.addController(new MainCalculadora());
    }
}
