package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.R;

@Singleton
public class setPageLoaded extends uncheckItems<setPageId> {
    private final R.raw branchGenerateLinkEntityData;
    private final handleStartClientBundleNull preferencesGenerateLinkEntityData;

    @Inject
    public setPageLoaded(R.raw raw, handleStartClientBundleNull handlestartclientbundlenull) {
        this.branchGenerateLinkEntityData = raw;
        this.preferencesGenerateLinkEntityData = handlestartclientbundlenull;
    }

    public setPageId createData(String str) {
        if ("local".equals(str)) {
            return this.preferencesGenerateLinkEntityData;
        }
        return this.branchGenerateLinkEntityData;
    }
}
