package com.alibaba.griver.ui.jsapi.picker.nebula.wheelview.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.alibaba.griver.base.common.logger.GriverLogger;
import java.util.ArrayList;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class WheelView extends ScrollView {
    public static final int LINE_COLOR = -8139290;
    public static final int OFF_SET = 1;
    public static final int TEXT_COLOR_FOCUS = -16611122;
    public static final int TEXT_COLOR_NORMAL = -4473925;
    public static final int TEXT_SIZE = 16;

    /* renamed from: a  reason: collision with root package name */
    private Context f10584a;
    private LinearLayout b;
    private List<String> c = new ArrayList();
    /* access modifiers changed from: private */
    public int d = 1;
    private int e;
    /* access modifiers changed from: private */
    public int f = 1;
    /* access modifiers changed from: private */
    public int g;
    private Runnable h = new ScrollerTask();
    /* access modifiers changed from: private */
    public int i = 0;
    private int[] j;
    private OnWheelViewListener k;
    /* access modifiers changed from: private */
    public Paint l;
    /* access modifiers changed from: private */
    public int m;
    private int n = 16;

    /* renamed from: o  reason: collision with root package name */
    private int f10585o = -4473925;
    private int p = -16611122;
    private int q = -8139290;
    private boolean r = true;
    private boolean s = false;
    private float t = 0.0f;

    public interface OnWheelViewListener {
        void onSelected(boolean z, int i, String str);
    }

    public WheelView(Context context) {
        super(context);
        a(context);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public WheelView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }

    private void a(Context context) {
        this.f10584a = context;
        setFadingEdgeLength(0);
        if (Build.VERSION.SDK_INT >= 9) {
            setOverScrollMode(2);
        }
        setVerticalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        addView(this.b);
    }

    /* access modifiers changed from: private */
    public void a() {
        this.g = getScrollY();
        postDelayed(this.h, 50);
    }

    private void b() {
        this.e = (this.d * 2) + 1;
        this.b.removeAllViews();
        for (String a2 : this.c) {
            this.b.addView(a(a2));
        }
        a(this.i * (this.f - this.d));
    }

    private TextView a(String str) {
        TextView textView = new TextView(this.f10584a);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        textView.setTextSize((float) this.n);
        textView.setGravity(17);
        int a2 = a(15.0f);
        textView.setPadding(a2, a2, a2, a2);
        if (this.i == 0) {
            this.i = a((View) textView);
            StringBuilder sb = new StringBuilder("itemHeight: ");
            sb.append(this.i);
            GriverLogger.debug("compositeui", sb.toString());
            this.b.setLayoutParams(new FrameLayout.LayoutParams(-1, this.i * this.e));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new LinearLayout.LayoutParams(-1, -2);
            }
            setLayoutParams(new LinearLayout.LayoutParams(layoutParams.width, this.i * this.e));
        }
        return textView;
    }

    private void a(int i2) {
        int max = dispatchOnCancelled.setMax(i2);
        if (i2 != max) {
            onCanceled oncanceled = new onCanceled(i2, max, 1);
            onCancelLoad.setMax(-213377925, oncanceled);
            onCancelLoad.getMin(-213377925, oncanceled);
        }
        int i3 = this.i;
        int i4 = this.d;
        int i5 = (i2 / i3) + i4;
        int i6 = i2 % i3;
        int i7 = i2 / i3;
        if (i6 == 0) {
            i5 = i7 + i4;
        } else if (i6 > i3 / 2) {
            i5 = i7 + i4 + 1;
        }
        int childCount = this.b.getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            TextView textView = (TextView) this.b.getChildAt(i8);
            if (textView != null) {
                if (i5 == i8) {
                    textView.setTextColor(this.p);
                } else {
                    textView.setTextColor(this.f10585o);
                }
                i8++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public int[] c() {
        if (this.j == null) {
            int[] iArr = new int[2];
            this.j = iArr;
            int i2 = this.i;
            int i3 = this.d;
            iArr[0] = i2 * i3;
            iArr[1] = i2 * (i3 + 1);
        }
        return this.j;
    }

    /* access modifiers changed from: private */
    public void d() {
        OnWheelViewListener onWheelViewListener = this.k;
        if (onWheelViewListener != null) {
            boolean z = this.s;
            int i2 = this.f;
            onWheelViewListener.onSelected(z, i2 - this.d, this.c.get(i2));
        }
    }

    private int a(float f2) {
        return (int) ((f2 * this.f10584a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private int a(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        return view.getMeasuredHeight();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.m == 0) {
            this.m = ((Activity) this.f10584a).getWindowManager().getDefaultDisplay().getWidth();
            StringBuilder sb = new StringBuilder("viewWidth: ");
            sb.append(this.m);
            GriverLogger.debug("compositeui", sb.toString());
        }
        if (this.r) {
            if (this.l == null) {
                Paint paint = new Paint();
                this.l = paint;
                paint.setColor(this.q);
                this.l.setStrokeWidth((float) a(1.0f));
            }
            super.setBackgroundDrawable(new Drawable() {
                public int getOpacity() {
                    return 0;
                }

                public void setAlpha(int i) {
                }

                public void setColorFilter(ColorFilter colorFilter) {
                }

                public void draw(Canvas canvas) {
                    int[] access$100 = WheelView.this.c();
                    canvas.drawLine((float) (WheelView.this.m / 6), (float) access$100[0], (float) ((WheelView.this.m * 5) / 6), (float) access$100[0], WheelView.this.l);
                    canvas.drawLine((float) (WheelView.this.m / 6), (float) access$100[1], (float) ((WheelView.this.m * 5) / 6), (float) access$100[1], WheelView.this.l);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        a(i3);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        StringBuilder sb = new StringBuilder("w: ");
        sb.append(i2);
        sb.append(", h: ");
        sb.append(i3);
        sb.append(", oldw: ");
        sb.append(i4);
        sb.append(", oldh: ");
        sb.append(i5);
        GriverLogger.debug("compositeui", sb.toString());
        this.m = i2;
        setBackgroundDrawable((Drawable) null);
    }

    public void fling(int i2) {
        super.fling(i2 / 3);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.t = motionEvent.getY();
        } else if (action == 1) {
            GriverLogger.debug("compositeui", String.format("items=%s, offset=%s", new Object[]{Integer.valueOf(this.c.size()), Integer.valueOf(this.d)}));
            StringBuilder sb = new StringBuilder("selectedIndex=");
            sb.append(this.f);
            GriverLogger.debug("compositeui", sb.toString());
            GriverLogger.debug("compositeui", "delta=".concat(String.valueOf(motionEvent.getY() - this.t)));
            this.s = true;
            a();
        }
        return super.onTouchEvent(motionEvent);
    }

    private void a(List<String> list) {
        this.c.clear();
        this.c.addAll(list);
        for (int i2 = 0; i2 < this.d; i2++) {
            this.c.add(0, "");
            this.c.add("");
        }
        b();
    }

    public void setItems(List<String> list) {
        a(list);
        setSelectedIndex(0);
    }

    public void setItems(List<String> list, int i2) {
        a(list);
        setSelectedIndex(i2);
    }

    public void setItems(List<String> list, String str) {
        a(list);
        setSelectedItem(str);
    }

    public int getTextSize() {
        return this.n;
    }

    public void setTextSize(int i2) {
        this.n = i2;
    }

    public int getTextColor() {
        return this.p;
    }

    public void setTextColor(@ColorInt int i2) {
        this.p = i2;
    }

    public void setTextColor(@ColorInt int i2, @ColorInt int i3) {
        this.f10585o = i2;
        this.p = i3;
    }

    public boolean isLineVisible() {
        return this.r;
    }

    public void setLineVisible(boolean z) {
        this.r = z;
    }

    public int getLineColor() {
        return this.q;
    }

    public void setLineColor(@ColorInt int i2) {
        this.q = i2;
    }

    public int getOffset() {
        return this.d;
    }

    public void setOffset(int i2) {
        if (i2 <= 0 || i2 > 4) {
            throw new IllegalArgumentException("Offset must between 1 and 4");
        }
        this.d = i2;
    }

    @Deprecated
    public String getSeletedItem() {
        return getSelectedItem();
    }

    public String getSelectedItem() {
        return this.c.get(this.f);
    }

    public void setSelectedItem(String str) {
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            if (this.c.get(i2).equals(str)) {
                setSelectedIndex(i2 - this.d);
                return;
            }
        }
    }

    @Deprecated
    public int getSeletedIndex() {
        return getSelectedIndex();
    }

    public int getSelectedIndex() {
        return this.f - this.d;
    }

    private void setSelectedIndex(final int i2) {
        this.s = false;
        post(new Runnable() {
            public void run() {
                WheelView wheelView = WheelView.this;
                wheelView.scrollTo(0, i2 * wheelView.i);
                WheelView wheelView2 = WheelView.this;
                int unused = wheelView2.f = i2 + wheelView2.d;
                WheelView.this.d();
            }
        });
    }

    public void setOnWheelViewListener(OnWheelViewListener onWheelViewListener) {
        this.k = onWheelViewListener;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence getContentDescription() {
        /*
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.c
            if (r0 == 0) goto L_0x0019
            int r1 = r2.f
            if (r1 < 0) goto L_0x0019
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x0019
            java.util.List<java.lang.String> r0 = r2.c
            int r1 = r2.f
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x001b
        L_0x0019:
            java.lang.String r0 = ""
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.jsapi.picker.nebula.wheelview.widget.WheelView.getContentDescription():java.lang.CharSequence");
    }

    class ScrollerTask implements Runnable {
        private ScrollerTask() {
        }

        public void run() {
            if (WheelView.this.i == 0) {
                GriverLogger.debug("compositeui", "itemHeight is zero");
                return;
            }
            if (WheelView.this.g - WheelView.this.getScrollY() == 0) {
                final int access$800 = WheelView.this.g % WheelView.this.i;
                final int access$8002 = WheelView.this.g / WheelView.this.i;
                StringBuilder sb = new StringBuilder("initialY: ");
                sb.append(WheelView.this.g);
                sb.append(", remainder: ");
                sb.append(access$800);
                sb.append(", divided: ");
                sb.append(access$8002);
                GriverLogger.debug("compositeui", sb.toString());
                if (access$800 == 0) {
                    WheelView wheelView = WheelView.this;
                    int unused = wheelView.f = access$8002 + wheelView.d;
                    WheelView.this.d();
                } else if (access$800 > WheelView.this.i / 2) {
                    WheelView.this.post(new Runnable() {
                        public void run() {
                            WheelView.this.smoothScrollTo(0, (WheelView.this.g - access$800) + WheelView.this.i);
                            int unused = WheelView.this.f = access$8002 + WheelView.this.d + 1;
                            WheelView.this.d();
                        }
                    });
                } else {
                    WheelView.this.post(new Runnable() {
                        public void run() {
                            WheelView.this.smoothScrollTo(0, WheelView.this.g - access$800);
                            int unused = WheelView.this.f = access$8002 + WheelView.this.d;
                            WheelView.this.d();
                        }
                    });
                }
            } else {
                WheelView.this.a();
            }
        }
    }
}
