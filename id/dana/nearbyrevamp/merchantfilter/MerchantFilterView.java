package id.dana.nearbyrevamp.merchantfilter;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.component.BaseRichView;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.containsFavoriteMenuItem;
import o.g;
import o.getAppIdList;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004*\u0001(\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB)\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\bH\u0016J\r\u0010\u0016\u001a\u00020(H\u0002¢\u0006\u0002\u0010)J\u0006\u0010*\u001a\u00020$J\u001c\u0010+\u001a\u00020$2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0014\u0010,\u001a\u00020$2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020&0.J\b\u0010/\u001a\u00020$H\u0016J\b\u00100\u001a\u00020$H\u0002J\u0006\u00101\u001a\u00020$R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lid/dana/nearbyrevamp/merchantfilter/MerchantFilterView;", "Lid/dana/component/BaseRichView;", "Lid/dana/nearbyme/OnCategoryCheckedListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "", "filterEnabled", "getFilterEnabled", "()Z", "setFilterEnabled", "(Z)V", "merchantCategoryAdapter", "Lid/dana/nearbyrevamp/merchantfilter/NewMerchantCategoryAdapter;", "onCategoryCheckedListener", "getOnCategoryCheckedListener", "()Lid/dana/nearbyme/OnCategoryCheckedListener;", "setOnCategoryCheckedListener", "(Lid/dana/nearbyme/OnCategoryCheckedListener;)V", "preselectedCategoryId", "", "getPreselectedCategoryId", "()Ljava/lang/String;", "setPreselectedCategoryId", "(Ljava/lang/String;)V", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "withDefaultCategory", "checkAndSetFocusSelectedCategory", "", "category", "Lid/dana/nearbyme/model/MerchantCategoryModel;", "getLayout", "id/dana/nearbyrevamp/merchantfilter/MerchantFilterView$getOnCategoryCheckedListener$1", "()Lid/dana/nearbyrevamp/merchantfilter/MerchantFilterView$getOnCategoryCheckedListener$1;", "hideShimmer", "parseAttrs", "setMerchantCategories", "categories", "", "setup", "setupMerchantCategory", "showShimmer", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantFilterView extends BaseRichView implements getAppIdList {
    private boolean getMax;
    @Nullable
    private String getMin;
    /* access modifiers changed from: private */
    public NewMerchantCategoryAdapter isInside;
    private onDetachedFromLayoutParams length;
    @Nullable
    private getAppIdList setMax;
    private boolean setMin;
    private HashMap toIntRange;

    @JvmOverloads
    public MerchantFilterView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MerchantFilterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.toIntRange == null) {
            this.toIntRange = new HashMap();
        }
        View view = (View) this.toIntRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toIntRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_filter;
    }

    @JvmDefault
    public final void length(@NotNull List<g.AnonymousClass1> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "checkedCategories");
    }

    @JvmDefault
    public final void onCategoryClick(@NotNull g.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "selectedCategory");
    }

    @JvmDefault
    public final void onMulitpleCategorySelected(@NotNull List<g.AnonymousClass1> list) {
        Intrinsics.checkNotNullParameter(list, "checkedCategories");
    }

    public static final /* synthetic */ NewMerchantCategoryAdapter access$getMerchantCategoryAdapter$p(MerchantFilterView merchantFilterView) {
        NewMerchantCategoryAdapter newMerchantCategoryAdapter = merchantFilterView.isInside;
        if (newMerchantCategoryAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantCategoryAdapter");
        }
        return newMerchantCategoryAdapter;
    }

    public final boolean getFilterEnabled() {
        return this.getMax;
    }

    public final void setFilterEnabled(boolean z) {
        this.getMax = z;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.dismissPopup);
        if (recyclerView != null) {
            View view = recyclerView;
            boolean z2 = this.getMax;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z2 ? 0 : 8);
        }
    }

    @Nullable
    public final getAppIdList getOnCategoryCheckedListener() {
        return this.setMax;
    }

    public final void setOnCategoryCheckedListener(@Nullable getAppIdList getappidlist) {
        this.setMax = getappidlist;
    }

    @Nullable
    public final String getPreselectedCategoryId() {
        return this.getMin;
    }

    public final void setPreselectedCategoryId(@Nullable String str) {
        this.getMin = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantFilterView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantFilterView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MerchantFilterView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = true;
    }

    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, resetInternal.getMin.setShuffleMode);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "getContext()\n           …eable.MerchantFilterView)");
            try {
                this.setMin = obtainStyledAttributes.getBoolean(0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: o.g$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: o.g$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: o.g$1[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: o.g$1[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: o.g$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: o.g$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: o.g$1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMerchantCategories(@org.jetbrains.annotations.NotNull java.util.List<? extends o.g.AnonymousClass1> r10) {
        /*
            r9 = this;
            java.lang.String r0 = "categories"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r9.hideShimmer()
            id.dana.nearbyrevamp.merchantfilter.NewMerchantCategoryAdapter r1 = r9.isInside
            java.lang.String r2 = "merchantCategoryAdapter"
            if (r1 != 0) goto L_0x0011
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0011:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.Set<o.g$1> r0 = r1.length
            java.util.Collection r0 = (java.util.Collection) r0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0025
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = 0
            goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            if (r0 != 0) goto L_0x0066
            java.util.Set<o.g$1> r0 = r1.length
            o.g$1 r5 = r1.setMin
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x0066
            java.util.Set<o.g$1> r0 = r1.length
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            id.dana.nearbyrevamp.merchantfilter.NewMerchantCategoryAdapter$setMax r5 = new id.dana.nearbyrevamp.merchantfilter.NewMerchantCategoryAdapter$setMax
            r5.<init>(r10)
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            boolean r0 = kotlin.collections.CollectionsKt.removeAll(r0, r5)
            if (r0 == 0) goto L_0x0066
            java.util.Set<o.g$1> r0 = r1.length
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0057
            java.util.Set<o.g$1> r0 = r1.length
            o.g$1 r5 = r1.setMin
            java.lang.String r6 = "defaultItem"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r0.add(r5)
        L_0x0057:
            o.getAppIdList r0 = r1.setMax
            if (r0 == 0) goto L_0x0066
            java.util.Set<o.g$1> r5 = r1.length
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r5 = kotlin.collections.CollectionsKt.toMutableList(r5)
            r0.length(r5, r4)
        L_0x0066:
            r1.getMin(r10)
            java.lang.String r10 = r9.getMin
            if (r10 == 0) goto L_0x010f
            java.util.List r0 = r1.getMax()
            r5 = 0
            if (r0 == 0) goto L_0x0097
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x007a:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0095
            java.lang.Object r6 = r0.next()
            r7 = r6
            o.g$1 r7 = (o.g.AnonymousClass1) r7
            java.lang.String r8 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            java.lang.String r7 = r7.getMax
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r10)
            if (r7 == 0) goto L_0x007a
            r5 = r6
        L_0x0095:
            o.g$1 r5 = (o.g.AnonymousClass1) r5
        L_0x0097:
            if (r5 == 0) goto L_0x010f
            java.lang.String r10 = "merchantCategory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r10)
            r1.getMax((o.g.AnonymousClass1) r5)
            o.g$1[] r0 = new o.g.AnonymousClass1[r4]
            r0[r3] = r5
            java.util.List r0 = kotlin.collections.CollectionsKt.mutableListOf(r0)
            o.getAppIdList r1 = r1.setMax
            if (r1 == 0) goto L_0x00b0
            r1.length(r0, r4)
        L_0x00b0:
            id.dana.nearbyrevamp.merchantfilter.NewMerchantCategoryAdapter r0 = r9.isInside
            if (r0 != 0) goto L_0x00b7
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x00b7:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r10)
            r0.getMax((o.g.AnonymousClass1) r5)
            o.g$1[] r10 = new o.g.AnonymousClass1[r4]
            r10[r3] = r5
            java.util.List r10 = kotlin.collections.CollectionsKt.mutableListOf(r10)
            o.getAppIdList r0 = r0.setMax
            if (r0 == 0) goto L_0x00cc
            r0.length(r10, r4)
        L_0x00cc:
            id.dana.nearbyrevamp.merchantfilter.NewMerchantCategoryAdapter r10 = r9.isInside
            if (r10 != 0) goto L_0x00d3
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x00d3:
            if (r5 == 0) goto L_0x00ff
            java.util.List r0 = r10.getMax()
            if (r0 != 0) goto L_0x00dc
            goto L_0x00ff
        L_0x00dc:
            boolean r0 = r10.setMin()
            if (r0 == 0) goto L_0x00f6
            o.g$1 r0 = r10.setMin
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x00eb
            goto L_0x0100
        L_0x00eb:
            java.util.List r10 = r10.getMax()
            int r10 = r10.indexOf(r5)
            int r3 = r10 + 1
            goto L_0x0100
        L_0x00f6:
            java.util.List r10 = r10.getMax()
            int r3 = r10.indexOf(r5)
            goto L_0x0100
        L_0x00ff:
            r3 = -1
        L_0x0100:
            if (r3 < 0) goto L_0x010f
            int r10 = o.resetInternal.setMax.dismissPopup
            android.view.View r10 = r9._$_findCachedViewById(r10)
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            if (r10 == 0) goto L_0x010f
            r10.smoothScrollToPosition(r3)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyrevamp.merchantfilter.MerchantFilterView.setMerchantCategories(java.util.List):void");
    }

    public final void showShimmer() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.length;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.getMin();
            return;
        }
        MerchantFilterView merchantFilterView = this;
        merchantFilterView.length = containsFavoriteMenuItem.getMin((ConstraintLayout) merchantFilterView._$_findCachedViewById(resetInternal.setMax.play), R.layout.view_merchant_filter_skeleton);
    }

    public final void hideShimmer() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.length;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"id/dana/nearbyrevamp/merchantfilter/MerchantFilterView$getOnCategoryCheckedListener$1", "Lid/dana/nearbyme/OnCategoryCheckedListener;", "onCategoryClick", "", "selectedCategory", "Lid/dana/nearbyme/model/MerchantCategoryModel;", "onMulitpleCategorySelected", "checkedCategories", "", "checked", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements getAppIdList {
        final /* synthetic */ MerchantFilterView setMax;

        @JvmDefault
        public final void onMulitpleCategorySelected(@NotNull List<g.AnonymousClass1> list) {
            Intrinsics.checkNotNullParameter(list, "checkedCategories");
        }

        setMax(MerchantFilterView merchantFilterView) {
            this.setMax = merchantFilterView;
        }

        public final void length(@NotNull List<g.AnonymousClass1> list, boolean z) {
            RecyclerView recyclerView;
            Intrinsics.checkNotNullParameter(list, "checkedCategories");
            g.AnonymousClass1 r0 = MerchantFilterView.access$getMerchantCategoryAdapter$p(this.setMax).setMin;
            Collection collection = MerchantFilterView.access$getMerchantCategoryAdapter$p(this.setMax).length;
            if (!(collection == null || collection.isEmpty()) && MerchantFilterView.access$getMerchantCategoryAdapter$p(this.setMax).length.contains(r0)) {
                RecyclerView recyclerView2 = (RecyclerView) this.setMax._$_findCachedViewById(resetInternal.setMax.dismissPopup);
                if (recyclerView2 != null) {
                    recyclerView2.smoothScrollToPosition(0);
                }
            } else if (z && (recyclerView = (RecyclerView) this.setMax._$_findCachedViewById(resetInternal.setMax.dismissPopup)) != null) {
                recyclerView.smoothScrollToPosition(MerchantFilterView.access$getMerchantCategoryAdapter$p(this.setMax).length.size() - 1);
            }
            getAppIdList onCategoryCheckedListener = this.setMax.getOnCategoryCheckedListener();
            if (onCategoryCheckedListener != null) {
                onCategoryCheckedListener.length(list, z);
            }
        }

        public final void onCategoryClick(@NotNull g.AnonymousClass1 r2) {
            Intrinsics.checkNotNullParameter(r2, "selectedCategory");
            getAppIdList onCategoryCheckedListener = this.setMax.getOnCategoryCheckedListener();
            if (onCategoryCheckedListener != null) {
                onCategoryCheckedListener.onCategoryClick(r2);
            }
        }
    }

    public final void setup() {
        this.isInside = new NewMerchantCategoryAdapter(this.setMin);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.dismissPopup);
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.addItemDecoration(new RecyclerView.getMax() {
                private final int getMin = 8;

                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
                    rect.left = this.getMin;
                    rect.right = this.getMin;
                    rect.bottom = this.getMin;
                }
            });
            NewMerchantCategoryAdapter newMerchantCategoryAdapter = this.isInside;
            if (newMerchantCategoryAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantCategoryAdapter");
            }
            getAppIdList setmax = new setMax(this);
            Intrinsics.checkNotNullParameter(setmax, "onCategoryCheckedListener");
            newMerchantCategoryAdapter.setMax = setmax;
            recyclerView.setAdapter(newMerchantCategoryAdapter);
        }
    }
}
