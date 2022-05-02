package id.dana.richview.category;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.richview.category.model.CategoryModel;
import java.util.ArrayList;
import java.util.List;
import o.IntRange;
import o.convertPicture;
import o.getScrimColor;
import o.onDetachedFromLayoutParams;
import o.savePicture;

public class CategoryView extends BaseRichView {
    private setMin getMax;
    private String getMin;
    private CategoryModel isInside = null;
    private onDetachedFromLayoutParams length;
    @BindView(2131363849)
    LinearLayout llCategory;
    @BindView(2131364500)
    RecyclerView rvCategory;
    private boolean setMax;
    private savePicture setMin;
    @BindView(2131365860)
    View viewDivider;

    public interface setMin {
        void setMin(CategoryModel categoryModel, boolean z);
    }

    public int getLayout() {
        return R.layout.view_category;
    }

    public CategoryView(@NonNull Context context) {
        super(context);
    }

    public CategoryView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CategoryView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void showShimmer() {
        this.setMax = true;
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.length;
        if (ondetachedfromlayoutparams == null) {
            getScrimColor.getMax getmax = new getScrimColor.getMax(this.rvCategory);
            getmax.length = this.setMin;
            getmax.getMax = R.layout.view_skeleton_ellipse_text;
            getmax.IsOverlapping = 1500;
            getmax.getMin = true;
            getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
            getmax.toIntRange = 0;
            getmax.setMin = 6;
            getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
            getscrimcolor.getMin();
            this.length = getscrimcolor;
            return;
        }
        ondetachedfromlayoutparams.getMin();
    }

    public boolean isLoading() {
        return this.setMax;
    }

    public void setLoading(boolean z) {
        this.setMax = z;
    }

