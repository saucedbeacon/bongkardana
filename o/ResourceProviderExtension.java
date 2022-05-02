package o;

import javax.inject.Inject;
import o.GriverPrepareInterceptor;
import o.TitleBarRightButtonView;

public class ResourceProviderExtension extends parseFailed<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1, setMax> {
    private final GriverPrepareInterceptor repository;

    @Inject
    public ResourceProviderExtension(appxLoadFailed appxloadfailed, getScheme getscheme, GriverPrepareInterceptor griverPrepareInterceptor) {
        super(appxloadfailed, getscheme);
        this.repository = griverPrepareInterceptor;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1> buildUseCaseObservable(setMax setmax) {
        return this.repository.getDecodedQrBarcode(setmax.scanResult, setmax.scene, setmax.isWhitelistedQrH5Container.booleanValue());
    }

    public static final class setMax {
        /* access modifiers changed from: private */
        public Boolean isWhitelistedQrH5Container;
        /* access modifiers changed from: private */
        public String scanResult;
        /* access modifiers changed from: private */
        public String scene;

        private setMax(String str, String str2, Boolean bool) {
            this.scanResult = str;
            this.scene = str2;
            this.isWhitelistedQrH5Container = bool;
        }

        public static setMax forDecodeQrBarcode(String str, String str2, Boolean bool) {
            return new setMax(str, str2, bool);
        }
    }
}
