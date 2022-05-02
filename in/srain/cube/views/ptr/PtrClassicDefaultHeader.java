package in.srain.cube.views.ptr;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import o.TinyAppActionStateManager;
import o.TinyBlurMenu;

public class PtrClassicDefaultHeader extends FrameLayout implements TinyAppActionStateManager.Holder {
    private static SimpleDateFormat setMax = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private length FastBitmap$CoordinateSystem = new length(this, (byte) 0);
    private View IsOverlapping;
    /* access modifiers changed from: private */
    public String equals;
    private TextView getMax;
    private int getMin = 150;
    private long isInside = -1;
    private RotateAnimation length;
    private RotateAnimation setMin;
    private TextView toFloatRange;
    private View toIntRange;
    private boolean values;

    public PtrClassicDefaultHeader(Context context) {
        super(context);
        initViews((AttributeSet) null);
    }

    public PtrClassicDefaultHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViews(attributeSet);
    }

    public PtrClassicDefaultHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initViews(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void initViews(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, TinyBlurMenu.AnonymousClass2.getMin.getMax, 0, 0);
        if (obtainStyledAttributes != null) {
            this.getMin = obtainStyledAttributes.getInt(TinyBlurMenu.AnonymousClass2.getMin.setMin, this.getMin);
        }
        setMin();
        View inflate = LayoutInflater.from(getContext()).inflate(TinyBlurMenu.AnonymousClass2.length.cube_ptr_classic_default_header, this);
        this.toIntRange = inflate.findViewById(TinyBlurMenu.AnonymousClass2.setMin.length);
        this.getMax = (TextView) inflate.findViewById(TinyBlurMenu.AnonymousClass2.setMin.getMax);
        this.toFloatRange = (TextView) inflate.findViewById(TinyBlurMenu.AnonymousClass2.setMin.getMin);
        this.IsOverlapping = inflate.findViewById(TinyBlurMenu.AnonymousClass2.setMin.setMin);
        this.toIntRange.clearAnimation();
        this.toIntRange.setVisibility(4);
        this.IsOverlapping.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        length length2 = this.FastBitmap$CoordinateSystem;
        if (length2 != null) {
            length2.setMax = false;
            PtrClassicDefaultHeader.this.removeCallbacks(length2);
        }
    }

    public void setRotateAniTime(int i) {
        if (i != this.getMin && i != 0) {
            this.getMin = i;
            setMin();
        }
    }

    public void setLastUpdateTimeKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.equals = str;
        }
    }

    public void setLastUpdateTimeRelateObject(Object obj) {
        setLastUpdateTimeKey(obj.getClass().getName());
    }

    private void setMin() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.setMin = rotateAnimation;
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.setMin.setDuration((long) this.getMin);
        this.setMin.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.length = rotateAnimation2;
        rotateAnimation2.setInterpolator(new LinearInterpolator());
        this.length.setDuration((long) this.getMin);
        this.length.setFillAfter(true);
    }

    public void onUIRefreshPrepare(PtrFrameLayout ptrFrameLayout) {
        this.values = true;
        setMax();
        length length2 = this.FastBitmap$CoordinateSystem;
        if (!TextUtils.isEmpty(PtrClassicDefaultHeader.this.equals)) {
            length2.setMax = true;
            length2.run();
        }
        this.IsOverlapping.setVisibility(4);
        this.toIntRange.setVisibility(0);
        this.getMax.setVisibility(0);
        if (ptrFrameLayout.isPullToRefresh()) {
            this.getMax.setText(getResources().getString(TinyBlurMenu.AnonymousClass2.getMax.cube_ptr_pull_down_to_refresh));
        } else {
            this.getMax.setText(getResources().getString(TinyBlurMenu.AnonymousClass2.getMax.cube_ptr_pull_down));
        }
    }

    public void onUIRefreshBegin(PtrFrameLayout ptrFrameLayout) {
        this.values = false;
        this.toIntRange.clearAnimation();
        this.toIntRange.setVisibility(4);
        this.IsOverlapping.setVisibility(0);
        this.getMax.setVisibility(0);
        this.getMax.setText(TinyBlurMenu.AnonymousClass2.getMax.cube_ptr_refreshing);
        setMax();
        length length2 = this.FastBitmap$CoordinateSystem;
        length2.setMax = false;
        PtrClassicDefaultHeader.this.removeCallbacks(length2);
    }

    /* access modifiers changed from: private */
    public void setMax() {
        if (TextUtils.isEmpty(this.equals) || !this.values) {
            this.toFloatRange.setVisibility(8);
            return;
        }
        String max = getMax();
        if (TextUtils.isEmpty(max)) {
            this.toFloatRange.setVisibility(8);
            return;
        }
        this.toFloatRange.setVisibility(0);
        this.toFloatRange.setText(max);
    }

    private String getMax() {
        if (this.isInside == -1 && !TextUtils.isEmpty(this.equals)) {
            this.isInside = getContext().getSharedPreferences("cube_ptr_classic_last_update", 0).getLong(this.equals, -1);
        }
        if (this.isInside == -1) {
            return null;
        }
        long time = new Date().getTime() - this.isInside;
        int i = (int) (time / 1000);
        if (time < 0 || i <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getContext().getString(TinyBlurMenu.AnonymousClass2.getMax.cube_ptr_last_update));
        if (i < 60) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append(getContext().getString(TinyBlurMenu.AnonymousClass2.getMax.cube_ptr_seconds_ago));
            sb.append(sb2.toString());
        } else {
            int i2 = i / 60;
            if (i2 > 60) {
                int i3 = i2 / 60;
                if (i3 > 24) {
                    sb.append(setMax.format(new Date(this.isInside)));
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i3);
                    sb3.append(getContext().getString(TinyBlurMenu.AnonymousClass2.getMax.cube_ptr_hours_ago));
                    sb.append(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i2);
                sb4.append(getContext().getString(TinyBlurMenu.AnonymousClass2.getMax.cube_ptr_minutes_ago));
                sb.append(sb4.toString());
            }
        }
        return sb.toString();
    }

    public void onUIPositionChange(PtrFrameLayout ptrFrameLayout, boolean z, byte b, TinyBlurMenu.AnonymousClass1 r8) {
        int offsetToRefresh = ptrFrameLayout.getOffsetToRefresh();
        int i = r8.getMin;
        int i2 = r8.toFloatRange;
        if (i >= offsetToRefresh || i2 < offsetToRefresh) {
            if (i > offsetToRefresh && i2 <= offsetToRefresh && z && b == 2) {
                if (!ptrFrameLayout.isPullToRefresh()) {
                    this.getMax.setVisibility(0);
                    this.getMax.setText(TinyBlurMenu.AnonymousClass2.getMax.cube_ptr_release_to_refresh);
                }
                View view = this.toIntRange;
                if (view != null) {
                    view.clearAnimation();
                    this.toIntRange.startAnimation(this.setMin);
                }
            }
        } else if (z && b == 2) {
            this.getMax.setVisibility(0);
            if (ptrFrameLayout.isPullToRefresh()) {
                this.getMax.setText(getResources().getString(TinyBlurMenu.AnonymousClass2.getMax.cube_ptr_pull_down_to_refresh));
            } else {
                this.getMax.setText(getResources().getString(TinyBlurMenu.AnonymousClass2.getMax.cube_ptr_pull_down));
            }
            View view2 = this.toIntRange;
            if (view2 != null) {
                view2.clearAnimation();
                this.toIntRange.startAnimation(this.length);
            }
        }
    }

    class length implements Runnable {
        boolean setMax;

        private length() {
            this.setMax = false;
        }

        /* synthetic */ length(PtrClassicDefaultHeader ptrClassicDefaultHeader, byte b) {
            this();
        }

        public final void run() {
            PtrClassicDefaultHeader.this.setMax();
            if (this.setMax) {
                PtrClassicDefaultHeader.this.postDelayed(this, 1000);
            }
        }
    }

    public void onUIReset(PtrFrameLayout ptrFrameLayout) {
        this.toIntRange.clearAnimation();
        this.toIntRange.setVisibility(4);
        this.IsOverlapping.setVisibility(4);
        this.values = true;
        setMax();
    }

    public void onUIRefreshComplete(PtrFrameLayout ptrFrameLayout) {
        this.toIntRange.clearAnimation();
        this.toIntRange.setVisibility(4);
        this.IsOverlapping.setVisibility(4);
        this.getMax.setVisibility(0);
        this.getMax.setText(getResources().getString(TinyBlurMenu.AnonymousClass2.getMax.cube_ptr_refresh_complete));
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("cube_ptr_classic_last_update", 0);
        if (!TextUtils.isEmpty(this.equals)) {
            this.isInside = new Date().getTime();
            sharedPreferences.edit().putLong(this.equals, this.isInside).commit();
        }
    }
}
