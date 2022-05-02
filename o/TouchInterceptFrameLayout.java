package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.TransformationMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import androidx.gridlayout.widget.GridLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.richview.CurrencyEditText;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import o.resetInternal;
import o.setOnWheelViewListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002()B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0012H\u0014J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001dH\u0014J\b\u0010%\u001a\u00020\u001dH\u0016J\b\u0010&\u001a\u00020\u001dH\u0002J\b\u0010'\u001a\u00020\u001dH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006*"}, d2 = {"Lid/dana/savings/view/MonthlyAutoTopUpBottomSheet;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "()V", "monthlyAutoTopUpListener", "Lid/dana/savings/view/MonthlyAutoTopUpBottomSheet$MonthlyAutoTopUpListener;", "getMonthlyAutoTopUpListener", "()Lid/dana/savings/view/MonthlyAutoTopUpBottomSheet$MonthlyAutoTopUpListener;", "setMonthlyAutoTopUpListener", "(Lid/dana/savings/view/MonthlyAutoTopUpBottomSheet$MonthlyAutoTopUpListener;)V", "rbDates", "", "Landroid/widget/RadioButton;", "getRbDates", "()[Landroid/widget/RadioButton;", "setRbDates", "([Landroid/widget/RadioButton;)V", "[Landroid/widget/RadioButton;", "selectedDate", "", "getSelectedDate", "()I", "setSelectedDate", "(I)V", "getBottomSheet", "Landroid/widget/FrameLayout;", "getDimAmount", "", "getLayout", "init", "", "initCalendar", "initSelectedDate", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onShow", "onStart", "setButtonListener", "setRadioButtonListener", "Companion", "MonthlyAutoTopUpListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TouchInterceptFrameLayout extends order {
    @NotNull
    public static final setMin toIntRange = new setMin((byte) 0);
    private HashMap IsOverlapping;
    public getMin getMax;
    public int getMin;
    @NotNull
    RadioButton[] isInside = new RadioButton[32];

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/savings/view/MonthlyAutoTopUpBottomSheet$MonthlyAutoTopUpListener;", "", "onClickSelect", "", "date", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin {
        void getMin(int i);
    }

    private View getMin(int i) {
        if (this.IsOverlapping == null) {
            this.IsOverlapping = new HashMap();
        }
        View view = (View) this.IsOverlapping.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.IsOverlapping.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getMin() {
        return R.layout.view_monthly_auto_topup_container;
    }

    public final float length() {
        return 0.5f;
    }

    @Nullable
    public final FrameLayout getMax() {
        return (FrameLayout) getMin(resetInternal.setMax.RequiresOptIn);
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.f78532131951924);
    }

    public final void onStart() {
        super.onStart();
        getMax(getDialog());
        length(getDialog());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ?2\u00020\u0001:\u0002?@B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020\u0014H\u0014J\b\u0010$\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020\u0012H\u0014J\b\u0010&\u001a\u00020\u0012H\u0002J\u0012\u0010'\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u0012H\u0014J\b\u0010+\u001a\u00020\u0012H\u0016J\u0012\u0010,\u001a\u00020\u001b2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\u0010\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u0014H\u0002J\b\u00101\u001a\u00020\u0012H\u0002J\u0010\u00102\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u00103\u001a\u00020\u0012H\u0002J\b\u00104\u001a\u00020\u0012H\u0002J\b\u00105\u001a\u00020\u0012H\u0002J\b\u00106\u001a\u00020\u0012H\u0002J\b\u00107\u001a\u00020\u0012H\u0002J\u001a\u00108\u001a\u00020\u00122\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020\u0014H\u0002J\u0006\u0010<\u001a\u00020\u0012J\f\u0010&\u001a\u00020\u0012*\u00020=H\u0002J\f\u0010&\u001a\u00020\u0012*\u00020>H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006A"}, d2 = {"Lid/dana/savings/view/TopUpSavingDialogFragment;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "()V", "amountExcedeed", "", "savingTopUpInitModel", "Lid/dana/savings/model/SavingTopUpInitModel;", "getSavingTopUpInitModel", "()Lid/dana/savings/model/SavingTopUpInitModel;", "setSavingTopUpInitModel", "(Lid/dana/savings/model/SavingTopUpInitModel;)V", "topUpListener", "Lid/dana/savings/view/TopUpSavingDialogFragment$TopUpListener;", "getTopUpListener", "()Lid/dana/savings/view/TopUpSavingDialogFragment$TopUpListener;", "setTopUpListener", "(Lid/dana/savings/view/TopUpSavingDialogFragment$TopUpListener;)V", "addTextListener", "", "checkAmountInputted", "", "targetAmountInLong", "", "inputtedAmountInLong", "clickTopUpButton", "convertStringToLong", "cleanInputtedAmount", "", "focusAndShowKeyboard", "getBottomSheet", "Landroid/widget/FrameLayout;", "getDimAmount", "", "getKeyboardVisibilityListener", "Lid/dana/utils/KeyboardHelper$KeyboardVisibilityListener;", "getLayout", "getMaxAmountToTopUp", "init", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onShow", "onStart", "removePrefix", "s", "", "setButtonActionType", "buttonType", "setButtonListener", "setClearTextIcon", "setErrorText", "setInputType", "setNoteHelper", "setOnEditorActionListener", "setOnIconTouchClearListener", "setTextAppearanceOnWarningText", "textView", "Landroid/widget/TextView;", "style", "showErrorWarning", "Lid/dana/component/buttoncomponent/DanaButtonPrimaryView;", "Lid/dana/richview/CurrencyEditText;", "Companion", "TopUpListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class TapListener extends order {
        @NotNull
        public static final getMin isInside = new getMin((byte) 0);
        @Nullable
        public onSurfaceTextureUpdated getMax;
        public setMax getMin;
        private HashMap toFloatRange;
        /* access modifiers changed from: private */
        public boolean toIntRange = true;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/savings/view/TopUpSavingDialogFragment$TopUpListener;", "", "onClickTopUp", "", "fundAmount", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public interface setMax {
            void setMin(@NotNull String str);
        }

        public static final /* synthetic */ int setMin(long j, long j2) {
            return (j < j2 || j2 == 0) ? 0 : 1;
        }

        public final int getMin() {
            return R.layout.view_top_up_container;
        }

        public final float length() {
            return 0.5f;
        }

        public final View setMin(int i) {
            if (this.toFloatRange == null) {
                this.toFloatRange = new HashMap();
            }
            View view = (View) this.toFloatRange.get(Integer.valueOf(i));
            if (view != null) {
                return view;
            }
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            View findViewById = view2.findViewById(i);
            this.toFloatRange.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }

        @Nullable
        public final FrameLayout getMax() {
            return (FrameLayout) setMin(resetInternal.setMax.anyOf);
        }

        public final void onCreate(@Nullable Bundle bundle) {
            super.onCreate(bundle);
            setStyle(0, R.style.f78532131951924);
        }

        public final void onStart() {
            super.onStart();
            getMax(getDialog());
            length(getDialog());
        }

        public final void setMax() {
            super.setMax();
            values();
            CurrencyEditText currencyEditText = (CurrencyEditText) setMin(resetInternal.setMax.target);
            if (currencyEditText != null) {
                currencyEditText.setText("Rp0");
                currencyEditText.setListener(new equals(this, currencyEditText));
                values();
                CurrencyEditText currencyEditText2 = (CurrencyEditText) setMin(resetInternal.setMax.target);
                if (currencyEditText2 != null) {
                    currencyEditText2.setOnEditorActionListener(new isInside(this));
                }
                CurrencyEditText currencyEditText3 = (CurrencyEditText) setMin(resetInternal.setMax.target);
                if (currencyEditText3 != null) {
                    currencyEditText3.setOnTouchListener(new toFloatRange(this));
                }
            }
            DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) setMin(resetInternal.setMax.postMessage);
            if (danaButtonPrimaryView != null) {
                danaButtonPrimaryView.setEnabled(false);
                danaButtonPrimaryView.setDanaButtonView(0, getString(R.string.top_up), "", (Drawable) null);
            }
            CurrencyEditText currencyEditText4 = (CurrencyEditText) setMin(resetInternal.setMax.target);
            if (currencyEditText4 != null) {
                currencyEditText4.addTextChangedListener(new length(this));
            }
            DanaButtonPrimaryView danaButtonPrimaryView2 = (DanaButtonPrimaryView) setMin(resetInternal.setMax.postMessage);
            if (danaButtonPrimaryView2 != null) {
                danaButtonPrimaryView2.setOnClickListener(new IsOverlapping(this));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", "after", "onTextChanged", "before", "core-ktx_release"}, k = 1, mv = {1, 4, 2}, xi = 48)
        public static final class length implements TextWatcher {
            final /* synthetic */ TapListener length;

            public final void afterTextChanged(@Nullable Editable editable) {
            }

            public length(TapListener tapListener) {
                this.length = tapListener;
            }

            public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
                Drawable background;
                CurrencyEditText currencyEditText = (CurrencyEditText) this.length.setMin(resetInternal.setMax.target);
                if (currencyEditText != null && (background = currencyEditText.getBackground()) != null) {
                    background.setColorFilter(IntRange.setMax(this.length.setMax, R.color.f24202131100363), PorterDuff.Mode.SRC_IN);
                }
            }

            public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
                String min = StringsKt.replace$default(String.valueOf(charSequence), "Rp", "", false, 4, (Object) null);
                if (min.length() == 0) {
                    min = "0";
                }
                long max = TapListener.setMax(min);
                String cleanAll = isOriginHasAppInfo.getCleanAll(TapListener.setMin(this.length));
                Intrinsics.checkNotNullExpressionValue(cleanAll, "NumberUtils.getCleanAll(getMaxAmountToTopUp())");
                long parseLong = Long.parseLong(cleanAll);
                TapListener.length(this.length, min);
                TapListener.length(this.length, TapListener.setMin(parseLong, max));
                this.length.toIntRange = true;
                if (TapListener.setMin(parseLong, max) == 1) {
                    this.length.toIntRange = false;
                    DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) this.length.setMin(resetInternal.setMax.postMessage);
                    if (danaButtonPrimaryView != null) {
                        danaButtonPrimaryView.setEnabled(true);
                    }
                    this.length.values();
                } else if (parseLong < max) {
                    DanaButtonPrimaryView danaButtonPrimaryView2 = (DanaButtonPrimaryView) this.length.setMin(resetInternal.setMax.postMessage);
                    if (danaButtonPrimaryView2 != null) {
                        danaButtonPrimaryView2.setEnabled(false);
                    }
                    TapListener.length(this.length);
                } else {
                    DanaButtonPrimaryView danaButtonPrimaryView3 = (DanaButtonPrimaryView) this.length.setMin(resetInternal.setMax.postMessage);
                    if (danaButtonPrimaryView3 != null) {
                        danaButtonPrimaryView3.setEnabled(false);
                    }
                    this.length.values();
                }
            }
        }

        public final void equals() {
            TextView textView = (TextView) setMin(resetInternal.setMax.tv_warning_note);
            if (textView != null) {
                TextViewCompat.setMax(textView, (int) R.style.f78342131951900);
            }
            TextView textView2 = (TextView) setMin(resetInternal.setMax.tv_warning_note);
            if (textView2 != null) {
                textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_warning_14, 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onBackPressed"}, k = 3, mv = {1, 4, 2})
        static final class equals implements CurrencyEditText.setMax {
            final /* synthetic */ TapListener getMax;
            final /* synthetic */ CurrencyEditText getMin;

            equals(TapListener tapListener, CurrencyEditText currencyEditText) {
                this.getMax = tapListener;
                this.getMin = currencyEditText;
            }

            public final void getMax() {
                this.getMin.clearFocus();
                this.getMax.dismissAllowingStateLoss();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "event", "Landroid/view/KeyEvent;", "onEditorAction"}, k = 3, mv = {1, 4, 2})
        static final class isInside implements TextView.OnEditorActionListener {
            final /* synthetic */ TapListener length;

            isInside(TapListener tapListener) {
                this.length = tapListener;
            }

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if ((keyEvent == null || keyEvent.getKeyCode() != 66) && (i != 6 || this.length.toIntRange)) {
                    return false;
                }
                TapListener.getMax(this.length);
                return false;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
        static final class IsOverlapping implements View.OnClickListener {
            final /* synthetic */ TapListener setMax;

            IsOverlapping(TapListener tapListener) {
                this.setMax = tapListener;
            }

            public final void onClick(View view) {
                TapListener.getMax(this.setMax);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 4, 2})
        static final class toFloatRange implements View.OnTouchListener {
            final /* synthetic */ TapListener setMax;

            toFloatRange(TapListener tapListener) {
                this.setMax = tapListener;
            }

            public final boolean onTouch(@Nullable View view, @NotNull MotionEvent motionEvent) {
                Intrinsics.checkNotNullParameter(motionEvent, "event");
                CurrencyEditText currencyEditText = (CurrencyEditText) this.setMax.setMin(resetInternal.setMax.target);
                Intrinsics.checkNotNullExpressionValue(currencyEditText, "et_amount");
                if (currencyEditText.getCompoundDrawables()[2] == null) {
                    return false;
                }
                float rawX = motionEvent.getRawX();
                CurrencyEditText currencyEditText2 = (CurrencyEditText) this.setMax.setMin(resetInternal.setMax.target);
                Intrinsics.checkNotNullExpressionValue(currencyEditText2, "et_amount");
                int right = currencyEditText2.getRight();
                CurrencyEditText currencyEditText3 = (CurrencyEditText) this.setMax.setMin(resetInternal.setMax.target);
                Intrinsics.checkNotNullExpressionValue(currencyEditText3, "et_amount");
                Drawable drawable = currencyEditText3.getCompoundDrawables()[2];
                Intrinsics.checkNotNullExpressionValue(drawable, "et_amount.compoundDrawables[DRAWABLE_RIGHT]");
                if (rawX < ((float) (right - drawable.getBounds().width()))) {
                    return false;
                }
                CurrencyEditText currencyEditText4 = (CurrencyEditText) this.setMax.setMin(resetInternal.setMax.target);
                Intrinsics.checkNotNullExpressionValue(currencyEditText4, "et_amount");
                if (currencyEditText4.getText() == null) {
                    return false;
                }
                CurrencyEditText currencyEditText5 = (CurrencyEditText) this.setMax.setMin(resetInternal.setMax.target);
                if (currencyEditText5 == null) {
                    return true;
                }
                currencyEditText5.setText("Rp0");
                return true;
            }
        }

        /* access modifiers changed from: private */
        public final void values() {
            String str;
            MoneyViewModel moneyViewModel;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = getString(R.string.top_up_dialog_note_helper);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.top_up_dialog_note_helper)");
            Object[] objArr = new Object[1];
            onSurfaceTextureUpdated onsurfacetextureupdated = this.getMax;
            if (onsurfacetextureupdated == null || (moneyViewModel = onsurfacetextureupdated.getMax) == null || (str = moneyViewModel.setMin) == null) {
                str = "0";
            }
            objArr[0] = str;
            String format = String.format(string, Arrays.copyOf(objArr, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            TextView textView = (TextView) setMin(resetInternal.setMax.tv_warning_note);
            if (textView != null) {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            TextView textView2 = (TextView) setMin(resetInternal.setMax.tv_warning_note);
            if (textView2 != null) {
                textView2.setText(format);
            }
            TextView textView3 = (TextView) setMin(resetInternal.setMax.tv_warning_note);
            if (textView3 != null) {
                TextViewCompat.setMax(textView3, (int) R.style.f78382131951905);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"id/dana/savings/view/TopUpSavingDialogFragment$getKeyboardVisibilityListener$1", "Lid/dana/utils/KeyboardHelper$KeyboardVisibilityListener;", "onKeyboardHide", "", "onKeyboardShow", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMax implements setOnWheelViewListener.length {
            final /* synthetic */ TapListener getMax;

            public final void setMax() {
            }

            getMax(TapListener tapListener) {
                this.getMax = tapListener;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
            static final class setMin implements Runnable {
                final /* synthetic */ getMax setMax;

                setMin(getMax getmax) {
                    this.setMax = getmax;
                }

                public final void run() {
                    this.setMax.getMax.length.setState(3);
                }
            }

            public final void length() {
                this.getMax.setMin.post(new setMin(this));
            }
        }

        @NotNull
        public final setOnWheelViewListener.length s_() {
            return new getMax(this);
        }

        public final void setMin() {
            super.setMin();
            setMin(setMin(getDialog()), 3);
            CurrencyEditText currencyEditText = (CurrencyEditText) setMin(resetInternal.setMax.target);
            if (currencyEditText != null) {
                currencyEditText.post(new setMin(this));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
        static final class setMin implements Runnable {
            final /* synthetic */ TapListener length;

            setMin(TapListener tapListener) {
                this.length = tapListener;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
                r0 = r0.getApplicationContext();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r3 = this;
                    o.TouchInterceptFrameLayout$TapListener r0 = r3.length
                    int r1 = o.resetInternal.setMax.target
                    android.view.View r0 = r0.setMin((int) r1)
                    id.dana.richview.CurrencyEditText r0 = (id.dana.richview.CurrencyEditText) r0
                    if (r0 == 0) goto L_0x000f
                    r0.requestFocus()
                L_0x000f:
                    o.TouchInterceptFrameLayout$TapListener r0 = r3.length
                    o.TouchInterceptFrameLayout.TapListener.toIntRange(r0)
                    o.TouchInterceptFrameLayout$TapListener r0 = r3.length
                    int r1 = o.resetInternal.setMax.target
                    android.view.View r0 = r0.setMin((int) r1)
                    id.dana.richview.CurrencyEditText r0 = (id.dana.richview.CurrencyEditText) r0
                    if (r0 == 0) goto L_0x0023
                    r0.getText()
                L_0x0023:
                    o.TouchInterceptFrameLayout$TapListener r0 = r3.length
                    android.content.Context r0 = r0.getContext()
                    r1 = 0
                    if (r0 == 0) goto L_0x0039
                    android.content.Context r0 = r0.getApplicationContext()
                    if (r0 == 0) goto L_0x0039
                    java.lang.String r2 = "input_method"
                    java.lang.Object r0 = r0.getSystemService(r2)
                    goto L_0x003a
                L_0x0039:
                    r0 = r1
                L_0x003a:
                    boolean r2 = r0 instanceof android.view.inputmethod.InputMethodManager
                    if (r2 != 0) goto L_0x003f
                    goto L_0x0040
                L_0x003f:
                    r1 = r0
                L_0x0040:
                    android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
                    if (r1 == 0) goto L_0x0052
                    o.TouchInterceptFrameLayout$TapListener r0 = r3.length
                    int r2 = o.resetInternal.setMax.target
                    android.view.View r0 = r0.setMin((int) r2)
                    id.dana.richview.CurrencyEditText r0 = (id.dana.richview.CurrencyEditText) r0
                    r2 = 1
                    r1.showSoftInput(r0, r2)
                L_0x0052:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.TouchInterceptFrameLayout.TapListener.setMin.run():void");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/savings/view/TopUpSavingDialogFragment$Companion;", "", "()V", "DEFAULT_AMOUNT_EDIT_TEXT", "", "DRAWABLE_RIGHT", "", "TAG", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMin {
            private getMin() {
            }

            public /* synthetic */ getMin(byte b) {
                this();
            }
        }

        public static final /* synthetic */ long setMax(String str) {
            String cleanAll = isOriginHasAppInfo.getCleanAll(str);
            Intrinsics.checkNotNullExpressionValue(cleanAll, "NumberUtils.getCleanAll(cleanInputtedAmount)");
            return Long.parseLong(cleanAll);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
            r0 = (r0 = r0.getMax).setMin;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final /* synthetic */ java.lang.String setMin(o.TouchInterceptFrameLayout.TapListener r0) {
            /*
                o.onSurfaceTextureUpdated r0 = r0.getMax
                if (r0 == 0) goto L_0x000c
                id.dana.nearbyme.merchantdetail.model.MoneyViewModel r0 = r0.getMax
                if (r0 == 0) goto L_0x000c
                java.lang.String r0 = r0.setMin
                if (r0 != 0) goto L_0x000e
            L_0x000c:
                java.lang.String r0 = "0"
            L_0x000e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.TouchInterceptFrameLayout.TapListener.setMin(o.TouchInterceptFrameLayout$TapListener):java.lang.String");
        }

        public static final /* synthetic */ void length(TapListener tapListener, String str) {
            int i;
            CurrencyEditText currencyEditText = (CurrencyEditText) tapListener.setMin(resetInternal.setMax.target);
            if (str.length() > 0) {
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                } else if (!str.contentEquals(r0)) {
                    i = R.drawable.ic_close_filled_grey;
                    currencyEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
                }
            }
            i = 0;
            currencyEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
        }

        public static final /* synthetic */ void length(TapListener tapListener, int i) {
            DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) tapListener.setMin(resetInternal.setMax.postMessage);
            if (danaButtonPrimaryView != null) {
                danaButtonPrimaryView.setDanaButtonView(i, tapListener.getString(R.string.top_up), "", (Drawable) null);
            }
        }

        public static final /* synthetic */ void length(TapListener tapListener) {
            TextView textView = (TextView) tapListener.setMin(resetInternal.setMax.tv_warning_note);
            if (textView != null) {
                textView.setText(tapListener.getString(R.string.top_up_dialog_error));
            }
            tapListener.equals();
        }

        public static final /* synthetic */ void getMax(TapListener tapListener) {
            setMax setmax = tapListener.getMin;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topUpListener");
            }
            CurrencyEditText currencyEditText = (CurrencyEditText) tapListener.setMin(resetInternal.setMax.target);
            Intrinsics.checkNotNullExpressionValue(currencyEditText, "et_amount");
            String amount = currencyEditText.getAmount();
            Intrinsics.checkNotNullExpressionValue(amount, "et_amount.amount");
            setmax.setMin(amount);
            DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) tapListener.setMin(resetInternal.setMax.postMessage);
            if (danaButtonPrimaryView != null) {
                danaButtonPrimaryView.setEnabled(false);
            }
        }

        public static final /* synthetic */ void toIntRange(TapListener tapListener) {
            CurrencyEditText currencyEditText = (CurrencyEditText) tapListener.setMin(resetInternal.setMax.target);
            if (currencyEditText != null) {
                currencyEditText.setInputType(2);
            }
            CurrencyEditText currencyEditText2 = (CurrencyEditText) tapListener.setMin(resetInternal.setMax.target);
            if (currencyEditText2 != null) {
                currencyEditText2.setTransformationMethod((TransformationMethod) null);
            }
            CurrencyEditText currencyEditText3 = (CurrencyEditText) tapListener.setMin(resetInternal.setMax.target);
            if (currencyEditText3 != null) {
                TextViewCompat.setMax((TextView) currencyEditText3, (int) R.style.f82552131952382);
            }
        }

        public final /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            HashMap hashMap = this.toFloatRange;
            if (hashMap != null) {
                hashMap.clear();
            }
        }
    }

    public final void setMin() {
        super.setMin();
        setMin(setMin(getDialog()), 3);
    }

    public final void setMax() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.setMax();
        for (int i = 1; i <= 31; i++) {
            this.isInside[i] = new RadioButton(getContext());
            ((GridLayout) getMin(resetInternal.setMax.StringRes)).addView(this.isInside[i]);
            RadioButton radioButton = this.isInside[i];
            if (radioButton != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    marginLayoutParams = new GridLayout.LayoutParams(GridLayout.spec(Integer.MIN_VALUE, GridLayout.FILL, 1.0f), GridLayout.spec(Integer.MIN_VALUE, GridLayout.FILL, 1.0f));
                } else {
                    marginLayoutParams = new GridLayout.LayoutParams(androidx.gridlayout.widget.GridLayout.spec(Integer.MIN_VALUE, androidx.gridlayout.widget.GridLayout.FILL, 1.0f), androidx.gridlayout.widget.GridLayout.spec(Integer.MIN_VALUE, androidx.gridlayout.widget.GridLayout.FILL, 1.0f));
                }
                Context context = radioButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
                int i2 = resources.getDisplayMetrics().widthPixels;
                marginLayoutParams.setMargins(14, 14, 14, 14);
                marginLayoutParams.height = (i2 / 7) - 42;
                marginLayoutParams.width = 0;
                radioButton.setLayoutParams(marginLayoutParams);
                radioButton.setGravity(17);
                radioButton.setButtonDrawable(17170445);
                radioButton.setBackgroundResource(R.drawable.radio_month_selector);
                radioButton.setText(String.valueOf(i));
                radioButton.setChecked(false);
                if (Build.VERSION.SDK_INT < 23) {
                    radioButton.setTextAppearance(radioButton.getContext(), R.style.f78132131951869);
                } else {
                    radioButton.setTextAppearance(R.style.f78132131951869);
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    radioButton.setTextColor(radioButton.getResources().getColorStateList(R.color.f24262131100370, (Resources.Theme) null));
                } else {
                    radioButton.setTextColor(cancelAll.setMin(radioButton.getContext(), R.color.f24262131100370));
                }
            }
        }
        RadioButton radioButton2 = this.isInside[this.getMin];
        if (radioButton2 != null) {
            radioButton2.setChecked(true);
        }
        equals();
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) getMin(resetInternal.setMax.newSessionWithExtras);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new getMax(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ TouchInterceptFrameLayout getMin;
        final /* synthetic */ int setMax;

        setMax(TouchInterceptFrameLayout touchInterceptFrameLayout, int i) {
            this.getMin = touchInterceptFrameLayout;
            this.setMax = i;
        }

        public final void onClick(View view) {
            RadioButton radioButton;
            this.getMin.getMin = this.setMax;
            for (int i = 1; i <= 31; i++) {
                if (!(i == this.setMax || (radioButton = this.getMin.isInside[i]) == null)) {
                    radioButton.setChecked(false);
                }
            }
        }
    }

    private final void equals() {
        for (int i = 1; i <= 31; i++) {
            RadioButton radioButton = this.isInside[i];
            if (radioButton != null) {
                radioButton.setOnClickListener(new setMax(this, i));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ TouchInterceptFrameLayout getMin;

        getMax(TouchInterceptFrameLayout touchInterceptFrameLayout) {
            this.getMin = touchInterceptFrameLayout;
        }

        public final void onClick(View view) {
            getMin getmin = this.getMin.getMax;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("monthlyAutoTopUpListener");
            }
            getmin.getMin(this.getMin.getMin);
            this.getMin.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/savings/view/MonthlyAutoTopUpBottomSheet$Companion;", "", "()V", "FIRST_DATE", "", "LAST_DATE", "TAG", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.IsOverlapping;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
