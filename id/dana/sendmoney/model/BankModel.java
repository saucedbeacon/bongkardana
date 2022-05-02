package id.dana.sendmoney.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.android.parcel.Parcelize;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001OB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\bB×\u0001\b\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e¢\u0006\u0002\u0010\u0019J\t\u0010G\u001a\u00020\nHÖ\u0001J\u0010\u0010H\u001a\u00020I2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003J\b\u0010J\u001a\u00020\u0003H\u0016J\u0019\u0010K\u001a\u00020I2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\nHÖ\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u0011\u0010.\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b/\u0010\u001bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010\u001dR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001b\"\u0004\b7\u0010\u001dR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001b\"\u0004\b9\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001dR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001b\"\u0004\b=\u0010\u001dR\u001a\u0010\u0017\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010\t\u001a\u00020\nX\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010C\u001a\u0004\bD\u0010?R\u001a\u0010\u0018\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010#\"\u0004\bF\u0010%¨\u0006P"}, d2 = {"Lid/dana/sendmoney/model/BankModel;", "Landroid/os/Parcelable;", "instId", "", "instName", "bankNumber", "recipientName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "viewType", "", "bankName", "cardIndexNo", "enableStatus", "", "instLocalName", "maxWithdraw", "minWithdraw", "payMethod", "payOption", "senderName", "formattedMaskNumber", "prefix", "transactionCount", "visibleInQuickSend", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getBankName", "()Ljava/lang/String;", "setBankName", "(Ljava/lang/String;)V", "getBankNumber", "setBankNumber", "getCardIndexNo", "setCardIndexNo", "getEnableStatus", "()Z", "setEnableStatus", "(Z)V", "getFormattedMaskNumber", "setFormattedMaskNumber", "getInstId", "setInstId", "getInstLocalName", "setInstLocalName", "getInstName", "setInstName", "logo", "getLogo", "getMaxWithdraw", "setMaxWithdraw", "getMinWithdraw", "setMinWithdraw", "getPayMethod", "setPayMethod", "getPayOption", "setPayOption", "getPrefix", "setPrefix", "getRecipientName", "setRecipientName", "getSenderName", "setSenderName", "getTransactionCount", "()I", "setTransactionCount", "(I)V", "getViewType$annotations", "()V", "getViewType", "getVisibleInQuickSend", "setVisibleInQuickSend", "describeContents", "setBankRecipientName", "", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public class BankModel implements Parcelable {
    public static final Parcelable.Creator<BankModel> CREATOR = new getMax();
    public int FastBitmap$CoordinateSystem;
    @Nullable
    public String IsOverlapping;
    private boolean Mean$Arithmetic;
    @Nullable
    public String equals;
    @Nullable
    public String getMax;
    @Nullable
    public String getMin;
    @Nullable
    public String hashCode;
    @Nullable
    private String invokeSuspend;
    @Nullable
    public String isInside;
    @Nullable
    public String length;
    @Nullable
    public String setMax;
    @Nullable
    public String setMin;
    private final int toDoubleRange;
    @Nullable
    public String toFloatRange;
    @Nullable
    public String toIntRange;
    @Nullable
    public String toString;
    @Nullable
    private String valueOf;
    public boolean values;

    @JvmOverloads
    public BankModel() {
        this(0, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, 262143);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.toDoubleRange);
        parcel.writeString(this.setMax);
        parcel.writeString(this.getMax);
        parcel.writeString(this.length);
        parcel.writeInt(this.Mean$Arithmetic ? 1 : 0);
        parcel.writeString(this.getMin);
        parcel.writeString(this.setMin);
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.invokeSuspend);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.equals);
        parcel.writeString(this.isInside);
        parcel.writeString(this.hashCode);
        parcel.writeString(this.toString);
        parcel.writeInt(this.FastBitmap$CoordinateSystem);
        parcel.writeInt(this.values ? 1 : 0);
    }

    @JvmOverloads
    public BankModel(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, int i2, boolean z2) {
        this.toDoubleRange = i;
        this.setMax = str;
        this.getMax = str2;
        this.length = str3;
        this.Mean$Arithmetic = z;
        this.getMin = str4;
        this.setMin = str5;
        this.toIntRange = str6;
        this.invokeSuspend = str7;
        this.valueOf = str8;
        this.toFloatRange = str9;
        this.IsOverlapping = str10;
        this.equals = str11;
        this.isInside = str12;
        this.hashCode = str13;
        this.toString = str14;
        this.FastBitmap$CoordinateSystem = i2;
        this.values = z2;
    }

    public final boolean setMax() {
        return this.Mean$Arithmetic;
    }

    public final void setMax(@Nullable String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(636914253, oncanceled);
            onCancelLoad.getMin(636914253, oncanceled);
        }
        this.setMin = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BankModel(int r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, boolean r37, int r38) {
        /*
            r19 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r20
        L_0x000a:
            r3 = r0 & 2
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0012
            r3 = r4
            goto L_0x0014
        L_0x0012:
            r3 = r21
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001a
            r5 = r4
            goto L_0x001c
        L_0x001a:
            r5 = r22
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0022
            r6 = r4
            goto L_0x0024
        L_0x0022:
            r6 = r23
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r24
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = r4
            goto L_0x0034
        L_0x0032:
            r8 = r25
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = r4
            goto L_0x003c
        L_0x003a:
            r9 = r26
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = r4
            goto L_0x0044
        L_0x0042:
            r10 = r27
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = r4
            goto L_0x004c
        L_0x004a:
            r11 = r28
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = r4
            goto L_0x0054
        L_0x0052:
            r12 = r29
        L_0x0054:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005a
            r13 = r4
            goto L_0x005c
        L_0x005a:
            r13 = r30
        L_0x005c:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0062
            r14 = r4
            goto L_0x0064
        L_0x0062:
            r14 = r31
        L_0x0064:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006a
            r15 = r4
            goto L_0x006c
        L_0x006a:
            r15 = r32
        L_0x006c:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0072
            r2 = r4
            goto L_0x0074
        L_0x0072:
            r2 = r33
        L_0x0074:
            r20 = r4
            r4 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x007d
            r4 = r20
            goto L_0x007f
        L_0x007d:
            r4 = r34
        L_0x007f:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0089
            r17 = r20
            goto L_0x008b
        L_0x0089:
            r17 = r35
        L_0x008b:
            r18 = 65536(0x10000, float:9.18355E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x0094
            r16 = 0
            goto L_0x0096
        L_0x0094:
            r16 = r36
        L_0x0096:
            r18 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r18
            if (r0 == 0) goto L_0x009e
            r0 = 1
            goto L_0x00a0
        L_0x009e:
            r0 = r37
        L_0x00a0:
            r20 = r19
            r21 = r1
            r22 = r3
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r2
            r35 = r4
            r36 = r17
            r37 = r16
            r38 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.model.BankModel.<init>(int, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, int):void");
    }

    public final boolean getMin() {
        return this.values;
    }

    @NotNull
    public final String getMax() {
        String str;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArr = new Object[1];
        String str2 = this.getMin;
        if (str2 != null) {
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
            if (str2 != null) {
                str = str2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        String format = String.format("https://a.m.dana.id/resource/imgs/skywalker/bankicons/%s.png", Arrays.copyOf(objArr, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BankModel{instId='");
        sb.append(this.getMin);
        sb.append("', instName='");
        sb.append(this.toIntRange);
        sb.append("', bankNumber='");
        sb.append(this.getMax);
        sb.append("', recipientName='");
        sb.append(this.equals);
        sb.append("'}");
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/sendmoney/model/BankModel$Builder;", "", "()V", "bankNumber", "", "cardIndexNo", "enableStatus", "", "formattedMaskNumber", "instId", "instLocalName", "instName", "maxWithdraw", "minWithdraw", "payMethod", "payOption", "prefix", "senderName", "transactionCount", "", "visibleInQuickSend", "build", "Lid/dana/sendmoney/model/BankModel;", "disable", "maxWithDraw", "minWithDraw", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private String FastBitmap$CoordinateSystem = "";
        public String IsOverlapping = "";
        public String equals = "";
        public String getMax = "";
        public String getMin = "";
        public boolean hashCode = true;
        public String isInside = "";
        public String length = "";
        public String setMax = "";
        public boolean setMin;
        private int toDoubleRange;
        public String toFloatRange = "";
        public String toIntRange = "";
        private String toString = "";
        private String values = "";

        @NotNull
        public final BankModel length() {
            boolean z = this.setMin;
            String str = this.setMax;
            String str2 = this.getMin;
            String str3 = this.equals;
            String str4 = this.toFloatRange;
            String str5 = this.toIntRange;
            return new BankModel(0, (String) null, this.getMax, this.length, z, str, str2, str3, this.values, this.toString, str4, str5, (String) null, this.isInside, this.IsOverlapping, this.FastBitmap$CoordinateSystem, this.toDoubleRange, this.hashCode, 4099);
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMax implements Parcelable.Creator<BankModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BankModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new BankModel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }
    }
}
