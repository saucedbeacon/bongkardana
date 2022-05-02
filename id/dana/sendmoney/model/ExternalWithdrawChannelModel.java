package id.dana.sendmoney.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 22\u00020\u0001:\u00012Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jz\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\t\u0010%\u001a\u00020&HÖ\u0001J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020&HÖ\u0001J\u0006\u0010+\u001a\u00020\tJ\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020&HÖ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u00063"}, d2 = {"Lid/dana/sendmoney/model/ExternalWithdrawChannelModel;", "Landroid/os/Parcelable;", "instId", "", "instLocalName", "instName", "payMethod", "payOption", "disable", "", "disableReason", "errorCode", "errorMsg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisableReason", "()Ljava/lang/String;", "getErrorCode", "getErrorMsg", "getInstId", "getInstLocalName", "getInstName", "getPayMethod", "getPayOption", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lid/dana/sendmoney/model/ExternalWithdrawChannelModel;", "describeContents", "", "equals", "other", "", "hashCode", "isInsufficientBalance", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class ExternalWithdrawChannelModel implements Parcelable {
    public static final Parcelable.Creator<ExternalWithdrawChannelModel> CREATOR = new getMin();
    @NotNull
    public static final setMin IsOverlapping = new setMin((byte) 0);
    @Nullable
    public final Boolean equals;
    @Nullable
    public final String getMax;
    @Nullable
    public final String getMin;
    @Nullable
    public final String isInside;
    @Nullable
    public final String length;
    @Nullable
    public final String setMax;
    @Nullable
    public final String setMin;
    @Nullable
    private final String toFloatRange;
    @Nullable
    private final String toIntRange;

    public ExternalWithdrawChannelModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, 511);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalWithdrawChannelModel)) {
            return false;
        }
        ExternalWithdrawChannelModel externalWithdrawChannelModel = (ExternalWithdrawChannelModel) obj;
        return Intrinsics.areEqual((Object) this.getMin, (Object) externalWithdrawChannelModel.getMin) && Intrinsics.areEqual((Object) this.setMax, (Object) externalWithdrawChannelModel.setMax) && Intrinsics.areEqual((Object) this.setMin, (Object) externalWithdrawChannelModel.setMin) && Intrinsics.areEqual((Object) this.length, (Object) externalWithdrawChannelModel.length) && Intrinsics.areEqual((Object) this.getMax, (Object) externalWithdrawChannelModel.getMax) && Intrinsics.areEqual((Object) this.equals, (Object) externalWithdrawChannelModel.equals) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) externalWithdrawChannelModel.toFloatRange) && Intrinsics.areEqual((Object) this.isInside, (Object) externalWithdrawChannelModel.isInside) && Intrinsics.areEqual((Object) this.toIntRange, (Object) externalWithdrawChannelModel.toIntRange);
    }

    public final int hashCode() {
        String str = this.getMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.setMax;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.setMin;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.length;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.getMax;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool = this.equals;
        int hashCode6 = (hashCode5 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str6 = this.toFloatRange;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.isInside;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.toIntRange;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode8 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalWithdrawChannelModel(instId=");
        sb.append(this.getMin);
        sb.append(", instLocalName=");
        sb.append(this.setMax);
        sb.append(", instName=");
        sb.append(this.setMin);
        sb.append(", payMethod=");
        sb.append(this.length);
        sb.append(", payOption=");
        sb.append(this.getMax);
        sb.append(", disable=");
        sb.append(this.equals);
        sb.append(", disableReason=");
        sb.append(this.toFloatRange);
        sb.append(", errorCode=");
        sb.append(this.isInside);
        sb.append(", errorMsg=");
        sb.append(this.toIntRange);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.getMin);
        parcel.writeString(this.setMax);
        parcel.writeString(this.setMin);
        parcel.writeString(this.length);
        parcel.writeString(this.getMax);
        Boolean bool = this.equals;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        } else {
            z = false;
        }
        parcel.writeInt(z ? 1 : 0);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.isInside);
        parcel.writeString(this.toIntRange);
    }

    public ExternalWithdrawChannelModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.getMin = str;
        this.setMax = str2;
        this.setMin = str3;
        this.length = str4;
        this.getMax = str5;
        this.equals = bool;
        this.toFloatRange = str6;
        this.isInside = str7;
        this.toIntRange = str8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ExternalWithdrawChannelModel(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.Boolean r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r11
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r12
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x0019
        L_0x0018:
            r4 = r13
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r2
            goto L_0x0020
        L_0x001f:
            r5 = r14
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0027
        L_0x0026:
            r6 = r15
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x0030
        L_0x002e:
            r7 = r16
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r17
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r18
        L_0x0040:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r2 = r19
        L_0x0047:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.model.ExternalWithdrawChannelModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public final boolean length() {
        return Intrinsics.areEqual((Object) this.isInside, (Object) "AE13112148999315");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/sendmoney/model/ExternalWithdrawChannelModel$Companion;", "", "()V", "ERROR_CODE_INSUFFICIENT_BALANCE", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMin implements Parcelable.Creator<ExternalWithdrawChannelModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ExternalWithdrawChannelModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            return new ExternalWithdrawChannelModel(readString, readString2, readString3, readString4, readString5, bool, parcel.readString(), parcel.readString(), parcel.readString());
        }
    }
}
