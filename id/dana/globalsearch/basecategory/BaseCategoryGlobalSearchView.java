package id.dana.globalsearch.basecategory;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.globalsearch.model.PaySearchInfoModel;
import id.dana.globalsearch.model.SearchResultModel;
import id.dana.globalsearch.view.widget.CategoryHeaderView;
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
import kotlin.jvm.internal.Lambda;
import o.WheelView;
import o.getLeftSelectedOption;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001b\u001a\u00020\u0011H&J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001a\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u000eJ,\u0010!\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\"\u001a\u00020\f2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002J\u000e\u0010$\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u000eJ\u001c\u0010%\u001a\u00020\u00112\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110'H&J\u0016\u0010(\u001a\u00020\u00112\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&J\u0014\u0010*\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\b\u0010+\u001a\u00020\u0011H\u0016J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H&J\b\u0010-\u001a\u00020\u0011H&R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lid/dana/globalsearch/basecategory/BaseCategoryGlobalSearchView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "headerHasSeeAll", "", "headerName", "", "isSeeAllClickListener", "Lkotlin/Function0;", "", "getCategoryHeaderView", "Lid/dana/globalsearch/view/widget/CategoryHeaderView;", "getLimitedItems", "", "Lid/dana/globalsearch/model/PaySearchInfoModel;", "searchResult", "Lid/dana/globalsearch/model/SearchResultModel;", "getPermissionLocationView", "Landroid/view/View;", "hideSearchResult", "isNeedToShowSeeAll", "parseAttrs", "setData", "setDataSeeAll", "category", "setHeader", "hasSeeAll", "isSeeAllClicked", "setHeaderSeeAll", "setItemClickCallback", "onItemClickCallback", "Lkotlin/Function1;", "setLoadMoreCallback", "onLoadMore", "setSeeAllClickListener", "setup", "showSearchResult", "showSection", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class BaseCategoryGlobalSearchView extends BaseRichView {
    /* access modifiers changed from: private */
    public Function0<Unit> getMax;
    private HashMap getMin;
    private boolean length;
    private String setMin;

    @JvmOverloads
    public BaseCategoryGlobalSearchView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public BaseCategoryGlobalSearchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Nullable
    public abstract CategoryHeaderView getCategoryHeaderView();

    public abstract void hideSearchResult();

    public abstract void setItemClickCallback(@NotNull Function1<? super Integer, Unit> function1);

    public abstract void setLoadMoreCallback(@NotNull Function0<Unit> function0);

    public abstract void showSearchResult(@NotNull SearchResultModel searchResultModel);

    public abstract void showSection();

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseCategoryGlobalSearchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseCategoryGlobalSearchView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public BaseCategoryGlobalSearchView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @Nullable
    public final View getPermissionLocationView() {
        return findViewById(R.id.f57832131364362);
    }

    public void setup() {
        setHeader$default(this, this.setMin, this.length, (Function0) null, 4, (Object) null);
    }

    public void parseAttrs(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.getInterfaceDescriptor);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ble.CategoryVerticalView)");
            try {
                this.setMin = obtainStyledAttributes.getString(1);
                this.length = obtainStyledAttributes.getBoolean(0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "invoke", "id/dana/globalsearch/basecategory/BaseCategoryGlobalSearchView$setHeader$1$1$2", "id/dana/globalsearch/basecategory/BaseCategoryGlobalSearchView$$special$$inlined$apply$lambda$1"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $hasSeeAll$inlined;
        final /* synthetic */ Function0 $isSeeAllClicked$inlined;
        final /* synthetic */ String $it$inlined;
        final /* synthetic */ BaseCategoryGlobalSearchView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(String str, BaseCategoryGlobalSearchView baseCategoryGlobalSearchView, Function0 function0, boolean z) {
            super(0);
            this.$it$inlined = str;
            this.this$0 = baseCategoryGlobalSearchView;
            this.$isSeeAllClicked$inlined = function0;
            this.$hasSeeAll$inlined = z;
        }

        public final void invoke() {
            Function0 access$isSeeAllClickListener$p = this.this$0.getMax;
            if (access$isSeeAllClickListener$p != null) {
                access$isSeeAllClickListener$p.invoke();
            }
        }
    }

    public final void setSeeAllClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "isSeeAllClickListener");
        this.getMax = function0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setHeaderSeeAll(@org.jetbrains.annotations.NotNull java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "category"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.hashCode()
            r1 = -1592831339(0xffffffffa10f5295, float:-4.855958E-19)
            if (r0 == r1) goto L_0x0040
            r1 = -667013580(0xffffffffd83e2e34, float:-8.364226E14)
            if (r0 == r1) goto L_0x002c
            r1 = 2178(0x882, float:3.052E-42)
            if (r0 == r1) goto L_0x0018
            goto L_0x0054
        L_0x0018:
            java.lang.String r0 = "DF"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0054
            android.content.res.Resources r4 = r3.getResources()
            r0 = 2131886863(0x7f12030f, float:1.9408317E38)
            java.lang.String r4 = r4.getString(r0)
            goto L_0x005f
        L_0x002c:
            java.lang.String r0 = "ONLINE_MERCHANT"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0054
            android.content.res.Resources r4 = r3.getResources()
            r0 = 2131888221(0x7f12085d, float:1.9411071E38)
            java.lang.String r4 = r4.getString(r0)
            goto L_0x005f
        L_0x0040:
            java.lang.String r0 = "SERVICE"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0054
            android.content.res.Resources r4 = r3.getResources()
            r0 = 2131888878(0x7f120aee, float:1.9412404E38)
            java.lang.String r4 = r4.getString(r0)
            goto L_0x005f
        L_0x0054:
            android.content.res.Resources r4 = r3.getResources()
            r0 = 2131888158(0x7f12081e, float:1.9410943E38)
            java.lang.String r4 = r4.getString(r0)
        L_0x005f:
            java.lang.String r0 = "when (category) {\n      …erchants_title)\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            id.dana.globalsearch.view.widget.CategoryHeaderView r0 = r3.getCategoryHeaderView()
            if (r0 == 0) goto L_0x0073
            r0.setCategoryName(r4)
            r4 = 0
            r1 = 2
            r2 = 0
            id.dana.globalsearch.view.widget.CategoryHeaderView.setHasSeeAll$default(r0, r4, r2, r1, r2)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.globalsearch.basecategory.BaseCategoryGlobalSearchView.setHeaderSeeAll(java.lang.String):void");
    }

    public final void setDataSeeAll(@NotNull SearchResultModel searchResultModel, @NotNull String str) {
        Intrinsics.checkNotNullParameter(searchResultModel, "searchResult");
        Intrinsics.checkNotNullParameter(str, "category");
        setHeaderSeeAll(str);
        if (!searchResultModel.getPaySearchInfos().isEmpty()) {
            showSearchResult(searchResultModel);
        }
    }

    public final void setData(@NotNull SearchResultModel searchResultModel) {
        Intrinsics.checkNotNullParameter(searchResultModel, "searchResult");
        if (searchResultModel.getPaySearchInfos().isEmpty()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        setHeader$default(this, searchResultModel.getCategoryName(), length(searchResultModel), (Function0) null, 4, (Object) null);
        if (!searchResultModel.getRequiresLocationPermission() || (getLeftSelectedOption.getMax(getContext(), "android.permission.ACCESS_FINE_LOCATION") && WheelView.ScrollerTask.length(getContext()))) {
            showSearchResult(searchResultModel);
            return;
        }
        showSection();
        hideSearchResult();
        CategoryHeaderView categoryHeaderView = getCategoryHeaderView();
        if (categoryHeaderView != null) {
            CategoryHeaderView.setHasSeeAll$default(categoryHeaderView, false, (Function0) null, 2, (Object) null);
        }
        View permissionLocationView = getPermissionLocationView();
        if (permissionLocationView != null) {
            Intrinsics.checkNotNullParameter(permissionLocationView, "<this>");
            permissionLocationView.setVisibility(0);
        }
    }

    private static boolean length(SearchResultModel searchResultModel) {
        return searchResultModel.getHasSeeAll() && searchResultModel.getLimitList() > 0 && searchResultModel.getPaySearchInfos().size() > searchResultModel.getLimitList();
    }

    @NotNull
    public final List<PaySearchInfoModel> getLimitedItems(@NotNull SearchResultModel searchResultModel) {
        Intrinsics.checkNotNullParameter(searchResultModel, "searchResult");
        return searchResultModel.getLimitList() > 0 ? CollectionsKt.take(searchResultModel.getPaySearchInfos(), searchResultModel.getLimitList()) : searchResultModel.getPaySearchInfos();
    }

    static /* synthetic */ void setHeader$default(BaseCategoryGlobalSearchView baseCategoryGlobalSearchView, String str, boolean z, Function0 function0, int i, Object obj) {
        CategoryHeaderView categoryHeaderView;
        if (obj == null) {
            if ((i & 4) != 0) {
                function0 = null;
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                str = baseCategoryGlobalSearchView.setMin;
            }
            if (str != null && (categoryHeaderView = baseCategoryGlobalSearchView.getCategoryHeaderView()) != null) {
                categoryHeaderView.setCategoryName(str);
                if (function0 != null) {
                    baseCategoryGlobalSearchView.setSeeAllClickListener(function0);
                }
                categoryHeaderView.setHasSeeAll(z, new length(str, baseCategoryGlobalSearchView, function0, z));
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHeader");
    }
}