    public void setOnCategoryScrollListener(RecyclerView.toIntRange tointrange) {
        RecyclerView recyclerView = this.rvCategory;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(tointrange);
        }
    }

    public void setData(List<CategoryModel> list) {
        if (list != null) {
            hideShimmer();
            this.getMin = list.get(0).setMin;
            this.setMin.getMin(length(list));
            this.setMin.notifyDataSetChanged();
        }
    }

    public void hideShimmer() {
        this.setMax = false;
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.length;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    private static List<CategoryModel> length(List<CategoryModel> list) {
        List<Integer> max = setMax(list);
        if (max.size() > 1) {
            for (int i = 0; i < max.size() - 1; i++) {
                list.get(i).getMax = false;
            }
        }
        return list;
    }

    private static List<Integer> setMax(List<CategoryModel> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    public void setData(List<CategoryModel> list, boolean z) {
        if (!list.isEmpty()) {
            hideShimmer();
            this.getMin = list.get(0).setMin;
            setupChipsCategory(list, z);
        }
    }

    public void setupChipsCategory(List<CategoryModel> list, boolean z) {
        if (z) {
            list.remove(1);
        }
        this.setMin.getMin(length(list));
        this.setMin.notifyDataSetChanged();
    }

    public void appendData(CategoryModel categoryModel) {
        this.setMin.getMax(categoryModel);
    }

    public void appendData(List<CategoryModel> list) {
        this.setMin.length(list);
    }

    public void removeItemEquals(CategoryModel categoryModel) {
        this.setMin.getMin(categoryModel);
    }

    public int getItemsSize() {
        return this.setMin.getMax().size();
    }

    public String getSelectedCategoryId() {
        return this.getMin;
    }

    public void setBottomDivider(boolean z) {
        View view = this.viewDivider;
        if (view != null) {
            view.setVisibility(z ? 0 : 4);
        }
    }

    public void setListener(setMin setmin) {
        this.getMax = setmin;
    }

    public void hide() {
        hideShimmer();
        this.llCategory.setVisibility(8);
    }

    public void show() {
        showShimmer();
        this.llCategory.setVisibility(0);
    }

    public void setCategory(String str) {
        List<CategoryModel> max = this.setMin.getMax();
        if (!TextUtils.isEmpty(str) && !max.isEmpty()) {
            boolean z = false;
            for (CategoryModel categoryModel : max) {
                if (str.equalsIgnoreCase(categoryModel.setMin)) {
                    this.getMin = str;
                    this.isInside = categoryModel;
                    categoryModel.getMax = true;
                    z = true;
                } else {
                    categoryModel.getMax = false;
                }
            }
            if (!z) {
                ((CategoryModel) max.get(0)).getMax = true;
            }
        }
    }

    public boolean isDefaultSelected() {
        return this.getMin == null || setMax() == 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: id.dana.richview.category.model.CategoryModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDefaultSelected(boolean r4) {
        /*
            r3 = this;
            int r0 = r3.setMax()
            o.savePicture r1 = r3.setMin
            java.lang.Object r1 = r1.setMin((int) r0)
            id.dana.richview.category.model.CategoryModel r1 = (id.dana.richview.category.model.CategoryModel) r1
            r2 = 1
            if (r0 == 0) goto L_0x0022
            r0 = 0
            r1.getMax = r0
            o.savePicture r1 = r3.setMin
            java.lang.Object r0 = r1.setMin((int) r0)
            r1 = r0
            id.dana.richview.category.model.CategoryModel r1 = (id.dana.richview.category.model.CategoryModel) r1
            r1.getMax = r2
            o.savePicture r0 = r3.setMin
            r0.notifyDataSetChanged()
        L_0x0022:
            if (r4 == 0) goto L_0x002d
            id.dana.richview.category.CategoryView$setMin r4 = r3.getMax
            if (r4 == 0) goto L_0x002d
            if (r1 == 0) goto L_0x002d
            r4.setMin(r1, r2)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.richview.category.CategoryView.setDefaultSelected(boolean):void");
    }

    private int setMax() {
        List max = this.setMin.getMax();
        for (int i = 0; i < max.size(); i++) {
            if (TextUtils.equals(((CategoryModel) max.get(i)).setMin, this.getMin)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isHidden() {
        return this.llCategory.getVisibility() != 0;
    }

    public CategoryModel getCategoryFromExtra() {
        return this.isInside;
    }

    public void setup() {
        this.rvCategory.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.rvCategory.addItemDecoration(new RecyclerView.getMax() {
            public final void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
                int dimension = (int) CategoryView.this.getResources().getDimension(R.dimen.f26252131165272);
                rect.left = dimension;
                rect.right = dimension;
            }
        });
        savePicture savepicture = new savePicture(new convertPicture(this));
        this.setMin = savepicture;
        this.rvCategory.setAdapter(savepicture);
        showShimmer();
    }

    public static /* synthetic */ void setMax(CategoryView categoryView, int i) {
        savePicture savepicture = categoryView.setMin;
        List max = savepicture.getMax();
        boolean z = false;
        int i2 = i;
        int i3 = 0;
        while (i3 < max.size()) {
            CategoryModel categoryModel = (CategoryModel) max.get(i3);
            boolean z2 = i2 == i3;
            if (!categoryModel.length() || !z2 || savepicture.length(i2)) {
                categoryModel.getMax = z2;
            } else {
                ((CategoryModel) max.get(savepicture.length)).getMax = true;
                categoryModel.getMax = false;
                i2 = savepicture.length;
            }
            i3++;
        }
        savepicture.getMin(max);
        savepicture.notifyDataSetChanged();
        if (!((CategoryModel) categoryView.setMin.setMin(i)).length()) {
            i = 0;
        }
        if (i == 0) {
            z = true;
        }
        categoryView.rvCategory.smoothScrollToPosition(i);
        categoryView.getMin = ((CategoryModel) categoryView.setMin.setMin(i)).setMin;
        CategoryModel categoryModel2 = (CategoryModel) categoryView.setMin.setMin(i);
        setMin setmin = categoryView.getMax;
        if (setmin != null && categoryModel2 != null) {
            setmin.setMin(categoryModel2, z);
        }
    }
}
