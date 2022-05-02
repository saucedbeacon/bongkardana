package id.dana.requestmoney;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/requestmoney/NoteAmountCalculatorActivity;", "Lid/dana/requestmoney/AmountCalculatorActivity;", "()V", "note", "", "getActionButtonText", "getIntentData", "Landroid/content/Intent;", "getMaximumAmountErrorMessage", "getMinimumAmountErrorMessage", "onActionClicked", "", "showNotesDialog", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NoteAmountCalculatorActivity extends AmountCalculatorActivity {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    /* access modifiers changed from: private */
    public String getMax = "";
    private HashMap setMax;

    @JvmStatic
    @NotNull
    public static final Intent createIntent(@NotNull BaseActivity baseActivity, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        return getMin.setMax(baseActivity, str, str2, str3);
    }

    public final void _$_clearFindViewByIdCache() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-201594855, oncanceled);
            onCancelLoad.getMin(-201594855, oncanceled);
        }
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "id/dana/requestmoney/NoteAmountCalculatorActivity$showNotesDialog$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ NoteAmountCalculatorActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(NoteAmountCalculatorActivity noteAmountCalculatorActivity) {
            super(1);
            this.this$0 = noteAmountCalculatorActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            this.this$0.finishCalculatorActivity();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "id/dana/requestmoney/NoteAmountCalculatorActivity$showNotesDialog$1$2"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ NoteAmountCalculatorActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(NoteAmountCalculatorActivity noteAmountCalculatorActivity) {
            super(1);
            this.this$0 = noteAmountCalculatorActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            this.this$0.getMax = str;
            this.this$0.finishCalculatorActivity();
        }
    }

    @NotNull
    public final String getActionButtonText() {
        String string = getString(R.string.request_money_amount_calculator_action);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.reque…amount_calculator_action)");
        return string;
    }

    public final void onActionClicked() {
        int length;
        int min;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -2093646002 == (max = dispatchOnCancelled.getMax(applicationContext, -2093646002)))) {
            onCanceled oncanceled = new onCanceled(-2093646002, max, 512);
            onCancelLoad.setMax(-2093646002, oncanceled);
            onCancelLoad.getMin(-2093646002, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-2093646002, oncanceled2);
            onCancelLoad.getMin(-2093646002, oncanceled2);
        }
        NoteBottomSheetDialogFragment noteBottomSheetDialogFragment = new NoteBottomSheetDialogFragment(this.getMax, (byte) 0);
        noteBottomSheetDialogFragment.getMax = R.string.menu_skip;
        Function1<? super String, Unit> getmax = new getMax(this);
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        noteBottomSheetDialogFragment.IsOverlapping = getmax;
        noteBottomSheetDialogFragment.getMin = R.string.request_money_amount_calculator_action;
        Function1<? super String, Unit> setmax = new setMax(this);
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        noteBottomSheetDialogFragment.isInside = setmax;
        noteBottomSheetDialogFragment.show(getSupportFragmentManager(), "");
    }

    @NotNull
    public final Intent getIntentData() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-538188823, oncanceled);
            onCancelLoad.getMin(-538188823, oncanceled);
        }
        Intent intentData = super.getIntentData();
        intentData.putExtra("remarks", this.getMax);
        return intentData;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final String getMaximumAmountErrorMessage() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-136663693, oncanceled);
            onCancelLoad.getMin(-136663693, oncanceled);
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getString(R.string.sm_maximum_amount);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.sm_maximum_amount)");
        String format = String.format(string, Arrays.copyOf(new Object[]{getMaxAmount().getMax}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final String getMinimumAmountErrorMessage() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 245385433 == (max = dispatchOnCancelled.getMax(applicationContext, 245385433)))) {
            onCanceled oncanceled = new onCanceled(245385433, max, 512);
            onCancelLoad.setMax(245385433, oncanceled);
            onCancelLoad.getMin(245385433, oncanceled);
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getString(R.string.sm_minimum_amount);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.sm_minimum_amount)");
        String format = String.format(string, Arrays.copyOf(new Object[]{getMinAmount().getMax}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¨\u0006\u000b"}, d2 = {"Lid/dana/requestmoney/NoteAmountCalculatorActivity$Companion;", "", "()V", "createIntent", "Landroid/content/Intent;", "baseActivity", "Lid/dana/base/BaseActivity;", "minAmount", "", "maxAmount", "title", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }

        @JvmStatic
        @NotNull
        public static Intent setMax(@NotNull BaseActivity baseActivity, @NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
            Intrinsics.checkNotNullParameter(str, BundleKey.MINIMUM_AMOUNT);
            Intrinsics.checkNotNullParameter(str2, BundleKey.MAXIMUM_AMOUNT);
            Intrinsics.checkNotNullParameter(str3, "title");
            Intent intent = new Intent(baseActivity, NoteAmountCalculatorActivity.class);
            intent.putExtra(BundleKey.MINIMUM_AMOUNT, str);
            intent.putExtra(BundleKey.MAXIMUM_AMOUNT, str2);
            intent.putExtra("title", str3);
            return intent;
        }
    }
}
