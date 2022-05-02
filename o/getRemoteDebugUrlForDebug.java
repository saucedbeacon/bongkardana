package o;

import androidx.annotation.VisibleForTesting;
import id.dana.data.ProductFlavor;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AppMsgReceiver;
import o.TitleBarRightButtonView;

@Singleton
public class getRemoteDebugUrlForDebug implements applyChanges {
    private final onCallBack configEntityDataFactory;
    private final setParam okHttpSSLPinningManager;
    private final getInternalMemorySize sslPinningEntityDataFactory;
    private final appxLoadFailed threadExecutor;
    @VisibleForTesting
    boolean work = false;

    @Inject
    public getRemoteDebugUrlForDebug(getInternalMemorySize getinternalmemorysize, onCallBack oncallback, appxLoadFailed appxloadfailed, setParam setparam) {
        this.sslPinningEntityDataFactory = getinternalmemorysize;
        this.configEntityDataFactory = oncallback;
        this.threadExecutor = appxloadfailed;
        this.okHttpSSLPinningManager = setparam;
    }

    private AppMsgReceiver.AnonymousClass2 createConfigData() {
        return this.configEntityDataFactory.createData("network");
    }

    private appendExtraInfo createPinningData() {
        return this.sslPinningEntityDataFactory.createData("network");
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> pinCertificates() {
        return (PrepareCallbackParam.isDebugMode() || (!"production".equals(PrepareCallbackParam.getProductFlavor()) && !ProductFlavor.PREPROD.equals(PrepareCallbackParam.getProductFlavor()))) ? TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE) : createConfigData().getPinningMode().flatMap(new supportRemoteDebugMode(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$pinCertificates$1(Integer num) throws Exception {
        if (num.intValue() == 0) {
            return createPinningData().closeSslPinning();
        }
        return createConfigData().getCertificatesUrl().flatMap(new buildStandardLogInfo(this, num));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$pinCertificates$0(Integer num, List list) throws Exception {
        return createPinningData().addAndPersistRemoteCertificates(num.intValue(), list);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> pinHotUpdate() {
        if ("production".equals(PrepareCallbackParam.getProductFlavor()) || ProductFlavor.PREPROD.equals(PrepareCallbackParam.getProductFlavor())) {
            if (this.work) {
                return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
            }
            this.work = true;
            monitorPinningMode();
            monitorPinCertificatesUrl();
            monitorPinWhitelist();
        }
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
    }

    public Boolean isSslPinningSuccess() {
        return createPinningData().isSslPinningSuccess();
    }

    private void monitorPinningMode() {
        createConfigData().monitorPinningMode().flatMap(new remoteDebugByOpenChannel(this)).subscribeOn(getSecureSignatureComp.setMin(this.threadExecutor)).subscribe();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$monitorPinningMode$3(Integer num) throws Exception {
        if (num.intValue() == 0) {
            return createPinningData().closeSslPinning();
        }
        return createConfigData().getCertificatesUrl().flatMap(new checkMsgIsValid(this, num));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$monitorPinningMode$2(Integer num, List list) throws Exception {
        return createPinningData().addAndPersistRemoteCertificates(num.intValue(), list);
    }

    private void monitorPinCertificatesUrl() {
        createConfigData().monitorCertificatesUrl().flatMap(new isRemoteDebugConnected(this)).subscribeOn(getSecureSignatureComp.setMin(this.threadExecutor)).subscribe();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$monitorPinCertificatesUrl$5(List list) throws Exception {
        return createConfigData().getPinningMode().flatMap(new buildBasicLogInfo(this, list));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$monitorPinCertificatesUrl$4(List list, Integer num) throws Exception {
        return createPinningData().addAndPersistRemoteCertificates(num.intValue(), list);
    }

    private void monitorPinWhitelist() {
        createConfigData().getAndMonitorCertificateWhitelist().flatMap(new sendMessageToRemoteDebugOrVConsole(this)).subscribeOn(getSecureSignatureComp.setMin(this.threadExecutor)).subscribe();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$monitorPinWhitelist$6(List list) throws Exception {
        this.okHttpSSLPinningManager.getMin(list);
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
    }
}
