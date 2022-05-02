package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J9\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lid/dana/social/model/ActivityReactionsModel;", "", "kind", "", "users", "", "Lid/dana/social/model/ActivityReactionsUserModel;", "maxId", "hasNext", "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "getHasNext", "()Z", "setHasNext", "(Z)V", "getKind", "()Ljava/lang/String;", "getMaxId", "setMaxId", "(Ljava/lang/String;)V", "getUsers", "()Ljava/util/List;", "setUsers", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class dispatchSetPressed {
    public boolean getMax;
    @Nullable
    public List<recycleOnMeasure> getMin;
    @NotNull
    public String length;
    @NotNull
    private final String setMax;

    public dispatchSetPressed() {
        this((byte) 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dispatchSetPressed)) {
            return false;
        }
        dispatchSetPressed dispatchsetpressed = (dispatchSetPressed) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) dispatchsetpressed.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) dispatchsetpressed.getMin) && Intrinsics.areEqual((Object) this.length, (Object) dispatchsetpressed.length) && this.getMax == dispatchsetpressed.getMax;
    }

    public final int hashCode() {
        String str = this.setMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<recycleOnMeasure> list = this.getMin;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.length;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.getMax;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityReactionsModel(kind=");
        sb.append(this.setMax);
        sb.append(", users=");
        sb.append(this.getMin);
        sb.append(", maxId=");
        sb.append(this.length);
        sb.append(", hasNext=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public dispatchSetPressed(@NotNull String str, @Nullable List<recycleOnMeasure> list, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "kind");
        Intrinsics.checkNotNullParameter(str2, "maxId");
        this.setMax = str;
        this.getMin = list;
        this.length = str2;
        this.getMax = z;
    }

    public /* synthetic */ dispatchSetPressed(byte b) {
        this("", CollectionsKt.emptyList(), "", false);
    }

    public final boolean getMin() {
        return this.getMax;
    }
}
