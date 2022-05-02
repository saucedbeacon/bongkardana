package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.reclaimScrapViews;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 &2\u00020\u0001:\u0001&B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JA\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0006\u0010$\u001a\u00020\u0005J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lid/dana/social/model/MyFeedHighlightModel;", "", "state", "Lid/dana/social/state/MyFeedHighlightState;", "hasMore", "", "maxId", "", "loadingNext", "onRefresh", "Lkotlin/Function0;", "", "(Lid/dana/social/state/MyFeedHighlightState;ZLjava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "getHasMore", "()Z", "getLoadingNext", "setLoadingNext", "(Z)V", "getMaxId", "()Ljava/lang/String;", "getOnRefresh", "()Lkotlin/jvm/functions/Function0;", "setOnRefresh", "(Lkotlin/jvm/functions/Function0;)V", "getState", "()Lid/dana/social/state/MyFeedHighlightState;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "shouldLoadNextPage", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class access$1702 {
    @NotNull
    public static final setMax getMin = new setMax((byte) 0);
    private final boolean IsOverlapping;
    @NotNull
    public Function0<Unit> getMax;
    public boolean length;
    @NotNull
    public final String setMax;
    @NotNull
    public final reclaimScrapViews setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access$1702)) {
            return false;
        }
        access$1702 access_1702 = (access$1702) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) access_1702.setMin) && this.IsOverlapping == access_1702.IsOverlapping && Intrinsics.areEqual((Object) this.setMax, (Object) access_1702.setMax) && this.length == access_1702.length && Intrinsics.areEqual((Object) this.getMax, (Object) access_1702.getMax);
    }

    public final int hashCode() {
        reclaimScrapViews reclaimscrapviews = this.setMin;
        int i = 0;
        int hashCode = (reclaimscrapviews != null ? reclaimscrapviews.hashCode() : 0) * 31;
        boolean z = this.IsOverlapping;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.setMax;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z3 = this.length;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode2 + (z2 ? 1 : 0)) * 31;
        Function0<Unit> function0 = this.getMax;
        if (function0 != null) {
            i = function0.hashCode();
        }
        return i3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MyFeedHighlightModel(state=");
        sb.append(this.setMin);
        sb.append(", hasMore=");
        sb.append(this.IsOverlapping);
        sb.append(", maxId=");
        sb.append(this.setMax);
        sb.append(", loadingNext=");
        sb.append(this.length);
        sb.append(", onRefresh=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    private access$1702(@NotNull reclaimScrapViews reclaimscrapviews, boolean z, @NotNull String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(reclaimscrapviews, "state");
        Intrinsics.checkNotNullParameter(str, "maxId");
        Intrinsics.checkNotNullParameter(function0, "onRefresh");
        this.setMin = reclaimscrapviews;
        this.IsOverlapping = z;
        this.setMax = str;
        this.length = false;
        this.getMax = function0;
    }

    public final boolean setMin() {
        return this.IsOverlapping;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ access$1702(reclaimScrapViews reclaimscrapviews, boolean z, String str, Function0 function0, int i) {
        this(reclaimscrapviews, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 16) != 0 ? AnonymousClass5.INSTANCE : function0);
    }

    public final boolean getMax() {
        return this.IsOverlapping && !this.length;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0002¨\u0006\f"}, d2 = {"Lid/dana/social/model/MyFeedHighlightModel$Companion;", "", "()V", "createDisabledHighlight", "", "Lid/dana/social/model/MyFeedHighlightModel;", "fromSocialFeed", "socialFeed", "Lid/dana/domain/social/model/SocialFeed;", "toFeedHighlights", "Lid/dana/social/model/FeedHighlightModel;", "Lid/dana/domain/social/model/ActivityResponse;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }

        public static List<getContextMenuInfo> setMin(List<RssiFilter> list) {
            String str;
            String str2;
            Map map;
            String str3;
            Iterable<RssiFilter> iterable = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (RssiFilter rssiFilter : iterable) {
                String id2 = rssiFilter.getId();
                String str4 = id2 == null ? "" : id2;
                String iconUrl = rssiFilter.getIconUrl();
                if (iconUrl == null) {
                    str = "";
                } else {
                    str = iconUrl;
                }
                String content = rssiFilter.getContent();
                if (content == null) {
                    str2 = "";
                } else {
                    str2 = content;
                }
                boolean read = rssiFilter.getRead();
                Map extendInfo = rssiFilter.getExtendInfo();
                Map map2 = null;
                if (extendInfo != null) {
                    map = new LinkedHashMap();
                    for (Map.Entry entry : extendInfo.entrySet()) {
                        if (entry.getValue() != null) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else {
                    map = null;
                }
                if (map instanceof HashMap) {
                    map2 = map;
                }
                HashMap hashMap = (HashMap) map2;
                HashMap hashMap2 = hashMap == null ? new HashMap() : hashMap;
                String contentType = rssiFilter.getContentType();
                if (contentType == null) {
                    str3 = "";
                } else {
                    str3 = contentType;
                }
                arrayList.add(new getContextMenuInfo(str4, str, str2, read, hashMap2, 0, str3, 32));
            }
            return (List) arrayList;
        }

        @JvmStatic
        @NotNull
        public static List<access$1702> setMin() {
            List<access$1702> arrayList = new ArrayList<>();
            arrayList.add(new access$1702(reclaimScrapViews.getMax.setMin, false, (String) null, (Function0) null, 30));
            return arrayList;
        }
    }
}
