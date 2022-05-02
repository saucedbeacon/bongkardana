package id.dana.richview.boundcard;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import id.dana.R;
import id.dana.richview.boundcard.BoundCardAdapter;
import id.dana.richview.boundcard.model.BoundCard;
import o.Ignore;
import o.onScanFinished;

public class AddCardTextViewHolder extends Ignore<BoundCard> {
    @BindView(2131363848)
    LinearLayout llCardAdd;
    @BindView(2131365084)
    TextView tvAddCard;

    AddCardTextViewHolder(Context context, ViewGroup viewGroup, BoundCardAdapter.setMin setmin) {
        super(context, R.layout.card_add_text, viewGroup);
        ButterKnife.setMax((Object) this, this.itemView);
        this.tvAddCard.setOnClickListener(new onScanFinished(this, setmin));
    }

    public final /* synthetic */ void setMax(Object obj) {
        if (getAdapterPosition() == 0) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.llCardAdd.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 0);
            this.llCardAdd.setLayoutParams(layoutParams);
        }
    }

    public static /* synthetic */ void setMin(AddCardTextViewHolder addCardTextViewHolder, BoundCardAdapter.setMin setmin, View view) {
        if (setmin != null) {
            setmin.length(view, addCardTextViewHolder.getAdapterPosition());
        }
    }
}
