package id.dana.sendmoney.summary;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import butterknife.BindView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.base.LockableBaseBottomSheetBehavior;
import id.dana.data.sendmoney.model.TransferUserInfoResult;
import id.dana.di.modules.SendMoneySummaryModule;
import id.dana.model.CurrencyAmountModel;
import id.dana.model.PayMethodModel;
import id.dana.richview.CurrencyTextView;
import id.dana.sendmoney.calculator.CalculatorActivity;
import id.dana.sendmoney.confirmation.SendMoneyConfirmationActivity;
import id.dana.sendmoney.feed.ShareToFeedsView;
import id.dana.sendmoney.model.ConfirmationModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.ShareActivityModel;
import id.dana.sendmoney.model.VoucherModel;
import id.dana.sendmoney.model.WithdrawOTCModel;
import id.dana.sendmoney.paymethod.ChangePayMethodView;
import id.dana.sendmoney.recipient.RecipientType;
import id.dana.sendmoney.remarks.NoteView;
import id.dana.sendmoney.view.ExpireTimeView;
import id.dana.sendmoney.voucher.ChangeVoucherView;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.APImageDownloadRsp;
import o.IntRange;
import o.NebulaLoadingView;
import o.PrepareException;
import o.WheelView;
import o.adaptAppModel;
import o.entrySet;
import o.getChildrenSkipCount;
import o.getInsetDodgeRect;
import o.getPhotoWidth;
import o.getThumb;
import o.isBaselineAligned;
import o.isLineVisible;
import o.onDetachedFromLayoutParams;
import o.setFail;
import o.setH5ShowOptionMenuFlag;
import o.setPhotoWidth;
import o.setProxy;
import o.stopIgnoring;

public class SummaryRichView extends BaseRichView implements setProxy.setMax {
    private boolean IsOverlapping;
    @BindView(2131361950)
    View bottomActionView;
    @BindView(2131362062)
    Button btnConfirm;
    @BindView(2131365918)
    ChangePayMethodView changePayMethodView;
    @BindView(2131362660)
    CardView cvSummary;
    @BindView(2131362755)
    View dividerBottom;
    @BindView(2131362761)
    View dividerTop;
    private RecipientModel equals;
    @BindView(2131362835)
    ExpireTimeView etvChangeExpiry;
    private LockableBaseBottomSheetBehavior<CardView> getMax;
    /* access modifiers changed from: private */
    public CurrencyAmountModel getMin;
    private CurrencyAmountModel hashCode;
    private boolean isInside;
    private entrySet length;
    @Inject
    public setProxy.length presenter;
    @BindView(2131364568)
    NoteView rvSetRemarks;
    /* access modifiers changed from: private */
    public PayMethodModel setMax;
    /* access modifiers changed from: private */
    public boolean setMin;
    @BindView(2131364653)
    ShareToFeedsView shareToFeedsView;
    private String toDoubleRange;
    private onDetachedFromLayoutParams toFloatRange;
    private String toIntRange;
    private WithdrawOTCModel toString;
    @BindView(2131365089)
    TextView tvAdditional;
    @BindView(2131365261)
    TextView tvFreeTransfer;
    private String values;
    @BindView(2131365989)
    ChangeVoucherView viewVoucherChooser;

    private static boolean length(View view, View view2) {
        return view != null && view == view2;
    }

    public int getLayout() {
        return R.layout.view_rich_summary;
    }

    public void onGetSendMoneyFeedConfigSuccess(String str) {
    }

    public void onGetStateSendMoneyShareFeedFromLocal(String str) {
    }

    public void onGetUserAvatar(String str) {
    }

    public SummaryRichView(@NonNull Context context) {
        super(context);
    }

