package id.dana.globalsearch.basecategory;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.globalsearch.model.PaySearchInfoModel;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverInitializeCallback;
import o.Ignore;
import o.IntRange;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import o.setShadowResourceRight;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 $2\u00020\u0001:\u0001$B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u0006\u0010\u0016\u001a\u00020\u000fJ\u001c\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0014\u001a\u00020\fJ\u001a\u0010\u001b\u001a\u00020\u000f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0014\u0010\u001c\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011J\u000e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\fJ\b\u0010\u001f\u001a\u00020\u000fH\u0016J\b\u0010 \u001a\u00020\u000fH\u0002J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0002J\u0006\u0010#\u001a\u00020\u000fR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lid/dana/globalsearch/basecategory/SearchResultVerticalView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "loading", "", "onItemClickCallback", "Lkotlin/Function1;", "", "onLoadMore", "Lkotlin/Function0;", "searchResultAdapter", "Lid/dana/globalsearch/basecategory/adapter/SearchResultItemAdapter;", "shouldLoadMore", "getLayout", "hideShimmer", "setData", "items", "", "Lid/dana/globalsearch/model/PaySearchInfoModel;", "setItemClickCallback", "setLoadMoreCallback", "setOverScrollMode", "isScrollable", "setup", "setupAdapter", "totalItemCount", "lastVisibleItemPosition", "showShimmer", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SearchResultVerticalView extends BaseRichView {
    @NotNull
    public static final length Companion = new length((byte) 0);
    /* access modifiers changed from: private */
    public Function0<Unit> getMax;
    private GriverInitializeCallback getMin;
    private boolean length;
    /* access modifiers changed from: private */
    public boolean setMax;
    /* access modifiers changed from: private */
    public Function1<? super Integer, Unit> setMin;
    private HashMap toFloatRange;

    @JvmOverloads
    public SearchResultVerticalView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public SearchResultVerticalView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toFloatRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.toFloatRange == null) {
            this.toFloatRange = new HashMap();
        }
        View view = (View) this.toFloatRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toFloatRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_service;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchResultVerticalView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchResultVerticalView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public SearchResultVerticalView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "onItemClick", "id/dana/globalsearch/basecategory/SearchResultVerticalView$setupAdapter$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements Ignore.setMin {
        final /* synthetic */ SearchResultVerticalView setMax;

        setMin(SearchResultVerticalView searchResultVerticalView) {
            this.setMax = searchResultVerticalView;
        }

        public final void length(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-1350492533, oncanceled);
                onCancelLoad.getMin(-1350492533, oncanceled);
            }
            Function1 access$getOnItemClickCallback$p = this.setMax.setMin;
            if (access$getOnItemClickCallback$p != null) {
                access$getOnItemClickCallback$p.invoke(Integer.valueOf(i));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"id/dana/globalsearch/basecategory/SearchResultVerticalView$setupAdapter$2$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends RecyclerView.toIntRange {
        final /* synthetic */ RecyclerView getMin;
        final /* synthetic */ SearchResultVerticalView setMin;

        getMax(RecyclerView recyclerView, SearchResultVerticalView searchResultVerticalView) {
            this.getMin = recyclerView;
            this.setMin = searchResultVerticalView;
        }

        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            RecyclerView.IsOverlapping layoutManager = this.getMin.getLayoutManager();
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (this.setMin.length(linearLayoutManager.getItemCount(), linearLayoutManager.findLastVisibleItemPosition())) {
                    Function0 access$getOnLoadMore$p = this.setMin.getMax;
                    if (access$getOnLoadMore$p != null) {
                        access$getOnLoadMore$p.invoke();
                    }
                    this.setMin.setMax = true;
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
    }

    /* access modifiers changed from: private */
    public final boolean length(int i, int i2) {
        return !this.setMax && (i <= i2 + 3);
    }

    public final void setData(@NotNull List<PaySearchInfoModel> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.length = z;
        if (z) {
            GriverInitializeCallback griverInitializeCallback = this.getMin;
            if (griverInitializeCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchResultAdapter");
            }
            GriverInitializeCallback griverInitializeCallback2 = this.getMin;
            if (griverInitializeCallback2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchResultAdapter");
            }
            griverInitializeCallback.setMax(griverInitializeCallback2.getItemCount(), list);
        } else {
            GriverInitializeCallback griverInitializeCallback3 = this.getMin;
            if (griverInitializeCallback3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchResultAdapter");
            }
            griverInitializeCallback3.getMin(list);
        }
        this.setMax = false;
    }

    public final void setLoadMoreCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "onLoadMore");
        this.getMax = function0;
    }

    public final void setItemClickCallback(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onItemClickCallback");
        this.setMin = function1;
    }

    public final void setOverScrollMode(boolean z) {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setExpandActivityOverflowButtonDrawable);
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(z ? 0 : 2);
        }
    }

    public final void showShimmer() {
        if (this.length && !this.setMax) {
            GriverInitializeCallback griverInitializeCallback = this.getMin;
            if (griverInitializeCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchResultAdapter");
            }
            griverInitializeCallback.setMax(griverInitializeCallback.getItemCount(), CollectionsKt.mutableListOf(GriverInitializeCallback.setMax(), GriverInitializeCallback.setMax()));
        }
    }

    public final void hideShimmer() {
        if (this.length && this.setMax) {
            GriverInitializeCallback griverInitializeCallback = this.getMin;
            if (griverInitializeCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchResultAdapter");
            }
            griverInitializeCallback.getMax(griverInitializeCallback.getItemCount() - 1);
            griverInitializeCallback.getMax(griverInitializeCallback.getItemCount() - 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/globalsearch/basecategory/SearchResultVerticalView$Companion;", "", "()V", "LOAD_MORE_THRESHOLD", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public final void setup() {
        GriverInitializeCallback griverInitializeCallback = new GriverInitializeCallback();
        griverInitializeCallback.getMax((Ignore.setMin) new setMin(this));
        Unit unit = Unit.INSTANCE;
        this.getMin = griverInitializeCallback;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setExpandActivityOverflowButtonDrawable);
        if (recyclerView != null) {
            GriverInitializeCallback griverInitializeCallback2 = this.getMin;
            if (griverInitializeCallback2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchResultAdapter");
            }
            recyclerView.setAdapter(griverInitializeCallback2);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.addItemDecoration(new setShadowResourceRight(recyclerView.getContext(), IntRange.setMax(recyclerView.getContext(), R.color.f20352131099947), (float) ((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f)), (byte) 0));
            recyclerView.addOnScrollListener(new getMax(recyclerView, this));
        }
    }
}
