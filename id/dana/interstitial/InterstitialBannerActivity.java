package id.dana.interstitial;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.model.CdpContentModel;
import id.dana.richview.CurrencyTextView;
import id.dana.richview.LogoProgressView;
import id.dana.tracker.TrackerKey;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import o.BlurProcess;
import o.GriverBridgeNotFoundExtension;
import o.Popup;
import o.WheelView;
import o.convertDipToPx;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.layoutChildWithAnchor;
import o.onCancelLoad;
import o.onCanceled;
import o.parseBehavior;
import o.setContentViewAfter;
import o.updateCornerMarking;
import org.jetbrains.annotations.Nullable;

public class InterstitialBannerActivity extends BaseActivity {
    public static final String KEY_BANNERREAD = "bannerRead";
    public static final String KEY_CDPCONTENTMODEL = "cdpContentModel";
    public static final String KEY_SPACECODE = "spaceCode";
    @BindView(2131361928)
    ImageView bannerImage;
    @BindView(2131362539)
    ImageView close;
    private String getMin;
    @BindView(2131364288)
    LogoProgressView logoProgressView;
    private CdpContentModel setMax;
    @BindView(2131365325)
    TextView tvLoadingBanner;

    public int getLayout() {
        return R.layout.activity_interstitial_banner;
    }

