package o;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import io.supercharge.shimmerlayout.ShimmerLayout;

public final class getScrimOpacity extends RecyclerView.Adapter<RecyclerView.valueOf> {
    int getMax;
    boolean getMin;
    int isInside;
    int length;
    int setMax;
    int setMin;

    public final RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (this.getMin) {
            return new blocksInteractionBelow(from, viewGroup, this.getMax);
        }
        return new RecyclerView.valueOf(from.inflate(this.getMax, viewGroup, false)) {
        };
    }

    public final void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        if (this.getMin) {
            ShimmerLayout shimmerLayout = (ShimmerLayout) valueof.itemView;
            shimmerLayout.setShimmerAnimationDuration(this.length);
            shimmerLayout.setShimmerAngle(this.isInside);
            shimmerLayout.setShimmerColor(this.setMin);
            shimmerLayout.startShimmerAnimation();
        }
    }

    public final int getItemCount() {
        return this.setMax;
    }
}
