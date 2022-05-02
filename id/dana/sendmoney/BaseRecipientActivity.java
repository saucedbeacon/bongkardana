package id.dana.sendmoney;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.domain.sendmoney.TransferScenario;
import id.dana.sendmoney.calculator.CalculatorActivity;
import id.dana.sendmoney.model.QrTransferModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.view.RecipientView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CornerMarkingDataProvider;
import o.DecodeWrapper;
import o.dispatchOnCancelled;
import o.getChildrenSkipCount;
import o.isBaselineAligned;
import o.onCancelLoad;
import o.onCanceled;

public class BaseRecipientActivity extends BaseActivity {
    public static final int ALL_BANK_REQUEST_CODE = CornerMarkingDataProvider.AnonymousClass2.setMax();
    protected String amount;
    public boolean belowKitkatDialog;
    @BindView(2131365938)
    protected RecipientView recipientList;
    protected String transactionType;

    public int getLayout() {
        return R.layout.activity_recipient;
    }

    public void configToolbar() {
        setCenterTitle(getString(R.string.sendmoney_title));
    }

    public void init() {
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
    }

    public void setData(Bundle bundle) {
        if (bundle != null) {
            QrTransferModel qrTransferModel = (QrTransferModel) bundle.getParcelable("scanner_data");
            this.transactionType = bundle.getString("transactionType");
            if (qrTransferModel != null) {
                handleTransferData(qrTransferModel);
            }
        }
    }

    public void showBelowKitkatDialogWarning() {
        new isBaselineAligned(this, isBaselineAligned.getDEFAULT_BEHAVIOR()).cancelable(false).message(Integer.valueOf(R.string.dialog_warning_below_kitkat), (CharSequence) null, (Function1<? super getChildrenSkipCount, Unit>) null).positiveButton((Integer) null, (CharSequence) null, (Function1<? super isBaselineAligned, Unit>) null).show();
    }

    public void handleTransferData(QrTransferModel qrTransferModel) {
        String str;
        String str2 = null;
        if (qrTransferModel.isInside()) {
            this.amount = qrTransferModel.getMin();
            str = null;
        } else if (TextUtils.isEmpty(qrTransferModel.IsOverlapping())) {
            str2 = qrTransferModel.setMin();
            str = "phonenumber";
        } else {
            str2 = qrTransferModel.IsOverlapping();
            str = "userid";
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            RecipientModel.length length = new RecipientModel.length("contact");
            length.toFloatRange = str2;
            length.FastBitmap$CoordinateSystem = str;
            length.isInside = qrTransferModel.toFloatRange();
            length.toIntRange = qrTransferModel.setMin();
            length.IsOverlapping = qrTransferModel.getMax();
            length.length = qrTransferModel.getMin();
            length.getMax = true;
            length.hashCode = getTransferScenario(qrTransferModel);
            length.toString = this.transactionType;
            openCalculatorPage(length.length(), qrTransferModel.length());
        }
    }

    public String getTransferScenario(QrTransferModel qrTransferModel) {
        if (qrTransferModel.values()) {
            return TransferScenario.PROFILE_QR;
        }
        if (qrTransferModel.FastBitmap$CoordinateSystem()) {
            return TransferScenario.REQUEST_MONEY_BANK_QR;
        }
        return qrTransferModel.toIntRange() ? TransferScenario.REQUEST_MONEY : "";
    }

    public void openCalculatorPage(RecipientModel recipientModel, String str) {
        Intent intentClassWithTracking = getIntentClassWithTracking(CalculatorActivity.class);
        intentClassWithTracking.putExtra("data", recipientModel);
        intentClassWithTracking.putExtra("remarks", str);
        intentClassWithTracking.putExtra("transferScenario", getTransferScenario(recipientModel));
        if ("split_bill".equals(this.transactionType)) {
            intentClassWithTracking.putExtra("splitBillId", getIntent().getStringExtra("splitBillId"));
        }
        startActivity(intentClassWithTracking);
        if ("split_bill".equals(recipientModel.ICustomTabsCallback)) {
            finish();
        }
    }

    public String getTransferScenario(RecipientModel recipientModel) {
        return "split_bill".equals(this.transactionType) ? TransferScenario.SPLIT_BILL : recipientModel.getCause;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int length;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1052218693, oncanceled);
            onCancelLoad.getMin(1052218693, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1052218693, oncanceled2);
            onCancelLoad.getMin(1052218693, oncanceled2);
        }
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null) {
            if (i == ALL_BANK_REQUEST_CODE) {
                openCalculatorPage((RecipientModel) intent.getParcelableExtra("data"));
            } else if (i == DecodeWrapper.AnonymousClass2.length) {
                setData(intent.getExtras());
            }
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 16);
            onCancelLoad.setMax(897436028, oncanceled);
            onCancelLoad.getMin(897436028, oncanceled);
        }
        this.recipientList.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void processRecipientListData(RecipientModel recipientModel) {
        if ("contact".equals(recipientModel.onNavigationEvent)) {
            recipientModel.getCause = "sendMoney";
        }
        if (!TextUtils.isEmpty(this.amount)) {
            recipientModel.valueOf = this.amount;
        }
    }

    public void openCalculatorPage(RecipientModel recipientModel) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1628336859, oncanceled);
            onCancelLoad.getMin(-1628336859, oncanceled);
        }
        recipientModel.ICustomTabsCallback = "send_money";
        if (!"bank".equals(recipientModel.onNavigationEvent) || CornerMarkingDataProvider.getMax() || !this.belowKitkatDialog) {
            Intent intentClassWithTracking = getIntentClassWithTracking(CalculatorActivity.class);
            intentClassWithTracking.putExtra("data", recipientModel);
            intentClassWithTracking.putExtra("transferScenario", getIntent().getStringExtra("transferScenario"));
            startActivity(intentClassWithTracking);
            return;
        }
        showBelowKitkatDialogWarning();
    }
}
