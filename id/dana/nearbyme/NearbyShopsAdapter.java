package id.dana.nearbyme;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.Unbinder;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.nearbyme.model.ShopModel;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.RewriteQueriesToDropUnusedColumns;
import o.drawDividersHorizontal;
import o.evaluate;
import o.setH5MenuList;
import o.updateCornerMarking;

public final class NearbyShopsAdapter extends IMultiInstanceInvalidationCallback.Stub<Ignore<ShopModel>, ShopModel> {
    private Ignore.setMin setMax;

    public class NearbyShopListEntryPointViewHolder_ViewBinding implements Unbinder {
        private NearbyShopListEntryPointViewHolder setMin;

        @UiThread
        public NearbyShopListEntryPointViewHolder_ViewBinding(NearbyShopListEntryPointViewHolder nearbyShopListEntryPointViewHolder, View view) {
            this.setMin = nearbyShopListEntryPointViewHolder;
            nearbyShopListEntryPointViewHolder.ivNearbyShop = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49732131363528, "field 'ivNearbyShop'", ImageView.class);
            nearbyShopListEntryPointViewHolder.tvDistance = (TextView) drawDividersHorizontal.setMin(view, R.id.f65852131365211, "field 'tvDistance'", TextView.class);
            nearbyShopListEntryPointViewHolder.tvMerchantName = (TextView) drawDividersHorizontal.setMin(view, R.id.f67242131365351, "field 'tvMerchantName'", TextView.class);
        }

        @CallSuper
        public final void setMax() {
            NearbyShopListEntryPointViewHolder nearbyShopListEntryPointViewHolder = this.setMin;
            if (nearbyShopListEntryPointViewHolder != null) {
                this.setMin = null;
                nearbyShopListEntryPointViewHolder.ivNearbyShop = null;
                nearbyShopListEntryPointViewHolder.tvDistance = null;
                nearbyShopListEntryPointViewHolder.tvMerchantName = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    NearbyShopsAdapter(Ignore.setMin setmin) {
        this.setMax = setmin;
    }

    class NearbyShopListEntryPointViewHolder extends Ignore<ShopModel> {
        private final Context getMax;
        @BindView(2131363528)
        ImageView ivNearbyShop;
        @BindView(2131365211)
        TextView tvDistance;
        @BindView(2131365351)
        TextView tvMerchantName;

        public final /* synthetic */ void setMax(Object obj) {
            ShopModel shopModel = (ShopModel) obj;
            if (shopModel != null && shopModel.toFloatRange >= 0.0d) {
                this.tvDistance.setText(setH5MenuList.length(this.getMax, shopModel.toFloatRange));
                this.tvMerchantName.setText(shopModel.invoke);
                String str = shopModel.hashCode;
                if (RewriteQueriesToDropUnusedColumns.setMax(str)) {
                    RewriteQueriesToDropUnusedColumns.getMax getmax = new RewriteQueriesToDropUnusedColumns.getMax(this.getMax, (byte) 0);
                    getmax.getMin = str;
                    getmax.setMax = R.drawable.ic_merchant_logo_null;
                    getmax.setMin = this.ivNearbyShop;
                    new RewriteQueriesToDropUnusedColumns(getmax, (byte) 0);
                    return;
                }
                ((updateCornerMarking) Glide.getMax(this.getMax)).setMax(str).setMax(evaluate.setMin).setMax((int) R.drawable.ic_merchant_logo_null).setMin((int) R.drawable.ic_merchant_logo_null).length(this.ivNearbyShop);
            }
        }

        NearbyShopListEntryPointViewHolder(Context context, ViewGroup viewGroup, Ignore.setMin setmin) {
            super(context, R.layout.layout_custom_gridview_nearby_me, viewGroup);
            this.getMax = context;
            setMin(setmin);
        }
    }

    @NonNull
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new NearbyShopListEntryPointViewHolder(viewGroup.getContext(), viewGroup, this.setMax);
    }
}
