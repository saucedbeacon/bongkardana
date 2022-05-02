package com.alipay.androidinter.app.safepaybase.alikeyboard;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.alipay.mobile.verifyidentity.uitools.R;
import com.j256.ormlite.stmt.query.SimpleComparison;
import id.dana.data.constant.BranchLinkConstant;

public class QwertyKeyboard extends AbstractKeyboard implements View.OnTouchListener {
    private final String[] QWERT_123_SHIFT_DOWN_ROW_0 = {"1", "2", "3", "4", "5", "6", "7", PrepareException.ERROR_AUTH_FAIL, "9", "0"};
    private final String[] QWERT_123_SHIFT_DOWN_ROW_1 = {SimpleComparison.LESS_THAN_OPERATION, SimpleComparison.GREATER_THAN_OPERATION, "+", SimpleComparison.EQUAL_TO_OPERATION, "÷", "^", "`", "[", "]"};
    private final String[] QWERT_123_SHIFT_DOWN_ROW_2 = {"\\", "|", "\"", "$", "￥", "{", "}"};
    private final String[] QWERT_123_SHIFT_UP_ROW_0 = {"1", "2", "3", "4", "5", "6", "7", PrepareException.ERROR_AUTH_FAIL, "9", "0"};
    private final String[] QWERT_123_SHIFT_UP_ROW_1 = {"~", "!", AUScreenAdaptTool.PREFIX_ID, "#", "%", "'", "&", "*", "?"};
    private final String[] QWERT_123_SHIFT_UP_ROW_2 = {"(", ")", "-", "_", ":", ";", "/"};
    private final String[] QWERT_ABC_SHIFT_DOWN_ROW_0 = {"Q", "W", "E", "R", DiskFormatter.TB, "Y", "U", "I", "O", "P"};
    private final String[] QWERT_ABC_SHIFT_DOWN_ROW_1 = {"A", "S", "D", "F", DiskFormatter.GB, "H", "J", DiskFormatter.KB, "L"};
    private final String[] QWERT_ABC_SHIFT_DOWN_ROW_2 = {"Z", "X", "C", "V", DiskFormatter.B, "N", DiskFormatter.MB};
    private final String[] QWERT_ABC_SHIFT_UP_ROW_0 = {"q", "w", "e", BranchLinkConstant.PayloadKey.REFERRAL, SecurityConstants.KEY_TEXT, "y", "u", "i", "o", "p"};
    private final String[] QWERT_ABC_SHIFT_UP_ROW_1 = {"a", "s", "d", "f", "g", "h", "j", "k", "l"};
    private final String[] QWERT_ABC_SHIFT_UP_ROW_2 = {"z", "x", "c", SecurityConstants.KEY_VALUE, "b", "n", "m"};
    private FrameLayout cashierContainer;
    private FrameLayout ib_shift;
    private TextView inputTips;
    private QwertType qwertType = QwertType.abc;
    private double screen_density = 0.0d;
    private ShiftType shiftType = ShiftType.up;
    private float textSize = 0.0f;
    private TextView[] tv_row1 = new TextView[10];
    private TextView[] tv_row2 = new TextView[9];
    private TextView[] tv_row3 = new TextView[7];
    private TextView tv_type;
    private int width = 0;

    public enum QwertType {
        abc,
        num
    }

    public enum ShiftType {
        up,
        down
    }

