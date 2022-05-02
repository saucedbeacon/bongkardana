package o;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.LithoView;
import java.util.List;

public final class computeScroll {
    public static final requestChildFocus IsOverlapping = new toFloatRange((byte) 0);
    public static final requestChildFocus equals = new setMax((byte) 0);
    public static final requestChildFocus getMax = new setMin((byte) 0);
    public static final requestChildFocus getMin = new toIntRange((byte) 0);
    public static final requestChildFocus[] isInside = {length, getMin, setMin, getMax};
    public static final requestChildFocus length = new equals((byte) 0);
    public static final requestChildFocus setMax = new getMax((byte) 0);
    public static final requestChildFocus setMin = new IsOverlapping((byte) 0);
    public static final requestChildFocus toFloatRange = new length((byte) 0);
    public static final requestChildFocus toIntRange = new getMin((byte) 0);

    static class equals implements requestChildFocus {
        public final String setMin() {
            return "x";
        }

        private equals() {
        }

        /* synthetic */ equals(byte b) {
            this();
        }

        public final float getMin(Object obj) {
            return computeScroll.setMin(computeScroll.length(obj, this), true);
        }

        public final float getMax(access$setStartingWakeLock$cp access_setstartingwakelock_cp) {
            return (float) access_setstartingwakelock_cp.setMin().left;
        }

        public final void setMin(Object obj, float f) {
            if (obj instanceof LithoView) {
                ((View) obj).setX(f);
            } else if (obj instanceof View) {
                View view = (View) obj;
                view.setX(f - computeScroll.setMin((View) view.getParent(), true));
            } else if (obj instanceof Drawable) {
                Drawable drawable = (Drawable) obj;
                int min = (int) (f - computeScroll.setMin(computeScroll.setMax(drawable), true));
                int i = drawable.getBounds().top;
                Rect bounds = drawable.getBounds();
                drawable.setBounds(min, i, bounds.width() + min, bounds.height() + i);
            } else {
                throw new UnsupportedOperationException("Setting X on unsupported mount content: ".concat(String.valueOf(obj)));
            }
        }

        public final void setMax(Object obj) {
            if (obj instanceof View) {
                ((View) obj).setTranslationX(0.0f);
            }
        }
    }

    static class toIntRange implements requestChildFocus {
        public final String setMin() {
            return "y";
        }

        private toIntRange() {
        }

        /* synthetic */ toIntRange(byte b) {
            this();
        }

        public final float getMin(Object obj) {
            return computeScroll.setMin(computeScroll.length(obj, this), false);
        }

        public final float getMax(access$setStartingWakeLock$cp access_setstartingwakelock_cp) {
            return (float) access_setstartingwakelock_cp.setMin().top;
        }

        public final void setMin(Object obj, float f) {
            if (obj instanceof LithoView) {
                ((View) obj).setY(f);
            } else if (obj instanceof View) {
                View view = (View) obj;
                view.setY(f - computeScroll.setMin((View) view.getParent(), false));
            } else if (obj instanceof Drawable) {
                Drawable drawable = (Drawable) obj;
                float min = computeScroll.setMin(computeScroll.setMax(drawable), false);
                int i = drawable.getBounds().left;
                int i2 = (int) (f - min);
                Rect bounds = drawable.getBounds();
                drawable.setBounds(i, i2, bounds.width() + i, bounds.height() + i2);
            } else {
                throw new UnsupportedOperationException("Setting Y on unsupported mount content: ".concat(String.valueOf(obj)));
            }
        }

        public final void setMax(Object obj) {
            if (obj instanceof View) {
                ((View) obj).setTranslationY(0.0f);
            }
        }
    }

    static class IsOverlapping implements requestChildFocus {
        public final void setMax(Object obj) {
        }

        public final String setMin() {
            return "width";
        }

        private IsOverlapping() {
        }

        /* synthetic */ IsOverlapping(byte b) {
            this();
        }

        public final float getMin(Object obj) {
            return (float) computeScroll.length(obj, this).getWidth();
        }

        public final float getMax(access$setStartingWakeLock$cp access_setstartingwakelock_cp) {
            return (float) access_setstartingwakelock_cp.setMin().width();
        }

