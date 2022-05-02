package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.BridgeDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/data/openbankaccount/repository/source/OpenBankAccountDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/openbankaccount/OpenBankAccountEntityData;", "networkOpenBankAccountEntityData", "Lid/dana/data/openbankaccount/repository/source/network/NetworkOpenBankAccountEntityData;", "mockOpenBankAccountEntityData", "Lid/dana/data/openbankaccount/repository/source/mock/MockOpenBankAccountEntityData;", "(Lid/dana/data/openbankaccount/repository/source/network/NetworkOpenBankAccountEntityData;Lid/dana/data/openbankaccount/repository/source/mock/MockOpenBankAccountEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getRaw extends uncheckItems<ResourceSourceType> {
    private final BridgeDispatcher.AnonymousClass1 mockOpenBankAccountEntityData;
    private final getMethodInvokeOptimizer networkOpenBankAccountEntityData;

    @Inject
    public getRaw(@NotNull getMethodInvokeOptimizer getmethodinvokeoptimizer, @NotNull BridgeDispatcher.AnonymousClass1 r3) {
        Intrinsics.checkNotNullParameter(getmethodinvokeoptimizer, "networkOpenBankAccountEntityData");
        Intrinsics.checkNotNullParameter(r3, "mockOpenBankAccountEntityData");
        this.networkOpenBankAccountEntityData = getmethodinvokeoptimizer;
        this.mockOpenBankAccountEntityData = r3;
    }

    @NotNull
    public final ResourceSourceType createData(@Nullable String str) {
        if (str != null && str.hashCode() == 3357066 && str.equals("mock")) {
            return this.mockOpenBankAccountEntityData;
        }
        return this.networkOpenBankAccountEntityData;
    }
}
