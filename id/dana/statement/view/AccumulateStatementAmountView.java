package id.dana.statement.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.domain.statement.StatementType;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AUAbsTheme;
import o.AUTextView;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0006\u0010\u0014\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\u0010\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u001f\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u0016J\b\u0010 \u001a\u00020\u0012H\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lid/dana/statement/view/AccumulateStatementAmountView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "statementMenuListener", "Lid/dana/statement/StatementMenuListener;", "getStatementMenuListener", "()Lid/dana/statement/StatementMenuListener;", "setStatementMenuListener", "(Lid/dana/statement/StatementMenuListener;)V", "activeExpenseMenu", "", "activeIncomeMenu", "disableClickOptionStatementMenu", "getActiveTabMenu", "", "getLayout", "getTotalExpense", "getTotalIncome", "selectTransactionHistory", "type", "setOnClickListener", "setTotalExpense", "amount", "setTotalIncome", "setup", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AccumulateStatementAmountView extends BaseRichView {
    @Nullable
    private AUTextView.OnTextViewTextChangeListener length;
    private HashMap setMin;

    @JvmOverloads
    public AccumulateStatementAmountView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public AccumulateStatementAmountView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1489280626, oncanceled);
            onCancelLoad.getMin(1489280626, oncanceled);
        }
        if (this.setMin == null) {
            this.setMin = new HashMap();
        }
        View view = (View) this.setMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_accumulate_statement_amount;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AccumulateStatementAmountView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccumulateStatementAmountView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public AccumulateStatementAmountView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @Nullable
    public final AUTextView.OnTextViewTextChangeListener getStatementMenuListener() {
        return this.length;
    }

    public final void setStatementMenuListener(@Nullable AUTextView.OnTextViewTextChangeListener onTextViewTextChangeListener) {
        this.length = onTextViewTextChangeListener;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ AccumulateStatementAmountView getMin;

        getMax(AccumulateStatementAmountView accumulateStatementAmountView) {
            this.getMin = accumulateStatementAmountView;
        }

        public final void onClick(View view) {
            AccumulateStatementAmountView accumulateStatementAmountView = this.getMin;
            AUAbsTheme aUAbsTheme = AUAbsTheme.getMin;
            accumulateStatementAmountView.selectTransactionHistory(AUAbsTheme.setMax());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ AccumulateStatementAmountView length;

        setMax(AccumulateStatementAmountView accumulateStatementAmountView) {
            this.length = accumulateStatementAmountView;
        }

        public final void onClick(View view) {
            AccumulateStatementAmountView accumulateStatementAmountView = this.length;
            AUAbsTheme aUAbsTheme = AUAbsTheme.getMin;
            accumulateStatementAmountView.selectTransactionHistory(AUAbsTheme.getMin());
        }
    }

    public final void selectTransactionHistory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "type");
        AUAbsTheme aUAbsTheme = AUAbsTheme.getMin;
        if (Intrinsics.areEqual((Object) str, (Object) AUAbsTheme.setMax())) {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.setShuffleMode);
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "cl_accumulate_income");
            if (!constraintLayout.isActivated()) {
                ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.getWrappedDrawable);
                Intrinsics.checkNotNullExpressionValue(imageView, "iv_pointer_income");
                imageView.setVisibility(0);
                ImageView imageView2 = (ImageView) _$_findCachedViewById(resetInternal.setMax.setWrappedDrawable);
                Intrinsics.checkNotNullExpressionValue(imageView2, "iv_pointer_expense");
                imageView2.setVisibility(8);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.setShuffleMode);
                constraintLayout2.setActivated(true);
                constraintLayout2.setClickable(false);
                ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.rewind);
                constraintLayout3.setActivated(false);
                constraintLayout3.setClickable(true);
            }
            AUTextView.OnTextViewTextChangeListener onTextViewTextChangeListener = this.length;
            if (onTextViewTextChangeListener != null) {
                onTextViewTextChangeListener.getMin();
                return;
            }
            return;
        }
        AUAbsTheme aUAbsTheme2 = AUAbsTheme.getMin;
        if (Intrinsics.areEqual((Object) str, (Object) AUAbsTheme.getMin())) {
            ConstraintLayout constraintLayout4 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.rewind);
            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "cl_accumulate_expense");
            if (!constraintLayout4.isActivated()) {
                ImageView imageView3 = (ImageView) _$_findCachedViewById(resetInternal.setMax.setWrappedDrawable);
                Intrinsics.checkNotNullExpressionValue(imageView3, "iv_pointer_expense");
                imageView3.setVisibility(0);
                ImageView imageView4 = (ImageView) _$_findCachedViewById(resetInternal.setMax.getWrappedDrawable);
                Intrinsics.checkNotNullExpressionValue(imageView4, "iv_pointer_income");
                imageView4.setVisibility(8);
                ConstraintLayout constraintLayout5 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.setShuffleMode);
                constraintLayout5.setActivated(false);
                constraintLayout5.setClickable(true);
                ConstraintLayout constraintLayout6 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.rewind);
                constraintLayout6.setActivated(true);
                constraintLayout6.setClickable(false);
            }
            AUTextView.OnTextViewTextChangeListener onTextViewTextChangeListener2 = this.length;
            if (onTextViewTextChangeListener2 != null) {
                onTextViewTextChangeListener2.setMin();
            }
        }
    }

    @NotNull
    public final String getActiveTabMenu() {
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.setShuffleMode);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "cl_accumulate_income");
        if (constraintLayout.isActivated()) {
            return StatementType.INCOME.name();
        }
        return StatementType.EXPENSE.name();
    }

    public final void disableClickOptionStatementMenu() {
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.getWrappedDrawable);
        Intrinsics.checkNotNullExpressionValue(imageView, "iv_pointer_income");
        imageView.setVisibility(8);
        ImageView imageView2 = (ImageView) _$_findCachedViewById(resetInternal.setMax.setWrappedDrawable);
        Intrinsics.checkNotNullExpressionValue(imageView2, "iv_pointer_expense");
        imageView2.setVisibility(8);
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.setShuffleMode);
        constraintLayout.setActivated(false);
        constraintLayout.setClickable(false);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.rewind);
        constraintLayout2.setActivated(false);
        constraintLayout2.setClickable(false);
    }

    public final void setTotalIncome(@Nullable String str) {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getLogo);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_income_amount");
        textView.setText(str);
    }

    public final void setTotalExpense(@Nullable String str) {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.cancelSuperTouch);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_expense_amount");
        textView.setText(str);
    }

    @Nullable
    public final String getTotalIncome() {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getLogo);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_income_amount");
        CharSequence text = textView.getText();
        if (text != null) {
            return (String) text;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Nullable
    public final String getTotalExpense() {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.cancelSuperTouch);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_expense_amount");
        CharSequence text = textView.getText();
        if (text != null) {
            return (String) text;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final void setup() {
        ((ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.setShuffleMode)).setOnClickListener(new getMax(this));
        ((ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.rewind)).setOnClickListener(new setMax(this));
    }
}
