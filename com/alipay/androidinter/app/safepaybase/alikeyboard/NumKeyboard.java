package com.alipay.androidinter.app.safepaybase.alikeyboard;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.mobile.verifyidentity.uitools.R;

public class NumKeyboard extends AbstractKeyboard implements View.OnTouchListener {
    public static final int FLAG_IDCARD = 2;
    public static final int FLAG_PHONE = 1;
    public int mFlag;

    enum KeyType {
        del,
        ok,
        text
    }

    public NumKeyboard(Context context, OnKeyboardListener onKeyboardListener) {
        this(context, onKeyboardListener, 0);
    }

    public NumKeyboard(Context context, OnKeyboardListener onKeyboardListener, int i) {
        this.mFlag = 0;
        this.mFlag = i;
        this.keyboardView = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.keyboard_num, (ViewGroup) null, false);
        this.onKeyboardListener = onKeyboardListener;
        initialize(context);
    }

    @TargetApi(14)
    private void initialize(Context context) {
        int childCount = this.keyboardView.getChildCount();
        int rowHeight = getRowHeight(context);
        for (int i = 0; i < childCount; i++) {
            LinearLayout linearLayout = (LinearLayout) this.keyboardView.getChildAt(i);
            if (linearLayout != null) {
                ((LinearLayout.LayoutParams) linearLayout.getLayoutParams()).height = rowHeight;
                int childCount2 = linearLayout.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt = linearLayout.getChildAt(i2);
                    setDynamicTextView(childAt);
                    childAt.setAccessibilityDelegate(new SecureAccessbilityDelegate());
                    childAt.setOnTouchListener(this);
                }
            }
        }
    }

    private void setDynamicTextView(View view) {
        if (view.getId() == R.id.key_num_dymic) {
            int i = this.mFlag;
            if (i == 2 || i == 1) {
                TextView textView = (TextView) view;
                if (this.mFlag == 2) {
                    textView.setText("X");
                } else {
                    textView.setText("-");
                }
                textView.setBackgroundResource(R.drawable.keyboard_key_num_bg);
            }
        }
    }

    private int getRowHeight(Context context) {
        double d = (double) context.getResources().getDisplayMetrics().density;
        int i = context.getResources().getDisplayMetrics().heightPixels;
        int i2 = context.getResources().getDisplayMetrics().widthPixels;
        if (i2 <= i) {
            i = i2;
        }
        Double.isNaN(d);
        double d2 = (double) ((i - (((int) (d * 4.0d)) * 4)) / 3);
        Double.isNaN(d2);
        return (int) (d2 * 0.466d);
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

    private boolean onTouchDown(View view) {
        if (view.getId() == R.id.key_num_del1) {
            onDel();
            return false;
        }
        onInput(((TextView) view).getText().toString());
        return false;
    }

    private boolean onTouchUp(View view) {
        view.getId();
        return false;
    }
}
