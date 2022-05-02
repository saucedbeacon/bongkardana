package id.dana.richview.boundcard;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import id.dana.R;
import id.dana.richview.boundcard.BoundCardAdapter;
import id.dana.richview.boundcard.model.BoundCard;
import o.Ignore;
import o.notifyAction;

public class DebitCardViewHolder extends Ignore<BoundCard> {
    @BindView(2131362697)
    DebitCardView debitCard;

    public final /* synthetic */ void setMax(Object obj) {
        this.debitCard.setData((BoundCard) obj);
    }

    public DebitCardViewHolder(Context context, ViewGroup viewGroup, BoundCardAdapter.setMin setmin) {
        super(context, R.layout.card_debit, viewGroup);
        ButterKnife.setMax((Object) this, this.itemView);
        this.debitCard.setOnClickListener(new notifyAction(this, setmin));
    }

    public static /* synthetic */ void length(DebitCardViewHolder debitCardViewHolder, BoundCardAdapter.setMin setmin, View view) {
        if (setmin != null) {
            setmin.length(view, debitCardViewHolder.getAdapterPosition());
        }
    }
}
