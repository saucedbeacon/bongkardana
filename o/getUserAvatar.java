package o;

import id.dana.data.Source;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/data/senddigitalmoney/repository/source/SendDigitalMoneyEntityDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/senddigitalmoney/SendDigitalMoneyEntityData;", "networkDigitalMoneyEntityData", "Lid/dana/data/senddigitalmoney/repository/source/network/NetworkDigitalMoneyEntityData;", "splitSendDigitalMoneyEntityData", "Lid/dana/data/senddigitalmoney/repository/source/split/SplitSendDigitalMoneyEntityData;", "(Lid/dana/data/senddigitalmoney/repository/source/network/NetworkDigitalMoneyEntityData;Lid/dana/data/senddigitalmoney/repository/source/split/SplitSendDigitalMoneyEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getUserAvatar extends uncheckItems<OneShotRunnablePool> {
    private final RVConfigService getMax;
    private final GlobalInfoRecorder setMin;

    @Inject
    public getUserAvatar(@NotNull GlobalInfoRecorder globalInfoRecorder, @NotNull RVConfigService rVConfigService) {
        Intrinsics.checkNotNullParameter(globalInfoRecorder, "networkDigitalMoneyEntityData");
        Intrinsics.checkNotNullParameter(rVConfigService, "splitSendDigitalMoneyEntityData");
        this.setMin = globalInfoRecorder;
        this.getMax = rVConfigService;
    }

    @NotNull
    /* renamed from: setMax */
    public final OneShotRunnablePool createData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        if (str.hashCode() == 109648666 && str.equals(Source.SPLIT)) {
            return this.getMax;
        }
        return this.setMin;
    }
}
