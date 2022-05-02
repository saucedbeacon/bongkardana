package id.dana.ocr.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\b\u0018\u0000 12\u00020\u0001:\u00011B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B=\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\u0006\u0010\u0019\u001a\u00020\u0006J\u0006\u0010\u001a\u001a\u00020\u0006J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003JM\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\b\u0010\"\u001a\u00020#H\u0016J\u0013\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\b\u0010(\u001a\u00020\u0006H\u0002J\b\u0010)\u001a\u00020\u0006H\u0002J\b\u0010*\u001a\u00020\u0006H\u0002J\b\u0010+\u001a\u00020\u0006H\u0002J\b\u0010,\u001a\u00020\u0006H\u0002J\t\u0010-\u001a\u00020\bHÖ\u0001J\u0018\u0010.\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00100\u001a\u00020#H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u00062"}, d2 = {"Lid/dana/ocr/model/OCRRequestModel;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "isBackgroundProcess", "", "rules", "", "merchantNameAlias", "", "merchantId", "userLoyaltyId", "token", "(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getMerchantId", "()Ljava/lang/String;", "getMerchantNameAlias", "()Ljava/util/List;", "getRules", "getToken", "getUserLoyaltyId", "checkBackgroundParameter", "checkNonBackgroundParameter", "checkParam", "checkParamUploadOnly", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "isMerchantAliasEmpty", "isMerchantIdEmpty", "isRulesEmpty", "isTokenEmpty", "isUserLoyaltyIdEmpty", "toString", "writeToParcel", "", "flags", "CREATOR", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OCRRequestModel implements Parcelable {
    @NotNull
    public static final CREATOR CREATOR = new CREATOR((byte) 0);
    @NotNull
    public final String getMax;
    @NotNull
    public final List<String> getMin;
    @NotNull
    public final String length;
    @NotNull
    public final String setMax;
    @Nullable
    public final String setMin;
    private final boolean toIntRange;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OCRRequestModel)) {
            return false;
        }
        OCRRequestModel oCRRequestModel = (OCRRequestModel) obj;
        return this.toIntRange == oCRRequestModel.toIntRange && Intrinsics.areEqual((Object) this.setMin, (Object) oCRRequestModel.setMin) && Intrinsics.areEqual((Object) this.getMin, (Object) oCRRequestModel.getMin) && Intrinsics.areEqual((Object) this.length, (Object) oCRRequestModel.length) && Intrinsics.areEqual((Object) this.setMax, (Object) oCRRequestModel.setMax) && Intrinsics.areEqual((Object) this.getMax, (Object) oCRRequestModel.getMax);
    }

    public final int hashCode() {
        boolean z = this.toIntRange;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.setMin;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.getMin;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.length;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.setMax;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.getMax;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OCRRequestModel(isBackgroundProcess=");
        sb.append(this.toIntRange);
        sb.append(", rules=");
        sb.append(this.setMin);
        sb.append(", merchantNameAlias=");
        sb.append(this.getMin);
        sb.append(", merchantId=");
        sb.append(this.length);
        sb.append(", userLoyaltyId=");
        sb.append(this.setMax);
        sb.append(", token=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public OCRRequestModel(boolean z, @Nullable String str, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(list, "merchantNameAlias");
        Intrinsics.checkNotNullParameter(str2, "merchantId");
        Intrinsics.checkNotNullParameter(str3, "userLoyaltyId");
        Intrinsics.checkNotNullParameter(str4, "token");
        this.toIntRange = z;
        this.setMin = str;
        this.getMin = list;
        this.length = str2;
        this.setMax = str3;
        this.getMax = str4;
    }

    public final boolean setMin() {
        return this.toIntRange;
    }

    private final boolean getMin() {
        CharSequence charSequence = this.setMin;
        return (charSequence == null || charSequence.length() == 0) || Intrinsics.areEqual((Object) this.setMin, (Object) "{}");
    }

    private final boolean setMax() {
        Collection collection = this.getMin;
        return collection == null || collection.isEmpty();
    }

    private final boolean length() {
        return this.length.length() == 0;
    }

    private final boolean equals() {
        return this.setMax.length() == 0;
    }

    private final boolean toFloatRange() {
        return this.getMax.length() == 0;
    }

    public final boolean getMax() {
        if (this.toIntRange) {
            return toIntRange();
        }
        return IsOverlapping();
    }

    private final boolean IsOverlapping() {
        return getMin() | setMax();
    }

    private final boolean toIntRange() {
        return getMin() | setMax() | length() | equals() | toFloatRange();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OCRRequestModel(@org.jetbrains.annotations.NotNull android.os.Parcel r9) {
        /*
            r8 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            byte r0 = r9.readByte()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            r2 = 1
            goto L_0x0010
        L_0x000e:
            r0 = 0
            r2 = 0
        L_0x0010:
            java.lang.String r3 = r9.readString()
            java.util.ArrayList r0 = r9.createStringArrayList()
            if (r0 == 0) goto L_0x0021
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 != 0) goto L_0x0028
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0028:
            r4 = r0
            java.lang.String r0 = r9.readString()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0033
            r5 = r1
            goto L_0x0034
        L_0x0033:
            r5 = r0
        L_0x0034:
            java.lang.String r0 = r9.readString()
            if (r0 != 0) goto L_0x003c
            r6 = r1
            goto L_0x003d
        L_0x003c:
            r6 = r0
        L_0x003d:
            java.lang.String r9 = r9.readString()
            if (r9 != 0) goto L_0x0045
            r7 = r1
            goto L_0x0046
        L_0x0045:
            r7 = r9
        L_0x0046:
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.ocr.model.OCRRequestModel.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeByte(this.toIntRange ? (byte) 1 : 0);
        parcel.writeString(this.setMin);
        parcel.writeStringList(this.getMin);
        parcel.writeString(this.length);
        parcel.writeString(this.setMax);
        parcel.writeString(this.getMax);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lid/dana/ocr/model/OCRRequestModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lid/dana/ocr/model/OCRRequestModel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lid/dana/ocr/model/OCRRequestModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class CREATOR implements Parcelable.Creator<OCRRequestModel> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OCRRequestModel(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new OCRRequestModel[i];
        }
    }
}
