package id.dana.richview.boundcard;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.richview.boundcard.model.BoundCard;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;

public final class BoundCardAdapter extends IMultiInstanceInvalidationCallback.Stub<Ignore<BoundCard>, BoundCard> {
    String getMax;
    private final setMin length;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewType {
        public static final int ADD_CARD = 0;
        public static final int DANA_CARD = 1;
        public static final int DEBIT_CARD = 2;
    }

    public interface setMin {
        void length(View view, int i);
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        Ignore ignore = (Ignore) valueof;
        ignore.setIsRecyclable(false);
        super.onBindViewHolder(ignore, i);
    }

    BoundCardAdapter(setMin setmin) {
        this.length = setmin;
    }

    public final int getItemViewType(int i) {
        BoundCard boundCard = (BoundCard) setMin(i);
        if (boundCard.setMin()) {
            return 1;
        }
        return ((boundCard.getMin() || boundCard.setMax()) && !boundCard.length()) ? 2 : 0;
    }

    public final void getMax(Ignore<BoundCard> ignore, int i) {
        ignore.setIsRecyclable(false);
        super.onBindViewHolder(ignore, i);
    }

    @NonNull
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new DanaCardViewHolder(viewGroup.getContext(), viewGroup, this.getMax, this.length);
        }
        if (i == 2) {
            return new DebitCardViewHolder(viewGroup.getContext(), viewGroup, this.length);
        }
        return new AddCardTextViewHolder(viewGroup.getContext(), viewGroup, this.length);
    }
}
