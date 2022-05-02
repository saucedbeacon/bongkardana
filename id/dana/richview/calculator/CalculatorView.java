package id.dana.richview.calculator;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.richview.calculator.adapter.CalculatorAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import o.notifyProcessPictureError;
import o.resetInternal;
import o.setupPictureParams;
import o.takePicture;

public class CalculatorView extends BaseRichView implements takePicture {
    @Inject
    CalculatorAdapter calculatorAdapter;
    private boolean getMax = true;
    private int getMin;
    @BindView(2131364499)
    RecyclerView rvCalculator;
    @BindView(2131366005)
    View separator;
    private setupPictureParams setMax;
    private Context setMin;
    @BindView(2131365295)
    TextView tvHintOperandLeft;
    @BindView(2131365296)
    TextView tvHintOperandRight;
    @BindView(2131365297)
    TextView tvHintOperator;

    public int getLayout() {
        return R.layout.view_calculator;
    }

    public CalculatorView(@NonNull Context context) {
        super(context);
    }

    public CalculatorView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CalculatorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CalculatorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void init(Context context, AttributeSet attributeSet) {
        this.setMin = context;
        super.init(context, attributeSet);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, resetInternal.getMin.extraCallback);
            try {
                this.getMin = obtainStyledAttributes.getInt(0, 11);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setup() {
        int i = (!(this.setMin instanceof Activity) || !length()) ? R.dimen.f26512131165319 : R.dimen.f26522131165320;
        this.rvCalculator.setPadding(0, (int) getContext().getResources().getDimension(i), 0, 0);
        this.calculatorAdapter = new CalculatorAdapter(this, i);
        this.rvCalculator.setLayoutManager(new LinearLayoutManager(getContext()));
        this.rvCalculator.setAdapter(this.calculatorAdapter);
        CalculatorAdapter calculatorAdapter2 = this.calculatorAdapter;
        ArrayList arrayList = new ArrayList();
        List<String> asList = Arrays.asList(new String[]{"7", PrepareException.ERROR_AUTH_FAIL, "9"});
        notifyProcessPictureError notifyprocesspictureerror = new notifyProcessPictureError();
        notifyprocesspictureerror.getMin = asList;
        notifyprocesspictureerror.length = OperandType.PLUS;
        arrayList.add(notifyprocesspictureerror);
        List<String> asList2 = Arrays.asList(new String[]{"4", "5", "6"});
        notifyProcessPictureError notifyprocesspictureerror2 = new notifyProcessPictureError();
        notifyprocesspictureerror2.getMin = asList2;
        notifyprocesspictureerror2.length = OperandType.MINUS;
        arrayList.add(notifyprocesspictureerror2);
        List<String> asList3 = Arrays.asList(new String[]{"1", "2", "3"});
        notifyProcessPictureError notifyprocesspictureerror3 = new notifyProcessPictureError();
        notifyprocesspictureerror3.getMin = asList3;
        notifyprocesspictureerror3.length = OperandType.MULTIPLIER;
        arrayList.add(notifyprocesspictureerror3);
        List<String> asList4 = Arrays.asList(new String[]{"0", "000", "99"});
        notifyProcessPictureError notifyprocesspictureerror4 = new notifyProcessPictureError();
        notifyprocesspictureerror4.getMin = asList4;
        notifyprocesspictureerror4.length = OperandType.DIVIDER;
        arrayList.add(notifyprocesspictureerror4);
        calculatorAdapter2.getMin(arrayList);
        this.tvHintOperandLeft.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.getMin)});
        this.tvHintOperandRight.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.getMin)});
    }

    public void setSeparatorVisibility(boolean z) {
        this.separator.setVisibility(z ? 0 : 8);
    }

    private boolean length() {
        ((Activity) this.setMin).getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        if (((double) getResources().getDisplayMetrics().density) > 4.0d) {
            return false;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) this.setMin).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        double d = (double) i;
        double d2 = (double) displayMetrics.xdpi;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) i2;
        double d5 = (double) displayMetrics.ydpi;
        Double.isNaN(d4);
        Double.isNaN(d5);
        return Math.sqrt(Math.pow(d3, 2.0d) + Math.pow(d4 / d5, 2.0d)) < 5.5d;
    }

    public void enableCalculator(boolean z) {
        this.getMax = z;
    }

    public void onPadClicked(String str) {
        if (this.getMax && setMax(str)) {
            if (setMax()) {
                String length = length(this.tvHintOperandLeft, str);
                this.tvHintOperandLeft.setText(length);
                this.setMax.length(length);
            } else if (!getMax() && toFloatRange(str)) {
                TextView textView = this.tvHintOperandRight;
                textView.setText(length(textView, str));
                this.setMax.length(getMin());
            }
        }
    }

    public void onOperatorClicked(String str) {
        if (this.getMax) {
            if (!getMax() && setMin()) {
                this.tvHintOperator.setText(getMax(str));
            } else if (!setMin()) {
                String min = getMin();
                this.tvHintOperandLeft.setText(min);
                this.tvHintOperator.setText(getMax(str));
                this.tvHintOperandRight.setText("");
                this.setMax.length(min);
            }
        }
    }

    public void onClearByCharacter() {
        if (this.getMax) {
            if (setMax()) {
                String charSequence = this.tvHintOperandLeft.getText().toString();
                if (!TextUtils.isEmpty(charSequence)) {
                    charSequence = charSequence.substring(0, charSequence.length() - 1);
                }
                this.tvHintOperandLeft.setText(charSequence);
                this.setMax.length(charSequence);
            } else if (!setMax() && setMin()) {
                this.tvHintOperator.setText("");
            } else if (!setMin()) {
                String charSequence2 = this.tvHintOperandRight.getText().toString();
                if (!TextUtils.isEmpty(charSequence2)) {
                    charSequence2 = charSequence2.substring(0, charSequence2.length() - 1);
                }
                this.tvHintOperandRight.setText(charSequence2);
                this.setMax.length(getMin());
            }
        }
    }

    public void onClearAll() {
        if (this.getMax) {
            this.tvHintOperandLeft.setText("");
            this.tvHintOperator.setText("");
            this.tvHintOperandRight.setText("");
            this.setMax.length("0");
        }
    }

    private boolean setMax() {
        return TextUtils.isEmpty(this.tvHintOperator.getText().toString());
    }

    private boolean getMax() {
        return TextUtils.isEmpty(this.tvHintOperandLeft.getText().toString());
    }

    private boolean setMin() {
        return TextUtils.isEmpty(this.tvHintOperandRight.getText().toString());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1902665991: goto L_0x0029;
                case 2459034: goto L_0x001f;
                case 73363536: goto L_0x0015;
                case 1750165953: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "MULTIPLIER"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 3
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "MINUS"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "PLUS"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 0
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "DIVIDER"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 2
            goto L_0x0034
        L_0x0033:
            r4 = -1
        L_0x0034:
            if (r4 == 0) goto L_0x0048
            if (r4 == r3) goto L_0x0045
            if (r4 == r2) goto L_0x0042
            if (r4 == r1) goto L_0x003f
            java.lang.String r4 = ""
            return r4
        L_0x003f:
            java.lang.String r4 = "×"
            return r4
        L_0x0042:
            java.lang.String r4 = "÷"
            return r4
        L_0x0045:
            java.lang.String r4 = "−"
            return r4
        L_0x0048:
            java.lang.String r4 = "+"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.richview.calculator.CalculatorView.getMax(java.lang.String):java.lang.String");
    }

    private static long setMin(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0055 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 43
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x0036
            r1 = 215(0xd7, float:3.01E-43)
            if (r0 == r1) goto L_0x002c
            r1 = 247(0xf7, float:3.46E-43)
            if (r0 == r1) goto L_0x0022
            r1 = 8722(0x2212, float:1.2222E-41)
            if (r0 == r1) goto L_0x0018
            goto L_0x0040
        L_0x0018:
            java.lang.String r0 = "−"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0040
            r5 = 1
            goto L_0x0041
        L_0x0022:
            java.lang.String r0 = "÷"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0040
            r5 = 2
            goto L_0x0041
        L_0x002c:
            java.lang.String r0 = "×"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0040
            r5 = 3
            goto L_0x0041
        L_0x0036:
            java.lang.String r0 = "+"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0040
            r5 = 0
            goto L_0x0041
        L_0x0040:
            r5 = -1
        L_0x0041:
            if (r5 == 0) goto L_0x0055
            if (r5 == r4) goto L_0x0052
            if (r5 == r3) goto L_0x004f
            if (r5 == r2) goto L_0x004c
            java.lang.String r5 = ""
            return r5
        L_0x004c:
            java.lang.String r5 = "MULTIPLIER"
            return r5
        L_0x004f:
            java.lang.String r5 = "DIVIDER"
            return r5
        L_0x0052:
            java.lang.String r5 = "MINUS"
            return r5
        L_0x0055:
            java.lang.String r5 = "PLUS"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.richview.calculator.CalculatorView.getMin(java.lang.String):java.lang.String");
    }

    private boolean setMax(String str) {
        if (!length(str) || !getMax()) {
            return true;
        }
        return false;
    }

    private static boolean length(String str) {
        return setMin(str) == 0;
    }

    private static String length(TextView textView, String str) {
        String charSequence = textView.getText().toString();
        if (TextUtils.isEmpty(charSequence)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        sb.append(str);
        return sb.toString();
    }

    private boolean toFloatRange(String str) {
        return !setMin() || !length(str);
    }

    public void setCalculatorResultListener(setupPictureParams setuppictureparams) {
        this.setMax = setuppictureparams;
    }

    private String getMin() {
        return String.valueOf(Calculator.getMax(getMin(this.tvHintOperator.getText().toString())).apply(setMin(this.tvHintOperandLeft.getText().toString()), setMin(this.tvHintOperandRight.getText().toString())));
    }
}
