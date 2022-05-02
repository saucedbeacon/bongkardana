package o;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.IResultReceiver;
import o.getThemeResId;

public abstract class dismiss extends setOnCancelListener {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final getThemeResId.getMax<onSupportActionModeFinished> NODE_ADAPTER = new getThemeResId.getMax<onSupportActionModeFinished>() {
        public final /* synthetic */ void getMin(Object obj, Rect rect) {
            ((onSupportActionModeFinished) obj).getMax(rect);
        }
    };
    private static final getThemeResId.length<IResultReceiver.Stub<onSupportActionModeFinished>, onSupportActionModeFinished> SPARSE_VALUES_ADAPTER = new getThemeResId.length<IResultReceiver.Stub<onSupportActionModeFinished>, onSupportActionModeFinished>() {
        public final /* synthetic */ int getMax(Object obj) {
            return ((IResultReceiver.Stub) obj).getMin();
        }

        public final /* synthetic */ Object getMax(Object obj, int i) {
            return (onSupportActionModeFinished) ((IResultReceiver.Stub) obj).IsOverlapping(i);
        }
    };
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    private final View mHost;
    public int mHoveredVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private final AccessibilityManager mManager;
    private length mNodeProvider;
    private final int[] mTempGlobalRect = new int[2];
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();

    private static int keyToDirection(int i) {
        if (i == 19) {
            return 33;
        }
        if (i == 21) {
            return 17;
        }
        if (i != 22) {
            return TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        }
        return 66;
    }

    /* access modifiers changed from: protected */
    public abstract int getVirtualViewAt(float f, float f2);

    /* access modifiers changed from: protected */
    public abstract void getVisibleVirtualViews(List<Integer> list);

    /* access modifiers changed from: protected */
    public abstract boolean onPerformActionForVirtualView(int i, int i2, @Nullable Bundle bundle);

