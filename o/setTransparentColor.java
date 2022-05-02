package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lid/dana/data/globalnetwork/source/UniPaymentDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/globalnetwork/source/UniPaymentEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "getApSecurityFacade", "()Lid/dana/data/foundation/facade/ApSecurityFacade;", "getContext", "()Landroid/content/Context;", "getRpcConnector", "()Lid/dana/data/rpc/RpcConnector;", "getThreadExecutor", "()Lid/dana/domain/ThreadExecutor;", "createData", "Lid/dana/data/globalnetwork/source/network/NetworkUniPaymentEntityData;", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setTransparentColor extends uncheckItems<getStatusBarHeight> {
    @NotNull
    private final onAppResume apSecurityFacade;
    @NotNull
    private final Context context;
    @NotNull
    private final setIsUrgentResource rpcConnector;
    @NotNull
    private final appxLoadFailed threadExecutor;

    @NotNull
    public final setIsUrgentResource getRpcConnector() {
        return this.rpcConnector;
    }

    @NotNull
    public final appxLoadFailed getThreadExecutor() {
        return this.threadExecutor;
    }

    @NotNull
    public final onAppResume getApSecurityFacade() {
        return this.apSecurityFacade;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Inject
    public setTransparentColor(@NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume, @NotNull Context context2) {
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        this.rpcConnector = setisurgentresource;
        this.threadExecutor = appxloadfailed;
        this.apSecurityFacade = onappresume;
        this.context = context2;
    }

    @NotNull
    public final getColorScheme createData(@Nullable String str) {
        return new getColorScheme(this.rpcConnector, this.threadExecutor, this.apSecurityFacade, this.context);
    }
}
