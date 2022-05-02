package id.dana.splitbill.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.home.HomeTabActivity;
import id.dana.richview.CurrencyTextView;
import id.dana.sendmoney.RecipientActivity;
import id.dana.sendmoney.model.QrTransferModel;
import id.dana.splitbill.model.PayerModel;
import id.dana.splitbill.model.SplitBillModel;
import o.IntRange;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class SplitBillDetailsActivity extends BaseActivity {
    public static final String FROM_NOTIF = "fromNotif";
    private String IsOverlapping;
    @BindView(2131362614)
    CurrencyTextView ctvPayAmount;
    @BindView(2131362615)
    CurrencyTextView ctvTotalAmount;
    private PayerModel getMax;
    private SplitBillModel getMin;
    @BindView(2131363644)
    ImageView ivBillStatus;
    @BindView(2131363934)
    LinearLayout llSplitBillDetails;
    @BindView(2131365963)
    PayerListView payerListView;
    private PayerModel setMax;
    @BindView(2131365104)
    TextView tvAmountTitle;
    @BindView(2131365513)
    TextView tvRemarks;
    @BindView(2131365917)
    View viewPayButton;
    @BindView(2131365962)
    View viewSplitBillNotPayer;

    public int getLayout() {
        return R.layout.activity_split_bill_details;
    }

    public static Intent createIntent(Context context, SplitBillModel splitBillModel) {
        Intent intent = new Intent(context, SplitBillDetailsActivity.class);
        intent.putExtra("data", splitBillModel);
        return intent;
    }

    public static Intent createNonEligibleUserIntent(Context context) {
        return createIntent(context, (SplitBillModel) null);
    }

    public void configToolbar() {
        setCenterTitle(getString(R.string.split_bill_title));
        setMenuLeftButton((int) R.drawable.arrow_left_white);
    }

    public void onBackPressed() {
        int length;
        int min;
        if (!setMin() || !isTaskRoot()) {
            super.onBackPressed();
            return;
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-714762619, oncanceled);
            onCancelLoad.getMin(-714762619, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-714762619, oncanceled2);
            onCancelLoad.getMin(-714762619, oncanceled2);
        }
        Intent intent = new Intent(this, HomeTabActivity.class);
        intent.setFlags(67108864);
        startActivity(intent);
        finish();
    }

    private boolean setMin() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-81187749, oncanceled);
            onCancelLoad.getMin(-81187749, oncanceled);
        }
        return getIntent().getExtras() != null && getIntent().getExtras().getBoolean(FROM_NOTIF);
    }

    private boolean getMin() {
        return (this.getMin == null || this.getMax == null || this.setMax == null) ? false : true;
    }

    private void setMin(boolean z) {
        int i = 0;
        this.llSplitBillDetails.setVisibility(z ? 0 : 8);
        this.viewPayButton.setVisibility(z ? 0 : 8);
        View view = this.viewSplitBillNotPayer;
        if (z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    @OnClick({2131365917})
    public void onPayButtonClick() {
        QrTransferModel.setMax setmax = new QrTransferModel.setMax();
        String str = this.setMax.setMax.getMax;
        QrTransferModel.setMax setmax2 = setmax;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        setmax2.getMax = str;
        String str3 = this.getMax.length;
        QrTransferModel.setMax setmax3 = setmax2;
        if (str3 == null) {
            str3 = str2;
        }
        setmax3.getMin = str3;
        String str4 = this.getMin.setMax;
        QrTransferModel.setMax setmax4 = setmax3;
        if (str4 == null) {
            str4 = str2;
        }
        setmax4.setMax = str4;
        String str5 = this.getMax.getMax;
        QrTransferModel.setMax setmax5 = setmax4;
        if (str5 == null) {
            str5 = str2;
        }
        setmax5.toFloatRange = str5;
        String str6 = this.getMax.setMin;
        QrTransferModel.setMax setmax6 = setmax5;
        if (str6 == null) {
            str6 = str2;
        }
        setmax6.length = str6;
        String str7 = this.getMax.getMin;
        QrTransferModel.setMax setmax7 = setmax6;
        if (str7 != null) {
            str2 = str7;
        }
        setmax7.toIntRange = str2;
        startActivity(RecipientActivity.createTransferSplitBillIntent(this, setmax7.getMax(), this.IsOverlapping, "Split Bill"));
    }

    @OnClick({2131362106})
    public void onOkClick() {
        onBackPressed();
    }

    private boolean getMax() {
        return !TextUtils.isEmpty(this.getMin.isInside) && !TextUtils.isEmpty(this.getMin.toIntRange.IsOverlapping);
    }

    private void getMax(int i) {
        int min;
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 16);
            onCancelLoad.setMax(-270342358, oncanceled);
            onCancelLoad.getMin(-270342358, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 32);
            onCancelLoad.setMax(-270342358, oncanceled2);
            onCancelLoad.getMin(-270342358, oncanceled2);
        }
        this.ivBillStatus.setImageDrawable(IntRange.length((Context) this, i));
    }

    private boolean length() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-318665866, oncanceled);
            onCancelLoad.getMin(-318665866, oncanceled);
        }
        if (!"IN_PROGRESS".equals(this.getMin.isInside) || !"IN_PROGRESS".equals(this.getMin.toIntRange.IsOverlapping)) {
            return false;
        }
        return true;
    }

    public void init() {
        int length;
        int min;
        int length2;
        int min2;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            SplitBillModel splitBillModel = (SplitBillModel) extras.getParcelable("data");
            this.getMin = splitBillModel;
            if (splitBillModel != null) {
                this.getMax = splitBillModel.equals;
                this.setMax = this.getMin.toIntRange;
                this.IsOverlapping = this.getMin.IsOverlapping;
            }
        }
        if (getMin()) {
            setMin(true);
            if (this.getMin.getMin()) {
                this.viewPayButton.setVisibility(8);
            } else {
                this.ctvPayAmount.setText(this.setMax.setMax.getMax);
            }
            Context baseContext = getBaseContext();
            Context context = null;
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext, length2)))) {
                onCanceled oncanceled = new onCanceled(length2, min2, 32);
                onCancelLoad.setMax(-2028163674, oncanceled);
                onCancelLoad.getMin(-2028163674, oncanceled);
            }
            if (getMax()) {
                char c = 65535;
                if (!this.getMin.getMin()) {
                    String str = this.getMin.toIntRange.IsOverlapping;
                    switch (str.hashCode()) {
                        case -1149187101:
                            if (str.equals("SUCCESS")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -604548089:
                            if (str.equals("IN_PROGRESS")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -591252731:
                            if (str.equals("EXPIRED")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1818119806:
                            if (str.equals("REVOKED")) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    if (c == 0 || c == 1) {
                        getMax(R.drawable.bg_split_bill_success);
                    } else if (c != 2) {
                        getMax(R.drawable.bg_split_bill_introduction);
                    } else {
                        getMax(R.drawable.bg_split_bill_failed);
                    }
                } else {
                    Context baseContext2 = getBaseContext();
                    if (baseContext2 != null) {
                        context = baseContext2.getApplicationContext();
                    }
                    if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
                        onCanceled oncanceled2 = new onCanceled(length, min, 32);
                        onCancelLoad.setMax(1216883449, oncanceled2);
                        onCancelLoad.getMin(1216883449, oncanceled2);
                    }
                    String str2 = this.getMin.isInside;
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
                        getMax(R.drawable.bg_split_bill_success);
                    } else if (c != 1) {
                        getMax(R.drawable.bg_split_bill_introduction);
                    } else {
                        getMax(R.drawable.bg_split_bill_failed);
                    }
                }
            }
            this.tvAmountTitle.setText(getString(R.string.my_bill_amount));
            this.ctvTotalAmount.setText(this.setMax.setMax.getMax);
            if (TextUtils.isEmpty(this.getMin.setMax)) {
                this.tvRemarks.setVisibility(8);
            } else {
                TextView textView = this.tvRemarks;
                String str3 = this.getMin.setMax;
                textView.setText(TextUtils.isEmpty(str3) ? "" : String.format("\"%s\"", new Object[]{str3}));
            }
            this.payerListView.setItems(this.getMin.setMin, this.getMin.getMin());
            if (!getMax()) {
                if (this.getMin.getMin()) {
                    this.viewPayButton.setVisibility(8);
                    return;
                }
                this.viewPayButton.setVisibility(0);
                this.ctvPayAmount.setText(this.setMax.setMax.getMax);
            } else if (this.getMin.getMin() || !length()) {
                this.viewPayButton.setVisibility(8);
            } else {
                this.viewPayButton.setVisibility(0);
                this.ctvPayAmount.setText(this.setMax.setMax.getMax);
            }
        } else {
            setMin(false);
        }
    }
}
