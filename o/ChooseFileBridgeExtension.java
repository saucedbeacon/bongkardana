package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lid/dana/openbankaccount/model/BankAccountsModel;", "", "bankAccountList", "", "Lid/dana/openbankaccount/model/BankAccountInfo;", "success", "", "(Ljava/util/List;Z)V", "getBankAccountList", "()Ljava/util/List;", "setBankAccountList", "(Ljava/util/List;)V", "getSuccess", "()Z", "setSuccess", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ChooseFileBridgeExtension {
    private boolean getMax;
    @NotNull
    public List<ChooseFileActivityResultExtensionImpl> setMin;

    /* renamed from: o.ChooseFileBridgeExtension$4  reason: invalid class name */
    public interface AnonymousClass4 {
        void Grayscale$Algorithm();

        void Mean$Arithmetic();

        void getMin(String str, String str2);

        void invoke();

        void setMax(String str);

        void valueOf();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChooseFileBridgeExtension)) {
            return false;
        }
        ChooseFileBridgeExtension chooseFileBridgeExtension = (ChooseFileBridgeExtension) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) chooseFileBridgeExtension.setMin) && this.getMax == chooseFileBridgeExtension.getMax;
    }

    public final int hashCode() {
        List<ChooseFileActivityResultExtensionImpl> list = this.setMin;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.getMax;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BankAccountsModel(bankAccountList=");
        sb.append(this.setMin);
        sb.append(", success=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public ChooseFileBridgeExtension(@NotNull List<ChooseFileActivityResultExtensionImpl> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "bankAccountList");
        this.setMin = list;
        this.getMax = z;
    }
}
