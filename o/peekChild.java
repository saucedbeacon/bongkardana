package o;

import android.app.Activity;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity;
import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.NullBeaconDataFactory;
import o.TitleBarRightButtonView;

@Singleton
public class peekChild implements setSupportZoom {
    private final assertOneSet authEntityDataFactory;
    private final getPageId deepLinkEntityDataFactory;
    private final waitOnFinalized deepLinkPayloadManager;
    private final pushChild deepLinkPayloadMapper;
    private final getEmbedType linkApiEntityDataFactory;
    private final toUuidString servicesRepository;

    @Inject
    public peekChild(getPageId getpageid, getEmbedType getembedtype, pushChild pushchild, waitOnFinalized waitonfinalized, assertOneSet assertoneset, toUuidString touuidstring) {
        this.deepLinkEntityDataFactory = getpageid;
        this.linkApiEntityDataFactory = getembedtype;
        this.deepLinkPayloadMapper = pushchild;
        this.deepLinkPayloadManager = waitonfinalized;
        this.authEntityDataFactory = assertoneset;
        this.servicesRepository = touuidstring;
    }

    public TitleBarRightButtonView.AnonymousClass1<getRequestHeaders> initSession(Activity activity) {
        TitleBarRightButtonView.AnonymousClass1<DeepLinkPayloadEntity> initSession = createDeepLinkNetworkData().initSession(activity);
        waitOnFinalized waitonfinalized = this.deepLinkPayloadManager;
        Objects.requireNonNull(waitonfinalized);
        TitleBarRightButtonView.AnonymousClass1<DeepLinkPayloadEntity> doOnNext = initSession.doOnNext(new setParentNode(waitonfinalized));
        pushChild pushchild = this.deepLinkPayloadMapper;
        Objects.requireNonNull(pushchild);
        return doOnNext.map(new bubbleFindNode(pushchild));
    }

    public TitleBarRightButtonView.AnonymousClass1<getRequestHeaders> getDeepLinkPayload(boolean z) {
        TitleBarRightButtonView.AnonymousClass1 flatMap = TitleBarRightButtonView.AnonymousClass1.defer(new getChild(this, z)).flatMap(new removeChild(this));
        pushChild pushchild = this.deepLinkPayloadMapper;
        Objects.requireNonNull(pushchild);
        return flatMap.map(new bubbleFindNode(pushchild));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getDeepLinkPayload$0(boolean z) throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.just(this.deepLinkPayloadManager.getDeepLinkPayloadEntity(z));
    }

    public TitleBarRightButtonView.AnonymousClass1<getRequestHeaders> readProperties(String str) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = createLinkApiNetworkData().readLink(str).flatMap(new removeChild(this));
        pushChild pushchild = this.deepLinkPayloadMapper;
        Objects.requireNonNull(pushchild);
        return flatMap.map(new bubbleFindNode(pushchild));
    }

    public boolean removeDeeplinkPayload() {
        if (!this.deepLinkPayloadManager.hasPayload()) {
            return false;
        }
        this.deepLinkPayloadManager.removeDeepLinkPayload();
        return true;
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<DeepLinkPayloadEntity> checkAuthEnable(DeepLinkPayloadEntity deepLinkPayloadEntity) {
        if (!isNeedAuth(deepLinkPayloadEntity)) {
            return TitleBarRightButtonView.AnonymousClass1.just(deepLinkPayloadEntity);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(deepLinkPayloadEntity.getServiceKey());
        return this.servicesRepository.getServicesByKey(arrayList).map(new getNodeId(this, deepLinkPayloadEntity)).flatMap(new isChildless(this)).map(new usePermissions(deepLinkPayloadEntity)).onErrorReturnItem(deepLinkPayloadEntity);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ThirdPartyServiceResponse lambda$checkAuthEnable$1(DeepLinkPayloadEntity deepLinkPayloadEntity, List list) throws Exception {
        return getThirdPartyService(list, deepLinkPayloadEntity.getServiceKey());
    }

    private boolean isNeedAuth(DeepLinkPayloadEntity deepLinkPayloadEntity) {
        return deepLinkPayloadEntity.isNeedAuth() && deepLinkPayloadEntity.getServiceKey() != null && BranchLinkConstant.PathTarget.CONTAINER.equalsIgnoreCase(deepLinkPayloadEntity.getPath());
    }

    @Nullable
    private ThirdPartyServiceResponse getThirdPartyService(List<NullBeaconDataFactory.AnonymousClass1> list, String str) {
        List<ThirdPartyServiceResponse> thirdPartyServices;
        if (list.isEmpty() || (thirdPartyServices = list.get(0).getThirdPartyServices()) == null) {
            return null;
        }
        return getService(thirdPartyServices, str);
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<String> getAuthCode(ThirdPartyServiceResponse thirdPartyServiceResponse) {
        return createAuthNetworkData().getAuthCode(thirdPartyServiceResponse.getRedirectUrl(), thirdPartyServiceResponse.getClientId(), thirdPartyServiceResponse.getScopes(), true, "", "", thirdPartyServiceResponse.getAppId() != null).map(inquiry.setMin);
    }

    @Nullable
    private ThirdPartyServiceResponse getService(List<ThirdPartyServiceResponse> list, String str) {
        for (ThirdPartyServiceResponse next : list) {
            if (next.getKey().equals(str)) {
                return next;
            }
        }
        return null;
    }

    private updatePadding createAuthNetworkData() {
        return this.authEntityDataFactory.createData("network");
    }

    private isRenderReady createLinkApiNetworkData() {
        return this.linkApiEntityDataFactory.createData("network");
    }

    private setExitListener createDeepLinkNetworkData() {
        return this.deepLinkEntityDataFactory.createData("network");
    }
}
