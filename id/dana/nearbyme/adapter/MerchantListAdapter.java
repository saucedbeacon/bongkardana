package id.dana.nearbyme.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.Unbinder;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.nearbyme.adapter.MerchantListAdapter;
import id.dana.nearbyme.model.PromoInfoModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o.BaseOutShareItem;
import o.CornerMarkingDataProvider;
import o.FetchAppsRequest;
import o.FetchAppsResult;
import o.GriverEventManifest;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.ShareShortUrlRequest;
import o.ShareShortUrlResult;
import o.UrlCodecResult;
import o.cancelAll;
import o.dispatchOnCancelled;
import o.drawDividersHorizontal;
import o.evaluate;
import o.getSchema;
import o.onCancelLoad;
import o.onCanceled;
import o.requestFailed;
import o.setH5MenuList;
import o.setIcon;
import o.setSchema;
import o.updateCornerMarking;
import o.updatePostConstraints;
import o.updatePostLayout;

public final class MerchantListAdapter extends IMultiInstanceInvalidationCallback.Stub<ViewHolder, ShopModel> {
    public boolean IsOverlapping;
    public setMin getMax;
    public getMax getMin;
    public getMin length;
    public length setMax;
    public setMax setMin;

    public interface getMax {
        void setMin(int i);
    }

    public interface getMin {
        void setMin(List<PromoInfoModel> list);
    }

    public interface length {
        void getMax(int i);
    }

    public interface setMax {
        void getMax(int i);
    }

    public interface setMin {
        void getMin(String str);
    }

