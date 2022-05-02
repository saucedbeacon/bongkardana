package androidx.core.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.core.view.WindowInsetsCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import o.AppCompatActivity;
import o.fromInclusive;
import o.getSupportActionBar;
import o.invalidateOptionsMenu;
import o.onPostCreate;
import o.onStart;
import o.onSupportActionModeFinished;
import o.setOnCancelListener;
import o.setOnItemSelectedListener;
import o.setSupportActionBar;
import o.setSupportProgressBarIndeterminateVisibility;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class ViewCompat {
    private static Field FastBitmap$CoordinateSystem;
    private static WeakHashMap<View, String> IsOverlapping;
    private static Method equals;
    private static boolean getMax;
    private static Field getMin;
    private static boolean hashCode = false;
    private static setMax invoke = new setMax();
    private static final onPostCreate invokeSuspend = new onPostCreate() {
        public ContentInfoCompat onReceiveContent(@NonNull ContentInfoCompat contentInfoCompat) {
            return contentInfoCompat;
        }
    };
    private static WeakHashMap<View, invalidateOptionsMenu> isInside = null;
    private static boolean length;
    private static Field setMax;
    private static final AtomicInteger setMin = new AtomicInteger(1);
    private static final int[] toDoubleRange = {fromInclusive.getMax.getMin, fromInclusive.getMax.getMax, fromInclusive.getMax.values, fromInclusive.getMax.getCause, fromInclusive.getMax.extraCallback, fromInclusive.getMax.onPostMessage, fromInclusive.getMax.extraCallbackWithResult, fromInclusive.getMax.ICustomTabsCallback$Default, fromInclusive.getMax.asInterface, fromInclusive.getMax.onTransact, fromInclusive.getMax.setMax, fromInclusive.getMax.length, fromInclusive.getMax.isInside, fromInclusive.getMax.toFloatRange, fromInclusive.getMax.IsOverlapping, fromInclusive.getMax.toIntRange, fromInclusive.getMax.equals, fromInclusive.getMax.toDoubleRange, fromInclusive.getMax.FastBitmap$CoordinateSystem, fromInclusive.getMax.toString, fromInclusive.getMax.hashCode, fromInclusive.getMax.Grayscale$Algorithm, fromInclusive.getMax.Mean$Arithmetic, fromInclusive.getMax.valueOf, fromInclusive.getMax.invoke, fromInclusive.getMax.invokeSuspend, fromInclusive.getMax.create, fromInclusive.getMax.b, fromInclusive.getMax.ICustomTabsCallback, fromInclusive.getMax.onNavigationEvent, fromInclusive.getMax.onMessageChannelReady, fromInclusive.getMax.onRelationshipValidationResult};
    private static Method toFloatRange;
    private static boolean toIntRange;
    private static Method toString;
    private static ThreadLocal<Rect> values;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusDirection {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRealDirection {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRelativeDirection {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NestedScrollType {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollAxis {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollIndicators {
    }

    public interface toIntRange {
        boolean getMin(View view, KeyEvent keyEvent);
    }

    private static Rect length() {
        if (values == null) {
            values = new ThreadLocal<>();
        }
        Rect rect = values.get();
        if (rect == null) {
            rect = new Rect();
            values.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void getMax(@NonNull View view, @SuppressLint({"ContextFirst"}) @NonNull Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            length.setMin(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    @Deprecated
    public static boolean setMax(View view, int i) {
        return view.canScrollVertically(i);
    }

    @Deprecated
    public static int getMin(View view) {
        return view.getOverScrollMode();
    }

    @Deprecated
    public static void getMax(View view, int i) {
        view.setOverScrollMode(i);
    }

    public static void setMin(@NonNull View view, onSupportActionModeFinished onsupportactionmodefinished) {
        view.onInitializeAccessibilityNodeInfo(onsupportactionmodefinished.getMin());
    }

    public static void getMin(@NonNull View view, setOnCancelListener setoncancellistener) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (setoncancellistener == null && (warmup(view) instanceof setOnCancelListener.setMin)) {
            setoncancellistener = new setOnCancelListener();
        }
        if (setoncancellistener == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = setoncancellistener.getBridge();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    @SuppressLint({"InlinedApi"})
    public static int setMin(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static void length(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    @Nullable
    public static setOnCancelListener length(@NonNull View view) {
        View.AccessibilityDelegate warmup = warmup(view);
        if (warmup == null) {
            return null;
        }
        if (warmup instanceof setOnCancelListener.setMin) {
            return ((setOnCancelListener.setMin) warmup).setMax;
        }
        return new setOnCancelListener(warmup);
    }

    static setOnCancelListener setMax(@NonNull View view) {
        setOnCancelListener length2 = length(view);
        if (length2 == null) {
            length2 = new setOnCancelListener();
        }
        getMin(view, length2);
        return length2;
    }

    @Nullable
    private static View.AccessibilityDelegate warmup(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        return newSessionWithExtras(view);
    }

    @Nullable
    private static View.AccessibilityDelegate newSessionWithExtras(@NonNull View view) {
        if (hashCode) {
            return null;
        }
        if (FastBitmap$CoordinateSystem == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                FastBitmap$CoordinateSystem = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                hashCode = true;
                return null;
            }
        }
        try {
            Object obj = FastBitmap$CoordinateSystem.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            hashCode = true;
            return null;
        }
    }

    public static boolean getMax(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    public static void getMax(@NonNull View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    public static void equals(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void getMin(@NonNull View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        } else {
            view.postInvalidate(i, i2, i3, i4);
        }
    }

    public static void getMax(@NonNull View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static void getMin(@NonNull View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    public static int isInside(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    public static void setMin(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT < 19) {
            if (Build.VERSION.SDK_INT < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    public static boolean length(@NonNull View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    public static int getMin(@NonNull View view, @NonNull CharSequence charSequence, @NonNull setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility) {
        int length2 = length(view, charSequence);
        if (length2 != -1) {
            length(view, new onSupportActionModeFinished.setMax(length2, charSequence, setsupportprogressbarindeterminatevisibility));
        }
        return length2;
    }

    private static int length(View view, @NonNull CharSequence charSequence) {
        List<onSupportActionModeFinished.setMax> mayLaunchUrl = mayLaunchUrl(view);
        for (int i = 0; i < mayLaunchUrl.size(); i++) {
            if (TextUtils.equals(charSequence, mayLaunchUrl.get(i).getMax())) {
                return mayLaunchUrl.get(i).length();
            }
        }
        int i2 = 0;
        int i3 = -1;
        while (true) {
            int[] iArr = toDoubleRange;
            if (i2 >= iArr.length || i3 != -1) {
                return i3;
            }
            int i4 = iArr[i2];
            boolean z = true;
            for (int i5 = 0; i5 < mayLaunchUrl.size(); i5++) {
                z &= mayLaunchUrl.get(i5).length() != i4;
            }
            if (z) {
                i3 = i4;
            }
            i2++;
        }
        return i3;
    }

    public static void getMin(@NonNull View view, @NonNull onSupportActionModeFinished.setMax setmax, @Nullable CharSequence charSequence, @Nullable setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility) {
        if (setsupportprogressbarindeterminatevisibility == null && charSequence == null) {
            getMin(view, setmax.length());
        } else {
            length(view, setmax.length(charSequence, setsupportprogressbarindeterminatevisibility));
        }
    }

    private static void length(@NonNull View view, @NonNull onSupportActionModeFinished.setMax setmax) {
        if (Build.VERSION.SDK_INT >= 21) {
            setMax(view);
            setMin(setmax.length(), view);
            mayLaunchUrl(view).add(setmax);
            isInside(view, 0);
        }
    }

    public static void getMin(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            setMin(i, view);
            isInside(view, 0);
        }
    }

    private static void setMin(int i, View view) {
        List<onSupportActionModeFinished.setMax> mayLaunchUrl = mayLaunchUrl(view);
        for (int i2 = 0; i2 < mayLaunchUrl.size(); i2++) {
            if (mayLaunchUrl.get(i2).length() == i) {
                mayLaunchUrl.remove(i2);
                return;
            }
        }
    }

    private static List<onSupportActionModeFinished.setMax> mayLaunchUrl(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(fromInclusive.getMax.newSession);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(fromInclusive.getMax.newSession, arrayList2);
        return arrayList2;
    }

    @UiThread
    public static void getMax(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            equals().getMin(view, charSequence);
        }
    }

    @UiThread
    @Nullable
    public static final CharSequence toFloatRange(@NonNull View view) {
        return equals().getMax(view);
    }

    public static void getMin(@NonNull View view, Paint paint) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayerPaint(paint);
            return;
        }
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    public static int IsOverlapping(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static void IsOverlapping(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayoutDirection(i);
        }
    }

    public static ViewParent toIntRange(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    public static int values(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static void toIntRange(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    @Px
    public static int toString(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    @Px
    public static int FastBitmap$CoordinateSystem(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    public static void setMax(@NonNull View view, @Px int i, @Px int i2, @Px int i3, @Px int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    private static void setMax() {
        try {
            toFloatRange = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            equals = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException unused) {
        }
        toIntRange = true;
    }

    public static void hashCode(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.dispatchStartTemporaryDetach();
            return;
        }
        if (!toIntRange) {
            setMax();
        }
        Method method = toFloatRange;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused) {
            }
        } else {
            view.onStartTemporaryDetach();
        }
    }

    public static void toDoubleRange(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.dispatchFinishTemporaryDetach();
            return;
        }
        if (!toIntRange) {
            setMax();
        }
        Method method = equals;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused) {
            }
        } else {
            view.onFinishTemporaryDetach();
        }
    }

    public static int invokeSuspend(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!length) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                setMax = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            length = true;
        }
        Field field = setMax;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static int valueOf(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!getMax) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                getMin = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            getMax = true;
        }
        Field field = getMin;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    @NonNull
    public static invalidateOptionsMenu Grayscale$Algorithm(@NonNull View view) {
        if (isInside == null) {
            isInside = new WeakHashMap<>();
        }
        invalidateOptionsMenu invalidateoptionsmenu = isInside.get(view);
        if (invalidateoptionsmenu != null) {
            return invalidateoptionsmenu;
        }
        invalidateOptionsMenu invalidateoptionsmenu2 = new invalidateOptionsMenu(view);
        isInside.put(view, invalidateoptionsmenu2);
        return invalidateoptionsmenu2;
    }

    @Deprecated
    public static void setMin(View view, float f) {
        view.setTranslationY(f);
    }

    @Deprecated
    public static void getMin(View view, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        view.setAlpha(f);
    }

    @Deprecated
    public static void length(View view, float f) {
        view.setScaleY(f);
    }

    public static void getMax(@NonNull View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    public static float Mean$Arithmetic(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static void setMax(@NonNull View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f);
        }
    }

    public static float invoke(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTranslationZ();
        }
        return 0.0f;
    }

    public static void getMin(@NonNull View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (IsOverlapping == null) {
            IsOverlapping = new WeakHashMap<>();
        }
        IsOverlapping.put(view, str);
    }

    @Nullable
    public static String onNavigationEvent(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = IsOverlapping;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static int getCause(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static void b(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else if (Build.VERSION.SDK_INT >= 16) {
            view.requestFitSystemWindows();
        }
    }

    @Deprecated
    public static void length(ViewGroup viewGroup, boolean z) {
        if (toString == null) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                toString = cls.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            toString.setAccessible(true);
        }
        try {
            toString.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
        }
    }

    public static boolean ICustomTabsCallback(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    @Deprecated
    public static void length(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static void setMax(@NonNull View view, @Nullable AppCompatActivity appCompatActivity) {
        if (Build.VERSION.SDK_INT >= 21) {
            setMin.setMax(view, appCompatActivity);
        }
    }

    @NonNull
    public static WindowInsetsCompat setMin(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets values2;
        if (Build.VERSION.SDK_INT >= 21 && (values2 = windowInsetsCompat.values()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(values2);
            if (!onApplyWindowInsets.equals(values2)) {
                return WindowInsetsCompat.setMax(onApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    @NonNull
    public static WindowInsetsCompat length(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets values2;
        if (Build.VERSION.SDK_INT >= 21 && (values2 = windowInsetsCompat.values()) != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(values2);
            if (!dispatchApplyWindowInsets.equals(values2)) {
                return WindowInsetsCompat.setMax(dispatchApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    @Nullable
    public static WindowInsetsCompat create(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return getMin.getMin(view);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return setMin.length(view);
        }
        return null;
    }

    @NonNull
    public static WindowInsetsCompat getMax(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? setMin.setMax(view, windowInsetsCompat, rect) : windowInsetsCompat;
    }

    @Nullable
    public static String[] onPostMessage(@NonNull View view) {
        return (String[]) view.getTag(fromInclusive.getMax.requestPostMessageChannelWithExtras);
    }

    @Nullable
    public static ContentInfoCompat setMin(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            view.getId();
        }
        getSupportActionBar getsupportactionbar = (getSupportActionBar) view.getTag(fromInclusive.getMax.requestPostMessageChannel);
        if (getsupportactionbar == null) {
            return requestPostMessageChannelWithExtras(view).onReceiveContent(contentInfoCompat);
        }
        ContentInfoCompat min = getsupportactionbar.setMin(view, contentInfoCompat);
        if (min == null) {
            return null;
        }
        return requestPostMessageChannelWithExtras(view).onReceiveContent(min);
    }

    private static onPostCreate requestPostMessageChannelWithExtras(@NonNull View view) {
        if (view instanceof onPostCreate) {
            return (onPostCreate) view;
        }
        return invokeSuspend;
    }

    public static boolean extraCallbackWithResult(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static boolean onMessageChannelReady(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static void getMin(@NonNull View view, @Nullable Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static ColorStateList extraCallback(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof onStart) {
            return ((onStart) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void setMax(@NonNull View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof onStart) {
            ((onStart) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static PorterDuff.Mode onRelationshipValidationResult(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof onStart) {
            return ((onStart) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static void getMin(@NonNull View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof onStart) {
            ((onStart) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static void setMax(@NonNull View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setNestedScrollingEnabled(z);
        } else if (view instanceof setOnItemSelectedListener) {
            ((setOnItemSelectedListener) view).setNestedScrollingEnabled(z);
        }
    }

    public static boolean ICustomTabsCallback$Stub(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof setOnItemSelectedListener) {
            return ((setOnItemSelectedListener) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static void asBinder(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof setOnItemSelectedListener) {
            ((setOnItemSelectedListener) view).stopNestedScroll();
        }
    }

    public static boolean onTransact(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.isInLayout();
        }
        return false;
    }

    public static boolean asInterface(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static float ICustomTabsCallback$Default(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static void isInside(@NonNull View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setZ(f);
        }
    }

    public static void equals(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Rect length2 = length();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                length2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !length2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            toDoubleRange(view, i);
            if (z && length2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(length2);
            }
        } else {
            toDoubleRange(view, i);
        }
    }

    private static void toDoubleRange(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            requestPostMessageChannel(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                requestPostMessageChannel((View) parent);
            }
        }
    }

    public static void toFloatRange(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Rect length2 = length();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                length2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !length2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            toString(view, i);
            if (z && length2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(length2);
            }
        } else {
            toString(view, i);
        }
    }

    private static void toString(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            requestPostMessageChannel(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                requestPostMessageChannel((View) parent);
            }
        }
    }

    private static void requestPostMessageChannel(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void getMin(@NonNull View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    @Nullable
    public static Rect setDefaultImpl(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static boolean ICustomTabsService(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    public static boolean getInterfaceDescriptor(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static void setMax(@NonNull View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    public static void setMin(@NonNull View view, setSupportActionBar setsupportactionbar) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (setsupportactionbar != null ? setsupportactionbar.setMax() : null));
        }
    }

    @Nullable
    public static Display ICustomTabsCallback$Stub$Proxy(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (ICustomTabsService(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static int getMin() {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            i = setMin.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!setMin.compareAndSet(i, i2));
        return i;
    }

    @Deprecated
    protected ViewCompat() {
    }

    @UiThread
    public static boolean length(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return IsOverlapping.getMax(view).getMax(keyEvent);
    }

    @UiThread
    public static boolean setMin(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return IsOverlapping.getMax(view).setMax(view, keyEvent);
    }

    @UiThread
    public static boolean getDefaultImpl(View view) {
        Boolean max = setMin().getMax(view);
        if (max == null) {
            return false;
        }
        return max.booleanValue();
    }

    private static getMax<Boolean> setMin() {
        return new getMax<Boolean>(fromInclusive.getMax.postMessage, Boolean.class, 28) {
            /* access modifiers changed from: package-private */
            @RequiresApi(28)
            /* renamed from: getMin */
            public Boolean length(View view) {
                return Boolean.valueOf(view.isScreenReaderFocusable());
            }

            /* access modifiers changed from: package-private */
            @RequiresApi(28)
            /* renamed from: getMin */
            public void getMax(View view, Boolean bool) {
                view.setScreenReaderFocusable(bool.booleanValue());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: setMin */
            public boolean getMax(Boolean bool, Boolean bool2) {
                return !getMax(bool, bool2);
            }
        };
    }

    @UiThread
    public static CharSequence extraCommand(View view) {
        return getMax().getMax(view);
    }

    private static getMax<CharSequence> getMax() {
        return new getMax<CharSequence>(fromInclusive.getMax.warmup, CharSequence.class, 8, 28) {
            /* access modifiers changed from: package-private */
            @RequiresApi(28)
            /* renamed from: getMin */
            public CharSequence length(View view) {
                return view.getAccessibilityPaneTitle();
            }

            /* access modifiers changed from: package-private */
            @RequiresApi(28)
            public void getMax(View view, CharSequence charSequence) {
                view.setAccessibilityPaneTitle(charSequence);
            }

            /* access modifiers changed from: package-private */
            public boolean getMax(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    private static getMax<CharSequence> equals() {
        return new getMax<CharSequence>(fromInclusive.getMax.validateRelationship, CharSequence.class, 64, 30) {
            /* access modifiers changed from: package-private */
            @RequiresApi(30)
            /* renamed from: setMax */
            public CharSequence length(View view) {
                return view.getStateDescription();
            }

            /* access modifiers changed from: package-private */
            @RequiresApi(30)
            /* renamed from: getMin */
            public void getMax(View view, CharSequence charSequence) {
                view.setStateDescription(charSequence);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: length */
            public boolean getMax(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    @UiThread
    public static boolean newSession(View view) {
        Boolean max = isInside().getMax(view);
        if (max == null) {
            return false;
        }
        return max.booleanValue();
    }

    @UiThread
    public static void getMin(View view, boolean z) {
        isInside().getMin(view, Boolean.valueOf(z));
    }

    private static getMax<Boolean> isInside() {
        return new getMax<Boolean>(fromInclusive.getMax.newSessionWithExtras, Boolean.class, 28) {
            /* access modifiers changed from: package-private */
            @RequiresApi(28)
            /* renamed from: setMin */
            public Boolean length(View view) {
                return Boolean.valueOf(view.isAccessibilityHeading());
            }

            /* access modifiers changed from: package-private */
            @RequiresApi(28)
            /* renamed from: getMin */
            public void getMax(View view, Boolean bool) {
                view.setAccessibilityHeading(bool.booleanValue());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: setMax */
            public boolean getMax(Boolean bool, Boolean bool2) {
                return !getMax(bool, bool2);
            }
        };
    }

    static abstract class getMax<T> {
        private final Class<T> getMax;
        private final int getMin;
        private final int setMax;
        private final int setMin;

        /* access modifiers changed from: package-private */
        public abstract void getMax(View view, T t);

        /* access modifiers changed from: package-private */
        public abstract T length(View view);

        getMax(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        getMax(int i, Class<T> cls, int i2, int i3) {
            this.setMax = i;
            this.getMax = cls;
            this.setMin = i2;
            this.getMin = i3;
        }

        /* access modifiers changed from: package-private */
        public void getMin(View view, T t) {
            if (setMin()) {
                getMax(view, t);
            } else if (length() && getMax(getMax(view), (Object) t)) {
                ViewCompat.setMax(view);
                view.setTag(this.setMax, t);
                ViewCompat.isInside(view, this.setMin);
            }
        }

        /* access modifiers changed from: package-private */
        public T getMax(View view) {
            if (setMin()) {
                return length(view);
            }
            if (!length()) {
                return null;
            }
            T tag = view.getTag(this.setMax);
            if (this.getMax.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        private boolean setMin() {
            return Build.VERSION.SDK_INT >= this.getMin;
        }

        private boolean length() {
            return Build.VERSION.SDK_INT >= 19;
        }

        /* access modifiers changed from: package-private */
        public boolean getMax(T t, T t2) {
            return !t2.equals(t);
        }

        /* access modifiers changed from: package-private */
        public boolean getMax(Boolean bool, Boolean bool2) {
            boolean z;
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            if (bool2 == null) {
                z = false;
            } else {
                z = bool2.booleanValue();
            }
            if (booleanValue == z) {
                return true;
            }
            return false;
        }
    }

    @RequiresApi(19)
    static void isInside(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = extraCommand(view) != null && view.getVisibility() == 0;
            int i2 = 32;
            if (values(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(extraCommand(view));
                    updateVisuals(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(extraCommand(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError unused) {
                    view.getParent();
                }
            }
        }
    }

    private static void updateVisuals(View view) {
        if (isInside(view) == 0) {
            setMin(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (isInside((View) parent) == 4) {
                setMin(view, 2);
                return;
            }
        }
    }

    static class setMax implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        private WeakHashMap<View, Boolean> setMin = new WeakHashMap<>();

        public void onViewDetachedFromWindow(View view) {
        }

        setMax() {
        }

        @RequiresApi(19)
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.setMin.entrySet()) {
                    length((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                }
            }
        }

        @RequiresApi(19)
        public void onViewAttachedToWindow(View view) {
            setMin(view);
        }

        @RequiresApi(19)
        private void length(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                ViewCompat.isInside(view, z2 ? 16 : 32);
                this.setMin.put(view, Boolean.valueOf(z2));
            }
        }

        @RequiresApi(19)
        private void setMin(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    static class IsOverlapping {
        private static final ArrayList<WeakReference<View>> setMin = new ArrayList<>();
        @Nullable
        private WeakHashMap<View, Boolean> getMax = null;
        private WeakReference<KeyEvent> getMin = null;
        private SparseArray<WeakReference<View>> length = null;

        IsOverlapping() {
        }

        private SparseArray<WeakReference<View>> getMax() {
            if (this.length == null) {
                this.length = new SparseArray<>();
            }
            return this.length;
        }

        static IsOverlapping getMax(View view) {
            IsOverlapping isOverlapping = (IsOverlapping) view.getTag(fromInclusive.getMax.ICustomTabsService$Stub$Proxy);
            if (isOverlapping != null) {
                return isOverlapping;
            }
            IsOverlapping isOverlapping2 = new IsOverlapping();
            view.setTag(fromInclusive.getMax.ICustomTabsService$Stub$Proxy, isOverlapping2);
            return isOverlapping2;
        }

        /* access modifiers changed from: package-private */
        public boolean setMax(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                getMin();
            }
            View min = setMin(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (min != null && !KeyEvent.isModifierKey(keyCode)) {
                    getMax().put(keyCode, new WeakReference(min));
                }
            }
            return min != null;
        }

        @Nullable
        private View setMin(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.getMax;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View min = setMin(viewGroup.getChildAt(childCount), keyEvent);
                        if (min != null) {
                            return min;
                        }
                    }
                }
                if (getMax(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean getMax(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.getMin;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.getMin = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> max = getMax();
            if (keyEvent.getAction() == 1 && (indexOfKey = max.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = max.valueAt(indexOfKey);
                max.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = max.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && ViewCompat.ICustomTabsService(view)) {
                getMax(view, keyEvent);
            }
            return true;
        }

        private boolean getMax(@NonNull View view, @NonNull KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(fromInclusive.getMax.receiveFile);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((toIntRange) arrayList.get(size)).getMin(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void getMin() {
            WeakHashMap<View, Boolean> weakHashMap = this.getMax;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!setMin.isEmpty()) {
                synchronized (setMin) {
                    if (this.getMax == null) {
                        this.getMax = new WeakHashMap<>();
                    }
                    for (int size = setMin.size() - 1; size >= 0; size--) {
                        View view = (View) setMin.get(size).get();
                        if (view == null) {
                            setMin.remove(size);
                        } else {
                            this.getMax.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.getMax.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }

    @RequiresApi(21)
    static class setMin {
        @Nullable
        public static WindowInsetsCompat length(@NonNull View view) {
            return WindowInsetsCompat.length.setMin(view);
        }

        static WindowInsetsCompat setMax(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
            WindowInsets values = windowInsetsCompat.values();
            if (values != null) {
                return WindowInsetsCompat.setMax(view.computeSystemWindowInsets(values, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        static void setMax(@NonNull final View view, @Nullable final AppCompatActivity appCompatActivity) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(fromInclusive.getMax.updateVisuals, appCompatActivity);
            }
            if (appCompatActivity == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(fromInclusive.getMax.IPostMessageService));
            } else {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                    WindowInsetsCompat setMax = null;

                    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        WindowInsetsCompat max = WindowInsetsCompat.setMax(windowInsets, view);
                        if (Build.VERSION.SDK_INT < 30) {
                            setMin.getMax(windowInsets, view);
                            if (max.equals(this.setMax)) {
                                return appCompatActivity.onApplyWindowInsets(view, max).values();
                            }
                        }
                        this.setMax = max;
                        WindowInsetsCompat onApplyWindowInsets = appCompatActivity.onApplyWindowInsets(view, max);
                        if (Build.VERSION.SDK_INT >= 30) {
                            return onApplyWindowInsets.values();
                        }
                        ViewCompat.b(view);
                        return onApplyWindowInsets.values();
                    }
                });
            }
        }

        static void getMax(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(fromInclusive.getMax.IPostMessageService);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }
    }

    @RequiresApi(23)
    static class getMin {
        @Nullable
        public static WindowInsetsCompat getMin(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat min = WindowInsetsCompat.getMin(rootWindowInsets);
            min.getMax(min);
            min.length(view.getRootView());
            return min;
        }
    }

    @RequiresApi(29)
    static class length {
        static void setMin(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }
}
