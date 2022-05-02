package com.alibaba.griver.ui.titlebar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.alibaba.ariver.kernel.common.utils.DimensionUtil;
import com.alibaba.griver.ui.R;

public class H5SegmentGroup extends RadioGroup {

    /* renamed from: a  reason: collision with root package name */
    private int f10628a;
    private int b;
    private int c;
    private LayoutSelector d;
    private float e;
    /* access modifiers changed from: private */
    public OnItemCheckedChangeListener f;
    /* access modifiers changed from: private */
    public int g;
    /* access modifiers changed from: private */
    public int h;
    private RadioGroup.OnCheckedChangeListener i;

    public interface OnItemCheckedChangeListener {
        void onCheckedChanged(RadioGroup radioGroup, int i);
    }

    public H5SegmentGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    public H5SegmentGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -65536;
        this.c = -16711936;
        this.g = -1;
        this.h = -1;
        this.f10628a = (int) getResources().getDimension(R.dimen.griver_nav_segment_stroke_border);
        float dimension = getResources().getDimension(R.dimen.griver_nav_segment_conner_radius);
        this.e = dimension;
        this.d = new LayoutSelector(dimension);
        AnonymousClass1 r1 = new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (H5SegmentGroup.this.f != null) {
                    RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
                    if (H5SegmentGroup.this.g == -1) {
                        H5SegmentGroup.this.clearCheck(false);
                    } else {
                        H5SegmentGroup h5SegmentGroup = H5SegmentGroup.this;
                        h5SegmentGroup.checked(h5SegmentGroup.g, false);
                    }
                    int unused = H5SegmentGroup.this.h = i;
                    H5SegmentGroup.this.f.onCheckedChanged(radioGroup, radioGroup.indexOfChild(radioButton));
                }
            }
        };
        this.i = r1;
        setOnCheckedChangeListener(r1);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        a();
    }

    public void setSegmentColor(int i2, int i3) {
        this.b = i3;
        this.c = i2;
    }

    public void addItems(String[] strArr, Integer[] numArr) {
        TypedArray obtainTypedArray = getResources().obtainTypedArray(R.array.griverSegmentItemArray);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            int dip2px = DimensionUtil.dip2px(getContext(), (float) numArr[i2].intValue());
            RadioButton radioButton = new RadioButton(getContext());
            radioButton.setButtonDrawable((Drawable) null);
            radioButton.setGravity(17);
            radioButton.setText(strArr[i2]);
            radioButton.setEllipsize(TextUtils.TruncateAt.END);
            radioButton.setMaxLines(1);
            radioButton.setPadding(0, 0, 0, 0);
            radioButton.setTextSize(2, 16.0f);
            radioButton.setId(obtainTypedArray.getResourceId(i2, 0));
            addView(radioButton, new RadioGroup.LayoutParams(dip2px, -1));
        }
        a();
    }

    private void a() {
        int childCount = super.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            a(childAt);
            if (i2 != childCount - 1) {
                RadioGroup.LayoutParams layoutParams = (RadioGroup.LayoutParams) childAt.getLayoutParams();
                RadioGroup.LayoutParams layoutParams2 = new RadioGroup.LayoutParams(layoutParams.width, layoutParams.height, layoutParams.weight);
                if (getOrientation() == 0) {
                    layoutParams2.setMargins(0, 0, -this.f10628a, 0);
                } else {
                    layoutParams2.setMargins(0, 0, 0, -this.f10628a);
                }
                childAt.setLayoutParams(layoutParams2);
                i2++;
            } else {
                return;
            }
        }
    }

    public void clearCheck(boolean z) {
        if (z) {
            clearCheck();
            return;
        }
        setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        clearCheck();
        setOnCheckedChangeListener(this.i);
    }

    public void checked(int i2, boolean z) {
        if (z) {
            check(i2);
            return;
        }
        setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        check(i2);
        setOnCheckedChangeListener(this.i);
    }

    public void setDefaultChecked(int i2) {
        RadioButton radioButton = (RadioButton) getChildAt(i2);
        if (radioButton != null) {
            int id2 = radioButton.getId();
            this.g = id2;
            checked(id2, false);
        }
    }

    private void a(View view) {
        Drawable drawable;
        Drawable drawable2;
        int checked = this.d.getChecked();
        int unChecked = this.d.getUnChecked();
        ((Button) view).setTextColor(new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{this.b, this.c}));
        if (Build.VERSION.SDK_INT > 21) {
            drawable2 = getResources().getDrawable(checked, (Resources.Theme) null).mutate();
            drawable = getResources().getDrawable(unChecked, (Resources.Theme) null).mutate();
        } else {
            drawable2 = getResources().getDrawable(checked).mutate();
            drawable = getResources().getDrawable(unChecked).mutate();
        }
        GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
        gradientDrawable.setColor(this.b);
        gradientDrawable.setStroke(this.f10628a, this.c);
        gradientDrawable.setCornerRadii(this.d.getChildRadii(view));
        GradientDrawable gradientDrawable2 = (GradientDrawable) drawable;
        gradientDrawable2.setColor(this.c);
        gradientDrawable2.setStroke(this.f10628a, this.c);
        gradientDrawable2.setCornerRadii(this.d.getChildRadii(view));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, drawable2);
        stateListDrawable.addState(new int[]{-16842912}, drawable);
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(stateListDrawable);
        } else {
            view.setBackgroundDrawable(stateListDrawable);
        }
    }

    public void performLastItemChecked(boolean z) {
        if (z) {
            int i2 = this.g;
            if (i2 != -1) {
                checked(i2, false);
                return;
            }
            return;
        }
        checked(this.h, false);
        this.g = this.h;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setEnabled(z);
        }
    }

    public void setItemChangeListener(OnItemCheckedChangeListener onItemCheckedChangeListener) {
        this.f = onItemCheckedChangeListener;
    }

    class LayoutSelector {

        /* renamed from: a  reason: collision with root package name */
        private final int f10629a = R.drawable.griver_ui_nav_segment_item_checked;
        private final int b = R.drawable.griver_ui_nav_segment_item_unchecked;
        private final float c;
        private final float[] d;
        private final float[] e;
        private final float[] f;
        private final float[] g;
        private int h;
        private int i;
        private float j;
        private float[] k;

        public LayoutSelector(float f2) {
            float applyDimension = TypedValue.applyDimension(1, 0.1f, H5SegmentGroup.this.getResources().getDisplayMetrics());
            this.c = applyDimension;
            this.h = -1;
            this.i = -1;
            this.j = f2;
            this.d = new float[]{f2, f2, applyDimension, applyDimension, applyDimension, applyDimension, f2, f2};
            this.e = new float[]{applyDimension, applyDimension, f2, f2, f2, f2, applyDimension, applyDimension};
            this.f = new float[]{applyDimension, applyDimension, applyDimension, applyDimension, applyDimension, applyDimension, applyDimension, applyDimension};
            this.g = new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
        }

        private int a() {
            return H5SegmentGroup.this.getChildCount();
        }

        private int a(View view) {
            return H5SegmentGroup.this.indexOfChild(view);
        }

        private void a(int i2, int i3) {
            if (this.h != i2 || this.i != i3) {
                this.h = i2;
                this.i = i3;
                if (i2 == 1) {
                    this.k = this.g;
                } else if (i3 == 0) {
                    this.k = this.d;
                } else if (i3 == i2 - 1) {
                    this.k = this.e;
                } else {
                    this.k = this.f;
                }
            }
        }

        public int getChecked() {
            return this.f10629a;
        }

        public int getUnChecked() {
            return this.b;
        }

        public float[] getChildRadii(View view) {
            a(a(), a(view));
            return this.k;
        }
    }
}
