package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class SystemUtils extends parseFailed<TinyUtils, setMin> {
    private final isDynamicDelivery payAssetRepository;

    @Inject
    public SystemUtils(appxLoadFailed appxloadfailed, getScheme getscheme, isDynamicDelivery isdynamicdelivery) {
        super(appxloadfailed, getscheme);
        this.payAssetRepository = isdynamicdelivery;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<TinyUtils> buildUseCaseObservable(setMin setmin) {
        return this.payAssetRepository.changePayMethod(setmin.cardIndexNo, setmin.payMethod, setmin.payOption);
    }

    public static class setMin {
        /* access modifiers changed from: private */
        public String cardIndexNo;
        /* access modifiers changed from: private */
        public String payMethod;
        /* access modifiers changed from: private */
        public String payOption;

        private setMin(String str, String str2, String str3) {
            this.cardIndexNo = str;
            this.payMethod = str2;
            this.payOption = str3;
        }

        public static setMin forChangePayMethod(String str, String str2, String str3) {
            return new setMin(str, str2, str3);
        }
    }
}
