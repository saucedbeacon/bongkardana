package o;

import id.dana.data.Source;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/data/sendmoney/repository/source/BillerX2BEntityDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/sendmoney/BillerX2BEntityData;", "defaultAllBillerX2BEntityData", "Lid/dana/data/sendmoney/repository/source/local/DefaultBillerX2BEntityData;", "splitAllBillerX2BEntityData", "Lid/dana/data/sendmoney/repository/source/split/SplitBillerX2BEntityData;", "(Lid/dana/data/sendmoney/repository/source/local/DefaultBillerX2BEntityData;Lid/dana/data/sendmoney/repository/source/split/SplitBillerX2BEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isMainProcess extends uncheckItems<clearProcessCache> {
    private final StringUtils defaultAllBillerX2BEntityData;
    private final onNodeExit splitAllBillerX2BEntityData;

    @Inject
    public isMainProcess(@NotNull StringUtils stringUtils, @NotNull onNodeExit onnodeexit) {
        Intrinsics.checkNotNullParameter(stringUtils, "defaultAllBillerX2BEntityData");
        Intrinsics.checkNotNullParameter(onnodeexit, "splitAllBillerX2BEntityData");
        this.defaultAllBillerX2BEntityData = stringUtils;
        this.splitAllBillerX2BEntityData = onnodeexit;
    }

    @NotNull
    public final clearProcessCache createData(@Nullable String str) {
        if (str != null && str.hashCode() == 109648666 && str.equals(Source.SPLIT)) {
            return this.splitAllBillerX2BEntityData;
        }
        return this.defaultAllBillerX2BEntityData;
    }
}
