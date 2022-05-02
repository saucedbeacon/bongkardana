package id.dana.qriscrossborder.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import id.dana.model.QrisCrossBorderContentModel;
import id.dana.tracker.TrackerKey;
import id.dana.webview.WebViewActivity;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.ActionBar$LayoutParams;
import o.IntRange;
import o.dispatchOnCancelled;
import o.evaluate;
import o.getInsetDodgeRect;
import o.isShowMenu;
import o.layoutChildWithAnchor;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.parseBehavior;
import o.resetInternal;
import o.toJavaScript;
import o.updateCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J4\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0010H\u0002J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\b\u0010\u001c\u001a\u00020\tH\u0016J\b\u0010\u001d\u001a\u00020\tH\u0002J\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\b\u0010!\u001a\u00020\tH\u0016J\b\u0010\"\u001a\u00020\tH\u0002J\b\u0010#\u001a\u00020\tH\u0014J\b\u0010$\u001a\u00020\tH\u0014J\u0010\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u000eH\u0002J\b\u0010'\u001a\u00020\tH\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lid/dana/qriscrossborder/view/OnboardingQrisCrossBorderSheetActivity;", "Lid/dana/base/BaseActivity;", "()V", "requestListener", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "configToolbar", "", "createSkeletonScreen", "formatWelcomingInfoText", "Landroid/text/Spanned;", "welcomingInfo", "", "getLayout", "", "getSpannableString", "Landroid/text/SpannableString;", "fullString", "tncString", "tncIndex", "noUnderlineClickableSpan", "Lid/dana/utils/NoUnderlineClickableSpan;", "selectedColor", "getStringFromResByIdentifier", "qcbIdentifier", "countryCode", "init", "initTnC", "loadDataToView", "qcbContentModel", "Lid/dana/model/QrisCrossBorderContentModel;", "onBackPressed", "onClickDismissDialog", "onPause", "onStart", "setImage", "url", "showQrisCrossBorderContentToView", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OnboardingQrisCrossBorderSheetActivity extends BaseActivity {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    @NotNull
    public static final String EXTRA_QCB_CONTENT = "extra_qris_cross_border_content";
    @NotNull
    public static final String EXTRA_QCB_COUNTRY_CODE = "extra_qris_cross_border_country_code";
    /* access modifiers changed from: private */
    public onDetachedFromLayoutParams getMax;
    private HashMap getMin;
    private final parseBehavior<Drawable> setMax = new setMin(this);

    public final void _$_clearFindViewByIdCache() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1692636524, oncanceled);
            onCancelLoad.getMin(1692636524, oncanceled);
        }
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void configToolbar() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext != null && (length = applicationContext.fileList().length) != (min = dispatchOnCancelled.getMin(applicationContext, length))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(616161346, oncanceled);
            onCancelLoad.getMin(616161346, oncanceled);
        }
    }

    public final int getLayout() {
        return R.layout.view_onboarding_qris_cross_border_bottomsheet;
    }

    public final void onBackPressed() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext != null && (length = applicationContext.fileList().length) != (min = dispatchOnCancelled.getMin(applicationContext, length))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1686033197, oncanceled);
            onCancelLoad.getMin(1686033197, oncanceled);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0002J2\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016J:\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"id/dana/qriscrossborder/view/OnboardingQrisCrossBorderSheetActivity$requestListener$1", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "hideSkeletonScreen", "", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "dataSource", "Lcom/bumptech/glide/load/DataSource;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements parseBehavior<Drawable> {
        final /* synthetic */ OnboardingQrisCrossBorderSheetActivity setMin;

        public final boolean onLoadFailed(@Nullable GlideException glideException, @NotNull Object obj, @NotNull layoutChildWithAnchor<Drawable> layoutchildwithanchor, boolean z) {
            Intrinsics.checkNotNullParameter(obj, H5GetLogInfoBridge.RESULT_MODEL);
            Intrinsics.checkNotNullParameter(layoutchildwithanchor, "target");
            return false;
        }

        setMin(OnboardingQrisCrossBorderSheetActivity onboardingQrisCrossBorderSheetActivity) {
            this.setMin = onboardingQrisCrossBorderSheetActivity;
        }

        public final /* synthetic */ boolean onResourceReady(Object obj, Object obj2, layoutChildWithAnchor layoutchildwithanchor, DataSource dataSource, boolean z) {
            return length(obj2, layoutchildwithanchor, dataSource);
        }

        private boolean length(@NotNull Object obj, @NotNull layoutChildWithAnchor<Drawable> layoutchildwithanchor, @NotNull DataSource dataSource) {
            Intrinsics.checkNotNullParameter(obj, H5GetLogInfoBridge.RESULT_MODEL);
            Intrinsics.checkNotNullParameter(layoutchildwithanchor, "target");
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            onDetachedFromLayoutParams access$getSkeletonScreen$p = this.setMin.getMax;
            if (access$getSkeletonScreen$p == null) {
                return false;
            }
            access$getSkeletonScreen$p.length();
            return false;
        }
    }

    public final void onStart() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(1741205252, oncanceled);
            onCancelLoad.getMin(1741205252, oncanceled);
        }
        super.onStart();
        overridePendingTransition(R.anim.f782130772050, R.anim.f822130772054);
    }

    public final void onPause() {
        super.onPause();
        if (isFinishing()) {
            overridePendingTransition(R.anim.f752130772047, R.anim.f792130772051);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ OnboardingQrisCrossBorderSheetActivity setMax;

        getMax(OnboardingQrisCrossBorderSheetActivity onboardingQrisCrossBorderSheetActivity) {
            this.setMax = onboardingQrisCrossBorderSheetActivity;
        }

        public final void onClick(View view) {
            this.setMax.finish();
        }
    }

    static /* synthetic */ SpannableString getSpannableString$default(OnboardingQrisCrossBorderSheetActivity onboardingQrisCrossBorderSheetActivity, String str, String str2, int i, toJavaScript tojavascript, int i2, int i3, Object obj) {
        return onboardingQrisCrossBorderSheetActivity.getMin(str, str2, i, tojavascript, (i3 & 16) != 0 ? R.color.f18632131099744 : i2);
    }

    private final SpannableString getMin(String str, String str2, int i, toJavaScript tojavascript, int i2) {
        SpannableString spannableString = new SpannableString(str);
        if (tojavascript != null) {
            spannableString.setSpan(tojavascript, i, str2.length() + i, 33);
        }
        spannableString.setSpan(new ForegroundColorSpan(IntRange.setMax(this, i2)), i, str2.length() + i, 33);
        spannableString.setSpan(new StyleSpan(1), i, str2.length() + i, 33);
        return spannableString;
    }

    private final String getMin(String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            return getString(getResources().getIdentifier(sb.toString(), "string", getPackageName()));
        } catch (Resources.NotFoundException unused) {
            return ActionBar$LayoutParams.length(str, 0).toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/qriscrossborder/view/OnboardingQrisCrossBorderSheetActivity$Companion;", "", "()V", "DANA_TEXT", "", "EXTRA_QCB_CONTENT", "EXTRA_QCB_COUNTRY_CODE", "STRING_KEY_TYPE", "UNDERSCORE_CONJUNCTIONS", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public final void init() {
        CharSequence charSequence;
        int length;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(304032559, oncanceled);
            onCancelLoad.getMin(304032559, oncanceled);
        }
        getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax((AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setSupportProgress));
        setmax.getMax = R.layout.view_skeleton_gn_onboarding_image;
        setmax.setMax = 1500;
        boolean z = true;
        setmax.length = true;
        setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
        setmax.isInside = 0;
        getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
        getinsetdodgerect.getMin();
        this.getMax = getinsetdodgerect;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1068928102, oncanceled2);
            onCancelLoad.getMin(-1068928102, oncanceled2);
        }
        QrisCrossBorderContentModel qrisCrossBorderContentModel = (QrisCrossBorderContentModel) getIntent().getParcelableExtra(EXTRA_QCB_CONTENT);
        String stringExtra = getIntent().getStringExtra(EXTRA_QCB_COUNTRY_CODE);
        if (stringExtra == null) {
            stringExtra = "";
        }
        String str = stringExtra;
        Intrinsics.checkNotNullExpressionValue(str, "intent.getStringExtra(EX…A_QCB_COUNTRY_CODE) ?: \"\"");
        if (qrisCrossBorderContentModel != null) {
            if (str.length() > 0) {
                TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.onKeyPreIme);
                if (textView != null) {
                    textView.setText(getMin(qrisCrossBorderContentModel.setMin, str));
                }
                String min2 = getMin(qrisCrossBorderContentModel.getMax, str);
                TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.enoughToFilter);
                if (textView2 != null) {
                    CharSequence charSequence2 = min2;
                    if (!(charSequence2 == null || charSequence2.length() == 0)) {
                        z = false;
                    }
                    if (z || !StringsKt.contains$default(charSequence2, (CharSequence) TrackerKey.DanaBalanceRecipientTypeProperty.DANA, false, 2, (Object) null)) {
                        charSequence = String.valueOf(min2);
                    } else {
                        String obj = min2.toString();
                        charSequence = getMin(obj, TrackerKey.DanaBalanceRecipientTypeProperty.DANA, StringsKt.indexOf$default((CharSequence) obj, TrackerKey.DanaBalanceRecipientTypeProperty.DANA, 0, false, 6, (Object) null), (toJavaScript) null, R.color.f18512131099725);
                    }
                    textView2.setText(charSequence);
                }
                TextView textView3 = (TextView) _$_findCachedViewById(resetInternal.setMax.getChildrenSkipCount);
                if (textView3 != null) {
                    textView3.setText(qrisCrossBorderContentModel.setMax);
                }
                DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.extraCommand);
                if (danaButtonPrimaryView != null) {
                    danaButtonPrimaryView.setActiveButton(getMin(qrisCrossBorderContentModel.length, str), (Drawable) null);
                }
                String str2 = qrisCrossBorderContentModel.getMin;
                int max2 = dispatchOnCancelled.getMax(0);
                if (max2 != 0) {
                    onCanceled oncanceled3 = new onCanceled(0, max2, 16);
                    onCancelLoad.setMax(-1632178974, oncanceled3);
                    onCancelLoad.getMin(-1632178974, oncanceled3);
                }
                ((updateCornerMarking) Glide.setMin((FragmentActivity) this)).setMax(str2).onMessageChannelReady().setMax(evaluate.setMin).getMax(this.setMax).length((ImageView) (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setSupportProgress));
            }
        }
        String string = getString(R.string.text_tnc_qcb);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.text_tnc_qcb)");
        String string2 = getString(R.string.tnc);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.tnc)");
        Context context = this;
        SpannableString spannableString$default = getSpannableString$default(this, string, string2, StringsKt.indexOf$default((CharSequence) string, string2, 0, false, 6, (Object) null), new toJavaScript(context, WebViewActivity.ContentBuilder(context, string2, isShowMenu.setMin("/m/standalone/tnc"))), 0, 16, (Object) null);
        TextView textView4 = (TextView) _$_findCachedViewById(resetInternal.setMax.SearchView$SearchAutoComplete);
        Intrinsics.checkNotNullExpressionValue(textView4, "tvTncPrivacyPolicy");
        textView4.setText(spannableString$default);
        TextView textView5 = (TextView) _$_findCachedViewById(resetInternal.setMax.SearchView$SearchAutoComplete);
        Intrinsics.checkNotNullExpressionValue(textView5, "tvTncPrivacyPolicy");
        textView5.setMovementMethod(LinkMovementMethod.getInstance());
        ((DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.extraCommand)).setOnClickListener(new getMax(this));
    }
}
