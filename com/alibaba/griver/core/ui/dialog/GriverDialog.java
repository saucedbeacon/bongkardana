package com.alibaba.griver.core.ui.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.core.R;

public class GriverDialog extends AlertDialog {

    /* renamed from: a  reason: collision with root package name */
    private TextView f10368a;
    private TextView b;
    private FrameLayout c;
    private TextView d;
    private TextView e;
    private View f;
    private RelativeLayout g;
    private TextView h;
    private TextView i;
    private View j;
    private LinearLayout k;
    /* access modifiers changed from: private */
    public LinearLayout l;
    /* access modifiers changed from: private */
    public DialogParam m = new DialogParam();
    /* access modifiers changed from: private */
    public boolean n = false;

    @Keep
    public static class DialogParam {
        public String align;
        public DialogInterface.OnCancelListener cancelListener;
        public boolean cancelable = true;
        public String message;
        public DialogInterface.OnClickListener negativeListener;
        public String negativeString;
        public String negativeTextColor;
        public DialogInterface.OnClickListener positiveListener;
        public String positiveString;
        public String positiveTextColor;
        public String title;
        public View view;
    }

    public GriverDialog(Context context) {
        super(context);
    }

    protected GriverDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }

    protected GriverDialog(Context context, int i2) {
        super(context, i2);
    }

    /* access modifiers changed from: private */
    public DialogParam a() {
        return this.m;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.n) {
            setContentView(R.layout.griver_core_uniform_dialog);
            b();
        }
    }

    private void b() {
        this.f10368a = (TextView) findViewById(R.id.tv_title);
        this.b = (TextView) findViewById(R.id.tv_message);
        this.c = (FrameLayout) findViewById(R.id.custom_view_Layout);
        this.d = (TextView) findViewById(R.id.tv_negative_text);
        this.e = (TextView) findViewById(R.id.tv_positive_text);
        this.f = findViewById(R.id.button_view_divider);
        this.g = (RelativeLayout) findViewById(R.id.layout_button);
        this.l = (LinearLayout) findViewById(R.id.layout_dialog);
        this.h = (TextView) findViewById(R.id.tv_negative_vertical_text);
        this.i = (TextView) findViewById(R.id.tv_positive_vertical_text);
        this.j = findViewById(R.id.button_view_vertical_divider);
        this.k = (LinearLayout) findViewById(R.id.layout_vertical_button);
    }

    public void show() {
        if (this.n && this.m.view != null && canTextInput(this.m.view)) {
            setView(new EditText(getContext()));
        }
        super.show();
        if (this.n) {
            c();
        }
    }

    private void c() {
        f();
        g();
        h();
        i();
        e();
        d();
    }

    private void d() {
        if (this.m.view != null) {
            this.c.setVisibility(0);
            this.c.removeAllViews();
            this.c.addView(this.m.view, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    private void e() {
        setCancelable(this.m.cancelable);
        if (this.m.cancelListener != null) {
            setOnCancelListener(this.m.cancelListener);
        }
    }

    private void f() {
        if (!TextUtils.isEmpty(this.m.title) || !TextUtils.isEmpty(this.m.message) || !TextUtils.isEmpty(this.m.positiveString) || !TextUtils.isEmpty(this.m.negativeString)) {
            this.l.setVisibility(0);
        } else {
            this.l.setVisibility(8);
        }
        final WindowManager.LayoutParams attributes = getWindow().getAttributes();
        WindowManager windowManager = getWindow().getWindowManager();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        GriverLogger.d("GriverDialog", "window width: ".concat(String.valueOf(i2)));
        if (i2 > 540) {
            attributes.width = (i2 * 4) / 5;
        }
        final int i3 = (displayMetrics.heightPixels * 3) / 5;
        this.l.post(new Runnable() {
            public void run() {
                int measuredHeight = GriverDialog.this.l.getMeasuredHeight();
                int i = i3;
                if (measuredHeight > i) {
                    attributes.height = i;
                }
                GriverDialog.this.getWindow().setAttributes(attributes);
            }
        });
        getWindow().getDecorView().setBackgroundResource(R.drawable.griver_core_custom_dialog);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
    }

    private void g() {
        if (!TextUtils.isEmpty(this.m.title)) {
            this.f10368a.setVisibility(0);
            this.f10368a.setText(this.m.title);
        }
    }

    private void h() {
        if (!TextUtils.isEmpty(this.m.message)) {
            this.b.setVisibility(0);
            this.b.setText(this.m.message);
        }
        if (TextUtils.equals(this.m.align, TtmlNode.LEFT)) {
            this.b.setGravity(3);
        } else if (TextUtils.equals(this.m.align, TtmlNode.RIGHT)) {
            this.b.setGravity(5);
        } else {
            this.b.setGravity(17);
        }
    }

    private void i() {
        if (TextUtils.isEmpty(this.m.positiveString) || TextUtils.isEmpty(this.m.negativeString) || (a(this.m.positiveString) <= 100.0f && a(this.m.negativeString) <= 100.0f)) {
            if (!TextUtils.isEmpty(this.m.positiveString) || !TextUtils.isEmpty(this.m.negativeString)) {
                this.g.setVisibility(0);
            }
            if (!TextUtils.isEmpty(this.m.positiveString) && !TextUtils.isEmpty(this.m.negativeString)) {
                this.f.setVisibility(0);
            }
            if (!TextUtils.isEmpty(this.m.positiveString)) {
                this.e.setVisibility(0);
                this.e.setText(this.m.positiveString);
                a(this.e, this.m.positiveTextColor);
                a(this.e);
            }
            if (!TextUtils.isEmpty(this.m.negativeString)) {
                this.d.setVisibility(0);
                this.d.setText(this.m.negativeString);
                a(this.d, this.m.negativeTextColor);
                b(this.d);
                return;
            }
            return;
        }
        this.k.setVisibility(0);
        this.h.setVisibility(0);
        this.i.setVisibility(0);
        this.j.setVisibility(0);
        this.h.setText(this.m.negativeString);
        this.i.setText(this.m.positiveString);
        a(this.i, this.m.positiveTextColor);
        a(this.h, this.m.negativeTextColor);
        a(this.i);
        b(this.h);
    }

    private float a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        Paint paint = new Paint();
        paint.setTextSize(15.0f);
        float measureText = paint.measureText(str);
        StringBuilder sb = new StringBuilder("text length for ");
        sb.append(str);
        sb.append(" is: ");
        sb.append(measureText);
        GriverLogger.d("GriverDialog", sb.toString());
        return measureText;
    }

    private void a(TextView textView, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                textView.setTextColor(Color.parseColor(str));
            } catch (Exception e2) {
                GriverLogger.e("GriverDialog", "parse text color failed: ".concat(String.valueOf(str)), e2);
            }
        }
    }

    private void a(TextView textView) {
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (GriverDialog.this.m.positiveListener != null) {
                    GriverDialog.this.m.positiveListener.onClick(GriverDialog.this, -1);
                }
                GriverDialog.this.dismiss();
            }
        });
    }

    private void b(TextView textView) {
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (GriverDialog.this.m.negativeListener != null) {
                    GriverDialog.this.m.negativeListener.onClick(GriverDialog.this, -2);
                }
                GriverDialog.this.dismiss();
            }
        });
    }

    static boolean canTextInput(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (canTextInput(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    @Keep
    public static class Builder {
        GriverDialog griverDialog;

        public Builder(Context context) {
            this.griverDialog = new GriverDialog(context);
        }

        public Builder title(String str) {
            this.griverDialog.a().title = str;
            return this;
        }

        public Builder message(String str) {
            this.griverDialog.a().message = str;
            return this;
        }

        public Builder align(String str) {
            this.griverDialog.a().align = str;
            return this;
        }

        public Builder positiveString(String str) {
            this.griverDialog.a().positiveString = str;
            return this;
        }

        public Builder negativeString(String str) {
            this.griverDialog.a().negativeString = str;
            return this;
        }

        public Builder positiveTextColor(String str) {
            this.griverDialog.a().positiveTextColor = str;
            return this;
        }

        public Builder negativeTextColor(String str) {
            this.griverDialog.a().negativeTextColor = str;
            return this;
        }

        public Builder positiveListener(DialogInterface.OnClickListener onClickListener) {
            this.griverDialog.a().positiveListener = onClickListener;
            return this;
        }

        public Builder negativeListener(DialogInterface.OnClickListener onClickListener) {
            this.griverDialog.a().negativeListener = onClickListener;
            return this;
        }

        public Builder cancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.griverDialog.a().cancelListener = onCancelListener;
            return this;
        }

        public Builder cancelable(boolean z) {
            this.griverDialog.a().cancelable = z;
            return this;
        }

        public Builder view(View view) {
            this.griverDialog.a().view = view;
            return this;
        }

        public GriverDialog create() {
            boolean unused = this.griverDialog.n = true;
            return this.griverDialog;
        }
    }
}
