package id.dana.richview.promocenter;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import id.dana.R;
import id.dana.contract.promocenter.PromoCategoryModule;
import id.dana.richview.category.CategoryView;
import id.dana.richview.category.model.CategoryModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import o.BackoffPolicy;
import o.GriverCaptureActivity;
import o.MainResourcePackage;
import o.PrepareException;
import o.interceptConnectSocket;
import o.isLayoutRtlSupport;
import o.stopIgnoring;

public class PromoCategoryView extends CategoryView implements BackoffPolicy.setMax {
    private final Map<String, Boolean> getMax = new HashMap();
    /* access modifiers changed from: private */
    public long getMin;
    private setMin length;
    @Inject
    public BackoffPolicy.length promoCategoryPresenter;
    private interceptConnectSocket setMin;

    public interface setMin {
        void length(CategoryModel categoryModel);

        void setMax();
    }

    public void onError(String str) {
    }

    public PromoCategoryView(@NonNull Context context) {
        super(context);
    }

    public PromoCategoryView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PromoCategoryView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setup() {
        super.setup();
        setBottomDivider(false);
        setOnCategoryScrollListener(new GriverCaptureActivity.AnonymousClass15() {
            public final int setMax() {
                return 4;
            }

            public final void getMax() {
                PromoCategoryView.this.promoCategoryPresenter.setMin(true);
            }

            public final boolean length() {
                if (PromoCategoryView.this.getMin > 0 && !PromoCategoryView.this.isLoading() && PromoCategoryView.this.getMin > 20 && PromoCategoryView.this.getMin > ((long) (PromoCategoryView.this.getItemsSize() - 1))) {
                    return true;
                }
                return false;
            }
        });
        this.promoCategoryPresenter.setMin(false);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        super.injectComponent(r4);
        if (this.setMin == null) {
            MainResourcePackage.MainResourceDownloadCallback.getMax getmax = new MainResourcePackage.MainResourceDownloadCallback.getMax((byte) 0);
            if (r4 != null) {
                getmax.length = r4;
                getmax.setMax = new PromoCategoryModule(this);
                stopIgnoring.setMin(getmax.setMax, PromoCategoryModule.class);
                stopIgnoring.setMin(getmax.length, PrepareException.AnonymousClass1.class);
                this.setMin = new MainResourcePackage.MainResourceDownloadCallback(getmax.setMax, getmax.length, (byte) 0);
            } else {
                throw null;
            }
        }
        this.setMin.getMin(this);
        registerPresenter(this.promoCategoryPresenter);
    }

    public void onSuccessGetCategories(long j, List<CategoryModel> list) {
        this.getMin = j;
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setMin = "promocenter_category_all";
        categoryModel.getMin = getContext().getString(R.string.promo_center_all_promos_category);
        categoryModel.getMax = true;
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        categoryModel.length = arrayList;
        List<isLayoutRtlSupport> min = setMin(list);
        Intrinsics.checkNotNullParameter(min, "<set-?>");
        categoryModel.equals = min;
        categoryModel.toFloatRange = 1;
        list.add(0, categoryModel);
        setData(list);
        setMin setmin = this.length;
        if (setmin != null) {
            setmin.length(categoryModel);
        }
    }

    public void onSuccessLoadMoreCategories(long j, List<CategoryModel> list) {
        this.getMin = j;
        appendData(list);
    }

    public void onFailGetCategories() {
        hide();
        setMin setmin = this.length;
        if (setmin != null) {
            setmin.setMax();
        }
    }

    public void showShimmerView() {
        setLoading(true);
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.toFloatRange = 2;
        appendData(categoryModel);
    }

    public void showProgress() {
        showShimmer();
    }

    public void dismissProgress() {
        hideShimmer();
    }

    public void retryGetCategories() {
        this.promoCategoryPresenter.setMin(false);
    }

    public void setOnGetCategoriesListener(setMin setmin) {
        this.length = setmin;
    }

    private List<isLayoutRtlSupport> setMin(List<CategoryModel> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (CategoryModel min : list) {
                arrayList.addAll(setMin(min));
            }
        }
        return arrayList;
    }

    private List<isLayoutRtlSupport> setMin(CategoryModel categoryModel) {
        ArrayList arrayList = new ArrayList();
        if (!(categoryModel == null || categoryModel.equals == null)) {
            for (isLayoutRtlSupport next : categoryModel.equals) {
                if (this.getMax.get(next.setMin) == null || !this.getMax.get(next.setMin).booleanValue()) {
                    arrayList.add(next);
                    this.getMax.put(next.setMin, Boolean.TRUE);
                }
            }
        }
        return arrayList;
    }

    public void hideShimmerView() {
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.toFloatRange = 2;
        removeItemEquals(categoryModel);
        setLoading(false);
    }
}
