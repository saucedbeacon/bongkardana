package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lid/dana/data/globalsearch/source/network/request/HistoricalSkuRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "profileKeys", "", "", "profileKeyMaxResult", "", "(Ljava/util/List;I)V", "getProfileKeyMaxResult", "()I", "getProfileKeys", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SplashUtils extends BaseRpcRequest {
    private final int profileKeyMaxResult;
    @NotNull
    private final List<String> profileKeys;

    public static /* synthetic */ SplashUtils copy$default(SplashUtils splashUtils, List<String> list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = splashUtils.profileKeys;
        }
        if ((i2 & 2) != 0) {
            i = splashUtils.profileKeyMaxResult;
        }
        return splashUtils.copy(list, i);
    }

    @NotNull
    public final List<String> component1() {
        return this.profileKeys;
    }

    public final int component2() {
        return this.profileKeyMaxResult;
    }

    @NotNull
    public final SplashUtils copy(@NotNull List<String> list, int i) {
        Intrinsics.checkNotNullParameter(list, "profileKeys");
        return new SplashUtils(list, i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplashUtils)) {
            return false;
        }
        SplashUtils splashUtils = (SplashUtils) obj;
        return Intrinsics.areEqual((Object) this.profileKeys, (Object) splashUtils.profileKeys) && this.profileKeyMaxResult == splashUtils.profileKeyMaxResult;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoricalSkuRequest(profileKeys=");
        sb.append(this.profileKeys);
        sb.append(", profileKeyMaxResult=");
        sb.append(this.profileKeyMaxResult);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final List<String> getProfileKeys() {
        return this.profileKeys;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SplashUtils(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? 1 : i);
    }

    public final int getProfileKeyMaxResult() {
        return this.profileKeyMaxResult;
    }

    public SplashUtils(@NotNull List<String> list, int i) {
        Intrinsics.checkNotNullParameter(list, "profileKeys");
        this.profileKeys = list;
        this.profileKeyMaxResult = i;
    }

    public final int hashCode() {
        List<String> list = this.profileKeys;
        return ((list != null ? list.hashCode() : 0) * 31) + Integer.valueOf(this.profileKeyMaxResult).hashCode();
    }
}
