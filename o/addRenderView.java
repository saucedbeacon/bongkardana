package o;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lid/dana/data/globalnetwork/model/PaymentResult;", "", "code", "", "generateDate", "Ljava/util/Date;", "isExpired", "", "(Ljava/lang/String;Ljava/util/Date;Z)V", "getCode", "()Ljava/lang/String;", "getGenerateDate", "()Ljava/util/Date;", "()Z", "setExpired", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class addRenderView {
    @NotNull
    private final String code;
    @NotNull
    private final Date generateDate;
    private boolean isExpired;

    public static /* synthetic */ addRenderView copy$default(addRenderView addrenderview, String str, Date date, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addrenderview.code;
        }
        if ((i & 2) != 0) {
            date = addrenderview.generateDate;
        }
        if ((i & 4) != 0) {
            z = addrenderview.isExpired;
        }
        return addrenderview.copy(str, date, z);
    }

    @NotNull
    public final String component1() {
        return this.code;
    }

    @NotNull
    public final Date component2() {
        return this.generateDate;
    }

    public final boolean component3() {
        return this.isExpired;
    }

    @NotNull
    public final addRenderView copy(@NotNull String str, @NotNull Date date, boolean z) {
        Intrinsics.checkNotNullParameter(str, "code");
        Intrinsics.checkNotNullParameter(date, "generateDate");
        return new addRenderView(str, date, z);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentResult(code=");
        sb.append(this.code);
        sb.append(", generateDate=");
        sb.append(this.generateDate);
        sb.append(", isExpired=");
        sb.append(this.isExpired);
        sb.append(")");
        return sb.toString();
    }

    public addRenderView(@NotNull String str, @NotNull Date date, boolean z) {
        Intrinsics.checkNotNullParameter(str, "code");
        Intrinsics.checkNotNullParameter(date, "generateDate");
        this.code = str;
        this.generateDate = date;
        this.isExpired = z;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final Date getGenerateDate() {
        return this.generateDate;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ addRenderView(String str, Date date, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, date, (i & 4) != 0 ? false : z);
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public final void setExpired(boolean z) {
        this.isExpired = z;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof addRenderView) && Intrinsics.areEqual((Object) ((addRenderView) obj).code, (Object) this.code);
    }

    public final int hashCode() {
        return this.code.hashCode();
    }
}
