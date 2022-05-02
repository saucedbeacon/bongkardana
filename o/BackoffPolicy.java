package o;

import id.dana.richview.category.model.CategoryModel;
import java.util.List;
import o.onDelete;

public interface BackoffPolicy {

    public interface length extends onDelete.getMin {
        void setMin(boolean z);
    }

    public interface setMax extends onDelete.length {
        void hideShimmerView();

        void onFailGetCategories();

        void onSuccessGetCategories(long j, List<CategoryModel> list);

        void onSuccessLoadMoreCategories(long j, List<CategoryModel> list);

        void showShimmerView();
    }
}
