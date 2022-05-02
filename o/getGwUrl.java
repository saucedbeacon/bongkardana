package o;

import id.dana.data.Source;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/data/saving/repository/SavingConfigEntityDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/saving/repository/SavingConfigEntityData;", "splitConfigEntityData", "Lid/dana/data/saving/repository/source/split/SplitSavingConfigEntityData;", "defaultConfigEntityData", "Lid/dana/data/saving/repository/source/local/DefaultSavingConfigEntityData;", "(Lid/dana/data/saving/repository/source/split/SplitSavingConfigEntityData;Lid/dana/data/saving/repository/source/local/DefaultSavingConfigEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getGwUrl extends uncheckItems<getStatusCode> {
    private final isGetMethod defaultConfigEntityData;
    private final region splitConfigEntityData;

    @Inject
    public getGwUrl(@NotNull region region, @NotNull isGetMethod isgetmethod) {
        Intrinsics.checkNotNullParameter(region, "splitConfigEntityData");
        Intrinsics.checkNotNullParameter(isgetmethod, "defaultConfigEntityData");
        this.splitConfigEntityData = region;
        this.defaultConfigEntityData = isgetmethod;
    }

    @NotNull
    public final getStatusCode createData(@Nullable String str) {
        if (Intrinsics.areEqual((Object) str, (Object) Source.SPLIT)) {
            return this.splitConfigEntityData;
        }
        return this.defaultConfigEntityData;
    }
}
