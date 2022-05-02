package o;

import android.view.View;
import id.dana.nearbyme.adapter.MerchantCategoryAdapter;
import o.g;

public final class UrlCodecRequest implements View.OnClickListener {
    private final g.AnonymousClass1 getMin;
    private final MerchantCategoryAdapter.MerchantCategoryViewHolder setMin;

    public UrlCodecRequest(MerchantCategoryAdapter.MerchantCategoryViewHolder merchantCategoryViewHolder, g.AnonymousClass1 r2) {
        this.setMin = merchantCategoryViewHolder;
        this.getMin = r2;
    }

    public final void onClick(View view) {
        MerchantCategoryAdapter.MerchantCategoryViewHolder.length(this.setMin, this.getMin, view);
    }
}
