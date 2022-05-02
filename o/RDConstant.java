package o;

import android.text.TextUtils;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import o.LocalAuthPermissionManager;
import o.TitleBarRightButtonView;
import o.b;

public class RDConstant extends setMinProgress implements getScanJobRuntimeMillis {
    private final setPageLoaded generateLinkEntityDataFactory;
    private final DefaultAuthenticationProxyImpl splitBillDetailResultMapper;
    private final hasPermissionOnScheme splitBillDetailToSplitBillHistoryEntityMapper;
    private final onConnectError splitBillEntityDataFactory;
    private final LocalAuthPermissionManager.AnonymousClass2.AnonymousClass1 splitBillHistoriesMapper;
    private final setOnConfirmClickListener splitBillHistoryEntitiesMapper;

    @Inject
    public RDConstant(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, onConnectError onconnecterror, LocalAuthPermissionManager.AnonymousClass2.AnonymousClass1 r6, setOnConfirmClickListener setonconfirmclicklistener, DefaultAuthenticationProxyImpl defaultAuthenticationProxyImpl, hasPermissionOnScheme haspermissiononscheme, setPageLoaded setpageloaded) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.splitBillEntityDataFactory = onconnecterror;
        this.splitBillHistoriesMapper = r6;
        this.splitBillHistoryEntitiesMapper = setonconfirmclicklistener;
        this.splitBillDetailResultMapper = defaultAuthenticationProxyImpl;
        this.splitBillDetailToSplitBillHistoryEntityMapper = haspermissiononscheme;
        this.generateLinkEntityDataFactory = setpageloaded;
    }

    private onRemoteDebugExitClick createLocalSplitBillEntityData() {
        return this.splitBillEntityDataFactory.createData("local");
    }

    private onRemoteDebugExitClick createSplitBillEntityData() {
        return this.splitBillEntityDataFactory.createData("network");
    }

    public TitleBarRightButtonView.AnonymousClass1<List<setLastScanStartTimeMillis>> getSplitBillHistories(int i) {
        TitleBarRightButtonView.AnonymousClass1<R> onErrorResumeNext = authenticatedRequest(createSplitBillEntityData().getSplitBillHistories(i)).flatMap(new PermissionPermitListener(this)).onErrorResumeNext(getLocalSplitBillHistories());
        LocalAuthPermissionManager.AnonymousClass2.AnonymousClass1 r0 = this.splitBillHistoriesMapper;
        Objects.requireNonNull(r0);
        return onErrorResumeNext.map(new setPermissionPermitListener(r0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getSplitBillHistories$0(tyroRequest tyrorequest) throws Exception {
        return updateLocalHistories(tyrorequest.getSplitBillHistoryList());
    }

    public TitleBarRightButtonView.AnonymousClass1<setLastScanStartTimeMillis> getSplitBillDetail(String str) {
        return authenticatedRequest(createSplitBillEntityData().getSplitBillDetail(str)).flatMap(new RVRemoteDebugProxy(this, str)).onErrorResumeNext(getLocalSplitBillDetail(str)).flatMap(new tyroRequestHasPermission(this)).map(new getRemoteDebugWebSocketUrl(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ setLastScanStartTimeMillis lambda$getSplitBillDetail$2(onSocketClose onsocketclose) throws Exception {
        return (setLastScanStartTimeMillis) this.splitBillDetailResultMapper.apply(onsocketclose.getSplitBillOrder());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> closePayers(List<String> list, String str) {
        return authenticatedRequest(createSplitBillEntityData().closePayers(list, str)).map(getRemoteDebugWebSocketUrlForDebug.getMax);
    }

    public TitleBarRightButtonView.AnonymousClass1<setLastScanStartTimeMillis> getPayerSplitBillDetail(String str) {
        return authenticatedRequest(createSplitBillEntityData().getSplitBillDetail(str)).map(new enableTyroBlock(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ setLastScanStartTimeMillis lambda$getPayerSplitBillDetail$4(onSocketClose onsocketclose) throws Exception {
        return (setLastScanStartTimeMillis) this.splitBillDetailResultMapper.apply(onsocketclose.getSplitBillOrder());
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass4<onSocketClose> getSplitBillDeeplinkIfEmpty(onSocketClose onsocketclose) {
        if (TextUtils.isEmpty(onsocketclose.getSplitBillOrder().getDeeplinkUrl())) {
            return createGenerateLinkEntityData().generateSplitBillDetailDeepLink(onsocketclose.getSplitBillOrder().getSplitBillId()).flatMap(new onConnectSuccess(onsocketclose));
        }
        return TitleBarRightButtonView.AnonymousClass1.just(onsocketclose);
    }

    private setPageId createGenerateLinkEntityData() {
        return this.generateLinkEntityDataFactory.createData("network");
    }

    private TitleBarRightButtonView.AnonymousClass1<tyroRequest> getLocalSplitBillHistories() {
        return createLocalSplitBillEntityData().getSplitBillHistories(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: updateSplitBillDetail */
    public TitleBarRightButtonView.AnonymousClass4<onSocketClose> lambda$getSplitBillDetail$1(String str, onSocketClose onsocketclose) {
        return createLocalSplitBillEntityData().updateSplitBillDetail((sendNetworkResponse) this.splitBillDetailToSplitBillHistoryEntityMapper.apply(onsocketclose.getSplitBillOrder())).flatMap(new RemoteDebugCommand(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$updateSplitBillDetail$6(String str, Boolean bool) throws Exception {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-2011366712, oncanceled);
            onCancelLoad.getMin(-2011366712, oncanceled);
        }
        return getLocalSplitBillDetail(str);
    }

    private TitleBarRightButtonView.AnonymousClass1<onSocketClose> getLocalSplitBillDetail(String str) {
        return createLocalSplitBillEntityData().getSplitBillDetail(str);
    }

    private TitleBarRightButtonView.AnonymousClass1<tyroRequest> updateLocalHistories(List<supportRemoteDebug> list) {
        return createLocalSplitBillEntityData().updateSplitBillHistories((List) this.splitBillHistoryEntitiesMapper.apply(list)).flatMap(new onConnectFailed(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$updateLocalHistories$7(Boolean bool) throws Exception {
        return getLocalSplitBillHistories();
    }
}
