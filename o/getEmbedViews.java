package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.BaseManifest;

@Singleton
public class getEmbedViews extends uncheckItems<BaseManifest.AnonymousClass1> {
    private final CreatePageCallback networkPayAssetEntityData;

    @Inject
    public getEmbedViews(CreatePageCallback createPageCallback) {
        this.networkPayAssetEntityData = createPageCallback;
    }

    public BaseManifest.AnonymousClass1 createData(String str) {
        return this.networkPayAssetEntityData;
    }
}
