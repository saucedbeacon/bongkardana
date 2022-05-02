package com.alibaba.griver.ui.jsapi.picker.nebula.wheelview.widget;

import android.app.Activity;
import android.content.DialogInterface;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.StyleRes;
import com.alibaba.griver.base.common.logger.GriverLogger;

public abstract class BottomPopup<V extends View> implements DialogInterface.OnKeyListener {
    public static final int MATCH_PARENT = -1;
    public static final int WRAP_CONTENT = -2;

    /* renamed from: a  reason: collision with root package name */
    private Popup f10582a;
    protected Activity activity;
    private int b = 0;
    private int c = 0;
    private boolean d = false;
    private boolean e = false;
    protected int screenHeightPixels;
    protected int screenWidthPixels;

    /* access modifiers changed from: protected */
    public abstract V makeContentView();

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void setContentViewAfter(V v) {
    }

    /* access modifiers changed from: protected */
    public void setContentViewBefore() {
    }

    public BottomPopup(Activity activity2) {
        this.activity = activity2;
        DisplayMetrics displayMetrics = activity2.getResources().getDisplayMetrics();
        this.screenWidthPixels = displayMetrics.widthPixels;
        this.screenHeightPixels = displayMetrics.heightPixels;
        Popup popup = new Popup(activity2);
        this.f10582a = popup;
        popup.setOnKeyListener(this);
    }

    private void a() {
        setContentViewBefore();
        View makeContentView = makeContentView();
        this.f10582a.setContentView(makeContentView);
        setContentViewAfter(makeContentView);
        GriverLogger.debug("compositeui", "do something before popup show");
        if (this.b == 0 && this.c == 0) {
            this.b = this.screenWidthPixels;
            if (this.d) {
                this.c = -1;
            } else if (this.e) {
                this.c = this.screenHeightPixels / 2;
            } else {
                this.c = -2;
            }
        }
        this.f10582a.setSize(this.b, this.c);
    }

    public void setFillScreen(boolean z) {
        this.d = z;
    }

    public void setHalfScreen(boolean z) {
        this.e = z;
    }

    public void setAnimationStyle(@StyleRes int i) {
        this.f10582a.setAnimationStyle(i);
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f10582a.setOnDismissListener(onDismissListener);
        GriverLogger.debug("compositeui", "popup setOnDismissListener");
    }

    public void setSize(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public void setWidth(int i) {
        this.b = i;
    }

    public void setHeight(int i) {
        this.c = i;
    }

    public boolean isShowing() {
        return this.f10582a.isShowing();
    }

    @CallSuper
    public void show() {
        a();
        this.f10582a.show();
        GriverLogger.debug("compositeui", "popup show");
    }

    public void dismiss() {
        this.f10582a.dismiss();
        GriverLogger.debug("compositeui", "popup dismiss");
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            return onKeyDown(i, keyEvent);
        }
        return false;
    }

    public Window getWindow() {
        return this.f10582a.getWindow();
    }

    public ViewGroup getRootView() {
        return this.f10582a.getRootView();
    }
}
