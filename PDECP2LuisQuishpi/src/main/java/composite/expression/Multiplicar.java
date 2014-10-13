package composite.expression;

public class Multiplicar extends ExpresionComposite {

    public Multiplicar(Expresion expresion1, Expresion expresion2) {
        super(expresion1, expresion2);
    }

    @Override
    public int operar() {
        return this.operando1.operar() * this.operando2.operar();
    }

    @Override
    public String toString() {
        return "(" + this.operando1.toString() + "*" + this.operando2.toString() + ")";
    }
}
