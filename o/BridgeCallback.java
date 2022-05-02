package o;

import id.dana.data.Source;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.BridgeResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/data/nearbyme/repository/source/NearbyMeConfigDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/nearbyme/MerchantConfigEntityData;", "amcsMerchantConfigEntityData", "Lid/dana/data/nearbyme/repository/source/amcs/AmcsMerchantConfigEntityData;", "splitMerchantConfigEntity", "Lid/dana/data/nearbyme/repository/source/split/SplitMerchantConfigEntity;", "defaultMerchantConfigEntityData", "Lid/dana/data/nearbyme/repository/source/local/DefaultMerchantConfigEntityData;", "(Lid/dana/data/nearbyme/repository/source/amcs/AmcsMerchantConfigEntityData;Lid/dana/data/nearbyme/repository/source/split/SplitMerchantConfigEntity;Lid/dana/data/nearbyme/repository/source/local/DefaultMerchantConfigEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BridgeCallback extends uncheckItems<getRenderById> {
    private final BridgeResponse amcsMerchantConfigEntityData;
    private final BridgeResponse.Error defaultMerchantConfigEntityData;
    private final getCallMode splitMerchantConfigEntity;

    @Inject
    public BridgeCallback(@NotNull BridgeResponse bridgeResponse, @NotNull getCallMode getcallmode, @NotNull BridgeResponse.Error error) {
        Intrinsics.checkNotNullParameter(bridgeResponse, "amcsMerchantConfigEntityData");
        Intrinsics.checkNotNullParameter(getcallmode, "splitMerchantConfigEntity");
        Intrinsics.checkNotNullParameter(error, "defaultMerchantConfigEntityData");
        this.amcsMerchantConfigEntityData = bridgeResponse;
        this.splitMerchantConfigEntity = getcallmode;
        this.defaultMerchantConfigEntityData = error;
    }

    @NotNull
    public final getRenderById createData(@Nullable String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(440835408, oncanceled);
            onCancelLoad.getMin(440835408, oncanceled);
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 2997660) {
                if (hashCode == 109648666 && str.equals(Source.SPLIT)) {
                    return this.splitMerchantConfigEntity;
                }
            } else if (str.equals("amcs")) {
                return this.amcsMerchantConfigEntityData;
            }
        }
        return this.defaultMerchantConfigEntityData;
    }
}
