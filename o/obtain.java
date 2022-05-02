package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lid/dana/data/promocode/repository/source/network/result/PrizeInfoVOResult;", "", "prizeId", "", "prizeName", "prizeType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrizeId", "()Ljava/lang/String;", "getPrizeName", "getPrizeType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class obtain {
    @Nullable
    private final String prizeId;
    @Nullable
    private final String prizeName;
    @Nullable
    private final String prizeType;

    public static /* synthetic */ obtain copy$default(obtain obtain, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = obtain.prizeId;
        }
        if ((i & 2) != 0) {
            str2 = obtain.prizeName;
        }
        if ((i & 4) != 0) {
            str3 = obtain.prizeType;
        }
        return obtain.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.prizeId;
    }

    @Nullable
    public final String component2() {
        return this.prizeName;
    }

    @Nullable
    public final String component3() {
        return this.prizeType;
    }

    @NotNull
    public final obtain copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new obtain(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obtain)) {
            return false;
        }
        obtain obtain = (obtain) obj;
        return Intrinsics.areEqual((Object) this.prizeId, (Object) obtain.prizeId) && Intrinsics.areEqual((Object) this.prizeName, (Object) obtain.prizeName) && Intrinsics.areEqual((Object) this.prizeType, (Object) obtain.prizeType);
    }

    public final int hashCode() {
        String str = this.prizeId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.prizeName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.prizeType;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PrizeInfoVOResult(prizeId=");
        sb.append(this.prizeId);
        sb.append(", prizeName=");
        sb.append(this.prizeName);
        sb.append(", prizeType=");
        sb.append(this.prizeType);
        sb.append(")");
        return sb.toString();
    }

    public obtain(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.prizeId = str;
        this.prizeName = str2;
        this.prizeType = str3;
    }

    @Nullable
    public final String getPrizeId() {
        return this.prizeId;
    }

    @Nullable
    public final String getPrizeName() {
        return this.prizeName;
    }

    @Nullable
    public final String getPrizeType() {
        return this.prizeType;
    }
}
