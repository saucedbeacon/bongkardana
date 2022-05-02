package id.dana.richview.boundcard;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import id.dana.R;
import id.dana.richview.boundcard.BoundCardAdapter;
import id.dana.richview.boundcard.model.BoundCard;
import o.CaptureService;
import o.Ignore;

public class DanaCardViewHolder extends Ignore<BoundCard> {
    @BindView(2131362205)
    DanaBalanceCardView clCardDana;
    private String setMin;

    public final /* synthetic */ void setMax(Object obj) {
        this.clCardDana.setEntryPoint(this.setMin);
        this.clCardDana.setData((BoundCard) obj);
    }

    public DanaCardViewHolder(Context context, ViewGroup viewGroup, String str, BoundCardAdapter.setMin setmin) {
        super(context, R.layout.card_dana, viewGroup);
        ButterKnife.setMax((Object) this, this.itemView);
        this.setMin = str;
        this.clCardDana.setOnClickListener(new CaptureService(this, setmin));
    }

    public static /* synthetic */ void getMax(DanaCardViewHolder danaCardViewHolder, BoundCardAdapter.setMin setmin, View view) {
        if (setmin != null) {
            setmin.length(view, danaCardViewHolder.getAdapterPosition());
        }
    }
}
