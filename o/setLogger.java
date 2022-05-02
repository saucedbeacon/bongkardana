package o;

import javax.inject.Inject;
import o.GriverExecutors;
import o.TitleBarRightButtonView;

public class setLogger extends parseFailed<GriverRVExecutorServiceImpl, length> {
    private GriverExecutors.H5SingleThreadFactory.AnonymousClass1 lazadaRepository;

    @Inject
    public setLogger(appxLoadFailed appxloadfailed, getScheme getscheme, GriverExecutors.H5SingleThreadFactory.AnonymousClass1 r3) {
        super(appxloadfailed, getscheme);
        this.lazadaRepository = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<GriverRVExecutorServiceImpl> buildUseCaseObservable(length length2) {
        return this.lazadaRepository.getLazadaRegistrationUrl(length2.deviceId, length2.bizType);
    }

    public static class length {
        /* access modifiers changed from: private */
        public String bizType;
        /* access modifiers changed from: private */
        public String deviceId;

        private length(String str, String str2) {
            this.deviceId = str;
            this.bizType = str2;
        }

        public static length forGetURL(String str, String str2) {
            return new length(str, str2);
        }
    }
}
