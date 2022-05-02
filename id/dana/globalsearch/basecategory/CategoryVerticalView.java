package id.dana.globalsearch.basecategory;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.globalsearch.model.SearchResultModel;
import id.dana.globalsearch.view.widget.CategoryHeaderView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u001c\u0010\u0011\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u000fJ\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016¨\u0006\u001c"}, d2 = {"Lid/dana/globalsearch/basecategory/CategoryVerticalView;", "Lid/dana/globalsearch/basecategory/BaseCategoryGlobalSearchView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "getCategoryHeaderView", "Lid/dana/globalsearch/view/widget/CategoryHeaderView;", "getLayout", "hideLoadMoreShimmer", "", "hideSearchResult", "setItemClickCallback", "onItemClickCallback", "Lkotlin/Function1;", "setLoadMoreCallback", "onLoadMore", "Lkotlin/Function0;", "showLoadMoreShimmer", "showSearchResult", "searchResult", "Lid/dana/globalsearch/model/SearchResultModel;", "showSection", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class CategoryVerticalView extends BaseCategoryGlobalSearchView {
    private HashMap length;

    @JvmOverloads
    public CategoryVerticalView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public CategoryVerticalView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.length == null) {
            this.length = new HashMap();
        }
        View view = (View) this.length.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.length.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_category_vertical;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryVerticalView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CategoryVerticalView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public CategoryVerticalView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void showSearchResult(@NotNull SearchResultModel searchResultModel) {
        Intrinsics.checkNotNullParameter(searchResultModel, "searchResult");
        showSection();
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.setLogo);
        if (_$_findCachedViewById != null) {
            Intrinsics.checkNotNullParameter(_$_findCachedViewById, "<this>");
            _$_findCachedViewById.setVisibility(8);
        }
        SearchResultVerticalView searchResultVerticalView = (SearchResultVerticalView) _$_findCachedViewById(resetInternal.setMax.setDropDownVerticalOffset);
        if (searchResultVerticalView != null) {
            View view = searchResultVerticalView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
        SearchResultVerticalView searchResultVerticalView2 = (SearchResultVerticalView) _$_findCachedViewById(resetInternal.setMax.setDropDownVerticalOffset);
        if (searchResultVerticalView2 != null) {
            searchResultVerticalView2.setData(getLimitedItems(searchResultModel), searchResultModel.getShouldLoadMore());
        }
        SearchResultVerticalView searchResultVerticalView3 = (SearchResultVerticalView) _$_findCachedViewById(resetInternal.setMax.setDropDownVerticalOffset);
        if (searchResultVerticalView3 != null) {
            searchResultVerticalView3.setOverScrollMode(searchResultModel.getShouldLoadMore());
        }
    }

    public final void showSection() {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.missCount);
        if (linearLayout != null) {
            View view = linearLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
    }

    public final void setLoadMoreCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "onLoadMore");
        SearchResultVerticalView searchResultVerticalView = (SearchResultVerticalView) _$_findCachedViewById(resetInternal.setMax.setDropDownVerticalOffset);
        if (searchResultVerticalView != null) {
            searchResultVerticalView.setLoadMoreCallback(function0);
        }
    }

    public final void setItemClickCallback(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onItemClickCallback");
        SearchResultVerticalView searchResultVerticalView = (SearchResultVerticalView) _$_findCachedViewById(resetInternal.setMax.setDropDownVerticalOffset);
        if (searchResultVerticalView != null) {
            searchResultVerticalView.setItemClickCallback(function1);
        }
    }

    public final void hideSearchResult() {
        SearchResultVerticalView searchResultVerticalView = (SearchResultVerticalView) _$_findCachedViewById(resetInternal.setMax.setDropDownVerticalOffset);
        if (searchResultVerticalView != null) {
            View view = searchResultVerticalView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(8);
        }
    }

    @Nullable
    public final CategoryHeaderView getCategoryHeaderView() {
        return (CategoryHeaderView) _$_findCachedViewById(resetInternal.setMax.onRepeatModeChanged);
    }

    public final void showLoadMoreShimmer() {
        SearchResultVerticalView searchResultVerticalView = (SearchResultVerticalView) _$_findCachedViewById(resetInternal.setMax.setDropDownVerticalOffset);
        if (searchResultVerticalView != null) {
            searchResultVerticalView.showShimmer();
        }
    }

    public final void hideLoadMoreShimmer() {
        SearchResultVerticalView searchResultVerticalView = (SearchResultVerticalView) _$_findCachedViewById(resetInternal.setMax.setDropDownVerticalOffset);
        if (searchResultVerticalView != null) {
            searchResultVerticalView.hideShimmer();
        }
    }
}
