package id.dana.globalnetwork.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.model.GnContentModel;
import id.dana.webview.WebViewActivity;
import o.IntRange;
import o.dispatchOnCancelled;
import o.getInsetDodgeRect;
import o.isShowMenu;
import o.layoutChildWithAnchor;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.parseBehavior;
import o.toJavaScript;
import o.updateActionSheetContent;
import o.updateCornerMarking;

public class OnboardingGlobalNetworkSheetActivity extends BaseActivity {
    public static final String EXTRA_GN_CONTENT = "extra_gn_content";
    public static final String EXTRA_GN_COUNTRY_CODE = "extraGnCountryCode";
    @BindView(2131362139)
    DanaButtonPrimaryView btnStart;
    private parseBehavior<Drawable> getMax = new parseBehavior<Drawable>() {
        public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<Drawable> layoutchildwithanchor, boolean z) {
            return false;
        }

        public final /* synthetic */ boolean onResourceReady(Object obj, Object obj2, layoutChildWithAnchor layoutchildwithanchor, DataSource dataSource, boolean z) {
            return getMax();
        }

        private boolean getMax() {
            if (OnboardingGlobalNetworkSheetActivity.this.setMax == null) {
                return false;
            }
            OnboardingGlobalNetworkSheetActivity.this.setMax.length();
            return false;
        }
    };
    @BindView(2131363551)
    ImageView ivOnboardingImage;
    /* access modifiers changed from: private */
    public onDetachedFromLayoutParams setMax;
    @BindView(2131365634)
    TextView textTnc;
    @BindView(2131365673)
    TextView tvWelcoming;
    @BindView(2131365674)
    TextView tvWelcomingInfo;

    public void configToolbar() {
    }

    public int getLayout() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0) {
            return R.layout.view_onboarding_global_network_bottomsheet;
        }
        onCanceled oncanceled = new onCanceled(0, length, 4);
        onCancelLoad.setMax(348389366, oncanceled);
        onCancelLoad.getMin(348389366, oncanceled);
        return R.layout.view_onboarding_global_network_bottomsheet;
    }

    public void onBackPressed() {
    }

    public void onStart() {
        super.onStart();
        overridePendingTransition(R.anim.f782130772050, R.anim.f822130772054);
    }

    public void init() {
        int max;
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(643198764, oncanceled);
            onCancelLoad.getMin(643198764, oncanceled);
        }
        getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.ivOnboardingImage);
        setmax.getMax = R.layout.view_skeleton_gn_onboarding_image;
        setmax.setMax = 1500;
        setmax.length = true;
        setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
        setmax.isInside = 0;
        getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
        getinsetdodgerect.getMin();
        this.setMax = getinsetdodgerect;
        GnContentModel gnContentModel = (GnContentModel) getIntent().getParcelableExtra(EXTRA_GN_CONTENT);
        String stringExtra = getIntent().getStringExtra(EXTRA_GN_COUNTRY_CODE);
        Context context = null;
        if (gnContentModel != null && !stringExtra.isEmpty()) {
            try {
                this.tvWelcoming.setText(setMax(gnContentModel.getMin, stringExtra));
                this.tvWelcomingInfo.setText(setMax(gnContentModel.setMin, stringExtra));
                this.btnStart.setActiveButton(setMax(gnContentModel.getMax, stringExtra), (Drawable) null);
                ((updateCornerMarking) Glide.setMin((FragmentActivity) this)).setMax(gnContentModel.length).onMessageChannelReady().getMax(this.getMax).length(this.ivOnboardingImage);
            } catch (Resources.NotFoundException e) {
                updateActionSheetContent.e("Global Network", e.getMessage());
                this.tvWelcoming.setText(gnContentModel.getMin);
                this.tvWelcomingInfo.setText(gnContentModel.setMin);
                this.btnStart.setActiveButton(gnContentModel.getMax, (Drawable) null);
                ((updateCornerMarking) Glide.setMin((FragmentActivity) this)).setMax(gnContentModel.length).onMessageChannelReady().getMax(this.getMax).length(this.ivOnboardingImage);
            }
        }
        int max3 = dispatchOnCancelled.getMax(0);
        if (max3 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max3, 16);
            onCancelLoad.setMax(133774582, oncanceled2);
            onCancelLoad.getMin(133774582, oncanceled2);
        }
        String string = getString(R.string.text_tnc_gn);
        String string2 = getString(R.string.tnc);
        int indexOf = string.indexOf(string2);
        toJavaScript tojavascript = new toJavaScript(this, WebViewActivity.ContentBuilder(this, string2, isShowMenu.setMin("/m/globalnetwork/tnc")));
        Context baseContext = getBaseContext();
        if (baseContext != null) {
            context = baseContext.getApplicationContext();
        }
        if (!(context == null || -38155070 == (max = dispatchOnCancelled.getMax(context, -38155070)))) {
            onCanceled oncanceled3 = new onCanceled(-38155070, max, 512);
            onCancelLoad.setMax(-38155070, oncanceled3);
            onCancelLoad.getMin(-38155070, oncanceled3);
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(tojavascript, indexOf, string2.length() + indexOf, 33);
        spannableString.setSpan(new ForegroundColorSpan(IntRange.setMax(this, R.color.f18632131099744)), indexOf, string2.length() + indexOf, 33);
        spannableString.setSpan(new StyleSpan(1), indexOf, string2.length() + indexOf, 33);
        this.textTnc.setText(spannableString);
        this.textTnc.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            overridePendingTransition(R.anim.f752130772047, R.anim.f792130772051);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131362139})
    public void onClickDismissDialog() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(840360446, oncanceled);
            onCancelLoad.getMin(840360446, oncanceled);
        }
        Intent intent = new Intent();
        intent.putExtra("showTooltip", true);
        setResult(-1, intent);
        finish();
    }

    private String setMax(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return getString(getResources().getIdentifier(sb.toString(), "string", getPackageName()));
    }
}
