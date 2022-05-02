package id.dana.lib.electronicmoney.bri.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JU\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020(HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020(HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u00064"}, d2 = {"Lid/dana/lib/electronicmoney/bri/model/ReversalResult;", "Landroid/os/Parcelable;", "reversalData", "", "reffNumber", "cardNumber", "lastTrxDate", "balance", "errorCode", "listBrizziHistoryResult", "", "Lid/dana/lib/electronicmoney/bri/model/BrizziHistoryResult;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBalance", "()Ljava/lang/String;", "setBalance", "(Ljava/lang/String;)V", "getCardNumber", "setCardNumber", "getErrorCode", "setErrorCode", "getLastTrxDate", "setLastTrxDate", "getListBrizziHistoryResult", "()Ljava/util/List;", "setListBrizziHistoryResult", "(Ljava/util/List;)V", "getReffNumber", "setReffNumber", "getReversalData", "setReversalData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
@Parcelize
public final class ReversalResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new setMax();
    @NotNull
    public String equals;
    @NotNull
    public String getMax;
    @NotNull
    public String getMin;
    @NotNull
    public String length;
    @NotNull
    public String setMax;
    @NotNull
    public String setMin;
    @NotNull
    public List<BrizziHistoryResult> toFloatRange;

    public static class setMax implements Parcelable.Creator {
        @NotNull
        public final Object createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((BrizziHistoryResult) BrizziHistoryResult.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new ReversalResult(readString, readString2, readString3, readString4, readString5, readString6, arrayList);
        }

        @NotNull
        public final Object[] newArray(int i) {
            return new ReversalResult[i];
        }
    }

    public ReversalResult() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 127);
    }

    public ReversalResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<BrizziHistoryResult> list) {
        Intrinsics.checkNotNullParameter(str, "reversalData");
        Intrinsics.checkNotNullParameter(str2, "reffNumber");
        Intrinsics.checkNotNullParameter(str3, "cardNumber");
        Intrinsics.checkNotNullParameter(str4, "lastTrxDate");
        Intrinsics.checkNotNullParameter(str5, "balance");
        Intrinsics.checkNotNullParameter(str6, "errorCode");
        Intrinsics.checkNotNullParameter(list, "listBrizziHistoryResult");
        this.setMin = str;
        this.getMax = str2;
        this.setMax = str3;
        this.getMin = str4;
        this.length = str5;
        this.equals = str6;
        this.toFloatRange = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ReversalResult(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.List r13, int r14) {
        /*
            r6 = this;
            r0 = r14 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r7
        L_0x0009:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000f
            r2 = r1
            goto L_0x0010
        L_0x000f:
            r2 = r8
        L_0x0010:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0016
            r3 = r1
            goto L_0x0017
        L_0x0016:
            r3 = r9
        L_0x0017:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001d
            r4 = r1
            goto L_0x001e
        L_0x001d:
            r4 = r10
        L_0x001e:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0024
            r5 = r1
            goto L_0x0025
        L_0x0024:
            r5 = r11
        L_0x0025:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r1 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0033
            java.util.List r13 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0033:
            r14 = r13
            r7 = r6
            r8 = r0
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r5
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.lib.electronicmoney.bri.model.ReversalResult.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReversalResult)) {
            return false;
        }
        ReversalResult reversalResult = (ReversalResult) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) reversalResult.setMin) && Intrinsics.areEqual((Object) this.getMax, (Object) reversalResult.getMax) && Intrinsics.areEqual((Object) this.setMax, (Object) reversalResult.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) reversalResult.getMin) && Intrinsics.areEqual((Object) this.length, (Object) reversalResult.length) && Intrinsics.areEqual((Object) this.equals, (Object) reversalResult.equals) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) reversalResult.toFloatRange);
    }

    public final int hashCode() {
        String str = this.setMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMax;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.setMax;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.getMin;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.length;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.equals;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<BrizziHistoryResult> list = this.toFloatRange;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode6 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReversalResult(reversalData=");
        sb.append(this.setMin);
        sb.append(", reffNumber=");
        sb.append(this.getMax);
        sb.append(", cardNumber=");
        sb.append(this.setMax);
        sb.append(", lastTrxDate=");
        sb.append(this.getMin);
        sb.append(", balance=");
        sb.append(this.length);
        sb.append(", errorCode=");
        sb.append(this.equals);
        sb.append(", listBrizziHistoryResult=");
        sb.append(this.toFloatRange);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMax);
        parcel.writeString(this.setMax);
        parcel.writeString(this.getMin);
        parcel.writeString(this.length);
        parcel.writeString(this.equals);
        List<BrizziHistoryResult> list = this.toFloatRange;
        parcel.writeInt(list.size());
        for (BrizziHistoryResult writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }
}
