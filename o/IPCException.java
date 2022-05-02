package o;

import id.dana.data.Source;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/data/services/repository/source/ServicesEntityDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/services/repository/source/ServicesEntityData;", "amcsServicesEntityData", "Lid/dana/data/services/repository/source/amcs/AmcsServicesEntityData;", "splitServicesEntityData", "Lid/dana/data/services/repository/source/split/SplitServicesEntityData;", "defaultServicesEntityData", "Lid/dana/data/services/repository/source/local/DefaultServicesEntityData;", "(Lid/dana/data/services/repository/source/amcs/AmcsServicesEntityData;Lid/dana/data/services/repository/source/split/SplitServicesEntityData;Lid/dana/data/services/repository/source/local/DefaultServicesEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class IPCException extends uncheckItems<IPCParameter> {
    private final IPCResultDesc amcsServicesEntityData;
    private final LocalCallManager defaultServicesEntityData;
    private final isNoPermissionConfigAndAllow splitServicesEntityData;

    @Inject
    public IPCException(@NotNull IPCResultDesc iPCResultDesc, @NotNull isNoPermissionConfigAndAllow isnopermissionconfigandallow, @NotNull LocalCallManager localCallManager) {
        Intrinsics.checkNotNullParameter(iPCResultDesc, "amcsServicesEntityData");
        Intrinsics.checkNotNullParameter(isnopermissionconfigandallow, "splitServicesEntityData");
        Intrinsics.checkNotNullParameter(localCallManager, "defaultServicesEntityData");
        this.amcsServicesEntityData = iPCResultDesc;
        this.splitServicesEntityData = isnopermissionconfigandallow;
        this.defaultServicesEntityData = localCallManager;
    }

    @NotNull
    public final IPCParameter createData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        int hashCode = str.hashCode();
        if (hashCode != 2997660) {
            if (hashCode == 109648666 && str.equals(Source.SPLIT)) {
                return this.splitServicesEntityData;
            }
        } else if (str.equals("amcs")) {
            return this.amcsServicesEntityData;
        }
        return this.defaultServicesEntityData;
    }
}
