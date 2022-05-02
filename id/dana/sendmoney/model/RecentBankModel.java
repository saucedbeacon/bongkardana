package id.dana.sendmoney.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0005¨\u0006!"}, d2 = {"Lid/dana/sendmoney/model/RecentBankModel;", "Lid/dana/sendmoney/model/BankModel;", "Landroid/os/Parcelable;", "viewType", "", "(I)V", "alias", "", "bankLogo", "lastUpdated", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getAlias", "()Ljava/lang/String;", "setAlias", "(Ljava/lang/String;)V", "getBankLogo", "setBankLogo", "getLastUpdated", "()Ljava/lang/Long;", "setLastUpdated", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getViewType$annotations", "()V", "getViewType", "()I", "setViewType", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class RecentBankModel extends BankModel implements Parcelable {
    public static final Parcelable.Creator<RecentBankModel> CREATOR = new getMax();
    @Nullable
    public String Grayscale$Algorithm;
    @Nullable
    public String Mean$Arithmetic;
    public int toDoubleRange;
    @Nullable
    public Long valueOf;

    public RecentBankModel() {
        this((byte) 0);
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.toDoubleRange);
        parcel.writeString(this.Grayscale$Algorithm);
        parcel.writeString(this.Mean$Arithmetic);
        Long l = this.valueOf;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
            return;
        }
        parcel.writeInt(0);
    }

    public /* synthetic */ RecentBankModel(byte b) {
        this(1, "", "", 0L);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecentBankModel(int r21, @org.jetbrains.annotations.Nullable java.lang.String r22, @org.jetbrains.annotations.Nullable java.lang.String r23, @org.jetbrains.annotations.Nullable java.lang.Long r24) {
        /*
            r20 = this;
            r15 = r20
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 262142(0x3fffe, float:3.67339E-40)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.toDoubleRange = r1
            r1 = r22
            r0.Grayscale$Algorithm = r1
            r1 = r23
            r0.Mean$Arithmetic = r1
            r1 = r24
            r0.valueOf = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.model.RecentBankModel.<init>(int, java.lang.String, java.lang.String, java.lang.Long):void");
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMax implements Parcelable.Creator<RecentBankModel> {
        public final /* synthetic */ Object[] newArray(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(1407284457, oncanceled);
                onCancelLoad.getMin(1407284457, oncanceled);
            }
            return new RecentBankModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new RecentBankModel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }
    }
}
