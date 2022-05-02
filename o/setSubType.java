package o;

import java.util.ArrayList;
import javax.inject.Singleton;
import o.AppModel;

@Singleton
public class setSubType extends setSpeed<AppModel.AnonymousClass1, getPluginModels> {
    /* access modifiers changed from: protected */
    public getPluginModels map(AppModel.AnonymousClass1 r4) {
        if (r4.isEmpty()) {
            return getPluginModels.empty();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(r4.config);
        return new getPluginModels(arrayList, r4.etag, true);
    }
}
