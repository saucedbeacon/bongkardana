package o;

import androidx.annotation.DrawableRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lid/dana/paymentsetting/model/PaymentSettingOnboardingModel;", "", "resId", "", "title", "", "description", "(ILjava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getResId", "()I", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getOrCreate {
    @NotNull
    public final String getMin;
    public final int setMax;
    @NotNull
    public final String setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getOrCreate)) {
            return false;
        }
        getOrCreate getorcreate = (getOrCreate) obj;
        return this.setMax == getorcreate.setMax && Intrinsics.areEqual((Object) this.getMin, (Object) getorcreate.getMin) && Intrinsics.areEqual((Object) this.setMin, (Object) getorcreate.setMin);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentSettingOnboardingModel(resId=");
        sb.append(this.setMax);
        sb.append(", title=");
        sb.append(this.getMin);
        sb.append(", description=");
        sb.append(this.setMin);
        sb.append(")");
        return sb.toString();
    }

    public getOrCreate(@DrawableRes int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "description");
        this.setMax = i;
        this.getMin = str;
        this.setMin = str2;
    }

    public final int hashCode() {
        int hashCode = Integer.valueOf(this.setMax).hashCode() * 31;
        String str = this.getMin;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.setMin;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }
}
