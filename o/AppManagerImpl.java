package o;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lid/dana/data/config/model/NearbyTrendingKeywordEntity;", "Ljava/io/Serializable;", "name", "", "tag", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getTag", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AppManagerImpl implements Serializable {
    @NotNull
    public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
    private static final String DEFAULT_TAG = "Merchant";
    @Nullable
    private final String name;
    @Nullable
    private final String tag;

    public AppManagerImpl() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AppManagerImpl copy$default(AppManagerImpl appManagerImpl, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appManagerImpl.name;
        }
        if ((i & 2) != 0) {
            str2 = appManagerImpl.tag;
        }
        return appManagerImpl.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final String component2() {
        return this.tag;
    }

    @NotNull
    public final AppManagerImpl copy(@Nullable String str, @Nullable String str2) {
        return new AppManagerImpl(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppManagerImpl)) {
            return false;
        }
        AppManagerImpl appManagerImpl = (AppManagerImpl) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) appManagerImpl.name) && Intrinsics.areEqual((Object) this.tag, (Object) appManagerImpl.tag);
    }

    public final int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.tag;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyTrendingKeywordEntity(name=");
        sb.append(this.name);
        sb.append(", tag=");
        sb.append(this.tag);
        sb.append(")");
        return sb.toString();
    }

    public AppManagerImpl(@Nullable String str, @Nullable String str2) {
        this.name = str;
        this.tag = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppManagerImpl(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? DEFAULT_TAG : str2);
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/config/model/NearbyTrendingKeywordEntity$Companion;", "", "()V", "DEFAULT_TAG", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