        public final void setMin(Object obj, float f) {
            if (obj instanceof ComponentHost) {
                ComponentHost componentHost = (ComponentHost) obj;
                if (componentHost instanceof LithoView) {
                    ((LithoView) componentHost).setAnimatedWidth((int) f);
                } else {
                    int left = componentHost.getLeft();
                    getWorkEnqueuer.length(componentHost, left, componentHost.getTop(), (int) (((float) left) + f), componentHost.getBottom(), false);
                }
                List<Drawable> linkedDrawablesForAnimation = componentHost.getLinkedDrawablesForAnimation();
                if (linkedDrawablesForAnimation != null) {
                    int i = (int) f;
                    int height = componentHost.getHeight();
                    for (int i2 = 0; i2 < linkedDrawablesForAnimation.size(); i2++) {
                        getWorkEnqueuer.setMax(linkedDrawablesForAnimation.get(i2), i, height);
                    }
                }
            } else if (obj instanceof View) {
                View view = (View) obj;
                int left2 = view.getLeft();
                getWorkEnqueuer.length(view, left2, view.getTop(), (int) (((float) left2) + f), view.getBottom(), false);
            } else if (obj instanceof Drawable) {
                Drawable drawable = (Drawable) obj;
                getWorkEnqueuer.setMax(drawable, (int) f, drawable.getBounds().height());
            } else {
                throw new UnsupportedOperationException("Setting width on unsupported mount content: ".concat(String.valueOf(obj)));
            }
        }
    }

    static class setMin implements requestChildFocus {
        public final void setMax(Object obj) {
        }

        public final String setMin() {
            return "height";
        }

        private setMin() {
        }

        /* synthetic */ setMin(byte b) {
            this();
        }

        public final float getMin(Object obj) {
            return (float) computeScroll.length(obj, this).getHeight();
        }

        public final float getMax(access$setStartingWakeLock$cp access_setstartingwakelock_cp) {
            return (float) access_setstartingwakelock_cp.setMin().height();
        }

        public final void setMin(Object obj, float f) {
            if (obj instanceof ComponentHost) {
                ComponentHost componentHost = (ComponentHost) obj;
                if (componentHost instanceof LithoView) {
                    ((LithoView) componentHost).setAnimatedHeight((int) f);
                } else {
                    int top = componentHost.getTop();
                    getWorkEnqueuer.length(componentHost, componentHost.getLeft(), top, componentHost.getRight(), (int) (((float) top) + f), false);
                }
                List<Drawable> linkedDrawablesForAnimation = componentHost.getLinkedDrawablesForAnimation();
                if (linkedDrawablesForAnimation != null) {
                    int width = componentHost.getWidth();
                    int i = (int) f;
                    for (int i2 = 0; i2 < linkedDrawablesForAnimation.size(); i2++) {
                        getWorkEnqueuer.setMax(linkedDrawablesForAnimation.get(i2), width, i);
                    }
                }
            } else if (obj instanceof View) {
                View view = (View) obj;
                int top2 = view.getTop();
                getWorkEnqueuer.length(view, view.getLeft(), top2, view.getRight(), (int) (((float) top2) + f), false);
            } else if (obj instanceof Drawable) {
                Drawable drawable = (Drawable) obj;
                getWorkEnqueuer.setMax(drawable, drawable.getBounds().width(), (int) f);
            } else {
                throw new UnsupportedOperationException("Setting height on unsupported mount content: ".concat(String.valueOf(obj)));
            }
        }
    }

    static class getMax implements requestChildFocus {
        public final String setMin() {
            return "alpha";
        }

        private getMax() {
        }

        /* synthetic */ getMax(byte b) {
            this();
        }

        public final float getMin(Object obj) {
            if (obj instanceof View) {
                return ((View) obj).getAlpha();
            }
            if (!keyToDirection.ICustomTabsService) {
                throw new UnsupportedOperationException("Tried to get alpha of unsupported mount content: ".concat(String.valueOf(obj)));
            } else if (obj instanceof Drawable) {
                Drawable drawable = (Drawable) obj;
                if (Build.VERSION.SDK_INT >= 19) {
                    return ((float) drawable.getAlpha()) / 255.0f;
                }
                return 1.0f;
            } else {
                throw new UnsupportedOperationException("Tried to get alpha of unsupported mount content: ".concat(String.valueOf(obj)));
            }
        }

        public final float getMax(access$setStartingWakeLock$cp access_setstartingwakelock_cp) {
            if (access_setstartingwakelock_cp.toFloatRange()) {
                return access_setstartingwakelock_cp.setMax();
            }
            return 1.0f;
        }

        public final void setMin(Object obj, float f) {
            if (obj instanceof View) {
                ((View) obj).setAlpha(f);
            } else if (!keyToDirection.ICustomTabsService) {
                throw new UnsupportedOperationException("Setting alpha on unsupported mount content: ".concat(String.valueOf(obj)));
            } else if (obj instanceof Drawable) {
                ((Drawable) obj).setAlpha((int) (f * 255.0f));
            } else {
                throw new UnsupportedOperationException("Setting alpha on unsupported mount content: ".concat(String.valueOf(obj)));
            }
        }

