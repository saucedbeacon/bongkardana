package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000b¨\u0006\u001e"}, d2 = {"Lid/dana/domain/investment/model/InvestmentUnitInfo;", "", "type", "", "unit", "", "unitValue", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getUnit", "()Ljava/lang/Long;", "setUnit", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getUnitValue", "setUnitValue", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lid/dana/domain/investment/model/InvestmentUnitInfo;", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getVerifyPulickey {
    @Nullable
    private String type;
    @Nullable
    private Long unit;
    @Nullable
    private String unitValue;

    public getVerifyPulickey() {
        this((String) null, (Long) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getVerifyPulickey copy$default(getVerifyPulickey getverifypulickey, String str, Long l, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getverifypulickey.type;
        }
        if ((i & 2) != 0) {
            l = getverifypulickey.unit;
        }
        if ((i & 4) != 0) {
            str2 = getverifypulickey.unitValue;
        }
        return getverifypulickey.copy(str, l, str2);
    }

    @Nullable
    public final String component1() {
        return this.type;
    }

    @Nullable
    public final Long component2() {
        return this.unit;
    }

    @Nullable
    public final String component3() {
        return this.unitValue;
    }

    @NotNull
    public final getVerifyPulickey copy(@Nullable String str, @Nullable Long l, @Nullable String str2) {
        return new getVerifyPulickey(str, l, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getVerifyPulickey)) {
            return false;
        }
        getVerifyPulickey getverifypulickey = (getVerifyPulickey) obj;
        return Intrinsics.areEqual((Object) this.type, (Object) getverifypulickey.type) && Intrinsics.areEqual((Object) this.unit, (Object) getverifypulickey.unit) && Intrinsics.areEqual((Object) this.unitValue, (Object) getverifypulickey.unitValue);
    }

    public final int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.unit;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str2 = this.unitValue;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("InvestmentUnitInfo(type=");
        sb.append(this.type);
        sb.append(", unit=");
        sb.append(this.unit);
        sb.append(", unitValue=");
        sb.append(this.unitValue);
        sb.append(")");
        return sb.toString();
    }

    public getVerifyPulickey(@Nullable String str, @Nullable Long l, @Nullable String str2) {
        this.type = str;
        this.unit = l;
        this.unitValue = str2;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @Nullable
    public final Long getUnit() {
        return this.unit;
    }

    public final void setUnit(@Nullable Long l) {
        this.unit = l;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getVerifyPulickey(String str, Long l, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? "" : str2);
    }

    @Nullable
    public final String getUnitValue() {
        return this.unitValue;
    }

    public final void setUnitValue(@Nullable String str) {
        this.unitValue = str;
    }
}
