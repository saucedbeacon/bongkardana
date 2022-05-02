package com.alipay.androidinter.app.safepaybase.alikeyboard;

import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;

public class AbstractKeyboard {
    protected AliKeyboardType keyboardType;
    protected ViewGroup keyboardView;
    protected OnKeyboardListener onKeyboardListener;

    public View getView() {
        return this.keyboardView;
    }

    /* access modifiers changed from: protected */
    public void onDel() {
        OnKeyboardListener onKeyboardListener2 = this.onKeyboardListener;
        if (onKeyboardListener2 != null) {
            onKeyboardListener2.onDel();
        }
    }

    /* access modifiers changed from: protected */
    public void onOK() {
        OnKeyboardListener onKeyboardListener2 = this.onKeyboardListener;
        if (onKeyboardListener2 != null) {
            onKeyboardListener2.onOK();
        }
    }

    /* access modifiers changed from: protected */
    public void onInput(String str) {
        OnKeyboardListener onKeyboardListener2 = this.onKeyboardListener;
        if (onKeyboardListener2 != null) {
            onKeyboardListener2.onInput(str);
        }
    }

    /* access modifiers changed from: protected */
    public void onStatisticEvent(String str) {
        OnKeyboardListener onKeyboardListener2 = this.onKeyboardListener;
        if (onKeyboardListener2 != null) {
            onKeyboardListener2.onStatisticEvent(str);
        }
    }

    /* access modifiers changed from: protected */
    public Point getRelatePoint(ViewGroup viewGroup, View view) {
        if (viewGroup == null || view == null) {
            return new Point();
        }
        if (view.getParent() == viewGroup) {
            return new Point(view.getLeft(), view.getTop());
        }
        Point relatePoint = getRelatePoint(viewGroup, (View) view.getParent());
        return new Point(relatePoint.x + view.getLeft(), relatePoint.y + view.getTop());
    }
}
