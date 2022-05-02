package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lid/dana/data/statement/repository/source/network/request/StatementSummaryRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "timeValue", "", "timeUnit", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTimeUnit", "()Ljava/lang/String;", "setTimeUnit", "(Ljava/lang/String;)V", "getTimeValue", "setTimeValue", "getType", "setType", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setFileName extends BaseRpcRequest {
    @NotNull
    private String timeUnit;
    @NotNull
    private String timeValue;
    @NotNull
    private String type;

    public setFileName() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setFileName copy$default(setFileName setfilename, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setfilename.timeValue;
        }
        if ((i & 2) != 0) {
            str2 = setfilename.timeUnit;
        }
        if ((i & 4) != 0) {
            str3 = setfilename.type;
        }
        return setfilename.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.timeValue;
    }

    @NotNull
    public final String component2() {
        return this.timeUnit;
    }

    @NotNull
    public final String component3() {
        return this.type;
    }

    @NotNull
    public final setFileName copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "timeValue");
        Intrinsics.checkNotNullParameter(str2, "timeUnit");
        Intrinsics.checkNotNullParameter(str3, "type");
        return new setFileName(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFileName)) {
            return false;
        }
        setFileName setfilename = (setFileName) obj;
        return Intrinsics.areEqual((Object) this.timeValue, (Object) setfilename.timeValue) && Intrinsics.areEqual((Object) this.timeUnit, (Object) setfilename.timeUnit) && Intrinsics.areEqual((Object) this.type, (Object) setfilename.type);
    }

    public final int hashCode() {
        String str = this.timeValue;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.timeUnit;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.type;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("StatementSummaryRequest(timeValue=");
        sb.append(this.timeValue);
        sb.append(", timeUnit=");
        sb.append(this.timeUnit);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getTimeValue() {
        return this.timeValue;
    }

    public final void setTimeValue(@NotNull String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(826277876, oncanceled);
            onCancelLoad.getMin(826277876, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeValue = str;
    }

    @NotNull
    public final String getTimeUnit() {
        return this.timeUnit;
    }

    public final void setTimeUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeUnit = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setFileName(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public setFileName(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "timeValue");
        Intrinsics.checkNotNullParameter(str2, "timeUnit");
        Intrinsics.checkNotNullParameter(str3, "type");
        this.timeValue = str;
        this.timeUnit = str2;
        this.type = str3;
    }
}
