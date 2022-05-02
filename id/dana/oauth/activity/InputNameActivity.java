package id.dana.oauth.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.component.edittextcomponent.DanaEditTextView;
import id.dana.oauth.activity.OauthGrantActivity;
import id.dana.oauth.model.OauthParamsModel;
import id.dana.richview.LogoProgressView;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.RedDotManager;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getScreenBrightness;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import o.setProgressViewOffset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0011\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\rH\u0002J\b\u0010\u001b\u001a\u00020\rH\u0016J\b\u0010\u001c\u001a\u00020\rH\u0002J\b\u0010\u001d\u001a\u00020\rH\u0002J\b\u0010\u001e\u001a\u00020\rH\u0002J\b\u0010\u001f\u001a\u00020\rH\u0002J\u0016\u0010 \u001a\u00020\u00102\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\"H\u0002J\u0016\u0010#\u001a\u00020\r2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\"H\u0016J\b\u0010$\u001a\u00020\rH\u0014J\u0012\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u0010H\u0016J\u0010\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0010H\u0002J\b\u0010+\u001a\u00020\rH\u0002J\b\u0010,\u001a\u00020\rH\u0016J\u0010\u0010-\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0019H\u0002J\u0018\u0010.\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u0019H\u0002J\b\u00100\u001a\u00020\rH\u0002J\b\u00101\u001a\u00020\rH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u00063"}, d2 = {"Lid/dana/oauth/activity/InputNameActivity;", "Lid/dana/base/BaseActivity;", "Lid/dana/oauth/InputNameContract$View;", "()V", "oauthParamsModel", "Lid/dana/oauth/model/OauthParamsModel;", "presenter", "Lid/dana/oauth/InputNameContract$Presenter;", "getPresenter", "()Lid/dana/oauth/InputNameContract$Presenter;", "setPresenter", "(Lid/dana/oauth/InputNameContract$Presenter;)V", "configToolbar", "", "dismissProgress", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "getDanaButtonViewType", "", "text", "", "getLayout", "getMerchantName", "", "goToAgreementPage", "init", "initComponent", "initContinueButton", "initInject", "initSkipButton", "isMerchantSkipButtonEnable", "merchantIdEnable", "", "onCheckSkipButtonMerchantList", "onDestroy", "onUpdateNameFailed", "errorMessage", "onUpdateNameSuccess", "isSuccess", "setLoadingState", "isLoading", "setupDetUsernameTextChanges", "showProgress", "showSnackbar", "trackCompletedInputNamePageEvent", "failedReason", "trackOpenInputNamePageEvent", "trackSkipInputNamePageEvent", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class InputNameActivity extends BaseActivity implements getScreenBrightness.getMax {
    @NotNull
    public static final length Companion = new length((byte) 0);
    private OauthParamsModel getMax;
    private HashMap getMin;
    @Inject
    public getScreenBrightness.setMax presenter;

    @JvmStatic
    @NotNull
    public static final Intent createIntent(@NotNull Context context, @NotNull OauthParamsModel oauthParamsModel) {
        return length.length(context, oauthParamsModel);
    }

    public final void _$_clearFindViewByIdCache() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1989891636, oncanceled);
            onCancelLoad.getMin(-1989891636, oncanceled);
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

    public final int getLayout() {
        return R.layout.activity_input_name;
    }

    @JvmDefault
    public final void onError(@Nullable String str) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T> implements RedDotManager<CharSequence> {
        final /* synthetic */ InputNameActivity setMin;

        setMax(InputNameActivity inputNameActivity) {
            this.setMin = inputNameActivity;
        }

        public final /* synthetic */ void accept(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            InputNameActivity inputNameActivity = this.setMin;
            Intrinsics.checkNotNullExpressionValue(charSequence, "it");
            ((DanaButtonPrimaryView) this.setMin._$_findCachedViewById(resetInternal.setMax.ContentView)).setDanaButtonView(InputNameActivity.access$getDanaButtonViewType(inputNameActivity, charSequence), this.setMin.getString(R.string.option_continue), "", (Drawable) null);
            DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) this.setMin._$_findCachedViewById(resetInternal.setMax.ContentView);
            Intrinsics.checkNotNullExpressionValue(danaButtonPrimaryView, "dbpContinue");
            danaButtonPrimaryView.setClickable(!StringsKt.isBlank(charSequence));
        }
    }

    @NotNull
    public final getScreenBrightness.setMax getPresenter() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -119776392 == (max = dispatchOnCancelled.getMax(applicationContext, -119776392)))) {
            onCanceled oncanceled = new onCanceled(-119776392, max, 512);
            onCancelLoad.setMax(-119776392, oncanceled);
            onCancelLoad.getMin(-119776392, oncanceled);
        }
        getScreenBrightness.setMax setmax = this.presenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return setmax;
    }

    public final void setPresenter(@NotNull getScreenBrightness.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        this.presenter = setmax;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lid/dana/oauth/activity/InputNameActivity$Companion;", "", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "oauthParamsModel", "Lid/dana/oauth/model/OauthParamsModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }

        @JvmStatic
        @NotNull
        public static Intent length(@NotNull Context context, @NotNull OauthParamsModel oauthParamsModel) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(oauthParamsModel, "oauthParamsModel");
            Intent intent = new Intent(context, InputNameActivity.class);
            intent.putExtra("oauth", oauthParamsModel);
            intent.setFlags(268468224);
            return intent;
        }
    }

    public final void configToolbar() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-760288606, oncanceled);
            onCancelLoad.getMin(-760288606, oncanceled);
        }
        setCenterTitle(getString(R.string.oauth_input_name_title));
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
    }

    public final void showProgress() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-873735465, oncanceled);
            onCancelLoad.getMin(-873735465, oncanceled);
        }
        getMax(true);
    }

    public final void dismissProgress() {
        getMax(false);
    }

    public final void onUpdateNameSuccess(boolean z) {
        length(z, "");
        OauthGrantActivity.getMin getmin = OauthGrantActivity.Companion;
        startActivity(OauthGrantActivity.getMin.setMax(this, (OauthParamsModel) getIntent().getParcelableExtra("oauth")));
    }

    public final void onUpdateNameFailed(@Nullable String str) {
        if (str == null) {
            str = getString(R.string.system_busy_error);
            Intrinsics.checkNotNullExpressionValue(str, "getString(R.string.system_busy_error)");
        }
        length(false, str);
        String string = getString(R.string.general_error_msg);
        Intrinsics.checkNotNullExpressionValue(string, "ErrorUtil.GeneralError(this)");
        View findViewById = findViewById(16908290);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(android.R.id.content)");
        setProgressViewOffset.setMax setmax = new setProgressViewOffset.setMax((ViewGroup) findViewById);
        setmax.getMax = string;
        setmax.toIntRange = -1;
        setmax.setMin = R.drawable.ic_warning_orange;
        setmax.getMin = R.drawable.bg_custom_snackbar;
        setmax.getMax().show();
    }

    public final void onCheckSkipButtonMerchantList(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "merchantIdEnable");
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.from);
        Intrinsics.checkNotNullExpressionValue(danaButtonSecondaryView, "dbsSkip");
        danaButtonSecondaryView.setVisibility(setMax(set) ? 0 : 8);
    }

    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        int max;
        Context baseContext = getBaseContext();
        IBinder iBinder = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 264084561 == (max = dispatchOnCancelled.getMax(applicationContext, 264084561)))) {
            onCanceled oncanceled = new onCanceled(264084561, max, 512);
            onCancelLoad.setMax(264084561, oncanceled);
            onCancelLoad.getMin(264084561, oncanceled);
        }
        Object systemService = getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            View currentFocus = getCurrentFocus();
            if (currentFocus != null) {
                iBinder = currentFocus.getWindowToken();
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            return super.dispatchTouchEvent(motionEvent);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    public final void onDestroy() {
        super.onDestroy();
        getScreenBrightness.setMax setmax = this.presenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setmax.setMax();
    }

    private final boolean setMax(Set<String> set) {
        OauthParamsModel oauthParamsModel = this.getMax;
        if (oauthParamsModel != null) {
            return CollectionsKt.contains(set, oauthParamsModel.equals);
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ InputNameActivity setMin;

        setMin(InputNameActivity inputNameActivity) {
            this.setMin = inputNameActivity;
        }

        public final void onClick(View view) {
            getScreenBrightness.setMax presenter = this.setMin.getPresenter();
            DanaEditTextView danaEditTextView = (DanaEditTextView) this.setMin._$_findCachedViewById(resetInternal.setMax.GuardedBy);
            Intrinsics.checkNotNullExpressionValue(danaEditTextView, "detUsername");
            String valueOf = String.valueOf(danaEditTextView.getText());
            if (valueOf != null) {
                presenter.setMin(StringsKt.trim((CharSequence) valueOf).toString());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ InputNameActivity setMax;

        getMin(InputNameActivity inputNameActivity) {
            this.setMax = inputNameActivity;
        }

        public final void onClick(View view) {
            InputNameActivity.access$trackSkipInputNamePageEvent(this.setMax);
            InputNameActivity.access$goToAgreementPage(this.setMax);
        }
    }

    private final void getMax(boolean z) {
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.ContentView);
        Intrinsics.checkNotNullExpressionValue(danaButtonPrimaryView, "dbpContinue");
        danaButtonPrimaryView.setClickable(!z);
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.from);
        Intrinsics.checkNotNullExpressionValue(danaButtonSecondaryView, "dbsSkip");
        danaButtonSecondaryView.setClickable(!z);
        DanaEditTextView danaEditTextView = (DanaEditTextView) _$_findCachedViewById(resetInternal.setMax.GuardedBy);
        Intrinsics.checkNotNullExpressionValue(danaEditTextView, "detUsername");
        danaEditTextView.setFocusableInTouchMode(!z);
        LogoProgressView logoProgressView = (LogoProgressView) _$_findCachedViewById(resetInternal.setMax.setOptionalIconsVisible);
        Intrinsics.checkNotNullExpressionValue(logoProgressView, "logoProgressView");
        logoProgressView.setVisibility(z ? 0 : 8);
        if (z) {
            ((LogoProgressView) _$_findCachedViewById(resetInternal.setMax.setOptionalIconsVisible)).startRefresh();
        } else {
            ((LogoProgressView) _$_findCachedViewById(resetInternal.setMax.setOptionalIconsVisible)).stopRefresh();
        }
    }

    private final String setMin() {
        String str;
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-865554446, oncanceled);
            onCancelLoad.getMin(-865554446, oncanceled);
        }
        OauthParamsModel oauthParamsModel = (OauthParamsModel) getIntent().getParcelableExtra("oauth");
        return (oauthParamsModel == null || (str = oauthParamsModel.toDoubleRange) == null) ? "" : str;
    }

    private final void length(boolean z, String str) {
        convertDipToPx.length length2 = new convertDipToPx.length(this);
        length2.getMax = TrackerKey.Event.ADD_NAME_COMPLETED;
        convertDipToPx.length min = length2.setMax("Merchant Name", setMin()).setMin("Success", z);
        if (str.length() > 0) {
            min.setMax(TrackerKey.Property.FAIL_REASON, str);
        }
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    /* JADX WARNING: type inference failed for: r0v26, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void init() {
        /*
            r5 = this;
            o.convertDipToPx$length r0 = new o.convertDipToPx$length
            r1 = r5
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1)
            java.lang.String r1 = "Add Name Open"
            r0.getMax = r1
            java.lang.String r1 = r5.setMin()
            java.lang.String r2 = "Merchant Name"
            o.convertDipToPx$length r0 = r0.setMax(r2, r1)
            r0.setMin()
            o.convertDipToPx r1 = new o.convertDipToPx
            r2 = 0
            r1.<init>(r0, r2)
            o.convertDipToPx$length r0 = r1.length
            if (r0 == 0) goto L_0x002a
            o.convertDipToPx$length r0 = r1.length
            java.util.List r0 = r0.length
            goto L_0x002f
        L_0x002a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x002f:
            int r1 = r0.size()
            o.convertSpToPx[] r1 = new o.convertSpToPx[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            o.convertSpToPx[] r0 = (o.convertSpToPx[]) r0
            o.genTextSelector.setMax(r0)
            o.readFile$setMax r0 = new o.readFile$setMax
            r0.<init>(r2)
            o.PrepareException$1 r1 = r5.getApplicationComponent()
            r3 = 0
            if (r1 == 0) goto L_0x0125
            o.PrepareException$1 r1 = (o.PrepareException.AnonymousClass1) r1
            r0.getMin = r1
            id.dana.di.modules.InputNameModule r1 = new id.dana.di.modules.InputNameModule
            r4 = r5
            o.getScreenBrightness$getMax r4 = (o.getScreenBrightness.getMax) r4
            r1.<init>(r4)
            id.dana.di.modules.InputNameModule r1 = (id.dana.di.modules.InputNameModule) r1
            r0.length = r1
            id.dana.di.modules.InputNameModule r1 = r0.length
            java.lang.Class<id.dana.di.modules.InputNameModule> r4 = id.dana.di.modules.InputNameModule.class
            o.stopIgnoring.setMin(r1, r4)
            o.PrepareException$1 r1 = r0.getMin
            java.lang.Class<o.PrepareException$1> r4 = o.PrepareException.AnonymousClass1.class
            o.stopIgnoring.setMin(r1, r4)
            o.readFile r1 = new o.readFile
            id.dana.di.modules.InputNameModule r4 = r0.length
            o.PrepareException$1 r0 = r0.getMin
            r1.<init>(r4, r0, r2)
            r1.length(r5)
            android.content.Context r0 = r5.getBaseContext()
            if (r0 == 0) goto L_0x007f
            android.content.Context r0 = r0.getApplicationContext()
            goto L_0x0080
        L_0x007f:
            r0 = r3
        L_0x0080:
            if (r0 == 0) goto L_0x0097
            int r0 = o.dispatchOnCancelled.length(r0, r2)
            if (r0 == 0) goto L_0x0097
            o.onCanceled r1 = new o.onCanceled
            r4 = 4
            r1.<init>(r2, r0, r4)
            r0 = 310236252(0x127dd45c, float:8.0094477E-28)
            o.onCancelLoad.setMax(r0, r1)
            o.onCancelLoad.getMin(r0, r1)
        L_0x0097:
            int r0 = o.resetInternal.setMax.ContentView
            android.view.View r0 = r5._$_findCachedViewById(r0)
            id.dana.component.buttoncomponent.DanaButtonPrimaryView r0 = (id.dana.component.buttoncomponent.DanaButtonPrimaryView) r0
            id.dana.oauth.activity.InputNameActivity$setMin r1 = new id.dana.oauth.activity.InputNameActivity$setMin
            r1.<init>(r5)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            android.content.Context r0 = r5.getBaseContext()
            if (r0 == 0) goto L_0x00b4
            android.content.Context r0 = r0.getApplicationContext()
            goto L_0x00b5
        L_0x00b4:
            r0 = r3
        L_0x00b5:
            if (r0 == 0) goto L_0x00d2
            java.lang.String[] r1 = r0.fileList()
            int r1 = r1.length
            int r0 = o.dispatchOnCancelled.getMin(r0, r1)
            if (r1 == r0) goto L_0x00d2
            o.onCanceled r2 = new o.onCanceled
            r4 = 32
            r2.<init>(r1, r0, r4)
            r0 = 1324159698(0x4eed12d2, float:1.9887168E9)
            o.onCancelLoad.setMax(r0, r2)
            o.onCancelLoad.getMin(r0, r2)
        L_0x00d2:
            int r0 = o.resetInternal.setMax.from
            android.view.View r0 = r5._$_findCachedViewById(r0)
            id.dana.component.buttoncomponent.DanaButtonSecondaryView r0 = (id.dana.component.buttoncomponent.DanaButtonSecondaryView) r0
            id.dana.oauth.activity.InputNameActivity$getMin r1 = new id.dana.oauth.activity.InputNameActivity$getMin
            r1.<init>(r5)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            int r0 = o.resetInternal.setMax.GuardedBy
            android.view.View r0 = r5._$_findCachedViewById(r0)
            id.dana.component.edittextcomponent.DanaEditTextView r0 = (id.dana.component.edittextcomponent.DanaEditTextView) r0
            o.AudioAttributesImplBase r0 = o.onLoadChildren.textChanges(r0)
            id.dana.oauth.activity.InputNameActivity$setMax r1 = new id.dana.oauth.activity.InputNameActivity$setMax
            r1.<init>(r5)
            o.RedDotManager r1 = (o.RedDotManager) r1
            o.GriverProgressBar$UpdateRunnable r0 = r0.subscribe(r1)
            r5.addDisposable(r0)
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0116
            java.lang.String r1 = "oauth"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            r3 = r0
            id.dana.oauth.model.OauthParamsModel r3 = (id.dana.oauth.model.OauthParamsModel) r3
        L_0x0116:
            r5.getMax = r3
            o.getScreenBrightness$setMax r0 = r5.presenter
            if (r0 != 0) goto L_0x0121
            java.lang.String r1 = "presenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0121:
            r0.getMax()
            return
        L_0x0125:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.oauth.activity.InputNameActivity.init():void");
    }

    public static final /* synthetic */ void access$trackSkipInputNamePageEvent(InputNameActivity inputNameActivity) {
        convertDipToPx.length length2 = new convertDipToPx.length(inputNameActivity);
        length2.getMax = TrackerKey.Event.ADD_NAME_SKIP;
        convertDipToPx.length max = length2.setMax("Merchant Name", inputNameActivity.setMin());
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    public static final /* synthetic */ void access$goToAgreementPage(InputNameActivity inputNameActivity) {
        OauthGrantActivity.getMin getmin = OauthGrantActivity.Companion;
        inputNameActivity.startActivity(OauthGrantActivity.getMin.setMax(inputNameActivity, (OauthParamsModel) inputNameActivity.getIntent().getParcelableExtra("oauth")));
    }

    public static final /* synthetic */ int access$getDanaButtonViewType(InputNameActivity inputNameActivity, CharSequence charSequence) {
        return StringsKt.isBlank(charSequence) ? 0 : 1;
    }
}
