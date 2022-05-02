package o;

import androidx.annotation.NonNull;
import javax.inject.Inject;
import o.AppPreDownloadManager;
import o.TitleBarRightButtonView;

public class getAppPreDownloadCacheManager extends parseFailed<AppPreDownloadManager.AnonymousClass3, Void> {
    private final setFireMoment qrPayRepository;
    private final AppPreDownloadManager.AnonymousClass3 qrisPaymentData;
    private final onDescriptorWrite userRepository;

    @Inject
    public getAppPreDownloadCacheManager(appxLoadFailed appxloadfailed, getScheme getscheme, AppPreDownloadManager.AnonymousClass3 r3, setFireMoment setfiremoment, onDescriptorWrite ondescriptorwrite) {
        super(appxloadfailed, getscheme);
        this.qrPayRepository = setfiremoment;
        this.userRepository = ondescriptorwrite;
        this.qrisPaymentData = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<AppPreDownloadManager.AnonymousClass3> buildUseCaseObservable(Void voidR) {
        return getPaymentCode().flatMap(putPaymentCodeQrisData()).flatMap(getUserInfo()).flatMap(putUserInfoInQrisData());
    }

    private TitleBarRightButtonView.AnonymousClass1<GriverRpcExtension> getPaymentCode() {
        return this.qrPayRepository.getPaymentCode().onErrorResumeNext(TitleBarRightButtonView.AnonymousClass1.just(new GriverRpcExtension()));
    }

    @NonNull
    private RedDotDrawable<GriverRpcExtension, TitleBarRightButtonView.AnonymousClass4<AppPreDownloadManager.AnonymousClass3>> putPaymentCodeQrisData() {
        return new AppPreDownloadConstant(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$putPaymentCodeQrisData$0(GriverRpcExtension griverRpcExtension) throws Exception {
        this.qrisPaymentData.setPaymentCodeResponse(griverRpcExtension);
        return TitleBarRightButtonView.AnonymousClass1.just(this.qrisPaymentData);
    }

    @NonNull
    private RedDotDrawable<AppPreDownloadManager.AnonymousClass3, TitleBarRightButtonView.AnonymousClass4<disconnect>> getUserInfo() {
        return new AppPreDownloadManager(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getUserInfo$1(AppPreDownloadManager.AnonymousClass3 r2) throws Exception {
        return this.userRepository.getUserInfoWithUserPan().onErrorResumeNext(TitleBarRightButtonView.AnonymousClass1.just(new disconnect()));
    }

    @NonNull
    private RedDotDrawable<disconnect, TitleBarRightButtonView.AnonymousClass4<AppPreDownloadManager.AnonymousClass3>> putUserInfoInQrisData() {
        return new getCountDownLatch(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$putUserInfoInQrisData$2(disconnect disconnect) throws Exception {
        this.qrisPaymentData.setUserInfoResponse(disconnect);
        return TitleBarRightButtonView.AnonymousClass1.just(this.qrisPaymentData);
    }
}
