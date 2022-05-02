package o;

import id.dana.data.constant.UrlTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lid/dana/openbankaccount/model/BankAccountInfo;", "", "instId", "", "status", "bankName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankName", "()Ljava/lang/String;", "setBankName", "(Ljava/lang/String;)V", "getInstId", "setInstId", "getStatus", "setStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ChooseFileActivityResultExtensionImpl {
    @NotNull
    public String getMax;
    @NotNull
    public String getMin;
    @NotNull
    public String setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChooseFileActivityResultExtensionImpl)) {
            return false;
        }
        ChooseFileActivityResultExtensionImpl chooseFileActivityResultExtensionImpl = (ChooseFileActivityResultExtensionImpl) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) chooseFileActivityResultExtensionImpl.setMin) && Intrinsics.areEqual((Object) this.getMax, (Object) chooseFileActivityResultExtensionImpl.getMax) && Intrinsics.areEqual((Object) this.getMin, (Object) chooseFileActivityResultExtensionImpl.getMin);
    }

    public final int hashCode() {
        String str = this.setMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMax;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMin;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BankAccountInfo(instId=");
        sb.append(this.setMin);
        sb.append(", status=");
        sb.append(this.getMax);
        sb.append(", bankName=");
        sb.append(this.getMin);
        sb.append(")");
        return sb.toString();
    }

    public ChooseFileActivityResultExtensionImpl(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, UrlTag.INSTID);
        Intrinsics.checkNotNullParameter(str2, "status");
        Intrinsics.checkNotNullParameter(str3, "bankName");
        this.setMin = str;
        this.getMax = str2;
        this.getMin = str3;
    }
}
