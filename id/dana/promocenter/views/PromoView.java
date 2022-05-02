package id.dana.promocenter.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.home.RoundedCornersTransformation;
import id.dana.promocenter.model.PromoActionType;
import id.dana.promocenter.views.PromoView;
import id.dana.richview.CurrencyTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import o.DownloadFileHandle;
import o.WheelView;
import o.ZoomRecyclerView;
import o.allowsGoneWidget;
import o.evaluate;
import o.isLineVisible;
import o.layoutChildWithAnchor;
import o.setHorizontalGap;
import o.setScaleX;
import o.updateCornerMarking;
import o.updatePostLayout;

public class PromoView extends BaseRichView {
    @BindView(2131362082)
    DanaButtonSecondaryView btnFirstPromoAction;
    @BindView(2131362127)
    DanaButtonPrimaryView btnSecondPromoAction;
    private int getMin = 0;
    @BindView(2131363478)
    ImageView ivHotPromoRibbon;
    @BindView(2131363587)
    ImageView ivPromoBanner;
    private setMax length;
    private int setMax = 0;
    private setScaleX<Bitmap> setMin;
    @BindView(2131365466)
    TextView tvPromoExpiryDate;
    @BindView(2131365471)
    TextView tvPromoTitle;

    public interface setMax {
        void getMax(DownloadFileHandle downloadFileHandle, String str);
    }

    public int getLayout() {
        return R.layout.view_promo;
    }

    public PromoView(@NonNull Context context) {
        super(context);
    }

    public PromoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PromoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setup() {
        this.setMin = new setScaleX<>(new allowsGoneWidget(), new RoundedCornersTransformation(isLineVisible.length(getBaseActivity(), 7.0f), 0, RoundedCornersTransformation.CornerType.TOP));
    }

    public void setListener(setMax setmax) {
        this.length = setmax;
    }

    public void setPromo(DownloadFileHandle downloadFileHandle) {
        String str;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.getMin = (int) (((float) displayMetrics.widthPixels) * 0.91f);
        this.setMax = (int) (((float) displayMetrics.heightPixels) * 0.13f);
        if (downloadFileHandle != null) {
            if (!isViewBinded()) {
                ButterKnife.setMin(this);
            }
            this.tvPromoTitle.setText(downloadFileHandle.getMax);
            TextView textView = this.tvPromoExpiryDate;
            long j = downloadFileHandle.setMin;
            if (j > 0) {
                String string = getContext().getString(R.string.expired_voucher);
                Object[] objArr = new Object[1];
                String string2 = getContext().getString(R.string.complete_date);
                if (WheelView.OnWheelViewListener.getMax == null) {
                    WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
                }
                objArr[0] = new SimpleDateFormat(string2, WheelView.OnWheelViewListener.getMax).format(new Date(j));
                str = String.format(string, objArr);
            } else {
                str = "";
            }
            textView.setText(str);
            int i = downloadFileHandle.equals;
            if (i < 0 || i > 10) {
                this.ivHotPromoRibbon.setVisibility(8);
            } else {
                this.ivHotPromoRibbon.setVisibility(0);
            }
            ((updateCornerMarking) Glide.setMin((View) this)).setMax(downloadFileHandle.getMin).setMax((int) R.drawable.banner_placeholder).setMax(evaluate.setMin).setMin((updatePostLayout<Bitmap>) this.setMin).length(this.ivPromoBanner);
            this.btnSecondPromoAction.setVisibility(8);
            this.btnFirstPromoAction.setVisibility(4);
            for (ZoomRecyclerView.ScaleListener scaleListener : downloadFileHandle.setMax == null ? new ArrayList() : downloadFileHandle.setMax) {
                String str2 = scaleListener.setMax;
                if (PromoActionType.PRIMARY.equalsIgnoreCase(str2)) {
                    this.btnSecondPromoAction.setActiveButton(scaleListener.length, (Drawable) null);
                    this.btnSecondPromoAction.setVisibility(0);
                    this.btnSecondPromoAction.setOnClickListener(new View.OnClickListener(this, downloadFileHandle, scaleListener.getMax) {
                        private final PromoView getMax;
                        private final String length;
                        private final DownloadFileHandle setMax;

                        {
                            this.getMax = r1;
                            this.setMax = r2;
                            this.length = r3;
                        }

                        public final void onClick(View view) {
                            PromoView.getMax(this.getMax, this.setMax, this.length);
                        }
                    });
                } else if (PromoActionType.SECONDARY.equalsIgnoreCase(str2)) {
                    this.btnFirstPromoAction.setActiveButton(scaleListener.length, (Drawable) null);
                    this.btnFirstPromoAction.setVisibility(0);
                    this.btnFirstPromoAction.setOnClickListener(new View.OnClickListener(this, downloadFileHandle, scaleListener.getMax) {
                        private final PromoView getMax;
                        private final String length;
                        private final DownloadFileHandle setMax;

                        {
                            this.getMax = r1;
                            this.setMax = r2;
                            this.length = r3;
                        }

                        public final void onClick(View view) {
                            PromoView.getMax(this.getMax, this.setMax, this.length);
                        }
                    });
                    setOnClickListener(new View.OnClickListener(this, downloadFileHandle, scaleListener.getMax) {
                        private final PromoView getMax;
                        private final String length;
                        private final DownloadFileHandle setMax;

                        {
                            this.getMax = r1;
                            this.setMax = r2;
                            this.length = r3;
                        }

                        public final void onClick(View view) {
                            PromoView.getMax(this.getMax, this.setMax, this.length);
                        }
                    });
                }
            }
        }
    }

    public void clearImage() {
        ((updateCornerMarking) Glide.setMin((View) this)).getMax((layoutChildWithAnchor<?>) new setHorizontalGap.setMin(this.ivPromoBanner));
    }

    public static /* synthetic */ void getMax(PromoView promoView, DownloadFileHandle downloadFileHandle, String str) {
        if (promoView.length != null && promoView.isRichViewClickable()) {
            promoView.disableClick();
            promoView.length.getMax(downloadFileHandle, str);
        }
    }
}
