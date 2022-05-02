package o;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class AppNode implements Callable {
    public static final AppNode getMax = new AppNode();

    public final Object call() {
        return handleMessage.lambda$getAppVersion$0();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ,\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lid/dana/data/config/source/amcs/result/NearbyConfigResult;", "", "trendingKeyword", "", "Lid/dana/data/config/model/NearbyTrendingKeywordEntity;", "nearbyRevamp", "", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getNearbyRevamp", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrendingKeyword", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lid/dana/data/config/source/amcs/result/NearbyConfigResult;", "equals", "other", "hashCode", "", "toNearbyConfig", "Lid/dana/domain/nearbyme/model/NearbyConfig;", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.AppNode$12  reason: invalid class name */
    public final class AnonymousClass12 {
        @SerializedName("nearby_revamp")
        @Nullable
        private final Boolean nearbyRevamp;
        @SerializedName("trending_keyword")
        @Nullable
        private final List<AppManagerImpl> trendingKeyword;

        public AnonymousClass12() {
            this((List) null, (Boolean) null, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ AnonymousClass12 copy$default(AnonymousClass12 r0, List<AppManagerImpl> list, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                list = r0.trendingKeyword;
            }
            if ((i & 2) != 0) {
                bool = r0.nearbyRevamp;
            }
            return r0.copy(list, bool);
        }

        @Nullable
        public final List<AppManagerImpl> component1() {
            return this.trendingKeyword;
        }

        @Nullable
        public final Boolean component2() {
            return this.nearbyRevamp;
        }

        @NotNull
        public final AnonymousClass12 copy(@Nullable List<AppManagerImpl> list, @Nullable Boolean bool) {
            return new AnonymousClass12(list, bool);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass12)) {
                return false;
            }
            AnonymousClass12 r3 = (AnonymousClass12) obj;
            return Intrinsics.areEqual((Object) this.trendingKeyword, (Object) r3.trendingKeyword) && Intrinsics.areEqual((Object) this.nearbyRevamp, (Object) r3.nearbyRevamp);
        }

        public final int hashCode() {
            List<AppManagerImpl> list = this.trendingKeyword;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            Boolean bool = this.nearbyRevamp;
            if (bool != null) {
                i = bool.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("NearbyConfigResult(trendingKeyword=");
            sb.append(this.trendingKeyword);
            sb.append(", nearbyRevamp=");
            sb.append(this.nearbyRevamp);
            sb.append(")");
            return sb.toString();
        }

        public AnonymousClass12(@Nullable List<AppManagerImpl> list, @Nullable Boolean bool) {
            this.trendingKeyword = list;
            this.nearbyRevamp = bool;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass12(List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? Boolean.FALSE : bool);
        }

        @Nullable
        public final List<AppManagerImpl> getTrendingKeyword() {
            return this.trendingKeyword;
        }

        @Nullable
        public final Boolean getNearbyRevamp() {
            return this.nearbyRevamp;
        }

        @NotNull
        public final clearExpired toNearbyConfig() {
            List<AppManagerImpl> list = this.trendingKeyword;
            List<isFolder> min = list != null ? getParam.getMin(list) : null;
            if (min == null) {
                min = CollectionsKt.emptyList();
            }
            Boolean bool = this.nearbyRevamp;
            return new clearExpired(min, bool != null ? bool.booleanValue() : false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/data/config/source/amcs/result/MerchantCategoryContentResult;", "Ljava/io/Serializable;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.AppNode$10  reason: invalid class name */
    public final class AnonymousClass10 implements Serializable {
        @Nullable
        private final String url;

        public AnonymousClass10() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ AnonymousClass10 copy$default(AnonymousClass10 r0, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.url;
            }
            return r0.copy(str);
        }

        @Nullable
        public final String component1() {
            return this.url;
        }

        @NotNull
        public final AnonymousClass10 copy(@Nullable String str) {
            return new AnonymousClass10(str);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof AnonymousClass10) && Intrinsics.areEqual((Object) this.url, (Object) ((AnonymousClass10) obj).url);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.url;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("MerchantCategoryContentResult(url=");
            sb.append(this.url);
            sb.append(")");
            return sb.toString();
        }

        public AnonymousClass10(@Nullable String str) {
            this.url = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass10(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }
    }

    /* renamed from: o.AppNode$2  reason: invalid class name */
    public class AnonymousClass2 {
        public static final String KEY_DATE = "date";
        public static final String KEY_ICON_URL = "iconUrl";
        public static final String KEY_TEXT = "text";
        public static final String KEY_VERSION = "version";
        public static final String KEY_VISIBLE = "visible";
        private String date;
        private String iconUrl;
        private String text;
        private int version;
        private boolean visible;

        public static AnonymousClass2 createDefault() {
            AnonymousClass2 r0 = new AnonymousClass2();
            r0.setText("");
            r0.setVisible(false);
            r0.setVersion(0);
            r0.setDate("");
            r0.setIconUrl("");
            return r0;
        }

        public String getText() {
            return this.text;
        }

        public void setText(String str) {
            this.text = str;
        }

        public boolean isVisible() {
            return this.visible;
        }

        public void setVisible(boolean z) {
            this.visible = z;
        }

        public int getVersion() {
            return this.version;
        }

        public void setVersion(int i) {
            this.version = i;
        }

        public String getDate() {
            return this.date;
        }

        public void setDate(String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(1902582397, oncanceled);
                onCancelLoad.getMin(1902582397, oncanceled);
            }
            this.date = str;
        }

        public String getIconUrl() {
            return this.iconUrl;
        }

        public void setIconUrl(String str) {
            this.iconUrl = str;
        }
    }
}
