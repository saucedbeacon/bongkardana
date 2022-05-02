package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.NativePermissionExtensionInvoker;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0014J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¨\u0006\u0012"}, d2 = {"Lid/dana/data/openbankaccount/repository/source/network/NetworkOpenBankAccountEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/openbankaccount/repository/source/network/OpenBankAccountFacade;", "Lid/dana/data/openbankaccount/OpenBankAccountEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "securityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "getFacadeClass", "Ljava/lang/Class;", "getInfoList", "Lio/reactivex/Observable;", "Lid/dana/data/openbankaccount/repository/source/network/result/BankAccountResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getMethodInvokeOptimizer extends setRepeatCount<ApiContextBinder> implements ResourceSourceType {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/openbankaccount/repository/source/network/result/BankAccountResult;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/openbankaccount/repository/source/network/OpenBankAccountFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMin<F, S> implements addAnimatorUpdateListener.getMax<ApiContextBinder, NativePermissionExtensionInvoker.AnonymousClass1> {
        final /* synthetic */ NativePermissionExtensionInvoker.FailedSet setMin;

        getMin(NativePermissionExtensionInvoker.FailedSet failedSet) {
            this.setMin = failedSet;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((ApiContextBinder) obj).getInfoList(this.setMin);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getMethodInvokeOptimizer(@NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume, @NotNull Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "securityFacade");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<NativePermissionExtensionInvoker.AnonymousClass1> getInfoList() {
        NativePermissionExtensionInvoker.FailedSet failedSet = new NativePermissionExtensionInvoker.FailedSet();
        failedSet.envInfo = generateMobileEnvInfo();
        TitleBarRightButtonView.AnonymousClass1<NativePermissionExtensionInvoker.AnonymousClass1> wrapper = wrapper(new getMin(failedSet));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { facade -> faca…openBankAccountRequest) }");
        return wrapper;
    }

    @NotNull
    public final Class<ApiContextBinder> getFacadeClass() {
        return ApiContextBinder.class;
    }
}
