package id.dana.richview.servicescard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.contract.services.ServiceCategoryModule;
import id.dana.richview.category.CategoryView;
import id.dana.richview.category.model.CategoryModel;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BindDimen;
import o.PrepareException;
import o.onDelete;
import o.setParseContext;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nJ\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0014\u0010\u0019\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lid/dana/richview/servicescard/ServiceCategoryView;", "Lid/dana/richview/category/CategoryView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "", "isFavoriteCategoryOnHide", "()Z", "serviceCategoryPresenter", "Lid/dana/contract/services/ServiceCategoryContract$Presenter;", "getServiceCategoryPresenter", "()Lid/dana/contract/services/ServiceCategoryContract$Presenter;", "setServiceCategoryPresenter", "(Lid/dana/contract/services/ServiceCategoryContract$Presenter;)V", "hideFavoriteCategory", "", "onHide", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "onlyGetIncludedCategories", "includedCategories", "", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ServiceCategoryView extends CategoryView {
    @Inject
    public BindDimen.setMax serviceCategoryPresenter;
    private HashMap setMax;
    /* access modifiers changed from: private */
    public boolean setMin;

    @JvmOverloads
    public ServiceCategoryView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public ServiceCategoryView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServiceCategoryView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ServiceCategoryView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final boolean isFavoriteCategoryOnHide() {
        return this.setMin;
    }

    @NotNull
    public final BindDimen.setMax getServiceCategoryPresenter() {
        BindDimen.setMax setmax = this.serviceCategoryPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceCategoryPresenter");
        }
        return setmax;
    }

    public final void setServiceCategoryPresenter(@NotNull BindDimen.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        this.serviceCategoryPresenter = setmax;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\b"}, d2 = {"id/dana/richview/servicescard/ServiceCategoryView$injectComponent$1", "Lid/dana/contract/services/ServiceCategoryContract$View;", "onSuccessGetCategories", "", "categories", "", "Lid/dana/richview/category/model/CategoryModel;", "onSuccessOnlyGetIncludedCategories", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements BindDimen.setMin {
        final /* synthetic */ ServiceCategoryView getMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMax(ServiceCategoryView serviceCategoryView) {
            this.getMax = serviceCategoryView;
        }

        public final void setMin(@NotNull List<CategoryModel> list) {
            Intrinsics.checkNotNullParameter(list, "categories");
            ServiceCategoryView serviceCategoryView = this.getMax;
            serviceCategoryView.setData(list, serviceCategoryView.isFavoriteCategoryOnHide());
        }
    }

    public final void onlyGetIncludedCategories(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "includedCategories");
        BindDimen.setMax setmax = this.serviceCategoryPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceCategoryPresenter");
        }
        setmax.setMax(list);
    }

    public final void hideFavoriteCategory(boolean z) {
        if (this.setMin != z) {
            this.setMin = z;
        }
    }

    public final void injectComponent(@NotNull PrepareException.AnonymousClass1 r4) {
        Intrinsics.checkNotNullParameter(r4, "applicationComponent");
        setParseContext.length length = new setParseContext.length((byte) 0);
        if (r4 != null) {
            length.getMax = r4;
            length.setMin = new ServiceCategoryModule(new getMax(this));
            stopIgnoring.setMin(length.setMin, ServiceCategoryModule.class);
            stopIgnoring.setMin(length.getMax, PrepareException.AnonymousClass1.class);
            new setParseContext(length.setMin, length.getMax, (byte) 0).getMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            BindDimen.setMax setmax = this.serviceCategoryPresenter;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("serviceCategoryPresenter");
            }
            getminArr[0] = setmax;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }
}
