package id.dana.oauth;

import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import id.dana.R;
import o.Ignore;
import o.saveImageToGallery;

public class ScopeViewHolder extends Ignore<saveImageToGallery> {
    @BindView(2131365193)
    TextView tvDescription;

    public final /* synthetic */ void setMax(Object obj) {
        this.tvDescription.setText(((saveImageToGallery) obj).length);
    }

    public ScopeViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_scope, viewGroup);
    }
}
