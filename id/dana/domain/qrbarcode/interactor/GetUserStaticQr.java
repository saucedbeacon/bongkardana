package id.dana.domain.qrbarcode.interactor;

import dagger.Module;
import javax.inject.Inject;
import o.GriverPrepareInterceptor;
import o.TitleBarRightButtonView;
import o.appxLoadFailed;
import o.getScheme;
import o.parseFailed;

@Module
public class GetUserStaticQr extends parseFailed<GriverPrepareInterceptor.AnonymousClass1, Void> {
    private final GriverPrepareInterceptor repository;

    @Inject
    public GetUserStaticQr(appxLoadFailed appxloadfailed, getScheme getscheme, GriverPrepareInterceptor griverPrepareInterceptor) {
        super(appxloadfailed, getscheme);
        this.repository = griverPrepareInterceptor;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<GriverPrepareInterceptor.AnonymousClass1> buildUseCaseObservable(Void voidR) {
        return this.repository.getUserQr(false, "", 1);
    }
}
