package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lid/dana/data/social/repository/SocialSyncProcessEntityDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/social/repository/SocialSyncProcessEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "getApSecurityFacade", "()Lid/dana/data/foundation/facade/ApSecurityFacade;", "getContext", "()Landroid/content/Context;", "getRpcConnector", "()Lid/dana/data/rpc/RpcConnector;", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getExtInfo extends uncheckItems<setScopeNicks> {
    @NotNull
    private final onAppResume apSecurityFacade;
    @NotNull
    private final Context context;
    @NotNull
    private final setIsUrgentResource rpcConnector;

    @NotNull
    public final setIsUrgentResource getRpcConnector() {
        return this.rpcConnector;
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
    public getExtInfo(@NotNull setIsUrgentResource setisurgentresource, @NotNull onAppResume onappresume, @NotNull Context context2) {
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        this.rpcConnector = setisurgentresource;
        this.apSecurityFacade = onappresume;
        this.context = context2;
    }

    @NotNull
    public final setScopeNicks createData(@Nullable String str) {
        return new getBizContent(this.rpcConnector, this.apSecurityFacade, this.context);
    }
}
