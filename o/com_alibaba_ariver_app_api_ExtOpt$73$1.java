package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/data/loyalty/repository/source/LoyaltyEntityDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/loyalty/repository/source/LoyaltyEntityData;", "networkLoyaltyEntityData", "Lid/dana/data/loyalty/repository/source/network/NetworkLoyaltyEntityData;", "localLoyaltyEntityData", "Lid/dana/data/loyalty/repository/source/local/LocalLoyaltyEntityData;", "(Lid/dana/data/loyalty/repository/source/network/NetworkLoyaltyEntityData;Lid/dana/data/loyalty/repository/source/local/LocalLoyaltyEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class com_alibaba_ariver_app_api_ExtOpt$73$1 extends uncheckItems<com_alibaba_ariver_app_api_ExtOpt$75$1> {
    private final com_alibaba_ariver_app_api_ExtOpt$78$1 localLoyaltyEntityData;
    private final com_alibaba_ariver_app_api_ExtOpt$83$1 networkLoyaltyEntityData;

    @Inject
    public com_alibaba_ariver_app_api_ExtOpt$73$1(@NotNull com_alibaba_ariver_app_api_ExtOpt$83$1 com_alibaba_ariver_app_api_extopt_83_1, @NotNull com_alibaba_ariver_app_api_ExtOpt$78$1 com_alibaba_ariver_app_api_extopt_78_1) {
        Intrinsics.checkNotNullParameter(com_alibaba_ariver_app_api_extopt_83_1, "networkLoyaltyEntityData");
        Intrinsics.checkNotNullParameter(com_alibaba_ariver_app_api_extopt_78_1, "localLoyaltyEntityData");
        this.networkLoyaltyEntityData = com_alibaba_ariver_app_api_extopt_83_1;
        this.localLoyaltyEntityData = com_alibaba_ariver_app_api_extopt_78_1;
    }

    @NotNull
    public final com_alibaba_ariver_app_api_ExtOpt$75$1 createData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        int hashCode = str.hashCode();
        if (hashCode != 103145323) {
            if (hashCode == 1843485230 && str.equals("network")) {
                return this.networkLoyaltyEntityData;
            }
        } else if (str.equals("local")) {
            return this.localLoyaltyEntityData;
        }
        return this.networkLoyaltyEntityData;
    }
}
