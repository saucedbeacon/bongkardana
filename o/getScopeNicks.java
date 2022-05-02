package o;

import o.b;

public final class getScopeNicks implements getAdapterPosition<setAuthRequestContext> {
    private final b.C0007b<AuthRequestContextModel> preferenceSocialSyncEntityDataProvider;

    public getScopeNicks(b.C0007b<AuthRequestContextModel> bVar) {
        this.preferenceSocialSyncEntityDataProvider = bVar;
    }

    public final setAuthRequestContext get() {
        return newInstance(this.preferenceSocialSyncEntityDataProvider.get());
    }

    public static getScopeNicks create(b.C0007b<AuthRequestContextModel> bVar) {
        return new getScopeNicks(bVar);
    }

    public static setAuthRequestContext newInstance(AuthRequestContextModel authRequestContextModel) {
        return new setAuthRequestContext(authRequestContextModel);
    }
}
