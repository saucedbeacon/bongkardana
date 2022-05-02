package id.dana.sendmoney.calculator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.danah5.DanaH5;
import id.dana.data.base.NetworkException;
import id.dana.di.modules.SendMoneyModule;
import id.dana.model.CurrencyAmountModel;
import id.dana.richview.CurrencyTextView;
import id.dana.richview.calculator.CalculatorView;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.WithdrawOTCModel;
import id.dana.sendmoney.premium.PremiumNoticeActivity;
import id.dana.sendmoney.recipient.RecipientType;
import id.dana.sendmoney.summary.SummaryRichView;
import id.dana.tracker.TrackerKey;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import javax.inject.Inject;
import o.APImageDownloadRsp;
import o.AppxPrerunChecker;
import o.BFileUtils;
import o.DiagnosticsReceiver;
import o.Exif;
import o.GriverProgressBar;
import o.IntRange;
import o.NebulaLoadingView;
import o.NoneScaleMode;
import o.PrepareException;
import o.SpecificCropMode;
import o.WheelView;
import o.checkFile;
import o.convertDipToPx;
import o.dispatchOnCancelled;
import o.doDismissWithAnimation;
import o.genTextSelector;
import o.getDataFieldCount;
import o.getInsetDodgeRect;
import o.getLegacySignPublicKey;
import o.isCanUseRandomAccessFileExif;
import o.isLineVisible;
import o.isShowRecentUseTinyAppArea;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.safeCopyToFile;
import o.setOnMenuWindowDismissListener;

public class CalculatorActivity extends BaseActivity implements DiagnosticsReceiver.length {
    private boolean IsOverlapping = false;
    @BindView(2131362132)
    Button btnSetAmount;
    @BindView(2131362659)
    CalculatorView calculatorPadView;
    @BindView(2131362606)
    CurrencyTextView crvAmountValue;
    private String equals;
    private GriverProgressBar.UpdateRunnable getMax;
    private AppxPrerunChecker getMin;
    private String isInside;
    @BindView(2131363391)
    ImageView ivClose;
    @BindView(2131363412)
    ImageView ivDanaUserLogo;
    @BindView(2131363601)
    ImageView ivRecipient;
    @Inject
    public DiagnosticsReceiver.getMin presenter;
    @BindView(2131364327)
    SummaryRichView rcSummaryView;
    RecipientModel recipientModel;
    RecipientModel recipientModelToSent;
    private final doDismissWithAnimation setMax = new doDismissWithAnimation();
    /* access modifiers changed from: private */
    public boolean toFloatRange = true;
    private onDetachedFromLayoutParams toIntRange;
    @BindView(2131365240)
    TextView tvErrorMsg;
    @BindView(2131365494)
    TextView tvRecipientName;
    @BindView(2131365495)
    TextView tvRecipientNumber;

    @Retention(RetentionPolicy.SOURCE)
    public @interface StateAmount {
        public static final String BELOW = "BELOW";
        public static final String EXCEEDED = "EXCEEDED";
    }

    public int getLayout() {
        return R.layout.activity_new_send_money;
    }

