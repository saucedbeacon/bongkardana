package o;

import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/twilio/verify/models/ChallengeDetails;", "", "message", "", "fields", "", "Lcom/twilio/verify/models/Detail;", "date", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Date;)V", "getDate", "()Ljava/util/Date;", "getFields", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class removeAndRecycleView {
    @NotNull
    private final String getMin;
    @NotNull
    public final List<getHeightMode> length;
    @Nullable
    private final Date setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeAndRecycleView)) {
            return false;
        }
        removeAndRecycleView removeandrecycleview = (removeAndRecycleView) obj;
        return Intrinsics.areEqual((Object) this.getMin, (Object) removeandrecycleview.getMin) && Intrinsics.areEqual((Object) this.length, (Object) removeandrecycleview.length) && Intrinsics.areEqual((Object) this.setMin, (Object) removeandrecycleview.setMin);
    }

    public final int hashCode() {
        String str = this.getMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<getHeightMode> list = this.length;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Date date = this.setMin;
        if (date != null) {
            i = date.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChallengeDetails(message=");
        sb.append(this.getMin);
        sb.append(", fields=");
        sb.append(this.length);
        sb.append(", date=");
        sb.append(this.setMin);
        sb.append(")");
        return sb.toString();
    }

    public removeAndRecycleView(@NotNull String str, @NotNull List<getHeightMode> list, @Nullable Date date) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        Intrinsics.checkParameterIsNotNull(list, "fields");
        this.getMin = str;
        this.length = list;
        this.setMin = date;
    }
}
