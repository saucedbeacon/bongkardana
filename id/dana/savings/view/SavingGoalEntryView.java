package id.dana.savings.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.material.textfield.TextInputLayout;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.component.edittextcomponent.DanaTextBoxView;
import id.dana.dialog.DialogWithImage;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.richview.CurrencyTextView;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.APImageFormat;
import o.IntRange;
import o.RedDotDrawable;
import o.TouchInterceptFrameLayout;
import o.WheelView;
import o.removeNode;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 H2\u00020\u0001:\u0002HIB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0014H\u0002J\b\u0010&\u001a\u00020\u0007H\u0016J\u0006\u0010'\u001a\u00020\u0016J\u0006\u0010(\u001a\u00020\u000bJ\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0014H\u0002J\u001c\u0010*\u001a\u00020\u00142\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0,H\u0002J\b\u0010-\u001a\u00020.H\u0002J\u001c\u0010/\u001a\u00020.2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0,H\u0002J\u000e\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020\u000bJ\u000e\u00102\u001a\u00020.2\u0006\u00103\u001a\u00020\u0016J\u000e\u00104\u001a\u00020.2\u0006\u00101\u001a\u00020\u000bJ\b\u00105\u001a\u00020.H\u0016J\b\u00106\u001a\u00020.H\u0002J\b\u00107\u001a\u00020.H\u0002J\b\u00108\u001a\u00020.H\u0002J0\u00109\u001a\u00020.2\b\u0010:\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010=2\b\b\u0001\u0010>\u001a\u00020\u00072\b\b\u0001\u0010?\u001a\u00020\u0007H\u0002J\b\u0010@\u001a\u00020.H\u0002J\u0018\u0010A\u001a\u00020.2\u0006\u0010B\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0014H\u0002J\b\u0010C\u001a\u00020.H\u0002J\b\u0010D\u001a\u00020.H\u0002J\b\u0010E\u001a\u00020.H\u0002J\u0010\u0010F\u001a\u00020.2\u0006\u0010G\u001a\u00020\u000bH\u0002R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lid/dana/savings/view/SavingGoalEntryView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "days", "", "", "getDays", "()Ljava/util/Set;", "goalAmount", "getGoalAmount", "()Ljava/lang/String;", "setGoalAmount", "(Ljava/lang/String;)V", "isValid", "", "maxAmount", "Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "minAmount", "getMinAmount", "()Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "setMinAmount", "(Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;)V", "onGoalChangeListener", "Lid/dana/savings/view/SavingGoalEntryView$OnGoalChangeListener;", "getOnGoalChangeListener", "()Lid/dana/savings/view/SavingGoalEntryView$OnGoalChangeListener;", "setOnGoalChangeListener", "(Lid/dana/savings/view/SavingGoalEntryView$OnGoalChangeListener;)V", "reminderDate", "reminderDay", "getAmountLimit", "exceedMax", "getLayout", "getTargetAmount", "getTitle", "getWarningString", "isValueValid", "pair", "Lkotlin/Pair;", "listenGoalValue", "", "onGoalChanged", "setGoal", "text", "setMaximumAmount", "moneyViewModel", "setTitle", "setup", "setupAboutTotalSavingLimit", "setupAutoTopup", "setupGoalTarget", "setupHintFocusListener", "inputText", "Landroid/widget/EditText;", "textInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "hintText", "focusedHintText", "setupListener", "showInfo", "warning", "showMonthlyAutoTopupBottomSheet", "showSavingLimitDialog", "showWeeklyAutoTopupBottomSheet", "validateTargetGoal", "inputtedAmount", "Companion", "OnGoalChangeListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SavingGoalEntryView extends BaseRichView {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    private HashMap IsOverlapping;
    @NotNull
    private final Set<String> equals;
    private MoneyViewModel getMax;
    private boolean getMin;
    @NotNull
    private String isInside;
    @NotNull
    private MoneyViewModel length;
    public setMin onGoalChangeListener;
    /* access modifiers changed from: private */
    public int setMax;
    /* access modifiers changed from: private */
    public int setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lid/dana/savings/view/SavingGoalEntryView$OnGoalChangeListener;", "", "onTargetAmountChange", "", "valid", "", "onTittleChange", "title", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin {
        void setMax(@NotNull String str);

        void setMin(boolean z);
    }

    @JvmOverloads
    public SavingGoalEntryView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public SavingGoalEntryView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.IsOverlapping;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.IsOverlapping == null) {
            this.IsOverlapping = new HashMap();
        }
        View view = (View) this.IsOverlapping.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.IsOverlapping.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_saving_goal_entry;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "t1", "t2", "apply"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<T1, T2, R> implements removeNode<String, String, Pair<? extends String, ? extends String>> {
        public static final IsOverlapping setMin = new IsOverlapping();

        IsOverlapping() {
        }

        public final /* synthetic */ Object setMax(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            Intrinsics.checkNotNullParameter(str, "t1");
            Intrinsics.checkNotNullParameter(str2, "t2");
            return TuplesKt.to(str, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "changesValue", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<CharSequence, String> {
        public static final getMax getMin = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            Intrinsics.checkNotNullParameter(charSequence, "changesValue");
            return new Regex("[^0-9]").replace((CharSequence) charSequence.toString(), "");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "p1", "Lkotlin/Pair;", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class isInside extends FunctionReferenceImpl implements Function1<Pair<? extends String, ? extends String>, Unit> {
        isInside(SavingGoalEntryView savingGoalEntryView) {
            super(1, savingGoalEntryView, SavingGoalEntryView.class, "onGoalChanged", "onGoalChanged(Lkotlin/Pair;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Pair<String, String>) (Pair) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Pair<String, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "p1");
            SavingGoalEntryView.access$onGoalChanged((SavingGoalEntryView) this.receiver, pair);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SavingGoalEntryView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SavingGoalEntryView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = new MoneyViewModel("1", "Rp", (String) null, 4);
        this.length = new MoneyViewModel("1", "Rp", (String) null, 4);
        this.setMax = -1;
        this.setMin = -1;
        String string = context.getString(R.string.sunday);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.sunday)");
        String string2 = context.getString(R.string.monday);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.monday)");
        String string3 = context.getString(R.string.tuesday);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.string.tuesday)");
        String string4 = context.getString(R.string.wednesday);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.string.wednesday)");
        String string5 = context.getString(R.string.thursday);
        Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.string.thursday)");
        String string6 = context.getString(R.string.friday);
        Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.string.friday)");
        String string7 = context.getString(R.string.saturday);
        Intrinsics.checkNotNullExpressionValue(string7, "context.getString(R.string.saturday)");
        this.equals = SetsKt.setOf(string, string2, string3, string4, string5, string6, string7);
        this.isInside = "0";
    }

    @NotNull
    public final MoneyViewModel getMinAmount() {
        return this.length;
    }

    public final void setMinAmount(@NotNull MoneyViewModel moneyViewModel) {
        Intrinsics.checkNotNullParameter(moneyViewModel, "<set-?>");
        this.length = moneyViewModel;
    }

    @NotNull
    public final Set<String> getDays() {
        return this.equals;
    }

    @NotNull
    public final String getGoalAmount() {
        return this.isInside;
    }

    public final void setGoalAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isInside = str;
    }

    @NotNull
    public final setMin getOnGoalChangeListener() {
        setMin setmin = this.onGoalChangeListener;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onGoalChangeListener");
        }
        return setmin;
    }

    public final void setOnGoalChangeListener(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.onGoalChangeListener = setmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", "after", "onTextChanged", "before", "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, k = 1, mv = {1, 4, 2}, xi = 48)
    public static final class length implements TextWatcher {
        final /* synthetic */ DanaTextBoxView setMax;

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public length(DanaTextBoxView danaTextBoxView) {
            this.setMax = danaTextBoxView;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            int i;
            TextInputLayout textInputLayout = (TextInputLayout) this.setMax.findViewById(resetInternal.setMax.setTypeface);
            if (textInputLayout != null) {
                Context context = this.setMax.getContext();
                if (editable != null) {
                    if (editable.length() == 0) {
                        i = R.string.goal_hint;
                        textInputLayout.setHint((CharSequence) context.getString(i));
                    }
                }
                i = R.string.goal_hint_focused;
                textInputLayout.setHint((CharSequence) context.getString(i));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/RadioGroup;", "kotlin.jvm.PlatformType", "checkedId", "", "onCheckedChanged"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements RadioGroup.OnCheckedChangeListener {
        final /* synthetic */ SavingGoalEntryView length;

        toFloatRange(SavingGoalEntryView savingGoalEntryView) {
            this.length = savingGoalEntryView;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            switch (i) {
                case R.id.f57452131364323:
                    LinearLayout linearLayout = (LinearLayout) this.length._$_findCachedViewById(resetInternal.setMax.getHeaderTitle);
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    TextView textView = (TextView) this.length._$_findCachedViewById(resetInternal.setMax.getThumbTextPadding);
                    if (textView != null) {
                        textView.setText(this.length.getContext().getString(R.string.auto_top_up_date));
                    }
                    TextView textView2 = (TextView) this.length._$_findCachedViewById(resetInternal.setMax.setThumbTextPadding);
                    if (textView2 != null) {
                        textView2.setText(this.length.getContext().getString(R.string.auto_top_up_amount));
                    }
                    DanaTextBoxView danaTextBoxView = (DanaTextBoxView) this.length._$_findCachedViewById(resetInternal.setMax.InspectableProperty$FlagEntry);
                    if (danaTextBoxView != null) {
                        danaTextBoxView.setText(String.valueOf(Calendar.getInstance().get(5)));
                    }
                    DanaTextBoxView danaTextBoxView2 = (DanaTextBoxView) this.length._$_findCachedViewById(resetInternal.setMax.InspectableProperty$FlagEntry);
                    if (danaTextBoxView2 != null) {
                        danaTextBoxView2.setOnClickListener(new View.OnClickListener(this) {
                            final /* synthetic */ toFloatRange setMin;

                            {
                                this.setMin = r1;
                            }

                            public final void onClick(View view) {
                                SavingGoalEntryView.access$showMonthlyAutoTopupBottomSheet(this.setMin.length);
                            }
                        });
                        return;
                    }
                    return;
                case R.id.f57462131364324:
                    LinearLayout linearLayout2 = (LinearLayout) this.length._$_findCachedViewById(resetInternal.setMax.getHeaderTitle);
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                        return;
                    }
                    return;
                case R.id.f57482131364326:
                    LinearLayout linearLayout3 = (LinearLayout) this.length._$_findCachedViewById(resetInternal.setMax.getHeaderTitle);
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(0);
                    }
                    TextView textView3 = (TextView) this.length._$_findCachedViewById(resetInternal.setMax.getThumbTextPadding);
                    if (textView3 != null) {
                        textView3.setText(this.length.getContext().getString(R.string.auto_top_up_day));
                    }
                    TextView textView4 = (TextView) this.length._$_findCachedViewById(resetInternal.setMax.setThumbTextPadding);
                    if (textView4 != null) {
                        textView4.setText(this.length.getContext().getString(R.string.auto_top_up_amount));
                    }
                    DanaTextBoxView danaTextBoxView3 = (DanaTextBoxView) this.length._$_findCachedViewById(resetInternal.setMax.InspectableProperty$FlagEntry);
                    if (danaTextBoxView3 != null) {
                        danaTextBoxView3.setText((CharSequence) CollectionsKt.elementAt(this.length.getDays(), Calendar.getInstance().get(7) - 1));
                    }
                    DanaTextBoxView danaTextBoxView4 = (DanaTextBoxView) this.length._$_findCachedViewById(resetInternal.setMax.InspectableProperty$FlagEntry);
                    if (danaTextBoxView4 != null) {
                        danaTextBoxView4.setOnClickListener(new View.OnClickListener(this) {
                            final /* synthetic */ toFloatRange length;

                            {
                                this.length = r1;
                            }

                            public final void onClick(View view) {
                                SavingGoalEntryView.access$showWeeklyAutoTopupBottomSheet(this.length.length);
                            }
                        });
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/savings/view/SavingGoalEntryView$showWeeklyAutoTopupBottomSheet$1", "Lid/dana/savings/view/WeeklyAutoTopUpBottomSheet$WeeklyAutoTopUpListener;", "onClickSelect", "", "day", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class values implements APImageFormat.getMin {
        final /* synthetic */ SavingGoalEntryView setMax;

        values(SavingGoalEntryView savingGoalEntryView) {
            this.setMax = savingGoalEntryView;
        }

        public final void setMax(int i) {
            this.setMax.setMax = i;
            DanaTextBoxView danaTextBoxView = (DanaTextBoxView) this.setMax._$_findCachedViewById(resetInternal.setMax.InspectableProperty$FlagEntry);
            if (danaTextBoxView != null) {
                danaTextBoxView.setText((CharSequence) CollectionsKt.elementAt(this.setMax.getDays(), i - 1));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J*\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016J*\u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"id/dana/savings/view/SavingGoalEntryView$setupGoalTarget$1$1", "Landroid/text/TextWatcher;", "previousTextCursorPosition", "", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "onTextChanged", "before", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange implements TextWatcher {
        private int getMax;
        final /* synthetic */ DanaTextBoxView length;

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        toIntRange(DanaTextBoxView danaTextBoxView) {
            this.length = danaTextBoxView;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            String obj;
            String replace;
            if (editable != null && (obj = editable.toString()) != null && (replace = new Regex("[^0-9]").replace((CharSequence) obj, "")) != null) {
                int i = 0;
                if (replace.length() == 0) {
                    this.length.setText("0");
                    return;
                }
                TextWatcher textWatcher = this;
                this.length.removeTextChangedListener(textWatcher);
                if (StringsKt.startsWith$default(replace, "0", false, 2, (Object) null)) {
                    if (replace != null) {
                        replace = replace.substring(1);
                        Intrinsics.checkNotNullExpressionValue(replace, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                if (WheelView.OnWheelViewListener.getMax == null) {
                    WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
                }
                Locale locale = WheelView.OnWheelViewListener.getMax;
                Long longOrNull = StringsKt.toLongOrNull(replace);
                String format = NumberFormat.getNumberInstance(locale).format(longOrNull != null ? longOrNull.longValue() : 0);
                Intrinsics.checkNotNullExpressionValue(format, "NumberFormatterUtil.getC…mber.toLongOrNull() ?: 0)");
                this.length.setText(format);
                Editable text = this.length.getText();
                if (text != null) {
                    i = text.length();
                }
                int i2 = this.getMax;
                if (i2 >= i) {
                    i2 = i;
                }
                this.length.setSelection(Math.max(i, i2));
                this.length.addTextChangedListener(textWatcher);
            }
        }

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            this.getMax = String.valueOf(this.length.getText()).length() - this.length.getSelectionStart();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J*\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016J*\u0010\u000e\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"id/dana/savings/view/SavingGoalEntryView$setupGoalTarget$2$1", "Landroid/text/TextWatcher;", "previousTextCursorPosition", "", "afterTextChanged", "", "editableText", "Landroid/text/Editable;", "beforeTextChanged", "s", "", "start", "count", "after", "onTextChanged", "before", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class hashCode implements TextWatcher {
        private int setMax;
        final /* synthetic */ DanaTextBoxView setMin;

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        hashCode(DanaTextBoxView danaTextBoxView) {
            this.setMin = danaTextBoxView;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            String obj;
            String replace;
            if (editable != null && (obj = editable.toString()) != null && (replace = new Regex("[^0-9]").replace((CharSequence) obj, "")) != null) {
                int i = 0;
                if (replace.length() == 0) {
                    this.setMin.setText("0");
                    return;
                }
                TextWatcher textWatcher = this;
                this.setMin.removeTextChangedListener(textWatcher);
                if (StringsKt.startsWith$default(replace, "0", false, 2, (Object) null)) {
                    if (replace != null) {
                        replace = replace.substring(1);
                        Intrinsics.checkNotNullExpressionValue(replace, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                if (WheelView.OnWheelViewListener.getMax == null) {
                    WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
                }
                Locale locale = WheelView.OnWheelViewListener.getMax;
                Long longOrNull = StringsKt.toLongOrNull(replace);
                String format = NumberFormat.getNumberInstance(locale).format(longOrNull != null ? longOrNull.longValue() : 0);
                Intrinsics.checkNotNullExpressionValue(format, "NumberFormatterUtil.getC…mber.toLongOrNull() ?: 0)");
                this.setMin.setText(format);
                Editable text = this.setMin.getText();
                if (text != null) {
                    i = text.length();
                }
                int i2 = this.setMax;
                if (i2 >= i) {
                    i2 = i;
                }
                this.setMin.setSelection(Math.max(i, i2));
                this.setMin.addTextChangedListener(textWatcher);
            }
        }

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            this.setMax = String.valueOf(this.setMin.getText()).length() - this.setMin.getSelectionStart();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, k = 3, mv = {1, 4, 2})
    static final class toString implements View.OnFocusChangeListener {
        final /* synthetic */ TextInputLayout getMax;
        final /* synthetic */ SavingGoalEntryView getMin;
        final /* synthetic */ int length;
        final /* synthetic */ int setMax;
        final /* synthetic */ EditText setMin;

        toString(SavingGoalEntryView savingGoalEntryView, TextInputLayout textInputLayout, EditText editText, int i, int i2) {
            this.getMin = savingGoalEntryView;
            this.getMax = textInputLayout;
            this.setMin = editText;
            this.setMax = i;
            this.length = i2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
            if ((r4.length() == 0) == true) goto L_0x0087;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
            if ((r9.length() == 0) != true) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x017b, code lost:
            if ((r9.length() == 0) != true) goto L_0x017d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
            if ((r2.length() > 0) == true) goto L_0x002d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onFocusChange(android.view.View r8, boolean r9) {
            /*
                r7 = this;
                com.google.android.material.textfield.TextInputLayout r8 = r7.getMax
                r0 = 0
                r1 = 1
                if (r8 == 0) goto L_0x003e
                if (r9 != 0) goto L_0x002d
                android.widget.EditText r2 = r7.setMin
                android.text.Editable r2 = r2.getText()
                if (r2 == 0) goto L_0x001e
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x001a
                r2 = 1
                goto L_0x001b
            L_0x001a:
                r2 = 0
            L_0x001b:
                if (r2 != r1) goto L_0x001e
                goto L_0x002d
            L_0x001e:
                id.dana.savings.view.SavingGoalEntryView r2 = r7.getMin
                android.content.Context r2 = r2.getContext()
                int r3 = r7.length
                java.lang.String r2 = r2.getString(r3)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                goto L_0x003b
            L_0x002d:
                id.dana.savings.view.SavingGoalEntryView r2 = r7.getMin
                android.content.Context r2 = r2.getContext()
                int r3 = r7.setMax
                java.lang.String r2 = r2.getString(r3)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            L_0x003b:
                r8.setHint((java.lang.CharSequence) r2)
            L_0x003e:
                android.widget.EditText r8 = r7.setMin
                id.dana.savings.view.SavingGoalEntryView r2 = r7.getMin
                int r3 = o.resetInternal.setMax.IntegerRes
                android.view.View r2 = r2._$_findCachedViewById(r3)
                id.dana.component.edittextcomponent.DanaTextBoxView r2 = (id.dana.component.edittextcomponent.DanaTextBoxView) r2
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r2)
                java.lang.String r3 = ""
                if (r2 == 0) goto L_0x00cb
                id.dana.savings.view.SavingGoalEntryView r8 = r7.getMin
                int r2 = o.resetInternal.setMax.IntegerRes
                android.view.View r8 = r8._$_findCachedViewById(r2)
                id.dana.component.edittextcomponent.DanaTextBoxView r8 = (id.dana.component.edittextcomponent.DanaTextBoxView) r8
                java.lang.String r2 = "et_goal_title"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
                if (r9 == 0) goto L_0x0087
                id.dana.savings.view.SavingGoalEntryView r4 = r7.getMin
                int r5 = o.resetInternal.setMax.IntegerRes
                android.view.View r4 = r4._$_findCachedViewById(r5)
                id.dana.component.edittextcomponent.DanaTextBoxView r4 = (id.dana.component.edittextcomponent.DanaTextBoxView) r4
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)
                android.text.Editable r4 = r4.getText()
                if (r4 == 0) goto L_0x0084
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                int r4 = r4.length()
                if (r4 != 0) goto L_0x0080
                r4 = 1
                goto L_0x0081
            L_0x0080:
                r4 = 0
            L_0x0081:
                if (r4 != r1) goto L_0x0084
                goto L_0x0087
            L_0x0084:
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                goto L_0x0095
            L_0x0087:
                id.dana.savings.view.SavingGoalEntryView r3 = r7.getMin
                android.content.Context r3 = r3.getContext()
                int r4 = r7.length
                java.lang.String r3 = r3.getString(r4)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            L_0x0095:
                r8.setHint(r3)
                id.dana.savings.view.SavingGoalEntryView r8 = r7.getMin
                int r3 = o.resetInternal.setMax.ContentFrameLayout
                android.view.View r8 = r8._$_findCachedViewById(r3)
                com.google.android.material.textfield.TextInputLayout r8 = (com.google.android.material.textfield.TextInputLayout) r8
                if (r8 == 0) goto L_0x00ca
                if (r9 == 0) goto L_0x00c7
                id.dana.savings.view.SavingGoalEntryView r9 = r7.getMin
                int r3 = o.resetInternal.setMax.IntegerRes
                android.view.View r9 = r9._$_findCachedViewById(r3)
                id.dana.component.edittextcomponent.DanaTextBoxView r9 = (id.dana.component.edittextcomponent.DanaTextBoxView) r9
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
                android.text.Editable r9 = r9.getText()
                if (r9 == 0) goto L_0x00c6
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                int r9 = r9.length()
                if (r9 != 0) goto L_0x00c3
                r9 = 1
                goto L_0x00c4
            L_0x00c3:
                r9 = 0
            L_0x00c4:
                if (r9 == r1) goto L_0x00c7
            L_0x00c6:
                r0 = 1
            L_0x00c7:
                r8.setEndIconVisible(r0)
            L_0x00ca:
                return
            L_0x00cb:
                id.dana.savings.view.SavingGoalEntryView r2 = r7.getMin
                int r4 = o.resetInternal.setMax.IntRange
                android.view.View r2 = r2._$_findCachedViewById(r4)
                id.dana.component.edittextcomponent.DanaTextBoxView r2 = (id.dana.component.edittextcomponent.DanaTextBoxView) r2
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r2)
                java.lang.String r4 = "0"
                if (r2 == 0) goto L_0x0182
                id.dana.savings.view.SavingGoalEntryView r8 = r7.getMin
                int r2 = o.resetInternal.setMax.IntRange
                android.view.View r8 = r8._$_findCachedViewById(r2)
                id.dana.component.edittextcomponent.DanaTextBoxView r8 = (id.dana.component.edittextcomponent.DanaTextBoxView) r8
                java.lang.String r2 = "et_goal"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
                if (r9 != 0) goto L_0x00fb
                id.dana.savings.view.SavingGoalEntryView r3 = r7.getMin
                android.content.Context r3 = r3.getContext()
                int r5 = r7.length
                java.lang.String r3 = r3.getString(r5)
                goto L_0x0119
            L_0x00fb:
                id.dana.savings.view.SavingGoalEntryView r5 = r7.getMin
                int r6 = o.resetInternal.setMax.IntRange
                android.view.View r5 = r5._$_findCachedViewById(r6)
                id.dana.component.edittextcomponent.DanaTextBoxView r5 = (id.dana.component.edittextcomponent.DanaTextBoxView) r5
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
                android.text.Editable r5 = r5.getText()
                if (r5 == 0) goto L_0x0119
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                int r5 = r5.length()
                if (r5 != 0) goto L_0x0118
                r5 = 1
                goto L_0x0119
            L_0x0118:
                r5 = 0
            L_0x0119:
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r8.setHint(r3)
                if (r9 == 0) goto L_0x014f
                id.dana.savings.view.SavingGoalEntryView r8 = r7.getMin
                int r3 = o.resetInternal.setMax.IntRange
                android.view.View r8 = r8._$_findCachedViewById(r3)
                id.dana.component.edittextcomponent.DanaTextBoxView r8 = (id.dana.component.edittextcomponent.DanaTextBoxView) r8
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
                android.text.Editable r8 = r8.getText()
                if (r8 == 0) goto L_0x014f
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                int r8 = r8.length()
                if (r8 != 0) goto L_0x013d
                r8 = 1
                goto L_0x013e
            L_0x013d:
                r8 = 0
            L_0x013e:
                if (r8 != r1) goto L_0x014f
                id.dana.savings.view.SavingGoalEntryView r8 = r7.getMin
                int r3 = o.resetInternal.setMax.IntRange
                android.view.View r8 = r8._$_findCachedViewById(r3)
                id.dana.component.edittextcomponent.DanaTextBoxView r8 = (id.dana.component.edittextcomponent.DanaTextBoxView) r8
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r8.setText(r4)
            L_0x014f:
                id.dana.savings.view.SavingGoalEntryView r8 = r7.getMin
                int r3 = o.resetInternal.setMax.setTypeface
                android.view.View r8 = r8._$_findCachedViewById(r3)
                com.google.android.material.textfield.TextInputLayout r8 = (com.google.android.material.textfield.TextInputLayout) r8
                if (r8 == 0) goto L_0x0181
                if (r9 == 0) goto L_0x017e
                id.dana.savings.view.SavingGoalEntryView r9 = r7.getMin
                int r3 = o.resetInternal.setMax.IntRange
                android.view.View r9 = r9._$_findCachedViewById(r3)
                id.dana.component.edittextcomponent.DanaTextBoxView r9 = (id.dana.component.edittextcomponent.DanaTextBoxView) r9
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
                android.text.Editable r9 = r9.getText()
                if (r9 == 0) goto L_0x017d
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                int r9 = r9.length()
                if (r9 != 0) goto L_0x017a
                r9 = 1
                goto L_0x017b
            L_0x017a:
                r9 = 0
            L_0x017b:
                if (r9 == r1) goto L_0x017e
            L_0x017d:
                r0 = 1
            L_0x017e:
                r8.setEndIconVisible(r0)
            L_0x0181:
                return
            L_0x0182:
                id.dana.savings.view.SavingGoalEntryView r2 = r7.getMin
                int r5 = o.resetInternal.setMax.flag
                android.view.View r2 = r2._$_findCachedViewById(r5)
                id.dana.component.edittextcomponent.DanaTextBoxView r2 = (id.dana.component.edittextcomponent.DanaTextBoxView) r2
                boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r2)
                if (r8 == 0) goto L_0x0203
                id.dana.savings.view.SavingGoalEntryView r8 = r7.getMin
                int r2 = o.resetInternal.setMax.flag
                android.view.View r8 = r8._$_findCachedViewById(r2)
                id.dana.component.edittextcomponent.DanaTextBoxView r8 = (id.dana.component.edittextcomponent.DanaTextBoxView) r8
                java.lang.String r2 = "et_auto_topup_amount"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
                if (r9 != 0) goto L_0x01b0
                id.dana.savings.view.SavingGoalEntryView r3 = r7.getMin
                android.content.Context r3 = r3.getContext()
                int r5 = r7.length
                java.lang.String r3 = r3.getString(r5)
                goto L_0x01ce
            L_0x01b0:
                id.dana.savings.view.SavingGoalEntryView r5 = r7.getMin
                int r6 = o.resetInternal.setMax.flag
                android.view.View r5 = r5._$_findCachedViewById(r6)
                id.dana.component.edittextcomponent.DanaTextBoxView r5 = (id.dana.component.edittextcomponent.DanaTextBoxView) r5
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
                android.text.Editable r5 = r5.getText()
                if (r5 == 0) goto L_0x01ce
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                int r5 = r5.length()
                if (r5 != 0) goto L_0x01cd
                r5 = 1
                goto L_0x01ce
            L_0x01cd:
                r5 = 0
            L_0x01ce:
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r8.setHint(r3)
                if (r9 == 0) goto L_0x0203
                id.dana.savings.view.SavingGoalEntryView r8 = r7.getMin
                int r9 = o.resetInternal.setMax.flag
                android.view.View r8 = r8._$_findCachedViewById(r9)
                id.dana.component.edittextcomponent.DanaTextBoxView r8 = (id.dana.component.edittextcomponent.DanaTextBoxView) r8
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
                android.text.Editable r8 = r8.getText()
                if (r8 == 0) goto L_0x0203
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                int r8 = r8.length()
                if (r8 != 0) goto L_0x01f1
                r0 = 1
            L_0x01f1:
                if (r0 != r1) goto L_0x0203
                id.dana.savings.view.SavingGoalEntryView r8 = r7.getMin
                int r9 = o.resetInternal.setMax.flag
                android.view.View r8 = r8._$_findCachedViewById(r9)
                id.dana.component.edittextcomponent.DanaTextBoxView r8 = (id.dana.component.edittextcomponent.DanaTextBoxView) r8
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r8.setText(r4)
            L_0x0203:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.savings.view.SavingGoalEntryView.toString.onFocusChange(android.view.View, boolean):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ SavingGoalEntryView getMax;

        equals(SavingGoalEntryView savingGoalEntryView) {
            this.getMax = savingGoalEntryView;
        }

        public final void onClick(View view) {
            SavingGoalEntryView.access$showSavingLimitDialog(this.getMax);
        }
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        DanaTextBoxView danaTextBoxView = (DanaTextBoxView) _$_findCachedViewById(resetInternal.setMax.IntegerRes);
        if (danaTextBoxView != null) {
            danaTextBoxView.setText(str);
        }
        DanaTextBoxView danaTextBoxView2 = (DanaTextBoxView) _$_findCachedViewById(resetInternal.setMax.IntegerRes);
        if (danaTextBoxView2 != null) {
            danaTextBoxView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        TextInputLayout textInputLayout = (TextInputLayout) _$_findCachedViewById(resetInternal.setMax.ContentFrameLayout);
        if (textInputLayout != null) {
            textInputLayout.setEndIconVisible(false);
        }
    }

    public final void setGoal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        DanaTextBoxView danaTextBoxView = (DanaTextBoxView) _$_findCachedViewById(resetInternal.setMax.IntRange);
        if (danaTextBoxView != null) {
            danaTextBoxView.setText(str);
        }
        TextInputLayout textInputLayout = (TextInputLayout) _$_findCachedViewById(resetInternal.setMax.setTypeface);
        if (textInputLayout != null) {
            textInputLayout.setHint((CharSequence) getContext().getString(R.string.goal_hint_focused));
        }
        TextInputLayout textInputLayout2 = (TextInputLayout) _$_findCachedViewById(resetInternal.setMax.setTypeface);
        if (textInputLayout2 != null) {
            textInputLayout2.setEndIconVisible(false);
        }
    }

    public final void setMaximumAmount(@NotNull MoneyViewModel moneyViewModel) {
        Intrinsics.checkNotNullParameter(moneyViewModel, "moneyViewModel");
        this.getMax = moneyViewModel;
        DanaTextBoxView danaTextBoxView = (DanaTextBoxView) _$_findCachedViewById(resetInternal.setMax.IntRange);
        if (danaTextBoxView != null) {
            Editable text = danaTextBoxView.getText();
            String obj = text != null ? text.toString() : null;
            if (obj == null) {
                obj = "";
            }
            setMin(obj);
        }
    }

    private final void setMax(boolean z, boolean z2) {
        MoneyViewModel moneyViewModel;
        this.getMin = !z;
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.getNavigationIcon);
        int i = R.color.f23802131100313;
        if (appCompatTextView != null) {
            String string = getContext().getString(!z || z2 ? R.string.maximum_savings_target_warning : R.string.minimum_savings_target_warning);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(when {…ngs_target_warning\n    })");
            Object[] objArr = new Object[1];
            if (z2) {
                moneyViewModel = this.getMax;
            } else {
                moneyViewModel = this.length;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(moneyViewModel.getMin);
            sb.append(moneyViewModel.setMin);
            objArr[0] = sb.toString();
            String format = String.format(string, Arrays.copyOf(objArr, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
            appCompatTextView.setText(format);
            appCompatTextView.setTextColor(IntRange.setMax(appCompatTextView.getContext(), z ? R.color.f23802131100313 : R.color.f20382131099951));
        }
        TextInputLayout textInputLayout = (TextInputLayout) _$_findCachedViewById(resetInternal.setMax.setTypeface);
        if (textInputLayout != null) {
            Context context = textInputLayout.getContext();
            if (!z) {
                i = R.color.f20382131099951;
            }
            textInputLayout.setHintTextColor(IntRange.getMin(context, i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class getMin extends FunctionReferenceImpl implements Function1<Object, String> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1, CharSequence.class, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String invoke(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "p1");
            return charSequence.toString();
        }
    }

    private final boolean getMin(Pair<String, String> pair) {
        MoneyViewModel moneyViewModel = new MoneyViewModel(pair.getFirst(), (String) null, (String) null, 6);
        return (pair.getSecond().length() > 0) && !moneyViewModel.getMax(this.getMax) && !moneyViewModel.getMin(this.length);
    }

    private final void setMin(String str) {
        if (str.length() == 0) {
            setMax(false, true);
            return;
        }
        MoneyViewModel moneyViewModel = new MoneyViewModel(str, (String) null, (String) null, 6);
        if (moneyViewModel.getMin(this.length)) {
            setMax(true, false);
        } else if (moneyViewModel.getMax(this.getMax)) {
            setMax(true, true);
        } else {
            setMax(false, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = r1.getText();
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final id.dana.nearbyme.merchantdetail.model.MoneyViewModel getTargetAmount() {
        /*
            r4 = this;
            id.dana.nearbyme.merchantdetail.model.MoneyViewModel r0 = new id.dana.nearbyme.merchantdetail.model.MoneyViewModel
            int r1 = o.resetInternal.setMax.IntRange
            android.view.View r1 = r4._$_findCachedViewById(r1)
            id.dana.component.edittextcomponent.DanaTextBoxView r1 = (id.dana.component.edittextcomponent.DanaTextBoxView) r1
            r2 = 0
            if (r1 == 0) goto L_0x0018
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = r1.toString()
            goto L_0x0019
        L_0x0018:
            r1 = r2
        L_0x0019:
            if (r1 != 0) goto L_0x001d
            java.lang.String r1 = ""
        L_0x001d:
            r3 = 6
            r0.<init>(r1, r2, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.savings.view.SavingGoalEntryView.getTargetAmount():id.dana.nearbyme.merchantdetail.model.MoneyViewModel");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.getText();
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getTitle() {
        /*
            r1 = this;
            int r0 = o.resetInternal.setMax.IntegerRes
            android.view.View r0 = r1._$_findCachedViewById(r0)
            id.dana.component.edittextcomponent.DanaTextBoxView r0 = (id.dana.component.edittextcomponent.DanaTextBoxView) r0
            if (r0 == 0) goto L_0x0015
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.toString()
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = ""
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.savings.view.SavingGoalEntryView.getTitle():java.lang.String");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/savings/view/SavingGoalEntryView$Companion;", "", "()V", "NON_NUMBER_REGEX", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [o.APImageDownLoadCallback] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setup() {
        /*
            r8 = this;
            int r0 = o.resetInternal.setMax.IntegerRes
            android.view.View r0 = r8._$_findCachedViewById(r0)
            id.dana.component.edittextcomponent.DanaTextBoxView r0 = (id.dana.component.edittextcomponent.DanaTextBoxView) r0
            int r1 = o.resetInternal.setMax.ContentFrameLayout
            android.view.View r1 = r8._$_findCachedViewById(r1)
            r3 = r1
            com.google.android.material.textfield.TextInputLayout r3 = (com.google.android.material.textfield.TextInputLayout) r3
            if (r0 == 0) goto L_0x0026
            id.dana.savings.view.SavingGoalEntryView$toString r7 = new id.dana.savings.view.SavingGoalEntryView$toString
            r5 = 2131887186(0x7f120452, float:1.9408972E38)
            r6 = 2131887185(0x7f120451, float:1.940897E38)
            r1 = r7
            r2 = r8
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            android.view.View$OnFocusChangeListener r7 = (android.view.View.OnFocusChangeListener) r7
            r0.setOnFocusChangeListener(r7)
        L_0x0026:
            int r0 = o.resetInternal.setMax.IntRange
            android.view.View r0 = r8._$_findCachedViewById(r0)
            id.dana.component.edittextcomponent.DanaTextBoxView r0 = (id.dana.component.edittextcomponent.DanaTextBoxView) r0
            int r1 = o.resetInternal.setMax.setTypeface
            android.view.View r1 = r8._$_findCachedViewById(r1)
            r3 = r1
            com.google.android.material.textfield.TextInputLayout r3 = (com.google.android.material.textfield.TextInputLayout) r3
            if (r0 == 0) goto L_0x004c
            id.dana.savings.view.SavingGoalEntryView$toString r7 = new id.dana.savings.view.SavingGoalEntryView$toString
            r5 = 2131887183(0x7f12044f, float:1.9408966E38)
            r6 = 2131887182(0x7f12044e, float:1.9408964E38)
            r1 = r7
            r2 = r8
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            android.view.View$OnFocusChangeListener r7 = (android.view.View.OnFocusChangeListener) r7
            r0.setOnFocusChangeListener(r7)
        L_0x004c:
            int r0 = o.resetInternal.setMax.flag
            android.view.View r0 = r8._$_findCachedViewById(r0)
            id.dana.component.edittextcomponent.DanaTextBoxView r0 = (id.dana.component.edittextcomponent.DanaTextBoxView) r0
            int r1 = o.resetInternal.setMax.ButtonBarLayout
            android.view.View r1 = r8._$_findCachedViewById(r1)
            r3 = r1
            com.google.android.material.textfield.TextInputLayout r3 = (com.google.android.material.textfield.TextInputLayout) r3
            if (r0 == 0) goto L_0x0072
            id.dana.savings.view.SavingGoalEntryView$toString r7 = new id.dana.savings.view.SavingGoalEntryView$toString
            r5 = 2131887183(0x7f12044f, float:1.9408966E38)
            r6 = 2131887182(0x7f12044e, float:1.9408964E38)
            r1 = r7
            r2 = r8
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            android.view.View$OnFocusChangeListener r7 = (android.view.View.OnFocusChangeListener) r7
            r0.setOnFocusChangeListener(r7)
        L_0x0072:
            int r0 = o.resetInternal.setMax.onDetachedFromWindow
            android.view.View r0 = r8._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x0086
            id.dana.savings.view.SavingGoalEntryView$equals r1 = new id.dana.savings.view.SavingGoalEntryView$equals
            r1.<init>(r8)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x0086:
            int r0 = o.resetInternal.setMax.IntRange
            android.view.View r0 = r8._$_findCachedViewById(r0)
            id.dana.component.edittextcomponent.DanaTextBoxView r0 = (id.dana.component.edittextcomponent.DanaTextBoxView) r0
            if (r0 == 0) goto L_0x00a7
            id.dana.savings.view.SavingGoalEntryView$toIntRange r1 = new id.dana.savings.view.SavingGoalEntryView$toIntRange
            r1.<init>(r0)
            android.text.TextWatcher r1 = (android.text.TextWatcher) r1
            r0.addTextChangedListener(r1)
            r1 = r0
            android.widget.TextView r1 = (android.widget.TextView) r1
            id.dana.savings.view.SavingGoalEntryView$length r2 = new id.dana.savings.view.SavingGoalEntryView$length
            r2.<init>(r0)
            android.text.TextWatcher r2 = (android.text.TextWatcher) r2
            r1.addTextChangedListener(r2)
        L_0x00a7:
            int r0 = o.resetInternal.setMax.flag
            android.view.View r0 = r8._$_findCachedViewById(r0)
            id.dana.component.edittextcomponent.DanaTextBoxView r0 = (id.dana.component.edittextcomponent.DanaTextBoxView) r0
            if (r0 == 0) goto L_0x00bb
            id.dana.savings.view.SavingGoalEntryView$hashCode r1 = new id.dana.savings.view.SavingGoalEntryView$hashCode
            r1.<init>(r0)
            android.text.TextWatcher r1 = (android.text.TextWatcher) r1
            r0.addTextChangedListener(r1)
        L_0x00bb:
            int r0 = o.resetInternal.setMax.setActionBarHideOffset
            android.view.View r0 = r8._$_findCachedViewById(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            if (r0 == 0) goto L_0x00c9
            r1 = 1
            r0.setChecked(r1)
        L_0x00c9:
            int r0 = o.resetInternal.setMax.dismissPopups
            android.view.View r0 = r8._$_findCachedViewById(r0)
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            if (r0 == 0) goto L_0x00dd
            id.dana.savings.view.SavingGoalEntryView$toFloatRange r1 = new id.dana.savings.view.SavingGoalEntryView$toFloatRange
            r1.<init>(r8)
            android.widget.RadioGroup$OnCheckedChangeListener r1 = (android.widget.RadioGroup.OnCheckedChangeListener) r1
            r0.setOnCheckedChangeListener(r1)
        L_0x00dd:
            int r0 = o.resetInternal.setMax.IntRange
            android.view.View r0 = r8._$_findCachedViewById(r0)
            id.dana.component.edittextcomponent.DanaTextBoxView r0 = (id.dana.component.edittextcomponent.DanaTextBoxView) r0
            if (r0 == 0) goto L_0x0165
            android.widget.TextView r0 = (android.widget.TextView) r0
            o.AudioAttributesImplBase r0 = o.onLoadChildren.textChanges(r0)
            o.hasCornerMarking r1 = o.getSecureSignatureComp.setMin()
            o.TitleBarRightButtonView$1 r0 = r0.subscribeOn(r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 100
            o.TitleBarRightButtonView$1 r0 = r0.debounce(r2, r1)
            id.dana.savings.view.SavingGoalEntryView$getMax r1 = id.dana.savings.view.SavingGoalEntryView.getMax.getMin
            o.RedDotDrawable r1 = (o.RedDotDrawable) r1
            o.TitleBarRightButtonView$1 r0 = r0.map(r1)
            o.hasCornerMarking r1 = o.hideProgress.length()
            o.TitleBarRightButtonView$1 r0 = r0.observeOn(r1)
            o.TitleBarRightButtonView$4 r0 = (o.TitleBarRightButtonView.AnonymousClass4) r0
            int r1 = o.resetInternal.setMax.IntegerRes
            android.view.View r1 = r8._$_findCachedViewById(r1)
            id.dana.component.edittextcomponent.DanaTextBoxView r1 = (id.dana.component.edittextcomponent.DanaTextBoxView) r1
            o.AudioAttributesImplBase r1 = o.onLoadChildren.textChanges(r1)
            o.hasCornerMarking r4 = o.getSecureSignatureComp.setMin()
            o.TitleBarRightButtonView$1 r1 = r1.subscribeOn(r4)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            o.TitleBarRightButtonView$1 r1 = r1.debounce(r2, r4)
            id.dana.savings.view.SavingGoalEntryView$getMin r2 = id.dana.savings.view.SavingGoalEntryView.getMin.INSTANCE
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            if (r2 == 0) goto L_0x0135
            o.APImageDownLoadCallback r3 = new o.APImageDownLoadCallback
            r3.<init>(r2)
            r2 = r3
        L_0x0135:
            o.RedDotDrawable r2 = (o.RedDotDrawable) r2
            o.TitleBarRightButtonView$1 r1 = r1.map(r2)
            o.hasCornerMarking r2 = o.hideProgress.length()
            o.TitleBarRightButtonView$1 r1 = r1.observeOn(r2)
            o.TitleBarRightButtonView$4 r1 = (o.TitleBarRightButtonView.AnonymousClass4) r1
            id.dana.savings.view.SavingGoalEntryView$IsOverlapping r2 = id.dana.savings.view.SavingGoalEntryView.IsOverlapping.setMin
            o.removeNode r2 = (o.removeNode) r2
            o.TitleBarRightButtonView$1 r0 = o.TitleBarRightButtonView.AnonymousClass1.combineLatest(r0, r1, r2)
            id.dana.savings.view.SavingGoalEntryView$isInside r1 = new id.dana.savings.view.SavingGoalEntryView$isInside
            r2 = r8
            id.dana.savings.view.SavingGoalEntryView r2 = (id.dana.savings.view.SavingGoalEntryView) r2
            r1.<init>(r2)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            o.TouchInterceptFrameLayout$1 r2 = new o.TouchInterceptFrameLayout$1
            r2.<init>()
            o.RedDotManager r2 = (o.RedDotManager) r2
            o.GriverProgressBar$UpdateRunnable r0 = r0.subscribe(r2)
            r8.addDisposable(r0)
        L_0x0165:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.savings.view.SavingGoalEntryView.setup():void");
    }

    public static final /* synthetic */ void access$showWeeklyAutoTopupBottomSheet(SavingGoalEntryView savingGoalEntryView) {
        APImageFormat aPImageFormat = new APImageFormat();
        int i = savingGoalEntryView.setMax;
        if (i == -1) {
            aPImageFormat.getMax = Calendar.getInstance().get(7);
        } else {
            aPImageFormat.getMax = i;
        }
        APImageFormat.getMin values2 = new values(savingGoalEntryView);
        Intrinsics.checkNotNullParameter(values2, "<set-?>");
        aPImageFormat.getMin = values2;
        Context context = savingGoalEntryView.getContext();
        if (context != null) {
            aPImageFormat.show(((FragmentActivity) context).getSupportFragmentManager(), "WeeklyReminderDialogFragment");
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    public static final /* synthetic */ void access$showMonthlyAutoTopupBottomSheet(SavingGoalEntryView savingGoalEntryView) {
        TouchInterceptFrameLayout touchInterceptFrameLayout = new TouchInterceptFrameLayout();
        int i = savingGoalEntryView.setMin;
        if (i == -1) {
            touchInterceptFrameLayout.getMin = Calendar.getInstance().get(5);
        } else {
            touchInterceptFrameLayout.getMin = i;
        }
        TouchInterceptFrameLayout.getMin savingGoalEntryView$FastBitmap$CoordinateSystem = new SavingGoalEntryView$FastBitmap$CoordinateSystem(savingGoalEntryView);
        Intrinsics.checkNotNullParameter(savingGoalEntryView$FastBitmap$CoordinateSystem, "<set-?>");
        touchInterceptFrameLayout.getMax = savingGoalEntryView$FastBitmap$CoordinateSystem;
        Context context = savingGoalEntryView.getContext();
        if (context != null) {
            touchInterceptFrameLayout.show(((FragmentActivity) context).getSupportFragmentManager(), "MonthlyAutoTopUpBottomSheet");
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    public static final /* synthetic */ void access$showSavingLimitDialog(SavingGoalEntryView savingGoalEntryView) {
        DialogWithImage.getMin getmin = new DialogWithImage.getMin();
        getmin.toFloatRange = R.drawable.maximum_limit;
        getmin.getMax = savingGoalEntryView.getContext().getString(R.string.pop_up_title_saving_limit_about_info);
        getmin.setMin = savingGoalEntryView.getContext().getString(R.string.pop_up_description_saving_limit_about_info);
        getmin.getMin = savingGoalEntryView.getContext().getString(R.string.got_it);
        new DialogWithImage(savingGoalEntryView.getContext(), getmin.setMax, getmin, (byte) 0).setMin();
    }

    public static final /* synthetic */ void access$onGoalChanged(SavingGoalEntryView savingGoalEntryView, Pair pair) {
        savingGoalEntryView.setMin((String) pair.getFirst());
        boolean min = savingGoalEntryView.getMin(pair);
        setMin setmin = savingGoalEntryView.onGoalChangeListener;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onGoalChangeListener");
        }
        setmin.setMin(min);
        if (min) {
            setMin setmin2 = savingGoalEntryView.onGoalChangeListener;
            if (setmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onGoalChangeListener");
            }
            setmin2.setMax((String) pair.getSecond());
        }
    }
}
