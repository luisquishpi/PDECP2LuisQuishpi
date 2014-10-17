package factoryMethod.naturalNumber;

public class NaturalNumberEnCreator extends NaturalNumberCreator {

    @Override
    public NaturalNumber createNaturalNumber(int value) {

        return new NaturalNumberEs(value);
    }

}
