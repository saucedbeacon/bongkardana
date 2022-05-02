package o;

import id.dana.sendmoney.model.BankModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b$\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BS\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0002\u0010\u0010J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010(\u001a\u00020\u0004HÆ\u0003J\t\u0010)\u001a\u00020\u0004HÆ\u0003Ja\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004HÆ\u0001J\u0013\u0010+\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\bHÖ\u0001J\u0006\u0010.\u001a\u00020\u0004J\t\u0010/\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0017\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00060"}, d2 = {"Lid/dana/requestmoney/model/BankSelectorConfigModel;", "", "()V", "needSenderName", "", "senderName", "", "retryLimit", "", "freezeTime", "availableBanks", "", "Lid/dana/sendmoney/model/BankModel;", "defaultSelectedBank", "isEmpty", "savedBankQrCheck", "(ZLjava/lang/String;IILjava/util/List;Lid/dana/sendmoney/model/BankModel;ZZ)V", "getAvailableBanks", "()Ljava/util/List;", "getDefaultSelectedBank", "()Lid/dana/sendmoney/model/BankModel;", "getFreezeTime", "()I", "()Z", "getNeedSenderName", "setNeedSenderName", "(Z)V", "getRetryLimit", "getSavedBankQrCheck", "setSavedBankQrCheck", "getSenderName", "()Ljava/lang/String;", "setSenderName", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "isNeedSenderName", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class x {
    public boolean IsOverlapping;
    @Nullable
    public final BankModel equals;
    @NotNull
    public final List<BankModel> getMax;
    public boolean getMin;
    public final int length;
    @NotNull
    public String setMax;
    public final int setMin;
    private final boolean toFloatRange;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.getMin == xVar.getMin && Intrinsics.areEqual((Object) this.setMax, (Object) xVar.setMax) && this.length == xVar.length && this.setMin == xVar.setMin && Intrinsics.areEqual((Object) this.getMax, (Object) xVar.getMax) && Intrinsics.areEqual((Object) this.equals, (Object) xVar.equals) && this.toFloatRange == xVar.toFloatRange && this.IsOverlapping == xVar.IsOverlapping;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BankSelectorConfigModel(needSenderName=");
        sb.append(this.getMin);
        sb.append(", senderName=");
        sb.append(this.setMax);
        sb.append(", retryLimit=");
        sb.append(this.length);
        sb.append(", freezeTime=");
        sb.append(this.setMin);
        sb.append(", availableBanks=");
        sb.append(this.getMax);
        sb.append(", defaultSelectedBank=");
        sb.append(this.equals);
        sb.append(", isEmpty=");
        sb.append(this.toFloatRange);
        sb.append(", savedBankQrCheck=");
        sb.append(this.IsOverlapping);
        sb.append(")");
        return sb.toString();
    }

    private x(boolean z, @NotNull String str, int i, int i2, @NotNull List<? extends BankModel> list, @Nullable BankModel bankModel, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "senderName");
        Intrinsics.checkNotNullParameter(list, "availableBanks");
        this.getMin = z;
        this.setMax = str;
        this.length = i;
        this.setMin = i2;
        this.getMax = list;
        this.equals = bankModel;
        this.toFloatRange = z2;
        this.IsOverlapping = false;
    }

    public final boolean setMin() {
        return this.toFloatRange;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(boolean z, String str, int i, int i2, List list, BankModel bankModel, boolean z2, int i3) {
        this(z, (i3 & 2) != 0 ? "" : str, i, i2, list, bankModel, (i3 & 64) != 0 ? false : z2);
    }

    public final boolean setMax() {
        return this.IsOverlapping;
    }

    public x() {
        this(false, "", 0, 0, CollectionsKt.emptyList(), (BankModel) null, true, 128);
    }

    public final boolean getMax() {
        return !this.toFloatRange && this.getMin;
    }

    public final int hashCode() {
        boolean z = this.getMin;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.setMax;
        int i2 = 0;
        int hashCode = (((((i + (str != null ? str.hashCode() : 0)) * 31) + Integer.valueOf(this.length).hashCode()) * 31) + Integer.valueOf(this.setMin).hashCode()) * 31;
        List<BankModel> list = this.getMax;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        BankModel bankModel = this.equals;
        if (bankModel != null) {
            i2 = bankModel.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z3 = this.toFloatRange;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.IsOverlapping;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }
}
