package id.dana.promocenter.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.promocenter.views.PromoView;
import o.DownloadFileHandle;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.drawDividersHorizontal;

public class RegularPromoAdapter extends IMultiInstanceInvalidationCallback.Stub<Ignore<DownloadFileHandle>, DownloadFileHandle> {
    public PromoView.setMax setMin;

    public class PromoViewHolder_ViewBinding implements Unbinder {
        private PromoViewHolder getMax;

        @UiThread
        public PromoViewHolder_ViewBinding(PromoViewHolder promoViewHolder, View view) {
            this.getMax = promoViewHolder;
            promoViewHolder.pvPromo = (PromoView) drawDividersHorizontal.setMin(view, R.id.f57252131364302, "field 'pvPromo'", PromoView.class);
        }

        @CallSuper
        public final void setMax() {
            PromoViewHolder promoViewHolder = this.getMax;
            if (promoViewHolder != null) {
                this.getMax = null;
                promoViewHolder.pvPromo = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public int getItemViewType(int i) {
        return setMin(i) != null ? 1 : 2;
    }

    public final void getMin(boolean z) {
        if (z) {
            getMax().add((Object) null);
            notifyItemInserted(getMax().size());
            return;
        }
        getMax(getMax().size() - 1);
    }

    static class PromoViewHolder extends Ignore<DownloadFileHandle> {
        @BindView(2131364302)
        PromoView pvPromo;
        private PromoView.setMax setMin;

        public final /* synthetic */ void setMax(Object obj) {
            this.pvPromo.setPromo((DownloadFileHandle) obj);
            this.pvPromo.setListener(this.setMin);
        }

        public PromoViewHolder(ViewGroup viewGroup, PromoView.setMax setmax) {
            super(viewGroup.getContext(), R.layout.view_promo_holder, viewGroup);
            this.setMin = setmax;
        }
    }

    static class length extends Ignore<DownloadFileHandle> {
        public length(ViewGroup viewGroup) {
            super(viewGroup.getContext(), R.layout.view_promo_center_load_more_skeleton, viewGroup);
        }
    }

    @NonNull
    public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new PromoViewHolder(viewGroup, this.setMin);
        }
        return new length(viewGroup);
    }
}
