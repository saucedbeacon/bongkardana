package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public final class ResourceLoadContext implements getAdapterPosition<intercepted> {

    static final class setMax {
        /* access modifiers changed from: private */
        public static final ResourceLoadContext setMax = new ResourceLoadContext();
    }

    public final intercepted get() {
        return newInstance();
    }

    public static ResourceLoadContext create() {
        return setMax.setMax;
    }

    public static intercepted newInstance() {
        return new intercepted();
    }

    public class Builder extends setSpeed<SplashEntryInfo, getMD5String> {
        private final WorkerStartParamInjectPoint scopeResultMapper;

        @Inject
        Builder(WorkerStartParamInjectPoint workerStartParamInjectPoint) {
            this.scopeResultMapper = workerStartParamInjectPoint;
        }

        /* access modifiers changed from: protected */
        public getMD5String map(SplashEntryInfo splashEntryInfo) {
            if (splashEntryInfo == null) {
                return null;
            }
            getMD5String getmd5string = new getMD5String();
            getmd5string.setMerchantName(splashEntryInfo.getMerchantInfo().getMerchantName());
            getmd5string.setAvailableScope(mapScopeResultList(splashEntryInfo.getAgreements()));
            return getmd5string;
        }

        private List<getMD5Base64> mapScopeResultList(List<base64> list) {
            ArrayList arrayList = new ArrayList();
            for (base64 map : list) {
                arrayList.add(this.scopeResultMapper.map(map));
            }
            return arrayList;
        }
    }
}
