package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.ActivityHelper;

@Singleton
public class getEmbedType extends uncheckItems<isRenderReady> {
    private final ActivityHelper.AnonymousClass1 networkLinkApiEntityData;

    @Inject
    public getEmbedType(ActivityHelper.AnonymousClass1 r1) {
        this.networkLinkApiEntityData = r1;
    }

    public isRenderReady createData(String str) {
        return this.networkLinkApiEntityData;
    }
}
