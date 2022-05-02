package id.dana.social.view.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.danah5.DanaH5;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.domain.social.ModifyRelationOperationType;
import id.dana.myprofile.MyProfileBundleKey;
import id.dana.myprofile.SettingMoreProfileActivity;
import id.dana.social.di.module.RelationshipBottomSheetModule;
import id.dana.social.di.module.UsernameModule;
import id.dana.social.model.RelationshipItemModel;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.AudioAttributesImplBase;
import o.IntRange;
import o.PrepareException;
import o.RequiresPermission;
import o.SwipeRefreshLayout;
import o.dispatchOnCancelled;
import o.getTitleText;
import o.isShowMenu;
import o.j;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onLoadChildren;
import o.resetInternal;
import o.setLeftBtnInfo;
import o.setTitleView;
import o.stopBeaconDiscovery;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u001f\u001a\u00020\u0010H\u0002J\b\u0010 \u001a\u00020\u0010H\u0002J\u000f\u0010!\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\"J\u000f\u0010#\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\"J\b\u0010$\u001a\u00020\u0010H\u0002J\b\u0010%\u001a\u00020\u0010H\u0002J\u000f\u0010&\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\"J\f\u0010'\u001a\u00020\u0010*\u00020(H\u0002J\f\u0010)\u001a\u00020\u0010*\u00020(H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006+"}, d2 = {"Lid/dana/social/view/activity/ChangeUsernameActivity;", "Lid/dana/base/BaseActivity;", "()V", "settingPresenter", "Lid/dana/social/contract/RelationshipBottomSheetContract$Presenter;", "getSettingPresenter", "()Lid/dana/social/contract/RelationshipBottomSheetContract$Presenter;", "setSettingPresenter", "(Lid/dana/social/contract/RelationshipBottomSheetContract$Presenter;)V", "usernamePresenter", "Lid/dana/social/contract/UsernameContract$Presenter;", "getUsernamePresenter", "()Lid/dana/social/contract/UsernameContract$Presenter;", "setUsernamePresenter", "(Lid/dana/social/contract/UsernameContract$Presenter;)V", "displayChangeUsernameSuccessToast", "", "displayErrorToast", "message", "", "getLayout", "", "init", "injectDagger", "onBackPressed", "openSettingsMoreActivity", "setting", "Lid/dana/domain/profilemenu/model/SettingModel;", "renderSubmitError", "renderUsernameEmpty", "renderUsernameError", "renderUsernameLoading", "renderUsernameValid", "setupClickListener", "()Lkotlin/Unit;", "setupSpanText", "setupTextChangedListener", "setupToolbar", "setupUsername", "disable", "Lid/dana/component/buttoncomponent/DanaButtonPrimaryView;", "enable", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ChangeUsernameActivity extends BaseActivity {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    @NotNull
    public static final String PARAM_FROM_DEEPLINK = "PARAM_FROM_DEEPLINK";
    @NotNull
    public static final String PARAM_ILLEGAL_ERROR_CODE = "AE15012158172008";
    @NotNull
    public static final String PARAM_USERNAME = "PARAM_USERNAME";
    private HashMap setMax;
    @Inject
    public getTitleText.getMin settingPresenter;
    @Inject
    public setLeftBtnInfo.length usernamePresenter;

    public final void _$_clearFindViewByIdCache() {
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
            onCancelLoad.setMax(-2074336777, oncanceled);
            onCancelLoad.getMin(-2074336777, oncanceled);
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
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2))) {
            return R.layout.activity_change_username;
        }
        onCanceled oncanceled = new onCanceled(length2, min, 32);
        onCancelLoad.setMax(358427563, oncanceled);
        onCancelLoad.getMin(358427563, oncanceled);
        return R.layout.activity_change_username;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"id/dana/extension/view/InputExtKt$onTextAfterChanged$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements TextWatcher {
        final /* synthetic */ ChangeUsernameActivity setMax;

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public isInside(ChangeUsernameActivity changeUsernameActivity) {
            this.setMax = changeUsernameActivity;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            String str;
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                ChangeUsernameActivity.access$renderUsernameEmpty(this.setMax);
            }
        }
    }

    public static final /* synthetic */ void access$displayChangeUsernameSuccessToast(ChangeUsernameActivity changeUsernameActivity) {
        int length2;
        Context baseContext = changeUsernameActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-909684392, oncanceled);
            onCancelLoad.getMin(-909684392, oncanceled);
        }
        SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.setMax;
        String string = changeUsernameActivity.getResources().getString(R.string.username_submitted);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.username_submitted)");
        SwipeRefreshLayout.length(changeUsernameActivity, R.drawable.ic_success, R.drawable.bg_rounded_border_green_50, string);
    }

    public static final /* synthetic */ void access$displayErrorToast(ChangeUsernameActivity changeUsernameActivity, String str) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(209965673, oncanceled);
            onCancelLoad.getMin(209965673, oncanceled);
        }
        SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.setMax;
        SwipeRefreshLayout.length(changeUsernameActivity, R.drawable.ic_warning_yellow, R.drawable.bg_rounded_border_yellow_50, str);
    }

    public static final /* synthetic */ void access$renderSubmitError(ChangeUsernameActivity changeUsernameActivity, String str) {
        int length2;
        Context baseContext = changeUsernameActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1812751142, oncanceled);
            onCancelLoad.getMin(-1812751142, oncanceled);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.onGetSmallIconId);
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.onGetSmallIconId);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setTextColor(IntRange.setMax(changeUsernameActivity, R.color.f23802131100313));
        }
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.getLogoDescription);
        if (appCompatTextView3 != null) {
            appCompatTextView3.setTextColor(IntRange.setMax(changeUsernameActivity, R.color.f23802131100313));
        }
        AppCompatEditText appCompatEditText = (AppCompatEditText) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.LayoutRes);
        if (appCompatEditText != null) {
            EditText editText = appCompatEditText;
            Intrinsics.checkNotNullParameter(editText, "$this$setBackgroundTint");
            RequiresPermission.Read.getMin(editText.getBackground(), IntRange.setMax(editText.getContext(), R.color.f23802131100313));
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.dispatchRestoreInstanceState);
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.superDispatchKeyEvent);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.isStateful);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setVisibility(8);
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.onFinishInflate);
        if (appCompatImageView3 != null) {
            appCompatImageView3.setVisibility(0);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.setShuffleModeEnabledRemoved);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.MediaDescriptionCompat);
        if (danaButtonPrimaryView != null) {
            changeUsernameActivity.length(danaButtonPrimaryView);
        }
    }

    public static final /* synthetic */ void access$renderUsernameEmpty(ChangeUsernameActivity changeUsernameActivity) {
        int max;
        Context baseContext = changeUsernameActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 6179611 == (max = dispatchOnCancelled.getMax(applicationContext, 6179611)))) {
            onCanceled oncanceled = new onCanceled(6179611, max, 512);
            onCancelLoad.setMax(6179611, oncanceled);
            onCancelLoad.getMin(6179611, oncanceled);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.getLogoDescription);
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(IntRange.setMax(changeUsernameActivity, R.color.f23952131100331));
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.dispatchRestoreInstanceState);
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.superDispatchKeyEvent);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.isStateful);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setVisibility(0);
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.onFinishInflate);
        if (appCompatImageView3 != null) {
            appCompatImageView3.setVisibility(8);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.setShuffleModeEnabledRemoved);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.MediaDescriptionCompat);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setDanaButtonView(0, danaButtonPrimaryView.getContext().getString(R.string.submit), "", (Drawable) null);
            danaButtonPrimaryView.setEnabled(false);
        }
    }

    @NotNull
    public final setLeftBtnInfo.length getUsernamePresenter() {
        setLeftBtnInfo.length length2 = this.usernamePresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("usernamePresenter");
        }
        return length2;
    }

    public final void setUsernamePresenter(@NotNull setLeftBtnInfo.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.usernamePresenter = length2;
    }

    @NotNull
    public final getTitleText.getMin getSettingPresenter() {
        int length2;
        int min;
        int length3;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(191422215, oncanceled);
            onCancelLoad.getMin(191422215, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(191422215, oncanceled2);
            onCancelLoad.getMin(191422215, oncanceled2);
        }
        getTitleText.getMin getmin = this.settingPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingPresenter");
        }
        return getmin;
    }

    public final void setSettingPresenter(@NotNull getTitleText.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.settingPresenter = getmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/social/view/activity/ChangeUsernameActivity$injectDagger$1", "Lid/dana/social/contract/RelationshipBottomSheetContract$View;", "onGetProfileSettingModelSuccess", "", "setting", "Lid/dana/domain/profilemenu/model/SettingModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements getTitleText.length {
        final /* synthetic */ ChangeUsernameActivity setMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        public final void getMin() {
        }

        public final void getMin(@NotNull List<RelationshipItemModel> list) {
            Intrinsics.checkNotNullParameter(list, "relationshipItemModelList");
        }

        public final void length(@NotNull ModifyRelationOperationType modifyRelationOperationType) {
            Intrinsics.checkNotNullParameter(modifyRelationOperationType, "operationType");
        }

        public final void length(@NotNull List<RelationshipItemModel> list) {
            Intrinsics.checkNotNullParameter(list, "relationshipItemModelList");
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        public final void setMin() {
        }

        public final void setMin(boolean z) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMax(ChangeUsernameActivity changeUsernameActivity) {
            this.setMax = changeUsernameActivity;
        }

        public final void getMax(@NotNull SettingModel settingModel) {
            Intrinsics.checkNotNullParameter(settingModel, "setting");
            ChangeUsernameActivity.access$openSettingsMoreActivity(this.setMax, settingModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"id/dana/social/view/activity/ChangeUsernameActivity$injectDagger$2", "Lid/dana/social/contract/UsernameContract$View;", "onUsernameCheckLoading", "", "onUsernameError", "it", "Lid/dana/data/social/model/UsernameCheck;", "onUsernameSubmitError", "onUsernameSubmitFailed", "errorCode", "", "errorMessage", "onUsernameSubmitSuccess", "onUsernameValid", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements setLeftBtnInfo.getMax {
        final /* synthetic */ ChangeUsernameActivity setMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMin(ChangeUsernameActivity changeUsernameActivity) {
            this.setMax = changeUsernameActivity;
        }

        public final void length(@NotNull j jVar) {
            Intrinsics.checkNotNullParameter(jVar, "it");
            ChangeUsernameActivity.access$renderUsernameError(this.setMax, jVar.getErrorMessage());
        }

        public final void setMax() {
            ChangeUsernameActivity.access$renderUsernameValid(this.setMax);
        }

        public final void length() {
            ChangeUsernameActivity.access$renderUsernameLoading(this.setMax);
        }

        public final void getMax() {
            ChangeUsernameActivity.access$displayChangeUsernameSuccessToast(this.setMax);
            this.setMax.getSettingPresenter().getMax("setting_more");
        }

        public final void setMin(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "errorCode");
            Intrinsics.checkNotNullParameter(str2, "errorMessage");
            ChangeUsernameActivity.access$renderSubmitError(this.setMax, str2);
            if (Intrinsics.areEqual((Object) str, (Object) ChangeUsernameActivity.PARAM_ILLEGAL_ERROR_CODE)) {
                ChangeUsernameActivity changeUsernameActivity = this.setMax;
                String string = changeUsernameActivity.getString(R.string.username_error_param);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.username_error_param)");
                ChangeUsernameActivity.access$displayErrorToast(changeUsernameActivity, string);
                return;
            }
            ChangeUsernameActivity.access$displayErrorToast(this.setMax, str2);
        }

        public final void getMin() {
            ChangeUsernameActivity changeUsernameActivity = this.setMax;
            String string = changeUsernameActivity.getString(R.string.username_system_busy);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.username_system_busy)");
            ChangeUsernameActivity.access$displayErrorToast(changeUsernameActivity, string);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<Unit> {
        public static final length INSTANCE = new length();

        length() {
            super(0);
        }

        public final void invoke() {
            String min = isShowMenu.setMin("https://m.dana.id/m/standalone/help-center/article/900003396386");
            Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(COMMUNITY_GUIDELINES)");
            DanaH5.startContainerFullUrl(min);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ ChangeUsernameActivity length;

        setMax(ChangeUsernameActivity changeUsernameActivity) {
            this.length = changeUsernameActivity;
        }

        public final void onClick(View view) {
            String str;
            Editable text;
            String obj;
            DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) this.length._$_findCachedViewById(resetInternal.setMax.MediaDescriptionCompat);
            if (danaButtonPrimaryView != null) {
                ChangeUsernameActivity.access$disable(this.length, danaButtonPrimaryView);
            }
            setLeftBtnInfo.length usernamePresenter = this.length.getUsernamePresenter();
            AppCompatEditText appCompatEditText = (AppCompatEditText) this.length._$_findCachedViewById(resetInternal.setMax.LayoutRes);
            if (appCompatEditText == null || (text = appCompatEditText.getText()) == null || (obj = text.toString()) == null) {
                str = null;
            } else if (obj != null) {
                str = StringsKt.trim((CharSequence) obj).toString();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            if (str == null) {
                str = "";
            }
            usernamePresenter.length(str);
        }
    }

    public final void onBackPressed() {
        Bundle extras;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            super.onBackPressed();
        } else if (extras.getBoolean(PARAM_FROM_DEEPLINK, false)) {
            getTitleText.getMin getmin = this.settingPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("settingPresenter");
            }
            getmin.getMax("setting_more");
        } else {
            super.onBackPressed();
        }
    }

    private final void length(DanaButtonPrimaryView danaButtonPrimaryView) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1853230368, oncanceled);
            onCancelLoad.getMin(-1853230368, oncanceled);
        }
        String string = danaButtonPrimaryView.getContext().getString(R.string.submit);
        if (string == null) {
            string = "";
        }
        danaButtonPrimaryView.setDanaButtonView(1, string, "", (Drawable) null);
        danaButtonPrimaryView.setEnabled(true);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/social/view/activity/ChangeUsernameActivity$Companion;", "", "()V", "PARAM_FROM_DEEPLINK", "", "PARAM_ILLEGAL_ERROR_CODE", "PARAM_USERNAME", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public final void init() {
        Bundle extras;
        String string;
        AppCompatEditText appCompatEditText;
        int length2;
        int min;
        setTitle(getResources().getString(R.string.username_toolbar_title));
        setMenuLeftButton((int) R.drawable.arrow_left_white);
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-671205100, oncanceled);
            onCancelLoad.getMin(-671205100, oncanceled);
        }
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null || (string = extras.getString(PARAM_USERNAME)) == null || (appCompatEditText = (AppCompatEditText) _$_findCachedViewById(resetInternal.setMax.LayoutRes)) == null)) {
            appCompatEditText.setText(string);
            Unit unit = Unit.INSTANCE;
        }
        AppCompatEditText appCompatEditText2 = (AppCompatEditText) _$_findCachedViewById(resetInternal.setMax.LayoutRes);
        if (appCompatEditText2 != null) {
            appCompatEditText2.addTextChangedListener(new isInside(this));
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.Toolbar);
        if (appCompatTextView != null) {
            String string2 = getString(R.string.username_guidelines_span);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.username_guidelines_span)");
            stopBeaconDiscovery.setMax(appCompatTextView, string2, length.INSTANCE);
            Unit unit2 = Unit.INSTANCE;
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.MediaDescriptionCompat);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new setMax(this));
            Unit unit3 = Unit.INSTANCE;
        }
        setTitleView.getMin getmin = new setTitleView.getMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            getmin.length = applicationComponent;
            getmin.setMax = new RelationshipBottomSheetModule(new getMax(this));
            getmin.getMin = new UsernameModule(new setMin(this));
            stopIgnoring.setMin(getmin.getMin, UsernameModule.class);
            stopIgnoring.setMin(getmin.setMax, RelationshipBottomSheetModule.class);
            stopIgnoring.setMin(getmin.length, PrepareException.AnonymousClass1.class);
            new setTitleView(getmin.getMin, getmin.setMax, getmin.length, (byte) 0).getMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[2];
            getTitleText.getMin getmin2 = this.settingPresenter;
            if (getmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("settingPresenter");
            }
            getminArr[0] = getmin2;
            setLeftBtnInfo.length length3 = this.usernamePresenter;
            if (length3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("usernamePresenter");
            }
            getminArr[1] = length3;
            registerPresenter(getminArr);
            setLeftBtnInfo.length length4 = this.usernamePresenter;
            if (length4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("usernamePresenter");
            }
            AudioAttributesImplBase<CharSequence> textChanges = onLoadChildren.textChanges((AppCompatEditText) _$_findCachedViewById(resetInternal.setMax.LayoutRes));
            Intrinsics.checkNotNullExpressionValue(textChanges, "RxTextView.textChanges(et_username)");
            length4.length(textChanges);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$openSettingsMoreActivity(ChangeUsernameActivity changeUsernameActivity, SettingModel settingModel) {
        Bundle extras;
        Intent intent = new Intent(changeUsernameActivity, SettingMoreProfileActivity.class);
        intent.putExtra(MyProfileBundleKey.SETTING_MODEL, settingModel);
        Intent intent2 = changeUsernameActivity.getIntent();
        if (!(intent2 == null || (extras = intent2.getExtras()) == null || !extras.getBoolean(PARAM_FROM_DEEPLINK, false))) {
            intent.addFlags(335544320);
        }
        changeUsernameActivity.startActivity(intent);
        changeUsernameActivity.finish();
    }

    public static final /* synthetic */ void access$renderUsernameError(ChangeUsernameActivity changeUsernameActivity, String str) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.onGetSmallIconId);
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.onGetSmallIconId);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setTextColor(IntRange.setMax(changeUsernameActivity, R.color.f23802131100313));
        }
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.getLogoDescription);
        if (appCompatTextView3 != null) {
            appCompatTextView3.setTextColor(IntRange.setMax(changeUsernameActivity, R.color.f23802131100313));
        }
        AppCompatEditText appCompatEditText = (AppCompatEditText) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.LayoutRes);
        if (appCompatEditText != null) {
            EditText editText = appCompatEditText;
            Intrinsics.checkNotNullParameter(editText, "$this$setBackgroundTint");
            RequiresPermission.Read.getMin(editText.getBackground(), IntRange.setMax(editText.getContext(), R.color.f23802131100313));
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.dispatchRestoreInstanceState);
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.superDispatchKeyEvent);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.isStateful);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setVisibility(8);
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.onFinishInflate);
        if (appCompatImageView3 != null) {
            appCompatImageView3.setVisibility(0);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.setShuffleModeEnabledRemoved);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.MediaDescriptionCompat);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setDanaButtonView(0, danaButtonPrimaryView.getContext().getString(R.string.submit), "", (Drawable) null);
            danaButtonPrimaryView.setEnabled(false);
        }
    }

    public static final /* synthetic */ void access$renderUsernameValid(ChangeUsernameActivity changeUsernameActivity) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.onGetSmallIconId);
        if (appCompatTextView != null) {
            appCompatTextView.setText(changeUsernameActivity.getString(R.string.username_bottom_hint));
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.onGetSmallIconId);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setTextColor(IntRange.setMax(changeUsernameActivity, R.color.f23952131100331));
        }
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.getLogoDescription);
        if (appCompatTextView3 != null) {
            appCompatTextView3.setTextColor(IntRange.setMax(changeUsernameActivity, R.color.f23952131100331));
        }
        AppCompatEditText appCompatEditText = (AppCompatEditText) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.LayoutRes);
        if (appCompatEditText != null) {
            EditText editText = appCompatEditText;
            Intrinsics.checkNotNullParameter(editText, "$this$setBackgroundTint");
            RequiresPermission.Read.getMin(editText.getBackground(), IntRange.setMax(editText.getContext(), R.color.f20362131099948));
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.dispatchRestoreInstanceState);
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.superDispatchKeyEvent);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(0);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.isStateful);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setVisibility(0);
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.onFinishInflate);
        if (appCompatImageView3 != null) {
            appCompatImageView3.setVisibility(8);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.setShuffleModeEnabledRemoved);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.MediaDescriptionCompat);
        if (danaButtonPrimaryView != null) {
            changeUsernameActivity.length(danaButtonPrimaryView);
        }
    }

    public static final /* synthetic */ void access$renderUsernameLoading(ChangeUsernameActivity changeUsernameActivity) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.onGetSmallIconId);
        if (appCompatTextView != null) {
            appCompatTextView.setText(changeUsernameActivity.getString(R.string.username_bottom_hint));
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.onGetSmallIconId);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setTextColor(IntRange.setMax(changeUsernameActivity, R.color.f23952131100331));
        }
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.getLogoDescription);
        if (appCompatTextView3 != null) {
            appCompatTextView3.setTextColor(IntRange.setMax(changeUsernameActivity, R.color.f23952131100331));
        }
        AppCompatEditText appCompatEditText = (AppCompatEditText) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.LayoutRes);
        if (appCompatEditText != null) {
            EditText editText = appCompatEditText;
            Intrinsics.checkNotNullParameter(editText, "$this$setBackgroundTint");
            RequiresPermission.Read.getMin(editText.getBackground(), IntRange.setMax(editText.getContext(), R.color.f20362131099948));
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.dispatchRestoreInstanceState);
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(0);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.superDispatchKeyEvent);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.isStateful);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setVisibility(0);
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.onFinishInflate);
        if (appCompatImageView3 != null) {
            appCompatImageView3.setVisibility(8);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.setShuffleModeEnabledRemoved);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) changeUsernameActivity._$_findCachedViewById(resetInternal.setMax.MediaDescriptionCompat);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setDanaButtonView(0, danaButtonPrimaryView.getContext().getString(R.string.submit), "", (Drawable) null);
            danaButtonPrimaryView.setEnabled(false);
        }
    }

    public static final /* synthetic */ void access$disable(ChangeUsernameActivity changeUsernameActivity, DanaButtonPrimaryView danaButtonPrimaryView) {
        danaButtonPrimaryView.setDanaButtonView(0, danaButtonPrimaryView.getContext().getString(R.string.submit), "", (Drawable) null);
        danaButtonPrimaryView.setEnabled(false);
    }
}
