package o;

import com.alibaba.fastjson.annotation.JSONField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/data/config/model/Memory;", "", "maxMemory", "", "totalMemory", "(Ljava/lang/String;Ljava/lang/String;)V", "getMaxMemory", "()Ljava/lang/String;", "getTotalMemory", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class executeSendToRender {
    @NotNull
    private final String maxMemory;
    @NotNull
    private final String totalMemory;

    public static /* synthetic */ executeSendToRender copy$default(executeSendToRender executesendtorender, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = executesendtorender.maxMemory;
        }
        if ((i & 2) != 0) {
            str2 = executesendtorender.totalMemory;
        }
        return executesendtorender.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.maxMemory;
    }

    @NotNull
    public final String component2() {
        return this.totalMemory;
    }

    @NotNull
    public final executeSendToRender copy(@JSONField(name = "maxMemory") @NotNull String str, @JSONField(name = "totalMemory") @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "maxMemory");
        Intrinsics.checkNotNullParameter(str2, "totalMemory");
        return new executeSendToRender(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof executeSendToRender)) {
            return false;
        }
        executeSendToRender executesendtorender = (executeSendToRender) obj;
        return Intrinsics.areEqual((Object) this.maxMemory, (Object) executesendtorender.maxMemory) && Intrinsics.areEqual((Object) this.totalMemory, (Object) executesendtorender.totalMemory);
    }

    public final int hashCode() {
        String str = this.maxMemory;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.totalMemory;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Memory(maxMemory=");
        sb.append(this.maxMemory);
        sb.append(", totalMemory=");
        sb.append(this.totalMemory);
        sb.append(")");
        return sb.toString();
    }

    public executeSendToRender(@JSONField(name = "maxMemory") @NotNull String str, @JSONField(name = "totalMemory") @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "maxMemory");
        Intrinsics.checkNotNullParameter(str2, "totalMemory");
        this.maxMemory = str;
        this.totalMemory = str2;
    }

    @NotNull
    public final String getMaxMemory() {
        return this.maxMemory;
    }

    @NotNull
    public final String getTotalMemory() {
        return this.totalMemory;
    }
}
