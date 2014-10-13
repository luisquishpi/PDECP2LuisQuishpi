package composite.expression;

public class Dividir extends ExpresionComposite {

    public Dividir(Expresion expresion1, Expresion expresion2) {
        super(expresion1, expresion2);
    }

    @Override
    public int operar() {
        return this.operando1.operar() / this.operando2.operar();
    }

    @Override
    public String toString() {
        return "(" + this.operando1.toString() + "/" + this.operando2.toString() + ")";
    }
}
