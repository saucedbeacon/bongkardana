package id.dana.statement.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AUTextView;
import o.ConfirmPopup;
import o.onTextViewTextChange;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 22\u00020\u0001:\u00012B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u0007H\u0002J\b\u0010\"\u001a\u00020\u0007H\u0016J\b\u0010#\u001a\u0004\u0018\u00010\u001cJ\b\u0010$\u001a\u0004\u0018\u00010\u001cJ\u0018\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u001cH\u0002J\u0006\u0010'\u001a\u00020\u0018J\u0018\u0010(\u001a\u00020)2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020)H\u0002J\u0018\u0010,\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u0010\u0010-\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010.\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010/\u001a\u00020\u00182\b\u00100\u001a\u0004\u0018\u00010\u001cJ\b\u00101\u001a\u00020\u0018H\u0016R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u00063"}, d2 = {"Lid/dana/statement/view/StatementDateView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "calendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "highlightYear", "statementDateChangeListener", "Lid/dana/statement/StatementDateChangeListener;", "statementMenuListener", "Lid/dana/statement/StatementMenuListener;", "getStatementMenuListener", "()Lid/dana/statement/StatementMenuListener;", "setStatementMenuListener", "(Lid/dana/statement/StatementMenuListener;)V", "checkCurrentMonth", "", "month", "year", "convertMonthToString", "", "formatMonth", "getCurrentMonth", "formatPattern", "getCurrentMonthRunningDate", "getLastDateOfMonth", "getLayout", "getMonth", "getRunningDate", "monthBefore", "lastDateOfMonth", "hideRollingMonthArrow", "isDateUnderDateFirstTime", "", "rollMonth", "up", "setCallbackBetweenData", "setMonth", "setOnStatementDateChangeListener", "setRunningDate", "runningDate", "setup", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class StatementDateView extends BaseRichView {
    @NotNull
    public static final length Companion = new length((byte) 0);
    @NotNull
    public static final String FULL_MONTH = "MMMM";
    @NotNull
    public static final String NEXT_MONTH_LAST_DATE = "01";
    @NotNull
    public static final String SHORT_MONTH = "MMM";
    /* access modifiers changed from: private */
    public int getMax;
    private final Calendar getMin;
    private HashMap length;
    @Nullable
    private AUTextView.OnTextViewTextChangeListener setMax;
    private onTextViewTextChange setMin;

    @JvmOverloads
    public StatementDateView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public StatementDateView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    private static boolean setMax(int i, int i2) {
        return i2 == 2020 && i < 7;
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.length == null) {
            this.length = new HashMap();
        }
        View view = (View) this.length.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.length.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_statement_date;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StatementDateView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMin = Calendar.getInstance();
        this.getMax = -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StatementDateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public StatementDateView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMin = Calendar.getInstance();
        this.getMax = -1;
    }

    @Nullable
    public final AUTextView.OnTextViewTextChangeListener getStatementMenuListener() {
        return this.setMax;
    }

    public final void setStatementMenuListener(@Nullable AUTextView.OnTextViewTextChangeListener onTextViewTextChangeListener) {
        this.setMax = onTextViewTextChangeListener;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ StatementDateView setMax;

        getMin(StatementDateView statementDateView) {
            this.setMax = statementDateView;
        }

        public final void onClick(View view) {
            int access$rollMonth = StatementDateView.access$rollMonth(this.setMax, false);
            StatementDateView statementDateView = this.setMax;
            statementDateView.setMonth(statementDateView.setMin(access$rollMonth, StatementDateView.FULL_MONTH));
            StatementDateView statementDateView2 = this.setMax;
            StatementDateView.access$checkCurrentMonth(statementDateView2, access$rollMonth, statementDateView2.getMax);
            StatementDateView statementDateView3 = this.setMax;
            StatementDateView.access$setCallbackBetweenData(statementDateView3, access$rollMonth, statementDateView3.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ StatementDateView getMin;

        getMax(StatementDateView statementDateView) {
            this.getMin = statementDateView;
        }

        public final void onClick(View view) {
            int access$rollMonth = StatementDateView.access$rollMonth(this.getMin, true);
            StatementDateView statementDateView = this.getMin;
            statementDateView.setMonth(statementDateView.setMin(access$rollMonth, StatementDateView.FULL_MONTH));
            StatementDateView statementDateView2 = this.getMin;
            StatementDateView.access$checkCurrentMonth(statementDateView2, access$rollMonth, statementDateView2.getMax);
            StatementDateView statementDateView3 = this.getMin;
            StatementDateView.access$setCallbackBetweenData(statementDateView3, access$rollMonth, statementDateView3.getMax);
        }
    }

    private final String setMax(int i, String str) {
        String min = setMin(i, SHORT_MONTH);
        int i2 = this.getMin.get(1);
        StringBuilder sb = new StringBuilder("1 ");
        sb.append(min);
        sb.append(" - ");
        sb.append(str);
        sb.append(' ');
        sb.append(min);
        sb.append(' ');
        sb.append(i2);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public final String setMin(int i, String str) {
        String str2;
        this.getMin.set(2, i);
        Calendar calendar = this.getMin;
        Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
        Date time = calendar.getTime();
        Locale locale = Locale.getDefault();
        if (time == null) {
            str2 = null;
        } else {
            str2 = new SimpleDateFormat(str, locale).format(time);
        }
        Intrinsics.checkNotNullExpressionValue(str2, "DateTimeUtil.convertDate…nth, Locale.getDefault())");
        return str2;
    }

    private static String getMax() {
        String max = ConfirmPopup.AnonymousClass1.setMax("d MMM yyyy");
        StringBuilder sb = new StringBuilder("1 ");
        String max2 = ConfirmPopup.AnonymousClass1.setMax(SHORT_MONTH);
        Intrinsics.checkNotNullExpressionValue(max2, "DateTimeUtil.getCurrentD…TimeString(formatPattern)");
        sb.append(max2);
        sb.append(" - ");
        sb.append(max);
        return sb.toString();
    }

    public final void setMonth(@Nullable String str) {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getContentInsetEndWithActions);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_month");
        textView.setText(str);
    }

    @Nullable
    public final String getMonth() {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getContentInsetEndWithActions);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_month");
        CharSequence text = textView.getText();
        if (text != null) {
            return (String) text;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final void setRunningDate(@Nullable String str) {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setInflatedId);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_running_date");
        textView.setText(str);
    }

    @Nullable
    public final String getRunningDate() {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setInflatedId);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_running_date");
        CharSequence text = textView.getText();
        if (text != null) {
            return (String) text;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final void hideRollingMonthArrow() {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.setQwertyMode);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_arrow");
        linearLayout.setVisibility(8);
    }

    public final void setOnStatementDateChangeListener(@NotNull onTextViewTextChange ontextviewtextchange) {
        Intrinsics.checkNotNullParameter(ontextviewtextchange, "statementDateChangeListener");
        this.setMin = ontextviewtextchange;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/statement/view/StatementDateView$Companion;", "", "()V", "FULL_MONTH", "", "NEXT_MONTH_LAST_DATE", "SHORT_MONTH", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public final void setup() {
        String max = ConfirmPopup.AnonymousClass1.setMax(FULL_MONTH);
        Intrinsics.checkNotNullExpressionValue(max, "DateTimeUtil.getCurrentD…TimeString(formatPattern)");
        setMonth(max);
        setRunningDate(getMax());
        ((ImageView) _$_findCachedViewById(resetInternal.setMax.dispatchKeyEvent)).setOnClickListener(new getMin(this));
        ((ImageView) _$_findCachedViewById(resetInternal.setMax.onKeyDown)).setOnClickListener(new getMax(this));
    }

    public static final /* synthetic */ int access$rollMonth(StatementDateView statementDateView, boolean z) {
        Calendar calendar = statementDateView.getMin;
        calendar.add(2, z ? 1 : -1);
        AUTextView.OnTextViewTextChangeListener onTextViewTextChangeListener = statementDateView.setMax;
        if (onTextViewTextChangeListener != null) {
            Intrinsics.checkNotNullExpressionValue(calendar, "cal");
            onTextViewTextChangeListener.getMax(calendar.getTimeInMillis());
        }
        statementDateView.getMax = calendar.get(1);
        return calendar.get(2);
    }

    public static final /* synthetic */ void access$checkCurrentMonth(StatementDateView statementDateView, int i, int i2) {
        if (ConfirmPopup.AnonymousClass1.getMax(i) && ConfirmPopup.AnonymousClass1.setMax(i2)) {
            statementDateView.setRunningDate(getMax());
        } else if ((!ConfirmPopup.AnonymousClass1.getMin(i) || !ConfirmPopup.AnonymousClass1.setMax(i2)) && !ConfirmPopup.AnonymousClass1.length(i2)) {
            statementDateView.setRunningDate(statementDateView.setMax(i, String.valueOf(statementDateView.getMin.getActualMaximum(5))));
        } else {
            statementDateView.setRunningDate(statementDateView.setMax(i, "01"));
        }
        if (setMax(i, i2)) {
            ImageView imageView = (ImageView) statementDateView._$_findCachedViewById(resetInternal.setMax.dispatchKeyEvent);
            Intrinsics.checkNotNullExpressionValue(imageView, "iv_arrow_left");
            imageView.setVisibility(8);
            return;
        }
        ImageView imageView2 = (ImageView) statementDateView._$_findCachedViewById(resetInternal.setMax.dispatchKeyEvent);
        Intrinsics.checkNotNullExpressionValue(imageView2, "iv_arrow_left");
        imageView2.setVisibility(0);
    }

    public static final /* synthetic */ void access$setCallbackBetweenData(StatementDateView statementDateView, int i, int i2) {
        int i3 = statementDateView.getMin.get(1);
        int i4 = i + 1;
        Calendar instance = Calendar.getInstance();
        instance.setTime(ConfirmPopup.AnonymousClass1.setMin(1, i4, i3));
        instance.set(5, instance.getActualMinimum(5));
        long timeInMillis = instance.getTimeInMillis();
        if (ConfirmPopup.AnonymousClass1.getMax(i) && ConfirmPopup.AnonymousClass1.setMax(i2)) {
            long min = ConfirmPopup.AnonymousClass1.getMin();
            onTextViewTextChange ontextviewtextchange = statementDateView.setMin;
            if (ontextviewtextchange != null) {
                ontextviewtextchange.getMax(timeInMillis, min);
            }
        } else if ((!ConfirmPopup.AnonymousClass1.getMin(i) || !ConfirmPopup.AnonymousClass1.setMax(i2)) && !ConfirmPopup.AnonymousClass1.length(i2)) {
            Calendar instance2 = Calendar.getInstance();
            instance2.setTime(ConfirmPopup.AnonymousClass1.setMin(1, i4, i3));
            instance2.set(5, instance2.getActualMaximum(5));
            long timeInMillis2 = instance2.getTimeInMillis();
            onTextViewTextChange ontextviewtextchange2 = statementDateView.setMin;
            if (ontextviewtextchange2 != null) {
                ontextviewtextchange2.setMax(timeInMillis2);
            }
            onTextViewTextChange ontextviewtextchange3 = statementDateView.setMin;
            if (ontextviewtextchange3 != null) {
                ontextviewtextchange3.getMax(timeInMillis, timeInMillis2);
            }
        } else {
            Calendar instance3 = Calendar.getInstance();
            instance3.setTime(ConfirmPopup.AnonymousClass1.setMin(3, i4, i3));
            long timeInMillis3 = instance3.getTimeInMillis();
            onTextViewTextChange ontextviewtextchange4 = statementDateView.setMin;
            if (ontextviewtextchange4 != null) {
                ontextviewtextchange4.getMax(timeInMillis, timeInMillis3);
            }
        }
    }
}
