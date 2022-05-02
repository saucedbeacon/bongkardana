package o;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import id.dana.R;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0014J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lid/dana/savings/view/WeeklyAutoTopUpBottomSheet;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "()V", "selectedDay", "", "getSelectedDay", "()I", "setSelectedDay", "(I)V", "weeklyAutoTopUpListener", "Lid/dana/savings/view/WeeklyAutoTopUpBottomSheet$WeeklyAutoTopUpListener;", "getWeeklyAutoTopUpListener", "()Lid/dana/savings/view/WeeklyAutoTopUpBottomSheet$WeeklyAutoTopUpListener;", "setWeeklyAutoTopUpListener", "(Lid/dana/savings/view/WeeklyAutoTopUpBottomSheet$WeeklyAutoTopUpListener;)V", "getBottomSheet", "Landroid/widget/FrameLayout;", "getDimAmount", "", "getLayout", "init", "", "initSelectedOption", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onShow", "onStart", "setButtonListener", "setRadioButtonListener", "Companion", "WeeklyAutoTopUpListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class APImageFormat extends order {
    @NotNull
    public static final getMax equals = new getMax((byte) 0);
    public int getMax = -1;
    public getMin getMin;
    private HashMap toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/savings/view/WeeklyAutoTopUpBottomSheet$WeeklyAutoTopUpListener;", "", "onClickSelect", "", "day", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin {
        void setMax(int i);
    }

    private View getMax(int i) {
        if (this.toIntRange == null) {
            this.toIntRange = new HashMap();
        }
        View view = (View) this.toIntRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toIntRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getMin() {
        return R.layout.view_weekly_auto_topup_container;
    }

    public final float length() {
        return 0.5f;
    }

    @Nullable
    public final FrameLayout getMax() {
        return (FrameLayout) getMax(resetInternal.setMax.RequiresOptIn$Level);
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

    public final void setMin() {
        super.setMin();
        setMin(setMin(getDialog()), 3);
    }

    public final void setMax() {
        super.setMax();
        switch (this.getMax) {
            case 1:
                RadioButton radioButton = (RadioButton) getMax(resetInternal.setMax.onNestedPreScroll);
                Intrinsics.checkNotNullExpressionValue(radioButton, "rbSunday");
                radioButton.setChecked(true);
                break;
            case 2:
                RadioButton radioButton2 = (RadioButton) getMax(resetInternal.setMax.checkLayoutParams);
                Intrinsics.checkNotNullExpressionValue(radioButton2, "rbMonday");
                radioButton2.setChecked(true);
                break;
            case 3:
                RadioButton radioButton3 = (RadioButton) getMax(resetInternal.setMax.onNestedFling);
                Intrinsics.checkNotNullExpressionValue(radioButton3, "rbTuesday");
                radioButton3.setChecked(true);
                break;
            case 4:
                RadioButton radioButton4 = (RadioButton) getMax(resetInternal.setMax.onNestedPreFling);
                Intrinsics.checkNotNullExpressionValue(radioButton4, "rbWednesday");
                radioButton4.setChecked(true);
                break;
            case 5:
                RadioButton radioButton5 = (RadioButton) getMax(resetInternal.setMax.pullChildren);
                Intrinsics.checkNotNullExpressionValue(radioButton5, "rbThursday");
                radioButton5.setChecked(true);
                break;
            case 6:
                RadioButton radioButton6 = (RadioButton) getMax(resetInternal.setMax.onNestedScrollAccepted);
                Intrinsics.checkNotNullExpressionValue(radioButton6, "rbFriday");
                radioButton6.setChecked(true);
                break;
            case 7:
                RadioButton radioButton7 = (RadioButton) getMax(resetInternal.setMax.getNestedScrollAxes);
                Intrinsics.checkNotNullExpressionValue(radioButton7, "rbSaturday");
                radioButton7.setChecked(true);
                break;
        }
        RadioGroup radioGroup = (RadioGroup) getMax(resetInternal.setMax.ActionMenuView);
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(new setMin(this));
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) getMax(resetInternal.setMax.newSessionWithExtras);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new length(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/RadioGroup;", "kotlin.jvm.PlatformType", "checkedId", "", "onCheckedChanged"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements RadioGroup.OnCheckedChangeListener {
        final /* synthetic */ APImageFormat length;

        setMin(APImageFormat aPImageFormat) {
            this.length = aPImageFormat;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            switch (i) {
                case R.id.f57362131364314:
                    this.length.getMax = 6;
                    return;
                case R.id.f57372131364315:
                    this.length.getMax = 2;
                    return;
                case R.id.f57382131364316:
                    this.length.getMax = 7;
                    return;
                case R.id.f57392131364317:
                    this.length.getMax = 1;
                    return;
                case R.id.f57402131364318:
                    this.length.getMax = 5;
                    return;
                case R.id.f57412131364319:
                    this.length.getMax = 3;
                    return;
                case R.id.f57422131364320:
                    this.length.getMax = 4;
                    return;
                default:
                    return;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ APImageFormat getMin;

        length(APImageFormat aPImageFormat) {
            this.getMin = aPImageFormat;
        }

        public final void onClick(View view) {
            getMin getmin = this.getMin.getMin;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("weeklyAutoTopUpListener");
            }
            getmin.setMax(this.getMin.getMax);
            this.getMin.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/savings/view/WeeklyAutoTopUpBottomSheet$Companion;", "", "()V", "TAG", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
