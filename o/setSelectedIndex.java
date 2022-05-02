package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.RVTabBarImpl;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0014J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¨\u0006\u0016"}, d2 = {"Lid/dana/data/kycamledd/repository/source/network/NetworkKycAmlEddEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/kycamledd/repository/source/network/KycAmlEddFacade;", "Lid/dana/data/kycamledd/repository/source/KycAmlEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "securityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "getAmlEddConsult", "Lio/reactivex/Observable;", "Lid/dana/data/kycamledd/repository/source/network/response/EddConsultResponse;", "getFacadeClass", "Ljava/lang/Class;", "submitAmlEdd", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "eddInfoRequest", "Lid/dana/data/kycamledd/repository/source/network/request/EddInfoRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setSelectedIndex extends setRepeatCount<loadOnlineImage> implements clearBadge {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/kycamledd/repository/source/network/KycAmlEddFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMin<F, S> implements addAnimatorUpdateListener.getMax<loadOnlineImage, BaseRpcResult> {
        final /* synthetic */ onBackgroundAlphaStatusChanged getMax;
        final /* synthetic */ setSelectedIndex setMax;

        getMin(setSelectedIndex setselectedindex, onBackgroundAlphaStatusChanged onbackgroundalphastatuschanged) {
            this.setMax = setselectedindex;
            this.getMax = onbackgroundalphastatuschanged;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            onBackgroundAlphaStatusChanged onbackgroundalphastatuschanged = this.getMax;
            onbackgroundalphastatuschanged.envInfo = this.setMax.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((loadOnlineImage) obj).submitEdd(onbackgroundalphastatuschanged);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/kycamledd/repository/source/network/response/EddConsultResponse;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/kycamledd/repository/source/network/KycAmlEddFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class length<F, S> implements addAnimatorUpdateListener.getMax<loadOnlineImage, RVTabBarImpl.AnonymousClass2> {
        final /* synthetic */ setSelectedIndex getMin;

        length(setSelectedIndex setselectedindex) {
            this.getMin = setselectedindex;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            BaseRpcRequest baseRpcRequest = new BaseRpcRequest();
            baseRpcRequest.envInfo = this.getMin.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((loadOnlineImage) obj).consultEdd(baseRpcRequest);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setSelectedIndex(@NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume, @NotNull Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "securityFacade");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final Class<loadOnlineImage> getFacadeClass() {
        return loadOnlineImage.class;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<RVTabBarImpl.AnonymousClass2> getAmlEddConsult() {
        TitleBarRightButtonView.AnonymousClass1<RVTabBarImpl.AnonymousClass2> wrapper = wrapper(new length(this));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { facade ->\n    …nvInfo()\n        })\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> submitAmlEdd(@NotNull onBackgroundAlphaStatusChanged onbackgroundalphastatuschanged) {
        Intrinsics.checkNotNullParameter(onbackgroundalphastatuschanged, "eddInfoRequest");
        TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> wrapper = wrapper(new getMin(this, onbackgroundalphastatuschanged));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { facade ->\n    …nvInfo()\n        })\n    }");
        return wrapper;
    }
}