    public final int getItemViewType(int i) {
        return i;
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder length;

        @UiThread
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.length = viewHolder;
            viewHolder.clMerchantList = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39662131362446, "field 'clMerchantList'", ConstraintLayout.class);
            viewHolder.clMerchantListRibbonContainer = (ViewGroup) drawDividersHorizontal.setMin(view, R.id.f39802131362460, "field 'clMerchantListRibbonContainer'", ViewGroup.class);
            viewHolder.dividerPromoRibbon = drawDividersHorizontal.getMax(view, R.id.f42492131362759, "field 'dividerPromoRibbon'");
            viewHolder.clDanaBusiness = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39072131362386, "field 'clDanaBusiness'", ConstraintLayout.class);
            viewHolder.tvHomeShopping = (TextView) drawDividersHorizontal.setMin(view, R.id.f66732131365300, "field 'tvHomeShopping'", TextView.class);
            viewHolder.ivMerchantListInfoIcon = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49722131363527, "field 'ivMerchantListInfoIcon'", ImageView.class);
            viewHolder.ivMerchantLogo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49732131363528, "field 'ivMerchantLogo'", ImageView.class);
            viewHolder.ivQrisIcon = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50412131363596, "field 'ivQrisIcon'", ImageView.class);
            viewHolder.lottieMerchantListNearbyRibbon = (LottieAnimationView) drawDividersHorizontal.setMin(view, R.id.f54022131363959, "field 'lottieMerchantListNearbyRibbon'", LottieAnimationView.class);
            viewHolder.tvMerchantAddress = (TextView) drawDividersHorizontal.setMin(view, R.id.f67202131365347, "field 'tvMerchantAddress'", TextView.class);
            viewHolder.tvMerchantCategory = (TextView) drawDividersHorizontal.setMin(view, R.id.f67212131365348, "field 'tvMerchantCategory'", TextView.class);
            viewHolder.tvMerchantListRibbonLineBottom = (TextView) drawDividersHorizontal.setMin(view, R.id.f67222131365349, "field 'tvMerchantListRibbonLineBottom'", TextView.class);
            viewHolder.tvMerchantListRibbonLineTop = (TextView) drawDividersHorizontal.setMin(view, R.id.f67232131365350, "field 'tvMerchantListRibbonLineTop'", TextView.class);
            viewHolder.tvMerchantName = (TextView) drawDividersHorizontal.setMin(view, R.id.f67242131365351, "field 'tvMerchantName'", TextView.class);
            viewHolder.tvMerchantStoreDistance = (TextView) drawDividersHorizontal.setMin(view, R.id.f67262131365353, "field 'tvMerchantStoreDistance'", TextView.class);
            viewHolder.tvOpenHours = (TextView) drawDividersHorizontal.setMin(view, R.id.f67842131365411, "field 'tvOpenHours'", TextView.class);
            viewHolder.tvOtherLocation = (TextView) drawDividersHorizontal.setMin(view, R.id.f67962131365423, "field 'tvOtherLocation'", TextView.class);
            viewHolder.tvRatingStar = (TextView) drawDividersHorizontal.setMin(view, R.id.f68602131365487, "field 'tvRatingStar'", TextView.class);
            viewHolder.tvTopUpReady = (TextView) drawDividersHorizontal.setMin(view, R.id.f70102131365640, "field 'tvTopUpReady'", TextView.class);
        }

        @CallSuper
        public final void setMax() {
            ViewHolder viewHolder = this.length;
            if (viewHolder != null) {
                this.length = null;
                viewHolder.clMerchantList = null;
                viewHolder.clMerchantListRibbonContainer = null;
                viewHolder.dividerPromoRibbon = null;
                viewHolder.clDanaBusiness = null;
                viewHolder.tvHomeShopping = null;
                viewHolder.ivMerchantListInfoIcon = null;
                viewHolder.ivMerchantLogo = null;
                viewHolder.ivQrisIcon = null;
                viewHolder.lottieMerchantListNearbyRibbon = null;
                viewHolder.tvMerchantAddress = null;
                viewHolder.tvMerchantCategory = null;
                viewHolder.tvMerchantListRibbonLineBottom = null;
                viewHolder.tvMerchantListRibbonLineTop = null;
                viewHolder.tvMerchantName = null;
                viewHolder.tvMerchantStoreDistance = null;
                viewHolder.tvOpenHours = null;
                viewHolder.tvOtherLocation = null;
                viewHolder.tvRatingStar = null;
                viewHolder.tvTopUpReady = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void getMax(@NonNull Ignore ignore, int i) {
        ViewHolder viewHolder = (ViewHolder) ignore;
        viewHolder.setMax((ShopModel) setMin(i));
        ViewHolder.setMin(viewHolder, (ShopModel) setMin(i));
    }

    public final /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.valueOf valueof, int i) {
        ViewHolder viewHolder = (ViewHolder) valueof;
        viewHolder.setMax((ShopModel) setMin(i));
        ViewHolder.setMin(viewHolder, (ShopModel) setMin(i));
    }

    @NonNull
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-2124501294, oncanceled);
            onCancelLoad.getMin(-2124501294, oncanceled);
        }
        return new ViewHolder(viewGroup.getContext(), viewGroup, new FetchAppsRequest(this), new UrlCodecResult(this), new FetchAppsResult(this), new BaseOutShareItem(this), new requestFailed(this));
    }

    public MerchantListAdapter() {
        super.getMin(new ArrayList());
    }

    public final void getMin(List<ShopModel> list) {
        getMax().clear();
        getMax().addAll(list);
        notifyDataSetChanged();
    }

    public class ViewHolder extends Ignore<ShopModel> {
        @BindView(2131362386)
        ConstraintLayout clDanaBusiness;
        @BindView(2131362446)
        ConstraintLayout clMerchantList;
        @BindView(2131362460)
        ViewGroup clMerchantListRibbonContainer;
        @BindView(2131362759)
        View dividerPromoRibbon;
        @BindView(2131363527)
        ImageView ivMerchantListInfoIcon;
        @BindView(2131363528)
        ImageView ivMerchantLogo;
        @BindView(2131363596)
        ImageView ivQrisIcon;
        @BindView(2131363959)
        LottieAnimationView lottieMerchantListNearbyRibbon;
        @BindView(2131365300)
        TextView tvHomeShopping;
        @BindView(2131365347)
        TextView tvMerchantAddress;
        @BindView(2131365348)
        TextView tvMerchantCategory;
        @BindView(2131365349)
        TextView tvMerchantListRibbonLineBottom;
        @BindView(2131365350)
        TextView tvMerchantListRibbonLineTop;
        @BindView(2131365351)
        TextView tvMerchantName;
        @BindView(2131365353)
        TextView tvMerchantStoreDistance;
        @BindView(2131365411)
        TextView tvOpenHours;
        @BindView(2131365423)
        TextView tvOtherLocation;
        @BindView(2131365487)
        TextView tvRatingStar;
        @BindView(2131365640)
        TextView tvTopUpReady;

        ViewHolder(Context context, ViewGroup viewGroup, setIcon<Integer> seticon, setIcon<Integer> seticon2, setIcon<Integer> seticon3, setIcon<Integer> seticon4, setIcon<Integer> seticon5) {
            super(context, R.layout.item_merchant_list, viewGroup);
            this.clMerchantList.setOnClickListener(new getSchema(this, seticon));
            this.clMerchantListRibbonContainer.setOnClickListener(new View.OnClickListener(this, seticon2) {
                private final setIcon setMax;
                private final MerchantListAdapter.ViewHolder setMin;

                {
                    this.setMin = r1;
                    this.setMax = r2;
                }

                public final void onClick(View view) {
                    this.setMax.getMax(Integer.valueOf(this.setMin.getBindingAdapterPosition()));
                }
            });
            this.tvTopUpReady.setOnClickListener(new setSchema(this, seticon3));
            this.tvHomeShopping.setOnClickListener(new ShareShortUrlResult(this, seticon5));
            this.tvOtherLocation.setOnClickListener(new GriverEventManifest(this, seticon4));
        }

        /* renamed from: length */
        public final void setMax(ShopModel shopModel) {
            String str;
            this.tvMerchantName.setText(shopModel.invoke);
            TextView textView = this.tvMerchantCategory;
            if (shopModel.extraCallbackWithResult == null || shopModel.extraCallbackWithResult.isEmpty()) {
                str = "";
            } else {
                str = shopModel.getMin(false, " | ");
            }
            textView.setText(str);
            this.tvMerchantAddress.setText(shopModel.setMax().setMin);
            this.tvMerchantStoreDistance.setText(setH5MenuList.getMax(this.length, shopModel.toFloatRange));
            getMax(this.ivMerchantLogo, shopModel.hashCode);
            setMin(shopModel);
            getMin(shopModel);
            getMax(this.ivMerchantLogo, shopModel.hashCode);
            getMax(shopModel);
        }

        private void setMin(ShopModel shopModel) {
            this.tvTopUpReady.setText(this.length.getString(R.string.merchant_item_top_up).toUpperCase());
            int i = 0;
            this.tvTopUpReady.setVisibility(shopModel.getMin() ? 0 : 8);
            this.ivQrisIcon.setVisibility(shopModel.toDoubleRange() ? 0 : 8);
            this.clDanaBusiness.setVisibility(shopModel.FastBitmap$CoordinateSystem() ? 0 : 8);
            this.tvOtherLocation.setVisibility(shopModel.setMin() ? 0 : 8);
            TextView textView = this.tvHomeShopping;
            if (!shopModel.toIntRange()) {
                i = 8;
            }
            textView.setVisibility(i);
        }

        private void length(boolean z) {
            TextView textView = this.tvMerchantListRibbonLineTop;
            if (textView != null) {
                if (z) {
                    textView.postDelayed(new ShareShortUrlRequest(this), 150);
                } else {
                    getMin(false);
                }
            }
        }

        private boolean length() {
            return (this.tvMerchantListRibbonLineTop == null || this.tvMerchantListRibbonLineBottom == null || this.ivMerchantListInfoIcon == null) ? false : true;
        }

        private void getMin(boolean z) {
            if (z) {
                this.tvMerchantListRibbonLineTop.animate().alpha(1.0f).start();
                this.tvMerchantListRibbonLineBottom.animate().alpha(1.0f).start();
                this.ivMerchantListInfoIcon.animate().alpha(1.0f).start();
                return;
            }
            this.tvMerchantListRibbonLineTop.setAlpha(1.0f);
            this.tvMerchantListRibbonLineBottom.setAlpha(1.0f);
            this.ivMerchantListInfoIcon.setAlpha(1.0f);
        }

        private void getMax(ImageView imageView, String str) {
            Drawable min = cancelAll.getMin(this.length, R.drawable.ic_merchant_logo_null);
            ((updateCornerMarking) Glide.getMax(this.length)).setMax(str).setMax(evaluate.setMin).getMax(min).setMin(min).setMin((updatePostLayout<Bitmap>) new updatePostConstraints((int) (Resources.getSystem().getDisplayMetrics().density * 2.0f))).length(imageView);
        }

        private void getMin(ShopModel shopModel) {
            if (shopModel.create == 0.0d) {
                this.tvRatingStar.setVisibility(8);
                return;
            }
            this.tvRatingStar.setVisibility(0);
            this.tvRatingStar.setText(String.format(Locale.US, "%.1f", new Object[]{Double.valueOf(shopModel.create)}));
        }

        private void getMax(ShopModel shopModel) {
            if (shopModel.onMessageChannelReady.isEmpty() && !shopModel.getMax()) {
                if (this.tvOpenHours.getVisibility() == 0) {
                    this.tvOpenHours.setVisibility(8);
                }
                this.tvMerchantStoreDistance.setText(this.tvMerchantStoreDistance.getText().toString().replace("• ", ""));
            } else if (shopModel.getMax()) {
                String string = this.length.getString(R.string.open);
                if (this.tvOpenHours.getVisibility() == 8) {
                    this.tvOpenHours.setVisibility(0);
                }
                length(string);
                this.tvOpenHours.setText(string);
            } else {
                String min = shopModel.getMin(this.length);
                if (TextUtils.isEmpty(min)) {
                    if (this.tvOpenHours.getVisibility() == 0) {
                        this.tvOpenHours.setVisibility(8);
                    }
                    this.tvMerchantStoreDistance.setText(this.tvMerchantStoreDistance.getText().toString().replace("• ", ""));
                    return;
                }
                if (this.tvOpenHours.getVisibility() == 8) {
                    this.tvOpenHours.setVisibility(0);
                }
                length(min);
                this.tvOpenHours.setText(min);
            }
        }

        private void length(String str) {
            if (str.equals(this.length.getResources().getString(R.string.closing_soon)) || str.equals(this.length.getResources().getString(R.string.closed))) {
                this.tvOpenHours.setTextColor(-773316);
            } else {
                this.tvOpenHours.setTextColor(-13553359);
            }
        }

        static /* synthetic */ void setMin(ViewHolder viewHolder, ShopModel shopModel) {
            String str;
            boolean equals = shopModel.equals();
            int i = 8;
            viewHolder.clMerchantListRibbonContainer.setVisibility(equals ? 0 : 8);
            View view = viewHolder.dividerPromoRibbon;
            if (equals) {
                i = 0;
            }
            view.setVisibility(i);
            if (equals) {
                if (shopModel.equals()) {
                    str = shopModel.Mean$Arithmetic.get(0).length;
                } else {
                    str = "";
                }
                String IsOverlapping = shopModel.IsOverlapping();
                viewHolder.tvMerchantListRibbonLineTop.setText(CornerMarkingDataProvider.AnonymousClass3.setMin(viewHolder.length, str, str));
                viewHolder.tvMerchantListRibbonLineBottom.setText(IsOverlapping);
                if (!MerchantListAdapter.this.IsOverlapping) {
                    viewHolder.lottieMerchantListNearbyRibbon.postDelayed(new Runnable(viewHolder) {
                        private final MerchantListAdapter.ViewHolder length;

                        {
                            this.length = r1;
                        }

                        public final void run() {
                            MerchantListAdapter.ViewHolder.setMax(this.length);
                        }
                    }, 500);
                    return;
                }
                LottieAnimationView lottieAnimationView = viewHolder.lottieMerchantListNearbyRibbon;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setFrame(60);
                }
                viewHolder.length(false);
            }
        }

        public static /* synthetic */ void setMax(ViewHolder viewHolder) {
            LottieAnimationView lottieAnimationView = viewHolder.lottieMerchantListNearbyRibbon;
            if (lottieAnimationView != null) {
                lottieAnimationView.playAnimation();
            }
            viewHolder.length(true);
        }

        public static /* synthetic */ void getMin(ViewHolder viewHolder) {
            if (viewHolder.length()) {
                viewHolder.getMin(true);
            }
            boolean unused = MerchantListAdapter.this.IsOverlapping = true;
        }
    }
}
