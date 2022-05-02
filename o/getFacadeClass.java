package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/miniprogram/interactor/SetFavoriteMiniPrograms;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/miniprogram/interactor/SetFavoriteMiniPrograms$Params;", "repository", "Lid/dana/domain/miniprogram/MiniProgramRepository;", "(Lid/dana/domain/miniprogram/MiniProgramRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getFacadeClass extends APWebChromeClient<Unit, length> {
    private final getFacade repository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getFacadeClass(@NotNull getFacade getfacade) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getfacade, "repository");
        this.repository = getfacade;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\r¨\u0006\u0017"}, d2 = {"Lid/dana/domain/miniprogram/interactor/SetFavoriteMiniPrograms$Params;", "", "appId", "", "isFavorite", "", "allMiniProgramAppIds", "", "(Ljava/lang/String;ZLjava/util/List;)V", "getAllMiniProgramAppIds", "()Ljava/util/List;", "getAppId", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        @NotNull
        private final List<String> allMiniProgramAppIds;
        @NotNull
        private final String appId;
        private final boolean isFavorite;

        public static /* synthetic */ length copy$default(length length, String str, boolean z, List<String> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = length.appId;
            }
            if ((i & 2) != 0) {
                z = length.isFavorite;
            }
            if ((i & 4) != 0) {
                list = length.allMiniProgramAppIds;
            }
            return length.copy(str, z, list);
        }

        @NotNull
        public final String component1() {
            return this.appId;
        }

        public final boolean component2() {
            return this.isFavorite;
        }

        @NotNull
        public final List<String> component3() {
            return this.allMiniProgramAppIds;
        }

        @NotNull
        public final length copy(@NotNull String str, boolean z, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(str, "appId");
            Intrinsics.checkNotNullParameter(list, "allMiniProgramAppIds");
            return new length(str, z, list);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof length)) {
                return false;
            }
            length length = (length) obj;
            return Intrinsics.areEqual((Object) this.appId, (Object) length.appId) && this.isFavorite == length.isFavorite && Intrinsics.areEqual((Object) this.allMiniProgramAppIds, (Object) length.allMiniProgramAppIds);
        }

        public final int hashCode() {
            String str = this.appId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.isFavorite;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            List<String> list = this.allMiniProgramAppIds;
            if (list != null) {
                i = list.hashCode();
            }
            return i2 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(appId=");
            sb.append(this.appId);
            sb.append(", isFavorite=");
            sb.append(this.isFavorite);
            sb.append(", allMiniProgramAppIds=");
            sb.append(this.allMiniProgramAppIds);
            sb.append(")");
            return sb.toString();
        }

        public length(@NotNull String str, boolean z, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(str, "appId");
            Intrinsics.checkNotNullParameter(list, "allMiniProgramAppIds");
            this.appId = str;
            this.isFavorite = z;
            this.allMiniProgramAppIds = list;
        }

        @NotNull
        public final String getAppId() {
            return this.appId;
        }

        public final boolean isFavorite() {
            return this.isFavorite;
        }

        @NotNull
        public final List<String> getAllMiniProgramAppIds() {
            return this.allMiniProgramAppIds;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Unit> buildUseCase(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "params");
        return this.repository.setFavoriteMiniPrograms(length2.getAppId(), length2.isFavorite(), length2.getAllMiniProgramAppIds());
    }
}
