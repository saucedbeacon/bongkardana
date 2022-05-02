package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/domain/saving/model/SavingWithdrawInitRequest;", "", "savingId", "", "withdrawMethod", "(Ljava/lang/String;Ljava/lang/String;)V", "getSavingId", "()Ljava/lang/String;", "getWithdrawMethod", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getInstanceForApplication {
    @NotNull
    private final String savingId;
    @NotNull
    private final String withdrawMethod;

    public static /* synthetic */ getInstanceForApplication copy$default(getInstanceForApplication getinstanceforapplication, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getinstanceforapplication.savingId;
        }
        if ((i & 2) != 0) {
            str2 = getinstanceforapplication.withdrawMethod;
        }
        return getinstanceforapplication.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.savingId;
    }

    @NotNull
    public final String component2() {
        return this.withdrawMethod;
    }

    @NotNull
    public final getInstanceForApplication copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter(str2, "withdrawMethod");
        return new getInstanceForApplication(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getInstanceForApplication)) {
            return false;
        }
        getInstanceForApplication getinstanceforapplication = (getInstanceForApplication) obj;
        return Intrinsics.areEqual((Object) this.savingId, (Object) getinstanceforapplication.savingId) && Intrinsics.areEqual((Object) this.withdrawMethod, (Object) getinstanceforapplication.withdrawMethod);
    }

    public final int hashCode() {
        String str = this.savingId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.withdrawMethod;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingWithdrawInitRequest(savingId=");
        sb.append(this.savingId);
        sb.append(", withdrawMethod=");
        sb.append(this.withdrawMethod);
        sb.append(")");
        return sb.toString();
    }

    public getInstanceForApplication(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter(str2, "withdrawMethod");
        this.savingId = str;
        this.withdrawMethod = str2;
    }

    @NotNull
    public final String getSavingId() {
        return this.savingId;
    }

    @NotNull
    public final String getWithdrawMethod() {
        return this.withdrawMethod;
    }
}
