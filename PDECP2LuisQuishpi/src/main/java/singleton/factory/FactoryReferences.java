package singleton.factory;

import java.util.HashMap;
import java.util.Map;

public class FactoryReferences {
    private Map<String, Integer> references;

    private static FactoryReferences factoryReference;

    private int reference;

    public FactoryReferences() {
        this.references = new HashMap<String, Integer>();
        this.reference = 0;
    }

    public int getReference(String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            this.references.put(key, this.reference);
            result = this.reference;
            reference++;
        }
        return result;
    }

    public void removeReference(String key) {
        this.references.remove(key);
    }

    public static FactoryReferences getFactory() {
        if (FactoryReferences.factoryReference == null) {
            factoryReference = new FactoryReferences();
        }
        return FactoryReferences.factoryReference;
    }

}
