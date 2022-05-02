package com.andrognito.flashbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.andrognito.flashbar.Flashbar;
import com.andrognito.flashbar.anim.FlashAnimBarBuilder;
import com.andrognito.flashbar.util.NavigationBarPosition;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import o.ensureMenu;
import o.getCollapseIcon;
import o.getNavigationIcon;
import o.setCollapseContentDescription;
import o.setNavigationContentDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fH\u0000¢\u0006\u0002\b+J\u0015\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0000¢\u0006\u0002\b/J\u0015\u00100\u001a\u00020)2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b1J\r\u00102\u001a\u00020)H\u0000¢\u0006\u0002\b3J\r\u00104\u001a\u00020)H\u0000¢\u0006\u0002\b5J\u0010\u00106\u001a\u00020)2\u0006\u00107\u001a\u000208H\u0002J\u0015\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020\u0007H\u0000¢\u0006\u0002\b;J\b\u0010<\u001a\u00020)H\u0002J\r\u0010\u0012\u001a\u00020\u0007H\u0000¢\u0006\u0002\b=J\r\u0010\u0013\u001a\u00020\u0007H\u0000¢\u0006\u0002\b>J\u0010\u0010?\u001a\u00020)2\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020\u00072\u0006\u00107\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u00020)2\u0006\u0010E\u001a\u00020\u0007H\u0016J\u0017\u0010F\u001a\u00020)2\b\u0010G\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0002\bHJ\u0015\u0010I\u001a\u00020)2\u0006\u00104\u001a\u00020\u0007H\u0000¢\u0006\u0002\bJJ\u0017\u0010K\u001a\u00020)2\b\u0010G\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0002\bLJ\u0015\u0010M\u001a\u00020)2\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\bNJ\u0015\u0010O\u001a\u00020)2\u0006\u0010P\u001a\u00020\u000bH\u0000¢\u0006\u0002\bQJ\u0015\u0010R\u001a\u00020)2\u0006\u0010P\u001a\u00020\u000bH\u0000¢\u0006\u0002\bSJ\u0017\u0010T\u001a\u00020)2\b\u0010P\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\bUJ\u0017\u0010V\u001a\u00020)2\b\u0010G\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0002\bWJ\u0015\u0010X\u001a\u00020)2\u0006\u0010Y\u001a\u00020\u0007H\u0000¢\u0006\u0002\bZJ\u0015\u0010[\u001a\u00020)2\u0006\u0010\\\u001a\u00020\u0007H\u0000¢\u0006\u0002\b]J\u0015\u0010^\u001a\u00020)2\u0006\u0010_\u001a\u00020\u001cH\u0000¢\u0006\u0002\b`J\u001b\u0010a\u001a\u00020)2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020'0&H\u0000¢\u0006\u0002\bcJ\u0015\u0010d\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0000¢\u0006\u0002\beR\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X.¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"Lcom/andrognito/flashbar/FlashbarContainerView;", "Landroid/widget/RelativeLayout;", "Lcom/andrognito/flashbar/SwipeDismissTouchListener$DismissCallbacks;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "barDismissOnTapOutside", "", "duration", "", "enterAnimBuilder", "Lcom/andrognito/flashbar/anim/FlashAnimBarBuilder;", "exitAnimBuilder", "flashbarView", "Lcom/andrognito/flashbar/FlashbarView;", "iconAnimBuilder", "Lcom/andrognito/flashbar/anim/FlashAnimIconBuilder;", "isBarDismissing", "isBarShowing", "isBarShown", "onBarDismissListener", "Lcom/andrognito/flashbar/Flashbar$OnBarDismissListener;", "onBarShowListener", "Lcom/andrognito/flashbar/Flashbar$OnBarShowListener;", "onTapOutsideListener", "Lcom/andrognito/flashbar/Flashbar$OnTapListener;", "overlayBlockable", "overlayColor", "", "Ljava/lang/Integer;", "parentFlashbar", "Lcom/andrognito/flashbar/Flashbar;", "getParentFlashbar$flashbar_release", "()Lcom/andrognito/flashbar/Flashbar;", "setParentFlashbar$flashbar_release", "(Lcom/andrognito/flashbar/Flashbar;)V", "showOverlay", "vibrationTargets", "", "Lcom/andrognito/flashbar/Flashbar$Vibration;", "addParent", "", "flashbar", "addParent$flashbar_release", "adjustOrientation", "activity", "Landroid/app/Activity;", "adjustOrientation$flashbar_release", "attach", "attach$flashbar_release", "construct", "construct$flashbar_release", "dismiss", "dismiss$flashbar_release", "dismissInternal", "event", "Lcom/andrognito/flashbar/Flashbar$DismissEvent;", "enableSwipeToDismiss", "enable", "enableSwipeToDismiss$flashbar_release", "handleDismiss", "isBarShowing$flashbar_release", "isBarShown$flashbar_release", "onDismiss", "view", "Landroid/view/View;", "onInterceptTouchEvent", "Landroid/view/MotionEvent;", "onSwipe", "isSwiping", "setBarDismissListener", "listener", "setBarDismissListener$flashbar_release", "setBarDismissOnTapOutside", "setBarDismissOnTapOutside$flashbar_release", "setBarShowListener", "setBarShowListener$flashbar_release", "setDuration", "setDuration$flashbar_release", "setEnterAnim", "builder", "setEnterAnim$flashbar_release", "setExitAnim", "setExitAnim$flashbar_release", "setIconAnim", "setIconAnim$flashbar_release", "setOnTapOutsideListener", "setOnTapOutsideListener$flashbar_release", "setOverlay", "overlay", "setOverlay$flashbar_release", "setOverlayBlockable", "blockable", "setOverlayBlockable$flashbar_release", "setOverlayColor", "color", "setOverlayColor$flashbar_release", "setVibrationTargets", "targets", "setVibrationTargets$flashbar_release", "show", "show$flashbar_release", "flashbar_release"}, k = 1, mv = {1, 1, 10})
public final class FlashbarContainerView extends RelativeLayout implements getNavigationIcon.getMin {
    private boolean FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public Flashbar.getMax IsOverlapping;
    private Flashbar.equals equals;
    /* access modifiers changed from: private */
    public Flashbar.setMax getMax;
    private FlashAnimBarBuilder getMin;
    /* access modifiers changed from: private */
    public boolean hashCode;
    private HashMap invoke;
    private boolean invokeSuspend;
    private Integer isInside;
    /* access modifiers changed from: private */
    public FlashAnimBarBuilder length;
    @NotNull
    public Flashbar parentFlashbar;
    /* access modifiers changed from: private */
    public List<? extends Flashbar.Vibration> setMax;
    /* access modifiers changed from: private */
    public FlashbarView setMin;
    private boolean toDoubleRange;
    private long toFloatRange = -1;
    /* access modifiers changed from: private */
    public ensureMenu toIntRange;
    /* access modifiers changed from: private */
    public boolean toString;
    /* access modifiers changed from: private */
    public boolean values;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.invoke;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.invoke == null) {
            this.invoke = new HashMap();
        }
        View view = (View) this.invoke.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.invoke.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @NotNull
    public static final /* synthetic */ FlashAnimBarBuilder access$getEnterAnimBuilder$p(FlashbarContainerView flashbarContainerView) {
        FlashAnimBarBuilder flashAnimBarBuilder = flashbarContainerView.length;
        if (flashAnimBarBuilder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("enterAnimBuilder");
        }
        return flashAnimBarBuilder;
    }

    @NotNull
    public static final /* synthetic */ FlashbarView access$getFlashbarView$p(FlashbarContainerView flashbarContainerView) {
        FlashbarView flashbarView = flashbarContainerView.setMin;
        if (flashbarView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashbarView");
        }
        return flashbarView;
    }

    @NotNull
    public static final /* synthetic */ List access$getVibrationTargets$p(FlashbarContainerView flashbarContainerView) {
        List<? extends Flashbar.Vibration> list = flashbarContainerView.setMax;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vibrationTargets");
        }
        return list;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlashbarContainerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final Flashbar getParentFlashbar$flashbar_release() {
        Flashbar flashbar = this.parentFlashbar;
        if (flashbar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentFlashbar");
        }
        return flashbar;
    }

    public final void setParentFlashbar$flashbar_release(@NotNull Flashbar flashbar) {
        Intrinsics.checkParameterIsNotNull(flashbar, "<set-?>");
        this.parentFlashbar = flashbar;
    }

    public final boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            Rect rect = new Rect();
            FlashbarView flashbarView = this.setMin;
            if (flashbarView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flashbarView");
            }
            flashbarView.getHitRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                if (this.equals != null && this.parentFlashbar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("parentFlashbar");
                }
                if (this.toDoubleRange) {
                    setMin(Flashbar.DismissEvent.TAP_OUTSIDE);
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onSwipe(boolean z) {
        this.values = z;
        if (z && this.IsOverlapping != null && this.parentFlashbar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentFlashbar");
        }
    }

    public final void onDismiss(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        this.hashCode = false;
        FlashbarView flashbarView = this.setMin;
        if (flashbarView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashbarView");
        }
        flashbarView.stopIconAnimation$flashbar_release();
        List<? extends Flashbar.Vibration> list = this.setMax;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vibrationTargets");
        }
        if (list.contains(Flashbar.Vibration.DISMISS)) {
            performHapticFeedback(1);
        }
        if (this.IsOverlapping != null) {
            if (this.parentFlashbar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parentFlashbar");
            }
            Flashbar.DismissEvent dismissEvent = Flashbar.DismissEvent.SWIPE;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/andrognito/flashbar/util/CommonUtilsKt$afterMeasured$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "onGlobalLayout", "", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public static final class getMax implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ FlashbarContainerView getMin;
        final /* synthetic */ View length;

        public getMax(View view, FlashbarContainerView flashbarContainerView) {
            this.length = view;
            this.getMin = flashbarContainerView;
        }

        public final void onGlobalLayout() {
            if (this.length.getMeasuredWidth() > 0 && this.length.getMeasuredHeight() > 0) {
                if (Build.VERSION.SDK_INT >= 16) {
                    this.length.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    this.length.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                FlashbarContainerView.access$getEnterAnimBuilder$p(this.getMin).setMin(FlashbarContainerView.access$getFlashbarView$p(this.getMin)).toDoubleRange().setMax(new setMin((ViewGroup) this.length, this));
                FlashbarContainerView.access$handleDismiss(this.getMin);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/andrognito/flashbar/FlashbarContainerView$show$1$1", "Lcom/andrognito/flashbar/anim/FlashAnim$InternalAnimListener;", "(Lcom/andrognito/flashbar/FlashbarContainerView$show$1;Landroid/view/ViewGroup;)V", "onStart", "", "onStop", "onUpdate", "progress", "", "flashbar_release"}, k = 1, mv = {1, 1, 10})
        public static final class setMin implements setCollapseContentDescription.setMin {
            final /* synthetic */ ViewGroup getMin;
            final /* synthetic */ getMax setMin;

            setMin(ViewGroup viewGroup, getMax getmax) {
                this.getMin = viewGroup;
                this.setMin = getmax;
            }

            public final void setMin() {
                this.setMin.getMin.toString = true;
                if (this.setMin.getMin.getMax != null) {
                    this.setMin.getMin.getParentFlashbar$flashbar_release();
                }
            }

            public final void getMin() {
                if (this.setMin.getMin.getMax != null) {
                    this.setMin.getMin.getParentFlashbar$flashbar_release();
                }
            }

            public final void setMax() {
                this.setMin.getMin.toString = false;
                this.setMin.getMin.hashCode = true;
                FlashbarContainerView.access$getFlashbarView$p(this.setMin.getMin).startIconAnimation$flashbar_release(this.setMin.getMin.toIntRange);
                if (FlashbarContainerView.access$getVibrationTargets$p(this.setMin.getMin).contains(Flashbar.Vibration.SHOW)) {
                    this.getMin.performHapticFeedback(1);
                }
                if (this.setMin.getMin.getMax != null) {
                    this.setMin.getMin.getParentFlashbar$flashbar_release();
                }
            }
        }
    }

    public final void attach$flashbar_release(@NotNull FlashbarView flashbarView) {
        Intrinsics.checkParameterIsNotNull(flashbarView, "flashbarView");
        this.setMin = flashbarView;
    }

    public final void construct$flashbar_release() {
        setHapticFeedbackEnabled(true);
        if (this.FastBitmap$CoordinateSystem) {
            Integer num = this.isInside;
            if (num == null) {
                Intrinsics.throwNpe();
            }
            setBackgroundColor(num.intValue());
            if (this.invokeSuspend) {
                setClickable(true);
                setFocusable(true);
            }
        }
        FlashbarView flashbarView = this.setMin;
        if (flashbarView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashbarView");
        }
        addView(flashbarView);
    }

    public final void addParent$flashbar_release(@NotNull Flashbar flashbar) {
        Intrinsics.checkParameterIsNotNull(flashbar, "flashbar");
        this.parentFlashbar = flashbar;
    }

    public final void adjustOrientation$flashbar_release(@NotNull Activity activity) {
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(activity, AkuEventParamsKey.KEY_ACTIVITY);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        NavigationBarPosition length2 = getCollapseIcon.length(activity);
        Intrinsics.checkParameterIsNotNull(activity, "$receiver");
        Point min = getCollapseIcon.setMin(activity);
        Object systemService = activity.getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            NavigationBarPosition length3 = getCollapseIcon.length(activity);
            if (length3 == NavigationBarPosition.LEFT || length3 == NavigationBarPosition.RIGHT) {
                i = min.x;
                i2 = point.x;
            } else {
                i = min.y;
                i2 = point.y;
            }
            int i3 = i - i2;
            int i4 = setNavigationContentDescription.setMin[length2.ordinal()];
            if (i4 == 1) {
                layoutParams.leftMargin = i3;
            } else if (i4 == 2) {
                layoutParams.rightMargin = i3;
            } else if (i4 == 3) {
                layoutParams.bottomMargin = i3;
            }
            setLayoutParams(layoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void show$flashbar_release(@org.jetbrains.annotations.NotNull android.app.Activity r3) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            boolean r0 = r2.toString
            if (r0 != 0) goto L_0x005f
            boolean r0 = r2.hashCode
            if (r0 == 0) goto L_0x000e
            goto L_0x005f
        L_0x000e:
            if (r3 == 0) goto L_0x003f
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L_0x003f
            android.view.Window r0 = r3.getWindow()
            java.lang.String r1 = "window"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.view.View r0 = r0.getDecorView()
            if (r0 != 0) goto L_0x0027
            goto L_0x003f
        L_0x0027:
            android.view.Window r3 = r3.getWindow()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r1)
            android.view.View r3 = r3.getDecorView()
            if (r3 == 0) goto L_0x0037
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L_0x0040
        L_0x0037:
            kotlin.TypeCastException r3 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            r3.<init>(r0)
            throw r3
        L_0x003f:
            r3 = 0
        L_0x0040:
            if (r3 != 0) goto L_0x0043
            return
        L_0x0043:
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != 0) goto L_0x004f
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            r3.addView(r0)
        L_0x004f:
            android.view.View r3 = (android.view.View) r3
            android.view.ViewTreeObserver r0 = r3.getViewTreeObserver()
            com.andrognito.flashbar.FlashbarContainerView$getMax r1 = new com.andrognito.flashbar.FlashbarContainerView$getMax
            r1.<init>(r3, r2)
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r1
            r0.addOnGlobalLayoutListener(r1)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.andrognito.flashbar.FlashbarContainerView.show$flashbar_release(android.app.Activity):void");
    }

    public final void dismiss$flashbar_release() {
        setMin(Flashbar.DismissEvent.MANUAL);
    }

    public final boolean isBarShowing$flashbar_release() {
        return this.toString;
    }

    public final boolean isBarShown$flashbar_release() {
        return this.hashCode;
    }

    public final void setDuration$flashbar_release(long j) {
        this.toFloatRange = j;
    }

    public final void setBarShowListener$flashbar_release(@Nullable Flashbar.setMax setmax) {
        this.getMax = setmax;
    }

    public final void setBarDismissListener$flashbar_release(@Nullable Flashbar.getMax getmax) {
        this.IsOverlapping = getmax;
    }

    public final void setBarDismissOnTapOutside$flashbar_release(boolean z) {
        this.toDoubleRange = z;
    }

    public final void setOnTapOutsideListener$flashbar_release(@Nullable Flashbar.equals equals2) {
        this.equals = equals2;
    }

    public final void setOverlay$flashbar_release(boolean z) {
        this.FastBitmap$CoordinateSystem = z;
    }

    public final void setOverlayColor$flashbar_release(int i) {
        this.isInside = Integer.valueOf(i);
    }

    public final void setOverlayBlockable$flashbar_release(boolean z) {
        this.invokeSuspend = z;
    }

    public final void setEnterAnim$flashbar_release(@NotNull FlashAnimBarBuilder flashAnimBarBuilder) {
        Intrinsics.checkParameterIsNotNull(flashAnimBarBuilder, "builder");
        this.length = flashAnimBarBuilder;
    }

    public final void setExitAnim$flashbar_release(@NotNull FlashAnimBarBuilder flashAnimBarBuilder) {
        Intrinsics.checkParameterIsNotNull(flashAnimBarBuilder, "builder");
        this.getMin = flashAnimBarBuilder;
    }

    public final void enableSwipeToDismiss$flashbar_release(boolean z) {
        FlashbarView flashbarView = this.setMin;
        if (flashbarView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashbarView");
        }
        flashbarView.enableSwipeToDismiss$flashbar_release(z, this);
    }

    public final void setVibrationTargets$flashbar_release(@NotNull List<? extends Flashbar.Vibration> list) {
        Intrinsics.checkParameterIsNotNull(list, "targets");
        this.setMax = list;
    }

    public final void setIconAnim$flashbar_release(@Nullable ensureMenu ensuremenu) {
        this.toIntRange = ensuremenu;
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    static final class getMin implements Runnable {
        final /* synthetic */ FlashbarContainerView setMax;

        getMin(FlashbarContainerView flashbarContainerView) {
            this.setMax = flashbarContainerView;
        }

        public final void run() {
            this.setMax.setMin(Flashbar.DismissEvent.TIMEOUT);
        }
    }

    /* access modifiers changed from: private */
    public final void setMin(Flashbar.DismissEvent dismissEvent) {
        if (!this.values && !this.toString && this.hashCode) {
            FlashAnimBarBuilder flashAnimBarBuilder = this.getMin;
            if (flashAnimBarBuilder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("exitAnimBuilder");
            }
            FlashbarView flashbarView = this.setMin;
            if (flashbarView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flashbarView");
            }
            flashAnimBarBuilder.setMin(flashbarView).toDoubleRange().setMax(new length(this, dismissEvent));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/andrognito/flashbar/FlashbarContainerView$dismissInternal$1", "Lcom/andrognito/flashbar/anim/FlashAnim$InternalAnimListener;", "(Lcom/andrognito/flashbar/FlashbarContainerView;Lcom/andrognito/flashbar/Flashbar$DismissEvent;)V", "onStart", "", "onStop", "onUpdate", "progress", "", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public static final class length implements setCollapseContentDescription.setMin {
        final /* synthetic */ Flashbar.DismissEvent getMax;
        final /* synthetic */ FlashbarContainerView setMin;

        length(FlashbarContainerView flashbarContainerView, Flashbar.DismissEvent dismissEvent) {
            this.setMin = flashbarContainerView;
            this.getMax = dismissEvent;
        }

        public final void setMin() {
            this.setMin.values = true;
            if (this.setMin.IsOverlapping != null) {
                this.setMin.getParentFlashbar$flashbar_release();
            }
        }

        public final void getMin() {
            if (this.setMin.IsOverlapping != null) {
                this.setMin.getParentFlashbar$flashbar_release();
            }
        }

        public final void setMax() {
            this.setMin.values = false;
            this.setMin.hashCode = false;
            if (FlashbarContainerView.access$getVibrationTargets$p(this.setMin).contains(Flashbar.Vibration.DISMISS)) {
                this.setMin.performHapticFeedback(1);
            }
            if (this.setMin.IsOverlapping != null) {
                this.setMin.getParentFlashbar$flashbar_release();
            }
            this.setMin.post(new C0015length(this));
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.andrognito.flashbar.FlashbarContainerView$length$length  reason: collision with other inner class name */
        static final class C0015length implements Runnable {
            final /* synthetic */ length setMax;

            C0015length(length length) {
                this.setMax = length;
            }

            public final void run() {
                ViewParent parent = this.setMax.setMin.getParent();
                if (!(parent instanceof ViewGroup)) {
                    parent = null;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup != null) {
                    viewGroup.removeView(this.setMax.setMin);
                }
            }
        }
    }

    public static final /* synthetic */ void access$handleDismiss(FlashbarContainerView flashbarContainerView) {
        if (flashbarContainerView.toFloatRange != -1) {
            flashbarContainerView.postDelayed(new getMin(flashbarContainerView), flashbarContainerView.toFloatRange);
        }
    }
}
