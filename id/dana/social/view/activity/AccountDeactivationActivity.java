package id.dana.social.view.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.dialog.TwoButtonWithImageDialog;
import id.dana.myprofile.SettingMoreProfileActivity;
import id.dana.social.di.module.AccountDeactivationModule;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.AUTitleBar;
import o.AudioAttributesImplBase;
import o.IntRange;
import o.PrepareException;
import o.RequiresPermission;
import o.addButtonViewToRight;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onLoadChildren;
import o.resetInternal;
import o.setAnimationStyle;
import o.setPublishStatus;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\fH\u0002J\b\u0010\u0014\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\fH\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\fH\u0002J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\fH\u0002J\b\u0010\"\u001a\u00020\fH\u0002J\b\u0010#\u001a\u00020\fH\u0002J\f\u0010$\u001a\u00020\f*\u00020%H\u0002J\f\u0010&\u001a\u00020\f*\u00020%H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lid/dana/social/view/activity/AccountDeactivationActivity;", "Lid/dana/base/BaseActivity;", "()V", "accountDeactivationPresenter", "Lid/dana/social/contract/AccountDeactivationContract$Presenter;", "getAccountDeactivationPresenter", "()Lid/dana/social/contract/AccountDeactivationContract$Presenter;", "setAccountDeactivationPresenter", "(Lid/dana/social/contract/AccountDeactivationContract$Presenter;)V", "danaLoadingDialog", "Lid/dana/dialog/DanaLoadingDialog;", "closeActivityWithSuccessToast", "", "dismissLoadingDialog", "getAccountDeactivationModule", "Lid/dana/social/di/module/AccountDeactivationModule;", "getLayout", "", "hideInvalidEmailMsg", "hideLabelInput", "init", "injectDagger", "resetToInitialState", "setupDeactivateClickListener", "setupInputEditTextOnFocusListener", "()Lkotlin/Unit;", "setupToolbar", "showDeactivateAccountDialog", "positiveOnclickListener", "Landroid/view/View$OnClickListener;", "showErrorToastMsgOnTop", "msg", "", "showInvalidEmailMsg", "showLabelInput", "showLoadingDialog", "disable", "Lid/dana/component/buttoncomponent/DanaButtonSecondaryView;", "enable", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AccountDeactivationActivity extends BaseActivity {
    @Inject
    public AUTitleBar.setMin accountDeactivationPresenter;
    private setPublishStatus getMin;
    private HashMap setMax;

    public final void _$_clearFindViewByIdCache() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(673557245, oncanceled);
            onCancelLoad.getMin(673557245, oncanceled);
        }
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(839742435, oncanceled);
            onCancelLoad.getMin(839742435, oncanceled);
        }
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_account_deactivation;
    }

    public static final /* synthetic */ void access$resetToInitialState(AccountDeactivationActivity accountDeactivationActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(2053314233, oncanceled);
            onCancelLoad.getMin(2053314233, oncanceled);
        }
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) accountDeactivationActivity._$_findCachedViewById(resetInternal.setMax.areNotificationsEnabled);
        if (danaButtonSecondaryView != null) {
            accountDeactivationActivity.getMin(danaButtonSecondaryView);
        }
        accountDeactivationActivity.length();
    }

    public static final /* synthetic */ void access$showDeactivateAccountDialog(AccountDeactivationActivity accountDeactivationActivity, View.OnClickListener onClickListener) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-557203055, oncanceled);
            onCancelLoad.getMin(-557203055, oncanceled);
        }
        TwoButtonWithImageDialog.setMax setmax = new TwoButtonWithImageDialog.setMax(accountDeactivationActivity);
        setmax.setMin = accountDeactivationActivity.getString(R.string.popup_account_deactivation_confirmation_title);
        setmax.length = accountDeactivationActivity.getString(R.string.popup_account_deactivation_confirmation_message);
        String string = accountDeactivationActivity.getString(R.string.option_no);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.option_no)");
        if (string != null) {
            String upperCase = string.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            setmax.FastBitmap$CoordinateSystem = upperCase;
            setmax.hashCode = null;
            setmax.IsOverlapping = true;
            String string2 = accountDeactivationActivity.getString(R.string.option_yes);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.option_yes)");
            if (string2 != null) {
                String upperCase2 = string2.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase()");
                setmax.values = upperCase2;
                setmax.toString = onClickListener;
                setmax.setMax(false);
                setmax.getMin().setMin();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public static final /* synthetic */ void access$showLabelInput(AccountDeactivationActivity accountDeactivationActivity) {
        int max;
        Context baseContext = accountDeactivationActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -484301781 == (max = dispatchOnCancelled.getMax(applicationContext, -484301781)))) {
            onCanceled oncanceled = new onCanceled(-484301781, max, 512);
            onCancelLoad.setMax(-484301781, oncanceled);
            onCancelLoad.getMin(-484301781, oncanceled);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) accountDeactivationActivity._$_findCachedViewById(resetInternal.setMax.getLogoDescription);
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(0);
        }
    }

    @NotNull
    public final AUTitleBar.setMin getAccountDeactivationPresenter() {
        AUTitleBar.setMin setmin = this.accountDeactivationPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountDeactivationPresenter");
        }
        return setmin;
    }

    public final void setAccountDeactivationPresenter(@NotNull AUTitleBar.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.accountDeactivationPresenter = setmin;
    }

    public final void init() {
        int length;
        int min;
        int length2;
        int min2;
        this.getMin = new setPublishStatus(this);
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.areNotificationsEnabled);
        Context context = null;
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setDanaButtonView(0, getString(R.string.btn_account_deactivation_deactivate), "", (Drawable) null);
            danaButtonSecondaryView.setEnabled(false);
        }
        setTitle(getString(R.string.lbl_account_deactivation_toolbar_title));
        setMenuLeftButton((int) R.drawable.arrow_left_white);
        ((DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.areNotificationsEnabled)).setOnClickListener(new setMin(this));
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min2, 32);
            onCancelLoad.setMax(-1095400330, oncanceled);
            onCancelLoad.getMin(-1095400330, oncanceled);
        }
        EditText editText = (EditText) _$_findCachedViewById(resetInternal.setMax.IntDef);
        if (editText != null) {
            editText.setOnFocusChangeListener(new getMax(this));
            Unit unit = Unit.INSTANCE;
        }
        addButtonViewToRight.length length3 = new addButtonViewToRight.length((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            length3.getMin = applicationComponent;
            Context baseContext2 = getBaseContext();
            if (baseContext2 != null) {
                context = baseContext2.getApplicationContext();
            }
            if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
                onCanceled oncanceled2 = new onCanceled(length, min, 32);
                onCancelLoad.setMax(-1373495945, oncanceled2);
                onCancelLoad.getMin(-1373495945, oncanceled2);
            }
            length3.getMax = new AccountDeactivationModule(new setMax(this));
            stopIgnoring.setMin(length3.getMax, AccountDeactivationModule.class);
            stopIgnoring.setMin(length3.getMin, PrepareException.AnonymousClass1.class);
            new addButtonViewToRight(length3.getMax, length3.getMin, (byte) 0).length(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            AUTitleBar.setMin setmin = this.accountDeactivationPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountDeactivationPresenter");
            }
            getminArr[0] = setmin;
            registerPresenter(getminArr);
            AUTitleBar.setMin setmin2 = this.accountDeactivationPresenter;
            if (setmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountDeactivationPresenter");
            }
            AudioAttributesImplBase<CharSequence> textChanges = onLoadChildren.textChanges((EditText) _$_findCachedViewById(resetInternal.setMax.IntDef));
            Intrinsics.checkNotNullExpressionValue(textChanges, "RxTextView.textChanges(et_email)");
            setmin2.setMax(textChanges);
            return;
        }
        throw null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"id/dana/social/view/activity/AccountDeactivationActivity$getAccountDeactivationModule$1", "Lid/dana/social/contract/AccountDeactivationContract$View;", "onEmailAddressInvalid", "", "onEmailAddressValid", "onFailed", "onSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements AUTitleBar.getMin {
        final /* synthetic */ AccountDeactivationActivity setMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMax(AccountDeactivationActivity accountDeactivationActivity) {
            this.setMax = accountDeactivationActivity;
        }

        public final void setMax() {
            AccountDeactivationActivity.access$showInvalidEmailMsg(this.setMax);
            AccountDeactivationActivity accountDeactivationActivity = this.setMax;
            DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) accountDeactivationActivity._$_findCachedViewById(resetInternal.setMax.areNotificationsEnabled);
            Intrinsics.checkNotNullExpressionValue(danaButtonSecondaryView, "btn_deactivate");
            AccountDeactivationActivity.access$disable(accountDeactivationActivity, danaButtonSecondaryView);
        }

        public final void length() {
            this.setMax.length();
            AccountDeactivationActivity accountDeactivationActivity = this.setMax;
            DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) accountDeactivationActivity._$_findCachedViewById(resetInternal.setMax.areNotificationsEnabled);
            Intrinsics.checkNotNullExpressionValue(danaButtonSecondaryView, "btn_deactivate");
            accountDeactivationActivity.getMin(danaButtonSecondaryView);
        }

        public final void setMin() {
            AccountDeactivationActivity.access$dismissLoadingDialog(this.setMax);
            AccountDeactivationActivity.access$closeActivityWithSuccessToast(this.setMax);
        }

        public final void getMin() {
            AccountDeactivationActivity.access$dismissLoadingDialog(this.setMax);
            AccountDeactivationActivity.access$resetToInitialState(this.setMax);
            AccountDeactivationActivity accountDeactivationActivity = this.setMax;
            String string = accountDeactivationActivity.getString(R.string.toast_account_deactivation_failed);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.toast…ount_deactivation_failed)");
            AccountDeactivationActivity.access$showErrorToastMsgOnTop(accountDeactivationActivity, string);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ AccountDeactivationActivity setMin;

        setMin(AccountDeactivationActivity accountDeactivationActivity) {
            this.setMin = accountDeactivationActivity;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
        static final class getMin implements View.OnClickListener {
            final /* synthetic */ setMin setMax;

            getMin(setMin setmin) {
                this.setMax = setmin;
            }

            public final void onClick(View view) {
                AccountDeactivationActivity.access$showLoadingDialog(this.setMax.setMin);
                this.setMax.setMin.getAccountDeactivationPresenter().setMin();
            }
        }

        public final void onClick(View view) {
            AccountDeactivationActivity.access$showDeactivateAccountDialog(this.setMin, new getMin(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnFocusChangeListener {
        final /* synthetic */ AccountDeactivationActivity getMin;

        getMax(AccountDeactivationActivity accountDeactivationActivity) {
            this.getMin = accountDeactivationActivity;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                AccountDeactivationActivity.access$showLabelInput(this.getMin);
            } else {
                AccountDeactivationActivity.access$hideLabelInput(this.getMin);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void length() {
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.setShuffleModeEnabledRemoved);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.getLogoDescription);
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(IntRange.setMax(this, R.color.f20382131099951));
        }
        EditText editText = (EditText) _$_findCachedViewById(resetInternal.setMax.IntDef);
        if (editText != null) {
            Intrinsics.checkNotNullParameter(editText, "$this$setBackgroundTint");
            RequiresPermission.Read.getMin(editText.getBackground(), IntRange.setMax(editText.getContext(), R.color.f20362131099948));
        }
    }

    /* access modifiers changed from: private */
    public final void getMin(DanaButtonSecondaryView danaButtonSecondaryView) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(1289106908, oncanceled);
            onCancelLoad.getMin(1289106908, oncanceled);
        }
        danaButtonSecondaryView.setDanaButtonView(5, getString(R.string.btn_account_deactivation_deactivate), "", (Drawable) null);
        danaButtonSecondaryView.setEnabled(true);
    }

    public static final /* synthetic */ void access$showInvalidEmailMsg(AccountDeactivationActivity accountDeactivationActivity) {
        ConstraintLayout constraintLayout = (ConstraintLayout) accountDeactivationActivity._$_findCachedViewById(resetInternal.setMax.setShuffleModeEnabledRemoved);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        EditText editText = (EditText) accountDeactivationActivity._$_findCachedViewById(resetInternal.setMax.IntDef);
        if (editText != null) {
            Intrinsics.checkNotNullParameter(editText, "$this$setBackgroundTint");
            RequiresPermission.Read.getMin(editText.getBackground(), IntRange.setMax(editText.getContext(), R.color.f23802131100313));
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) accountDeactivationActivity._$_findCachedViewById(resetInternal.setMax.getLogoDescription);
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(IntRange.setMax(accountDeactivationActivity, R.color.f23802131100313));
        }
    }

    public static final /* synthetic */ void access$disable(AccountDeactivationActivity accountDeactivationActivity, DanaButtonSecondaryView danaButtonSecondaryView) {
        danaButtonSecondaryView.setDanaButtonView(0, accountDeactivationActivity.getString(R.string.btn_account_deactivation_deactivate), "", (Drawable) null);
        danaButtonSecondaryView.setEnabled(false);
    }

    public static final /* synthetic */ void access$dismissLoadingDialog(AccountDeactivationActivity accountDeactivationActivity) {
        setPublishStatus setpublishstatus = accountDeactivationActivity.getMin;
        if (setpublishstatus == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaLoadingDialog");
        }
        setpublishstatus.getMax();
    }

    public static final /* synthetic */ void access$closeActivityWithSuccessToast(AccountDeactivationActivity accountDeactivationActivity) {
        Intent intent = new Intent();
        intent.putExtra("accountDeactivationResult", accountDeactivationActivity.getString(R.string.toast_account_deactivation_success));
        accountDeactivationActivity.setResult(-1, intent);
        accountDeactivationActivity.finish();
    }

    public static final /* synthetic */ void access$showErrorToastMsgOnTop(AccountDeactivationActivity accountDeactivationActivity, String str) {
        setAnimationStyle setanimationstyle = setAnimationStyle.setMax;
        setAnimationStyle.getMax(accountDeactivationActivity, R.drawable.failed, R.color.f23802131100313, str, 48, SettingMoreProfileActivity.TOAST_DURATION, 3);
    }

    public static final /* synthetic */ void access$showLoadingDialog(AccountDeactivationActivity accountDeactivationActivity) {
        setPublishStatus setpublishstatus = accountDeactivationActivity.getMin;
        if (setpublishstatus == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaLoadingDialog");
        }
        if (!setpublishstatus.length.isShowing()) {
            setpublishstatus.length.show();
            setpublishstatus.getMax.startRefresh();
        }
    }

    public static final /* synthetic */ void access$hideLabelInput(AccountDeactivationActivity accountDeactivationActivity) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) accountDeactivationActivity._$_findCachedViewById(resetInternal.setMax.getLogoDescription);
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(4);
        }
    }
}
