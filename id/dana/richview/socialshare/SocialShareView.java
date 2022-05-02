package id.dana.richview.socialshare;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;
import com.bumptech.glide.Glide;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.SocialShareModule;
import id.dana.richview.socialshare.SocialShareView;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.OrientationDetector;
import o.PrepareException;
import o.createTimer;
import o.evaluate;
import o.findBestPreviewSizeValue;
import o.getChildrenSkipCount;
import o.getLineColor;
import o.getScreenSize;
import o.isBaselineAligned;
import o.resetInternal;
import o.setH5OptionMenuTextFlag;
import o.stopIgnoring;
import o.updateActionSheetContent;
import o.updateCornerMarking;

public class SocialShareView extends BaseRichView implements OrientationDetector.MyTabOrientationListener.length {
    @BindView(2131362307)
    CircleImageView civSocialShareFirst;
    @BindView(2131362308)
    CircleImageView civSocialShareSecond;
    @BindView(2131362309)
    CircleImageView civSocialShareThird;
    private int equals;
    private String getMax = "";
    private boolean getMin;
    private boolean length;
    @BindView(2131363927)
    LinearLayout llShareFirst;
    @BindView(2131363928)
    LinearLayout llShareOthers;
    @BindView(2131363929)
    LinearLayout llShareQr;
    @BindView(2131363930)
    LinearLayout llShareSecond;
    @BindView(2131363931)
    LinearLayout llShareThird;
    @BindView(2131363858)
    LinearLayout llViewContainer;
    @Inject
    public OrientationDetector.MyTabOrientationListener.setMin presenter;
    private List<getScreenSize> setMax;
    private String setMin;
    @BindView(2131365106)
    TextView tvAppNameFirst;
    @BindView(2131365107)
    TextView tvAppNameSecond;
    @BindView(2131365108)
    TextView tvAppNameThird;
    @BindView(2131365565)
    TextView tvSocialShareFirst;
    @BindView(2131365566)
    TextView tvSocialShareOthers;
    @BindView(2131365567)
    TextView tvSocialShareSecond;
    @BindView(2131365568)
    TextView tvSocialShareThird;
    @BindView(2131365569)
    TextView tvSocialShareTitle;

    public void dismissProgress() {
    }

    public int getLayout() {
        return R.layout.view_social_share;
    }

    public void onError(String str) {
    }

    public void showProgress() {
    }

    public SocialShareView(@NonNull Context context) {
        super(context);
    }

    public SocialShareView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SocialShareView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SocialShareView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void attachImageWithGlide(int i, CircleImageView circleImageView) {
        ((updateCornerMarking) Glide.getMax(getContext())).length(Integer.valueOf(i)).setMax(evaluate.setMin).extraCallbackWithResult().length((ImageView) circleImageView);
    }

    public void shareToSocialApp(String str) {
        try {
            Intent min = getLineColor.getMin(setH5OptionMenuTextFlag.setMin(this.getMax).getMin("link", this.setMin).getMax());
            if (getLineColor.getMax(getContext(), str)) {
                min.setPackage(str);
                getContext().startActivity(min);
                return;
            }
            showMessage(getResources().getString(R.string.social_share_pop_up_description));
        } catch (ActivityNotFoundException e) {
            showMessage(getResources().getString(R.string.share_failed));
            updateActionSheetContent.e(DanaLogConstants.TAG.SOCIAL_SHARE_TAG, DanaLogConstants.Prefix.SOCIAL_SHARE_INTENT_PREFIX, e);
        }
    }

    public void showMessage(String str) {
        new isBaselineAligned(getContext(), isBaselineAligned.getDEFAULT_BEHAVIOR()).cancelable(false).message((Integer) null, str, (Function1<? super getChildrenSkipCount, Unit>) null).positiveButton(Integer.valueOf(R.string.social_share_pop_up_button), (CharSequence) null, (Function1<? super isBaselineAligned, Unit>) null).show();
    }

    public void setEnableShareButton(boolean z) {
        this.getMin = z;
    }

