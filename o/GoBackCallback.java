package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import id.dana.domain.nearbyme.model.MerchantStatusEnum;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Render;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001BG\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003JP\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0012\u0010\u001f\u001a\u00020 *\u00020\u00002\u0006\u0010!\u001a\u00020\"R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006#"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantConsultResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "shopInfos", "", "Lid/dana/data/nearbyme/model/ShopEntity;", "hasMore", "", "positiveTags", "Lid/dana/data/nearbyme/model/TagEntity;", "negativeSentiments", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)V", "getHasMore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNegativeSentiments", "()Ljava/util/List;", "getPositiveTags", "getShopInfos", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantConsultResult;", "equals", "other", "", "hashCode", "", "toString", "", "toMerchantConsult", "Lid/dana/domain/nearbyme/model/MerchantConsult;", "nearbyShopsResultMapper", "Lid/dana/data/nearbyme/mapper/NearbyShopsResultMapper;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GoBackCallback extends BaseRpcResult {
    @Nullable
    private final Boolean hasMore;
    @Nullable
    private final List<Render.CaptureRange> negativeSentiments;
    @Nullable
    private final List<Render.CaptureRange> positiveTags;
    @Nullable
    private final List<Render> shopInfos;

    public GoBackCallback() {
        this((List) null, (Boolean) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GoBackCallback copy$default(GoBackCallback goBackCallback, List<Render> list, Boolean bool, List<Render.CaptureRange> list2, List<Render.CaptureRange> list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = goBackCallback.shopInfos;
        }
        if ((i & 2) != 0) {
            bool = goBackCallback.hasMore;
        }
        if ((i & 4) != 0) {
            list2 = goBackCallback.positiveTags;
        }
        if ((i & 8) != 0) {
            list3 = goBackCallback.negativeSentiments;
        }
        return goBackCallback.copy(list, bool, list2, list3);
    }

    @Nullable
    public final List<Render> component1() {
        return this.shopInfos;
    }

    @Nullable
    public final Boolean component2() {
        return this.hasMore;
    }

    @Nullable
    public final List<Render.CaptureRange> component3() {
        return this.positiveTags;
    }

    @Nullable
    public final List<Render.CaptureRange> component4() {
        return this.negativeSentiments;
    }

    @NotNull
    public final GoBackCallback copy(@Nullable List<? extends Render> list, @Nullable Boolean bool, @Nullable List<Render.CaptureRange> list2, @Nullable List<Render.CaptureRange> list3) {
        return new GoBackCallback(list, bool, list2, list3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoBackCallback)) {
            return false;
        }
        GoBackCallback goBackCallback = (GoBackCallback) obj;
        return Intrinsics.areEqual((Object) this.shopInfos, (Object) goBackCallback.shopInfos) && Intrinsics.areEqual((Object) this.hasMore, (Object) goBackCallback.hasMore) && Intrinsics.areEqual((Object) this.positiveTags, (Object) goBackCallback.positiveTags) && Intrinsics.areEqual((Object) this.negativeSentiments, (Object) goBackCallback.negativeSentiments);
    }

    public final int hashCode() {
        List<Render> list = this.shopInfos;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        List<Render.CaptureRange> list2 = this.positiveTags;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Render.CaptureRange> list3 = this.negativeSentiments;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantConsultResult(shopInfos=");
        sb.append(this.shopInfos);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", positiveTags=");
        sb.append(this.positiveTags);
        sb.append(", negativeSentiments=");
        sb.append(this.negativeSentiments);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GoBackCallback(List list, Boolean bool, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3);
    }

    @Nullable
    public final List<Render> getShopInfos() {
        return this.shopInfos;
    }

    @Nullable
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final List<Render.CaptureRange> getPositiveTags() {
        return this.positiveTags;
    }

    @Nullable
    public final List<Render.CaptureRange> getNegativeSentiments() {
        return this.negativeSentiments;
    }

    public GoBackCallback(@Nullable List<? extends Render> list, @Nullable Boolean bool, @Nullable List<Render.CaptureRange> list2, @Nullable List<Render.CaptureRange> list3) {
        this.shopInfos = list;
        this.hasMore = bool;
        this.positiveTags = list2;
        this.negativeSentiments = list3;
    }

    @NotNull
    public final DiskUtil toMerchantConsult(@NotNull GoBackCallback goBackCallback, @NotNull EngineUtils engineUtils) {
        GoBackCallback goBackCallback2 = goBackCallback;
        EngineUtils engineUtils2 = engineUtils;
        Intrinsics.checkNotNullParameter(goBackCallback2, "$this$toMerchantConsult");
        Intrinsics.checkNotNullParameter(engineUtils2, "nearbyShopsResultMapper");
        GriverConfigUtils griverConfigUtils = new GriverConfigUtils((String) null, (String) null, (String) null, (List) null, 0.0d, (Map) null, (String) null, (String) null, false, 0.0d, (String) null, (Map) null, 0.0d, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, 0.0d, (String) null, 0.0d, (String) null, (String) null, (List) null, (MerchantStatusEnum) null, (String) null, (List) null, false, (String) null, (Long) null, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
        List<GriverConfigUtils> transform = engineUtils2.transform(goBackCallback2.shopInfos);
        if (transform == null) {
            transform = CollectionsKt.emptyList();
        }
        List<GriverConfigUtils> list = transform;
        Boolean bool = goBackCallback2.hasMore;
        return new DiskUtil(griverConfigUtils, list, bool != null ? bool.booleanValue() : false, getRenderBridge.toTag(goBackCallback2.positiveTags), getRenderBridge.toTag(goBackCallback2.negativeSentiments));
    }
}