    public QwertyKeyboard(Context context, FrameLayout frameLayout, OnKeyboardListener onKeyboardListener) {
        this.onKeyboardListener = onKeyboardListener;
        this.keyboardView = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.keyboard_qwerty, (ViewGroup) null, false);
        this.cashierContainer = frameLayout;
        initialize(context);
        initializeTips(context);
    }

    private void initializeTips(Context context) {
        double d = (double) context.getResources().getDisplayMetrics().density;
        this.inputTips = new TextView(context);
        Double.isNaN(d);
        Double.isNaN(d);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams((int) (65.0d * d), (int) (78.0d * d));
        layoutParams.gravity = 51;
        layoutParams.height = -2;
        int i = this.width;
        Double.isNaN(d);
        layoutParams.width = (i - ((int) (d * 9.0d))) * 2;
        this.inputTips.setTextSize(1, 35.0f);
        this.inputTips.setLayoutParams(layoutParams);
        this.inputTips.setTextColor(-16777216);
        this.inputTips.setBackgroundResource(R.drawable.keyborad_show);
        this.inputTips.setGravity(17);
        this.inputTips.setVisibility(4);
        FrameLayout frameLayout = this.cashierContainer;
        if (frameLayout != null) {
            frameLayout.addView(this.inputTips);
        }
    }

    @TargetApi(14)
    private void initialize(Context context) {
        int childCount = this.keyboardView.getChildCount();
        this.screen_density = (double) context.getResources().getDisplayMetrics().density;
        int i = context.getResources().getDisplayMetrics().heightPixels;
        int i2 = context.getResources().getDisplayMetrics().widthPixels;
        if (i2 <= i) {
            i = i2;
        }
        double d = (double) i;
        double d2 = this.screen_density;
        Double.isNaN(d);
        int i3 = ((int) (d - ((d2 * 1.5d) * 2.0d))) / 10;
        this.width = i3;
        double d3 = (double) i3;
        Double.isNaN(d3);
        int i4 = (int) (((d3 - ((d2 * 4.5d) * 2.0d)) * 1.45d) + (7.0d * d2 * 2.0d));
        double d4 = (double) (i - (i3 * 7));
        Double.isNaN(d4);
        int i5 = 2;
        int i6 = ((int) ((d4 - ((1.5d * d2) * 2.0d)) - ((d2 * 4.5d) * 4.0d))) / 2;
        int i7 = i3 * 4;
        int i8 = i3 + i6;
        double d5 = (double) i3;
        Double.isNaN(d5);
        this.textSize = (float) (d5 * 0.65d);
        int i9 = 0;
        while (i9 < childCount) {
            LinearLayout linearLayout = (LinearLayout) this.keyboardView.getChildAt(i9);
            if (linearLayout != null) {
                ((LinearLayout.LayoutParams) linearLayout.getLayoutParams()).height = i4;
                int childCount2 = linearLayout.getChildCount();
                if (i9 == 0) {
                    this.tv_row1 = new TextView[childCount2];
                    for (int i10 = 0; i10 < childCount2; i10++) {
                        FrameLayout frameLayout = (FrameLayout) linearLayout.getChildAt(i10);
                        TextView textView = (TextView) frameLayout.getChildAt(0);
                        textView.setTextSize(0, this.textSize);
                        textView.setAccessibilityDelegate(new SecureAccessbilityDelegate());
                        frameLayout.setOnTouchListener(this);
                        this.tv_row1[i10] = textView;
                    }
                } else if (i9 == 1) {
                    this.tv_row2 = new TextView[childCount2];
                    for (int i11 = 0; i11 < childCount2; i11++) {
                        FrameLayout frameLayout2 = (FrameLayout) linearLayout.getChildAt(i11);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout2.getLayoutParams();
                        layoutParams.width = this.width;
                        layoutParams.weight = 0.0f;
                        TextView textView2 = (TextView) frameLayout2.getChildAt(0);
                        textView2.setTextSize(0, this.textSize);
                        textView2.setAccessibilityDelegate(new SecureAccessbilityDelegate());
                        frameLayout2.setOnTouchListener(this);
                        this.tv_row2[i11] = textView2;
                    }
                } else if (i9 == i5) {
                    this.tv_row3 = new TextView[(childCount2 - 2)];
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        FrameLayout frameLayout3 = (FrameLayout) linearLayout.getChildAt(i12);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) frameLayout3.getLayoutParams();
                        if (i12 == 0) {
                            layoutParams2.width = i6;
                            this.ib_shift = frameLayout3;
                        } else if (i12 == childCount2 - 1) {
                            layoutParams2.width = i6;
                        } else {
                            layoutParams2.width = this.width;
                            layoutParams2.weight = 0.0f;
                            TextView textView3 = (TextView) frameLayout3.getChildAt(0);
                            textView3.setTextSize(0, this.textSize);
                            textView3.setAccessibilityDelegate(new SecureAccessbilityDelegate());
                            this.tv_row3[i12 - 1] = textView3;
                            layoutParams2.width = this.width;
                        }
                        layoutParams2.weight = 0.0f;
                        frameLayout3.setOnTouchListener(this);
                    }
                } else {
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        View childAt = linearLayout.getChildAt(i13);
                        childAt.setAccessibilityDelegate(new SecureAccessbilityDelegate());
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                        if (i13 == 0) {
                            layoutParams3.width = i6;
                            TextView textView4 = (TextView) childAt;
                            this.tv_type = textView4;
                            textView4.setTextSize(0, this.textSize);
                        } else if (i13 == 1) {
                            layoutParams3.width = this.width;
                            ((TextView) ((FrameLayout) childAt).getChildAt(0)).setTextSize(0, this.textSize);
                        } else if (i13 == 2) {
                            layoutParams3.width = i7;
                            ((TextView) ((FrameLayout) childAt).getChildAt(0)).setTextSize(0, this.textSize);
                        } else if (i13 == 3) {
                            layoutParams3.width = this.width;
                            ((TextView) ((FrameLayout) childAt).getChildAt(0)).setTextSize(0, this.textSize);
                        } else {
                            layoutParams3.width = i8;
                            ((TextView) childAt).setTextSize(0, this.textSize);
                        }
                        layoutParams3.weight = 0.0f;
                        childAt.setOnTouchListener(this);
                    }
                }
            }
            i9++;
            i5 = 2;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            return onTouchDown(view);
        }
        if (motionEvent.getAction() == 1) {
            return onTouchUp(view);
        }
        return false;
    }

    private boolean onTouchUp(View view) {
        if (view.getId() == R.id.key_enter) {
            onOK();
        }
        this.inputTips.setVisibility(4);
        return false;
    }

    private boolean onTouchDown(View view) {
        int id2 = view.getId();
        if (id2 == R.id.key_del1) {
            onDel();
        } else if (id2 != R.id.key_enter) {
            if (id2 == R.id.key_space) {
                onInput(" ");
            } else if (id2 == R.id.key_ABC) {
                ShiftType shiftType2 = this.shiftType == ShiftType.up ? ShiftType.down : ShiftType.up;
                this.shiftType = shiftType2;
                switchKeyboard(this.qwertType, shiftType2);
            } else if (id2 == R.id.key_123) {
                this.qwertType = this.qwertType == QwertType.abc ? QwertType.num : QwertType.abc;
                ShiftType shiftType3 = ShiftType.up;
                this.shiftType = shiftType3;
                switchKeyboard(this.qwertType, shiftType3);
            } else {
                String charSequence = ((TextView) ((FrameLayout) view).getChildAt(0)).getText().toString();
                showInputTips(view, charSequence);
                onInput(charSequence);
            }
        }
        return false;
    }

    private void showInputTips(View view, String str) {
        if (this.cashierContainer != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.inputTips.getLayoutParams();
            Point relatePoint = getRelatePoint(this.cashierContainer, view);
            double d = this.screen_density;
            layoutParams.setMargins((relatePoint.x - (this.inputTips.getWidth() / 2)) + (view.getWidth() / 2), (((relatePoint.y - this.inputTips.getHeight()) + view.getHeight()) + ((int) (3.0d * d))) - ((int) (d * 9.0d)), 0, 0);
            this.inputTips.setLayoutParams(layoutParams);
            this.inputTips.setText(str);
            this.inputTips.setVisibility(0);
        }
    }

    private void switchKeyboard(QwertType qwertType2, ShiftType shiftType2) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        int i = 0;
        if (qwertType2 == QwertType.abc) {
            this.ib_shift.getChildAt(0).setVisibility(0);
            this.ib_shift.getChildAt(1).setVisibility(8);
            this.tv_type.setText("123");
            if (shiftType2 == ShiftType.up) {
                ((ImageView) this.ib_shift.getChildAt(0)).setImageResource(R.drawable.keyboard_key_shift_up);
                strArr2 = this.QWERT_ABC_SHIFT_UP_ROW_0;
                strArr = this.QWERT_ABC_SHIFT_UP_ROW_1;
                strArr3 = this.QWERT_ABC_SHIFT_UP_ROW_2;
            } else {
                ((ImageView) this.ib_shift.getChildAt(0)).setImageResource(R.drawable.keyboard_key_shift_down);
                strArr2 = this.QWERT_ABC_SHIFT_DOWN_ROW_0;
                strArr = this.QWERT_ABC_SHIFT_DOWN_ROW_1;
                strArr3 = this.QWERT_ABC_SHIFT_DOWN_ROW_2;
            }
        } else {
            this.ib_shift.getChildAt(0).setVisibility(8);
            this.ib_shift.getChildAt(1).setVisibility(0);
            if (this.ib_shift.getChildAt(1) instanceof TextView) {
                ((TextView) this.ib_shift.getChildAt(1)).setTextSize(0, this.textSize);
            }
            this.tv_type.setText("abc");
            if (shiftType2 == ShiftType.up) {
                ((TextView) this.ib_shift.getChildAt(1)).setText("123");
                strArr2 = this.QWERT_123_SHIFT_UP_ROW_0;
                strArr = this.QWERT_123_SHIFT_UP_ROW_1;
                strArr3 = this.QWERT_123_SHIFT_UP_ROW_2;
            } else {
                ((TextView) this.ib_shift.getChildAt(1)).setText("#+=");
                strArr2 = this.QWERT_123_SHIFT_DOWN_ROW_0;
                strArr = this.QWERT_123_SHIFT_DOWN_ROW_1;
                strArr3 = this.QWERT_123_SHIFT_DOWN_ROW_2;
            }
        }
        int i2 = 0;
        while (true) {
            TextView[] textViewArr = this.tv_row1;
            if (i2 >= textViewArr.length) {
                break;
            }
            textViewArr[i2].setText(strArr2[i2]);
            i2++;
        }
        int i3 = 0;
        while (true) {
            TextView[] textViewArr2 = this.tv_row2;
            if (i3 >= textViewArr2.length) {
                break;
            }
            textViewArr2[i3].setText(strArr[i3]);
            i3++;
        }
        while (true) {
            TextView[] textViewArr3 = this.tv_row3;
            if (i < textViewArr3.length) {
                textViewArr3[i].setText(strArr3[i]);
                i++;
            } else {
                return;
            }
        }
    }
}
