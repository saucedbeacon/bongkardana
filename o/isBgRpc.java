package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/data/saving/repository/SavingWithdrawEntityDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/saving/repository/SavingWithdrawEntityData;", "networkSavingWithdrawEntityData", "Lid/dana/data/saving/repository/source/network/NetworkSavingWithdrawEntityData;", "defaultSavingWithdrawEntityData", "Lid/dana/data/saving/repository/source/local/DefaultSavingWithdrawEntityData;", "(Lid/dana/data/saving/repository/source/network/NetworkSavingWithdrawEntityData;Lid/dana/data/saving/repository/source/local/DefaultSavingWithdrawEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isBgRpc extends uncheckItems<isUrgent> {
    private final isRpcLoggerLevel defaultSavingWithdrawEntityData;
    private final gwUrl networkSavingWithdrawEntityData;

    @Inject
    public isBgRpc(@NotNull gwUrl gwurl, @NotNull isRpcLoggerLevel isrpcloggerlevel) {
        Intrinsics.checkNotNullParameter(gwurl, "networkSavingWithdrawEntityData");
        Intrinsics.checkNotNullParameter(isrpcloggerlevel, "defaultSavingWithdrawEntityData");
        this.networkSavingWithdrawEntityData = gwurl;
        this.defaultSavingWithdrawEntityData = isrpcloggerlevel;
    }

    @NotNull
    public final isUrgent createData(@Nullable String str) {
        if (Intrinsics.areEqual((Object) str, (Object) "network")) {
            return this.networkSavingWithdrawEntityData;
        }
        return this.defaultSavingWithdrawEntityData;
    }
}
