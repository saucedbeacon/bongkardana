package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.Map;
import o.NonNull;
import o.dismissPopups;
import o.getActionBarHideOffset;
import o.getNestedScrollAxes;
import o.hasIcon;
import o.pullChildren;
import o.setActionBarHideOffset;
import o.setHideOnContentScrollEnabled;
import o.setMenu;

public class ChangeBounds extends Transition {
    private static getNestedScrollAxes FastBitmap$CoordinateSystem = new getNestedScrollAxes();
    private static final Property<View, PointF> IsOverlapping = new Property<View, PointF>(PointF.class, "position") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            dismissPopups.length(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    };
    private static final Property<View, PointF> equals = new Property<View, PointF>(PointF.class, "topLeft") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            dismissPopups.length(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };
    private static final String[] getMax = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<setMin, PointF> getMin = new Property<setMin, PointF>(PointF.class, "bottomRight") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            setMin setmin = (setMin) obj;
            PointF pointF = (PointF) obj2;
            setmin.setMax = Math.round(pointF.x);
            setmin.getMin = Math.round(pointF.y);
            setmin.isInside++;
            if (setmin.setMin == setmin.isInside) {
                setmin.length();
            }
        }
    };
    private static final Property<setMin, PointF> length = new Property<setMin, PointF>(PointF.class, "topLeft") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            setMin setmin = (setMin) obj;
            PointF pointF = (PointF) obj2;
            setmin.getMax = Math.round(pointF.x);
            setmin.length = Math.round(pointF.y);
            setmin.setMin++;
            if (setmin.setMin == setmin.isInside) {
                setmin.length();
            }
        }
    };
    private static final Property<View, PointF> setMax = new Property<View, PointF>(PointF.class, "bottomRight") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            dismissPopups.length(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };
    private static final Property<Drawable, PointF> setMin = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {
        private Rect setMax = new Rect();

        public final /* synthetic */ Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.setMax);
            return new PointF((float) this.setMax.left, (float) this.setMax.top);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.setMax);
            this.setMax.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.setMax);
        }
    };
    private boolean isInside = false;
    private boolean toFloatRange = false;
    private int[] toIntRange = new int[2];

    public ChangeBounds() {
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setActionBarHideOffset.setMax);
        boolean length2 = NonNull.length(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        this.toFloatRange = length2;
    }

    @Nullable
    public String[] getTransitionProperties() {
        return getMax;
    }

    private void getMin(hasIcon hasicon) {
        View view = hasicon.setMin;
        if (ViewCompat.asInterface(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            hasicon.setMax.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hasicon.setMax.put("android:changeBounds:parent", hasicon.setMin.getParent());
            if (this.isInside) {
                hasicon.setMin.getLocationInWindow(this.toIntRange);
                hasicon.setMax.put("android:changeBounds:windowX", Integer.valueOf(this.toIntRange[0]));
                hasicon.setMax.put("android:changeBounds:windowY", Integer.valueOf(this.toIntRange[1]));
            }
            if (this.toFloatRange) {
                hasicon.setMax.put("android:changeBounds:clip", ViewCompat.setDefaultImpl(view));
            }
        }
    }

    public void captureStartValues(@androidx.annotation.NonNull hasIcon hasicon) {
        getMin(hasicon);
    }

    public void captureEndValues(@androidx.annotation.NonNull hasIcon hasicon) {
        getMin(hasicon);
    }

    private boolean length(View view, View view2) {
        if (!this.isInside) {
            return true;
        }
        hasIcon matchedTransitionValues = getMatchedTransitionValues(view, true);
        if (matchedTransitionValues == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == matchedTransitionValues.setMin) {
            return true;
        }
        return false;
    }

    @Nullable
    public Animator createAnimator(@androidx.annotation.NonNull ViewGroup viewGroup, @Nullable hasIcon hasicon, @Nullable hasIcon hasicon2) {
        PropertyValuesHolder propertyValuesHolder;
        int i;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i2;
        ObjectAnimator objectAnimator2;
        ObjectAnimator objectAnimator3;
        ObjectAnimator objectAnimator4;
        ObjectAnimator objectAnimator5;
        int i3;
        hasIcon hasicon3 = hasicon;
        hasIcon hasicon4 = hasicon2;
        if (hasicon3 == null || hasicon4 == null) {
            return null;
        }
        Map<String, Object> map = hasicon3.setMax;
        Map<String, Object> map2 = hasicon4.setMax;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = hasicon4.setMin;
        if (length(viewGroup2, viewGroup3)) {
            Rect rect = (Rect) hasicon3.setMax.get("android:changeBounds:bounds");
            Rect rect2 = (Rect) hasicon4.setMax.get("android:changeBounds:bounds");
            int i4 = rect.left;
            int i5 = rect2.left;
            int i6 = rect.top;
            int i7 = rect2.top;
            int i8 = rect.right;
            int i9 = rect2.right;
            int i10 = rect.bottom;
            final int i11 = rect2.bottom;
            int i12 = i8 - i4;
            int i13 = i10 - i6;
            int i14 = i9 - i5;
            int i15 = i11 - i7;
            View view3 = view2;
            Rect rect3 = (Rect) hasicon3.setMax.get("android:changeBounds:clip");
            Rect rect4 = (Rect) hasicon4.setMax.get("android:changeBounds:clip");
            if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
                i = 0;
            } else {
                i = (i4 == i5 && i6 == i7) ? 0 : 1;
                if (!(i8 == i9 && i10 == i11)) {
                    i++;
                }
            }
            if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            Rect rect5 = rect4;
            if (!this.toFloatRange) {
                view = view3;
                dismissPopups.length(view, i4, i6, i8, i10);
                if (i == 2) {
                    if (i12 == i14 && i13 == i15) {
                        Path path = getPathMotion().getPath((float) i4, (float) i6, (float) i5, (float) i7);
                        Property<View, PointF> property = IsOverlapping;
                        if (Build.VERSION.SDK_INT >= 21) {
                            animator = ObjectAnimator.ofObject(view, property, (TypeConverter) null, path);
                        } else {
                            animator = ObjectAnimator.ofFloat(view, new pullChildren(property, path), new float[]{0.0f, 1.0f});
                        }
                    } else {
                        final setMin setmin = new setMin(view);
                        Path path2 = getPathMotion().getPath((float) i4, (float) i6, (float) i5, (float) i7);
                        Property<setMin, PointF> property2 = length;
                        if (Build.VERSION.SDK_INT >= 21) {
                            objectAnimator4 = ObjectAnimator.ofObject(setmin, property2, (TypeConverter) null, path2);
                        } else {
                            objectAnimator4 = ObjectAnimator.ofFloat(setmin, new pullChildren(property2, path2), new float[]{0.0f, 1.0f});
                        }
                        Path path3 = getPathMotion().getPath((float) i8, (float) i10, (float) i9, (float) i11);
                        Property<setMin, PointF> property3 = getMin;
                        if (Build.VERSION.SDK_INT >= 21) {
                            objectAnimator5 = ObjectAnimator.ofObject(setmin, property3, (TypeConverter) null, path3);
                            i3 = 2;
                        } else {
                            pullChildren pullchildren = new pullChildren(property3, path3);
                            i3 = 2;
                            objectAnimator5 = ObjectAnimator.ofFloat(setmin, pullchildren, new float[]{0.0f, 1.0f});
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        Animator[] animatorArr = new Animator[i3];
                        animatorArr[0] = objectAnimator4;
                        animatorArr[1] = objectAnimator5;
                        animatorSet.playTogether(animatorArr);
                        animatorSet.addListener(new AnimatorListenerAdapter() {
                            private setMin mViewBounds = setmin;
                        });
                        animator = animatorSet;
                    }
                } else if (i4 == i5 && i6 == i7) {
                    Path path4 = getPathMotion().getPath((float) i8, (float) i10, (float) i9, (float) i11);
                    Property<View, PointF> property4 = setMax;
                    if (Build.VERSION.SDK_INT >= 21) {
                        animator = ObjectAnimator.ofObject(view, property4, (TypeConverter) null, path4);
                    } else {
                        animator = ObjectAnimator.ofFloat(view, new pullChildren(property4, path4), new float[]{0.0f, 1.0f});
                    }
                } else {
                    Path path5 = getPathMotion().getPath((float) i4, (float) i6, (float) i5, (float) i7);
                    Property<View, PointF> property5 = equals;
                    if (Build.VERSION.SDK_INT >= 21) {
                        animator = ObjectAnimator.ofObject(view, property5, (TypeConverter) null, path5);
                    } else {
                        animator = ObjectAnimator.ofFloat(view, new pullChildren(property5, path5), new float[]{0.0f, 1.0f});
                    }
                }
            } else {
                view = view3;
                dismissPopups.length(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
                if (i4 == i5 && i6 == i7) {
                    objectAnimator = null;
                } else {
                    Path path6 = getPathMotion().getPath((float) i4, (float) i6, (float) i5, (float) i7);
                    Property<View, PointF> property6 = IsOverlapping;
                    if (Build.VERSION.SDK_INT >= 21) {
                        objectAnimator3 = ObjectAnimator.ofObject(view, property6, (TypeConverter) null, path6);
                    } else {
                        objectAnimator3 = ObjectAnimator.ofFloat(view, new pullChildren(property6, path6), new float[]{0.0f, 1.0f});
                    }
                    objectAnimator = objectAnimator3;
                }
                if (rect3 == null) {
                    i2 = 0;
                    rect3 = new Rect(0, 0, i12, i13);
                } else {
                    i2 = 0;
                }
                Rect rect6 = rect5 == null ? new Rect(i2, i2, i14, i15) : rect5;
                if (!rect3.equals(rect6)) {
                    ViewCompat.getMin(view, rect3);
                    getNestedScrollAxes getnestedscrollaxes = FastBitmap$CoordinateSystem;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect3;
                    objArr[1] = rect6;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", getnestedscrollaxes, objArr);
                    final View view4 = view;
                    final Rect rect7 = rect5;
                    final int i16 = i5;
                    final int i17 = i7;
                    final int i18 = i9;
                    ofObject.addListener(new AnimatorListenerAdapter() {
                        private boolean toFloatRange;

                        public final void onAnimationCancel(Animator animator) {
                            this.toFloatRange = true;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (!this.toFloatRange) {
                                ViewCompat.getMin(view4, rect7);
                                dismissPopups.length(view4, i16, i17, i18, i11);
                            }
                        }
                    });
                    objectAnimator2 = ofObject;
                } else {
                    objectAnimator2 = null;
                }
                animator = setHideOnContentScrollEnabled.getMin(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                final ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                setMenu.getMax(viewGroup4, true);
                addListener(new getActionBarHideOffset() {
                    boolean getMax = false;

                    public final void onTransitionCancel(@androidx.annotation.NonNull Transition transition) {
                        setMenu.getMax(viewGroup4, false);
                        this.getMax = true;
                    }

                    public final void onTransitionEnd(@androidx.annotation.NonNull Transition transition) {
                        if (!this.getMax) {
                            setMenu.getMax(viewGroup4, false);
                        }
                        transition.removeListener(this);
                    }

                    public final void onTransitionPause(@androidx.annotation.NonNull Transition transition) {
                        setMenu.getMax(viewGroup4, false);
                    }

                    public final void onTransitionResume(@androidx.annotation.NonNull Transition transition) {
                        setMenu.getMax(viewGroup4, true);
                    }
                });
            }
            return animator;
        }
        int intValue = ((Integer) hasicon3.setMax.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) hasicon3.setMax.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) hasicon4.setMax.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) hasicon4.setMax.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.toIntRange);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float min = dismissPopups.getMin(view2);
        dismissPopups.getMax(view2, 0.0f);
        dismissPopups.setMax(viewGroup).setMax(bitmapDrawable);
        PathMotion pathMotion = getPathMotion();
        int[] iArr = this.toIntRange;
        Path path7 = pathMotion.getPath((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1]));
        Property<Drawable, PointF> property7 = setMin;
        if (Build.VERSION.SDK_INT >= 21) {
            propertyValuesHolder = PropertyValuesHolder.ofObject(property7, (TypeConverter) null, path7);
        } else {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(new pullChildren(property7, path7), new float[]{0.0f, 1.0f});
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{propertyValuesHolder});
        final ViewGroup viewGroup5 = viewGroup;
        final BitmapDrawable bitmapDrawable2 = bitmapDrawable;
        final View view5 = view2;
        final float f = min;
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                dismissPopups.setMax(viewGroup5).length(bitmapDrawable2);
                dismissPopups.getMax(view5, f);
            }
        });
        return ofPropertyValuesHolder;
    }

    static class setMin {
        int getMax;
        int getMin;
        int isInside;
        int length;
        int setMax;
        int setMin;
        private View toFloatRange;

        setMin(View view) {
            this.toFloatRange = view;
        }

        /* access modifiers changed from: package-private */
        public final void length() {
            dismissPopups.length(this.toFloatRange, this.getMax, this.length, this.setMax, this.getMin);
            this.setMin = 0;
            this.isInside = 0;
        }
    }
}
