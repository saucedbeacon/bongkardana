package id.dana.component.cellcomponent;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import id.dana.component.BaseRichView;
import o.getProgressViewEndOffset;
import o.setBackgroundColorRes;
import o.setEnabled;

public class DanaStepperView extends BaseRichView {
    LinearLayout btnMinus;
    LinearLayout btnPlus;
    private int setMax = 0;
    TextView textCounter;

    public DanaStepperView(@NonNull Context context) {
        super(context);
    }

    public DanaStepperView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DanaStepperView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int getLayout() {
        return setBackgroundColorRes.toIntRange.view_dana_stepper;
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"SetTextI18n"})
    public void plusCounter() {
        int i = this.setMax + 1;
        this.setMax = i;
        this.textCounter.setText(Integer.toString(i));
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"SetTextI18n"})
    public void minusCounter() {
        int i = this.setMax - 1;
        this.setMax = i;
        this.textCounter.setText(Integer.toString(i));
    }

    public void setup() {
        this.btnMinus = (LinearLayout) getRootView().findViewById(setBackgroundColorRes.length.asInterface);
        this.btnPlus = (LinearLayout) getRootView().findViewById(setBackgroundColorRes.length.ICustomTabsCallback$Default);
        this.textCounter = (TextView) getRootView().findViewById(setBackgroundColorRes.length.receiveFile);
        this.btnPlus.setOnClickListener(new setEnabled(this));
        this.btnMinus.setOnClickListener(new getProgressViewEndOffset(this));
    }
}
