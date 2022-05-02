package id.dana.splitbill.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.generation.GenerateDeepLinkModule;
import id.dana.di.modules.SplitBillModule;
import id.dana.model.CurrencyAmountModel;
import id.dana.requestmoney.AmountCalculatorActivity;
import id.dana.requestmoney.BundleKey;
import id.dana.richview.LogoProgressView;
import id.dana.richview.splitbill.AmountDisplayView;
import id.dana.richview.splitbill.BillPayerView;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.remarks.NoteView;
import id.dana.splitbill.model.SplitBillPayerModel;
import id.dana.splitbill.view.SplitBillPayersView;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AUNoticeDialog;
import o.CornerMarkingDataProvider;
import o.DecodeWrapper;
import o.GriverCommonResourceProxy;
import o.IconInfo;
import o.IconPaintBuilder;
import o.IconfontInfo;
import o.IntRange;
import o.PrepareException;
import o.access$2900;
import o.dispatchOnCancelled;
import o.getChildrenSkipCount;
import o.getExternParam;
import o.getExtraBeaconDataTracker;
import o.getTransitionProperties;
import o.isBaselineAligned;
import o.onCancelLoad;
import o.onCanceled;
import o.onPrepareFail;
import o.setExternParam;
import o.setTextBold;
import o.setupTextViewCS;
import o.startArray;
import o.stopIgnoring;

public class SplitBillActivity extends BaseActivity implements BillPayerView.setMax, SplitBillPayersView.getMax {
    private static final int getMax = CornerMarkingDataProvider.AnonymousClass2.setMax();
    @BindView(2131361886)
    AmountDisplayView advSplitBill;
    @BindView(2131361969)
    BillPayerView bpvSelection;
    @BindView(2131362137)
    Button btnSplitBill;
    @Inject
    public getTransitionProperties.getMin deepLinkPresenter;
    private CurrencyAmountModel getMin;
    private boolean isInside;
    @BindView(2131364288)
    LogoProgressView logoProgressView;
    @Inject
    public getTransitionProperties.getMin presenter;
    @Inject
    public setTextBold recipientModelMapper;
    @BindView(2131364560)
    NoteView rvRemarks;
    @BindView(2131364603)
    SplitBillPayersView sbpvPayers;
    private startArray setMax;
    @Inject
    public IconPaintBuilder splitBillPayerMapper;
    @Inject
    public IconfontInfo splitBillPayerToPayerModelMapper;
    @Inject
    public IconInfo splitBillPayerToRecipientModelMapper;
    @Inject
    public AUNoticeDialog.OnClickNegativeListener.setMin splitBillPresenter;
    @BindView(2131365753)
    View touchBlockerView;
    @BindView(2131365724)
    View vDimBody;
    @BindView(2131365725)
    View vDimHeader;