        public final void setMax(Object obj) {
            setMin(obj, 1.0f);
        }
    }

    static class length implements requestChildFocus {
        public final String setMin() {
            return "scale";
        }

        private length() {
        }

        /* synthetic */ length(byte b) {
            this();
        }

        public final float getMin(Object obj) {
            View length = computeScroll.length(obj, this);
            float scaleX = length.getScaleX();
            if (scaleX == length.getScaleY()) {
                return scaleX;
            }
            throw new RuntimeException("Tried to get scale of view, but scaleX and scaleY are different");
        }

        public final float getMax(access$setStartingWakeLock$cp access_setstartingwakelock_cp) {
            if (access_setstartingwakelock_cp.getMin()) {
                return access_setstartingwakelock_cp.length();
            }
            return 1.0f;
        }

        public final void setMin(Object obj, float f) {
            View length = computeScroll.length(obj, this);
            length.setScaleX(f);
            length.setScaleY(f);
        }

        public final void setMax(Object obj) {
            View length = computeScroll.length(obj, this);
            length.setScaleX(1.0f);
            length.setScaleY(1.0f);
        }
    }

    static class setMax implements requestChildFocus {
        public final float getMax(access$setStartingWakeLock$cp access_setstartingwakelock_cp) {
            return 1.0f;
        }

        public final String setMin() {
            return "scale_x";
        }

        private setMax() {
        }

        /* synthetic */ setMax(byte b) {
            this();
        }

        public final float getMin(Object obj) {
            return computeScroll.length(obj, this).getScaleX();
        }

        public final void setMin(Object obj, float f) {
            computeScroll.length(obj, this).setScaleX(f);
        }

        public final void setMax(Object obj) {
            computeScroll.length(obj, this).setScaleX(1.0f);
        }
    }

    static class toFloatRange implements requestChildFocus {
        public final float getMax(access$setStartingWakeLock$cp access_setstartingwakelock_cp) {
            return 1.0f;
        }

        public final String setMin() {
            return "scale_y";
        }

        private toFloatRange() {
        }

        /* synthetic */ toFloatRange(byte b) {
            this();
        }

        public final float getMin(Object obj) {
            return computeScroll.length(obj, this).getScaleY();
        }

        public final void setMin(Object obj, float f) {
            computeScroll.length(obj, this).setScaleY(f);
        }

        public final void setMax(Object obj) {
            computeScroll.length(obj, this).setScaleY(1.0f);
        }
    }

    static class getMin implements requestChildFocus {
        public final String setMin() {
            return "rotation";
        }

        private getMin() {
        }

        /* synthetic */ getMin(byte b) {
            this();
        }

        public final float getMin(Object obj) {
            return computeScroll.length(obj, this).getRotation();
        }

        public final float getMax(access$setStartingWakeLock$cp access_setstartingwakelock_cp) {
            if (access_setstartingwakelock_cp.toIntRange()) {
                return access_setstartingwakelock_cp.getMax();
            }
            return 0.0f;
        }

        public final void setMin(Object obj, float f) {
            computeScroll.length(obj, this).setRotation(f);
        }

        public final void setMax(Object obj) {
            computeScroll.length(obj, this).setRotation(0.0f);
        }
    }

    static /* synthetic */ View length(Object obj, requestChildFocus requestchildfocus) {
        if (obj instanceof View) {
            return (View) obj;
        }
        StringBuilder sb = new StringBuilder("Animating '");
        sb.append(requestchildfocus.setMin());
        sb.append("' is only supported on Views (got ");
        sb.append(obj);
        sb.append(")");
        throw new RuntimeException(sb.toString());
    }

    static /* synthetic */ float setMin(View view, boolean z) {
        float f = 0.0f;
        while (view != null) {
            if (view instanceof LithoView) {
                return f;
            }
            f += z ? view.getX() : view.getY();
            if (view.getParent() instanceof View) {
                view = (View) view.getParent();
            } else {
                StringBuilder sb = new StringBuilder("Expected parent to be View, was ");
                sb.append(view.getParent());
                throw new RuntimeException(sb.toString());
            }
        }
        throw new RuntimeException("Got unexpected null parent");
    }

    static /* synthetic */ View setMax(Drawable drawable) {
        Drawable.Callback callback;
        while (true) {
            callback = drawable.getCallback();
            if (!(callback instanceof Drawable)) {
                break;
            }
            drawable = (Drawable) callback;
        }
        if (callback instanceof View) {
            return (View) callback;
        }
        return null;
    }
}
