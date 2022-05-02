package id.dana.richview.profile.paymentauth;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncCommand;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.challenge.ChallengeControl;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.PaymentAuthenticationModule;
import id.dana.dialog.DialogWithImage;
import id.dana.myprofile.SettingMoreProfileActivity;
import javax.inject.Inject;
import o.ActionBar$LayoutParams;
import o.GlobalResourcePackage;
import o.IntRange;
import o.PopupWindowToast;
import o.PrepareException;
import o.click;
import o.dispatchOnCancelled;
import o.enableBeauty;
import o.getFlashMode;
import o.getInsetDodgeRect;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.setAspectRatio;
import o.setCancelText;
import o.setPublishStatus;
import o.setStateOn;
import o.showTime;
import o.stopIgnoring;

public class PaymentAuthenticationView extends BaseRichView implements setAspectRatio.length {
    public static final int REQUEST_CODE_PHONE_PERMISSION = 1002;
    @BindView(2131362485)
    ConstraintLayout clContainerPaymentAuth;
    private String getMax;
    private onDetachedFromLayoutParams getMin;
    @BindView(2131365857)
    ImageView ivDanaProtection;
    @Inject
    public setAspectRatio.setMax presenter;
    /* access modifiers changed from: private */
    public setStateOn setMax;
    private setPublishStatus setMin;
    @BindView(2131364747)
    SwitchCompat switchButton;
    @BindView(2131365581)
    TextView tvSubtitle;
    @BindView(2131365600)
    TextView tvTitle;

    public int getLayout() {
        return R.layout.authentication_payment_view;
    }

    public PaymentAuthenticationView(@NonNull Context context) {
        super(context);
    }

    public PaymentAuthenticationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PaymentAuthenticationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void init(Context context, AttributeSet attributeSet) {
        super.init(context, attributeSet);
        this.switchButton.setOnCheckedChangeListener(new getFlashMode(this));
        ((SettingMoreProfileActivity) getBaseActivity()).setPaymentAuthListener(new SettingMoreProfileActivity.setMax() {
            public final void setMin() {
                setCancelText.setMax(PaymentAuthenticationView.this.getBaseActivity(), R.drawable.ic_success, PaymentAuthenticationView.this.getContext().getString(R.string.msg_payment_authentication_success));
            }

            public final void setMax(String str) {
                if (ChallengeControl.CancelReason.PIN_TEMPORARY_LOCKED.equals(str)) {
                    DialogWithImage.length(PaymentAuthenticationView.this.getBaseActivity(), new enableBeauty(PaymentAuthenticationView.this)).setMin();
                } else if ("forgot_pin".equals(str)) {
                    PaymentAuthenticationView.this.setMax.setMin();
                }
                PaymentAuthenticationView.this.paymentSwitchState(true);
                setCancelText.setMax(PaymentAuthenticationView.this.getBaseActivity(), R.drawable.ic_close_red, PaymentAuthenticationView.this.getContext().getString(R.string.msg_payment_authentication_failed));
            }

            public final void getMin() {
                click.getMin(PaymentAuthenticationView.this.getBaseActivity(), "1500445", true);
            }
        });
        setStateOn.getMin getmin = new setStateOn.getMin((Activity) getBaseActivity());
        getmin.length.add("android.permission.CALL_PHONE");
        getmin.getMax = new setStateOn.length() {
            public final void setMin(setStateOn.setMin setmin) {
            }

            public final void getMin(setStateOn.setMin setmin) {
                click.getMin(PaymentAuthenticationView.this.getBaseActivity(), "1500445", setmin.setMax());
            }
        };
        this.setMax = new setStateOn(getmin, (byte) 0);
    }

    public void injected(boolean z) {
        if (z) {
            this.presenter.getMax();
        }
    }

    @OnClick({2131362412})
    public void onClDanaProtectionClick() {
        DanaH5.startContainerFullUrl("https://m.dana.id/m/standalone/protection");
    }

    public void setTitle(String str) {
        this.tvTitle.setText(str);
    }

    public void onError(String str) {
        showWarningDialog(str);
    }

    public void onSuccessInitPaymentControl(showTime showtime) {
        if (showtime == null || !showtime.getMax()) {
            this.clContainerPaymentAuth.setVisibility(8);
            return;
        }
        this.getMax = showtime.setMin;
        this.clContainerPaymentAuth.setVisibility(0);
        this.switchButton.setTag(IAPSyncCommand.COMMAND_INIT);
        this.switchButton.setChecked(showtime.setMax());
        this.switchButton.setTag((Object) null);
    }