    public SummaryRichView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SummaryRichView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SummaryRichView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        super.injectComponent(r4);
        if (this.length == null) {
            adaptAppModel.length length2 = new adaptAppModel.length((byte) 0);
            if (r4 != null) {
                length2.length = r4;
                length2.setMin = new SendMoneySummaryModule(this);
                stopIgnoring.setMin(length2.setMin, SendMoneySummaryModule.class);
                stopIgnoring.setMin(length2.length, PrepareException.AnonymousClass1.class);
                this.length = new adaptAppModel(length2.setMin, length2.length, (byte) 0);
            } else {
                throw null;
            }
        }
        this.length.length(this);
        registerPresenter(this.presenter);
    }

    public void setLock(boolean z) {
        this.getMax.getMin = z;
    }

    public void setSplitBillId(String str) {
        this.toDoubleRange = str;
    }

    public void setPeekHeightBasedOnView(View view) {
        this.getMax.setPeekHeight(view.getHeight() + isLineVisible.length(getBaseActivity(), 112.0f));
    }

    public void setAmountToSent(CurrencyAmountModel currencyAmountModel) {
        this.getMin = currencyAmountModel;
    }

    public void setTransferAmountState(String str) {
        this.values = str;
    }

    public void setFreeMinAmount(CurrencyAmountModel currencyAmountModel) {
        this.hashCode = currencyAmountModel;
    }

    public void setRecipientModel(RecipientModel recipientModel) {
        this.equals = recipientModel;
        this.changePayMethodView.init(length());
        length(true, (View) null);
    }

    public void initPrePay(String str) {
        if (this.isInside) {
            this.viewVoucherChooser.initPrePay(str, length());
        }
    }

    private String length() {
        if (getMax()) {
            return "BALANCE";
        }
        if (getMin()) {
            return "LINK";
        }
        return setMax() ? "OTC" : "BANK_TRANSFER";
    }

    /* access modifiers changed from: private */
    public void length(boolean z, View view) {
        setMax(z, view);
        if (z && getMin()) {
            this.etvChangeExpiry.showDefaultView();
        }
        int i = 0;
        if (!length((View) this.changePayMethodView, view)) {
            this.changePayMethodView.setVisibility(z ? 0 : 8);
        }
        if (z) {
            this.changePayMethodView.showDefaultView();
        }
        this.viewVoucherChooser.setVisibility(z ? 0 : 8);
        this.btnConfirm.setVisibility(z ? 0 : 4);
        this.tvAdditional.setVisibility(z ? 0 : 8);
        this.rvSetRemarks.setVisibility(z ? 0 : 8);
        this.dividerTop.setVisibility(z ? 0 : 8);
        this.dividerBottom.setVisibility(z ? 0 : 8);
        ShareToFeedsView shareToFeedsView2 = this.shareToFeedsView;
        if (!z || !getMax()) {
            i = 8;
        }
        shareToFeedsView2.setVisibility(i);
        if (this.IsOverlapping) {
            this.tvAdditional.setVisibility(8);
            this.rvSetRemarks.setVisibility(8);
        }
    }

    private boolean getMax() {
        RecipientModel recipientModel = this.equals;
        return recipientModel != null && "contact".equals(recipientModel.onNavigationEvent);
    }

    private boolean getMin() {
        RecipientModel recipientModel = this.equals;
        return recipientModel != null && "link".equals(recipientModel.onNavigationEvent);
    }

    private boolean setMax() {
        RecipientModel recipientModel = this.equals;
        return recipientModel != null && RecipientType.OTC.equals(recipientModel.onNavigationEvent);
    }

    private void setMax(boolean z, View view) {
        if (!length((View) this.etvChangeExpiry, view)) {
            this.etvChangeExpiry.setVisibility((!z || !getMin()) ? 8 : 0);
        }
    }

    private boolean isInside() {
        return !TextUtils.isEmpty(this.values) && CalculatorActivity.StateAmount.EXCEEDED.equals(this.values);
    }

    private boolean IsOverlapping() {
        RecipientModel recipientModel = this.equals;
        return recipientModel != null && "bank".equals(recipientModel.onNavigationEvent);
    }

    public void showFreeTransferRemainingBanner() {
        PayMethodModel payMethodModel = this.setMax;
        if (payMethodModel != null) {
            length(payMethodModel.isInside);
        }
    }

    public void expand() {
        this.getMax.setState(3);
    }

    public void collapse() {
        this.getMax.setState(4);
    }

    public void hide() {
        this.getMax.setState(5);
    }

    public boolean isCollapsed() {
        return this.getMax.getState() == 4;
    }

    public boolean isExpanded() {
        return this.getMax.getState() == 3;
    }

    public boolean isHidden() {
        return this.getMax.getState() == 5;
    }

    public void showButton(boolean z) {
        this.bottomActionView.setVisibility((isHidden() || !z) ? 8 : 0);
    }

    public void listenBottomSheetState(BottomSheetBehavior.BottomSheetCallback bottomSheetCallback) {
        this.getMax.setBottomSheetCallback(bottomSheetCallback);
    }

    private static boolean length(String str) {
        return TransferUserInfoResult.KycLevel.KYC_2.equals(str) || "KYC2".equals(str);
    }

    private boolean equals() {
        PayMethodModel payMethodModel = this.setMax;
        if (payMethodModel == null || !payMethodModel.length()) {
            return false;
        }
        PayMethodModel payMethodModel2 = this.setMax;
        return length(TextUtils.isEmpty(payMethodModel2.toString) ? "" : payMethodModel2.toString);
    }

    public void onMaximumAmountReached(String str) {
        if (equals()) {
            showPopupConfirmationWithTopUp(str);
        } else if (getBaseActivity() instanceof CalculatorActivity) {
            ((CalculatorActivity) getBaseActivity()).onMaximumAmountReached(str);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAmountValidAndActionConfirmed() {
        /*
            r20 = this;
            r0 = r20
            id.dana.sendmoney.model.RecipientModel r1 = r0.equals
            id.dana.sendmoney.paymethod.ChangePayMethodView r2 = r0.changePayMethodView
            java.lang.String r2 = r2.getKycLevel()
            r1.Grayscale$Algorithm = r2
            id.dana.sendmoney.model.RecipientModel r1 = r0.equals
            id.dana.model.PayMethodModel r2 = r0.setMax
            long r2 = r2.isInside
            int r3 = (int) r2
            r1.Mean$Arithmetic = r3
            id.dana.sendmoney.model.RecipientModel r1 = r0.equals
            java.lang.String r1 = r1.onNavigationEvent
            int r2 = r1.hashCode()
            r3 = 2
            r4 = 1
            switch(r2) {
                case 110366: goto L_0x0041;
                case 3016252: goto L_0x0037;
                case 3321850: goto L_0x002d;
                case 951526432: goto L_0x0023;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x004b
        L_0x0023:
            java.lang.String r2 = "contact"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004b
            r1 = 0
            goto L_0x004c
        L_0x002d:
            java.lang.String r2 = "link"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004b
            r1 = 3
            goto L_0x004c
        L_0x0037:
            java.lang.String r2 = "bank"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004b
            r1 = 1
            goto L_0x004c
        L_0x0041:
            java.lang.String r2 = "otc"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004b
            r1 = 2
            goto L_0x004c
        L_0x004b:
            r1 = -1
        L_0x004c:
            if (r1 == 0) goto L_0x00ac
            if (r1 == r4) goto L_0x0094
            if (r1 == r3) goto L_0x0076
            o.setProxy$length r5 = r0.presenter
            id.dana.sendmoney.model.RecipientModel r6 = r0.equals
            id.dana.model.CurrencyAmountModel r7 = r0.getMin
            id.dana.model.PayMethodModel r8 = r0.setMax
            id.dana.sendmoney.view.ExpireTimeView r1 = r0.etvChangeExpiry
            java.lang.String r9 = r1.getSelectedUnit()
            id.dana.sendmoney.view.ExpireTimeView r1 = r0.etvChangeExpiry
            java.lang.String r10 = r1.getSelectedValue()
            id.dana.sendmoney.remarks.NoteView r1 = r0.rvSetRemarks
            java.lang.String r11 = r1.getRemarks()
            id.dana.sendmoney.voucher.ChangeVoucherView r1 = r0.viewVoucherChooser
            id.dana.sendmoney.model.VoucherModel r12 = r1.getSelectedVoucher()
            r5.setMin(r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0076:
            o.setProxy$length r13 = r0.presenter
            id.dana.sendmoney.model.RecipientModel r14 = r0.equals
            id.dana.model.CurrencyAmountModel r15 = r0.getMin
            id.dana.model.PayMethodModel r1 = r0.setMax
            id.dana.sendmoney.remarks.NoteView r2 = r0.rvSetRemarks
            java.lang.String r17 = r2.getRemarks()
            id.dana.sendmoney.voucher.ChangeVoucherView r2 = r0.viewVoucherChooser
            id.dana.sendmoney.model.VoucherModel r18 = r2.getSelectedVoucher()
            id.dana.sendmoney.model.WithdrawOTCModel r2 = r0.toString
            r16 = r1
            r19 = r2
            r13.setMax(r14, r15, r16, r17, r18, r19)
            return
        L_0x0094:
            o.setProxy$length r3 = r0.presenter
            id.dana.sendmoney.model.RecipientModel r4 = r0.equals
            id.dana.model.CurrencyAmountModel r5 = r0.getMin
            id.dana.model.PayMethodModel r6 = r0.setMax
            id.dana.sendmoney.remarks.NoteView r1 = r0.rvSetRemarks
            java.lang.String r7 = r1.getRemarks()
            id.dana.sendmoney.voucher.ChangeVoucherView r1 = r0.viewVoucherChooser
            id.dana.sendmoney.model.VoucherModel r8 = r1.getSelectedVoucher()
            r3.length(r4, r5, r6, r7, r8)
            return
        L_0x00ac:
            o.setProxy$length r9 = r0.presenter
            id.dana.sendmoney.model.RecipientModel r10 = r0.equals
            id.dana.model.CurrencyAmountModel r11 = r0.getMin
            id.dana.model.PayMethodModel r12 = r0.setMax
            id.dana.sendmoney.remarks.NoteView r1 = r0.rvSetRemarks
            java.lang.String r13 = r1.getRemarks()
            id.dana.sendmoney.voucher.ChangeVoucherView r1 = r0.viewVoucherChooser
            id.dana.sendmoney.model.VoucherModel r14 = r1.getSelectedVoucher()
            r9.setMax(r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.summary.SummaryRichView.onAmountValidAndActionConfirmed():void");
    }

    public void onGetX2XVoucherSuccess(boolean z) {
        this.isInside = z;
    }

    public void goToConfirmation(ConfirmationModel confirmationModel) {
        confirmationModel.mayLaunchUrl = this.toIntRange;
        confirmationModel.validateRelationship = this.toDoubleRange;
        confirmationModel.updateVisuals = this.values;
        if (getMax()) {
            confirmationModel.receiveFile = new ShareActivityModel(this.shareToFeedsView.isChecked(), this.shareToFeedsView.isNeedToActivateFeedsSharing());
        }
        CurrencyAmountModel currencyAmountModel = this.hashCode;
        if (currencyAmountModel != null) {
            confirmationModel.IPostMessageService = currencyAmountModel.getMax;
        }
        getBaseActivity().startActivityForResult(SendMoneyConfirmationActivity.createConfirmationIntent(getBaseActivity(), confirmationModel), SendMoneyConfirmationActivity.REQUEST_CODE_CONFIRMATION);
    }

    public void setButtonEnabled(boolean z) {
        this.btnConfirm.setEnabled(z);
    }

    public void onError(String str) {
        showWarningDialog(str);
    }

    public void setRemarksView(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.rvSetRemarks.setRemarks(str);
            this.rvSetRemarks.setRemarksActionButtonVisible(false);
        }
        if ("split_bill".equals(this.equals.ICustomTabsCallback)) {
            if (TextUtils.isEmpty(str)) {
                this.IsOverlapping = true;
                this.tvAdditional.setVisibility(8);
                this.rvSetRemarks.setVisibility(8);
            }
            this.rvSetRemarks.setRemarksActionButtonVisible(false);
        }
    }

    public void setMarginBottomBasedOnFloatingView(int i) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.bottomActionView.getVisibility() != 0) {
            i = (int) (((float) ((int) (Resources.getSystem().getDisplayMetrics().density * 12.0f))) + this.cvSummary.getRadius());
        }
        layoutParams.setMargins(0, (int) (Resources.getSystem().getDisplayMetrics().density * 12.0f), 0, i);
    }

    public void changePayMethodHide() {
        this.changePayMethodView.showChangeMethod(false);
        length(true, (View) null);
        showButton(true);
        this.setMin = false;
    }

    public boolean isPayMethodShow() {
        return this.setMin;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == ChangeVoucherView.CHANGE_VOUCHER_REQUEST_CODE && intent != null) {
            Bundle extras = intent.getExtras();
            if (i2 == -1 && extras != null) {
                this.viewVoucherChooser.setSelectedVoucherThenRefresh((VoucherModel) extras.getParcelable("voucher"));
            }
        }
        if (i == SendMoneyConfirmationActivity.REQUEST_CODE_CONFIRMATION) {
            collapse();
        }
    }

    public void setTransferScenario(String str) {
        this.toIntRange = str;
    }

    public void setWithdrawOTCModel(WithdrawOTCModel withdrawOTCModel) {
        this.toString = withdrawOTCModel;
    }

    public void setup() {
        LockableBaseBottomSheetBehavior<CardView> lockableBaseBottomSheetBehavior = (LockableBaseBottomSheetBehavior) BottomSheetBehavior.from(this.cvSummary);
        this.getMax = lockableBaseBottomSheetBehavior;
        lockableBaseBottomSheetBehavior.setState(5);
        this.changePayMethodView.setChangePayMethodListener(new ChangePayMethodView.setMax() {
            public final void setMin() {
                SummaryRichView.this.changePayMethodView.setVoucherModel(SummaryRichView.this.viewVoucherChooser.getSelectedVoucher());
                SummaryRichView summaryRichView = SummaryRichView.this;
                summaryRichView.length(false, (View) summaryRichView.changePayMethodView);
                SummaryRichView.access$100(SummaryRichView.this, false);
                SummaryRichView.this.showButton(false);
                boolean unused = SummaryRichView.this.setMin = true;
                SummaryRichView.this.setLock(false);
            }

            public final void length(PayMethodModel payMethodModel) {
                if (payMethodModel != null) {
                    PayMethodModel unused = SummaryRichView.this.setMax = payMethodModel;
                    if (SummaryRichView.this.setMax.setMin()) {
                        SummaryRichView.this.setMax.toDoubleRange = SummaryRichView.this.setMax.length(SummaryRichView.this.getContext());
                    }
                    SummaryRichView.this.viewVoucherChooser.setPayMethod(payMethodModel.values);
                    SummaryRichView.this.btnConfirm.setEnabled(true);
                    SummaryRichView summaryRichView = SummaryRichView.this;
                    summaryRichView.length(summaryRichView.setMax.isInside);
                    SummaryRichView.this.presenter.getMax(SummaryRichView.this.getMin, SummaryRichView.this.setMax, false);
                }
                SummaryRichView.this.showButton(true);
                SummaryRichView.this.length(true, (View) null);
                boolean unused2 = SummaryRichView.this.setMin = false;
            }

            public final void setMin(List<String> list) {
                SummaryRichView.this.viewVoucherChooser.setAvailablePayMethods(list);
            }
        });
        this.etvChangeExpiry.setListener(new ExpireTimeView.length() {
            public final void setMin() {
                SummaryRichView summaryRichView = SummaryRichView.this;
                summaryRichView.length(false, (View) summaryRichView.etvChangeExpiry);
                SummaryRichView.this.showButton(false);
            }

            public final void setMax() {
                SummaryRichView.this.length(true, (View) null);
                SummaryRichView.this.showButton(true);
            }
        });
        this.btnConfirm.setOnClickListener(new getThumb(this));
        this.viewVoucherChooser.setListener(new getPhotoWidth(this));
        this.presenter.setMin(getMax());
        this.bottomActionView.getViewTreeObserver().addOnGlobalLayoutListener(new setFail(this));
    }

    /* access modifiers changed from: private */
    public void length(long j) {
        this.tvFreeTransfer.setVisibility((!IsOverlapping() || !isInside()) ? 8 : 0);
        int i = (int) j;
        String format = String.format(getContext().getResources().getQuantityString(R.plurals.f75242131755013, i, new Object[]{Integer.valueOf(i)}), new Object[]{Long.valueOf(j)});
        String format2 = String.format(getContext().getResources().getQuantityString(R.plurals.f75232131755012, i, new Object[]{Integer.valueOf(i)}), new Object[]{Long.valueOf(j)});
        setH5ShowOptionMenuFlag seth5showoptionmenuflag = new setH5ShowOptionMenuFlag();
        seth5showoptionmenuflag.getMin = format;
        seth5showoptionmenuflag.setMax = format2;
        setH5ShowOptionMenuFlag max = seth5showoptionmenuflag.getMax();
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(new StyleSpan(1), max.getMax, max.getMax + max.setMax.length(), 0);
        this.tvFreeTransfer.setText(spannableString);
    }

    public void onMinimumAmountReached(String str) {
        if (getBaseActivity() instanceof CalculatorActivity) {
            ((CalculatorActivity) getBaseActivity()).onMinimumAmountReached(str);
        }
    }

    public void onAmountValid() {
        if (getBaseActivity() instanceof CalculatorActivity) {
            ((CalculatorActivity) getBaseActivity()).onAmountValid();
        }
    }

    public void showPopupConfirmationWithTopUp(String str) {
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        String min = NebulaLoadingView.AnonymousClass1.getMin(WheelView.OnWheelViewListener.getMax, new APImageDownloadRsp(str).setMin, "Rp");
        new isBaselineAligned(getContext(), isBaselineAligned.getDEFAULT_BEHAVIOR()).message((Integer) null, String.format(getContext().getString(R.string.sm_message_max_debit), new Object[]{min}), (Function1<? super getChildrenSkipCount, Unit>) null).positiveButton(Integer.valueOf(R.string.balance_topup), (CharSequence) null, new setPhotoWidth(this)).negativeButton(Integer.valueOf(R.string.not_now), (CharSequence) null, (Function1<? super isBaselineAligned, Unit>) null).show();
    }

    public void showProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.toFloatRange;
        if (ondetachedfromlayoutparams == null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.btnConfirm);
            setmax.getMax = R.layout.view_skeleton_button_loading;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 20;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            this.toFloatRange = getinsetdodgerect;
            return;
        }
        ondetachedfromlayoutparams.getMin();
    }

    public void dismissProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.toFloatRange;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
            this.toFloatRange = null;
        }
    }

    static /* synthetic */ void access$100(SummaryRichView summaryRichView, boolean z) {
        summaryRichView.tvFreeTransfer.setVisibility((!z || !summaryRichView.IsOverlapping() || !summaryRichView.isInside()) ? 8 : 0);
    }
}
