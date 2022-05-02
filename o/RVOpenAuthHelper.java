package o;

import android.database.Cursor;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import com.google.gson.annotations.SerializedName;
import id.dana.data.userconfig.UserConfigBizTypeConstant;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lid/dana/data/social/model/MyFeedResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "hasMore", "", "maxId", "", "minId", "notifications", "", "Lid/dana/data/social/model/ActivityResult;", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getHasMore", "()Z", "getMaxId", "()Ljava/lang/String;", "getMinId", "getNotifications", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RVOpenAuthHelper extends BaseRpcResult {
    private final boolean hasMore;
    @Nullable
    private final String maxId;
    @Nullable
    private final String minId;
    @NotNull
    private final List<onUserAuthClick> notifications;

    public RVOpenAuthHelper() {
        this(false, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RVOpenAuthHelper copy$default(RVOpenAuthHelper rVOpenAuthHelper, boolean z, String str, String str2, List<onUserAuthClick> list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rVOpenAuthHelper.hasMore;
        }
        if ((i & 2) != 0) {
            str = rVOpenAuthHelper.maxId;
        }
        if ((i & 4) != 0) {
            str2 = rVOpenAuthHelper.minId;
        }
        if ((i & 8) != 0) {
            list = rVOpenAuthHelper.notifications;
        }
        return rVOpenAuthHelper.copy(z, str, str2, list);
    }

    public final boolean component1() {
        return this.hasMore;
    }

    @Nullable
    public final String component2() {
        return this.maxId;
    }

    @Nullable
    public final String component3() {
        return this.minId;
    }

    @NotNull
    public final List<onUserAuthClick> component4() {
        return this.notifications;
    }

    @NotNull
    public final RVOpenAuthHelper copy(boolean z, @Nullable String str, @Nullable String str2, @NotNull List<onUserAuthClick> list) {
        Intrinsics.checkNotNullParameter(list, "notifications");
        return new RVOpenAuthHelper(z, str, str2, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RVOpenAuthHelper)) {
            return false;
        }
        RVOpenAuthHelper rVOpenAuthHelper = (RVOpenAuthHelper) obj;
        return this.hasMore == rVOpenAuthHelper.hasMore && Intrinsics.areEqual((Object) this.maxId, (Object) rVOpenAuthHelper.maxId) && Intrinsics.areEqual((Object) this.minId, (Object) rVOpenAuthHelper.minId) && Intrinsics.areEqual((Object) this.notifications, (Object) rVOpenAuthHelper.notifications);
    }

    public final int hashCode() {
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.maxId;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.minId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<onUserAuthClick> list = this.notifications;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MyFeedResult(hasMore=");
        sb.append(this.hasMore);
        sb.append(", maxId=");
        sb.append(this.maxId);
        sb.append(", minId=");
        sb.append(this.minId);
        sb.append(", notifications=");
        sb.append(this.notifications);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lid/dana/data/social/model/ReportFeedCommentRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "id", "", "reason", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getReason", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.RVOpenAuthHelper$3  reason: invalid class name */
    public final class AnonymousClass3 extends BaseRpcRequest {
        @Nullable

        /* renamed from: id  reason: collision with root package name */
        private final String f9914id;
        @Nullable
        private final String reason;

        public AnonymousClass3() {
            this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ AnonymousClass3 copy$default(AnonymousClass3 r0, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.f9914id;
            }
            if ((i & 2) != 0) {
                str2 = r0.reason;
            }
            return r0.copy(str, str2);
        }

        @Nullable
        public final String component1() {
            return this.f9914id;
        }

        @Nullable
        public final String component2() {
            return this.reason;
        }

        @NotNull
        public final AnonymousClass3 copy(@Nullable String str, @Nullable String str2) {
            return new AnonymousClass3(str, str2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass3)) {
                return false;
            }
            AnonymousClass3 r3 = (AnonymousClass3) obj;
            return Intrinsics.areEqual((Object) this.f9914id, (Object) r3.f9914id) && Intrinsics.areEqual((Object) this.reason, (Object) r3.reason);
        }

        public final int hashCode() {
            String str = this.f9914id;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.reason;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ReportFeedCommentRequest(id=");
            sb.append(this.f9914id);
            sb.append(", reason=");
            sb.append(this.reason);
            sb.append(")");
            return sb.toString();
        }

        @Nullable
        public final String getId() {
            return this.f9914id;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass3(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }

        @Nullable
        public final String getReason() {
            return this.reason;
        }

        public AnonymousClass3(@Nullable String str, @Nullable String str2) {
            this.f9914id = str;
            this.reason = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lid/dana/data/social/model/UserConfigFeedShareContent;", "", "shareFeed", "", "(Z)V", "getShareFeed", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.RVOpenAuthHelper$2  reason: invalid class name */
    public final class AnonymousClass2 {
        @SerializedName("share_setting")
        private final boolean shareFeed;

        public static /* synthetic */ AnonymousClass2 copy$default(AnonymousClass2 r0, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = r0.shareFeed;
            }
            return r0.copy(z);
        }

        public final boolean component1() {
            return this.shareFeed;
        }

        @NotNull
        public final AnonymousClass2 copy(boolean z) {
            return new AnonymousClass2(z);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof AnonymousClass2) && this.shareFeed == ((AnonymousClass2) obj).shareFeed;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.shareFeed;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("UserConfigFeedShareContent(shareFeed=");
            sb.append(this.shareFeed);
            sb.append(")");
            return sb.toString();
        }

        {
            this.shareFeed = r1;
        }

        public final boolean getShareFeed() {
            return this.shareFeed;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lid/dana/data/social/model/StoreFeedShareConfig;", "Lid/dana/domain/userconfig/model/StoreConfig;", "Lid/dana/data/social/model/UserConfigFeedShareContent;", "content", "(Lid/dana/data/social/model/UserConfigFeedShareContent;)V", "getContent", "()Lid/dana/data/social/model/UserConfigFeedShareContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class a extends onConnectedSuccessful<AnonymousClass2> {
        @NotNull
        public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
        @NotNull
        public static final String SYNC_KEY = "feature_sync_share_feed";
        @NotNull
        private final AnonymousClass2 content;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lid/dana/data/social/repository/ActivityReactionsData;", "", "getActivityReactions", "Lio/reactivex/Observable;", "Lid/dana/data/social/model/ActivityReactionsResult;", "activityId", "", "kind", "idLT", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.RVOpenAuthHelper$a$1  reason: invalid class name */
        public interface AnonymousClass1 {
            @NotNull
            TitleBarRightButtonView.AnonymousClass1<executeAuth> getActivityReactions(@NotNull String str, @NotNull String str2, @NotNull String str3);
        }

        public static /* synthetic */ a copy$default(a aVar, AnonymousClass2 r1, int i, Object obj) {
            if ((i & 1) != 0) {
                r1 = aVar.content;
            }
            return aVar.copy(r1);
        }

        @NotNull
        public final AnonymousClass2 component1() {
            return this.content;
        }

        @NotNull
        public final a copy(@NotNull AnonymousClass2 r2) {
            Intrinsics.checkNotNullParameter(r2, "content");
            return new a(r2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof a) && Intrinsics.areEqual((Object) this.content, (Object) ((a) obj).content);
            }
            return true;
        }

        public final int hashCode() {
            AnonymousClass2 r0 = this.content;
            if (r0 != null) {
                return r0.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("StoreFeedShareConfig(content=");
            sb.append(this.content);
            sb.append(")");
            return sb.toString();
        }

        @NotNull
        public final AnonymousClass2 getContent() {
            return this.content;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(@NotNull AnonymousClass2 r3) {
            super(UserConfigBizTypeConstant.CONFIG_FRIENDSHIP_SHARE, SYNC_KEY, r3);
            Intrinsics.checkNotNullParameter(r3, "content");
            this.content = r3;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/social/model/StoreFeedShareConfig$Companion;", "", "()V", "SYNC_KEY", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMax {
            private getMax() {
            }

            public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fBA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, d2 = {"Lid/dana/data/social/model/SocialContactEntity;", "", "contactId", "", "displayName", "", "phoneNumber", "contactRawId", "lastUpdatedTime", "isEmpty", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getContactId", "()I", "getContactRawId", "()Ljava/lang/String;", "getDisplayName", "()Z", "getLastUpdatedTime", "getPhoneNumber", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.RVOpenAuthHelper$1  reason: invalid class name */
    public final class AnonymousClass1 {
        @NotNull
        public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
        private final int contactId;
        @NotNull
        private final String contactRawId;
        @NotNull
        private final String displayName;
        private final boolean isEmpty;
        @NotNull
        private final String lastUpdatedTime;
        @NotNull
        private final String phoneNumber;

        public AnonymousClass1() {
            this(0, (String) null, (String) null, (String) null, (String) null, false, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ AnonymousClass1 copy$default(AnonymousClass1 r4, int i, String str, String str2, String str3, String str4, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = r4.contactId;
            }
            if ((i2 & 2) != 0) {
                str = r4.displayName;
            }
            String str5 = str;
            if ((i2 & 4) != 0) {
                str2 = r4.phoneNumber;
            }
            String str6 = str2;
            if ((i2 & 8) != 0) {
                str3 = r4.contactRawId;
            }
            String str7 = str3;
            if ((i2 & 16) != 0) {
                str4 = r4.lastUpdatedTime;
            }
            String str8 = str4;
            if ((i2 & 32) != 0) {
                z = r4.isEmpty;
            }
            return r4.copy(i, str5, str6, str7, str8, z);
        }

        public final int component1() {
            return this.contactId;
        }

        @NotNull
        public final String component2() {
            return this.displayName;
        }

        @NotNull
        public final String component3() {
            return this.phoneNumber;
        }

        @NotNull
        public final String component4() {
            return this.contactRawId;
        }

        @NotNull
        public final String component5() {
            return this.lastUpdatedTime;
        }

        public final boolean component6() {
            return this.isEmpty;
        }

        @NotNull
        public final AnonymousClass1 copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
            Intrinsics.checkNotNullParameter(str, setBuildNumber.DISPLAY_NAME_KEY);
            Intrinsics.checkNotNullParameter(str2, "phoneNumber");
            Intrinsics.checkNotNullParameter(str3, "contactRawId");
            Intrinsics.checkNotNullParameter(str4, "lastUpdatedTime");
            return new AnonymousClass1(i, str, str2, str3, str4, z);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass1)) {
                return false;
            }
            AnonymousClass1 r3 = (AnonymousClass1) obj;
            return this.contactId == r3.contactId && Intrinsics.areEqual((Object) this.displayName, (Object) r3.displayName) && Intrinsics.areEqual((Object) this.phoneNumber, (Object) r3.phoneNumber) && Intrinsics.areEqual((Object) this.contactRawId, (Object) r3.contactRawId) && Intrinsics.areEqual((Object) this.lastUpdatedTime, (Object) r3.lastUpdatedTime) && this.isEmpty == r3.isEmpty;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("SocialContactEntity(contactId=");
            sb.append(this.contactId);
            sb.append(", displayName=");
            sb.append(this.displayName);
            sb.append(", phoneNumber=");
            sb.append(this.phoneNumber);
            sb.append(", contactRawId=");
            sb.append(this.contactRawId);
            sb.append(", lastUpdatedTime=");
            sb.append(this.lastUpdatedTime);
            sb.append(", isEmpty=");
            sb.append(this.isEmpty);
            sb.append(")");
            return sb.toString();
        }

        public AnonymousClass1(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
            Intrinsics.checkNotNullParameter(str, setBuildNumber.DISPLAY_NAME_KEY);
            Intrinsics.checkNotNullParameter(str2, "phoneNumber");
            Intrinsics.checkNotNullParameter(str3, "contactRawId");
            Intrinsics.checkNotNullParameter(str4, "lastUpdatedTime");
            this.contactId = i;
            this.displayName = str;
            this.phoneNumber = str2;
            this.contactRawId = str3;
            this.lastUpdatedTime = str4;
            this.isEmpty = z;
        }

        public final int getContactId() {
            return this.contactId;
        }

        @NotNull
        public final String getDisplayName() {
            return this.displayName;
        }

        @NotNull
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        @NotNull
        public final String getContactRawId() {
            return this.contactRawId;
        }

        @NotNull
        public final String getLastUpdatedTime() {
            return this.lastUpdatedTime;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ AnonymousClass1(int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r5 = this;
                r13 = r12 & 1
                r0 = 0
                if (r13 == 0) goto L_0x0007
                r13 = 0
                goto L_0x0008
            L_0x0007:
                r13 = r6
            L_0x0008:
                r6 = r12 & 2
                java.lang.String r1 = ""
                if (r6 == 0) goto L_0x0010
                r2 = r1
                goto L_0x0011
            L_0x0010:
                r2 = r7
            L_0x0011:
                r6 = r12 & 4
                if (r6 == 0) goto L_0x0017
                r3 = r1
                goto L_0x0018
            L_0x0017:
                r3 = r8
            L_0x0018:
                r6 = r12 & 8
                if (r6 == 0) goto L_0x001e
                r4 = r1
                goto L_0x001f
            L_0x001e:
                r4 = r9
            L_0x001f:
                r6 = r12 & 16
                if (r6 == 0) goto L_0x0024
                goto L_0x0025
            L_0x0024:
                r1 = r10
            L_0x0025:
                r6 = r12 & 32
                if (r6 == 0) goto L_0x002b
                r12 = 0
                goto L_0x002c
            L_0x002b:
                r12 = r11
            L_0x002c:
                r6 = r5
                r7 = r13
                r8 = r2
                r9 = r3
                r10 = r4
                r11 = r1
                r6.<init>(r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.RVOpenAuthHelper.AnonymousClass1.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final boolean isEmpty() {
            return this.isEmpty;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lid/dana/data/social/model/SocialContactEntity$Companion;", "", "()V", "fromCursorWithoutPhoto", "Lid/dana/data/social/model/SocialContactEntity;", "cursor", "Landroid/database/Cursor;", "isEmpty", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.RVOpenAuthHelper$1$getMin */
        public static final class getMin {
            public final void isEmpty() {
            }

            private getMin() {
            }

            public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final AnonymousClass1 fromCursorWithoutPhoto(@NotNull Cursor cursor) {
                Intrinsics.checkNotNullParameter(cursor, "cursor");
                int parseContactId = showErrorTipDialog.parseContactId(cursor);
                String parseContactDisplayId = showErrorTipDialog.parseContactDisplayId(cursor);
                Intrinsics.checkNotNullExpressionValue(parseContactDisplayId, "parseContactDisplayId()");
                String normalizeDigitsOnly = PhoneNumberUtil.normalizeDigitsOnly(showErrorTipDialog.parsePhoneNumber(cursor));
                Intrinsics.checkNotNullExpressionValue(normalizeDigitsOnly, "PhoneNumberUtil.normaliz…sOnly(parsePhoneNumber())");
                String replaceIndoPhonePrefixWithRegionDash = AuthenticationProxy.replaceIndoPhonePrefixWithRegionDash(normalizeDigitsOnly);
                String parseContactRawId = showErrorTipDialog.parseContactRawId(cursor);
                Intrinsics.checkNotNullExpressionValue(parseContactRawId, "parseContactRawId()");
                String parseLastUpdatedTime = showErrorTipDialog.parseLastUpdatedTime(cursor);
                Intrinsics.checkNotNullExpressionValue(parseLastUpdatedTime, "parseLastUpdatedTime()");
                return new AnonymousClass1(parseContactId, parseContactDisplayId, replaceIndoPhonePrefixWithRegionDash, parseContactRawId, parseLastUpdatedTime, false);
            }
        }

        public final int hashCode() {
            int hashCode = Integer.valueOf(this.contactId).hashCode() * 31;
            String str = this.displayName;
            int i = 0;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.phoneNumber;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.contactRawId;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.lastUpdatedTime;
            if (str4 != null) {
                i = str4.hashCode();
            }
            int i2 = (hashCode4 + i) * 31;
            boolean z = this.isEmpty;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final String getMaxId() {
        return this.maxId;
    }

    @Nullable
    public final String getMinId() {
        return this.minId;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RVOpenAuthHelper(boolean z, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final List<onUserAuthClick> getNotifications() {
        return this.notifications;
    }

    public RVOpenAuthHelper(boolean z, @Nullable String str, @Nullable String str2, @NotNull List<onUserAuthClick> list) {
        Intrinsics.checkNotNullParameter(list, "notifications");
        this.hasMore = z;
        this.maxId = str;
        this.minId = str2;
        this.notifications = list;
    }
}
