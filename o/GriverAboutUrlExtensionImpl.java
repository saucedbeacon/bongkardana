package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lid/dana/nearbyme/merchantdetail/model/MerchantLabelModel;", "", "labelType", "", "text", "", "prizeType", "(ILjava/lang/String;Ljava/lang/String;)V", "getLabelType", "()I", "getPrizeType", "()Ljava/lang/String;", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverAboutUrlExtensionImpl {
    @NotNull
    public static final getMax getMax = new getMax((byte) 0);
    @NotNull
    public final String getMin;
    @NotNull
    public final String length;
    public final int setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverAboutUrlExtensionImpl)) {
            return false;
        }
        GriverAboutUrlExtensionImpl griverAboutUrlExtensionImpl = (GriverAboutUrlExtensionImpl) obj;
        return this.setMin == griverAboutUrlExtensionImpl.setMin && Intrinsics.areEqual((Object) this.length, (Object) griverAboutUrlExtensionImpl.length) && Intrinsics.areEqual((Object) this.getMin, (Object) griverAboutUrlExtensionImpl.getMin);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantLabelModel(labelType=");
        sb.append(this.setMin);
        sb.append(", text=");
        sb.append(this.length);
        sb.append(", prizeType=");
        sb.append(this.getMin);
        sb.append(")");
        return sb.toString();
    }

    private GriverAboutUrlExtensionImpl(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(str2, "prizeType");
        this.setMin = i;
        this.length = str;
        this.getMin = str2;
    }

    public /* synthetic */ GriverAboutUrlExtensionImpl(int i, String str) {
        this(i, str, "");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/nearbyme/merchantdetail/model/MerchantLabelModel$Companion;", "", "()V", "PRIZE_TYPE_CASHBACK", "", "PRIZE_TYPE_CASH_COUPON", "PRIZE_TYPE_DISCOUNT_COUPON", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final int hashCode() {
        int hashCode = Integer.valueOf(this.setMin).hashCode() * 31;
        String str = this.length;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.getMin;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }
}
