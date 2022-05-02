package o;

import o.b;

public final class AwareExtensionInvoker implements getAdapterPosition<ResultResolver> {
    private final b.C0007b<invokeWithTargetExtensions> persistenceRecentBankEntityDataProvider;

    public AwareExtensionInvoker(b.C0007b<invokeWithTargetExtensions> bVar) {
        this.persistenceRecentBankEntityDataProvider = bVar;
    }

    public final ResultResolver get() {
        return newInstance(this.persistenceRecentBankEntityDataProvider.get());
    }

    public static AwareExtensionInvoker create(b.C0007b<invokeWithTargetExtensions> bVar) {
        return new AwareExtensionInvoker(bVar);
    }

    public static ResultResolver newInstance(invokeWithTargetExtensions invokewithtargetextensions) {
        return new ResultResolver(invokewithtargetextensions);
    }
}
