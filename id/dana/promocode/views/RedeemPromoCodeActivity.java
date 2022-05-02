package id.dana.promocode.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.di.modules.RedeemPromoCodeModule;
import id.dana.richview.LogoProgressView;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AUScreenUtils;
import o.GriverAMCSAppUpdater;
import o.GriverUpdateProgressExtension;
import o.ImageBridgeExtension;
import o.IntRange;
import o.MyBeaconServiceImpl;
import o.PrepareException;
import o.checkApFlag;
import o.checkOppoConcave;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getPkgStatus;
import o.getShortName;
import o.mapUrl;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.resetInternal;
import o.setLandscape;
import o.setOnWheelViewListener;
import o.setWhiteListAP;
import o.startBeaconDiscovery;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\u0012\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0016H\u0002J\b\u0010!\u001a\u00020\u0016H\u0016J\b\u0010\"\u001a\u00020\u0016H\u0002J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'H\u0002J$\u0010(\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010\u00192\b\u0010*\u001a\u0004\u0018\u00010\u00192\u0006\u0010+\u001a\u00020\u0019H\u0016J$\u0010,\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00192\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010-\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010.\u001a\u00020\u0016H\u0002J\b\u0010/\u001a\u00020\u0016H\u0002J\b\u00100\u001a\u00020\u0016H\u0002J\b\u00101\u001a\u00020\u0016H\u0002J\b\u00102\u001a\u00020\u0016H\u0002J\b\u00103\u001a\u00020\u0016H\u0002J\b\u00104\u001a\u00020\u0016H\u0016J\u0012\u00105\u001a\u00020\u00162\b\u00106\u001a\u0004\u0018\u000107H\u0002J\b\u00108\u001a\u00020\u0016H\u0002J0\u00109\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00192\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0019H\u0002J\f\u0010<\u001a\u00020\u000b*\u00020\u0019H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lid/dana/promocode/views/RedeemPromoCodeActivity;", "Lid/dana/base/BaseActivity;", "Lid/dana/promocode/RedeemPromoCodeContract$View;", "()V", "dynamicUrlWrapper", "Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "getDynamicUrlWrapper", "()Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "setDynamicUrlWrapper", "(Lid/dana/data/dynamicurl/DynamicUrlWrapper;)V", "keyboardShown", "", "prizeInfoEntity", "Lid/dana/domain/promoquest/model/PrizeInfoEntity;", "redeemPromoCodePresenter", "Lid/dana/promocode/RedeemPromoCodeContract$Presenter;", "getRedeemPromoCodePresenter", "()Lid/dana/promocode/RedeemPromoCodeContract$Presenter;", "setRedeemPromoCodePresenter", "(Lid/dana/promocode/RedeemPromoCodeContract$Presenter;)V", "successRedeem", "buttonSubmitState", "", "isEnable", "title", "", "dismissProgress", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "getLayout", "", "handleBundlePayload", "init", "injectComponent", "isNeedToHideKeyboard", "isRedeemButtonTouched", "isViewVisible", "view", "Landroid/view/View;", "onErrorResult", "errorCode", "errorMessage", "code", "onRedeemResult", "campaignId", "scrollToBottom", "setupButtonSubmit", "setupKeyboardListener", "setupPromoCodeInput", "setupToolbar", "setupViews", "showProgress", "showPromoCodeBottomSheet", "promoCodeBottomSheet", "Lid/dana/promocode/views/PromoCodeBottomSheet;", "trackPromoCodeOpen", "trackPromoCodeResult", "success", "failReason", "isCodeLengthCharacterValid", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RedeemPromoCodeActivity extends BaseActivity implements GriverUpdateProgressExtension.length {
    @Inject
    public getShortName dynamicUrlWrapper;
    /* access modifiers changed from: private */
    public GriverAMCSAppUpdater getMax;
    /* access modifiers changed from: private */
    public boolean getMin;
    private HashMap isInside;
    @Inject
    public GriverUpdateProgressExtension.getMax redeemPromoCodePresenter;
    /* access modifiers changed from: private */
    public boolean setMax;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (max = dispatchOnCancelled.getMax(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, max, 512);
            onCancelLoad.setMax(-37802967, oncanceled);
            onCancelLoad.getMin(-37802967, oncanceled);
        }
        if (this.isInside == null) {
            this.isInside = new HashMap();
        }
        View view = (View) this.isInside.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.isInside.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_redeem_promo_code;
    }

    @JvmDefault
    public final void onError(@Nullable String str) {
    }

    @NotNull
    public final GriverUpdateProgressExtension.getMax getRedeemPromoCodePresenter() {
        GriverUpdateProgressExtension.getMax getmax = this.redeemPromoCodePresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("redeemPromoCodePresenter");
        }
        return getmax;
    }

    public final void setRedeemPromoCodePresenter(@NotNull GriverUpdateProgressExtension.getMax getmax) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-854538335, oncanceled);
            onCancelLoad.getMin(-854538335, oncanceled);
        }
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.redeemPromoCodePresenter = getmax;
    }

    @NotNull
    public final getShortName getDynamicUrlWrapper() {
        getShortName getshortname = this.dynamicUrlWrapper;
        if (getshortname == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dynamicUrlWrapper");
        }
        return getshortname;
    }

    public final void setDynamicUrlWrapper(@NotNull getShortName getshortname) {
        Intrinsics.checkNotNullParameter(getshortname, "<set-?>");
        this.dynamicUrlWrapper = getshortname;
    }

    public final void init() {
        String stringExtra;
        int length2;
        int min;
        String string;
        int length3;
        int min2;
        int length4;
        int min3;
        int length5;
        int length6;
        int min4;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length6 = applicationContext.fileList().length) == (min4 = dispatchOnCancelled.getMin(applicationContext, length6)))) {
            onCanceled oncanceled = new onCanceled(length6, min4, 32);
            onCancelLoad.setMax(2114002662, oncanceled);
            onCancelLoad.getMin(2114002662, oncanceled);
        }
        startBeaconDiscovery.length(this);
        getPkgStatus.setMin setmin = new getPkgStatus.setMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            setmin.setMax = applicationComponent;
            setmin.setMin = new RedeemPromoCodeModule(this);
            stopIgnoring.setMin(setmin.setMin, RedeemPromoCodeModule.class);
            stopIgnoring.setMin(setmin.setMax, PrepareException.AnonymousClass1.class);
            new getPkgStatus(setmin.setMin, setmin.setMax, (byte) 0).getMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            GriverUpdateProgressExtension.getMax getmax = this.redeemPromoCodePresenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("redeemPromoCodePresenter");
            }
            getminArr[0] = getmax;
            registerPresenter(getminArr);
            Context baseContext2 = getBaseContext();
            Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
            if (!(applicationContext2 == null || (length5 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
                onCanceled oncanceled2 = new onCanceled(0, length5, 4);
                onCancelLoad.setMax(-1746579674, oncanceled2);
                onCancelLoad.getMin(-1746579674, oncanceled2);
            }
            Window window = getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "window");
            setOnWheelViewListener.getMax(window.getDecorView(), new length(this));
            String str = "";
            setCenterTitle(str);
            setMenuLeftButton((int) R.drawable.btn_arrow_left);
            Context baseContext3 = getBaseContext();
            Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
            if (!(applicationContext3 == null || (length4 = applicationContext3.fileList().length) == (min3 = dispatchOnCancelled.getMin(applicationContext3, length4)))) {
                onCanceled oncanceled3 = new onCanceled(length4, min3, 32);
                onCancelLoad.setMax(-353857921, oncanceled3);
                onCancelLoad.getMin(-353857921, oncanceled3);
            }
            AUScreenUtils.setMin setmin2 = new AUScreenUtils.setMin((EditText) _$_findCachedViewById(resetInternal.setMax.setTitleMarginBottom), (byte) 0);
            checkOppoConcave getmin = new getMin(this);
            if (setmin2.setMin == null) {
                setmin2.setMin = new ArrayList();
            }
            setmin2.setMin.add(getmin);
            setmin2.getMin = new getMax(this);
            setmin2.setMax();
            buttonSubmitState$default(this, false, (String) null, 2, (Object) null);
            DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.MediaDescriptionCompat);
            if (danaButtonSecondaryView != null) {
                danaButtonSecondaryView.setOnClickListener(new setMin(this));
            }
            Context baseContext4 = getBaseContext();
            Context applicationContext4 = baseContext4 != null ? baseContext4.getApplicationContext() : null;
            if (!(applicationContext4 == null || (length3 = applicationContext4.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext4, length3)))) {
                onCanceled oncanceled4 = new onCanceled(length3, min2, 32);
                onCancelLoad.setMax(-663811186, oncanceled4);
                onCancelLoad.getMin(-663811186, oncanceled4);
            }
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
            Bundle extras = intent.getExtras();
            if (!(extras == null || (string = extras.getString("promoCode")) == null)) {
                Intrinsics.checkNotNullExpressionValue(string, "promoCode");
                if (!MyBeaconServiceImpl.getMin(string)) {
                    string = null;
                }
                if (string != null) {
                    Intrinsics.checkNotNullExpressionValue(string, "this");
                    ((EditText) _$_findCachedViewById(resetInternal.setMax.setTitleMarginBottom)).setText(StringsKt.take(string, 10));
                }
            }
            Context baseContext5 = getBaseContext();
            if (baseContext5 != null) {
                context = baseContext5.getApplicationContext();
            }
            if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
                onCanceled oncanceled5 = new onCanceled(length2, min, 32);
                onCancelLoad.setMax(-802358491, oncanceled5);
                onCancelLoad.getMin(-802358491, oncanceled5);
            }
            convertDipToPx.length length7 = new convertDipToPx.length(this);
            length7.getMax = TrackerKey.Event.PROMO_CODE_OPEN;
            Intent intent2 = getIntent();
            if (!(intent2 == null || (stringExtra = intent2.getStringExtra("source")) == null)) {
                str = stringExtra;
            }
            convertDipToPx.length max = length7.setMax("Source", str);
            max.setMin();
            genTextSelector.getMax(new convertDipToPx(max, (byte) 0));
            return;
        }
        throw null;
    }

    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0 && setMin(motionEvent)) {
            setOnWheelViewListener.getMax((Activity) this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private final boolean setMin(MotionEvent motionEvent) {
        return this.getMin && !setMax(motionEvent);
    }

    private final boolean setMax(MotionEvent motionEvent) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1257413073, oncanceled);
            onCancelLoad.getMin(1257413073, oncanceled);
        }
        Rect rect = new Rect();
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.MediaDescriptionCompat);
        if (danaButtonSecondaryView == null) {
            return false;
        }
        danaButtonSecondaryView.getGlobalVisibleRect(rect);
        return rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    public final void showProgress() {
        LogoProgressView logoProgressView = (LogoProgressView) _$_findCachedViewById(resetInternal.setMax.setActionBarVisibilityCallback);
        if (logoProgressView != null) {
            logoProgressView.setVisibility(0);
            logoProgressView.startRefresh();
        }
    }

    public final void dismissProgress() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1973354491, oncanceled);
            onCancelLoad.getMin(1973354491, oncanceled);
        }
        LogoProgressView logoProgressView = (LogoProgressView) _$_findCachedViewById(resetInternal.setMax.setActionBarVisibilityCallback);
        if (logoProgressView != null) {
            logoProgressView.setVisibility(8);
            logoProgressView.stopRefresh();
        }
    }

    /* access modifiers changed from: private */
    public final boolean setMax(String str) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 831522046 == (max = dispatchOnCancelled.getMax(applicationContext, 831522046)))) {
            onCanceled oncanceled = new onCanceled(831522046, max, 512);
            onCancelLoad.setMax(831522046, oncanceled);
            onCancelLoad.getMin(831522046, oncanceled);
        }
        int length2 = str.length();
        return 4 <= length2 && 10 >= length2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0007"}, d2 = {"id/dana/promocode/views/RedeemPromoCodeActivity$setupPromoCodeInput$1", "Lid/dana/textbehavior/validate/Validator;", "getErrorMessage", "", "isValid", "", "code", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements checkOppoConcave {
        final /* synthetic */ RedeemPromoCodeActivity setMax;

        getMin(RedeemPromoCodeActivity redeemPromoCodeActivity) {
            this.setMax = redeemPromoCodeActivity;
        }

        public final boolean getMax(@Nullable String str) {
            if (str != null) {
                return this.setMax.setMax(str);
            }
            return false;
        }

        @NotNull
        public final String getMax() {
            String string = this.setMax.getString(R.string.error_promocode_character_length_not_valid);
            Intrinsics.checkNotNullExpressionValue(string, "getString(\n             …aracter_length_not_valid)");
            return string;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"id/dana/promocode/views/RedeemPromoCodeActivity$setupPromoCodeInput$2", "Lid/dana/textbehavior/OnValidatedListener;", "onInvalid", "", "code", "", "invalidReasons", "", "Lid/dana/textbehavior/InvalidReason;", "onValid", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements checkApFlag {
        final /* synthetic */ RedeemPromoCodeActivity length;

        getMax(RedeemPromoCodeActivity redeemPromoCodeActivity) {
            this.length = redeemPromoCodeActivity;
        }

        public final void getMin(@Nullable String str, @Nullable List<setWhiteListAP> list) {
            View _$_findCachedViewById = this.length._$_findCachedViewById(resetInternal.setMax.getDropDownWidth);
            Context context = this.length;
            Integer valueOf = str != null ? Integer.valueOf(str.length()) : null;
            if (valueOf != null) {
                _$_findCachedViewById.setBackgroundColor(IntRange.setMax(context, valueOf.intValue() > 0 ? 17170443 : R.color.f24772131100431));
                RedeemPromoCodeActivity.buttonSubmitState$default(this.length, false, (String) null, 2, (Object) null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        public final void getMax(@Nullable String str) {
            this.length._$_findCachedViewById(resetInternal.setMax.getDropDownWidth).setBackgroundColor(IntRange.setMax(this.length, 17170443));
            RedeemPromoCodeActivity.buttonSubmitState$default(this.length, true, (String) null, 2, (Object) null);
        }
    }

    static /* synthetic */ void buttonSubmitState$default(RedeemPromoCodeActivity redeemPromoCodeActivity, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = redeemPromoCodeActivity.getString(R.string.title_btn_redeem);
            Intrinsics.checkNotNullExpressionValue(str, "getString(R.string.title_btn_redeem)");
        }
        redeemPromoCodeActivity.length(z, str);
    }

    /* access modifiers changed from: private */
    public final void length(boolean z, String str) {
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.MediaDescriptionCompat);
        if (danaButtonSecondaryView != null) {
            if (z) {
                danaButtonSecondaryView.setActiveButton(str, (Drawable) null);
            } else {
                danaButtonSecondaryView.setDisabled(str);
            }
            danaButtonSecondaryView.setEnabled(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ RedeemPromoCodeActivity setMax;

        setMin(RedeemPromoCodeActivity redeemPromoCodeActivity) {
            this.setMax = redeemPromoCodeActivity;
        }

        public final void onClick(View view) {
            setOnWheelViewListener.getMax((Activity) this.setMax);
            GriverUpdateProgressExtension.getMax redeemPromoCodePresenter = this.setMax.getRedeemPromoCodePresenter();
            EditText editText = (EditText) this.setMax._$_findCachedViewById(resetInternal.setMax.setTitleMarginBottom);
            Intrinsics.checkNotNullExpressionValue(editText, "tv_input_code");
            redeemPromoCodePresenter.getMax(editText.getText().toString());
            RedeemPromoCodeActivity redeemPromoCodeActivity = this.setMax;
            String string = redeemPromoCodeActivity.getString(R.string.title_btn_redeem_on_submit);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.title_btn_redeem_on_submit)");
            redeemPromoCodeActivity.length(false, string);
        }
    }

    public final void onRedeemResult(@NotNull String str, @Nullable GriverAMCSAppUpdater griverAMCSAppUpdater, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "code");
        this.setMax = true;
        trackPromoCodeResult$default(this, true, str, str2, (String) null, 8, (Object) null);
        this.getMax = griverAMCSAppUpdater;
        Activity activity = this;
        String voucherName = griverAMCSAppUpdater != null ? griverAMCSAppUpdater.getVoucherName() : null;
        if (voucherName == null) {
            voucherName = "";
        }
        setMin(mapUrl.getMin(activity, voucherName));
        buttonSubmitState$default(this, true, (String) null, 2, (Object) null);
    }

    public final void onErrorResult(@Nullable String str, @Nullable String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str3, "code");
        this.setMax = false;
        trackPromoCodeResult$default(this, false, str3, (String) null, str2, 4, (Object) null);
        buttonSubmitState$default(this, true, (String) null, 2, (Object) null);
        setMin(mapUrl.setMax(this, str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"id/dana/promocode/views/RedeemPromoCodeActivity$showPromoCodeBottomSheet$1$1", "Lid/dana/promocode/views/PromoCodeBottomSheet$PromocodeBottomSheetListener;", "onNegativeButtonClicked", "", "onPositiveButtonClicked", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals implements setLandscape.getMin {
        final /* synthetic */ RedeemPromoCodeActivity setMax;
        final /* synthetic */ setLandscape setMin;

        equals(setLandscape setlandscape, RedeemPromoCodeActivity redeemPromoCodeActivity) {
            this.setMin = setlandscape;
            this.setMax = redeemPromoCodeActivity;
        }

        public final void setMin() {
            this.setMax.finish();
        }

        public final void getMax() {
            GriverAMCSAppUpdater access$getPrizeInfoEntity$p;
            if (this.setMax.setMax && (access$getPrizeInfoEntity$p = this.setMax.getMax) != null) {
                ImageBridgeExtension.AnonymousClass1.setMax(access$getPrizeInfoEntity$p, this.setMax.getDynamicUrlWrapper());
            }
            this.setMin.dismiss();
        }
    }

    private final void setMin(setLandscape setlandscape) {
        if (setlandscape != null) {
            setlandscape.getMax = new equals(setlandscape, this);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "fragmentManager");
            setlandscape.show(supportFragmentManager, "promo_code_bottomsheet_tag");
        }
    }

    /* access modifiers changed from: private */
    public final boolean setMax(View view) {
        Rect rect = new Rect();
        ((NestedScrollView) _$_findCachedViewById(resetInternal.setMax.setPopupBackgroundDrawable)).getDrawingRect(rect);
        float y = view.getY();
        return ((float) rect.top) < y && ((float) rect.bottom) > ((float) view.getHeight()) + y;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"id/dana/promocode/views/RedeemPromoCodeActivity$setupKeyboardListener$1", "Lid/dana/utils/KeyboardHelper$KeyboardVisibilityListener;", "onKeyboardHide", "", "onKeyboardShow", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements setOnWheelViewListener.length {
        final /* synthetic */ RedeemPromoCodeActivity setMin;

        length(RedeemPromoCodeActivity redeemPromoCodeActivity) {
            this.setMin = redeemPromoCodeActivity;
        }

        public final void length() {
            this.setMin.getMin = true;
            RedeemPromoCodeActivity redeemPromoCodeActivity = this.setMin;
            EditText editText = (EditText) redeemPromoCodeActivity._$_findCachedViewById(resetInternal.setMax.setTitleMarginBottom);
            Intrinsics.checkNotNullExpressionValue(editText, "tv_input_code");
            if (redeemPromoCodeActivity.setMax((View) editText)) {
                ((NestedScrollView) this.setMin._$_findCachedViewById(resetInternal.setMax.setPopupBackgroundDrawable)).post(new setMax(this.setMin));
            }
        }

        public final void setMax() {
            this.setMin.getMin = false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements Runnable {
        final /* synthetic */ RedeemPromoCodeActivity getMin;

        setMax(RedeemPromoCodeActivity redeemPromoCodeActivity) {
            this.getMin = redeemPromoCodeActivity;
        }

        public final void run() {
            ((NestedScrollView) this.getMin._$_findCachedViewById(resetInternal.setMax.setPopupBackgroundDrawable)).fullScroll(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
        }
    }

    static /* synthetic */ void trackPromoCodeResult$default(RedeemPromoCodeActivity redeemPromoCodeActivity, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        convertDipToPx.length length2 = new convertDipToPx.length(redeemPromoCodeActivity);
        length2.getMax = TrackerKey.Event.PROMO_CODE_RESULT;
        convertDipToPx.length max = length2.setMax(TrackerKey.NearbyMerchantProperty.PROMO_CODE, str).setMin("Success", z).setMax(TrackerKey.NearbyMerchantProperty.CAMPAIGN_ID, str2).setMax(TrackerKey.Property.FAIL_REASON, str3);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }
}
