package id.dana.splitbill.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.di.modules.SplitBillDetailModule;
import id.dana.di.modules.SplitBillModule;
import id.dana.requestmoney.RequestMoneyActivity;
import id.dana.richview.CurrencyTextView;
import id.dana.richview.socialshare.SocialShareView;
import id.dana.sendmoney.model.ShareQRSplitBillModel;
import id.dana.splitbill.model.PayerModel;
import id.dana.splitbill.model.SplitBillHistoryModel;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import o.AUNoticeDialog;
import o.GriverCommonResourceProxy;
import o.IntRange;
import o.NebulaLoadingView;
import o.PrepareException;
import o.WheelView;
import o.dispatchOnCancelled;
import o.endStructure;
import o.getEmojiSize;
import o.getInsetDodgeRect;
import o.isOriginHasAppInfo;
import o.isSingleLine;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.postDelayed;
import o.setBoldAutoSplitText;
import o.setH5MenuList;
import o.stopIgnoring;

public class SplitBillSummaryActivity extends BaseActivity {
    @BindView(2131362615)
    CurrencyTextView ctvTotalAmount;
    /* access modifiers changed from: private */
    public onDetachedFromLayoutParams equals;
    /* access modifiers changed from: private */
    public SplitBillHistoryModel getMax;
    private boolean getMin;
    /* access modifiers changed from: private */
    public GriverCommonResourceProxy isInside;
    @BindView(2131363644)
    ImageView ivSplitBillStatus;
    @BindView(2131363935)
    LinearLayout llBillDetailEmptyState;
    @BindView(2131363934)
    LinearLayout llSplitBillDetails;
    @BindView(2131364180)
    NestedScrollView nsvSplitBillSummary;
    @BindView(2131365963)
    PayerListView payerListView;
    /* access modifiers changed from: private */
    public String setMax;
    @Inject
    public AUNoticeDialog.AnonymousClass2.setMax splitBillDetailPresenter;
    @Inject
    public AUNoticeDialog.OnClickNegativeListener.setMin splitBillPresenter;
    @BindView(2131364706)
    SocialShareView ssvSplitBill;
    private endStructure toFloatRange;
    private ClosePayerDialogFragment toIntRange;
    @BindView(2131365513)
    TextView tvRemarks;
    @BindView(2131365724)
    View vDimBody;

