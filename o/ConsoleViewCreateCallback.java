package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.data.network.ResultResponse;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.DebugConsoleExtension;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\u0006\u0010\u0011\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0014J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u0011\u001a\u00020\u001aH\u0016R\u000e\u0010\f\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lid/dana/data/merchant/repository/source/network/NetworkProductInfoEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/merchant/repository/source/network/ProductInfoFacade;", "Lid/dana/data/merchant/repository/source/ProductInfoEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "securityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "productInfoFacade", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;Lid/dana/data/merchant/repository/source/network/ProductInfoFacade;)V", "bizDestinationInquiry", "Lio/reactivex/Observable;", "Lid/dana/data/merchant/repository/source/network/response/BizDestinationInquiryResult;", "request", "Lid/dana/data/merchant/repository/source/network/request/BizDestinationInquiryRequest;", "createProductOrder", "Lid/dana/data/merchant/repository/source/network/response/CreateProductOrderResult;", "Lid/dana/data/merchant/repository/source/network/request/CreateProductOrderRequest;", "getFacadeClass", "Ljava/lang/Class;", "queryLastSuccessfulTransaction", "Lid/dana/data/merchant/repository/source/network/response/QueryLastSuccessfulTransactionResponse;", "Lid/dana/data/merchant/repository/source/network/request/QueryLastSuccessfulTransactionRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ConsoleViewCreateCallback extends setRepeatCount<isDebugPanelExists> {
    private final isDebugPanelExists productInfoFacade;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/merchant/repository/source/network/response/BizDestinationInquiryResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/network/ResultResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<ResultResponse<RVDebugConsoleProxy>, RVDebugConsoleProxy> {
        public static final getMax setMax = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ResultResponse resultResponse = (ResultResponse) obj;
            Intrinsics.checkNotNullParameter(resultResponse, "it");
            return (RVDebugConsoleProxy) resultResponse.getResult();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/merchant/repository/source/network/response/QueryLastSuccessfulTransactionResponse;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/network/ResultResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<ResultResponse<setToggleButtonVisible>, setToggleButtonVisible> {
        public static final getMin setMax = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ResultResponse resultResponse = (ResultResponse) obj;
            Intrinsics.checkNotNullParameter(resultResponse, "it");
            return (setToggleButtonVisible) resultResponse.getResult();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/merchant/repository/source/network/response/CreateProductOrderResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/network/ResultResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<ResultResponse<sendMsgToConsole>, sendMsgToConsole> {
        public static final setMax getMin = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ResultResponse resultResponse = (ResultResponse) obj;
            Intrinsics.checkNotNullParameter(resultResponse, "it");
            return (sendMsgToConsole) resultResponse.getResult();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ConsoleViewCreateCallback(@NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume, @NotNull Context context, @NotNull isDebugPanelExists isdebugpanelexists) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "securityFacade");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(isdebugpanelexists, "productInfoFacade");
        this.productInfoFacade = isdebugpanelexists;
    }

    @NotNull
    public final Class<isDebugPanelExists> getFacadeClass() {
        return isDebugPanelExists.class;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<RVDebugConsoleProxy> bizDestinationInquiry(@NotNull sendMsgToConsoleView sendmsgtoconsoleview) {
        Intrinsics.checkNotNullParameter(sendmsgtoconsoleview, RequestPermissionsEvent.REQUEST);
        isDebugPanelExists isdebugpanelexists = this.productInfoFacade;
        String obj = getAlign.getCtokenWithoutKey().toString();
        sendmsgtoconsoleview.envInfo = generateMobileEnvInfo();
        Unit unit = Unit.INSTANCE;
        TitleBarRightButtonView.AnonymousClass1<R> map = isdebugpanelexists.bizDestinationInquiry(obj, sendmsgtoconsoleview).map(getMax.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "productInfoFacade.bizDes…      it.result\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<sendMsgToConsole> createProductOrder(@NotNull DebugConsoleExtension.AnonymousClass1 r3) {
        Intrinsics.checkNotNullParameter(r3, RequestPermissionsEvent.REQUEST);
        TitleBarRightButtonView.AnonymousClass1<R> map = this.productInfoFacade.createProductOrder(getAlign.getCtokenWithoutKey().toString(), r3).map(setMax.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "productInfoFacade.create…      it.result\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setToggleButtonVisible> queryLastSuccessfulTransaction(@NotNull setNode setnode) {
        Intrinsics.checkNotNullParameter(setnode, RequestPermissionsEvent.REQUEST);
        TitleBarRightButtonView.AnonymousClass1<R> map = this.productInfoFacade.queryLastSuccessfulTransaction(getAlign.getCtokenWithoutKey().toString(), setnode).map(getMin.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "productInfoFacade.queryL…      it.result\n        }");
        return map;
    }
}
