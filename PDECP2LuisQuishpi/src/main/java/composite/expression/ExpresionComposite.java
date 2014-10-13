package composite.expression;

public abstract class ExpresionComposite extends Expresion {

    protected Expresion operando1;

    protected Expresion operando2;

    public ExpresionComposite(Expresion operando1, Expresion operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public abstract int operar();

    public abstract String toString();
}
