package o;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0017"}, d2 = {"Lid/dana/data/qrbarcode/repository/source/network/result/UserBankQrResult;", "Lid/dana/data/qrbarcode/repository/source/network/result/GenerateQrResult;", "expireTimeInSecond", "", "expireDateTimestamp", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getExpireDateTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getExpireTimeInSecond", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lid/dana/data/qrbarcode/repository/source/network/result/UserBankQrResult;", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class description extends ActionMeta {
    @NotNull
    public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
    @Nullable
    private final Long expireDateTimestamp;
    @Nullable
    private final Long expireTimeInSecond;

    public description() {
        this((Long) null, (Long) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ description copy$default(description description, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = description.expireTimeInSecond;
        }
        if ((i & 2) != 0) {
            l2 = description.expireDateTimestamp;
        }
        return description.copy(l, l2);
    }

    @JvmStatic
    @NotNull
    public static final GriverAppXInterceptor toQrUserBankResult(@NotNull description description) {
        return Companion.toQrUserBankResult(description);
    }

    @Nullable
    public final Long component1() {
        return this.expireTimeInSecond;
    }

    @Nullable
    public final Long component2() {
        return this.expireDateTimestamp;
    }

    @NotNull
    public final description copy(@Nullable Long l, @Nullable Long l2) {
        return new description(l, l2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof description)) {
            return false;
        }
        description description = (description) obj;
        return Intrinsics.areEqual((Object) this.expireTimeInSecond, (Object) description.expireTimeInSecond) && Intrinsics.areEqual((Object) this.expireDateTimestamp, (Object) description.expireDateTimestamp);
    }

    public final int hashCode() {
        Long l = this.expireTimeInSecond;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.expireDateTimestamp;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserBankQrResult(expireTimeInSecond=");
        sb.append(this.expireTimeInSecond);
        sb.append(", expireDateTimestamp=");
        sb.append(this.expireDateTimestamp);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ description(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? 0L : l2);
    }

    @Nullable
    public final Long getExpireTimeInSecond() {
        return this.expireTimeInSecond;
    }

    @Nullable
    public final Long getExpireDateTimestamp() {
        return this.expireDateTimestamp;
    }

    public description(@Nullable Long l, @Nullable Long l2) {
        this.expireTimeInSecond = l;
        this.expireDateTimestamp = l2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lid/dana/data/qrbarcode/repository/source/network/result/UserBankQrResult$Companion;", "", "()V", "toQrUserBankResult", "Lid/dana/domain/qrbarcode/QrUserBankResult;", "Lid/dana/data/qrbarcode/repository/source/network/result/UserBankQrResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final GriverAppXInterceptor toQrUserBankResult(@NotNull description description) {
            Intrinsics.checkNotNullParameter(description, "$this$toQrUserBankResult");
            Long expireTimeInSecond = description.getExpireTimeInSecond();
            long j = 0;
            long longValue = expireTimeInSecond != null ? expireTimeInSecond.longValue() : 0;
            Long expireDateTimestamp = description.getExpireDateTimestamp();
            if (expireDateTimestamp != null) {
                j = expireDateTimestamp.longValue();
            }
            GriverAppXInterceptor griverAppXInterceptor = new GriverAppXInterceptor(longValue, j);
            uncheckAllItems.transform(griverAppXInterceptor, description);
            String str = description.qrCode;
            if (str == null) {
                str = "";
            }
            griverAppXInterceptor.setQrCode(str);
            return griverAppXInterceptor;
        }
    }
}