    /* access modifiers changed from: protected */
    public void onPopulateEventForHost(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void onPopulateEventForVirtualView(int i, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void onPopulateNodeForHost(@NonNull onSupportActionModeFinished onsupportactionmodefinished) {
    }

    /* access modifiers changed from: protected */
    public abstract void onPopulateNodeForVirtualView(int i, @NonNull onSupportActionModeFinished onsupportactionmodefinished);

    /* access modifiers changed from: protected */
    public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }

    public dismiss(@NonNull View view) {
        if (view != null) {
            this.mHost = view;
            this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (ViewCompat.isInside(view) == 0) {
                ViewCompat.setMin(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public onWindowStartingSupportActionMode getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new length();
        }
        return this.mNodeProvider;
    }

    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
                updateHoveredVirtualView(virtualViewAt);
                if (virtualViewAt != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
                return false;
            } else {
                updateHoveredVirtualView(Integer.MIN_VALUE);
                return true;
            }
        }
        return false;
    }

    public final boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int keyToDirection = keyToDirection(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && moveFocus(keyToDirection, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            clickKeyboardFocusedVirtualView();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return moveFocus(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return moveFocus(1, (Rect) null);
            }
            return false;
        }
    }

    public final void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        int i2 = this.mKeyboardFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (z) {
            moveFocus(i, rect);
        }
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    private void getBoundsInParent(int i, Rect rect) {
        obtainAccessibilityNodeInfo(i).getMax(rect);
    }

    private boolean moveFocus(int i, @Nullable Rect rect) {
        onSupportActionModeFinished onsupportactionmodefinished;
        onSupportActionModeFinished onsupportactionmodefinished2;
        int i2;
        IResultReceiver.Stub<onSupportActionModeFinished> allNodes = getAllNodes();
        int i3 = this.mKeyboardFocusedVirtualViewId;
        Object obj = null;
        int i4 = Integer.MIN_VALUE;
        if (i3 == Integer.MIN_VALUE) {
            onsupportactionmodefinished = null;
        } else {
            onsupportactionmodefinished = allNodes.setMin(i3);
        }
        if (i == 1 || i == 2) {
            boolean z = ViewCompat.IsOverlapping(this.mHost) == 1;
            getThemeResId.length<IResultReceiver.Stub<onSupportActionModeFinished>, onSupportActionModeFinished> length2 = SPARSE_VALUES_ADAPTER;
            getThemeResId.getMax<onSupportActionModeFinished> getmax = NODE_ADAPTER;
            int max = length2.getMax(allNodes);
            ArrayList arrayList = new ArrayList(max);
            for (int i5 = 0; i5 < max; i5++) {
                arrayList.add(length2.getMax(allNodes, i5));
            }
            Collections.sort(arrayList, new getThemeResId.setMin(z, getmax));
            if (i == 1) {
                int size = arrayList.size();
                if (onsupportactionmodefinished != null) {
                    size = arrayList.indexOf(onsupportactionmodefinished);
                }
                int i6 = size - 1;
                if (i6 >= 0) {
                    obj = arrayList.get(i6);
                }
            } else if (i == 2) {
                int size2 = arrayList.size();
                if (onsupportactionmodefinished == null) {
                    i2 = -1;
                } else {
                    i2 = arrayList.lastIndexOf(onsupportactionmodefinished);
                }
                int i7 = i2 + 1;
                if (i7 < size2) {
                    obj = arrayList.get(i7);
                }
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
            }
            onsupportactionmodefinished2 = (onSupportActionModeFinished) obj;
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i8 = this.mKeyboardFocusedVirtualViewId;
            if (i8 != Integer.MIN_VALUE) {
                getBoundsInParent(i8, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                guessPreviouslyFocusedRect(this.mHost, i, rect2);
            }
            onsupportactionmodefinished2 = (onSupportActionModeFinished) getThemeResId.setMax(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, onsupportactionmodefinished, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (onsupportactionmodefinished2 != null) {
            i4 = allNodes.getMin(allNodes.getMax(onsupportactionmodefinished2));
        }
        return requestKeyboardFocusForVirtualView(i4);
    }

    private IResultReceiver.Stub<onSupportActionModeFinished> getAllNodes() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        IResultReceiver.Stub<onSupportActionModeFinished> stub = new IResultReceiver.Stub<>();
        for (int i = 0; i < arrayList.size(); i++) {
            stub.setMax(i, createNodeForChild(i));
        }
        return stub;
    }

    private static Rect guessPreviouslyFocusedRect(@NonNull View view, int i, @NonNull Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        int i = this.mKeyboardFocusedVirtualViewId;
        return i != Integer.MIN_VALUE && onPerformActionForVirtualView(i, 16, (Bundle) null);
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return onDestroy.length(parent, this.mHost, createEvent(i, i2));
    }

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i) {
        invalidateVirtualView(i, 0);
    }

    public final void invalidateVirtualView(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.mManager.isEnabled() && (parent = this.mHost.getParent()) != null) {
            AccessibilityEvent createEvent = createEvent(i, 2048);
            AccessibilityEventCompat.getMin(createEvent, i2);
            onDestroy.length(parent, this.mHost, createEvent);
        }
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public void updateHoveredVirtualView(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 != i) {
            this.mHoveredVirtualViewId = i;
            sendEventForVirtualView(i, 128);
            sendEventForVirtualView(i2, 256);
        }
    }

    private AccessibilityEvent createEvent(int i, int i2) {
        if (i != -1) {
            return createEventForChild(i, i2);
        }
        return createEventForHost(i2);
    }

    private AccessibilityEvent createEventForHost(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.mHost.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    private AccessibilityEvent createEventForChild(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        onSupportActionModeFinished obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
        obtain.getText().add(obtainAccessibilityNodeInfo.b());
        obtain.setContentDescription(obtainAccessibilityNodeInfo.create());
        obtain.setScrollable(obtainAccessibilityNodeInfo.Mean$Arithmetic());
        obtain.setPassword(obtainAccessibilityNodeInfo.invokeSuspend());
        obtain.setEnabled(obtainAccessibilityNodeInfo.valueOf());
        obtain.setChecked(obtainAccessibilityNodeInfo.toIntRange());
        onPopulateEventForVirtualView(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(obtainAccessibilityNodeInfo.onNavigationEvent());
            startSupportActionMode.length(obtain, this.mHost, i);
            obtain.setPackageName(this.mHost.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public onSupportActionModeFinished obtainAccessibilityNodeInfo(int i) {
        if (i == -1) {
            return createNodeForHost();
        }
        return createNodeForChild(i);
    }

    @NonNull
    private onSupportActionModeFinished createNodeForHost() {
        onSupportActionModeFinished min = onSupportActionModeFinished.getMin(this.mHost);
        ViewCompat.setMin(this.mHost, min);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (min.getMax() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                min.getMin(this.mHost, ((Integer) arrayList.get(i)).intValue());
            }
            return min;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public void onInitializeAccessibilityNodeInfo(View view, onSupportActionModeFinished onsupportactionmodefinished) {
        super.onInitializeAccessibilityNodeInfo(view, onsupportactionmodefinished);
        onPopulateNodeForHost(onsupportactionmodefinished);
    }

    @NonNull
    private onSupportActionModeFinished createNodeForChild(int i) {
        onSupportActionModeFinished length2 = onSupportActionModeFinished.length();
        length2.isInside(true);
        length2.getMin(true);
        length2.getMax((CharSequence) DEFAULT_CLASS_NAME);
        length2.setMin(INVALID_PARENT_BOUNDS);
        length2.setMax(INVALID_PARENT_BOUNDS);
        length2.setMin(this.mHost);
        onPopulateNodeForVirtualView(i, length2);
        if (length2.b() == null && length2.create() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        length2.getMax(this.mTempParentRect);
        if (!this.mTempParentRect.equals(INVALID_PARENT_BOUNDS)) {
            int max = length2.setMax();
            if ((max & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((max & 128) == 0) {
                length2.setMin((CharSequence) this.mHost.getContext().getPackageName());
                length2.setMax(this.mHost, i);
                if (this.mAccessibilityFocusedVirtualViewId == i) {
                    length2.toIntRange(true);
                    length2.setMin(128);
                } else {
                    length2.toIntRange(false);
                    length2.setMin(64);
                }
                boolean z = this.mKeyboardFocusedVirtualViewId == i;
                if (z) {
                    length2.setMin(2);
                } else if (length2.isInside()) {
                    length2.setMin(1);
                }
                length2.setMin(z);
                this.mHost.getLocationOnScreen(this.mTempGlobalRect);
                length2.getMin(this.mTempScreenRect);
                if (this.mTempScreenRect.equals(INVALID_PARENT_BOUNDS)) {
                    length2.getMax(this.mTempScreenRect);
                    if (length2.setMax != -1) {
                        onSupportActionModeFinished length3 = onSupportActionModeFinished.length();
                        for (int i2 = length2.setMax; i2 != -1; i2 = length3.setMax) {
                            length3.setMin(this.mHost, -1);
                            length3.setMin(INVALID_PARENT_BOUNDS);
                            onPopulateNodeForVirtualView(i2, length3);
                            length3.getMax(this.mTempParentRect);
                            this.mTempScreenRect.offset(this.mTempParentRect.left, this.mTempParentRect.top);
                        }
                        length3.ICustomTabsCallback();
                    }
                    this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
                }
                if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
                    this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
                    if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                        length2.setMax(this.mTempScreenRect);
                        if (isVisibleToUser(this.mTempScreenRect)) {
                            length2.getMax(true);
                        }
                    }
                }
                return length2;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* access modifiers changed from: package-private */
    public boolean performAction(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return performActionForChild(i, i2, bundle);
        }
        return performActionForHost(i2, bundle);
    }

    private boolean performActionForHost(int i, Bundle bundle) {
        return ViewCompat.length(this.mHost, i, bundle);
    }

    private boolean performActionForChild(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return requestKeyboardFocusForVirtualView(i);
        }
        if (i2 == 2) {
            return clearKeyboardFocusForVirtualView(i);
        }
        if (i2 == 64) {
            return requestAccessibilityFocus(i);
        }
        if (i2 != 128) {
            return onPerformActionForVirtualView(i, i2, bundle);
        }
        return clearAccessibilityFocus(i);
    }

    private boolean isVisibleToUser(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    private boolean requestAccessibilityFocus(int i) {
        int i2;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i2 = this.mAccessibilityFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearAccessibilityFocus(i2);
        }
        this.mAccessibilityFocusedVirtualViewId = i;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    private boolean clearAccessibilityFocus(int i) {
        if (this.mAccessibilityFocusedVirtualViewId != i) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 65536);
        return true;
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i2;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i2 = this.mKeyboardFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        this.mKeyboardFocusedVirtualViewId = i;
        onVirtualViewKeyboardFocusChanged(i, true);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.mKeyboardFocusedVirtualViewId != i) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }

    class length extends onWindowStartingSupportActionMode {
        length() {
        }

        public onSupportActionModeFinished setMax(int i) {
            return onSupportActionModeFinished.setMin(dismiss.this.obtainAccessibilityNodeInfo(i));
        }

        public boolean setMin(int i, int i2, Bundle bundle) {
            return dismiss.this.performAction(i, i2, bundle);
        }

        public onSupportActionModeFinished getMax(int i) {
            int i2 = i == 2 ? dismiss.this.mAccessibilityFocusedVirtualViewId : dismiss.this.mKeyboardFocusedVirtualViewId;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return setMax(i2);
        }
    }
}
