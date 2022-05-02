package id.dana.nearbyme;

import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import id.dana.R;
import id.dana.nearbyme.adapter.NearbyPromoAdapter;
import id.dana.nearbyme.model.PromoInfoModel;
import java.util.List;
import o.order;
import o.setKeyword;

public class PromoListDialogFragment extends order {
    @BindView(2131363736)
    ViewGroup coordinatorLayout;
    public List<PromoInfoModel> getMax;
    private Context getMin;
    @BindView(2131363391)
    ImageView ivClose;
    @BindView(2131364534)
    RecyclerView rvNearbyPromo;

    public final FrameLayout getMax() {
        return null;
    }

    public final int getMin() {
        return R.layout.view_coordinator_nearby_promo;
    }

    public final float length() {
        return 0.5f;
    }

    public final boolean t_() {
        return false;
    }

    public PromoListDialogFragment(Context context) {
        this.getMin = context;
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        getMax(dialog);
        length(dialog);
        this.ivClose.setOnClickListener(new setKeyword(this));
    }

    public final void setMin() {
        super.setMin();
        NearbyPromoAdapter nearbyPromoAdapter = new NearbyPromoAdapter();
        this.rvNearbyPromo.setLayoutManager(new LinearLayoutManager(this.getMin));
        this.rvNearbyPromo.setAdapter(nearbyPromoAdapter);
        this.rvNearbyPromo.setHasFixedSize(true);
        nearbyPromoAdapter.getMin(this.getMax);
    }
}
