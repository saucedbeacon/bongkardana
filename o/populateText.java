package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.updateListItems;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lid/dana/data/announcement/repository/source/network/result/AnnouncementResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "announcements", "Lid/dana/data/announcement/model/Announcements;", "(Lid/dana/data/announcement/model/Announcements;)V", "getAnnouncements", "()Lid/dana/data/announcement/model/Announcements;", "setAnnouncements", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class populateText extends BaseRpcResult {
    @Nullable
    private updateListItems.Cdefault announcements;

    public populateText() {
        this((updateListItems.Cdefault) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ populateText copy$default(populateText populatetext, updateListItems.Cdefault defaultR, int i, Object obj) {
        if ((i & 1) != 0) {
            defaultR = populatetext.announcements;
        }
        return populatetext.copy(defaultR);
    }

    @Nullable
    public final updateListItems.Cdefault component1() {
        return this.announcements;
    }

    @NotNull
    public final populateText copy(@Nullable updateListItems.Cdefault defaultR) {
        return new populateText(defaultR);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof populateText) && Intrinsics.areEqual((Object) this.announcements, (Object) ((populateText) obj).announcements);
        }
        return true;
    }

    public final int hashCode() {
        updateListItems.Cdefault defaultR = this.announcements;
        if (defaultR != null) {
            return defaultR.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AnnouncementResult(announcements=");
        sb.append(this.announcements);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lid/dana/data/announcement/repository/source/network/request/AnnouncementRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "announcementType", "", "extendInfo", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getAnnouncementType", "()Ljava/lang/String;", "setAnnouncementType", "(Ljava/lang/String;)V", "getExtendInfo", "()Ljava/util/Map;", "setExtendInfo", "(Ljava/util/Map;)V", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.populateText$default  reason: invalid class name */
    public final class Cdefault extends BaseRpcRequest {
        @NotNull
        private String announcementType;
        @NotNull
        private Map<String, String> extendInfo;

        @NotNull
        public final String getAnnouncementType() {
            return this.announcementType;
        }

        public final void setAnnouncementType(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.announcementType = str;
        }

        @NotNull
        public final Map<String, String> getExtendInfo() {
            return this.extendInfo;
        }

        public final void setExtendInfo(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.extendInfo = map;
        }

        public Cdefault(@NotNull String str, @NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(str, "announcementType");
            Intrinsics.checkNotNullParameter(map, "extendInfo");
            this.announcementType = str;
            this.extendInfo = map;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ populateText(updateListItems.Cdefault defaultR, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : defaultR);
    }

    @Nullable
    public final updateListItems.Cdefault getAnnouncements() {
        return this.announcements;
    }

    public final void setAnnouncements(@Nullable updateListItems.Cdefault defaultR) {
        this.announcements = defaultR;
    }

    public populateText(@Nullable updateListItems.Cdefault defaultR) {
        this.announcements = defaultR;
    }
}
