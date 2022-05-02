package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ResultResolver extends uncheckItems<ExtensionInvoker> {
    private final invokeWithTargetExtensions persistenceRecentBankEntityData;

    @Inject
    public ResultResolver(invokeWithTargetExtensions invokewithtargetextensions) {
        this.persistenceRecentBankEntityData = invokewithtargetextensions;
    }

    public ExtensionInvoker createData(String str) {
        return this.persistenceRecentBankEntityData;
    }
}
