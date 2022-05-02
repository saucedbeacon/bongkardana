package o;

import id.dana.data.userconfig.UserConfigBizTypeConstant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00112\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/data/services/repository/source/model/StoreFavoriteServiceConfig;", "Lid/dana/domain/userconfig/model/StoreConfig;", "", "", "content", "(Ljava/util/List;)V", "getContent", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DefaultEventTracker extends onConnectedSuccessful<List<? extends String>> {
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    @NotNull
    public static final String SYNC_KEY = "feature_favorite_services";
    @NotNull
    private final List<String> content;

    public static /* synthetic */ DefaultEventTracker copy$default(DefaultEventTracker defaultEventTracker, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = defaultEventTracker.content;
        }
        return defaultEventTracker.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.content;
    }

    @NotNull
    public final DefaultEventTracker copy(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "content");
        return new DefaultEventTracker(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof DefaultEventTracker) && Intrinsics.areEqual((Object) this.content, (Object) ((DefaultEventTracker) obj).content);
        }
        return true;
    }

    public final int hashCode() {
        List<String> list = this.content;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreFavoriteServiceConfig(content=");
        sb.append(this.content);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final List<String> getContent() {
        return this.content;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultEventTracker(@NotNull List<String> list) {
        super(UserConfigBizTypeConstant.CONFIG_MY_FAVORITE_SERVICE, SYNC_KEY, list);
        Intrinsics.checkNotNullParameter(list, "content");
        this.content = list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/services/repository/source/model/StoreFavoriteServiceConfig$Companion;", "", "()V", "SYNC_KEY", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
