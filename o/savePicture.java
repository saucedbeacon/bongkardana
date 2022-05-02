package o;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.richview.category.adapter.viewholder.CategorySkeletonViewHolder;
import id.dana.richview.category.model.CategoryModel;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;

public final class savePicture extends IMultiInstanceInvalidationCallback.Stub<Ignore<CategoryModel>, CategoryModel> {
    public int length = 0;
    private Ignore.setMin setMax;

    public savePicture(Ignore.setMin setmin) {
        this.setMax = setmin;
    }

    public final int getItemViewType(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1908646265, oncanceled);
            onCancelLoad.getMin(1908646265, oncanceled);
        }
        return ((CategoryModel) setMin(i)).toFloatRange;
    }

    public final boolean length(int i) {
        return i == this.length;
    }

    @NonNull
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (1 == i) {
            return new compressJpg(viewGroup, this.setMax);
        }
        return new CategorySkeletonViewHolder(viewGroup);
    }
}
