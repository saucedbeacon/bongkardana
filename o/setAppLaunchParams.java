package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001f\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lid/dana/data/electronicmoney/network/response/EmoneyReversalResponse;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "data", "", "", "(Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setAppLaunchParams extends BaseRpcResult {
    @NotNull
    private final Map<String, String> data;

    public static /* synthetic */ setAppLaunchParams copy$default(setAppLaunchParams setapplaunchparams, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = setapplaunchparams.data;
        }
        return setapplaunchparams.copy(map);
    }

    @NotNull
    public final Map<String, String> component1() {
        return this.data;
    }

    @NotNull
    public final setAppLaunchParams copy(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "data");
        return new setAppLaunchParams(map);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof setAppLaunchParams) && Intrinsics.areEqual((Object) this.data, (Object) ((setAppLaunchParams) obj).data);
        }
        return true;
    }

    public final int hashCode() {
        Map<String, String> map = this.data;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EmoneyReversalResponse(data=");
        sb.append(this.data);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final Map<String, String> getData() {
        return this.data;
    }

    public setAppLaunchParams(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "data");
        this.data = map;
    }
}
