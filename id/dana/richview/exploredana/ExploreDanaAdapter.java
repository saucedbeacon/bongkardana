package id.dana.richview.exploredana;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.contract.exploredana.PlayerType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.TakePictureProcessor;
import o.drawDividersHorizontal;
import o.getDividerWidth;
import o.updateCornerMarking;

public final class ExploreDanaAdapter extends IMultiInstanceInvalidationCallback.Stub<Ignore<TakePictureProcessor.AnonymousClass7>, TakePictureProcessor.AnonymousClass7> {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewType {
        public static final int TYPE_DEFAULT = 0;
        public static final int TYPE_DISMISS_ALL = 1;
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private View getMin;
        private ViewHolder length;

        @UiThread
        public ViewHolder_ViewBinding(final ViewHolder viewHolder, View view) {
            this.length = viewHolder;
            viewHolder.icPlayExplore = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50152131363570, "field 'icPlayExplore'", ImageView.class);
            viewHolder.closeAll = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f36122131362061, "field 'closeAll'", LinearLayout.class);
            viewHolder.flListExploreContainer = (FrameLayout) drawDividersHorizontal.setMin(view, R.id.f44322131362957, "field 'flListExploreContainer'", FrameLayout.class);
            viewHolder.img = (ImageView) drawDividersHorizontal.setMin(view, R.id.f37472131362202, "field 'img'", ImageView.class);
            View max = drawDividersHorizontal.getMax(view, R.id.f36112131362060, "method 'closeCard'");
            this.getMin = max;
            max.setOnClickListener(new getDividerWidth() {
                public final void setMax(View view) {
                    viewHolder.closeCard();
                }
            });
        }

        @CallSuper
        public final void setMax() {
            ViewHolder viewHolder = this.length;
            if (viewHolder != null) {
                this.length = null;
                viewHolder.icPlayExplore = null;
                viewHolder.closeAll = null;
                viewHolder.flListExploreContainer = null;
                viewHolder.img = null;
                this.getMin.setOnClickListener((View.OnClickListener) null);
                this.getMin = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* access modifiers changed from: package-private */
    public final List<String> setMax() {
        ArrayList arrayList = new ArrayList();
        List<TakePictureProcessor.AnonymousClass7> max = getMax();
        if (max != null && !max.isEmpty()) {
            for (TakePictureProcessor.AnonymousClass7 r2 : max) {
                arrayList.add(r2.getMin);
            }
        }
        return arrayList;
    }

    public final int getItemViewType(int i) {
        return (getItemCount() <= 0 || getItemCount() - 1 != i) ? 0 : 1;
    }

    public final int getItemCount() {
        int itemCount = super.getItemCount();
        return itemCount > 0 ? itemCount + 1 : itemCount;
    }

    public class ViewHolder extends Ignore<TakePictureProcessor.AnonymousClass7> {
        @BindView(2131362061)
        LinearLayout closeAll;
        @BindView(2131362957)
        FrameLayout flListExploreContainer;
        private boolean getMax;
        private final int getMin;
        @BindView(2131363570)
        ImageView icPlayExplore;
        @BindView(2131362202)
        ImageView img;

        public final /* synthetic */ void setMax(Object obj) {
            TakePictureProcessor.AnonymousClass7 r5 = (TakePictureProcessor.AnonymousClass7) obj;
            if (this.getMin == 1) {
                this.icPlayExplore.setVisibility(8);
                this.img.setVisibility(8);
                this.closeAll.setVisibility(0);
                this.getMax = true;
            } else if (r5.setMax.equals(PlayerType.YOUTUBE) || r5.setMax.equals(PlayerType.EXOPLAYER)) {
                this.icPlayExplore.setVisibility(0);
                this.img.setVisibility(0);
                this.closeAll.setVisibility(8);
                ((updateCornerMarking) Glide.getMax(this.length)).setMax(r5.getMax).length(this.img);
            } else {
                this.icPlayExplore.setVisibility(8);
                this.img.setVisibility(0);
                this.closeAll.setVisibility(8);
                ((updateCornerMarking) Glide.getMax(this.length)).setMax(r5.getMax).length(this.img);
            }
        }

        public ViewHolder(Context context, ViewGroup viewGroup, int i) {
            super(context, R.layout.view_item_explore_dana, viewGroup);
            this.getMin = i;
        }

        public final void setMin(Ignore.setMin setmin) {
            if (!this.getMax) {
                super.setMin(setmin);
            }
        }

        /* access modifiers changed from: package-private */
        @OnClick({2131362060})
        public void closeCard() {
            ExploreDanaAdapter.this.length().length(getAdapterPosition());
        }
    }

    @NonNull
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(viewGroup.getContext(), viewGroup, i);
    }
}
