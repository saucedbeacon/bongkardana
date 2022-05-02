package id.dana.ocr.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0002&'B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005BI\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0002\u0010\u0010J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\tJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\u001dH\u0016J\b\u0010\"\u001a\u00020\tH\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u001dH\u0016R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006("}, d2 = {"Lid/dana/ocr/model/OCRResultModel;", "Lid/dana/ocr/model/BaseOCRResultModel;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "success", "", "errorCode", "", "merchantName", "billNumber", "timestamp", "amount", "rawText", "filePath", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getBillNumber", "getErrorCode", "getFilePath", "getMerchantName", "getRawText", "getSuccess", "()Z", "getTimestamp", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "Builder", "CREATOR", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OCRResultModel extends BaseOCRResultModel implements Parcelable {
    @NotNull
    public static final CREATOR CREATOR = new CREATOR((byte) 0);
    @NotNull
    public final String equals;
    @NotNull
    public final String getMax;
    @Nullable
    public final String getMin;
    @NotNull
    public final String length;
    @NotNull
    public final String setMax;
    @NotNull
    public final String setMin;
    private final boolean toFloatRange;
    @NotNull
    public final String toIntRange;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ OCRResultModel(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, byte b) {
        this(z, str, str2, str3, str4, str5, str6, str7);
    }

    public final boolean getMax() {
        return this.toFloatRange;
    }

    @Nullable
    public final String setMin() {
        return this.getMin;
    }

    public OCRResultModel(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(z, str);
        this.toFloatRange = z;
        this.getMin = str;
        this.setMin = str2;
        this.getMax = str3;
        this.setMax = str4;
        this.length = str5;
        this.toIntRange = str6;
        this.equals = str7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OCRResultModel(@org.jetbrains.annotations.NotNull android.os.Parcel r11) {
        /*
            r10 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            byte r0 = r11.readByte()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            r2 = 1
            goto L_0x0010
        L_0x000e:
            r0 = 0
            r2 = 0
        L_0x0010:
            java.lang.String r3 = r11.readString()
            java.lang.String r0 = r11.readString()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x001e
            r4 = r1
            goto L_0x001f
        L_0x001e:
            r4 = r0
        L_0x001f:
            java.lang.String r0 = r11.readString()
            if (r0 != 0) goto L_0x0027
            r5 = r1
            goto L_0x0028
        L_0x0027:
            r5 = r0
        L_0x0028:
            java.lang.String r0 = r11.readString()
            if (r0 != 0) goto L_0x0030
            r6 = r1
            goto L_0x0031
        L_0x0030:
            r6 = r0
        L_0x0031:
            java.lang.String r0 = r11.readString()
            if (r0 != 0) goto L_0x0039
            r7 = r1
            goto L_0x003a
        L_0x0039:
            r7 = r0
        L_0x003a:
            java.lang.String r0 = r11.readString()
            if (r0 != 0) goto L_0x0042
            r8 = r1
            goto L_0x0043
        L_0x0042:
            r8 = r0
        L_0x0043:
            java.lang.String r11 = r11.readString()
            if (r11 != 0) goto L_0x004b
            r9 = r1
            goto L_0x004c
        L_0x004b:
            r9 = r11
        L_0x004c:
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.ocr.model.OCRResultModel.<init>(android.os.Parcel):void");
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OCRResultModel(success=");
        sb.append(getMax());
        sb.append(", errorCode=");
        sb.append(this.getMin);
        sb.append(", merchantName=");
        sb.append(this.setMin);
        sb.append(", billNumber=");
        sb.append(this.getMax);
        sb.append(", timestamp=");
        sb.append(this.setMax);
        sb.append(", amount=");
        sb.append(this.length);
        sb.append(", rawText=");
        sb.append(this.toIntRange);
        sb.append(", filePath=");
        sb.append(this.equals);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof OCRResultModel)) {
            return false;
        }
        OCRResultModel oCRResultModel = (OCRResultModel) obj;
        return getMax() == oCRResultModel.getMax() && Intrinsics.areEqual((Object) this.getMin, (Object) oCRResultModel.getMin) && Intrinsics.areEqual((Object) this.setMin, (Object) oCRResultModel.setMin) && Intrinsics.areEqual((Object) this.getMax, (Object) oCRResultModel.getMax) && Intrinsics.areEqual((Object) this.setMax, (Object) oCRResultModel.setMax) && Intrinsics.areEqual((Object) this.length, (Object) oCRResultModel.length) && Intrinsics.areEqual((Object) this.toIntRange, (Object) oCRResultModel.toIntRange) && Intrinsics.areEqual((Object) this.equals, (Object) oCRResultModel.equals);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(getMax()), this.getMin, this.setMin, this.getMax, this.setMax, this.length, this.toIntRange, this.equals});
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J\u0010\u0010 \u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0010\u0010!\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0005R\u000e\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u0005¨\u0006\""}, d2 = {"Lid/dana/ocr/model/OCRResultModel$Builder;", "", "()V", "errorCode", "", "(Ljava/lang/String;)V", "success", "", "(ZLjava/lang/String;)V", "amount", "billNumber", "getBillNumber", "()Ljava/lang/String;", "setBillNumber", "getErrorCode", "setErrorCode", "filePath", "merchantName", "rawText", "getSuccess", "()Z", "setSuccess", "(Z)V", "timestamp", "getTimestamp", "setTimestamp", "build", "Lid/dana/ocr/model/OCRResultModel;", "withAmount", "withBillNumber", "withFilePath", "withMerchantName", "withRawText", "withTimestamp", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class Builder {
        private boolean IsOverlapping;
        public String getMax;
        public String getMin;
        @Nullable
        private String isInside;
        public String length;
        @NotNull
        public String setMax;
        @NotNull
        public String setMin;
        private String toIntRange;

        private Builder(boolean z, String str) {
            this.IsOverlapping = z;
            this.isInside = str;
            this.getMin = "";
            this.setMax = "";
            this.setMin = "";
            this.length = "";
            this.getMax = "";
            this.toIntRange = "";
        }

        private /* synthetic */ Builder(byte b) {
            this(true, (String) null);
        }

        public Builder() {
            this((byte) 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull String str) {
            this(false, str);
            Intrinsics.checkNotNullParameter(str, "errorCode");
        }

        @NotNull
        public final OCRResultModel getMax() {
            return new OCRResultModel(this.IsOverlapping, this.isInside, this.getMin, this.setMax, this.setMin, this.length, this.getMax, this.toIntRange, (byte) 0);
        }
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMax);
        parcel.writeString(this.setMax);
        parcel.writeString(this.length);
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.equals);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lid/dana/ocr/model/OCRResultModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lid/dana/ocr/model/OCRResultModel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lid/dana/ocr/model/OCRResultModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class CREATOR implements Parcelable.Creator<OCRResultModel> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OCRResultModel(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new OCRResultModel[i];
        }
    }
}
