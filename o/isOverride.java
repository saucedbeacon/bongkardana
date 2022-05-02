package o;

import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/domain/announcement/interactor/GetAnnouncements;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/announcement/model/Announcement;", "Lid/dana/domain/announcement/interactor/GetAnnouncements$Params;", "announcementRepository", "Lid/dana/domain/announcement/AnnouncementRepository;", "(Lid/dana/domain/announcement/AnnouncementRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class isOverride extends APWebChromeClient<List<? extends getIcontype>, getMin> {
    private final toolbarMenuClicked announcementRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public isOverride(@NotNull toolbarMenuClicked toolbarmenuclicked) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(toolbarmenuclicked, "announcementRepository");
        this.announcementRepository = toolbarmenuclicked;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<getIcontype>> buildUseCase(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        return this.announcementRepository.getAnnouncements(getmin.getType(), getmin.getExtendInfo());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lid/dana/domain/announcement/interactor/GetAnnouncements$Params;", "", "type", "", "extendInfo", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getExtendInfo", "()Ljava/util/Map;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @NotNull
        private final Map<String, String> extendInfo;
        @NotNull
        private final String type;

        public static /* synthetic */ getMin copy$default(getMin getmin, String str, Map<String, String> map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getmin.type;
            }
            if ((i & 2) != 0) {
                map = getmin.extendInfo;
            }
            return getmin.copy(str, map);
        }

        @NotNull
        public final String component1() {
            return this.type;
        }

        @NotNull
        public final Map<String, String> component2() {
            return this.extendInfo;
        }

        @NotNull
        public final getMin copy(@NotNull String str, @NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(str, "type");
            Intrinsics.checkNotNullParameter(map, "extendInfo");
            return new getMin(str, map);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMin)) {
                return false;
            }
            getMin getmin = (getMin) obj;
            return Intrinsics.areEqual((Object) this.type, (Object) getmin.type) && Intrinsics.areEqual((Object) this.extendInfo, (Object) getmin.extendInfo);
        }

        public final int hashCode() {
            String str = this.type;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Map<String, String> map = this.extendInfo;
            if (map != null) {
                i = map.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(type=");
            sb.append(this.type);
            sb.append(", extendInfo=");
            sb.append(this.extendInfo);
            sb.append(")");
            return sb.toString();
        }

        public getMin(@NotNull String str, @NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(str, "type");
            Intrinsics.checkNotNullParameter(map, "extendInfo");
            this.type = str;
            this.extendInfo = map;
        }

        @NotNull
        public final Map<String, String> getExtendInfo() {
            return this.extendInfo;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }
    }
}