    public int getLayout() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length))) {
            return R.layout.activity_split_bill_summary;
        }
        onCanceled oncanceled = new onCanceled(length, min, 32);
        onCancelLoad.setMax(-320802928, oncanceled);
        onCancelLoad.getMin(-320802928, oncanceled);
        return R.layout.activity_split_bill_summary;
    }

    public static Intent createIntent(Activity activity, String str) {
        Intent intent = new Intent(activity, SplitBillSummaryActivity.class);
        intent.putExtra("splitBillId", str);
        return intent;
    }

    public static Intent createIntentFromRequestMoney(BaseActivity baseActivity, String str) {
        Intent createIntent = createIntent(baseActivity, str);
        createIntent.putExtra("fromRequestMoney", true);
        return createIntent;
    }

    public void configToolbar() {
        setCenterTitle(getString(R.string.split_bill_title));
        setMenuLeftButton((int) R.drawable.arrow_left_white);
    }

    public void enableDimView() {
        this.vDimBody.setVisibility(0);
    }

    public void disableDimView() {
        this.vDimBody.setVisibility(8);
    }

    public void onBackPressed() {
        if (this.getMin) {
            Intent intent = new Intent(this, RequestMoneyActivity.class);
            intent.setFlags(67108864);
            startActivity(intent);
            return;
        }
        super.onBackPressed();
    }

    private void length(int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(1148872215, oncanceled);
            onCancelLoad.getMin(1148872215, oncanceled);
        }
        this.ivSplitBillStatus.setImageDrawable(IntRange.length((Context) this, i));
    }

    private boolean getMax() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(695607572, oncanceled);
            onCancelLoad.getMin(695607572, oncanceled);
        }
        return "IN_PROGRESS".equals(this.getMax.toFloatRange);
    }

    public void init() {
        if (this.toFloatRange == null) {
            postDelayed.getMax getmax = new postDelayed.getMax((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                getmax.setMin = applicationComponent;
                getmax.getMax = new SplitBillModule(new AUNoticeDialog.OnClickNegativeListener.setMax() {
                    public final void dismissProgress() {
                    }

                    public final void onError(String str) {
                    }

                    public final void showProgress() {
                    }

                    public final void setMin(GriverCommonResourceProxy griverCommonResourceProxy) {
                        GriverCommonResourceProxy unused = SplitBillSummaryActivity.this.isInside = griverCommonResourceProxy;
                        SplitBillSummaryActivity.this.splitBillDetailPresenter.length(SplitBillSummaryActivity.this.setMax);
                    }
                });
                getmax.setMax = new SplitBillDetailModule(new AUNoticeDialog.AnonymousClass2.setMin() {
                    public final void onError(String str) {
                    }

                    public final void getMin(SplitBillHistoryModel splitBillHistoryModel) {
                        SplitBillHistoryModel unused = SplitBillSummaryActivity.this.getMax = splitBillHistoryModel;
                        SplitBillSummaryActivity.access$100(SplitBillSummaryActivity.this);
                        SplitBillSummaryActivity.access$200(SplitBillSummaryActivity.this);
                    }

                    public final void setMin(boolean z) {
                        if (z) {
                            SplitBillSummaryActivity.this.toIntRange.dismiss();
                            SplitBillSummaryActivity.this.splitBillDetailPresenter.length(SplitBillSummaryActivity.this.setMax);
                        }
                    }

                    public final void getMin() {
                        SplitBillSummaryActivity.access$500(SplitBillSummaryActivity.this);
                    }

                    public final void showProgress() {
                        if (SplitBillSummaryActivity.this.equals == null) {
                            SplitBillSummaryActivity splitBillSummaryActivity = SplitBillSummaryActivity.this;
                            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(splitBillSummaryActivity.llSplitBillDetails);
                            setmax.getMax = R.layout.view_split_bill_detail_skeleton;
                            setmax.setMax = 1500;
                            setmax.length = true;
                            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
                            setmax.isInside = 0;
                            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
                            getinsetdodgerect.getMin();
                            onDetachedFromLayoutParams unused = splitBillSummaryActivity.equals = getinsetdodgerect;
                        } else {
                            SplitBillSummaryActivity.this.equals.getMin();
                        }
                        if (SplitBillSummaryActivity.this.ssvSplitBill != null) {
                            SplitBillSummaryActivity.this.ssvSplitBill.setVisibility(8);
                        }
                    }

                    public final void dismissProgress() {
                        if (SplitBillSummaryActivity.this.equals != null) {
                            SplitBillSummaryActivity.this.equals.length();
                            onDetachedFromLayoutParams unused = SplitBillSummaryActivity.this.equals = null;
                        }
                    }
                });
                stopIgnoring.setMin(getmax.getMax, SplitBillModule.class);
                stopIgnoring.setMin(getmax.setMax, SplitBillDetailModule.class);
                stopIgnoring.setMin(getmax.setMin, PrepareException.AnonymousClass1.class);
                this.toFloatRange = new postDelayed(getmax.getMax, getmax.setMax, getmax.setMin, (byte) 0);
            } else {
                throw null;
            }
        }
        this.toFloatRange.setMin(this);
        registerPresenter(this.splitBillPresenter, this.splitBillDetailPresenter);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.setMax = extras.getString("splitBillId");
            this.getMin = extras.getBoolean("fromRequestMoney", false);
        }
        this.splitBillPresenter.getMin();
    }

    static /* synthetic */ void access$100(SplitBillSummaryActivity splitBillSummaryActivity) {
        String str;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1810957464, oncanceled);
            onCancelLoad.getMin(-1810957464, oncanceled);
        }
        if (!TextUtils.isEmpty(splitBillSummaryActivity.getMax.toFloatRange)) {
            String str2 = splitBillSummaryActivity.getMax.toFloatRange;
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != -1149187101) {
                if (hashCode != -604548089) {
                    if (hashCode == -591252731 && str2.equals("EXPIRED")) {
                        c = 1;
                    }
                } else if (str2.equals("IN_PROGRESS")) {
                    c = 2;
                }
            } else if (str2.equals("SUCCESS")) {
                c = 0;
            }
            if (c == 0) {
                splitBillSummaryActivity.length(R.drawable.bg_split_bill_success);
            } else if (c != 1) {
                splitBillSummaryActivity.length(R.drawable.bg_split_bill_introduction);
            } else {
                splitBillSummaryActivity.length(R.drawable.bg_split_bill_failed);
            }
        }
        splitBillSummaryActivity.ctvTotalAmount.setText(splitBillSummaryActivity.getMax.setMax);
        if (TextUtils.isEmpty(splitBillSummaryActivity.getMax.getMin)) {
            splitBillSummaryActivity.tvRemarks.setVisibility(8);
        } else {
            TextView textView = splitBillSummaryActivity.tvRemarks;
            String str3 = splitBillSummaryActivity.getMax.getMin;
            if (TextUtils.isEmpty(str3)) {
                str = "";
            } else {
                str = String.format("\"%s\"", new Object[]{str3});
            }
            textView.setText(str);
        }
        splitBillSummaryActivity.payerListView.setItems(splitBillSummaryActivity.getMax.setMin, true);
        splitBillSummaryActivity.payerListView.setClosePayerEnabled(splitBillSummaryActivity.getMax());
        if (splitBillSummaryActivity.getMax()) {
            splitBillSummaryActivity.payerListView.setOnClickListener(new getEmojiSize(splitBillSummaryActivity));
        }
        for (PayerModel next : splitBillSummaryActivity.getMax.setMin) {
            if (isOriginHasAppInfo.getNormalizePrefixPhoneNumber(next.setMin).equals(splitBillSummaryActivity.isInside.getPhoneNumber())) {
                next.getMin = String.format(splitBillSummaryActivity.getString(R.string.split_bill_requester_name), new Object[]{splitBillSummaryActivity.isInside.getNickname()});
                return;
            }
        }
    }

    static /* synthetic */ void access$200(SplitBillSummaryActivity splitBillSummaryActivity) {
        int i;
        int max;
        if (!splitBillSummaryActivity.getMax() || TextUtils.isEmpty(splitBillSummaryActivity.getMax.getMax)) {
            splitBillSummaryActivity.ssvSplitBill.setVisibility(8);
            return;
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(-1382517690, oncanceled);
            onCancelLoad.getMin(-1382517690, oncanceled);
        }
        ShareQRSplitBillModel.length length = new ShareQRSplitBillModel.length();
        length.getMin = splitBillSummaryActivity.getMax.getMin;
        String str = splitBillSummaryActivity.getMax.getMax;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        int max3 = dispatchOnCancelled.setMax(i);
        if (i != max3) {
            onCanceled oncanceled2 = new onCanceled(i, max3, 1);
            onCancelLoad.setMax(-1089844903, oncanceled2);
            onCancelLoad.getMin(-1089844903, oncanceled2);
        }
        length.length = str;
        length.getMax = splitBillSummaryActivity.isInside.getNickname();
        length.setMin = splitBillSummaryActivity.isInside.getPhoneNumber();
        ShareQRSplitBillModel shareQRSplitBillModel = new ShareQRSplitBillModel(length, (byte) 0);
        splitBillSummaryActivity.ssvSplitBill.setEnableShareButton(true);
        splitBillSummaryActivity.ssvSplitBill.setShareQrOnClickListener(new isSingleLine(splitBillSummaryActivity, shareQRSplitBillModel));
        Context baseContext = splitBillSummaryActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -2125908587 == (max = dispatchOnCancelled.getMax(applicationContext, -2125908587)))) {
            onCanceled oncanceled3 = new onCanceled(-2125908587, max, 512);
            onCancelLoad.setMax(-2125908587, oncanceled3);
            onCancelLoad.getMin(-2125908587, oncanceled3);
        }
        int max4 = dispatchOnCancelled.getMax(0);
        if (max4 != 0) {
            onCanceled oncanceled4 = new onCanceled(0, max4, 16);
            onCancelLoad.setMax(-2125908587, oncanceled4);
            onCancelLoad.getMin(-2125908587, oncanceled4);
        }
        splitBillSummaryActivity.ssvSplitBill.setSocialShareViewTitle(setH5MenuList.getMin(splitBillSummaryActivity.getString(R.string.split_bill_share_title), splitBillSummaryActivity.getString(R.string.split_bill_share_title)));
        splitBillSummaryActivity.ssvSplitBill.setSocialButtonText(splitBillSummaryActivity.getString(R.string.split_bill_via));
        splitBillSummaryActivity.ssvSplitBill.setOthersButtonText(splitBillSummaryActivity.getString(R.string.split_bill_via_others));
        splitBillSummaryActivity.ssvSplitBill.setSharingMessage(splitBillSummaryActivity.getString(R.string.split_bill_link_message), splitBillSummaryActivity.getMax.getMax);
        splitBillSummaryActivity.ssvSplitBill.setVisibility(0);
    }

    static /* synthetic */ void access$500(SplitBillSummaryActivity splitBillSummaryActivity) {
        splitBillSummaryActivity.llSplitBillDetails.setVisibility(8);
        splitBillSummaryActivity.nsvSplitBillSummary.setVisibility(8);
        splitBillSummaryActivity.ssvSplitBill.setVisibility(8);
        splitBillSummaryActivity.llBillDetailEmptyState.setVisibility(0);
    }

    public static /* synthetic */ void setMin(SplitBillSummaryActivity splitBillSummaryActivity) {
        String str;
        int max;
        Context baseContext = splitBillSummaryActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -279867837 == (max = dispatchOnCancelled.getMax(applicationContext, -279867837)))) {
            onCanceled oncanceled = new onCanceled(-279867837, max, 512);
            onCancelLoad.setMax(-279867837, oncanceled);
            onCancelLoad.getMin(-279867837, oncanceled);
        }
        int i = 0;
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(-279867837, oncanceled2);
            onCancelLoad.getMin(-279867837, oncanceled2);
        }
        splitBillSummaryActivity.enableDimView();
        SplitBillHistoryModel splitBillHistoryModel = splitBillSummaryActivity.getMax;
        ClosePayerDialogFragment closePayerDialogFragment = new ClosePayerDialogFragment(new setBoldAutoSplitText(splitBillSummaryActivity));
        splitBillSummaryActivity.toIntRange = closePayerDialogFragment;
        closePayerDialogFragment.toIntRange = splitBillHistoryModel.setMax();
        ClosePayerDialogFragment closePayerDialogFragment2 = splitBillSummaryActivity.toIntRange;
        if (!splitBillHistoryModel.setMin.isEmpty()) {
            String str2 = splitBillHistoryModel.setMin.get(0).setMax.length;
            for (PayerModel next : splitBillHistoryModel.setMin) {
                if ("IN_PROGRESS".equals(next.IsOverlapping)) {
                    i += Integer.valueOf(next.setMax.getMax).intValue();
                }
            }
            if (WheelView.OnWheelViewListener.getMax == null) {
                WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
            }
            str = NebulaLoadingView.AnonymousClass1.getMin(WheelView.OnWheelViewListener.getMax, i, str2);
        } else {
            str = "0";
        }
        closePayerDialogFragment2.getMin = str;
        splitBillSummaryActivity.toIntRange.getMax = splitBillHistoryModel.setMax().size();
        splitBillSummaryActivity.toIntRange.show(splitBillSummaryActivity.getSupportFragmentManager(), "show close payer dialog");
    }

    public static /* synthetic */ void setMax(SplitBillSummaryActivity splitBillSummaryActivity, List list) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1581204098, oncanceled);
            onCancelLoad.getMin(-1581204098, oncanceled);
        }
        ClosePayerDialogFragment closePayerDialogFragment = splitBillSummaryActivity.toIntRange;
        if (closePayerDialogFragment.lpvClosePayer != null) {
            closePayerDialogFragment.lpvClosePayer.startRefresh();
            closePayerDialogFragment.lpvClosePayer.setVisibility(0);
            closePayerDialogFragment.btnSubmitClosePayer.setVisibility(8);
        }
        splitBillSummaryActivity.splitBillDetailPresenter.length(list, splitBillSummaryActivity.setMax);
    }
}