    public void onInitCallback(getDataFieldCount getdatafieldcount) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-626642545, oncanceled);
            onCancelLoad.getMin(-626642545, oncanceled);
        }
    }

    public void onError(String str) {
        showWarningDialog(str, new SpecificCropMode(this), true, 3000);
    }

    private boolean length() {
        return ("split_bill".equals(this.recipientModel.ICustomTabsCallback) || "request_money".equals(this.recipientModel.ICustomTabsCallback)) && !TextUtils.isEmpty(this.recipientModel.valueOf);
    }

    public void onDestroy() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(626855203, oncanceled);
            onCancelLoad.getMin(626855203, oncanceled);
        }
        this.getMax.dispose();
        super.onDestroy();
    }

    public void configToolbar() {
        setCenterTitle(getString(R.string.sendmoney_title));
    }

    public void init() {
        int length;
        String str;
        String str2;
        int length2;
        int min;
        int length3;
        int min2;
        int length4;
        int min3;
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length4 = applicationContext.fileList().length) == (min3 = dispatchOnCancelled.getMin(applicationContext, length4)))) {
            onCanceled oncanceled = new onCanceled(length4, min3, 32);
            onCancelLoad.setMax(-2087761240, oncanceled);
            onCancelLoad.getMin(-2087761240, oncanceled);
        }
        if (this.getMin == null) {
            getLegacySignPublicKey.getMin getmin = new getLegacySignPublicKey.getMin((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                getmin.setMin = applicationComponent;
                getmin.setMax = new SendMoneyModule(this);
                this.getMin = getmin.setMin();
            } else {
                throw null;
            }
        }
        this.getMin.getMin(this);
        registerPresenter(this.presenter);
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1943552039, oncanceled2);
            onCancelLoad.getMin(-1943552039, oncanceled2);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length3 = applicationContext2.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext2, length3)))) {
            onCanceled oncanceled3 = new onCanceled(length3, min2, 32);
            onCancelLoad.setMax(-1943552039, oncanceled3);
            onCancelLoad.getMin(-1943552039, oncanceled3);
        }
        this.calculatorPadView.setCalculatorResultListener(new safeCopyToFile(this));
        this.crvAmountValue.setOnClickListener(new isCanUseRandomAccessFileExif(this));
        this.getMax = this.crvAmountValue.listenOriginalValue().subscribe(new checkFile(this));
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || (length2 = applicationContext3.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext3, length2)))) {
            onCanceled oncanceled4 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1576139177, oncanceled4);
            onCancelLoad.getMin(-1576139177, oncanceled4);
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.recipientModel = (RecipientModel) extras.getParcelable("data");
            this.equals = extras.getString("remarks");
        }
        String str3 = this.recipientModel.onNavigationEvent;
        char c = 65535;
        switch (str3.hashCode()) {
            case 110366:
                if (str3.equals(RecipientType.OTC)) {
                    c = 3;
                    break;
                }
                break;
            case 3016252:
                if (str3.equals("bank")) {
                    c = 1;
                    break;
                }
                break;
            case 3321850:
                if (str3.equals("link")) {
                    c = 2;
                    break;
                }
                break;
            case 951526432:
                if (str3.equals("contact")) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.presenter.length("BALANCE", this.recipientModel);
        } else if (c == 1) {
            this.presenter.length("BANK_TRANSFER", this.recipientModel);
        } else if (c == 2) {
            this.presenter.length("LINK", this.recipientModel);
        } else if (c == 3) {
            this.presenter.length("OTC", this.recipientModel);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled5 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(356562989, oncanceled5);
            onCancelLoad.getMin(356562989, oncanceled5);
        }
        RecipientModel recipientModel2 = this.recipientModel;
        if (recipientModel2 != null) {
            TextView textView = this.tvRecipientName;
            if ("link".equals(recipientModel2.onNavigationEvent)) {
                str = getString(R.string.send_as_link);
            } else if (TextUtils.isEmpty(this.recipientModel.setMin)) {
                str = this.recipientModel.length();
            } else {
                str = this.recipientModel.setMin;
            }
            textView.setText(str);
            TextView textView2 = this.tvRecipientNumber;
            if ("bank".equals(this.recipientModel.onNavigationEvent)) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.recipientModel.length);
                sb.append(" | ");
                String str4 = this.recipientModel.isInside;
                if (!TextUtils.isEmpty(str4)) {
                    str4 = str4.replace(" ", "");
                }
                Object[] objArr = new Object[1];
                if (str4.length() >= 4) {
                    str4 = str4.substring(str4.length() - 4);
                }
                objArr[0] = str4;
                sb.append(String.format("•••• %s", objArr));
                str2 = sb.toString();
            } else {
                str2 = this.recipientModel.isInside;
            }
            textView2.setText(str2);
            doDismissWithAnimation dodismisswithanimation = this.setMax;
            ImageView imageView = this.ivRecipient;
            String max3 = this.recipientModel.getMax();
            int max4 = getMax();
            setOnMenuWindowDismissListener.length length5 = new setOnMenuWindowDismissListener.length();
            length5.length = isLineVisible.getMax();
            length5.getMin = getMax();
            dodismisswithanimation.getMax(this, imageView, max3, max4, length5);
        }
        if (!TextUtils.isEmpty(this.recipientModel.valueOf)) {
            this.crvAmountValue.setText(this.recipientModel.valueOf);
            this.IsOverlapping = true ^ "split_bill".equals(this.recipientModel.ICustomTabsCallback);
        }
        if (this.recipientModel.values()) {
            this.ivClose.setVisibility(8);
        }
        this.rcSummaryView.listenBottomSheetState(new BottomSheetBehavior.BottomSheetCallback() {
            public final void onSlide(@NonNull View view, float f) {
            }

            public final void onStateChanged(@NonNull View view, int i) {
                boolean z = true;
                if (!(CalculatorActivity.this.toFloatRange == (i == 5) || CalculatorActivity.this.rcSummaryView == null)) {
                    CalculatorActivity.this.rcSummaryView.showButton(i != 5);
                }
                CalculatorActivity calculatorActivity = CalculatorActivity.this;
                if (i != 5) {
                    z = false;
                }
                boolean unused = calculatorActivity.toFloatRange = z;
            }
        });
        this.btnSetAmount.setOnClickListener(new BFileUtils(this));
        this.calculatorPadView.getViewTreeObserver().addOnGlobalLayoutListener(new NoneScaleMode(this));
        Context baseContext4 = getBaseContext();
        if (baseContext4 != null) {
            context = baseContext4.getApplicationContext();
        }
        if (!(context == null || (length = dispatchOnCancelled.length(context, 0)) == 0)) {
            onCanceled oncanceled6 = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-117658293, oncanceled6);
            onCancelLoad.getMin(-117658293, oncanceled6);
        }
        convertDipToPx.length length6 = new convertDipToPx.length(getApplicationContext());
        length6.getMax = TrackerKey.Event.SEND_MONEY_OPEN;
        convertDipToPx.length max5 = length6.setMax("Source", getSource());
        max5.setMin();
        genTextSelector.getMax(new convertDipToPx(max5, (byte) 0));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @androidx.annotation.DrawableRes
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getMax() {
        /*
            r4 = this;
            id.dana.sendmoney.model.RecipientModel r0 = r4.recipientModel
            java.lang.String r0 = r0.onNavigationEvent
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 1
            switch(r1) {
                case 110366: goto L_0x002c;
                case 3016252: goto L_0x0022;
                case 3321850: goto L_0x0018;
                case 951526432: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0036
        L_0x000e:
            java.lang.String r1 = "contact"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 3
            goto L_0x0037
        L_0x0018:
            java.lang.String r1 = "link"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "bank"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "otc"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x0049
            if (r0 == r3) goto L_0x0045
            if (r0 == r2) goto L_0x0041
            r0 = 2131232372(0x7f080674, float:1.8080851E38)
            return r0
        L_0x0041:
            r0 = 2131232174(0x7f0805ae, float:1.808045E38)
            return r0
        L_0x0045:
            r0 = 2131232022(0x7f080516, float:1.8080142E38)
            return r0
        L_0x0049:
            r0 = 2131232285(0x7f08061d, float:1.8080675E38)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.calculator.CalculatorActivity.getMax():int");
    }

    public void showSummaryView() {
        SummaryRichView summaryRichView;
        if (this.crvAmountValue.getAmount() != null && (summaryRichView = this.rcSummaryView) != null) {
            summaryRichView.setAmountToSent(new CurrencyAmountModel(this.crvAmountValue.getAmount(), "Rp"));
            this.rcSummaryView.setTransferAmountState(this.isInside);
            this.recipientModelToSent.toString = getSource();
            this.recipientModelToSent.invokeSuspend = this.recipientModel.invokeSuspend;
            this.recipientModelToSent.invoke = this.recipientModel.invoke;
            this.rcSummaryView.setRecipientModel(this.recipientModelToSent);
            this.rcSummaryView.setLock(this.IsOverlapping);
            this.rcSummaryView.setRemarksView(this.equals);
            this.rcSummaryView.setTransferScenario(getIntent().getStringExtra("transferScenario"));
            this.rcSummaryView.initPrePay(this.crvAmountValue.getAmount());
            this.rcSummaryView.setSplitBillId(getIntent().getStringExtra("splitBillId"));
            this.rcSummaryView.showFreeTransferRemainingBanner();
            this.rcSummaryView.collapse();
        }
    }

    @OnClick({2131363391})
    public void closeRecipient() {
        finish();
    }

    public void onRecipientIsDanaUser(String str, String str2, String str3, String str4, String str5) {
        this.ivDanaUserLogo.setVisibility(0);
        if (TextUtils.isEmpty(this.tvRecipientName.getText()) || "-".contentEquals(this.tvRecipientName.getText())) {
            this.tvRecipientName.setText(str3);
        }
        this.presenter.setMin(str, str2);
    }

    public void showSummaryPage(RecipientModel recipientModel2) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1547961625, oncanceled);
            onCancelLoad.getMin(1547961625, oncanceled);
        }
        if (recipientModel2 == null) {
            recipientModel2 = this.recipientModel;
        }
        this.recipientModelToSent = recipientModel2;
        this.isInside = StateAmount.EXCEEDED;
        this.tvErrorMsg.setVisibility(4);
        this.btnSetAmount.setEnabled(true);
        SummaryRichView summaryRichView = this.rcSummaryView;
        if (summaryRichView != null) {
            summaryRichView.setButtonEnabled(true);
        }
    }

    public void onMaximumAmountReached(String str) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1333466517 == (max = dispatchOnCancelled.getMax(applicationContext, 1333466517)))) {
            onCanceled oncanceled = new onCanceled(1333466517, max, 512);
            onCancelLoad.setMax(1333466517, oncanceled);
            onCancelLoad.getMin(1333466517, oncanceled);
        }
        length(str, getResources().getString(R.string.sm_maximum_amount), R.drawable.ic_warning_14, R.color.f20212131099924);
        this.btnSetAmount.setEnabled(false);
        SummaryRichView summaryRichView = this.rcSummaryView;
        if (summaryRichView != null) {
            summaryRichView.setButtonEnabled(false);
        }
    }

    public void onMinimumAmountReached(String str) {
        length(str, getResources().getString(R.string.sm_minimum_amount), R.drawable.ic_warning_14, R.color.f20212131099924);
        this.btnSetAmount.setEnabled(false);
        SummaryRichView summaryRichView = this.rcSummaryView;
        if (summaryRichView != null) {
            summaryRichView.setButtonEnabled(false);
        }
    }

    public void onInitTransferSuccess() {
        CurrencyTextView currencyTextView = this.crvAmountValue;
        if (currencyTextView != null && !currencyTextView.getAmountModel().getMax()) {
            this.presenter.setMax(this.crvAmountValue.getAmount());
            if (this.IsOverlapping) {
                showSummaryView();
            }
        }
    }

    public void onInitTransferOTCSuccess(WithdrawOTCModel withdrawOTCModel) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-939182069, oncanceled);
            onCancelLoad.getMin(-939182069, oncanceled);
        }
        this.rcSummaryView.setWithdrawOTCModel(withdrawOTCModel);
    }

    public void onTransferMethodEmpty() {
        showWarningDialog(getString(R.string.transfer_method_not_available), new Exif(this), false, 0);
    }

    public void onLimitBelowFreeMinAmount(RecipientModel recipientModel2, String str) {
        if (recipientModel2 == null) {
            recipientModel2 = this.recipientModel;
        }
        this.recipientModelToSent = recipientModel2;
        this.isInside = StateAmount.BELOW;
        if (setMin()) {
            length(str, getResources().getString(R.string.x2b_free_min_amount), R.drawable.ic_info_orange, R.color.f24942131100467);
        } else {
            this.tvErrorMsg.setVisibility(4);
        }
        this.btnSetAmount.setEnabled(true);
        SummaryRichView summaryRichView = this.rcSummaryView;
        if (summaryRichView != null) {
            summaryRichView.setButtonEnabled(true);
        }
        this.rcSummaryView.setFreeMinAmount(new CurrencyAmountModel(str));
    }

    private boolean setMin() {
        RecipientModel recipientModel2 = this.recipientModelToSent;
        return recipientModel2 != null && recipientModel2.Mean$Arithmetic > 0;
    }

    public void onBackPressed() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-474333472, oncanceled);
            onCancelLoad.getMin(-474333472, oncanceled);
        }
        if (this.rcSummaryView.isPayMethodShow()) {
            this.rcSummaryView.changePayMethodHide();
        } else if (this.rcSummaryView.isExpanded() && !this.IsOverlapping) {
            this.rcSummaryView.collapse();
        } else if (!this.rcSummaryView.isCollapsed() || this.IsOverlapping) {
            finish();
        } else {
            this.rcSummaryView.hide();
        }
    }

    private void length(String str, String str2, @DrawableRes int i, @ColorRes int i2) {
        if (!TextUtils.isEmpty(str)) {
            if (WheelView.OnWheelViewListener.getMax == null) {
                WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
            }
            String min = NebulaLoadingView.AnonymousClass1.getMin(WheelView.OnWheelViewListener.getMax, new APImageDownloadRsp(str).setMin, "Rp");
            isShowRecentUseTinyAppArea.getMax(IntRange.setMax(this, i2), this.tvErrorMsg);
            this.tvErrorMsg.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
            this.tvErrorMsg.setText(String.format(str2, new Object[]{min}));
            this.tvErrorMsg.setVisibility(0);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.rcSummaryView.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null) {
            Bundle extras = intent.getExtras();
            if (i == PremiumNoticeActivity.PREMIUM_NOTICE_REQUEST_CODE && extras != null && extras.getBoolean(PremiumNoticeActivity.KEY_IS_SELECTED_UPGRADE_BUTTON)) {
                DanaH5.startContainerFullUrl("https://m.dana.id/m/kyc/landingPage?entryPoint=sendMoney");
            }
        }
    }

    public void showProgress() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-2009004460, oncanceled);
            onCancelLoad.getMin(-2009004460, oncanceled);
        }
        if (length()) {
            this.calculatorPadView.enableCalculator(false);
        }
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.toIntRange;
        if (ondetachedfromlayoutparams == null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.btnSetAmount);
            setmax.getMax = R.layout.view_skeleton_btn_calculator_action;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 20;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            this.toIntRange = getinsetdodgerect;
            return;
        }
        ondetachedfromlayoutparams.getMin();
    }

    public void dismissProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.toIntRange;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
            this.toIntRange = null;
        }
    }

    public void onInitError(Throwable th) {
        String str;
        if (th instanceof NetworkException) {
            str = ((NetworkException) th).getMessage();
        } else {
            str = getString(R.string.general_error_msg);
        }
        onError(str);
    }

    public void onAmountValid() {
        this.btnSetAmount.setEnabled(true);
        SummaryRichView summaryRichView = this.rcSummaryView;
        if (summaryRichView != null) {
            summaryRichView.setButtonEnabled(true);
        }
        this.tvErrorMsg.setVisibility(4);
    }

    public static /* synthetic */ void setMax(CalculatorActivity calculatorActivity) {
        int length;
        int min;
        Context baseContext = calculatorActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1295110828, oncanceled);
            onCancelLoad.getMin(-1295110828, oncanceled);
        }
        calculatorActivity.finish();
    }

    public static /* synthetic */ void length(CalculatorActivity calculatorActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(886539612, oncanceled);
            onCancelLoad.getMin(886539612, oncanceled);
        }
        if (!calculatorActivity.IsOverlapping) {
            calculatorActivity.rcSummaryView.hide();
        }
    }

    public static /* synthetic */ void setMin(CalculatorActivity calculatorActivity) {
        int length;
        int min;
        Context baseContext = calculatorActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-884720537, oncanceled);
            onCancelLoad.getMin(-884720537, oncanceled);
        }
        calculatorActivity.onBackPressed();
    }

    public static /* synthetic */ void length(CalculatorActivity calculatorActivity, String str) {
        if (new APImageDownloadRsp(str).setMin()) {
            calculatorActivity.crvAmountValue.setText(str);
        }
    }
}
