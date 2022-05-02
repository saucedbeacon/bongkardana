package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0014J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0016¨\u0006\u001e"}, d2 = {"Lid/dana/data/merchantmanagement/repository/source/network/NetworkMerchantManagementEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/merchantmanagement/repository/source/network/MerchantManagementFacade;", "Lid/dana/data/merchantmanagement/MerchantManagementEntityData;", "context", "Landroid/content/Context;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "(Landroid/content/Context;Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;)V", "getFacadeClass", "Ljava/lang/Class;", "getLinkedMerchants", "Lio/reactivex/Observable;", "Lid/dana/data/merchantmanagement/repository/source/network/result/BoundMerchantResult;", "pageNumber", "", "unbindConsult", "Lid/dana/data/merchantmanagement/repository/source/network/result/UnbindConsultResult;", "clientId", "", "merchantId", "divisionId", "unbindMerchant", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "unbindMerchantRequest", "Lid/dana/data/merchantmanagement/repository/source/network/request/UnbindMerchantRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getPoint extends setRepeatCount<tinyDebugConsole> implements preloadConsole {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/merchantmanagement/repository/source/network/MerchantManagementFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMin<F, S> implements addAnimatorUpdateListener.getMax<tinyDebugConsole, BaseRpcResult> {
        final /* synthetic */ BaseEngineImpl setMax;

        getMin(BaseEngineImpl baseEngineImpl) {
            this.setMax = baseEngineImpl;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((tinyDebugConsole) obj).unbindMerchant(this.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/merchantmanagement/repository/source/network/result/UnbindConsultResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/merchantmanagement/repository/source/network/MerchantManagementFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class length<F, S> implements addAnimatorUpdateListener.getMax<tinyDebugConsole, getApplication> {
        final /* synthetic */ sendMsg length;

        length(sendMsg sendmsg) {
            this.length = sendmsg;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((tinyDebugConsole) obj).unbindConsult(this.length);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/merchantmanagement/repository/source/network/result/BoundMerchantResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/merchantmanagement/repository/source/network/MerchantManagementFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class setMin<F, S> implements addAnimatorUpdateListener.getMax<tinyDebugConsole, setNativeBridge> {
        final /* synthetic */ getEngineType getMax;

        setMin(getEngineType getenginetype) {
            this.getMax = getenginetype;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((tinyDebugConsole) obj).getLinkedMerchants(this.getMax);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getPoint(@NotNull Context context, @NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
    }

    @NotNull
    public final Class<tinyDebugConsole> getFacadeClass() {
        return tinyDebugConsole.class;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setNativeBridge> getLinkedMerchants(int i) {
        getEngineType getenginetype = new getEngineType(i);
        getenginetype.envInfo = generateMobileEnvInfo();
        TitleBarRightButtonView.AnonymousClass1<setNativeBridge> wrapper = wrapper(new setMin(getenginetype));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { it.getLinkedMerchants(request) }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getApplication> unbindConsult(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "clientId");
        Intrinsics.checkNotNullParameter(str2, "merchantId");
        sendMsg sendmsg = new sendMsg((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        sendmsg.setClientId(str);
        sendmsg.setMerchantId(str2);
        sendmsg.setDivisionId(str3);
        TitleBarRightButtonView.AnonymousClass1<getApplication> wrapper = wrapper(new length(sendmsg));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { it.unbindConsult(request) }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> unbindMerchant(@NotNull BaseEngineImpl baseEngineImpl) {
        Intrinsics.checkNotNullParameter(baseEngineImpl, "unbindMerchantRequest");
        baseEngineImpl.envInfo = generateMobileEnvInfo();
        TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> wrapper = wrapper(new getMin(baseEngineImpl));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { it.unbindMerch…(unbindMerchantRequest) }");
        return wrapper;
    }
}