    public void setSocialShareViewTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.tvSocialShareTitle.setText(charSequence, TextView.BufferType.SPANNABLE);
        } else {
            this.tvSocialShareTitle.setVisibility(8);
        }
    }

    public void setSocialButtonText(String str) {
        for (getScreenSize next : this.setMax) {
            if (str.isEmpty()) {
                next.getMax.setVisibility(8);
            }
            next.getMax.setText(str);
        }
    }

    public void setSharingMessage(String str, String str2) {
        this.getMax = str;
        this.setMin = str2;
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131362305, 2131365566})
    public void setOnClickOthers() {
        if (this.getMin) {
            getContext().startActivity(Intent.createChooser(getLineColor.getMin(setH5OptionMenuTextFlag.setMin(this.getMax).getMin("link", this.setMin).getMax()), getContext().getString(R.string.share_via)));
        }
    }

    public void setOthersButtonText(String str) {
        this.tvSocialShareOthers.setText(str);
    }

    public void setShareQrOnClickListener(View.OnClickListener onClickListener) {
        this.llShareQr.setOnClickListener(onClickListener);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, resetInternal.getMin.ComponentActivity$3);
            try {
                this.length = obtainStyledAttributes.getBoolean(0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r1 == 0) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSuccessGetSocialMediaCategoryShare(java.util.List<java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x003d
            r0 = 0
        L_0x0007:
            int r1 = r5.size()
            r2 = 3
            if (r1 < r2) goto L_0x0018
            int r1 = r4.equals
            r3 = 1
            if (r1 != r3) goto L_0x0015
            r2 = 2
            goto L_0x001c
        L_0x0015:
            if (r1 != 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            int r2 = r5.size()
        L_0x001c:
            if (r0 >= r2) goto L_0x003c
            android.content.Context r1 = r4.getContext()
            java.lang.Object r2 = r5.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            o.findBestPreviewSizeValue r1 = o.isActivityLandscape.length(r1, r2)
            if (r1 == 0) goto L_0x0039
            java.util.List<o.getScreenSize> r2 = r4.setMax
            java.lang.Object r2 = r2.get(r0)
            o.getScreenSize r2 = (o.getScreenSize) r2
            r4.updateSocialShareButton(r2, r1, r0)
        L_0x0039:
            int r0 = r0 + 1
            goto L_0x0007
        L_0x003c:
            return
        L_0x003d:
            android.widget.LinearLayout r5 = r4.llViewContainer
            r0 = 8
            r5.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.richview.socialshare.SocialShareView.onSuccessGetSocialMediaCategoryShare(java.util.List):void");
    }

    public void updateSocialShareButton(getScreenSize getscreensize, findBestPreviewSizeValue findbestpreviewsizevalue, int i) {
        attachImageWithGlide(findbestpreviewsizevalue.setMin, getscreensize.setMax);
        getscreensize.setMax.setImageResource(findbestpreviewsizevalue.setMin);
        getscreensize.length.setText(findbestpreviewsizevalue.getMin);
        getscreensize.setMin.setVisibility(0);
        getscreensize.setMax.setContentDescription(findbestpreviewsizevalue.length);
        getscreensize.setMax.setOnClickListener(new View.OnClickListener(this, findbestpreviewsizevalue) {
            private final findBestPreviewSizeValue getMax;
            private final SocialShareView length;

            {
                this.length = r1;
                this.getMax = r2;
            }

            public final void onClick(View view) {
                this.length.shareToSocialApp(this.getMax.getMax);
            }
        });
        getscreensize.getMax.setOnClickListener(new OrientationDetector.MySensorEventListener(this, findbestpreviewsizevalue));
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        createTimer.setMax setmax = new createTimer.setMax((byte) 0);
        if (r4 != null) {
            setmax.getMax = r4;
            setmax.getMin = new SocialShareModule(this);
            stopIgnoring.setMin(setmax.getMin, SocialShareModule.class);
            stopIgnoring.setMin(setmax.getMax, PrepareException.AnonymousClass1.class);
            new createTimer(setmax.getMin, setmax.getMax, (byte) 0).setMin(this);
            registerPresenter(this.presenter);
            return;
        }
        throw null;
    }

    public void setup() {
        ArrayList arrayList = new ArrayList();
        this.setMax = arrayList;
        arrayList.add(new getScreenSize(this.llShareFirst, this.tvSocialShareFirst, this.tvAppNameFirst, this.civSocialShareFirst));
        this.setMax.add(new getScreenSize(this.llShareSecond, this.tvSocialShareSecond, this.tvAppNameSecond, this.civSocialShareSecond));
        this.setMax.add(new getScreenSize(this.llShareThird, this.tvSocialShareThird, this.tvAppNameThird, this.civSocialShareThird));
        this.presenter.setMin();
        boolean z = this.length;
        this.equals = z ? 1 : 0;
        this.llShareQr.setVisibility(z ? 0 : 8);
    }
}
