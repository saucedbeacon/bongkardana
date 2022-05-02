package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import o.ITrustedWebActivityCallback;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class prepareFromSearch implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static prepareFromSearch isInside;
    private static prepareFromSearch toDoubleRange;
    private boolean IsOverlapping;
    private int equals;
    private final int getMax;
    private final Runnable getMin = new Runnable() {
        public void run() {
            prepareFromSearch.this.setMax();
        }
    };
    private final View length;
    private final Runnable setMax = new Runnable() {
        public void run() {
            prepareFromSearch.this.length(false);
        }
    };
    private final CharSequence setMin;
    private int toFloatRange;
    private prepare toIntRange;

    public void onViewAttachedToWindow(View view) {
    }

    public static void getMin(View view, CharSequence charSequence) {
        prepareFromSearch preparefromsearch = isInside;
        if (preparefromsearch != null && preparefromsearch.length == view) {
            getMin((prepareFromSearch) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            prepareFromSearch preparefromsearch2 = toDoubleRange;
            if (preparefromsearch2 != null && preparefromsearch2.length == view) {
                preparefromsearch2.setMax();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new prepareFromSearch(view, charSequence);
    }

    private prepareFromSearch(View view, CharSequence charSequence) {
        this.length = view;
        this.setMin = charSequence;
        this.getMax = onStop.length(ViewConfiguration.get(view.getContext()));
        getMax();
        this.length.setOnLongClickListener(this);
        this.length.setOnHoverListener(this);
    }

    public boolean onLongClick(View view) {
        this.toFloatRange = view.getWidth() / 2;
        this.equals = view.getHeight() / 2;
        length(true);
        return true;
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.toIntRange != null && this.IsOverlapping) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.length.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                getMax();
                setMax();
            }
        } else if (this.length.isEnabled() && this.toIntRange == null && setMin(motionEvent)) {
            getMin(this);
        }
        return false;
    }

    public void onViewDetachedFromWindow(View view) {
        setMax();
    }

    /* access modifiers changed from: package-private */
    public void length(boolean z) {
        int i;
        int i2;
        long j;
        int i3;
        long j2;
        if (ViewCompat.ICustomTabsService(this.length)) {
            getMin((prepareFromSearch) null);
            prepareFromSearch preparefromsearch = toDoubleRange;
            if (preparefromsearch != null) {
                preparefromsearch.setMax();
            }
            toDoubleRange = this;
            this.IsOverlapping = z;
            prepare prepare = new prepare(this.length.getContext());
            this.toIntRange = prepare;
            View view = this.length;
            int i4 = this.toFloatRange;
            int i5 = this.equals;
            boolean z2 = this.IsOverlapping;
            CharSequence charSequence = this.setMin;
            if (prepare.getMax() && prepare.getMax()) {
                ((WindowManager) prepare.setMax.getSystemService("window")).removeView(prepare.getMax);
            }
            prepare.setMin.setText(charSequence);
            WindowManager.LayoutParams layoutParams = prepare.length;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = prepare.setMax.getResources().getDimensionPixelOffset(ITrustedWebActivityCallback.Stub.getMax.values);
            if (view.getWidth() < dimensionPixelOffset) {
                i4 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = prepare.setMax.getResources().getDimensionPixelOffset(ITrustedWebActivityCallback.Stub.getMax.FastBitmap$CoordinateSystem);
                i = i5 + dimensionPixelOffset2;
                i2 = i5 - dimensionPixelOffset2;
            } else {
                i = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = prepare.setMax.getResources().getDimensionPixelOffset(z2 ? ITrustedWebActivityCallback.Stub.getMax.toString : ITrustedWebActivityCallback.Stub.getMax.hashCode);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView != null) {
                rootView.getWindowVisibleDisplayFrame(prepare.getMin);
                if (prepare.getMin.left < 0 && prepare.getMin.top < 0) {
                    Resources resources = prepare.setMax.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    prepare.getMin.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(prepare.toIntRange);
                view.getLocationOnScreen(prepare.IsOverlapping);
                int[] iArr = prepare.IsOverlapping;
                iArr[0] = iArr[0] - prepare.toIntRange[0];
                int[] iArr2 = prepare.IsOverlapping;
                iArr2[1] = iArr2[1] - prepare.toIntRange[1];
                layoutParams.x = (prepare.IsOverlapping[0] + i4) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                prepare.getMax.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = prepare.getMax.getMeasuredHeight();
                int i6 = ((prepare.IsOverlapping[1] + i2) - dimensionPixelOffset3) - measuredHeight;
                int i7 = prepare.IsOverlapping[1] + i + dimensionPixelOffset3;
                if (z2) {
                    if (i6 < 0) {
                        layoutParams.y = i7;
                    }
                } else if (measuredHeight + i7 <= prepare.getMin.height()) {
                    layoutParams.y = i7;
                }
                layoutParams.y = i6;
            }
            ((WindowManager) prepare.setMax.getSystemService("window")).addView(prepare.getMax, prepare.length);
            this.length.addOnAttachStateChangeListener(this);
            if (this.IsOverlapping) {
                j = 2500;
            } else {
                if ((ViewCompat.getCause(this.length) & 1) == 1) {
                    j2 = 3000;
                    i3 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    i3 = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i3);
            }
            this.length.removeCallbacks(this.getMin);
            this.length.postDelayed(this.getMin, j);
        }
    }

    /* access modifiers changed from: package-private */
    public void setMax() {
        if (toDoubleRange == this) {
            toDoubleRange = null;
            prepare prepare = this.toIntRange;
            if (prepare != null) {
                if (prepare.getMax()) {
                    ((WindowManager) prepare.setMax.getSystemService("window")).removeView(prepare.getMax);
                }
                this.toIntRange = null;
                getMax();
                this.length.removeOnAttachStateChangeListener(this);
            }
        }
        if (isInside == this) {
            getMin((prepareFromSearch) null);
        }
        this.length.removeCallbacks(this.getMin);
    }

    private static void getMin(prepareFromSearch preparefromsearch) {
        prepareFromSearch preparefromsearch2 = isInside;
        if (preparefromsearch2 != null) {
            preparefromsearch2.setMin();
        }
        isInside = preparefromsearch;
        if (preparefromsearch != null) {
            preparefromsearch.getMin();
        }
    }

    private void getMin() {
        this.length.postDelayed(this.setMax, (long) ViewConfiguration.getLongPressTimeout());
    }

    private void setMin() {
        this.length.removeCallbacks(this.setMax);
    }

    private boolean setMin(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.toFloatRange) <= this.getMax && Math.abs(y - this.equals) <= this.getMax) {
            return false;
        }
        this.toFloatRange = x;
        this.equals = y;
        return true;
    }

    private void getMax() {
        this.toFloatRange = Integer.MAX_VALUE;
        this.equals = Integer.MAX_VALUE;
    }
}
