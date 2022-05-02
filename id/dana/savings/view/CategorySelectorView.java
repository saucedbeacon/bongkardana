package id.dana.savings.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.savings.model.SavingCategoryModel;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.IComponent;
import o.SlidingPaneLayout;
import o.notifyInfo;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0012\u0010\u001a\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\u0006\u0010\u001e\u001a\u00020\u0015J\b\u0010\u001f\u001a\u00020 H\u0002J\u0012\u0010!\u001a\u00020 2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0006\u0010\"\u001a\u00020 J\u0014\u0010#\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0%J\b\u0010&\u001a\u00020 H\u0016J\b\u0010'\u001a\u00020 H\u0002J\u001e\u0010(\u001a\u00020 *\u0004\u0018\u00010)2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0015H\u0002R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006+"}, d2 = {"Lid/dana/savings/view/CategorySelectorView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "categoryAdapter", "Lid/dana/savings/adapter/CategoryAdapter;", "categorySavingSelectedSubject", "Lio/reactivex/subjects/PublishSubject;", "", "getCategorySavingSelectedSubject", "()Lio/reactivex/subjects/PublishSubject;", "setCategorySavingSelectedSubject", "(Lio/reactivex/subjects/PublishSubject;)V", "currentCategory", "", "getCurrentCategory", "()Ljava/lang/String;", "setCurrentCategory", "(Ljava/lang/String;)V", "checkCategoryCode", "category", "Lid/dana/savings/model/SavingCategoryModel;", "getLayout", "getSelectedCategoryCode", "listenCategoryChange", "", "onCategorySelected", "selectCurrentCategory", "setCategories", "categories", "", "setup", "setupRecyclerView", "attachImage", "Landroid/widget/ImageView;", "url", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class CategorySelectorView extends BaseRichView {
    public IComponent<Boolean> categorySavingSelectedSubject;
    private notifyInfo getMin;
    private HashMap length;
    @NotNull
    private String setMax;

    @JvmOverloads
    public CategorySelectorView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public CategorySelectorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
        return R.layout.view_category_selector;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lid/dana/savings/model/SavingCategoryModel;", "Lkotlin/ParameterName;", "name", "category", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class setMin extends FunctionReferenceImpl implements Function1<SavingCategoryModel, Unit> {
        setMin(CategorySelectorView categorySelectorView) {
            super(1, categorySelectorView, CategorySelectorView.class, "onCategorySelected", "onCategorySelected(Lid/dana/savings/model/SavingCategoryModel;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SavingCategoryModel) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable SavingCategoryModel savingCategoryModel) {
            CategorySelectorView.access$onCategorySelected((CategorySelectorView) this.receiver, savingCategoryModel);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategorySelectorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CategorySelectorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = "";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public CategorySelectorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = "";
    }

    @NotNull
    public final IComponent<Boolean> getCategorySavingSelectedSubject() {
        IComponent<Boolean> iComponent = this.categorySavingSelectedSubject;
        if (iComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categorySavingSelectedSubject");
        }
        return iComponent;
    }

    public final void setCategorySavingSelectedSubject(@NotNull IComponent<Boolean> iComponent) {
        Intrinsics.checkNotNullParameter(iComponent, "<set-?>");
        this.categorySavingSelectedSubject = iComponent;
    }

    @NotNull
    public final String getCurrentCategory() {
        return this.setMax;
    }

    public final void setCurrentCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.setMax = str;
    }

    public final void setCategories(@NotNull List<SavingCategoryModel> list) {
        Intrinsics.checkNotNullParameter(list, "categories");
        notifyInfo notifyinfo = this.getMin;
        if (notifyinfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryAdapter");
        }
        notifyinfo.getMin(list);
    }

    private final boolean length(SavingCategoryModel savingCategoryModel) {
        String str;
        String str2 = this.setMax;
        if (savingCategoryModel != null) {
            str = savingCategoryModel.setMin;
        } else {
            str = null;
        }
        return !Intrinsics.areEqual((Object) str2, (Object) str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: id.dana.savings.model.SavingCategoryModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: id.dana.savings.model.SavingCategoryModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: id.dana.savings.model.SavingCategoryModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: id.dana.savings.model.SavingCategoryModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: id.dana.savings.model.SavingCategoryModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void selectCurrentCategory() {
        /*
            r6 = this;
            java.lang.String r0 = r6.setMax
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            if (r0 == 0) goto L_0x0010
            return
        L_0x0010:
            o.notifyInfo r0 = r6.getMin
            java.lang.String r1 = "categoryAdapter"
            if (r0 != 0) goto L_0x0019
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0019:
            o.notifyInfo r2 = r6.getMin
            if (r2 != 0) goto L_0x0020
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0020:
            java.lang.String r1 = r6.setMax
            java.lang.String r3 = "categoryCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.util.List r2 = r2.getMax()
            r3 = 0
            if (r2 == 0) goto L_0x004c
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0034:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x004a
            java.lang.Object r4 = r2.next()
            r5 = r4
            id.dana.savings.model.SavingCategoryModel r5 = (id.dana.savings.model.SavingCategoryModel) r5
            java.lang.String r5 = r5.setMin
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r1)
            if (r5 == 0) goto L_0x0034
            r3 = r4
        L_0x004a:
            id.dana.savings.model.SavingCategoryModel r3 = (id.dana.savings.model.SavingCategoryModel) r3
        L_0x004c:
            if (r3 == 0) goto L_0x0059
            kotlin.jvm.functions.Function1<? super id.dana.savings.model.SavingCategoryModel, kotlin.Unit> r1 = r0.setMin
            r1.invoke(r3)
            r0.length = r3
            r0.notifyDataSetChanged()
            return
        L_0x0059:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type id.dana.savings.model.SavingCategoryModel"
            r0.<init>(r1)
            goto L_0x0062
        L_0x0061:
            throw r0
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.savings.view.CategorySelectorView.selectCurrentCategory():void");
    }

    @NotNull
    public final String getSelectedCategoryCode() {
        notifyInfo notifyinfo = this.getMin;
        if (notifyinfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryAdapter");
        }
        SavingCategoryModel savingCategoryModel = notifyinfo.length;
        String str = savingCategoryModel != null ? savingCategoryModel.setMin : null;
        return str == null ? "" : str;
    }

    public final void setup() {
        IComponent<Boolean> max = IComponent.setMax();
        Intrinsics.checkNotNullExpressionValue(max, "PublishSubject.create()");
        this.categorySavingSelectedSubject = max;
        if (max == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categorySavingSelectedSubject");
        }
        max.onNext(Boolean.FALSE);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.onInitializeAccessibilityNodeInfo);
        if (recyclerView != null) {
            notifyInfo notifyinfo = new notifyInfo();
            recyclerView.setAdapter(notifyinfo);
            Function1<? super SavingCategoryModel, Unit> setmin = new setMin(this);
            Intrinsics.checkNotNullParameter(setmin, "<set-?>");
            notifyinfo.setMin = setmin;
            Unit unit = Unit.INSTANCE;
            this.getMin = notifyinfo;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.addItemDecoration(new SlidingPaneLayout.SavedState(16));
        }
    }

    public static final /* synthetic */ void access$onCategorySelected(CategorySelectorView categorySelectorView, SavingCategoryModel savingCategoryModel) {
        IComponent<Boolean> iComponent = categorySelectorView.categorySavingSelectedSubject;
        if (iComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categorySavingSelectedSubject");
        }
        iComponent.onNext(Boolean.valueOf(categorySelectorView.length(savingCategoryModel)));
    }
}
