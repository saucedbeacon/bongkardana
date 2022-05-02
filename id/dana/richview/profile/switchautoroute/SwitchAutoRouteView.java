package id.dana.richview.profile.switchautoroute;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.dana.R;
import id.dana.autoroute.BottomSheetAutoRoutingInfoActivity;
import id.dana.autoroute.BottomSheetNoAssetInfoActivity;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.challenge.ChallengeControl;
import id.dana.danah5.bioutility.BioUtilityBridge;
import id.dana.di.modules.SwitchAutoRouteModule;
import id.dana.dialog.DialogWithImage;
import id.dana.dialog.TwoButtonWithImageDialog;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import id.dana.myprofile.SettingMoreProfileActivity;
import id.dana.tracker.TrackerKey;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CaptureParam;
import o.IntRange;
import o.MediaInfo;
import o.PrepareException;
import o.click;
import o.getPictureSize;
import o.invalidTimeout;
import o.onDelete;
import o.resetInternal;
import o.setCancelText;
import o.setPublishStatus;
import o.setStateOn;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 X2\u00020\u00012\u00020\u0002:\u0001XB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB)\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\b\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020!H\u0016J\u0010\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\bH\u0016J\n\u0010*\u001a\u0004\u0018\u00010+H\u0002J\u0010\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020$H\u0002J\b\u0010.\u001a\u00020!H\u0002J\u0012\u0010/\u001a\u00020!2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0012\u00102\u001a\u00020!2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0010\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020$H\u0016J\u0018\u00107\u001a\u00020!2\u0006\u00108\u001a\u0002092\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010:\u001a\u00020!2\b\u0010;\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010<\u001a\u00020!H\u0016J\u0010\u0010=\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010>\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0016J \u0010?\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010@\u001a\u00020\r2\u0006\u0010A\u001a\u00020\rH\u0016J\b\u0010B\u001a\u00020!H\u0016J\u0010\u0010C\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010D\u001a\u00020!2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010G\u001a\u00020!2\u0006\u0010E\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u00020!2\u0006\u0010J\u001a\u00020$H\u0016J\b\u0010K\u001a\u00020!H\u0016J\b\u0010L\u001a\u00020!H\u0002J\b\u0010M\u001a\u00020!H\u0002J\b\u0010N\u001a\u00020!H\u0016J\u0010\u0010O\u001a\u00020!2\u0006\u0010P\u001a\u00020$H\u0002J\b\u0010Q\u001a\u00020!H\u0002J\b\u0010R\u001a\u00020!H\u0002J\u0016\u0010S\u001a\u0004\u0018\u00010T*\u00020U2\u0006\u0010V\u001a\u00020\bH\u0002J\u0014\u0010W\u001a\u00020!*\u0002092\u0006\u0010#\u001a\u00020$H\u0002R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006Y"}, d2 = {"Lid/dana/richview/profile/switchautoroute/SwitchAutoRouteView;", "Lid/dana/base/BaseRichView;", "Lid/dana/richview/profile/switchautoroute/SwitchAutoRouteContract$View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "authenticationType", "", "autoRouteDisableDialog", "Lid/dana/dialog/TwoButtonWithImageDialog;", "danaLoadingDialog", "Lid/dana/dialog/DanaLoadingDialog;", "phonePermission", "Lid/dana/utils/permission/Permission;", "switchAutoRouteAnalyticsTracker", "Lid/dana/richview/profile/switchautoroute/SwitchAutoRouteAnalyticsTracker;", "getSwitchAutoRouteAnalyticsTracker", "()Lid/dana/richview/profile/switchautoroute/SwitchAutoRouteAnalyticsTracker;", "setSwitchAutoRouteAnalyticsTracker", "(Lid/dana/richview/profile/switchautoroute/SwitchAutoRouteAnalyticsTracker;)V", "switchAutoRoutePresenter", "Lid/dana/richview/profile/switchautoroute/SwitchAutoRoutePresenter;", "getSwitchAutoRoutePresenter", "()Lid/dana/richview/profile/switchautoroute/SwitchAutoRoutePresenter;", "setSwitchAutoRoutePresenter", "(Lid/dana/richview/profile/switchautoroute/SwitchAutoRoutePresenter;)V", "activityResultRendering", "", "changeSwitchColorAccordingtoState", "isChecked", "", "dismissProgress", "getAutoRouteSource", "baseActivity", "Lid/dana/base/BaseActivity;", "getLayout", "getPinLockedListener", "Landroid/content/DialogInterface$OnClickListener;", "getVisibilityStatus", "isFeatureEnabled", "initPermission", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "onBind", "data", "Lid/dana/domain/profilemenu/model/SettingModel;", "onCheckHavingAutorouteAsset", "isHaveAsset", "onCheckedChange", "compoundButton", "Landroid/widget/CompoundButton;", "onError", "errorMessage", "onProceedSwitchOn", "onSwitchResultAccept", "onSwitchResultReject", "onSwitchResultRisk", "securityId", "pubKey", "revertChecked", "setIgnoredChecked", "setSwitchButtonOnCheckedChangeListener", "listener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setSwitchButtonOnClickListener", "Landroid/view/View$OnClickListener;", "setViewVisibility", "isVisible", "setup", "showErrorToast", "showPinLockedDialog", "showProgress", "showSuccessToast", "autoRouteRequestedStatus", "switchOffOperation", "switchOnOperation", "getColorState", "Landroid/content/res/ColorStateList;", "Landroidx/appcompat/widget/SwitchCompat;", "colorRes", "processCheckedChange", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SwitchAutoRouteView extends BaseRichView implements MediaInfo.getMin {
    @NotNull
    public static final length Companion = new length((byte) 0);
    private TwoButtonWithImageDialog getMax;
    private setPublishStatus getMin;
    /* access modifiers changed from: private */
    public setStateOn length;
    private HashMap setMax;
    /* access modifiers changed from: private */
    public String setMin;
    @Inject
    public getPictureSize switchAutoRouteAnalyticsTracker;
    @Inject
    public CaptureParam switchAutoRoutePresenter;

    @JvmOverloads
    public SwitchAutoRouteView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public SwitchAutoRouteView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
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
        return R.layout.item_menu_switch_button;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwitchAutoRouteView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwitchAutoRouteView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public SwitchAutoRouteView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final CaptureParam getSwitchAutoRoutePresenter() {
        CaptureParam captureParam = this.switchAutoRoutePresenter;
        if (captureParam == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchAutoRoutePresenter");
        }
        return captureParam;
    }

    public final void setSwitchAutoRoutePresenter(@NotNull CaptureParam captureParam) {
        Intrinsics.checkNotNullParameter(captureParam, "<set-?>");
        this.switchAutoRoutePresenter = captureParam;
    }

    @NotNull
    public final getPictureSize getSwitchAutoRouteAnalyticsTracker() {
        getPictureSize getpicturesize = this.switchAutoRouteAnalyticsTracker;
        if (getpicturesize == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchAutoRouteAnalyticsTracker");
        }
        return getpicturesize;
    }

    public final void setSwitchAutoRouteAnalyticsTracker(@NotNull getPictureSize getpicturesize) {
        Intrinsics.checkNotNullParameter(getpicturesize, "<set-?>");
        this.switchAutoRouteAnalyticsTracker = getpicturesize;
    }

    public final void setSwitchButtonOnClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ((SwitchCompat) _$_findCachedViewById(resetInternal.setMax.setTextFuture)).setOnClickListener(onClickListener);
    }

    public final void setSwitchButtonOnCheckedChangeListener(@NotNull CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        Intrinsics.checkNotNullParameter(onCheckedChangeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ((SwitchCompat) _$_findCachedViewById(resetInternal.setMax.setTextFuture)).setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public final void setViewVisibility(boolean z) {
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(resetInternal.setMax.setMenuCallbacks);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "rl_wrapper");
        int i = 0;
        relativeLayout.setVisibility(z ? 0 : 8);
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.setMaxCardElevation);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "v_line");
        if (!z) {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
    }

    public final void onBind(@Nullable SettingModel settingModel) {
        if (settingModel != null) {
            this.setMin = settingModel.getAutoRouteAuthenticationType();
            setViewVisibility(settingModel.isNeedToShow());
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
            Intrinsics.checkNotNullExpressionValue(textView, "tv_title");
            textView.setText(settingModel.getTitle());
            getMax(settingModel.isAutoRouteSwitch());
            setMin(settingModel.isAutoRouteSwitch());
        }
    }

    public final void onCheckedChange(@NotNull CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(compoundButton, "compoundButton");
        setMin(z);
        if (compoundButton.getTag() != null) {
            compoundButton.setTag((Object) null);
        } else if (z) {
            CaptureParam captureParam = this.switchAutoRoutePresenter;
            if (captureParam == null) {
                Intrinsics.throwUninitializedPropertyAccessException("switchAutoRoutePresenter");
            }
            captureParam.length.execute(Unit.INSTANCE, new CaptureParam.length(captureParam), new CaptureParam.setMin(captureParam));
        } else {
            if (this.getMax == null) {
                TwoButtonWithImageDialog.setMax setmax = new TwoButtonWithImageDialog.setMax(getContext());
                setmax.equals = R.drawable.ic_auto_route_disable;
                setmax.setMin = getResources().getString(R.string.disable_auto_routing_title);
                setmax.length = getResources().getString(R.string.disable_auto_routing_message);
                setmax.values = getResources().getString(R.string.disable_auto_routing_positive);
                setmax.toString = new getMin(this);
                setmax.FastBitmap$CoordinateSystem = getResources().getString(R.string.disable_auto_routing_negative);
                setmax.hashCode = new IsOverlapping(this);
                setmax.IsOverlapping = true;
                this.getMax = setmax.setMax(false).getMax(false).getMin();
            }
            TwoButtonWithImageDialog twoButtonWithImageDialog = this.getMax;
            if (twoButtonWithImageDialog != null) {
                twoButtonWithImageDialog.setMin();
            }
        }
    }

    public final void revertChecked() {
        SwitchCompat switchCompat = (SwitchCompat) _$_findCachedViewById(resetInternal.setMax.setTextFuture);
        Intrinsics.checkNotNullExpressionValue(switchCompat, "switch_button");
        getMax(!switchCompat.isChecked());
    }

    public final void onSwitchResultRisk(boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
        Intrinsics.checkNotNullParameter(str2, "pubKey");
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        ChallengeControl.length length2 = new ChallengeControl.length(baseActivity);
        length2.getMin = "auto_route";
        ChallengeControl.length length3 = length2;
        length3.setMax = "auto_route";
        new ChallengeControl(length3.getMax(z, str, str2), (byte) 0).getMin();
    }

    public final void onSwitchResultAccept(boolean z) {
        String str;
        getPictureSize getpicturesize = this.switchAutoRouteAnalyticsTracker;
        if (getpicturesize == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchAutoRouteAnalyticsTracker");
        }
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        if (TextUtils.isEmpty(baseActivity.getSource())) {
            str = TrackerKey.SourceType.PROFILE;
        } else {
            str = baseActivity.getSource();
            Intrinsics.checkNotNullExpressionValue(str, "baseActivity.source");
        }
        getpicturesize.length(str, z);
        setMax(z);
    }

    public final void onSwitchResultReject(boolean z) {
        revertChecked();
        length();
    }

    public final void onProceedSwitchOn() {
        CaptureParam captureParam = this.switchAutoRoutePresenter;
        if (captureParam == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchAutoRoutePresenter");
        }
        captureParam.length(true, this.setMin);
    }

    public final void onCheckHavingAutorouteAsset(boolean z) {
        if (z) {
            getBaseActivity().startActivityForResult(new Intent(getBaseActivity(), BottomSheetAutoRoutingInfoActivity.class), 2001);
        } else {
            getBaseActivity().startActivity(new Intent(getBaseActivity(), BottomSheetNoAssetInfoActivity.class));
        }
    }

    public final void showProgress() {
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            setPublishStatus setpublishstatus = new setPublishStatus(baseActivity);
            this.getMin = setpublishstatus;
            if (setpublishstatus != null && !setpublishstatus.length.isShowing()) {
                setpublishstatus.length.show();
                setpublishstatus.getMax.startRefresh();
            }
        }
    }

    public final void dismissProgress() {
        setPublishStatus setpublishstatus = this.getMin;
        if (setpublishstatus != null) {
            setpublishstatus.getMax();
        }
    }

    public final void onError(@Nullable String str) {
        length();
        revertChecked();
    }

    private final void getMax(boolean z) {
        SwitchCompat switchCompat = (SwitchCompat) _$_findCachedViewById(resetInternal.setMax.setTextFuture);
        Intrinsics.checkNotNullExpressionValue(switchCompat, "switch_button");
        switchCompat.setTag("SwitchIgnore");
        SwitchCompat switchCompat2 = (SwitchCompat) _$_findCachedViewById(resetInternal.setMax.setTextFuture);
        Intrinsics.checkNotNullExpressionValue(switchCompat2, "switch_button");
        switchCompat2.setChecked(z);
        SwitchCompat switchCompat3 = (SwitchCompat) _$_findCachedViewById(resetInternal.setMax.setTextFuture);
        Intrinsics.checkNotNullExpressionValue(switchCompat3, "switch_button");
        switchCompat3.setTag((Object) null);
    }

    private final void setMin(boolean z) {
        ColorStateList colorStateList;
        SwitchCompat switchCompat = (SwitchCompat) _$_findCachedViewById(resetInternal.setMax.setTextFuture);
        switchCompat.setThumbTintList(IntRange.getMin(switchCompat.getContext(), (int) R.color.f19052131099800));
        if (z) {
            colorStateList = IntRange.getMin(switchCompat.getContext(), (int) R.color.f18392131099713);
        } else {
            colorStateList = IntRange.getMin(switchCompat.getContext(), (int) R.color.f24612131100411);
        }
        switchCompat.setTrackTintList(colorStateList);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ SwitchAutoRouteView getMax;

        getMin(SwitchAutoRouteView switchAutoRouteView) {
            this.getMax = switchAutoRouteView;
        }

        public final void onClick(View view) {
            this.getMax.getSwitchAutoRoutePresenter().length(false, this.getMax.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnClickListener {
        final /* synthetic */ SwitchAutoRouteView getMax;

        IsOverlapping(SwitchAutoRouteView switchAutoRouteView) {
            this.getMax = switchAutoRouteView;
        }

        public final void onClick(View view) {
            this.getMax.revertChecked();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"id/dana/richview/profile/switchautoroute/SwitchAutoRouteView$activityResultRendering$1", "Lid/dana/myprofile/SettingMoreProfileActivity$Listener;", "onCancelled", "", "reason", "", "onPhonePermissionGranted", "permissionGranted", "", "onSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements SettingMoreProfileActivity.setMax {
        final /* synthetic */ SettingMoreProfileActivity getMax;
        final /* synthetic */ SwitchAutoRouteView setMin;

        setMin(SwitchAutoRouteView switchAutoRouteView, SettingMoreProfileActivity settingMoreProfileActivity) {
            this.setMin = switchAutoRouteView;
            this.getMax = settingMoreProfileActivity;
        }

        public final void setMin() {
            getPictureSize switchAutoRouteAnalyticsTracker = this.setMin.getSwitchAutoRouteAnalyticsTracker();
            String access$getAutoRouteSource = SwitchAutoRouteView.access$getAutoRouteSource(this.setMin, this.getMax);
            SwitchCompat switchCompat = (SwitchCompat) this.setMin._$_findCachedViewById(resetInternal.setMax.setTextFuture);
            Intrinsics.checkNotNullExpressionValue(switchCompat, "switch_button");
            switchAutoRouteAnalyticsTracker.length(access$getAutoRouteSource, switchCompat.isChecked());
            SwitchAutoRouteView switchAutoRouteView = this.setMin;
            SwitchCompat switchCompat2 = (SwitchCompat) switchAutoRouteView._$_findCachedViewById(resetInternal.setMax.setTextFuture);
            Intrinsics.checkNotNullExpressionValue(switchCompat2, "switch_button");
            switchAutoRouteView.setMax(switchCompat2.isChecked());
        }

        public final void setMax(@Nullable String str) {
            setStateOn access$getPhonePermission$p;
            if (Intrinsics.areEqual((Object) ChallengeControl.CancelReason.PIN_TEMPORARY_LOCKED, (Object) str)) {
                DialogWithImage.length(this.setMin.getBaseActivity(), new setMax(this.setMin)).setMin();
            } else if (Intrinsics.areEqual((Object) "forgot_pin", (Object) str) && (access$getPhonePermission$p = this.setMin.length) != null) {
                access$getPhonePermission$p.setMin();
            }
            this.setMin.revertChecked();
            this.setMin.length();
        }

        public final void getMin() {
            click.getMin(this.setMin.getBaseActivity(), "1500445", true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"id/dana/richview/profile/switchautoroute/SwitchAutoRouteView$initPermission$1", "Lid/dana/utils/permission/Permission$PermissionListener;", "onPermissionDenied", "", "report", "Lid/dana/utils/permission/Permission$PermissionReport;", "onPermissionGranted", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements setStateOn.length {
        final /* synthetic */ SwitchAutoRouteView getMax;

        public final void setMin(@NotNull setStateOn.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "report");
        }

        getMax(SwitchAutoRouteView switchAutoRouteView) {
            this.getMax = switchAutoRouteView;
        }

        public final void getMin(@NotNull setStateOn.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "report");
            click.getMin(this.getMax.getBaseActivity(), "1500445", setmin.setMax());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements DialogInterface.OnClickListener {
        final /* synthetic */ SwitchAutoRouteView setMax;

        setMax(SwitchAutoRouteView switchAutoRouteView) {
            this.setMax = switchAutoRouteView;
        }

        public final void onClick(@NotNull DialogInterface dialogInterface, int i) {
            Intrinsics.checkNotNullParameter(dialogInterface, ImagePickerEvent.DIALOG);
            if (i == -2) {
                dialogInterface.dismiss();
            } else if (i == -1) {
                setStateOn access$getPhonePermission$p = this.setMax.length;
                if (access$getPhonePermission$p != null) {
                    access$getPhonePermission$p.setMin();
                }
                dialogInterface.dismiss();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setMax(boolean z) {
        String string = getContext().getString(z ? R.string.auto_routing_success_activation : R.string.auto_routing_success_deactivation);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …ss_deactivation\n        )");
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        setCancelText.length(baseActivity, R.drawable.ic_success, R.drawable.bg_rounded_toast_auto_route, string, 48, 60, false, (String) null, 384);
    }

    /* access modifiers changed from: private */
    public final void length() {
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        setCancelText.length(baseActivity, R.drawable.ic_close_red, R.drawable.bg_rounded_toast_failed, getContext().getString(R.string.auto_routing_error), 48, 60, false, (String) null, 384);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/richview/profile/switchautoroute/SwitchAutoRouteView$Companion;", "", "()V", "SWITCH_IGNORE", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public final void setup() {
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            SettingMoreProfileActivity settingMoreProfileActivity = (SettingMoreProfileActivity) baseActivity;
            settingMoreProfileActivity.setAutoRouteListener(new setMin(this, settingMoreProfileActivity));
            setStateOn.getMin getmin = new setStateOn.getMin((Activity) getBaseActivity());
            getmin.length.add("android.permission.CALL_PHONE");
            getmin.getMax = new getMax(this);
            this.length = new setStateOn(getmin, (byte) 0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.myprofile.SettingMoreProfileActivity");
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r4) {
        invalidTimeout.setMin setmin = new invalidTimeout.setMin((byte) 0);
        if (r4 != null) {
            setmin.getMax = r4;
            setmin.getMin = new SwitchAutoRouteModule(this);
            stopIgnoring.setMin(setmin.getMin, SwitchAutoRouteModule.class);
            stopIgnoring.setMin(setmin.getMax, PrepareException.AnonymousClass1.class);
            new invalidTimeout(setmin.getMin, setmin.getMax, (byte) 0).length(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            CaptureParam captureParam = this.switchAutoRoutePresenter;
            if (captureParam == null) {
                Intrinsics.throwUninitializedPropertyAccessException("switchAutoRoutePresenter");
            }
            getminArr[0] = captureParam;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ String access$getAutoRouteSource(SwitchAutoRouteView switchAutoRouteView, BaseActivity baseActivity) {
        if (TextUtils.isEmpty(baseActivity.getSource())) {
            return TrackerKey.SourceType.PROFILE;
        }
        String source = baseActivity.getSource();
        Intrinsics.checkNotNullExpressionValue(source, "baseActivity.source");
        return source;
    }
}
