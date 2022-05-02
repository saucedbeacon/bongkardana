package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0014¨\u0006\u0012"}, d2 = {"Lid/dana/data/donation/repository/source/network/NetworkDonationCampaignEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/donation/repository/source/network/DonationCampaignFacade;", "Lid/dana/data/donation/repository/DonationCampaignEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "securityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "getDonationCampaigns", "Lio/reactivex/Observable;", "Lid/dana/data/donation/repository/source/network/result/DonationCampaignResult;", "getFacadeClass", "Ljava/lang/Class;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getErrorView extends setRepeatCount<getLoadingView> implements onRenderReady {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/donation/repository/source/network/result/DonationCampaignResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/donation/repository/source/network/DonationCampaignFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class setMax<F, S> implements addAnimatorUpdateListener.getMax<getLoadingView, getContentView> {
        final /* synthetic */ BaseRpcRequest length;

        setMax(BaseRpcRequest baseRpcRequest) {
            this.length = baseRpcRequest;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((getLoadingView) obj).getCampaigns(this.length);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getErrorView(@NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume, @NotNull Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "securityFacade");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final Class<getLoadingView> getFacadeClass() {
        return getLoadingView.class;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getContentView> getDonationCampaigns() {
        BaseRpcRequest baseRpcRequest = new BaseRpcRequest();
        baseRpcRequest.envInfo = generateMobileEnvInfo();
        TitleBarRightButtonView.AnonymousClass1<getContentView> wrapper = wrapper(new setMax(baseRpcRequest));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { it.getCampaigns(request) }");
        return wrapper;
    }
}
