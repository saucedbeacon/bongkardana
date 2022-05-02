package com.alipay.mobile.verifyidentity.business.securitycommon.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.StyleRes;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class BasicPopup<V extends View> implements DialogInterface.OnKeyListener, DialogInterface.OnDismissListener {
    public static final int MATCH_PARENT = -1;
    public static final int WRAP_CONTENT = -2;
    protected Activity activity;
    private FrameLayout contentLayout;
    private Dialog dialog;
    private boolean isPrepared = false;
    protected int screenHeightPixels;
    protected int screenWidthPixels;

    /* access modifiers changed from: protected */
    public abstract V makeContentView();

    /* access modifiers changed from: protected */
    public void setContentViewAfter(V v) {
    }

    /* access modifiers changed from: protected */
    public void setContentViewBefore() {
    }

    /* access modifiers changed from: protected */
    public void showAfter() {
    }

    public BasicPopup(Activity activity2) {
        this.activity = activity2;
        DisplayMetrics displayMetrics = ScreenUtils.displayMetrics(activity2);
        this.screenWidthPixels = displayMetrics.widthPixels;
        this.screenHeightPixels = displayMetrics.heightPixels;
        initDialog();
    }

    private void initDialog() {
        FrameLayout frameLayout = new FrameLayout(this.activity);
        this.contentLayout = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.contentLayout.setFocusable(true);
        this.contentLayout.setFocusableInTouchMode(true);
        Dialog dialog2 = new Dialog(this.activity);
        this.dialog = dialog2;
        dialog2.setCanceledOnTouchOutside(true);
        this.dialog.setCancelable(true);
        this.dialog.setOnKeyListener(this);
        this.dialog.setOnDismissListener(this);
        Window window = this.dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.requestFeature(1);
            window.setContentView(this.contentLayout);
        }
        setSize(this.screenWidthPixels, -2);
    }

    public int getScreenWidthPixels() {
        return this.screenWidthPixels;
    }

    public int getScreenHeightPixels() {
        return this.screenHeightPixels;
    }

    public void setFillScreen(boolean z) {
        if (z) {
            setSize(this.screenWidthPixels, (int) (((float) this.screenHeightPixels) * 0.85f));
        }
    }

    public void setHalfScreen(boolean z) {
        if (z) {
            setSize(this.screenWidthPixels, this.screenHeightPixels / 2);
        }
    }

    public void setGravity(int i) {
        Window window = this.dialog.getWindow();
        if (window != null) {
            window.setGravity(i);
        }
        if (i == 17) {
            setWidth((int) (((float) this.screenWidthPixels) * 0.7f));
        }
    }

    public void setContentView(View view) {
        this.contentLayout.removeAllViews();
        this.contentLayout.addView(view);
    }

    public void setFitsSystemWindows(boolean z) {
        this.contentLayout.setFitsSystemWindows(z);
    }

    public void setAnimationStyle(@StyleRes int i) {
        Window window = this.dialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(i);
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        this.dialog.setCanceledOnTouchOutside(z);
    }

    public void setCancelable(boolean z) {
        this.dialog.setCancelable(z);
    }

    public void setOnDismissListener(final DialogInterface.OnDismissListener onDismissListener) {
        this.dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            public void onDismiss(DialogInterface dialogInterface) {
                BasicPopup.this.onDismiss(dialogInterface);
                onDismissListener.onDismiss(dialogInterface);
            }
        });
    }

    public void setOnKeyListener(final DialogInterface.OnKeyListener onKeyListener) {
        this.dialog.setOnKeyListener(new DialogInterface.OnKeyListener() {
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                int max = dispatchOnCancelled.setMax(i);
                if (i != max) {
                    onCanceled oncanceled = new onCanceled(i, max, 1);
                    onCancelLoad.setMax(573156061, oncanceled);
                    onCancelLoad.getMin(573156061, oncanceled);
                }
                BasicPopup.this.onKey(dialogInterface, i, keyEvent);
                return onKeyListener.onKey(dialogInterface, i, keyEvent);
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r3 == 0) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSize(int r2, int r3) {
        /*
            r1 = this;
            r0 = -1
            if (r2 != r0) goto L_0x0005
            int r2 = r1.screenWidthPixels
        L_0x0005:
            r0 = -2
            if (r2 != 0) goto L_0x000e
            if (r3 != 0) goto L_0x000e
            int r2 = r1.screenWidthPixels
        L_0x000c:
            r3 = -2
            goto L_0x0016
        L_0x000e:
            if (r2 != 0) goto L_0x0013
            int r2 = r1.screenWidthPixels
            goto L_0x0016
        L_0x0013:
            if (r3 != 0) goto L_0x0016
            goto L_0x000c
        L_0x0016:
            android.widget.FrameLayout r0 = r1.contentLayout
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 != 0) goto L_0x0024
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r2, r3)
            goto L_0x0028
        L_0x0024:
            r0.width = r2
            r0.height = r3
        L_0x0028:
            android.widget.FrameLayout r2 = r1.contentLayout
            r2.setLayoutParams(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.business.securitycommon.widget.BasicPopup.setSize(int, int):void");
    }

    public void setWidth(int i) {
        setSize(i, 0);
    }

    public void setHeight(int i) {
        setSize(0, i);
    }

    public void setPrepared(boolean z) {
        this.isPrepared = z;
    }

    public boolean isShowing() {
        return this.dialog.isShowing();
    }

    public final void show() {
        if (this.isPrepared) {
            this.dialog.show();
            showAfter();
            return;
        }
        setContentViewBefore();
        View makeContentView = makeContentView();
        setContentView(makeContentView);
        setContentViewAfter(makeContentView);
        this.isPrepared = true;
        this.dialog.show();
        showAfter();
    }

    public void dismiss() {
        dismissImmediately();
    }

    /* access modifiers changed from: protected */
    public final void dismissImmediately() {
        this.dialog.dismiss();
    }

    public boolean onBackPress() {
        dismiss();
        return false;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        onBackPress();
        return false;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        dismiss();
    }

    public Context getContext() {
        return this.dialog.getContext();
    }

    public Window getWindow() {
        return this.dialog.getWindow();
    }

    public View getContentView() {
        return this.contentLayout.getChildAt(0);
    }

    public ViewGroup getRootView() {
        return this.contentLayout;
    }
}
