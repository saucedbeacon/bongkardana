package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.RVTabBarImpl;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0014J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u0016¨\u0006\u0014"}, d2 = {"Lid/dana/data/kycrenewal/repository/source/network/NetworkKycRenewalEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/kycrenewal/repository/source/network/UserKYCFacade;", "Lid/dana/data/kycrenewal/repository/source/KycRenewalEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "securityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "getFacadeClass", "Ljava/lang/Class;", "getKYCRenewalStatus", "Lio/reactivex/Observable;", "Lid/dana/data/kycrenewal/repository/source/network/result/QueryKYCRenewalStatusResult;", "getKYCUserData", "Lid/dana/data/kycrenewal/repository/source/network/result/QueryKYCUserDataResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getIconAreaView extends setRepeatCount<RVTabBarImpl.ImageListener> implements RVTabBarImpl.AnonymousClass3.AnonymousClass1 {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/kycrenewal/repository/source/network/result/QueryKYCRenewalStatusResult;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/kycrenewal/repository/source/network/UserKYCFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMin<F, S> implements addAnimatorUpdateListener.getMax<RVTabBarImpl.ImageListener, getDotRadius> {
        final /* synthetic */ getIconAreaView setMin;

        getMin(getIconAreaView geticonareaview) {
            this.setMin = geticonareaview;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            BaseRpcRequest baseRpcRequest = new BaseRpcRequest();
            baseRpcRequest.envInfo = this.setMin.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((RVTabBarImpl.ImageListener) obj).queryKYCRenewalStatus(baseRpcRequest);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/kycrenewal/repository/source/network/result/QueryKYCUserDataResult;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/kycrenewal/repository/source/network/UserKYCFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class setMax<F, S> implements addAnimatorUpdateListener.getMax<RVTabBarImpl.ImageListener, RVTabDotView> {
        final /* synthetic */ getIconAreaView setMin;

        setMax(getIconAreaView geticonareaview) {
            this.setMin = geticonareaview;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            BaseRpcRequest baseRpcRequest = new BaseRpcRequest();
            baseRpcRequest.envInfo = this.setMin.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((RVTabBarImpl.ImageListener) obj).queryKYCUserData(baseRpcRequest);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getIconAreaView(@NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume, @NotNull Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "securityFacade");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final Class<RVTabBarImpl.ImageListener> getFacadeClass() {
        return RVTabBarImpl.ImageListener.class;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getDotRadius> setMin() {
        TitleBarRightButtonView.AnonymousClass1<getDotRadius> wrapper = wrapper(new getMin(this));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { facade ->\n    …\n            })\n        }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<RVTabDotView> getMin() {
        TitleBarRightButtonView.AnonymousClass1<RVTabDotView> wrapper = wrapper(new setMax(this));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { facade ->\n    …\n            })\n        }");
        return wrapper;
    }
}
