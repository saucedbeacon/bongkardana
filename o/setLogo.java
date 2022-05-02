package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import java.util.ArrayList;

class setLogo implements restoreToolbarHierarchyState {
    protected setMax length;

    setLogo(Context context, ViewGroup viewGroup, View view) {
        this.length = new setMax(context, viewGroup, view, this);
    }

    static ViewGroup setMin(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    static setLogo length(View view) {
        ViewGroup min = setMin(view);
        if (min == null) {
            return null;
        }
        int childCount = min.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = min.getChildAt(i);
            if (childAt instanceof setMax) {
                return ((setMax) childAt).length;
            }
        }
        return new setWindowTitle(min.getContext(), min, view);
    }

    public void setMax(@NonNull Drawable drawable) {
        this.length.setMin(drawable);
    }

    public void length(@NonNull Drawable drawable) {
        this.length.setMax(drawable);
    }

    static class setMax extends ViewGroup {
        static Method getMax;
        private boolean IsOverlapping;
        View getMin;
        setLogo length;
        ViewGroup setMax;
        ArrayList<Drawable> setMin = null;

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                getMax = cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        setMax(Context context, ViewGroup viewGroup, View view, setLogo setlogo) {
            super(context);
            this.setMax = viewGroup;
            this.getMin = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.length = setlogo;
        }

        public void setMin(Drawable drawable) {
            setMin();
            if (this.setMin == null) {
                this.setMin = new ArrayList<>();
            }
            if (!this.setMin.contains(drawable)) {
                this.setMin.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        public void setMax(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.setMin;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                getMax();
            }
        }

        /* access modifiers changed from: protected */
        public boolean verifyDrawable(@NonNull Drawable drawable) {
            if (super.verifyDrawable(drawable)) {
                return true;
            }
            ArrayList<Drawable> arrayList = this.setMin;
            return arrayList != null && arrayList.contains(drawable);
        }

        public void getMax(View view) {
            setMin();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.setMax || viewGroup.getParent() == null || !ViewCompat.ICustomTabsService(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.setMax.getLocationOnScreen(iArr2);
                    ViewCompat.toFloatRange(view, iArr[0] - iArr2[0]);
                    ViewCompat.equals(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        public void getMin(View view) {
            super.removeView(view);
            getMax();
        }

        private void setMin() {
            if (this.IsOverlapping) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void getMax() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.setMin;
                if (arrayList == null || arrayList.size() == 0) {
                    this.IsOverlapping = true;
                    this.setMax.removeView(this);
                }
            }
        }

        public void invalidateDrawable(@NonNull Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.setMax.getLocationOnScreen(iArr);
            this.getMin.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.getMin.getWidth(), this.getMin.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.setMin;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.setMin.get(i).draw(canvas);
            }
        }

        private void getMax(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.setMax.getLocationOnScreen(iArr2);
            this.getMin.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.setMax == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.setMax instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                getMax(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }
    }
}