    static /* synthetic */ void access$000(InterstitialBannerActivity interstitialBannerActivity) {
        int length;
        int min;
        Context baseContext = interstitialBannerActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1035687962, oncanceled);
            onCancelLoad.getMin(1035687962, oncanceled);
        }
        interstitialBannerActivity.tvLoadingBanner.setVisibility(8);
        interstitialBannerActivity.logoProgressView.setVisibility(8);
        interstitialBannerActivity.logoProgressView.stopRefresh();
    }

    static /* synthetic */ void access$100(InterstitialBannerActivity interstitialBannerActivity, Bitmap bitmap) {
        int length;
        Context baseContext = interstitialBannerActivity.getBaseContext();
        String str = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(325035322, oncanceled);
            onCancelLoad.getMin(325035322, oncanceled);
        }
        int max = setContentViewAfter.setMax(bitmap) / 1024;
        convertDipToPx.length length2 = new convertDipToPx.length(interstitialBannerActivity.getBaseContext().getApplicationContext());
        length2.getMax = TrackerKey.Event.INTERSTITIAL_BANNER_DOWNLOAD_FINISH;
        convertDipToPx.length max2 = length2.setMax(TrackerKey.PromotionProperty.PROMOTION_CONTENT_ID, interstitialBannerActivity.setMax.getMin).setMax(TrackerKey.PromotionProperty.PROMOTION_CONTENT_TYPE, interstitialBannerActivity.setMax.setMin).setMax(TrackerKey.PromotionProperty.PROMOTION_CONTENT_NAME, interstitialBannerActivity.setMax.getMax);
        Date date = interstitialBannerActivity.setMax.isInside;
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        Locale locale = WheelView.OnWheelViewListener.getMax;
        if (date != null) {
            str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale).format(date);
        }
        convertDipToPx.length max3 = max2.setMax(TrackerKey.PromotionProperty.PROMOTION_EXPIRY_DATE, str).setMax(TrackerKey.PromotionProperty.PROMOTION_SPACE_CODE, interstitialBannerActivity.getMin).getMax(TrackerKey.PromotionProperty.FILE_SIZE, max).setMax(TrackerKey.PromotionProperty.BANNER_URL, interstitialBannerActivity.setMax.setMax);
        max3.setMin();
        genTextSelector.getMax(new convertDipToPx(max3, (byte) 0));
    }

    public static Intent createIntent(BaseActivity baseActivity, CdpContentModel cdpContentModel, String str) {
        Intent intent = new Intent(baseActivity, InterstitialBannerActivity.class);
        intent.putExtra(KEY_CDPCONTENTMODEL, cdpContentModel);
        intent.putExtra(KEY_SPACECODE, str);
        return intent;
    }

    public void configToolbar() {
        throw new UnsupportedOperationException();
    }

    public void init() {
        int length;
        int min;
        int length2;
        int min2;
        this.getMin = getIntent().getStringExtra(KEY_SPACECODE);
        CdpContentModel cdpContentModel = (CdpContentModel) getIntent().getParcelableExtra(KEY_CDPCONTENTMODEL);
        this.setMax = cdpContentModel;
        if (cdpContentModel != null) {
            String str = cdpContentModel.setMax;
            if (TextUtils.isEmpty(str)) {
                setResult(0);
                finish();
            }
            Context baseContext = getBaseContext();
            Context context = null;
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext, length2)))) {
                onCanceled oncanceled = new onCanceled(length2, min2, 32);
                onCancelLoad.setMax(468520861, oncanceled);
                onCancelLoad.getMin(468520861, oncanceled);
            }
            this.tvLoadingBanner.setVisibility(0);
            this.logoProgressView.setVisibility(0);
            this.logoProgressView.startRefresh();
            Popup.setMin(str, this.bannerImage, new GriverBridgeNotFoundExtension(this));
            CdpContentModel cdpContentModel2 = this.setMax;
            Context baseContext2 = getBaseContext();
            if (baseContext2 != null) {
                context = baseContext2.getApplicationContext();
            }
            if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
                onCanceled oncanceled2 = new onCanceled(length, min, 32);
                onCancelLoad.setMax(1437722968, oncanceled2);
                onCancelLoad.getMin(1437722968, oncanceled2);
            }
            BlurProcess.getMin((Context) this, cdpContentModel2, "Promotion Banner Appear", this.getMin);
        }
    }

    @OnClick({2131362539})
    public void onClose() {
        setMax(false);
    }

    @OnClick({2131361928})
    public void openRedirectUrl() {
        setMax(true);
    }

    public void onBackPressed() {
        setMax(false);
    }

    private void setMax(boolean z) {
        Intent intent = new Intent();
        intent.putExtra(KEY_CDPCONTENTMODEL, this.setMax);
        intent.putExtra(KEY_SPACECODE, this.getMin);
        intent.putExtra(KEY_BANNERREAD, z);
        setResult(-1, intent);
        finish();
    }

    @OnClick({2131363988})
    public void dissmissInterstitialBanner() {
        setMax(false);
    }

    public static /* synthetic */ void setMax(InterstitialBannerActivity interstitialBannerActivity, String str, ImageView imageView) {
        int length;
        Context baseContext = interstitialBannerActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-1486978372, oncanceled);
            onCancelLoad.getMin(-1486978372, oncanceled);
        }
        BlurProcess.getMin(TrackerKey.Event.INTERSTITIAL_BANNER_DOWNLOAD_FINISH);
        ((updateCornerMarking) Glide.setMin((FragmentActivity) interstitialBannerActivity)).equals().length(str).setMax((int) R.color.f24762131100430).getMax(new parseBehavior<Bitmap>() {
            public final /* synthetic */ boolean onResourceReady(Object obj, Object obj2, layoutChildWithAnchor layoutchildwithanchor, DataSource dataSource, boolean z) {
                return setMin((Bitmap) obj);
            }

            public final boolean onLoadFailed(@Nullable @androidx.annotation.Nullable GlideException glideException, Object obj, layoutChildWithAnchor<Bitmap> layoutchildwithanchor, boolean z) {
                InterstitialBannerActivity.access$000(InterstitialBannerActivity.this);
                return false;
            }

            private boolean setMin(Bitmap bitmap) {
                InterstitialBannerActivity.access$000(InterstitialBannerActivity.this);
                InterstitialBannerActivity.access$100(InterstitialBannerActivity.this, bitmap);
                return false;
            }
        }).length(imageView);
    }
}