    public void showSwitchLoading() {
        if (getBaseActivity() != null) {
            setPublishStatus setpublishstatus = new setPublishStatus(getBaseActivity());
            this.setMin = setpublishstatus;
            if (!setpublishstatus.length.isShowing()) {
                setpublishstatus.length.show();
                setpublishstatus.getMax.startRefresh();
            }
        }
    }

    public void dismissSwitchLoading() {
        setPublishStatus setpublishstatus = this.setMin;
        if (setpublishstatus != null) {
            setpublishstatus.getMax();
        }
    }

    public void challengePassword(PopupWindowToast popupWindowToast) {
        ChallengeControl.length length = new ChallengeControl.length(getBaseActivity());
        length.getMin = "payment_auth";
        ChallengeControl.length length2 = length;
        length2.setMax = "payment_auth";
        new ChallengeControl(length2.getMax(this.switchButton.isChecked(), popupWindowToast), (byte) 0).getMin();
    }

    public void paymentSwitchState(boolean z) {
        SwitchCompat switchCompat = this.switchButton;
        if (switchCompat != null) {
            switchCompat.setTag(IAPSyncCommand.COMMAND_INIT);
            this.switchButton.setChecked(z);
            this.switchButton.setTag((Object) null);
        }
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        GlobalResourcePackage.length length = new GlobalResourcePackage.length((byte) 0);
        if (r4 != null) {
            length.getMin = r4;
            length.setMax = new PaymentAuthenticationModule(this);
            stopIgnoring.setMin(length.setMax, PaymentAuthenticationModule.class);
            stopIgnoring.setMin(length.getMin, PrepareException.AnonymousClass1.class);
            new GlobalResourcePackage(length.setMax, length.getMin, (byte) 0).setMax(this);
            registerPresenter(this.presenter);
            return;
        }
        throw null;
    }

    public void setup() {
        this.tvSubtitle.setText(ActionBar$LayoutParams.length(getContext().getString(R.string.description_auth_payment), 0));
    }

    public void showProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMin;
        if (ondetachedfromlayoutparams == null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.clContainerPaymentAuth);
            setmax.getMax = R.layout.view_switch_button_skeleton;
            setmax.isInside = 20;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 20;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            this.getMin = getinsetdodgerect;
            return;
        }
        ondetachedfromlayoutparams.getMin();
    }

    public void dismissProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMin;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    public void onSuccesSwitchPaymentControl(PopupWindowToast popupWindowToast) {
        setCancelText.setMax(getBaseActivity(), R.drawable.ic_success, getContext().getString(R.string.msg_payment_authentication_success));
    }

    public void onErrorSwitchPaymentAuth() {
        setCancelText.setMax(getBaseActivity(), R.drawable.ic_close_red, getContext().getString(R.string.msg_payment_authentication_failed));
        paymentSwitchState(false);
    }

    public void onErrorInitPaymentAuth() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMin;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
        this.clContainerPaymentAuth.setVisibility(8);
    }

    public static /* synthetic */ void setMax(PaymentAuthenticationView paymentAuthenticationView, DialogInterface dialogInterface, int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1272472459, oncanceled);
            onCancelLoad.getMin(1272472459, oncanceled);
        }
        if (i == -2) {
            dialogInterface.dismiss();
        } else if (i == -1) {
            paymentAuthenticationView.setMax.setMin();
            dialogInterface.dismiss();
        }
    }

    public static /* synthetic */ void getMin(PaymentAuthenticationView paymentAuthenticationView, CompoundButton compoundButton, boolean z) {
        paymentAuthenticationView.switchButton.setThumbTintList(paymentAuthenticationView.getResources().getColorStateList(R.color.f19052131099800));
        if (z) {
            paymentAuthenticationView.switchButton.setTrackTintList(paymentAuthenticationView.getResources().getColorStateList(R.color.f18392131099713));
        } else {
            paymentAuthenticationView.switchButton.setTrackTintList(paymentAuthenticationView.getResources().getColorStateList(R.color.f24612131100411));
        }
        if (compoundButton.getTag() == null) {
            paymentAuthenticationView.presenter.getMin(paymentAuthenticationView.switchButton.isChecked(), paymentAuthenticationView.getMax);
        }
    }
}
