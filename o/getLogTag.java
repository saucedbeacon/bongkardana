package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.BaseWorkerImpl;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0014J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, d2 = {"Lid/dana/data/ott/repository/source/network/NetworkOttEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/ott/repository/source/network/OttManageRpcFacade;", "Lid/dana/data/ott/repository/source/OttEntityData;", "context", "Landroid/content/Context;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "executor", "Lid/dana/domain/ThreadExecutor;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "(Landroid/content/Context;Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;)V", "getFacadeClass", "Ljava/lang/Class;", "getOttVerify", "Lio/reactivex/Observable;", "Lid/dana/data/ott/OttVerifyEntity;", "ottValue", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getLogTag extends setRepeatCount<isDevSession> implements BaseWorkerImpl.RenderReadyListener {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/ott/OttVerifyEntity;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/ott/repository/source/network/OttManageRpcFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class setMin<F, S> implements addAnimatorUpdateListener.getMax<isDevSession, isPrestarted> {
        final /* synthetic */ setAppId getMin;

        setMin(setAppId setappid) {
            this.getMin = setappid;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((isDevSession) obj).ottVerify(this.getMin);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getLogTag(@NotNull Context context, @NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "executor");
        Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
    }

    @NotNull
    public final Class<isDevSession> getFacadeClass() {
        return isDevSession.class;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<isPrestarted> setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "ottValue");
        TitleBarRightButtonView.AnonymousClass1<isPrestarted> wrapper = wrapper(new setMin(new setAppId(str)));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { facade -> faca…erify(ottVerifyRequest) }");
        return wrapper;
    }
}
