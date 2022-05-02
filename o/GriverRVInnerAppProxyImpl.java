package o;

import javax.inject.Inject;
import o.GriverExecutors;
import o.TitleBarRightButtonView;

public class GriverRVInnerAppProxyImpl extends parseFailed<Boolean, Void> {
    GriverExecutors.H5SingleThreadFactory.AnonymousClass1 lazadaRepository;

    @Inject
    public GriverRVInnerAppProxyImpl(appxLoadFailed appxloadfailed, getScheme getscheme, GriverExecutors.H5SingleThreadFactory.AnonymousClass1 r3) {
        super(appxloadfailed, getscheme);
        this.lazadaRepository = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.lazadaRepository.isClickedAgree();
    }
}
