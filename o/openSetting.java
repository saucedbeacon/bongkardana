package o;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.nearbyrevamp.search.searchresult.NearbySearchResultErrorView;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.Ignore;
import o.ProgramSettingExtension;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0014\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0002J)\u0010\u0018\u001a\u00020\u000e2!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u000e0\u001aJ\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0002J\u0006\u0010\"\u001a\u00020\u000eR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lid/dana/nearbyrevamp/search/searchresult/LocationSearchResultFragment;", "Lid/dana/nearbyrevamp/search/searchresult/BaseNearbySearchResultFragment;", "()V", "locationSearchResultAdapter", "Lid/dana/nearbyrevamp/search/adapter/LocationSearchResultAdapter;", "getLocationSearchResultAdapter", "()Lid/dana/nearbyrevamp/search/adapter/LocationSearchResultAdapter;", "locationSearchResultAdapter$delegate", "Lkotlin/Lazy;", "skeletonScreen", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "getLayout", "", "init", "", "onItemClick", "nearbyLocation", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "reset", "setupAdapter", "showData", "nearbyLocations", "", "showEmptyState", "showError", "onTryAgain", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "keyword", "showErrorComponent", "error", "", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class openSetting extends ProgramSettingExtension.AnonymousClass1 {
    private HashMap equals;
    public final Lazy isInside = LazyKt.lazy(setMin.INSTANCE);
    public getInsetDodgeRect setMin;

    public final void equals() {
        HashMap hashMap = this.equals;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final int setMin() {
        return R.layout.fragment_location_search_result;
    }

    public final View setMin(int i) {
        if (this.equals == null) {
            this.equals = new HashMap();
        }
        View view = (View) this.equals.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.equals.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/nearbyrevamp/search/adapter/LocationSearchResultAdapter;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<OpenUserIdBridgeExtension> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(0);
        }

        @NotNull
        public final OpenUserIdBridgeExtension invoke() {
            return new OpenUserIdBridgeExtension();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pos", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements Ignore.setMin {
        final /* synthetic */ openSetting getMin;

        length(openSetting opensetting) {
            this.getMin = opensetting;
        }

        public final void length(int i) {
            openSetting opensetting = this.getMin;
            Object obj = openSetting.length(opensetting).getMax().get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "locationSearchResultAdapter.items[pos]");
            openSetting.getMax(opensetting, (getCreateTime) obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"id/dana/nearbyrevamp/search/searchresult/LocationSearchResultFragment$setupAdapter$2$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends RecyclerView.toIntRange {
        final /* synthetic */ openSetting getMin;

        setMax(openSetting opensetting) {
            this.getMin = opensetting;
        }

        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            setOnWheelViewListener.getMax((Activity) this.getMin.getMax);
        }
    }

    public final void FastBitmap$CoordinateSystem() {
        RecyclerView recyclerView = (RecyclerView) setMin(resetInternal.setMax.setActivityChooserModel);
        if (recyclerView != null) {
            View view = recyclerView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
        NearbySearchResultErrorView nearbySearchResultErrorView = (NearbySearchResultErrorView) setMin(resetInternal.setMax.setMinimumHeight);
        if (nearbySearchResultErrorView != null) {
            View view2 = nearbySearchResultErrorView;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            view2.setVisibility(8);
        }
        getInsetDodgeRect getinsetdodgerect = this.setMin;
        if (getinsetdodgerect != null) {
            getinsetdodgerect.getMin();
            return;
        }
        openSetting opensetting = this;
        opensetting.setMin = containsFavoriteMenuItem.getMin((RecyclerView) opensetting.setMin(resetInternal.setMax.setActivityChooserModel), R.layout.view_shimmer_location_search_result);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class getMax extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function1 $onTryAgain;
        final /* synthetic */ openSetting this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMax(openSetting opensetting, Function1 function1) {
            super(0);
            this.this$0 = opensetting;
            this.$onTryAgain = function1;
        }

        public final void invoke() {
            this.$onTryAgain.invoke(this.this$0.getMin);
        }
    }

    public final void getMax() {
        super.getMax();
        ((OpenUserIdBridgeExtension) this.isInside.getValue()).getMin();
        FastBitmap$CoordinateSystem();
    }

    public final void setMax(boolean z) {
        RecyclerView recyclerView = (RecyclerView) setMin(resetInternal.setMax.setActivityChooserModel);
        int i = 0;
        if (recyclerView != null) {
            View view = recyclerView;
            boolean z2 = !z;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z2 ? 0 : 8);
        }
        NearbySearchResultErrorView nearbySearchResultErrorView = (NearbySearchResultErrorView) setMin(resetInternal.setMax.setMinimumHeight);
        if (nearbySearchResultErrorView != null) {
            View view2 = nearbySearchResultErrorView;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            if (!z) {
                i = 8;
            }
            view2.setVisibility(i);
        }
    }

    public final void setMax() {
        ((OpenUserIdBridgeExtension) this.isInside.getValue()).getMax((Ignore.setMin) new length(this));
        RecyclerView recyclerView = (RecyclerView) setMin(resetInternal.setMax.setActivityChooserModel);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter((OpenUserIdBridgeExtension) this.isInside.getValue());
            recyclerView.addOnScrollListener(new setMax(this));
        }
    }

    public static final /* synthetic */ void getMax(openSetting opensetting, getCreateTime getcreatetime) {
        GriverDefaultOpenSettingExtension griverDefaultOpenSettingExtension = opensetting.setMax;
        if (griverDefaultOpenSettingExtension != null) {
            griverDefaultOpenSettingExtension.getMin(getcreatetime);
        }
    }

    public static final /* synthetic */ OpenUserIdBridgeExtension length(openSetting opensetting) {
        return (OpenUserIdBridgeExtension) opensetting.isInside.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.equals;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
