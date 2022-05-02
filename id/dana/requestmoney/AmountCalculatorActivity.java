package id.dana.requestmoney;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.model.CurrencyAmountModel;
import id.dana.richview.CurrencyTextView;
import id.dana.richview.calculator.CalculatorView;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import o.APImageDownloadRsp;
import o.GriverProgressBar;
import o.RedDotManager;
import o.TitleBarRightButtonView;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import o.setupPictureParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\u0006\u0010\u0014\u001a\u00020\u0010J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0014J\b\u0010\u001b\u001a\u00020\u0012H\u0014J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0002J\b\u0010 \u001a\u00020\u0010H\u0002J\b\u0010!\u001a\u00020\u0010H\u0002J\b\u0010\"\u001a\u00020\u0010H\u0016J\b\u0010#\u001a\u00020\u0010H\u0016J\b\u0010$\u001a\u00020\u0010H\u0002J\u001a\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u000eH\u0002J\u0014\u0010(\u001a\u00020\u0010*\u00020)2\u0006\u0010*\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lid/dana/requestmoney/AmountCalculatorActivity;", "Lid/dana/base/BaseActivity;", "()V", "currencyAmountModel", "Lid/dana/model/CurrencyAmountModel;", "maxAmount", "getMaxAmount", "()Lid/dana/model/CurrencyAmountModel;", "setMaxAmount", "(Lid/dana/model/CurrencyAmountModel;)V", "minAmount", "getMinAmount", "setMinAmount", "separatorVisibility", "", "checkValidity", "", "inputtedAmount", "", "configToolbar", "finishCalculatorActivity", "getActionButtonText", "getIntentData", "Landroid/content/Intent;", "getLayout", "", "getMaximumAmountErrorMessage", "getMinimumAmountErrorMessage", "hideError", "init", "initButton", "initCalculatorAmount", "initCalculatorPad", "listenAmount", "onActionClicked", "onBackPressed", "prepareBundle", "showError", "errorMessage", "isError", "setButtonEnabled", "Lid/dana/component/buttoncomponent/DanaButtonPrimaryView;", "enabled", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public class AmountCalculatorActivity extends BaseActivity {
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    private HashMap equals;
    @NotNull
    private CurrencyAmountModel getMax = new CurrencyAmountModel("0");
    private CurrencyAmountModel getMin = new CurrencyAmountModel("0");
    @NotNull
    private CurrencyAmountModel setMax = new CurrencyAmountModel("0");
    private boolean toFloatRange;

    @JvmStatic
    @NotNull
    public static final Intent createIntent(@NotNull BaseActivity baseActivity, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @Nullable CurrencyAmountModel currencyAmountModel) {
        return getMax.setMax(baseActivity, str, str2, str3, z, currencyAmountModel);
    }

    public void _$_clearFindViewByIdCache() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-597222475, oncanceled);
            onCancelLoad.getMin(-597222475, oncanceled);
        }
        HashMap hashMap = this.equals;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.equals == null) {
            this.equals = new HashMap();
        }
        View view = (View) this.equals.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.equals.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int getLayout() {
        int max = dispatchOnCancelled.getMax(0);
        if (max == 0) {
            return R.layout.activity_amount;
        }
        onCanceled oncanceled = new onCanceled(0, max, 16);
        onCancelLoad.setMax(-531973145, oncanceled);
        onCancelLoad.getMin(-531973145, oncanceled);
        return R.layout.activity_amount;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T> implements RedDotManager<String> {
        final /* synthetic */ AmountCalculatorActivity length;

        setMin(AmountCalculatorActivity amountCalculatorActivity) {
            this.length = amountCalculatorActivity;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            AmountCalculatorActivity amountCalculatorActivity = this.length;
            Intrinsics.checkNotNullExpressionValue(str, "it");
            AmountCalculatorActivity.access$checkValidity(amountCalculatorActivity, str);
        }
    }

    public static final /* synthetic */ void access$checkValidity(AmountCalculatorActivity amountCalculatorActivity, String str) {
        int max;
        Context baseContext = amountCalculatorActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1567822906 == (max = dispatchOnCancelled.getMax(applicationContext, 1567822906)))) {
            onCanceled oncanceled = new onCanceled(1567822906, max, 512);
            onCancelLoad.setMax(1567822906, oncanceled);
            onCancelLoad.getMin(1567822906, oncanceled);
        }
        CurrencyAmountModel currencyAmountModel = new CurrencyAmountModel(str);
        if (currencyAmountModel.getMin(amountCalculatorActivity.getMax)) {
            showError$default(amountCalculatorActivity, amountCalculatorActivity.getMinimumAmountErrorMessage(), false, 2, (Object) null);
        } else if (currencyAmountModel.length(amountCalculatorActivity.setMax)) {
            showError$default(amountCalculatorActivity, amountCalculatorActivity.getMaximumAmountErrorMessage(), false, 2, (Object) null);
        } else {
            int max2 = dispatchOnCancelled.getMax(0);
            if (max2 != 0) {
                onCanceled oncanceled2 = new onCanceled(0, max2, 16);
                onCancelLoad.setMax(1503225062, oncanceled2);
                onCancelLoad.getMin(1503225062, oncanceled2);
            }
            amountCalculatorActivity.getMax("", false);
        }
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final CurrencyAmountModel getMinAmount() {
        return this.getMax;
    }

    /* access modifiers changed from: protected */
    public final void setMinAmount(@NotNull CurrencyAmountModel currencyAmountModel) {
        Intrinsics.checkNotNullParameter(currencyAmountModel, "<set-?>");
        this.getMax = currencyAmountModel;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final CurrencyAmountModel getMaxAmount() {
        return this.setMax;
    }

    /* access modifiers changed from: protected */
    public final void setMaxAmount(@NotNull CurrencyAmountModel currencyAmountModel) {
        Intrinsics.checkNotNullParameter(currencyAmountModel, "<set-?>");
        this.setMax = currencyAmountModel;
    }

    public void configToolbar() {
        setMenuLeftButton((int) R.drawable.arrow_left_white);
    }

    public void init() {
        TitleBarRightButtonView.AnonymousClass1<String> listenOriginalValue;
        Bundle extras;
        int max;
        Context baseContext = getBaseContext();
        GriverProgressBar.UpdateRunnable updateRunnable = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 128043589 == (max = dispatchOnCancelled.getMax(applicationContext, 128043589)))) {
            onCanceled oncanceled = new onCanceled(128043589, max, 512);
            onCancelLoad.setMax(128043589, oncanceled);
            onCancelLoad.getMin(128043589, oncanceled);
        }
        Intent intent = getIntent();
        String str = "";
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            setCenterTitle(extras.getString("title", str));
            this.getMax = new CurrencyAmountModel(extras.getString(BundleKey.MINIMUM_AMOUNT, "0"));
            this.setMax = new CurrencyAmountModel(extras.getString(BundleKey.MAXIMUM_AMOUNT, "0"));
            this.toFloatRange = extras.getBoolean(BundleKey.SEPARATOR_VISIBILITY, false);
            CurrencyAmountModel currencyAmountModel = (CurrencyAmountModel) extras.getParcelable("amount");
            if (currencyAmountModel == null) {
                currencyAmountModel = new CurrencyAmountModel("0");
            }
            this.getMin = currencyAmountModel;
        }
        initButton();
        CalculatorView calculatorView = (CalculatorView) _$_findCachedViewById(resetInternal.setMax.unit);
        if (calculatorView != null) {
            calculatorView.setSeparatorVisibility(this.toFloatRange);
            calculatorView.setCalculatorResultListener(new length(this));
        }
        CurrencyTextView currencyTextView = (CurrencyTextView) _$_findCachedViewById(resetInternal.setMax.ActivityResultRegistry$1);
        if (!(currencyTextView == null || (listenOriginalValue = currencyTextView.listenOriginalValue()) == null)) {
            updateRunnable = listenOriginalValue.subscribe((RedDotManager<? super String>) new setMin(this));
        }
        addDisposable(updateRunnable);
        CalculatorView calculatorView2 = (CalculatorView) _$_findCachedViewById(resetInternal.setMax.unit);
        if (calculatorView2 != null) {
            String str2 = this.getMin.getMax;
            if (str2 != null) {
                str = str2;
            }
            calculatorView2.onPadClicked(str);
        }
    }

    public void initButton() {
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.postMessage);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new getMin(this));
            getMax(danaButtonPrimaryView, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/requestmoney/AmountCalculatorActivity$initButton$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ AmountCalculatorActivity setMin;

        getMin(AmountCalculatorActivity amountCalculatorActivity) {
            this.setMin = amountCalculatorActivity;
        }

        public final void onClick(View view) {
            this.setMin.onActionClicked();
        }
    }

    public void onBackPressed() {
        setResult(0, (Intent) null);
        super.onBackPressed();
    }

    public void onActionClicked() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(298660364, oncanceled);
            onCancelLoad.getMin(298660364, oncanceled);
        }
        finishCalculatorActivity();
    }

    public final void finishCalculatorActivity() {
        setResult(-1, getIntentData());
        finish();
    }

    @NotNull
    public Intent getIntentData() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        String str = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-394322243, oncanceled);
            onCancelLoad.getMin(-394322243, oncanceled);
        }
        Intent intent = new Intent();
        CurrencyTextView currencyTextView = (CurrencyTextView) _$_findCachedViewById(resetInternal.setMax.ActivityResultRegistry$1);
        if (currencyTextView != null) {
            str = currencyTextView.getAmount();
        }
        if (str == null) {
            str = "";
        }
        intent.putExtra("amount", str);
        return intent;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "value", "", "kotlin.jvm.PlatformType", "onResult", "id/dana/requestmoney/AmountCalculatorActivity$initCalculatorPad$1$1"}, k = 3, mv = {1, 4, 2})
    static final class length implements setupPictureParams {
        final /* synthetic */ AmountCalculatorActivity length;

        length(AmountCalculatorActivity amountCalculatorActivity) {
            this.length = amountCalculatorActivity;
        }

        public final void length(String str) {
            CurrencyTextView currencyTextView;
            if (new APImageDownloadRsp(str).setMin() && (currencyTextView = (CurrencyTextView) this.length._$_findCachedViewById(resetInternal.setMax.ActivityResultRegistry$1)) != null) {
                currencyTextView.setText(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    @NotNull
    public String getMaximumAmountErrorMessage() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getString(R.string.sm_maximum_amount);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.sm_maximum_amount)");
        String format = String.format(string, Arrays.copyOf(new Object[]{this.setMax.getMax}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public String getMinimumAmountErrorMessage() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getString(R.string.sm_minimum_amount);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.sm_minimum_amount)");
        String format = String.format(string, Arrays.copyOf(new Object[]{this.getMax.getMax}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    static /* synthetic */ void showError$default(AmountCalculatorActivity amountCalculatorActivity, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            amountCalculatorActivity.getMax(str, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showError");
    }

    private final void getMax(String str, boolean z) {
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.postMessage);
        if (danaButtonPrimaryView != null) {
            getMax(danaButtonPrimaryView, !z);
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.animateThumbToCheckedState);
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
            textView.setText(str);
        }
    }

    private final void getMax(DanaButtonPrimaryView danaButtonPrimaryView, boolean z) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1079776314, oncanceled);
            onCancelLoad.getMin(1079776314, oncanceled);
        }
        if (z) {
            danaButtonPrimaryView.setActiveButton(getActionButtonText(), (Drawable) null);
        } else {
            danaButtonPrimaryView.setDisabled(getActionButtonText());
        }
        danaButtonPrimaryView.setEnabled(z);
    }

    @NotNull
    public String getActionButtonText() {
        String string = getString(R.string.set_amount);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.set_amount)");
        return string;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/requestmoney/AmountCalculatorActivity$Companion;", "", "()V", "MAX_DIGIT_AMOUNT", "", "createIntent", "Landroid/content/Intent;", "baseActivity", "Lid/dana/base/BaseActivity;", "minAmount", "", "maxAmount", "title", "separatorVisibility", "", "currencyAmountModel", "Lid/dana/model/CurrencyAmountModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }

        @JvmStatic
        @NotNull
        public static Intent setMax(@NotNull BaseActivity baseActivity, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @Nullable CurrencyAmountModel currencyAmountModel) {
            Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
            Intrinsics.checkNotNullParameter(str, BundleKey.MINIMUM_AMOUNT);
            Intrinsics.checkNotNullParameter(str2, BundleKey.MAXIMUM_AMOUNT);
            Intrinsics.checkNotNullParameter(str3, "title");
            Intent intent = new Intent(baseActivity, AmountCalculatorActivity.class);
            intent.putExtra(BundleKey.SEPARATOR_VISIBILITY, z);
            intent.putExtra(BundleKey.MINIMUM_AMOUNT, str);
            intent.putExtra(BundleKey.MAXIMUM_AMOUNT, str2);
            intent.putExtra("title", str3);
            intent.putExtra("amount", currencyAmountModel);
            return intent;
        }
    }
}
