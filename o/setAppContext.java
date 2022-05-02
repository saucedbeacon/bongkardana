package o;

import id.dana.data.Source;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.RVConfigService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/data/sendmoney/repository/source/DigitalMoneyEntityDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/sendmoney/DigitalMoneyEntityData;", "amcsDigitalMoneyEntityData", "Lid/dana/data/sendmoney/repository/source/amcs/AmcsDigitalMoneyEntityData;", "defaultDigitalMoneyEntityData", "Lid/dana/data/sendmoney/repository/source/local/DefaultDigitalMoneyEntityData;", "splitDigitalMoneyEntityData", "Lid/dana/data/sendmoney/repository/source/split/SplitDigitalMoneyEntityData;", "(Lid/dana/data/sendmoney/repository/source/amcs/AmcsDigitalMoneyEntityData;Lid/dana/data/sendmoney/repository/source/local/DefaultDigitalMoneyEntityData;Lid/dana/data/sendmoney/repository/source/split/SplitDigitalMoneyEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setAppContext extends uncheckItems<RVConfigService.OnConfigChangeListener> {
    private final startPhase amcsDigitalMoneyEntityData;
    private final map2String defaultDigitalMoneyEntityData;
    private final IIPCManager splitDigitalMoneyEntityData;

    @Inject
    public setAppContext(@NotNull startPhase startphase, @NotNull map2String map2string, @NotNull IIPCManager iIPCManager) {
        Intrinsics.checkNotNullParameter(startphase, "amcsDigitalMoneyEntityData");
        Intrinsics.checkNotNullParameter(map2string, "defaultDigitalMoneyEntityData");
        Intrinsics.checkNotNullParameter(iIPCManager, "splitDigitalMoneyEntityData");
        this.amcsDigitalMoneyEntityData = startphase;
        this.defaultDigitalMoneyEntityData = map2string;
        this.splitDigitalMoneyEntityData = iIPCManager;
    }

    @NotNull
    public final RVConfigService.OnConfigChangeListener createData(@Nullable String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 2997660) {
                if (hashCode == 109648666 && str.equals(Source.SPLIT)) {
                    return this.splitDigitalMoneyEntityData;
                }
            } else if (str.equals("amcs")) {
                return this.amcsDigitalMoneyEntityData;
            }
        }
        return this.defaultDigitalMoneyEntityData;
    }
}
