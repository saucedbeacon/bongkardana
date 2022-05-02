package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class isLocalPath extends parseFailed<ToastUtils, length> {
    private final isDynamicDelivery payAssetRepository;

    @Inject
    public isLocalPath(appxLoadFailed appxloadfailed, getScheme getscheme, isDynamicDelivery isdynamicdelivery, getCommonResources getcommonresources) {
        super(appxloadfailed, getscheme);
        this.payAssetRepository = isdynamicdelivery;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<ToastUtils> buildUseCaseObservable(length length2) {
        return this.payAssetRepository.queryPayMethod(length2.utdid, length2.scene);
    }

    public static class length {
        /* access modifiers changed from: private */
        public String scene;
        /* access modifiers changed from: private */
        public String utdid;

        private length(String str) {
            this.utdid = str;
        }

        private length(String str, String str2) {
            this(str);
            this.scene = str2;
        }

        public static length forF2FPayUtdid(String str) {
            return new length(str);
        }

        public static length forQueryAsset(String str, String str2) {
            return new length(str, str2);
        }
    }
}
