package id.dana.sendmoney.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B©\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0014¨\u00061"}, d2 = {"Lid/dana/sendmoney/model/QrRequestBankTransferModel;", "Lid/dana/sendmoney/model/QrTransferModel;", "amount", "", "avatarUrl", "bizType", "comment", "mobilePhoneNumber", "nickname", "receiverId", "bankAccountHolderName", "bankAccountFormattedMaskedNo", "userId", "bankAccountIndexNo", "withdrawInstId", "withdrawPayMethod", "withdrawPayOption", "withdrawInstLocalName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "getAvatarUrl", "setAvatarUrl", "getBankAccountFormattedMaskedNo", "getBankAccountHolderName", "getBankAccountIndexNo", "getBizType", "setBizType", "getComment", "setComment", "getMobilePhoneNumber", "setMobilePhoneNumber", "getNickname", "setNickname", "getReceiverId", "setReceiverId", "getUserId", "getWithdrawInstId", "getWithdrawInstLocalName", "getWithdrawPayMethod", "getWithdrawPayOption", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class QrRequestBankTransferModel extends QrTransferModel {
    public static final Parcelable.Creator<QrRequestBankTransferModel> CREATOR = new getMax();
    @NotNull
    public final String FastBitmap$CoordinateSystem;
    @NotNull
    public final String IsOverlapping;
    @NotNull
    public final String equals;
    @NotNull
    public final String getMax;
    @Nullable
    public String getMin;
    @Nullable
    private String hashCode;
    @NotNull
    public final String isInside;
    @NotNull
    public final String length;
    @Nullable
    public String setMax;
    @Nullable
    public String setMin;
    @Nullable
    private String toDoubleRange;
    @NotNull
    public final String toFloatRange;
    @NotNull
    public final String toIntRange;
    @Nullable
    private String toString;
    @Nullable
    private String values;

    public QrRequestBankTransferModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 32767);
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.setMax);
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMin);
        parcel.writeString(this.values);
        parcel.writeString(this.hashCode);
        parcel.writeString(this.toDoubleRange);
        parcel.writeString(this.toString);
        parcel.writeString(this.getMax);
        parcel.writeString(this.length);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.isInside);
        parcel.writeString(this.equals);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.FastBitmap$CoordinateSystem);
    }

    @Nullable
    public final String getMin() {
        return this.setMax;
    }

    public final void setMin(@Nullable String str) {
        this.setMax = str;
    }

    @Nullable
    public final String getMax() {
        return this.setMin;
    }

    @Nullable
    public final String setMax() {
        return this.getMin;
    }

    @Nullable
    public final String length() {
        return this.values;
    }

    public final void setMax(@Nullable String str) {
        this.hashCode = str;
    }

    @Nullable
    public final String setMin() {
        return this.hashCode;
    }

    @Nullable
    public final String toFloatRange() {
        return this.toDoubleRange;
    }

    @Nullable
    public final String IsOverlapping() {
        return this.toString;
    }

    public final void getMax(@Nullable String str) {
        this.toString = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ QrRequestBankTransferModel(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r17
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r18
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r19
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = r2
            goto L_0x0024
        L_0x0022:
            r5 = r20
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = r2
            goto L_0x002c
        L_0x002a:
            r6 = r21
        L_0x002c:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0032
            r7 = r2
            goto L_0x0034
        L_0x0032:
            r7 = r22
        L_0x0034:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003a
            r8 = r2
            goto L_0x003c
        L_0x003a:
            r8 = r23
        L_0x003c:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0042
            r9 = r2
            goto L_0x0044
        L_0x0042:
            r9 = r24
        L_0x0044:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004a
            r10 = r2
            goto L_0x004c
        L_0x004a:
            r10 = r25
        L_0x004c:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0052
            r11 = r2
            goto L_0x0054
        L_0x0052:
            r11 = r26
        L_0x0054:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005a
            r12 = r2
            goto L_0x005c
        L_0x005a:
            r12 = r27
        L_0x005c:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0062
            r13 = r2
            goto L_0x0064
        L_0x0062:
            r13 = r28
        L_0x0064:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x006a
            r14 = r2
            goto L_0x006c
        L_0x006a:
            r14 = r29
        L_0x006c:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0072
            r15 = r2
            goto L_0x0074
        L_0x0072:
            r15 = r30
        L_0x0074:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r2 = r31
        L_0x007b:
            r17 = r16
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r15
            r32 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.model.QrRequestBankTransferModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QrRequestBankTransferModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15) {
        super(str, str2, str3, str4, str5, str6, str7);
        String str16 = str8;
        String str17 = str9;
        String str18 = str10;
        String str19 = str11;
        String str20 = str12;
        String str21 = str13;
        String str22 = str14;
        String str23 = str15;
        Intrinsics.checkNotNullParameter(str16, "bankAccountHolderName");
        Intrinsics.checkNotNullParameter(str17, "bankAccountFormattedMaskedNo");
        Intrinsics.checkNotNullParameter(str18, "userId");
        Intrinsics.checkNotNullParameter(str19, "bankAccountIndexNo");
        Intrinsics.checkNotNullParameter(str20, "withdrawInstId");
        Intrinsics.checkNotNullParameter(str21, "withdrawPayMethod");
        Intrinsics.checkNotNullParameter(str22, "withdrawPayOption");
        Intrinsics.checkNotNullParameter(str23, "withdrawInstLocalName");
        this.setMax = str;
        this.setMin = str2;
        this.getMin = str3;
        this.values = str4;
        this.hashCode = str5;
        this.toDoubleRange = str6;
        this.toString = str7;
        this.getMax = str16;
        this.length = str17;
        this.IsOverlapping = str18;
        this.toIntRange = str19;
        this.isInside = str20;
        this.equals = str21;
        this.toFloatRange = str22;
        this.FastBitmap$CoordinateSystem = str23;
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMax implements Parcelable.Creator<QrRequestBankTransferModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new QrRequestBankTransferModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new QrRequestBankTransferModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }
}
