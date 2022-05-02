package id.dana.explore.popularplaces;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.material.card.MaterialCardView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.nearbyme.OtherStoreListActivity;
import id.dana.nearbyme.enums.SearchType;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.Ignore;
import o.IntRange;
import o.Relation;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getInsetDodgeRect;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import o.rollbackFixBoolean;
import o.safeParseInt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0007H\u0016J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\r\u0010\u001a\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0011J\b\u0010\u001d\u001a\u00020\u0011H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lid/dana/explore/popularplaces/PopularPlacesView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "popularPlacesAdapter", "Lid/dana/explore/popularplaces/adapter/PopularPlacesAdapter;", "skeletonPopularPlaces", "Lcom/ethanhua/skeleton/SkeletonScreen;", "getLayout", "hideShimmer", "", "loadData", "explorePopularPlacesConfigModels", "", "Lid/dana/explore/popularplaces/model/ExplorePopularPlacesConfigModel;", "onItemClicked", "explorePopularPlacesConfigModel", "openOtherStoreListActivity", "setup", "setupRecyclerView", "()Lkotlin/Unit;", "showShimmer", "trackNearbyShopListOpen", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PopularPlacesView extends BaseRichView {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    private HashMap getMax;
    private onDetachedFromLayoutParams getMin;
    private rollbackFixBoolean length;

    @JvmOverloads
    public PopularPlacesView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public PopularPlacesView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMax == null) {
            this.getMax = new HashMap();
        }
        View view = (View) this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_popular_places;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "position", "", "invoke", "id/dana/explore/popularplaces/PopularPlacesView$setupRecyclerView$1$1$1", "id/dana/explore/popularplaces/PopularPlacesView$$special$$inlined$run$lambda$1"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ rollbackFixBoolean $this_run;
        final /* synthetic */ RecyclerView $this_run$inlined;
        final /* synthetic */ PopularPlacesView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(rollbackFixBoolean rollbackfixboolean, RecyclerView recyclerView, PopularPlacesView popularPlacesView) {
            super(1);
            this.$this_run = rollbackfixboolean;
            this.$this_run$inlined = recyclerView;
            this.this$0 = popularPlacesView;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(1555067923, oncanceled);
                onCancelLoad.getMin(1555067923, oncanceled);
            }
            safeParseInt safeparseint = (safeParseInt) this.$this_run.setMin(i);
            if (safeparseint != null) {
                PopularPlacesView.access$onItemClicked(this.this$0, safeparseint);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PopularPlacesView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PopularPlacesView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public PopularPlacesView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void setup() {
        setupRecyclerView();
    }

    public final void showShimmer() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMin;
        if (ondetachedfromlayoutparams == null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax((MaterialCardView) _$_findCachedViewById(resetInternal.setMax.lambda));
            setmax.getMax = R.layout.view_skeleton_popular_places;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 20;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            this.getMin = getinsetdodgerect;
        } else if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.getMin();
        }
    }

    public final void hideShimmer() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMin;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
        this.getMin = null;
    }

    @Nullable
    public final Unit setupRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getTextClassifier);
        if (recyclerView == null) {
            return null;
        }
        rollbackFixBoolean rollbackfixboolean = new rollbackFixBoolean();
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        this.length = rollbackfixboolean;
        recyclerView.setAdapter(rollbackfixboolean);
        rollbackfixboolean.getMax((Ignore.setMin) new Relation(new setMin(rollbackfixboolean, recyclerView, this)));
        return Unit.INSTANCE;
    }

    public final void loadData(@NotNull List<safeParseInt> list) {
        Intrinsics.checkNotNullParameter(list, "explorePopularPlacesConfigModels");
        rollbackFixBoolean rollbackfixboolean = this.length;
        if (rollbackfixboolean != null) {
            rollbackfixboolean.getMin(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/explore/popularplaces/PopularPlacesView$Companion;", "", "()V", "EMPTY_STRING", "", "EXPLORE_PAGE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void access$onItemClicked(PopularPlacesView popularPlacesView, safeParseInt safeparseint) {
        OtherStoreListActivity.length length2 = OtherStoreListActivity.Companion;
        Context context = popularPlacesView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        OtherStoreListActivity.length.getMin(context, safeparseint.getMax, safeparseint.setMax, SearchType.MERCHANTID_SORTED_BY_DISTANCE, "", "Explore Page");
        convertDipToPx.length length3 = new convertDipToPx.length(popularPlacesView.getContext());
        length3.getMax = TrackerKey.Event.NEARBY_SHOP_LIST_OPEN;
        convertDipToPx.length max = length3.setMax("Source", "Explore Page");
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length4 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length4.toArray(new convertSpToPx[length4.size()]));
    }
}
