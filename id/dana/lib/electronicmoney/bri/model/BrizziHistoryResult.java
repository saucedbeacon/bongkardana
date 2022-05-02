package id.dana.lib.electronicmoney.bri.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003Jc\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020,HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0019\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,HÖ\u0001R\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u00068"}, d2 = {"Lid/dana/lib/electronicmoney/bri/model/BrizziHistoryResult;", "Landroid/os/Parcelable;", "merchatId", "", "terminalId", "trxDate", "trxTime", "trxType", "trxAmount", "balanceBefore", "balanceAfter", "trxDateTimeToSort", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBalanceAfter", "()Ljava/lang/String;", "setBalanceAfter", "(Ljava/lang/String;)V", "getBalanceBefore", "setBalanceBefore", "getMerchatId", "setMerchatId", "getTerminalId", "setTerminalId", "getTrxAmount", "setTrxAmount", "getTrxDate", "setTrxDate", "getTrxDateTimeToSort", "setTrxDateTimeToSort", "getTrxTime", "setTrxTime", "getTrxType", "setTrxType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
@Parcelize
public final class BrizziHistoryResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new setMin();
    @NotNull
    public String IsOverlapping;
    @NotNull
    public String equals;
    @NotNull
    public String getMax;
    @NotNull
    public String getMin;
    @NotNull
    public String isInside;
    @NotNull
    public String length;
    @NotNull
    public String setMax;
    @NotNull
    public String setMin;
    @NotNull
    public String toIntRange;

    public static class setMin implements Parcelable.Creator {
        @NotNull
        public final Object createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new BrizziHistoryResult(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @NotNull
        public final Object[] newArray(int i) {
            return new BrizziHistoryResult[i];
        }
    }

    public BrizziHistoryResult() {
        this((byte) 0);
    }

    private /* synthetic */ BrizziHistoryResult(byte b) {
        this("", "", "", "", "", "", "", "", "");
    }

    public BrizziHistoryResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "merchatId");
        Intrinsics.checkNotNullParameter(str2, "terminalId");
        Intrinsics.checkNotNullParameter(str3, "trxDate");
        Intrinsics.checkNotNullParameter(str4, "trxTime");
        Intrinsics.checkNotNullParameter(str5, "trxType");
        Intrinsics.checkNotNullParameter(str6, "trxAmount");
        Intrinsics.checkNotNullParameter(str7, "balanceBefore");
        Intrinsics.checkNotNullParameter(str8, "balanceAfter");
        Intrinsics.checkNotNullParameter(str9, "trxDateTimeToSort");
        this.setMin = str;
        this.getMin = str2;
        this.setMax = str3;
        this.length = str4;
        this.getMax = str5;
        this.toIntRange = str6;
        this.IsOverlapping = str7;
        this.equals = str8;
        this.isInside = str9;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrizziHistoryResult)) {
            return false;
        }
        BrizziHistoryResult brizziHistoryResult = (BrizziHistoryResult) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) brizziHistoryResult.setMin) && Intrinsics.areEqual((Object) this.getMin, (Object) brizziHistoryResult.getMin) && Intrinsics.areEqual((Object) this.setMax, (Object) brizziHistoryResult.setMax) && Intrinsics.areEqual((Object) this.length, (Object) brizziHistoryResult.length) && Intrinsics.areEqual((Object) this.getMax, (Object) brizziHistoryResult.getMax) && Intrinsics.areEqual((Object) this.toIntRange, (Object) brizziHistoryResult.toIntRange) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) brizziHistoryResult.IsOverlapping) && Intrinsics.areEqual((Object) this.equals, (Object) brizziHistoryResult.equals) && Intrinsics.areEqual((Object) this.isInside, (Object) brizziHistoryResult.isInside);
    }

    public final int hashCode() {
        String str = this.setMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.setMax;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.length;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.getMax;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.toIntRange;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.IsOverlapping;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.equals;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.isInside;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode8 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BrizziHistoryResult(merchatId=");
        sb.append(this.setMin);
        sb.append(", terminalId=");
        sb.append(this.getMin);
        sb.append(", trxDate=");
        sb.append(this.setMax);
        sb.append(", trxTime=");
        sb.append(this.length);
        sb.append(", trxType=");
        sb.append(this.getMax);
        sb.append(", trxAmount=");
        sb.append(this.toIntRange);
        sb.append(", balanceBefore=");
        sb.append(this.IsOverlapping);
        sb.append(", balanceAfter=");
        sb.append(this.equals);
        sb.append(", trxDateTimeToSort=");
        sb.append(this.isInside);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMin);
        parcel.writeString(this.setMax);
        parcel.writeString(this.length);
        parcel.writeString(this.getMax);
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.equals);
        parcel.writeString(this.isInside);
    }
}