    public int getLayout() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0) {
            return R.layout.activity_split_bill;
        }
        onCanceled oncanceled = new onCanceled(0, length, 4);
        onCancelLoad.setMax(-1120253554, oncanceled);
        onCancelLoad.getMin(-1120253554, oncanceled);
        return R.layout.activity_split_bill;
    }

    public static Intent createSplitBillIntent(Context context, RecipientModel recipientModel) {
        Intent intent = new Intent(context, SplitBillActivity.class);
        intent.putExtra("data", recipientModel);
        return intent;
    }

    public static Intent createSplitBillIntent(Activity activity, access$2900 access_2900, long j, String str, int i) {
        Intent intent = new Intent(activity, SplitBillActivity.class);
        intent.putExtra(BundleKey.MINIMUM_AMOUNT, String.valueOf(access_2900.length));
        intent.putExtra(BundleKey.MAXIMUM_AMOUNT, String.valueOf(access_2900.getMin));
        intent.putExtra("amount", j);
        intent.putExtra("remarks", str);
        intent.putExtra("max_recipient", i);
        return intent;
    }

    public static Intent createSplitBillIntentFromRequestMoney(BaseActivity baseActivity, access$2900 access_2900, long j, String str, int i) {
        Intent createSplitBillIntent = createSplitBillIntent(baseActivity, access_2900, j, str, i);
        createSplitBillIntent.putExtra("fromRequestMoney", true);
        return createSplitBillIntent;
    }

    public void configToolbar() {
        setCenterTitle(getString(R.string.split_bill_title));
        setMenuLeftButton((int) R.drawable.arrow_left_white);
    }

    public void init() {
        int length;
        int min;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 611910459 == (max = dispatchOnCancelled.getMax(applicationContext, 611910459)))) {
            onCanceled oncanceled = new onCanceled(611910459, max, 512);
            onCancelLoad.setMax(611910459, oncanceled);
            onCancelLoad.getMin(611910459, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(-593910470, oncanceled2);
            onCancelLoad.getMin(-593910470, oncanceled2);
        }
        if (this.setMax == null) {
            onPrepareFail.getMax getmax = new onPrepareFail.getMax((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                getmax.setMax = applicationComponent;
                int max3 = dispatchOnCancelled.getMax(0);
                if (max3 != 0) {
                    onCanceled oncanceled3 = new onCanceled(0, max3, 16);
                    onCancelLoad.setMax(-1992411600, oncanceled3);
                    onCancelLoad.getMin(-1992411600, oncanceled3);
                }
                getmax.length = new GenerateDeepLinkModule((getTransitionProperties.length) new getTransitionProperties.length() {
                    public final void getMin(String str, String str2) {
                        if (!TextUtils.isEmpty(str)) {
                            SplitBillActivity.access$000(SplitBillActivity.this, str2);
                        }
                    }

                    public final void showProgress() {
                        SplitBillActivity.this.touchBlockerView.setVisibility(0);
                        SplitBillActivity.this.btnSplitBill.setVisibility(8);
                        SplitBillActivity.this.logoProgressView.setVisibility(0);
                        SplitBillActivity.this.logoProgressView.startRefresh();
                    }

                    public final void dismissProgress() {
                        SplitBillActivity.this.touchBlockerView.setVisibility(8);
                        SplitBillActivity.this.btnSplitBill.setVisibility(0);
                        SplitBillActivity.this.logoProgressView.setVisibility(8);
                        SplitBillActivity.this.logoProgressView.stopRefresh();
                    }

                    public final void onError(String str) {
                        SplitBillActivity.this.showWarningDialog(str);
                    }
                });
                getmax.setMin = new SplitBillModule(new AUNoticeDialog.OnClickNegativeListener.setMax() {
                    public final void dismissProgress() {
                    }

                    public final void onError(String str) {
                    }

                    public final void showProgress() {
                    }

                    public final void setMin(GriverCommonResourceProxy griverCommonResourceProxy) {
                        SplitBillActivity.this.sbpvPayers.setInitialData(griverCommonResourceProxy);
                        SplitBillActivity.this.bpvSelection.setOwnPhoneNumber(griverCommonResourceProxy.getPhoneNumber());
                    }
                });
                stopIgnoring.setMin(getmax.length, GenerateDeepLinkModule.class);
                stopIgnoring.setMin(getmax.setMin, SplitBillModule.class);
                stopIgnoring.setMin(getmax.setMax, PrepareException.AnonymousClass1.class);
                this.setMax = new onPrepareFail(getmax.length, getmax.setMin, getmax.setMax, (byte) 0);
            } else {
                throw null;
            }
        }
        this.setMax.getMin(this);
        registerPresenter(this.deepLinkPresenter, this.splitBillPresenter);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.isInside = extras.getBoolean("fromRequestMoney", false);
            this.rvRemarks.setRemarks(extras.getString("remarks", ""));
            CurrencyAmountModel currencyAmountModel = new CurrencyAmountModel(String.valueOf(extras.getLong("amount", 0)));
            this.getMin = currencyAmountModel;
            this.advSplitBill.setAmountText(currencyAmountModel.getMax);
            this.bpvSelection.setMaxBillPayer(extras.getInt("max_recipient", 0));
            this.sbpvPayers.setAmount(Long.parseLong(this.getMin.getMax));
            this.sbpvPayers.setMaxSplitBillAmount(Long.parseLong(extras.getString(BundleKey.MAXIMUM_AMOUNT, "0")));
        }
        this.bpvSelection.configPeekHeight(this);
        this.bpvSelection.setListener(this);
        this.sbpvPayers.initAdapter();
        this.sbpvPayers.setListener(this);
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled4 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-2006898524, oncanceled4);
            onCancelLoad.getMin(-2006898524, oncanceled4);
        }
        this.splitBillPresenter.getMin();
        NoteView noteView = this.rvRemarks;
        SplitBillPayersView splitBillPayersView = this.sbpvPayers;
        Objects.requireNonNull(splitBillPayersView);
        noteView.setListener(new setExternParam(splitBillPayersView));
        this.advSplitBill.setOnAmountClickListener(new getExternParam(this));
    }

    public void onResume() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1766368249, oncanceled);
            onCancelLoad.getMin(-1766368249, oncanceled);
        }
        super.onResume();
        onModifyingAmount(false);
    }

    @OnClick({2131362137})
    public void onSplitBillClicked() {
        if (!this.sbpvPayers.isSameWithTotal()) {
            int max = dispatchOnCancelled.getMax(0);
            if (max != 0) {
                onCanceled oncanceled = new onCanceled(0, max, 16);
                onCancelLoad.setMax(-1038473443, oncanceled);
                onCancelLoad.getMin(-1038473443, oncanceled);
            }
            new isBaselineAligned(this, isBaselineAligned.getDEFAULT_BEHAVIOR()).message(Integer.valueOf(R.string.split_bill_dialog_message), (CharSequence) null, (Function1<? super getChildrenSkipCount, Unit>) null).positiveButton(Integer.valueOf(R.string.option_continue), (CharSequence) null, new setupTextViewCS(this)).show();
            return;
        }
        this.deepLinkPresenter.setMin(setMax(), getString(R.string.deeplink_title_split_bill), getString(R.string.deeplink_description_split_bill));
    }

    private getExtraBeaconDataTracker setMax() {
        getExtraBeaconDataTracker getextrabeacondatatracker = new getExtraBeaconDataTracker();
        getextrabeacondatatracker.setComment(this.rvRemarks.getRemarks());
        getextrabeacondatatracker.setPayers((List) this.splitBillPayerMapper.apply(this.sbpvPayers.getPayerModels()));
        return getextrabeacondatatracker;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (-1 == i2 && intent != null) {
            if (getMax == i) {
                this.getMin.getMax = intent.getStringExtra("amount");
                this.advSplitBill.setAmountText(this.getMin.getMax);
                this.sbpvPayers.updateAmount(Long.valueOf(this.getMin.getMax).longValue());
            } else if (DecodeWrapper.AnonymousClass2.length == i) {
                this.bpvSelection.addPayerFromScanner((RecipientModel) intent.getParcelableExtra("data"));
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.bpvSelection.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onBackPressed() {
        if (this.bpvSelection.isShow()) {
            this.bpvSelection.hide();
        } else {
            super.onBackPressed();
        }
    }

    public void showBillPayerView() {
        this.vDimHeader.setVisibility(0);
        this.vDimBody.setVisibility(0);
        if (CornerMarkingDataProvider.IsOverlapping()) {
            getWindow().setStatusBarColor(IntRange.setMax(this, R.color.f18652131099750));
        }
        this.sbpvPayers.saveLockedPayer();
        this.bpvSelection.show();
    }

    public void onViewHidden() {
        this.vDimHeader.setVisibility(8);
        this.vDimBody.setVisibility(8);
        if (CornerMarkingDataProvider.IsOverlapping()) {
            getWindow().setStatusBarColor(IntRange.setMax(this, R.color.f19032131099798));
        }
    }

    public void onUpdatedSelectedPayers(List<RecipientModel> list) {
        this.sbpvPayers.addPayers((List) this.recipientModelMapper.apply(list));
    }

    public void onClickAddNewPayer() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1940344242, oncanceled);
            onCancelLoad.getMin(1940344242, oncanceled);
        }
        showBillPayerView();
    }

    public void onRemainingUpdated(boolean z, String str) {
        this.advSplitBill.setAmountRemain(z, str);
    }

    public void onRemovePayer(SplitBillPayerModel splitBillPayerModel) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1333336430, oncanceled);
            onCancelLoad.getMin(-1333336430, oncanceled);
        }
        this.bpvSelection.removeSelectedPayer((RecipientModel) this.splitBillPayerToRecipientModelMapper.apply(splitBillPayerModel));
    }

    public void onModifyingAmount(boolean z) {
        this.btnSplitBill.setVisibility(!z ? 0 : 8);
    }

    public void onSplitBillButtonEnabled(boolean z) {
        if (z && this.advSplitBill.isAnyAmountRemain()) {
            this.advSplitBill.setAmountRemain(false);
        }
        this.btnSplitBill.setEnabled(z);
    }

    static /* synthetic */ void access$000(SplitBillActivity splitBillActivity, String str) {
        if (splitBillActivity.isInside) {
            splitBillActivity.startActivity(SplitBillSummaryActivity.createIntentFromRequestMoney(splitBillActivity, str));
        } else {
            splitBillActivity.startActivity(SplitBillSummaryActivity.createIntent(splitBillActivity, str));
        }
        splitBillActivity.finish();
    }

    public static /* synthetic */ void setMax(SplitBillActivity splitBillActivity) {
        String str;
        String str2;
        int length;
        splitBillActivity.sbpvPayers.clearCurrentFocus();
        Context baseContext = splitBillActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(1100859266, oncanceled);
            onCancelLoad.getMin(1100859266, oncanceled);
        }
        Bundle extras = splitBillActivity.getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString(BundleKey.MINIMUM_AMOUNT, "0");
            str = extras.getString(BundleKey.MAXIMUM_AMOUNT, "0");
            str2 = string;
        } else {
            str2 = "0";
            str = str2;
        }
        splitBillActivity.startActivityForResult(AmountCalculatorActivity.createIntent(splitBillActivity, str2, str, splitBillActivity.getString(R.string.split_bill_title), true, splitBillActivity.getMin), getMax);
    }
}
