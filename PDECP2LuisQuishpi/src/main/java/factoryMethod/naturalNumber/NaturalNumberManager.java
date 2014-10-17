package factoryMethod.naturalNumber;

public class NaturalNumberManager {

    private NaturalNumber naturalNumber;

    private NaturalNumberCreator creator;

    private NaturalNumberManager() {
        this.setNaturalNumberCreator(new NaturalNumberEsCreator());
    }

    public void createNaturalNumber(int value) {
        this.naturalNumber = this.creator.createNaturalNumber(value);
    }

    public NaturalNumber getNaturalNumber() {
        return this.naturalNumber;
    }

    public void setNaturalNumberCreator(NaturalNumberCreator naturalNumberCreator) {
        this.creator = naturalNumberCreator;
    }

}
