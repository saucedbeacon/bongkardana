package id.dana.nearbyme;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.Unbinder;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.nearbyme.model.PromoInfoModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.HashMap;
import java.util.List;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.RewriteQueriesToDropUnusedColumns;
import o.drawDividersHorizontal;
import o.evaluate;
import o.setH5MenuList;
import o.updateCornerMarking;

public class NewNearbyShopsAdapter extends IMultiInstanceInvalidationCallback.Stub<Ignore<ShopModel>, ShopModel> {
    HashMap<String, Integer> getMax = new HashMap<>();
    private Ignore.setMin setMin;

    public class NearbyShopListEntryPointViewHolder_ViewBinding implements Unbinder {
        private NearbyShopListEntryPointViewHolder getMin;

        @UiThread
        public NearbyShopListEntryPointViewHolder_ViewBinding(NearbyShopListEntryPointViewHolder nearbyShopListEntryPointViewHolder, View view) {
            this.getMin = nearbyShopListEntryPointViewHolder;
            nearbyShopListEntryPointViewHolder.ivNearbyShop = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49732131363528, "field 'ivNearbyShop'", ImageView.class);
            nearbyShopListEntryPointViewHolder.ivPromo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50312131363586, "field 'ivPromo'", ImageView.class);
            nearbyShopListEntryPointViewHolder.llRating = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53562131363912, "field 'llRating'", LinearLayout.class);
            nearbyShopListEntryPointViewHolder.tvCategory = (TextView) drawDividersHorizontal.setMin(view, R.id.f65102131365135, "field 'tvCategory'", TextView.class);
            nearbyShopListEntryPointViewHolder.tvDistance = (TextView) drawDividersHorizontal.setMin(view, R.id.f65852131365211, "field 'tvDistance'", TextView.class);
            nearbyShopListEntryPointViewHolder.tvMerchantName = (TextView) drawDividersHorizontal.setMin(view, R.id.f67242131365351, "field 'tvMerchantName'", TextView.class);
            nearbyShopListEntryPointViewHolder.tvRating = (TextView) drawDividersHorizontal.setMin(view, R.id.f68592131365486, "field 'tvRating'", TextView.class);
        }

        @CallSuper
        public final void setMax() {
            NearbyShopListEntryPointViewHolder nearbyShopListEntryPointViewHolder = this.getMin;
            if (nearbyShopListEntryPointViewHolder != null) {
                this.getMin = null;
                nearbyShopListEntryPointViewHolder.ivNearbyShop = null;
                nearbyShopListEntryPointViewHolder.ivPromo = null;
                nearbyShopListEntryPointViewHolder.llRating = null;
                nearbyShopListEntryPointViewHolder.tvCategory = null;
                nearbyShopListEntryPointViewHolder.tvDistance = null;
                nearbyShopListEntryPointViewHolder.tvMerchantName = null;
                nearbyShopListEntryPointViewHolder.tvRating = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    NewNearbyShopsAdapter(Ignore.setMin setmin) {
        this.setMin = setmin;
    }

    public final void getMin(List<ShopModel> list) {
        super.getMin(list);
        for (int i = 0; i < list.size(); i++) {
            this.getMax.put(list.get(i).b, Integer.valueOf(i));
        }
    }

    class NearbyShopListEntryPointViewHolder extends Ignore<ShopModel> {
        @BindView(2131363528)
        ImageView ivNearbyShop;
        @BindView(2131363586)
        ImageView ivPromo;
        @BindView(2131363912)
        LinearLayout llRating;
        private final Context setMin;
        @BindView(2131365135)
        TextView tvCategory;
        @BindView(2131365211)
        TextView tvDistance;
        @BindView(2131365351)
        TextView tvMerchantName;
        @BindView(2131365486)
        TextView tvRating;

        public final /* synthetic */ void setMax(Object obj) {
            String str;
            ShopModel shopModel = (ShopModel) obj;
            if (shopModel != null && shopModel.toFloatRange >= 0.0d) {
                this.tvDistance.setText(setH5MenuList.length(this.setMin, shopModel.toFloatRange));
                this.tvMerchantName.setText(shopModel.invoke);
                TextView textView = this.tvCategory;
                if (shopModel.extraCallbackWithResult == null || shopModel.extraCallbackWithResult.isEmpty()) {
                    str = "";
                } else {
                    str = shopModel.getMin(true, " ");
                }
                textView.setText(str);
                List<PromoInfoModel> list = shopModel.Mean$Arithmetic;
                if (list == null || list.isEmpty()) {
                    this.ivPromo.setVisibility(8);
                } else {
                    this.ivPromo.setVisibility(0);
                }
                double d = shopModel.create;
                if (d > 0.0d) {
                    double round = (double) Math.round(d * 100.0d);
                    Double.isNaN(round);
                    String d2 = Double.toString(round / 100.0d);
                    this.llRating.setVisibility(0);
                    this.tvRating.setText(d2);
                } else {
                    this.llRating.setVisibility(8);
                }
                String str2 = shopModel.hashCode;
                if (RewriteQueriesToDropUnusedColumns.setMax(str2)) {
                    RewriteQueriesToDropUnusedColumns.getMax getmax = new RewriteQueriesToDropUnusedColumns.getMax(this.setMin, (byte) 0);
                    getmax.getMin = str2;
                    getmax.setMax = R.drawable.ic_merchant_logo_null;
                    getmax.setMin = this.ivNearbyShop;
                    new RewriteQueriesToDropUnusedColumns(getmax, (byte) 0);
                    return;
                }
                ((updateCornerMarking) Glide.getMax(this.setMin)).setMax(str2).setMax(evaluate.setMin).setMax((int) R.drawable.ic_merchant_logo_null).setMin((int) R.drawable.ic_merchant_logo_null).length(this.ivNearbyShop);
            }
        }

        NearbyShopListEntryPointViewHolder(Context context, ViewGroup viewGroup, Ignore.setMin setmin) {
            super(context, R.layout.new_layout_custom_gridview_nearby_me, viewGroup);
            this.setMin = context;
            setMin(setmin);
        }
    }

    @NonNull
    public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new NearbyShopListEntryPointViewHolder(viewGroup.getContext(), viewGroup, this.setMin);
    }
}
