package o;

import javax.inject.Inject;

public class exitNode extends uncheckItems<getExtensionByName> {
    private final setExtensionFilter persistencePromoEntityData;

    @Inject
    public exitNode(setExtensionFilter setextensionfilter) {
        this.persistencePromoEntityData = setextensionfilter;
    }

    public getExtensionByName createData(String str) {
        return this.persistencePromoEntityData;
    }
}
