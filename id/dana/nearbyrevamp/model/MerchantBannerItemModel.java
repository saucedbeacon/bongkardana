package id.dana.nearbyrevamp.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lid/dana/nearbyrevamp/model/MerchantBannerItemModel;", "", "state", "Lid/dana/nearbyrevamp/model/MerchantBannerItemModel$State;", "(Lid/dana/nearbyrevamp/model/MerchantBannerItemModel$State;)V", "getState", "()Lid/dana/nearbyrevamp/model/MerchantBannerItemModel$State;", "setState", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "State", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantBannerItemModel {
    @NotNull
    public State getMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lid/dana/nearbyrevamp/model/MerchantBannerItemModel$State;", "", "(Ljava/lang/String;I)V", "SHIMMERING", "LOADED", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum State {
        SHIMMERING,
        LOADED
    }

    public MerchantBannerItemModel() {
        this((byte) 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof MerchantBannerItemModel) && Intrinsics.areEqual((Object) this.getMax, (Object) ((MerchantBannerItemModel) obj).getMax);
        }
        return true;
    }

    public final int hashCode() {
        State state = this.getMax;
        if (state != null) {
            return state.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantBannerItemModel(state=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ MerchantBannerItemModel(byte b) {
        this(State.SHIMMERING);
    }

    private MerchantBannerItemModel(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.getMax = state;
    }
}
