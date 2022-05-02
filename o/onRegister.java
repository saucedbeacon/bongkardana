package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ServerMsgReceiver;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0014J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001b\u0010\u0014\u001a\u0002H\u0015\"\b\b\u0000\u0010\u0015*\u00020\u0016*\u0002H\u0015H\u0002¢\u0006\u0002\u0010\u0017¨\u0006\u0019"}, d2 = {"Lid/dana/data/investment/repository/source/NetworkInvestmentEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/investment/repository/source/network/InvestmentFacade;", "Lid/dana/data/investment/repository/source/InvestmentEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "securityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "getFacadeClass", "Ljava/lang/Class;", "getUserInvestmentAccount", "Lio/reactivex/Observable;", "Lid/dana/data/investment/repository/source/network/response/AccountInvestmentResult;", "userId", "", "addMobileEnvInfo", "T", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "(Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;)Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onRegister extends setRepeatCount<onUnRegister> implements ServerMsgReceiver.AnonymousClass1 {
    @NotNull
    public static final getMin getMax = new getMin((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/investment/repository/source/network/response/AccountInvestmentResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/investment/repository/source/network/InvestmentFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMax<F, S> implements addAnimatorUpdateListener.getMax<onUnRegister, createPage> {
        final /* synthetic */ onRegister getMax;
        final /* synthetic */ String setMin;

        getMax(onRegister onregister, String str) {
            this.getMax = onregister;
            this.setMin = str;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((onUnRegister) obj).queryAccountInvestment((RVPageFactory) new RVPageFactory(this.setMin, "danaplus_mutual_funds_1").envInfo = this.getMax.generateMobileEnvInfo());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public onRegister(@NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume, @NotNull Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "securityFacade");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final Class<onUnRegister> getFacadeClass() {
        return onUnRegister.class;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<createPage> setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "userId");
        TitleBarRightButtonView.AnonymousClass1<createPage> wrapper = wrapper(new getMax(this, str));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n        it.que…addMobileEnvInfo())\n    }");
        return wrapper;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/investment/repository/source/NetworkInvestmentEntityData$Companion;", "", "()V", "GOODS_ID", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }
}
