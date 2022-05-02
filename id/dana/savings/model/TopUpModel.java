package id.dana.savings.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.richview.CurrencyTextView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 82\u00020\u0001:\u00018BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J[\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\t\u0010,\u001a\u00020\fHÖ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\fHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0019\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\fHÖ\u0001R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00069"}, d2 = {"Lid/dana/savings/model/TopUpModel;", "Landroid/os/Parcelable;", "topUpId", "", "fundAmount", "Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "status", "createdTime", "bizOrderId", "extendInfo", "", "viewType", "", "(Ljava/lang/String;Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V", "getBizOrderId", "()Ljava/lang/String;", "setBizOrderId", "(Ljava/lang/String;)V", "getCreatedTime", "setCreatedTime", "getExtendInfo", "()Ljava/util/Map;", "setExtendInfo", "(Ljava/util/Map;)V", "getFundAmount", "()Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "setFundAmount", "(Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;)V", "getStatus", "setStatus", "getTopUpId", "setTopUpId", "getViewType", "()I", "setViewType", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class TopUpModel implements Parcelable {
    public static final Parcelable.Creator<TopUpModel> CREATOR = new getMax();
    @NotNull
    public static final setMax getMax = new setMax((byte) 0);
    @NotNull
    private Map<String, String> IsOverlapping;
    public int getMin;
    @NotNull
    private String isInside;
    @NotNull
    public String length;
    @NotNull
    public String setMax;
    @NotNull
    public MoneyViewModel setMin;
    @NotNull
    private String toFloatRange;

    public TopUpModel() {
        this((String) null, (MoneyViewModel) null, (String) null, (String) null, (String) null, (Map) null, 0, 127);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopUpModel)) {
            return false;
        }
        TopUpModel topUpModel = (TopUpModel) obj;
        return Intrinsics.areEqual((Object) this.isInside, (Object) topUpModel.isInside) && Intrinsics.areEqual((Object) this.setMin, (Object) topUpModel.setMin) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) topUpModel.toFloatRange) && Intrinsics.areEqual((Object) this.length, (Object) topUpModel.length) && Intrinsics.areEqual((Object) this.setMax, (Object) topUpModel.setMax) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) topUpModel.IsOverlapping) && this.getMin == topUpModel.getMin;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TopUpModel(topUpId=");
        sb.append(this.isInside);
        sb.append(", fundAmount=");
        sb.append(this.setMin);
        sb.append(", status=");
        sb.append(this.toFloatRange);
        sb.append(", createdTime=");
        sb.append(this.length);
        sb.append(", bizOrderId=");
        sb.append(this.setMax);
        sb.append(", extendInfo=");
        sb.append(this.IsOverlapping);
        sb.append(", viewType=");
        sb.append(this.getMin);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-2033794425, oncanceled);
            onCancelLoad.getMin(-2033794425, oncanceled);
        }
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.isInside);
        this.setMin.writeToParcel(parcel, 0);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.length);
        parcel.writeString(this.setMax);
        Map<String, String> map = this.IsOverlapping;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> next : map.entrySet()) {
            parcel.writeString(next.getKey());
            parcel.writeString(next.getValue());
        }
        parcel.writeInt(this.getMin);
    }

    public TopUpModel(@NotNull String str, @NotNull MoneyViewModel moneyViewModel, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(str, "topUpId");
        Intrinsics.checkNotNullParameter(moneyViewModel, "fundAmount");
        Intrinsics.checkNotNullParameter(str2, "status");
        Intrinsics.checkNotNullParameter(str3, "createdTime");
        Intrinsics.checkNotNullParameter(str4, "bizOrderId");
        Intrinsics.checkNotNullParameter(map, "extendInfo");
        this.isInside = str;
        this.setMin = moneyViewModel;
        this.toFloatRange = str2;
        this.length = str3;
        this.setMax = str4;
        this.IsOverlapping = map;
        this.getMin = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TopUpModel(java.lang.String r7, id.dana.nearbyme.merchantdetail.model.MoneyViewModel r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.util.Map r12, int r13, int r14) {
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
            if (r7 == 0) goto L_0x0014
            id.dana.nearbyme.merchantdetail.model.MoneyViewModel r8 = new id.dana.nearbyme.merchantdetail.model.MoneyViewModel
            r7 = 7
            r2 = 0
            r8.<init>(r2, r2, r2, r7)
        L_0x0014:
            r2 = r8
            r7 = r14 & 4
            if (r7 == 0) goto L_0x001b
            r3 = r1
            goto L_0x001c
        L_0x001b:
            r3 = r9
        L_0x001c:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x0022
            r4 = r1
            goto L_0x0023
        L_0x0022:
            r4 = r10
        L_0x0023:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r1 = r11
        L_0x0029:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x0035
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r12 = r7
            java.util.Map r12 = (java.util.Map) r12
        L_0x0035:
            r5 = r12
            r7 = r14 & 64
            if (r7 == 0) goto L_0x003d
            r13 = 0
            r14 = 0
            goto L_0x003e
        L_0x003d:
            r14 = r13
        L_0x003e:
            r7 = r6
            r8 = r0
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r1
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.savings.model.TopUpModel.<init>(java.lang.String, id.dana.nearbyme.merchantdetail.model.MoneyViewModel, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, int):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/savings/model/TopUpModel$Companion;", "", "()V", "FETCHING", "", "HISTORY", "LOAD_MORE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMax implements Parcelable.Creator<TopUpModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TopUpModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            String readString = parcel.readString();
            MoneyViewModel createFromParcel = MoneyViewModel.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            while (readInt != 0) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
                readInt--;
            }
            return new TopUpModel(readString, createFromParcel, readString2, readString3, readString4, linkedHashMap, parcel.readInt());
        }
    }

    public final int hashCode() {
        String str = this.isInside;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        MoneyViewModel moneyViewModel = this.setMin;
        int hashCode2 = (hashCode + (moneyViewModel != null ? moneyViewModel.hashCode() : 0)) * 31;
        String str2 = this.toFloatRange;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.length;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.setMax;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Map<String, String> map = this.IsOverlapping;
        if (map != null) {
            i = map.hashCode();
        }
        return ((hashCode5 + i) * 31) + Integer.valueOf(this.getMin).hashCode();
    }
}
