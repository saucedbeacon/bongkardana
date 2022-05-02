package com.alibaba.griver.ui.ant.basic;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.ContextMenu;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.Checkable;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.core.view.ViewCompat;
import com.alibaba.griver.ui.R;
import java.util.ArrayList;
import java.util.List;
import o.IResultReceiver;
import o.PlaybackStateCompat;
import o.dispatchOnCancelled;
import o.getDrawerToggleDelegate;
import o.onCancelLoad;
import o.onCanceled;
import o.onSupportActionModeFinished;
import o.setOnCancelListener;

public class AUHorizontalListView extends AdapterView<ListAdapter> implements ViewTreeObserver.OnTouchModeChangeListener {
    public static final int[] STATE_NOTHING = {0};
    private float A;
    private int B;
    private Rect C;
    /* access modifiers changed from: private */
    public int D;
    private CheckForTap E;
    private CheckForLongPress F;
    private CheckForKeyLongPress G;
    private PerformClick H;
    /* access modifiers changed from: private */
    public Runnable I;
    private int J;
    private boolean K;
    private boolean L;
    /* access modifiers changed from: private */
    public Drawable M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private SelectionNotifier R;
    /* access modifiers changed from: private */
    public boolean S;
    private int T;
    private int U;
    private long V;
    private long W;

    /* renamed from: a  reason: collision with root package name */
    private final RecycleBin f10537a;
    private int aa;
    /* access modifiers changed from: private */
    public int ab;
    /* access modifiers changed from: private */
    public long ac;
    /* access modifiers changed from: private */
    public int ad;
    /* access modifiers changed from: private */
    public long ae;
    private int af;
    private long ag;
    private ChoiceMode ah;
    private int ai;
    private SparseBooleanArray aj;
    private ContextMenu.ContextMenuInfo ak;
    /* access modifiers changed from: private */
    public int al;
    /* access modifiers changed from: private */
    public int am;
    private int an;
    private VelocityTracker ao;
    private getDrawerToggleDelegate ap;
    private getDrawerToggleDelegate aq;
    private OnScrollListener ar;
    private int as;

    /* renamed from: at  reason: collision with root package name */
    private View f10538at;
    private ListItemAccessibilityDelegate au;
    private int av;
    private int aw;
    private final int b;
    private final int c;
    private final int d;
    private final Rect e;
    private final ArrowScrollFocusResult f;
    private final Rect g;
    private final int h;
    private final Scroller i;
    /* access modifiers changed from: private */
    public ListAdapter j;
    private boolean k;
    private int l;
    private boolean m;
    PlaybackStateCompat.ShuffleMode<Integer> mCheckedIdStates;
    final boolean[] mIsScrap;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10539o;
    private AdapterDataSetObserver p;
    private boolean q;
    /* access modifiers changed from: private */
    public boolean r;
    /* access modifiers changed from: private */
    public int s;
    /* access modifiers changed from: private */
    public int t;
    /* access modifiers changed from: private */
    public boolean u;
    private boolean v;
    /* access modifiers changed from: private */
    public int w;
    private int x;
    private SavedState y;
    private float z;

    public enum ChoiceMode {
        NONE,
        SINGLE,
        MULTIPLE
    }

    public interface OnScrollListener {
        public static final int SCROLL_STATE_FLING = 2;
        public static final int SCROLL_STATE_IDLE = 0;
        public static final int SCROLL_STATE_TOUCH_SCROLL = 1;

        void onScroll(AUHorizontalListView aUHorizontalListView, int i, int i2, int i3);

        void onScrollStateChanged(AUHorizontalListView aUHorizontalListView, int i);
    }

    public interface RecyclerListener {
        void onMovedToScrapHeap(View view);
    }

    /* access modifiers changed from: protected */
    public void dispatchSetPressed(boolean z2) {
    }

    /* access modifiers changed from: protected */
    public boolean recycleOnMeasure() {
        return true;
    }

    public AUHorizontalListView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AUHorizontalListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AUHorizontalListView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mIsScrap = new boolean[1];
        this.S = false;
        this.ao = null;
        this.al = 0;
        this.am = -1;
        this.an = -1;
        this.f10539o = false;
        this.ak = null;
        this.ar = null;
        this.as = 0;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.b = viewConfiguration.getScaledTouchSlop();
        this.c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.d = viewConfiguration.getScaledMinimumFlingVelocity();
        this.h = a(viewConfiguration);
        this.O = 0;
        this.i = new Scroller(context);
        this.k = true;
        this.q = false;
        this.e = new Rect();
        this.f = new ArrowScrollFocusResult();
        this.N = -1;
        this.g = new Rect();
        this.aa = 0;
        this.J = -1;
        this.aa = 0;
        this.ab = -1;
        this.ac = Long.MIN_VALUE;
        this.ad = -1;
        this.ae = Long.MIN_VALUE;
        this.af = -1;
        this.ag = Long.MIN_VALUE;
        this.ah = ChoiceMode.NONE;
        this.ai = 0;
        this.mCheckedIdStates = null;
        this.aj = null;
        this.f10537a = new RecycleBin();
        this.p = null;
        this.v = true;
        this.ap = null;
        this.aq = null;
        setClickable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setAlwaysDrawnWithCacheEnabled(false);
        setWillNotDraw(false);
        setClipToPadding(false);
        ViewCompat.getMax((View) this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.griver_AUHorizontalListView, i2, 0);
        this.L = obtainStyledAttributes.getBoolean(R.styleable.griver_AUHorizontalListView_drawSelectorOnTop, false);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.griver_AUHorizontalListView_listSelector);
        if (drawable != null) {
            setSelector(drawable);
        }
        a();
        int i3 = obtainStyledAttributes.getInt(R.styleable.griver_AUHorizontalListView_choiceMode, -1);
        if (i3 >= 0) {
            setChoiceMode(ChoiceMode.values()[i3]);
        }
        obtainStyledAttributes.recycle();
        g();
    }

    private static int a(Rect rect, Rect rect2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i2 == 1 || i2 == 2) {
            i3 = rect.right + (rect.width() / 2);
            i5 = (rect.height() / 2) + rect.top;
            i6 = rect2.left + (rect2.width() / 2);
            i8 = rect2.top;
            i7 = rect2.height() / 2;
        } else if (i2 != 17) {
            if (i2 == 33) {
                i3 = rect.left + (rect.width() / 2);
                i5 = rect.top;
                i6 = rect2.left + (rect2.width() / 2);
                i4 = rect2.bottom;
            } else if (i2 == 66) {
                i3 = rect.right;
                i5 = (rect.height() / 2) + rect.top;
                i6 = rect2.left;
                i8 = rect2.top;
                i7 = rect2.height() / 2;
            } else if (i2 == 130) {
                i3 = rect.left + (rect.width() / 2);
                i5 = rect.bottom;
                i6 = rect2.left + (rect2.width() / 2);
                i4 = rect2.top;
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT, FOCUS_FORWARD, FOCUS_BACKWARD}.");
            }
            int i9 = i6 - i3;
            int i10 = i4 - i5;
            return (i10 * i10) + (i9 * i9);
        } else {
            i3 = rect.left;
            i5 = (rect.height() / 2) + rect.top;
            i6 = rect2.right;
            i8 = rect2.top;
            i7 = rect2.height() / 2;
        }
        i4 = i7 + i8;
        int i92 = i6 - i3;
        int i102 = i4 - i5;
        return (i102 * i102) + (i92 * i92);
    }

    private void a() {
        this.k = false;
        g();
        resetState();
        this.f10537a.clear();
        requestLayout();
    }

    public Drawable getSelector() {
        return this.M;
    }

    public void setSelector(int i2) {
        setSelector(getResources().getDrawable(i2));
    }

    public void setSelector(Drawable drawable) {
        Drawable drawable2 = this.M;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.M);
        }
        this.M = drawable;
        drawable.getPadding(new Rect());
        drawable.setCallback(this);
        s();
    }

    public int getSelectedItemPosition() {
        return this.ab;
    }

    public long getSelectedItemId() {
        return this.ac;
    }

    public boolean isItemChecked(int i2) {
        SparseBooleanArray sparseBooleanArray;
        if (this.ah.compareTo(ChoiceMode.NONE) != 0 || (sparseBooleanArray = this.aj) == null) {
            return false;
        }
        return sparseBooleanArray.get(i2);
    }

    public void setChoiceMode(ChoiceMode choiceMode) {
        ListAdapter listAdapter;
        this.ah = choiceMode;
        if (choiceMode.compareTo(ChoiceMode.NONE) != 0) {
            if (this.aj == null) {
                this.aj = new SparseBooleanArray();
            }
            if (this.mCheckedIdStates == null && (listAdapter = this.j) != null && listAdapter.hasStableIds()) {
                this.mCheckedIdStates = new PlaybackStateCompat.ShuffleMode<>();
            }
        }
    }

    public ListAdapter getAdapter() {
        return this.j;
    }

    public void setAdapter(ListAdapter listAdapter) {
        AdapterDataSetObserver adapterDataSetObserver;
        ListAdapter listAdapter2 = this.j;
        if (!(listAdapter2 == null || (adapterDataSetObserver = this.p) == null)) {
            listAdapter2.unregisterDataSetObserver(adapterDataSetObserver);
        }
        resetState();
        this.f10537a.clear();
        this.j = listAdapter;
        this.r = true;
        this.af = -1;
        this.ag = Long.MIN_VALUE;
        SparseBooleanArray sparseBooleanArray = this.aj;
        if (sparseBooleanArray != null) {
            sparseBooleanArray.clear();
        }
        PlaybackStateCompat.ShuffleMode<Integer> shuffleMode = this.mCheckedIdStates;
        if (shuffleMode != null) {
            shuffleMode.setMin();
        }
        if (this.j != null) {
            this.t = this.s;
            this.s = listAdapter.getCount();
            AdapterDataSetObserver adapterDataSetObserver2 = new AdapterDataSetObserver();
            this.p = adapterDataSetObserver2;
            this.j.registerDataSetObserver(adapterDataSetObserver2);
            this.f10537a.setViewTypeCount(listAdapter.getViewTypeCount());
            this.u = listAdapter.hasStableIds();
            this.v = listAdapter.areAllItemsEnabled();
            if (this.ah.compareTo(ChoiceMode.NONE) != 0 && this.u && this.mCheckedIdStates == null) {
                this.mCheckedIdStates = new PlaybackStateCompat.ShuffleMode<>();
            }
            int o2 = o(0);
            setSelectedPositionInt(o2);
            setNextSelectedPositionInt(o2);
            if (this.s == 0) {
                t();
            }
        } else {
            this.s = 0;
            this.u = false;
            this.v = true;
            t();
        }
        F();
        requestLayout();
    }

    public int getFirstVisiblePosition() {
        return this.w;
    }

    public int getLastVisiblePosition() {
        return (this.w + getChildCount()) - 1;
    }

    public int getCount() {
        return this.s;
    }

    public int getPositionForView(View view) {
        while (true) {
            try {
                View view2 = (View) view.getParent();
                if (view2.equals(this)) {
                    break;
                }
                view = view2;
            } catch (ClassCastException unused) {
            }
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2).equals(view)) {
                return this.w + i2;
            }
        }
        return -1;
    }

    public void getFocusedRect(Rect rect) {
        View selectedView = getSelectedView();
        if (selectedView == null || selectedView.getParent() != this) {
            super.getFocusedRect(rect);
            return;
        }
        selectedView.getFocusedRect(rect);
        offsetDescendantRectToMyCoords(selectedView, rect);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z2, int i2, Rect rect) {
        ListAdapter listAdapter;
        super.onFocusChanged(z2, i2, rect);
        if (z2 && this.ad < 0 && !isInTouchMode()) {
            if (!this.f10539o && (listAdapter = this.j) != null) {
                this.r = true;
                this.t = this.s;
                this.s = listAdapter.getCount();
            }
            resurrectSelection();
        }
        ListAdapter listAdapter2 = this.j;
        int i3 = -1;
        int i4 = 0;
        if (!(listAdapter2 == null || !z2 || rect == null)) {
            rect.offset(getScrollX(), getScrollY());
            if (listAdapter2.getCount() < getChildCount() + this.w) {
                this.al = 0;
                x();
            }
            Rect rect2 = this.e;
            int childCount = getChildCount();
            int i5 = this.w;
            int i6 = 0;
            int i7 = Integer.MAX_VALUE;
            while (i4 < childCount) {
                if (listAdapter2.isEnabled(i5 + i4)) {
                    View childAt = getChildAt(i4);
                    childAt.getDrawingRect(rect2);
                    offsetDescendantRectToMyCoords(childAt, rect2);
                    int a2 = a(rect, rect2, i2);
                    if (a2 < i7) {
                        i6 = this.k ? childAt.getTop() : childAt.getLeft();
                        i3 = i4;
                        i7 = a2;
                    }
                }
                i4++;
            }
            i4 = i6;
        }
        if (i3 >= 0) {
            setSelectionFromOffset(i3 + this.w, i4);
        } else {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (this.j != null && this.p == null) {
            AdapterDataSetObserver adapterDataSetObserver = new AdapterDataSetObserver();
            this.p = adapterDataSetObserver;
            this.j.registerDataSetObserver(adapterDataSetObserver);
            this.r = true;
            this.t = this.s;
            this.s = this.j.getCount();
        }
        this.f10539o = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10537a.clear();
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        ListAdapter listAdapter = this.j;
        if (listAdapter != null) {
            listAdapter.unregisterDataSetObserver(this.p);
            this.p = null;
        }
        PerformClick performClick = this.H;
        if (performClick != null) {
            removeCallbacks(performClick);
        }
        Runnable runnable = this.I;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.I.run();
        }
        this.f10539o = false;
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        boolean z3 = !isInTouchMode();
        if (z2) {
            int i2 = this.an;
            if (!(z3 == i2 || i2 == -1)) {
                if (z3) {
                    resurrectSelection();
                } else {
                    p();
                    this.al = 0;
                    x();
                }
            }
        } else if (z3) {
            this.J = this.ad;
        }
        this.an = z3 ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        boolean z4 = true;
        if (this.k && this.O != i3) {
            onScrollChanged(getScrollX(), i3, getScrollX(), this.O);
            this.O = i3;
        } else if (this.k || this.O == i2) {
            z4 = false;
        } else {
            onScrollChanged(i2, getScrollY(), this.O, getScrollY());
            this.O = i2;
        }
        if (z4) {
            invalidate();
            l();
        }
    }

    @TargetApi(9)
    private boolean a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2) {
        if (Build.VERSION.SDK_INT < 9) {
            return false;
        }
        return super.overScrollBy(i2, i3, i4, i5, i6, i7, i8, i9, z2);
    }

    @TargetApi(9)
    public void setOverScrollMode(int i2) {
        if (Build.VERSION.SDK_INT >= 9) {
            if (i2 == 2) {
                this.ap = null;
                this.aq = null;
            } else if (this.ap == null) {
                Context context = getContext();
                this.ap = new getDrawerToggleDelegate(context);
                this.aq = new getDrawerToggleDelegate(context);
            }
            super.setOverScrollMode(i2);
        }
    }

    public int pointToPosition(int i2, int i3) {
        Rect rect = this.C;
        if (rect == null) {
            rect = new Rect();
            this.C = rect;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                childAt.getHitRect(rect);
                if (rect.contains(i2, i3)) {
                    return this.w + childCount;
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int computeVerticalScrollExtent() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        int i2 = childCount * 100;
        View childAt = getChildAt(0);
        int top = childAt.getTop();
        int height = childAt.getHeight();
        if (height > 0) {
            i2 += (top * 100) / height;
        }
        View childAt2 = getChildAt(childCount - 1);
        int bottom = childAt2.getBottom();
        int height2 = childAt2.getHeight();
        return height2 > 0 ? i2 - (((bottom - getHeight()) * 100) / height2) : i2;
    }

    /* access modifiers changed from: protected */
    public int computeHorizontalScrollExtent() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        int i2 = childCount * 100;
        View childAt = getChildAt(0);
        int left = childAt.getLeft();
        int width = childAt.getWidth();
        if (width > 0) {
            i2 += (left * 100) / width;
        }
        View childAt2 = getChildAt(childCount - 1);
        int right = childAt2.getRight();
        int width2 = childAt2.getWidth();
        return width2 > 0 ? i2 - (((right - getWidth()) * 100) / width2) : i2;
    }

    /* access modifiers changed from: protected */
    public int computeVerticalScrollOffset() {
        int i2 = this.w;
        int childCount = getChildCount();
        if (i2 >= 0 && childCount != 0) {
            View childAt = getChildAt(0);
            int top = childAt.getTop();
            int height = childAt.getHeight();
            if (height > 0) {
                return Math.max((i2 * 100) - ((top * 100) / height), 0);
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int computeHorizontalScrollOffset() {
        int i2 = this.w;
        int childCount = getChildCount();
        if (i2 >= 0 && childCount != 0) {
            View childAt = getChildAt(0);
            int left = childAt.getLeft();
            int width = childAt.getWidth();
            if (width > 0) {
                return Math.max((i2 * 100) - ((left * 100) / width), 0);
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = r3.O;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int computeVerticalScrollRange() {
        /*
            r3 = this;
            int r0 = r3.s
            int r0 = r0 * 100
            r1 = 0
            int r0 = java.lang.Math.max(r0, r1)
            boolean r1 = r3.k
            if (r1 == 0) goto L_0x0027
            int r1 = r3.O
            if (r1 == 0) goto L_0x0027
            float r1 = (float) r1
            int r2 = r3.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r3.s
            float r2 = (float) r2
            float r1 = r1 * r2
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            int r1 = java.lang.Math.abs(r1)
            int r0 = r0 + r1
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.ant.basic.AUHorizontalListView.computeVerticalScrollRange():int");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = r3.O;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int computeHorizontalScrollRange() {
        /*
            r3 = this;
            int r0 = r3.s
            int r0 = r0 * 100
            r1 = 0
            int r0 = java.lang.Math.max(r0, r1)
            boolean r1 = r3.k
            if (r1 != 0) goto L_0x0027
            int r1 = r3.O
            if (r1 == 0) goto L_0x0027
            float r1 = (float) r1
            int r2 = r3.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r3.s
            float r2 = (float) r2
            float r1 = r1 * r2
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            int r1 = java.lang.Math.abs(r1)
            int r0 = r0 + r1
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.ant.basic.AUHorizontalListView.computeHorizontalScrollRange():int");
    }

    public boolean showContextMenuForChild(View view) {
        int positionForView = getPositionForView(view);
        boolean z2 = false;
        if (positionForView < 0) {
            return false;
        }
        long itemId = this.j.getItemId(positionForView);
        AdapterView.OnItemLongClickListener onItemLongClickListener = getOnItemLongClickListener();
        if (onItemLongClickListener != null) {
            z2 = onItemLongClickListener.onItemLongClick(this, view, positionForView, itemId);
        }
        if (z2) {
            return z2;
        }
        this.ak = a(getChildAt(positionForView - this.w), positionForView, itemId);
        return super.showContextMenuForChild(view);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            d();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r0 != 3) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.f10539o
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r6.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = 1
            if (r0 == 0) goto L_0x0059
            if (r0 == r2) goto L_0x004d
            r3 = 2
            if (r0 == r3) goto L_0x0019
            r6 = 3
            if (r0 == r6) goto L_0x004d
            goto L_0x008f
        L_0x0019:
            int r0 = r5.am
            if (r0 != 0) goto L_0x008f
            r5.c()
            android.view.VelocityTracker r0 = r5.ao
            r0.addMovement(r6)
            int r0 = r5.B
            int r0 = o.setSingleChoiceItems.setMin(r6, r0)
            if (r0 >= 0) goto L_0x002e
            return r1
        L_0x002e:
            boolean r3 = r5.k
            if (r3 == 0) goto L_0x0037
            float r6 = o.setSingleChoiceItems.setMax(r6, r0)
            goto L_0x003b
        L_0x0037:
            float r6 = o.setSingleChoiceItems.length(r6, r0)
        L_0x003b:
            float r0 = r5.z
            float r6 = r6 - r0
            float r0 = r5.A
            float r6 = r6 + r0
            int r0 = (int) r6
            float r3 = (float) r0
            float r6 = r6 - r3
            r5.A = r6
            boolean r6 = r5.h(r0)
            if (r6 == 0) goto L_0x008f
            return r2
        L_0x004d:
            r6 = -1
            r5.B = r6
            r5.am = r6
            r5.d()
            r5.g(r1)
            goto L_0x008f
        L_0x0059:
            r5.b()
            android.view.VelocityTracker r0 = r5.ao
            r0.addMovement(r6)
            android.widget.Scroller r0 = r5.i
            r0.abortAnimation()
            float r0 = r6.getX()
            float r3 = r6.getY()
            boolean r4 = r5.k
            if (r4 == 0) goto L_0x0073
            r0 = r3
        L_0x0073:
            r5.z = r0
            int r0 = (int) r0
            int r0 = r5.l(r0)
            int r6 = o.setSingleChoiceItems.getMin(r6, r1)
            r5.B = r6
            r6 = 0
            r5.A = r6
            int r6 = r5.am
            r3 = 4
            if (r6 != r3) goto L_0x0089
            return r2
        L_0x0089:
            if (r0 < 0) goto L_0x008f
            r5.D = r0
            r5.am = r1
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.ant.basic.AUHorizontalListView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bd, code lost:
        if (r2 != 5) goto L_0x022a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r20.isEnabled()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x001b
            boolean r1 = r20.isClickable()
            if (r1 != 0) goto L_0x001a
            boolean r1 = r20.isLongClickable()
            if (r1 == 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            return r4
        L_0x001a:
            return r3
        L_0x001b:
            boolean r2 = r0.f10539o
            if (r2 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r20.c()
            android.view.VelocityTracker r2 = r0.ao
            r2.addMovement(r1)
            int r2 = r21.getAction()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r5 = 4
            r6 = 0
            r7 = 3
            if (r2 == 0) goto L_0x024d
            r8 = 5
            r9 = 2
            r10 = -1
            if (r2 == r3) goto L_0x00b3
            if (r2 == r9) goto L_0x0070
            if (r2 == r7) goto L_0x003e
            goto L_0x02a4
        L_0x003e:
            r20.i()
            r0.am = r10
            r0.g(r4)
            r0.setPressed(r4)
            int r1 = r0.D
            int r2 = r0.w
            int r1 = r1 - r2
            android.view.View r1 = r0.getChildAt(r1)
            if (r1 == 0) goto L_0x0057
            r1.setPressed(r4)
        L_0x0057:
            o.getDrawerToggleDelegate r1 = r0.ap
            if (r1 == 0) goto L_0x006b
            o.getDrawerToggleDelegate r2 = r0.aq
            if (r2 == 0) goto L_0x006b
            boolean r1 = r1.getMin()
            o.getDrawerToggleDelegate r2 = r0.aq
            boolean r2 = r2.getMin()
            r4 = r1 | r2
        L_0x006b:
            r20.d()
            goto L_0x02a4
        L_0x0070:
            int r2 = r0.B
            int r2 = o.setSingleChoiceItems.setMin(r1, r2)
            if (r2 >= 0) goto L_0x0079
            return r4
        L_0x0079:
            boolean r5 = r0.k
            if (r5 == 0) goto L_0x0082
            float r1 = o.setSingleChoiceItems.setMax(r1, r2)
            goto L_0x0086
        L_0x0082:
            float r1 = o.setSingleChoiceItems.length(r1, r2)
        L_0x0086:
            boolean r2 = r0.r
            if (r2 == 0) goto L_0x008d
            r20.x()
        L_0x008d:
            float r2 = r0.z
            float r2 = r1 - r2
            float r5 = r0.A
            float r2 = r2 + r5
            int r5 = (int) r2
            float r6 = (float) r5
            float r2 = r2 - r6
            r0.A = r2
            int r2 = r0.am
            if (r2 == 0) goto L_0x00ae
            if (r2 == r3) goto L_0x00ae
            if (r2 == r9) goto L_0x00ae
            if (r2 == r7) goto L_0x00a7
            if (r2 == r8) goto L_0x00a7
            goto L_0x02a4
        L_0x00a7:
            r0.z = r1
            r0.i(r5)
            goto L_0x02a4
        L_0x00ae:
            r0.h(r5)
            goto L_0x02a4
        L_0x00b3:
            int r2 = r0.am
            if (r2 == 0) goto L_0x014a
            if (r2 == r3) goto L_0x014a
            if (r2 == r9) goto L_0x014a
            if (r2 == r7) goto L_0x00c1
            if (r2 == r8) goto L_0x0143
            goto L_0x022a
        L_0x00c1:
            boolean r1 = r20.f()
            if (r1 != 0) goto L_0x0143
            android.view.VelocityTracker r1 = r0.ao
            r2 = 1000(0x3e8, float:1.401E-42)
            int r7 = r0.c
            float r7 = (float) r7
            r1.computeCurrentVelocity(r2, r7)
            boolean r1 = r0.k
            if (r1 == 0) goto L_0x00de
            android.view.VelocityTracker r1 = r0.ao
            int r2 = r0.B
            float r1 = o.findViewById.setMax(r1, r2)
            goto L_0x00e6
        L_0x00de:
            android.view.VelocityTracker r1 = r0.ao
            int r2 = r0.B
            float r1 = o.findViewById.getMax(r1, r2)
        L_0x00e6:
            float r2 = java.lang.Math.abs(r1)
            int r7 = r0.d
            float r7 = (float) r7
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x013c
            r0.am = r5
            r0.g(r9)
            android.widget.Scroller r11 = r0.i
            r12 = 0
            r13 = 0
            boolean r2 = r0.k
            if (r2 == 0) goto L_0x0100
            r2 = 0
            goto L_0x0101
        L_0x0100:
            r2 = r1
        L_0x0101:
            int r14 = (int) r2
            boolean r2 = r0.k
            if (r2 == 0) goto L_0x0107
            goto L_0x0108
        L_0x0107:
            r1 = 0
        L_0x0108:
            int r15 = (int) r1
            boolean r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x0112
            r16 = 0
            goto L_0x0114
        L_0x0112:
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0114:
            boolean r1 = r0.k
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == 0) goto L_0x011e
            r17 = 0
            goto L_0x0121
        L_0x011e:
            r17 = 2147483647(0x7fffffff, float:NaN)
        L_0x0121:
            boolean r1 = r0.k
            if (r1 == 0) goto L_0x0128
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x012a
        L_0x0128:
            r18 = 0
        L_0x012a:
            boolean r1 = r0.k
            if (r1 == 0) goto L_0x0132
            r19 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0134
        L_0x0132:
            r19 = 0
        L_0x0134:
            r11.fling(r12, r13, r14, r15, r16, r17, r18, r19)
            r0.z = r6
            r1 = 1
            goto L_0x022b
        L_0x013c:
            r0.am = r10
            r0.g(r4)
            goto L_0x022a
        L_0x0143:
            r0.am = r10
            r0.g(r4)
            goto L_0x022a
        L_0x014a:
            int r2 = r0.D
            int r5 = r0.w
            int r5 = r2 - r5
            android.view.View r5 = r0.getChildAt(r5)
            float r6 = r21.getX()
            float r1 = r21.getY()
            boolean r7 = r0.k
            if (r7 == 0) goto L_0x017b
            int r1 = r20.getPaddingLeft()
            float r1 = (float) r1
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0179
            int r1 = r20.getWidth()
            int r7 = r20.getPaddingRight()
            int r1 = r1 - r7
            float r1 = (float) r1
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0179
        L_0x0177:
            r1 = 1
            goto L_0x0193
        L_0x0179:
            r1 = 0
            goto L_0x0193
        L_0x017b:
            int r6 = r20.getPaddingTop()
            float r6 = (float) r6
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0179
            int r6 = r20.getHeight()
            int r7 = r20.getPaddingBottom()
            int r6 = r6 - r7
            float r6 = (float) r6
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x0179
            goto L_0x0177
        L_0x0193:
            if (r5 == 0) goto L_0x0225
            boolean r6 = r5.hasFocusable()
            if (r6 != 0) goto L_0x0225
            if (r1 == 0) goto L_0x0225
            int r1 = r0.am
            if (r1 == 0) goto L_0x01a4
            r5.setPressed(r4)
        L_0x01a4:
            com.alibaba.griver.ui.ant.basic.AUHorizontalListView$PerformClick r1 = r0.H
            if (r1 != 0) goto L_0x01b0
            com.alibaba.griver.ui.ant.basic.AUHorizontalListView$PerformClick r1 = new com.alibaba.griver.ui.ant.basic.AUHorizontalListView$PerformClick
            r6 = 0
            r1.<init>()
            r0.H = r1
        L_0x01b0:
            com.alibaba.griver.ui.ant.basic.AUHorizontalListView$PerformClick r1 = r0.H
            r1.mClickMotionPosition = r2
            r1.rememberWindowAttachCount()
            r0.J = r2
            int r6 = r0.am
            if (r6 == 0) goto L_0x01d0
            if (r6 != r3) goto L_0x01c0
            goto L_0x01d0
        L_0x01c0:
            boolean r5 = r0.r
            if (r5 != 0) goto L_0x0225
            android.widget.ListAdapter r5 = r0.j
            boolean r2 = r5.isEnabled(r2)
            if (r2 == 0) goto L_0x0225
            r1.run()
            goto L_0x0225
        L_0x01d0:
            int r6 = r0.am
            if (r6 != 0) goto L_0x01d8
            r20.i()
            goto L_0x01db
        L_0x01d8:
            r20.k()
        L_0x01db:
            r0.al = r4
            boolean r6 = r0.r
            if (r6 != 0) goto L_0x0220
            android.widget.ListAdapter r6 = r0.j
            boolean r2 = r6.isEnabled(r2)
            if (r2 == 0) goto L_0x0220
            r0.am = r3
            r0.setPressed(r3)
            int r2 = r0.D
            r0.a((int) r2, (android.view.View) r5)
            r5.setPressed(r3)
            android.graphics.drawable.Drawable r2 = r0.M
            if (r2 == 0) goto L_0x0209
            android.graphics.drawable.Drawable r2 = r2.getCurrent()
            if (r2 == 0) goto L_0x0209
            boolean r6 = r2 instanceof android.graphics.drawable.TransitionDrawable
            if (r6 == 0) goto L_0x0209
            android.graphics.drawable.TransitionDrawable r2 = (android.graphics.drawable.TransitionDrawable) r2
            r2.resetTransition()
        L_0x0209:
            java.lang.Runnable r2 = r0.I
            if (r2 == 0) goto L_0x0210
            r0.removeCallbacks(r2)
        L_0x0210:
            com.alibaba.griver.ui.ant.basic.AUHorizontalListView$1 r2 = new com.alibaba.griver.ui.ant.basic.AUHorizontalListView$1
            r2.<init>(r5, r1)
            r0.I = r2
            int r1 = android.view.ViewConfiguration.getPressedStateDuration()
            long r5 = (long) r1
            r0.postDelayed(r2, r5)
            goto L_0x0225
        L_0x0220:
            r0.am = r10
            r20.s()
        L_0x0225:
            r0.am = r10
            r20.s()
        L_0x022a:
            r1 = 0
        L_0x022b:
            r20.i()
            r20.k()
            r0.setPressed(r4)
            o.getDrawerToggleDelegate r2 = r0.ap
            if (r2 == 0) goto L_0x0248
            o.getDrawerToggleDelegate r4 = r0.aq
            if (r4 == 0) goto L_0x0248
            boolean r2 = r2.getMin()
            o.getDrawerToggleDelegate r4 = r0.aq
            boolean r4 = r4.getMin()
            r2 = r2 | r4
            r1 = r1 | r2
        L_0x0248:
            r4 = r1
            r20.d()
            goto L_0x02a4
        L_0x024d:
            r20.requestLayout()
            boolean r2 = r0.r
            if (r2 != 0) goto L_0x02a4
            android.view.VelocityTracker r2 = r0.ao
            r2.clear()
            android.widget.Scroller r2 = r0.i
            r2.abortAnimation()
            float r2 = r21.getX()
            float r8 = r21.getY()
            boolean r9 = r0.k
            if (r9 == 0) goto L_0x026c
            r9 = r8
            goto L_0x026d
        L_0x026c:
            r9 = r2
        L_0x026d:
            r0.z = r9
            int r2 = (int) r2
            int r8 = (int) r8
            int r2 = r0.pointToPosition(r2, r8)
            int r1 = o.setSingleChoiceItems.getMin(r1, r4)
            r0.B = r1
            r0.A = r6
            boolean r1 = r0.r
            if (r1 != 0) goto L_0x02a4
            int r1 = r0.am
            if (r1 != r5) goto L_0x0291
            r0.am = r7
            r0.g(r3)
            float r1 = r0.z
            int r1 = (int) r1
            r0.l(r1)
            return r3
        L_0x0291:
            int r1 = r0.D
            if (r1 < 0) goto L_0x02a2
            android.widget.ListAdapter r5 = r0.j
            boolean r1 = r5.isEnabled(r1)
            if (r1 == 0) goto L_0x02a2
            r0.am = r4
            r20.h()
        L_0x02a2:
            r0.D = r2
        L_0x02a4:
            if (r4 == 0) goto L_0x02a9
            androidx.core.view.ViewCompat.equals(r20)
        L_0x02a9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.ant.basic.AUHorizontalListView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onTouchModeChanged(boolean z2) {
        if (z2) {
            p();
            if (getWidth() > 0 && getHeight() > 0 && getChildCount() > 0) {
                x();
            }
            s();
        } else if (this.am == 5 && this.O != 0) {
            this.O = 0;
            m();
            invalidate();
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return a(i2, 1, keyEvent);
    }

    public boolean onKeyMultiple(int i2, int i3, KeyEvent keyEvent) {
        return a(i2, i3, keyEvent);
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        return a(i2, 1, keyEvent);
    }

    public void sendAccessibilityEvent(int i2) {
        if (i2 == 4096) {
            int firstVisiblePosition = getFirstVisiblePosition();
            int lastVisiblePosition = getLastVisiblePosition();
            if (this.av != firstVisiblePosition || this.aw != lastVisiblePosition) {
                this.av = firstVisiblePosition;
                this.aw = lastVisiblePosition;
            } else {
                return;
            }
        }
        super.sendAccessibilityEvent(i2);
    }

    @TargetApi(14)
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AUHorizontalListView.class.getName());
    }

    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AUHorizontalListView.class.getName());
        onSupportActionModeFinished onsupportactionmodefinished = new onSupportActionModeFinished((Object) accessibilityNodeInfo);
        if (isEnabled()) {
            if (getFirstVisiblePosition() > 0) {
                onsupportactionmodefinished.setMin(8192);
            }
            if (getLastVisiblePosition() < getCount() - 1) {
                onsupportactionmodefinished.setMin(4096);
            }
        }
    }

    @TargetApi(16)
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (super.performAccessibilityAction(i2, bundle)) {
            return true;
        }
        if (i2 != 4096) {
            if (i2 != 8192 || !isEnabled() || this.w <= 0) {
                return false;
            }
            if (this.k) {
                i6 = getHeight() - getPaddingTop();
                i5 = getPaddingBottom();
            } else {
                i6 = getWidth() - getPaddingLeft();
                i5 = getPaddingRight();
            }
            n(-(i6 - i5));
            return true;
        } else if (!isEnabled() || getLastVisiblePosition() >= getCount() - 1) {
            return false;
        } else {
            if (this.k) {
                i4 = getHeight() - getPaddingTop();
                i3 = getPaddingBottom();
            } else {
                i4 = getWidth() - getPaddingLeft();
                i3 = getPaddingRight();
            }
            n(i4 - i3);
            return true;
        }
    }

    private boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !a((View) parent, view2)) {
            return false;
        }
        return true;
    }

    private void a(int i2) {
        if (this.k && i2 != 33 && i2 != 130) {
            throw new IllegalArgumentException("Focus direction must be one of {View.FOCUS_UP, View.FOCUS_DOWN} for vertical orientation");
        } else if (!this.k && i2 != 17 && i2 != 66) {
            throw new IllegalArgumentException("Focus direction must be one of {View.FOCUS_LEFT, View.FOCUS_RIGHT} for vertical orientation");
        }
    }

    private void b(int i2) {
        if (this.k && i2 != 17 && i2 != 66) {
            throw new IllegalArgumentException("Direction must be one of {View.FOCUS_LEFT, View.FOCUS_RIGHT} for vertical orientation");
        } else if (!this.k && i2 != 33 && i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {View.FOCUS_UP, View.FOCUS_DOWN} for horizontal orientation");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean pageScroll(int r5) {
        /*
            r4 = this;
            r4.a((int) r5)
            r0 = 0
            r1 = 1
            r2 = 33
            if (r5 == r2) goto L_0x002a
            r2 = 17
            if (r5 != r2) goto L_0x000e
            goto L_0x002a
        L_0x000e:
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L_0x0019
            r2 = 66
            if (r5 != r2) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r5 = -1
            goto L_0x0036
        L_0x0019:
            int r5 = r4.s
            int r5 = r5 - r1
            int r2 = r4.ad
            int r3 = r4.getChildCount()
            int r2 = r2 + r3
            int r2 = r2 - r1
            int r5 = java.lang.Math.min(r5, r2)
            r2 = 1
            goto L_0x0037
        L_0x002a:
            int r5 = r4.ad
            int r2 = r4.getChildCount()
            int r5 = r5 - r2
            int r5 = r5 - r1
            int r5 = java.lang.Math.max(r0, r5)
        L_0x0036:
            r2 = 0
        L_0x0037:
            if (r5 >= 0) goto L_0x003a
            return r0
        L_0x003a:
            int r5 = r4.a((int) r5, (boolean) r2)
            if (r5 < 0) goto L_0x007a
            r0 = 4
            r4.al = r0
            boolean r0 = r4.k
            if (r0 == 0) goto L_0x004c
            int r0 = r4.getPaddingTop()
            goto L_0x0050
        L_0x004c:
            int r0 = r4.getPaddingLeft()
        L_0x0050:
            r4.x = r0
            if (r2 == 0) goto L_0x0060
            int r0 = r4.s
            int r3 = r4.getChildCount()
            int r0 = r0 - r3
            if (r5 <= r0) goto L_0x0060
            r0 = 3
            r4.al = r0
        L_0x0060:
            if (r2 != 0) goto L_0x006a
            int r0 = r4.getChildCount()
            if (r5 >= r0) goto L_0x006a
            r4.al = r1
        L_0x006a:
            r4.setSelectionInt(r5)
            r4.e()
            boolean r5 = r4.l()
            if (r5 != 0) goto L_0x0079
            r4.invalidate()
        L_0x0079:
            return r1
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.ant.basic.AUHorizontalListView.pageScroll(int):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean fullScroll(int i2) {
        a(i2);
        boolean z2 = false;
        if (i2 == 33 || i2 == 17) {
            if (this.ad != 0) {
                int a2 = a(0, true);
                if (a2 >= 0) {
                    this.al = 1;
                    setSelectionInt(a2);
                    e();
                }
            }
            if (z2 && !l()) {
                l();
                invalidate();
            }
            return z2;
        }
        if (i2 == 130 || i2 == 66) {
            int i3 = this.ad;
            int i4 = this.s;
            if (i3 < i4 - 1) {
                int a3 = a(i4 - 1, true);
                if (a3 >= 0) {
                    this.al = 3;
                    setSelectionInt(a3);
                    e();
                }
            }
        }
        l();
        invalidate();
        return z2;
        z2 = true;
        l();
        invalidate();
        return z2;
    }

    private boolean c(int i2) {
        View selectedView;
        b(i2);
        int childCount = getChildCount();
        if (!this.q || childCount <= 0 || this.ad == -1 || (selectedView = getSelectedView()) == null || !selectedView.hasFocus() || !(selectedView instanceof ViewGroup)) {
            return false;
        }
        View findFocus = selectedView.findFocus();
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) selectedView, findFocus, i2);
        if (findNextFocus != null) {
            findFocus.getFocusedRect(this.e);
            offsetDescendantRectToMyCoords(findFocus, this.e);
            offsetRectIntoDescendantCoords(findNextFocus, this.e);
            if (findNextFocus.requestFocus(i2, this.e)) {
                return true;
            }
        }
        View findNextFocus2 = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), findFocus, i2);
        if (findNextFocus2 != null) {
            return a(findNextFocus2, (View) this);
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    private boolean d(int i2) {
        a(i2);
        try {
            this.m = true;
            boolean f2 = f(i2);
            if (f2) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
            }
            this.m = false;
            return f2;
        } catch (Throwable th) {
            this.m = false;
            throw th;
        }
    }

    private void a(View view, int i2, int i3, boolean z2) {
        View view2;
        boolean z3;
        a(i2);
        if (i3 != -1) {
            int i4 = this.ad;
            int i5 = this.w;
            int i6 = i4 - i5;
            int i7 = i3 - i5;
            boolean z4 = true;
            if (i2 == 33 || i2 == 17) {
                z3 = true;
                view2 = view;
                view = getChildAt(i7);
                int i8 = i6;
                i6 = i7;
                i7 = i8;
            } else {
                view2 = getChildAt(i7);
                z3 = false;
            }
            int childCount = getChildCount();
            if (view != null) {
                view.setSelected(!z2 && z3);
                a(view, i6, childCount);
            }
            if (view2 != null) {
                if (z2 || z3) {
                    z4 = false;
                }
                view2.setSelected(z4);
                a(view2, i7, childCount);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("newSelectedPosition needs to be valid");
    }

    private void a(View view, int i2, int i3) {
        int height = view.getHeight();
        c(view);
        if (view.getMeasuredHeight() != height) {
            d(view);
            int measuredHeight = view.getMeasuredHeight() - height;
            while (true) {
                i2++;
                if (i2 < i3) {
                    getChildAt(i2).offsetTopAndBottom(measuredHeight);
                } else {
                    return;
                }
            }
        }
    }

    private ArrowScrollFocusResult e(int i2) {
        View view;
        int i3;
        int i4;
        int i5;
        a(i2);
        View selectedView = getSelectedView();
        boolean z2 = false;
        if (selectedView == null || !selectedView.hasFocus()) {
            if (i2 == 130 || i2 == 66) {
                int paddingTop = this.k ? getPaddingTop() : getPaddingLeft();
                i3 = Math.max(selectedView != null ? this.k ? selectedView.getTop() : selectedView.getLeft() : paddingTop, paddingTop);
            } else {
                if (this.k) {
                    i5 = getHeight();
                    i4 = getPaddingBottom();
                } else {
                    i5 = getWidth();
                    i4 = getPaddingRight();
                }
                int i6 = i5 - i4;
                i3 = Math.min(selectedView != null ? this.k ? selectedView.getBottom() : selectedView.getRight() : i6, i6);
            }
            int i7 = this.k ? 0 : i3;
            if (!this.k) {
                i3 = 0;
            }
            this.e.set(i7, i3, i7, i3);
            view = FocusFinder.getInstance().findNextFocusFromRect(this, this.e, i2);
        } else {
            view = FocusFinder.getInstance().findNextFocus(this, selectedView.findFocus(), i2);
        }
        if (view != null) {
            int a2 = a(view);
            int i8 = this.ad;
            if (!(i8 == -1 || a2 == i8)) {
                int p2 = p(i2);
                boolean z3 = i2 == 130 || i2 == 66;
                if (i2 == 33 || i2 == 17) {
                    z2 = true;
                }
                if (p2 != -1 && ((z3 && p2 < a2) || (z2 && p2 > a2))) {
                    return null;
                }
            }
            int a3 = a(i2, view, a2);
            int maxScrollAmount = getMaxScrollAmount();
            if (a3 < maxScrollAmount) {
                view.requestFocus(i2);
                this.f.populate(a2, a3);
                return this.f;
            } else if (b(view) < maxScrollAmount) {
                view.requestFocus(i2);
                this.f.populate(a2, maxScrollAmount);
                return this.f;
            }
        }
        return null;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.33f);
    }

    private int getArrowScrollPreviewLength() {
        return this.l + Math.max(10, this.k ? getVerticalFadingEdgeLength() : getHorizontalFadingEdgeLength());
    }

    private int a(View view) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (a(view, getChildAt(i2))) {
                return this.w + i2;
            }
        }
        throw new IllegalArgumentException("newFocus is not a child of any of the children of the list!");
    }

    private boolean f(int i2) {
        View focusedChild;
        a(i2);
        if (getChildCount() <= 0) {
            return false;
        }
        View selectedView = getSelectedView();
        int i3 = this.ad;
        int p2 = p(i2);
        int a2 = a(i2, p2);
        View view = null;
        ArrowScrollFocusResult e2 = this.q ? e(i2) : null;
        if (e2 != null) {
            p2 = e2.getSelectedPosition();
            a2 = e2.getAmountToScroll();
        }
        boolean z2 = e2 != null;
        if (p2 != -1) {
            a(selectedView, i2, p2, e2 != null);
            setSelectedPositionInt(p2);
            setNextSelectedPositionInt(p2);
            selectedView = getSelectedView();
            if (this.q && e2 == null && (focusedChild = getFocusedChild()) != null) {
                focusedChild.clearFocus();
            }
            t();
            i3 = p2;
            z2 = true;
        }
        if (a2 > 0) {
            if (!(i2 == 33 || i2 == 17)) {
                a2 = -a2;
            }
            n(a2);
            z2 = true;
        }
        if (this.q && e2 == null && selectedView != null && selectedView.hasFocus()) {
            View findFocus = selectedView.findFocus();
            if (!a(findFocus, (View) this) || b(findFocus) > 0) {
                findFocus.clearFocus();
            }
        }
        if (p2 != -1 || selectedView == null || a(selectedView, (View) this)) {
            view = selectedView;
        } else {
            p();
            this.J = -1;
        }
        if (!z2) {
            return false;
        }
        if (view != null) {
            a(i3, view);
            this.aa = view.getTop();
        }
        if (!l()) {
            invalidate();
        }
        e();
        return true;
    }

    private int a(int i2, int i3) {
        int i4;
        int i5;
        a(i2);
        int childCount = getChildCount();
        if (i2 == 130 || i2 == 66) {
            if (this.k) {
                i4 = getHeight();
                i5 = getPaddingBottom();
            } else {
                i4 = getWidth();
                i5 = getPaddingRight();
            }
            int i6 = i4 - i5;
            int i7 = childCount - 1;
            int i8 = i3 != -1 ? i3 - this.w : i7;
            int i9 = this.w + i8;
            View childAt = getChildAt(i8);
            int arrowScrollPreviewLength = i9 < this.s + -1 ? i6 - getArrowScrollPreviewLength() : i6;
            int top = this.k ? childAt.getTop() : childAt.getLeft();
            int bottom = this.k ? childAt.getBottom() : childAt.getRight();
            if (bottom <= arrowScrollPreviewLength) {
                return 0;
            }
            if (i3 != -1 && arrowScrollPreviewLength - top >= getMaxScrollAmount()) {
                return 0;
            }
            int i10 = bottom - arrowScrollPreviewLength;
            if (this.w + childCount == this.s) {
                View childAt2 = getChildAt(i7);
                i10 = Math.min(i10, (this.k ? childAt2.getBottom() : childAt2.getRight()) - i6);
            }
            return Math.min(i10, getMaxScrollAmount());
        }
        int paddingTop = this.k ? getPaddingTop() : getPaddingLeft();
        int i11 = i3 != -1 ? i3 - this.w : 0;
        int i12 = this.w + i11;
        View childAt3 = getChildAt(i11);
        int arrowScrollPreviewLength2 = i12 > 0 ? getArrowScrollPreviewLength() + paddingTop : paddingTop;
        int top2 = this.k ? childAt3.getTop() : childAt3.getLeft();
        int bottom2 = this.k ? childAt3.getBottom() : childAt3.getRight();
        if (top2 >= arrowScrollPreviewLength2) {
            return 0;
        }
        if (i3 != -1 && bottom2 - arrowScrollPreviewLength2 >= getMaxScrollAmount()) {
            return 0;
        }
        int i13 = arrowScrollPreviewLength2 - top2;
        if (this.w == 0) {
            View childAt4 = getChildAt(0);
            i13 = Math.min(i13, paddingTop - (this.k ? childAt4.getTop() : childAt4.getLeft()));
        }
        return Math.min(i13, getMaxScrollAmount());
    }

    private int a(int i2, View view, int i3) {
        int i4;
        int arrowScrollPreviewLength;
        int i5;
        int i6;
        a(i2);
        view.getDrawingRect(this.e);
        offsetDescendantRectToMyCoords(view, this.e);
        if (i2 == 33 || i2 == 17) {
            int paddingTop = this.k ? getPaddingTop() : getPaddingLeft();
            int i7 = this.k ? this.e.top : this.e.left;
            if (i7 >= paddingTop) {
                return 0;
            }
            i4 = paddingTop - i7;
            if (i3 <= 0) {
                return i4;
            }
            arrowScrollPreviewLength = getArrowScrollPreviewLength();
        } else {
            if (this.k) {
                i5 = getHeight();
                i6 = getPaddingBottom();
            } else {
                i5 = getWidth();
                i6 = getPaddingRight();
            }
            int i8 = i5 - i6;
            int i9 = this.k ? this.e.bottom : this.e.right;
            if (i9 <= i8) {
                return 0;
            }
            i4 = i9 - i8;
            if (i3 >= this.s - 1) {
                return i4;
            }
            arrowScrollPreviewLength = getArrowScrollPreviewLength();
        }
        return i4 + arrowScrollPreviewLength;
    }

    private int b(View view) {
        int i2;
        int i3;
        view.getDrawingRect(this.e);
        offsetDescendantRectToMyCoords(view, this.e);
        int paddingTop = this.k ? getPaddingTop() : getPaddingLeft();
        if (this.k) {
            i3 = getHeight();
            i2 = getPaddingBottom();
        } else {
            i3 = getWidth();
            i2 = getPaddingRight();
        }
        int i4 = i3 - i2;
        int i5 = this.k ? this.e.top : this.e.left;
        int i6 = this.k ? this.e.bottom : this.e.right;
        if (i6 < paddingTop) {
            return paddingTop - i6;
        }
        if (i5 > i4) {
            return i5 - i4;
        }
        return 0;
    }

    private boolean a(KeyEvent keyEvent, int i2, int i3) {
        boolean z2 = true;
        if (keyEvent.hasNoModifiers()) {
            boolean resurrectSelectionIfNeeded = resurrectSelectionIfNeeded();
            if (resurrectSelectionIfNeeded) {
                return resurrectSelectionIfNeeded;
            }
            while (true) {
                int i4 = i2 - 1;
                if (i2 <= 0 || !d(i3)) {
                    return resurrectSelectionIfNeeded;
                }
                i2 = i4;
                resurrectSelectionIfNeeded = true;
            }
        } else if (!keyEvent.hasModifiers(2)) {
            return false;
        } else {
            if (!resurrectSelectionIfNeeded() && !fullScroll(i3)) {
                z2 = false;
            }
            return z2;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ac, code lost:
        if (fullScroll(r6) != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c5, code lost:
        if (fullScroll(r5) != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e1, code lost:
        if (pageScroll(r6) != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00fb, code lost:
        if (fullScroll(r6) != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0114, code lost:
        if (pageScroll(r5) != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x012d, code lost:
        if (fullScroll(r5) != false) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x017f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(int r10, int r11, android.view.KeyEvent r12) {
        /*
            r9 = this;
            android.widget.ListAdapter r0 = r9.j
            r1 = 0
            if (r0 == 0) goto L_0x01cc
            boolean r0 = r9.f10539o
            if (r0 != 0) goto L_0x000b
            goto L_0x01cc
        L_0x000b:
            boolean r0 = r9.r
            if (r0 == 0) goto L_0x0012
            r9.x()
        L_0x0012:
            int r0 = r12.getAction()
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L_0x017c
            r4 = 62
            r5 = 17
            r6 = 130(0x82, float:1.82E-43)
            r7 = 33
            r8 = 66
            if (r10 == r4) goto L_0x014d
            if (r10 == r8) goto L_0x0130
            r4 = 92
            if (r10 == r4) goto L_0x00fe
            r4 = 93
            if (r10 == r4) goto L_0x00ca
            r4 = 122(0x7a, float:1.71E-43)
            if (r10 == r4) goto L_0x00af
            r4 = 123(0x7b, float:1.72E-43)
            if (r10 == r4) goto L_0x0095
            switch(r10) {
                case 19: goto L_0x007f;
                case 20: goto L_0x0069;
                case 21: goto L_0x0053;
                case 22: goto L_0x003d;
                case 23: goto L_0x0130;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x017c
        L_0x003d:
            boolean r4 = r9.k
            if (r4 != 0) goto L_0x0047
            boolean r4 = r9.a((android.view.KeyEvent) r12, (int) r11, (int) r8)
            goto L_0x017d
        L_0x0047:
            boolean r4 = r12.hasNoModifiers()
            if (r4 == 0) goto L_0x017c
            boolean r4 = r9.c((int) r8)
            goto L_0x017d
        L_0x0053:
            boolean r4 = r9.k
            if (r4 != 0) goto L_0x005d
            boolean r4 = r9.a((android.view.KeyEvent) r12, (int) r11, (int) r5)
            goto L_0x017d
        L_0x005d:
            boolean r4 = r12.hasNoModifiers()
            if (r4 == 0) goto L_0x017c
            boolean r4 = r9.c((int) r5)
            goto L_0x017d
        L_0x0069:
            boolean r4 = r9.k
            if (r4 == 0) goto L_0x0073
            boolean r4 = r9.a((android.view.KeyEvent) r12, (int) r11, (int) r6)
            goto L_0x017d
        L_0x0073:
            boolean r4 = r12.hasNoModifiers()
            if (r4 == 0) goto L_0x017c
            boolean r4 = r9.c((int) r6)
            goto L_0x017d
        L_0x007f:
            boolean r4 = r9.k
            if (r4 == 0) goto L_0x0089
            boolean r4 = r9.a((android.view.KeyEvent) r12, (int) r11, (int) r7)
            goto L_0x017d
        L_0x0089:
            boolean r4 = r12.hasNoModifiers()
            if (r4 == 0) goto L_0x017c
            boolean r4 = r9.c((int) r7)
            goto L_0x017d
        L_0x0095:
            boolean r4 = r12.hasNoModifiers()
            if (r4 == 0) goto L_0x017c
            boolean r4 = r9.resurrectSelectionIfNeeded()
            if (r4 != 0) goto L_0x00c7
            boolean r4 = r9.k
            if (r4 == 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r6 = 66
        L_0x00a8:
            boolean r4 = r9.fullScroll(r6)
            if (r4 == 0) goto L_0x017c
            goto L_0x00c7
        L_0x00af:
            boolean r4 = r12.hasNoModifiers()
            if (r4 == 0) goto L_0x017c
            boolean r4 = r9.resurrectSelectionIfNeeded()
            if (r4 != 0) goto L_0x00c7
            boolean r4 = r9.k
            if (r4 == 0) goto L_0x00c1
            r5 = 33
        L_0x00c1:
            boolean r4 = r9.fullScroll(r5)
            if (r4 == 0) goto L_0x017c
        L_0x00c7:
            r4 = 1
            goto L_0x017d
        L_0x00ca:
            boolean r4 = r12.hasNoModifiers()
            if (r4 == 0) goto L_0x00e4
            boolean r4 = r9.resurrectSelectionIfNeeded()
            if (r4 != 0) goto L_0x00c7
            boolean r4 = r9.k
            if (r4 == 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            r6 = 66
        L_0x00dd:
            boolean r4 = r9.pageScroll(r6)
            if (r4 == 0) goto L_0x017c
            goto L_0x00c7
        L_0x00e4:
            boolean r4 = r12.hasModifiers(r2)
            if (r4 == 0) goto L_0x017c
            boolean r4 = r9.resurrectSelectionIfNeeded()
            if (r4 != 0) goto L_0x00c7
            boolean r4 = r9.k
            if (r4 == 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r6 = 66
        L_0x00f7:
            boolean r4 = r9.fullScroll(r6)
            if (r4 == 0) goto L_0x017c
            goto L_0x00c7
        L_0x00fe:
            boolean r4 = r12.hasNoModifiers()
            if (r4 == 0) goto L_0x0117
            boolean r4 = r9.resurrectSelectionIfNeeded()
            if (r4 != 0) goto L_0x00c7
            boolean r4 = r9.k
            if (r4 == 0) goto L_0x0110
            r5 = 33
        L_0x0110:
            boolean r4 = r9.pageScroll(r5)
            if (r4 == 0) goto L_0x017c
            goto L_0x00c7
        L_0x0117:
            boolean r4 = r12.hasModifiers(r2)
            if (r4 == 0) goto L_0x017c
            boolean r4 = r9.resurrectSelectionIfNeeded()
            if (r4 != 0) goto L_0x00c7
            boolean r4 = r9.k
            if (r4 == 0) goto L_0x0129
            r5 = 33
        L_0x0129:
            boolean r4 = r9.fullScroll(r5)
            if (r4 == 0) goto L_0x017c
            goto L_0x00c7
        L_0x0130:
            boolean r4 = r12.hasNoModifiers()
            if (r4 == 0) goto L_0x017c
            boolean r4 = r9.resurrectSelectionIfNeeded()
            if (r4 != 0) goto L_0x017d
            int r5 = r12.getRepeatCount()
            if (r5 != 0) goto L_0x017d
            int r5 = r9.getChildCount()
            if (r5 <= 0) goto L_0x017d
            r9.r()
            goto L_0x00c7
        L_0x014d:
            boolean r4 = r12.hasNoModifiers()
            if (r4 == 0) goto L_0x0165
            boolean r4 = r9.resurrectSelectionIfNeeded()
            if (r4 != 0) goto L_0x00c7
            boolean r4 = r9.k
            if (r4 == 0) goto L_0x015e
            goto L_0x0160
        L_0x015e:
            r6 = 66
        L_0x0160:
            r9.pageScroll(r6)
            goto L_0x00c7
        L_0x0165:
            boolean r4 = r12.hasModifiers(r3)
            if (r4 == 0) goto L_0x00c7
            boolean r4 = r9.resurrectSelectionIfNeeded()
            if (r4 != 0) goto L_0x00c7
            boolean r4 = r9.k
            if (r4 == 0) goto L_0x0177
            r5 = 33
        L_0x0177:
            r9.fullScroll(r5)
            goto L_0x00c7
        L_0x017c:
            r4 = 0
        L_0x017d:
            if (r4 == 0) goto L_0x0180
            return r3
        L_0x0180:
            if (r0 == 0) goto L_0x01c7
            if (r0 == r3) goto L_0x018c
            if (r0 == r2) goto L_0x0187
            return r1
        L_0x0187:
            boolean r10 = super.onKeyMultiple(r10, r11, r12)
            return r10
        L_0x018c:
            boolean r10 = r9.isEnabled()
            if (r10 != 0) goto L_0x0193
            return r3
        L_0x0193:
            boolean r10 = r9.isClickable()
            if (r10 == 0) goto L_0x01c6
            boolean r10 = r9.isPressed()
            if (r10 == 0) goto L_0x01c6
            int r10 = r9.ad
            if (r10 < 0) goto L_0x01c6
            android.widget.ListAdapter r11 = r9.j
            if (r11 == 0) goto L_0x01c6
            int r11 = r11.getCount()
            if (r10 >= r11) goto L_0x01c6
            int r10 = r9.ad
            int r11 = r9.w
            int r10 = r10 - r11
            android.view.View r10 = r9.getChildAt(r10)
            if (r10 == 0) goto L_0x01c2
            int r11 = r9.ad
            long r4 = r9.ae
            r9.performItemClick(r10, r11, r4)
            r10.setPressed(r1)
        L_0x01c2:
            r9.setPressed(r1)
            return r3
        L_0x01c6:
            return r1
        L_0x01c7:
            boolean r10 = super.onKeyDown(r10, r12)
            return r10
        L_0x01cc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.ant.basic.AUHorizontalListView.a(int, int, android.view.KeyEvent):boolean");
    }

    private void b() {
        VelocityTracker velocityTracker = this.ao;
        if (velocityTracker == null) {
            this.ao = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void c() {
        if (this.ao == null) {
            this.ao = VelocityTracker.obtain();
        }
    }

    private void d() {
        VelocityTracker velocityTracker = this.ao;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ao = null;
        }
    }

    private void e() {
        OnScrollListener onScrollListener = this.ar;
        if (onScrollListener != null) {
            onScrollListener.onScroll(this, this.w, getChildCount(), this.s);
        }
        onScrollChanged(0, 0, 0, 0);
    }

    private void g(int i2) {
        OnScrollListener onScrollListener;
        if (i2 != this.as && (onScrollListener = this.ar) != null) {
            this.as = i2;
            onScrollListener.onScrollStateChanged(this, i2);
        }
    }

    private boolean h(int i2) {
        boolean z2 = this.O != 0;
        if (Math.abs(i2) <= this.b && !z2) {
            return false;
        }
        if (z2) {
            this.am = 5;
        } else {
            this.am = 3;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        k();
        setPressed(false);
        View childAt = getChildAt(this.D - this.w);
        if (childAt != null) {
            childAt.setPressed(false);
        }
        g(1);
        return true;
    }

    private void i(int i2) {
        int i3 = this.am;
        if (i3 == 3) {
            j(i2);
        } else if (i3 == 5) {
            k(i2);
        }
    }

    private void j(int i2) {
        int i3;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        int i4 = this.D;
        if (i4 >= 0) {
            i3 = i4 - this.w;
        } else {
            i3 = getChildCount() / 2;
        }
        int i5 = 0;
        View childAt = getChildAt(i3);
        if (childAt != null) {
            i5 = this.k ? childAt.getTop() : childAt.getLeft();
        }
        boolean n2 = n(i2);
        View childAt2 = getChildAt(i3);
        if (childAt2 != null) {
            int top = this.k ? childAt2.getTop() : childAt2.getLeft();
            if (n2) {
                b(i2, (-i2) - (top - i5));
            }
        }
    }

    private void b(int i2, int i3) {
        VelocityTracker velocityTracker;
        a(this.k ? 0 : i3, this.k ? i3 : 0, this.k ? 0 : this.O, this.k ? this.O : 0, 0, 0, this.k ? 0 : this.h, this.k ? this.h : 0, true);
        if (Math.abs(this.h) == Math.abs(this.O) && (velocityTracker = this.ao) != null) {
            velocityTracker.clear();
        }
        int min = ViewCompat.getMin(this);
        if (min == 0 || (min == 1 && !f())) {
            this.am = 5;
            float height = ((float) i3) / ((float) (this.k ? getHeight() : getWidth()));
            if (i2 > 0) {
                this.ap.length(height);
                if (!this.aq.setMax()) {
                    this.aq.getMin();
                }
            } else if (i2 < 0) {
                this.aq.length(height);
                if (!this.ap.setMax()) {
                    this.ap.getMin();
                }
            }
            if (i2 != 0) {
                ViewCompat.equals(this);
            }
        }
    }

    private void k(int i2) {
        int i3;
        int i4 = this.O;
        int i5 = i4 - i2;
        int i6 = -i2;
        if ((i5 >= 0 || i4 < 0) && (i5 <= 0 || i4 > 0)) {
            i3 = 0;
        } else {
            i6 = -i4;
            i3 = i2 + i6;
        }
        if (i6 != 0) {
            b(i3, i6);
        }
        if (i3 != 0) {
            if (this.O != 0) {
                this.O = 0;
                ViewCompat.equals(this);
            }
            n(i3);
            this.am = 3;
            this.D = m((int) this.z);
            this.A = 0.0f;
        }
    }

    private int l(int i2) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return -1;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((this.k && i2 <= childAt.getBottom()) || (!this.k && i2 <= childAt.getRight())) {
                return this.w + i3;
            }
        }
        return -1;
    }

    private int m(int i2) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return -1;
        }
        int l2 = l(i2);
        if (l2 != -1) {
            return l2;
        }
        return (this.w + childCount) - 1;
    }

    @TargetApi(9)
    private int a(ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT < 9) {
            return 0;
        }
        return viewConfiguration.getScaledOverscrollDistance();
    }

    private boolean f() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return true;
        }
        if (childCount != this.s) {
            return false;
        }
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(childCount - 1);
        if (this.k) {
            if (childAt.getTop() < getPaddingTop() || childAt2.getBottom() > getHeight() - getPaddingBottom()) {
                return false;
            }
            return true;
        } else if (childAt.getLeft() < getPaddingLeft() || childAt2.getRight() > getWidth() - getPaddingRight()) {
            return false;
        } else {
            return true;
        }
    }

    private void g() {
        setHorizontalScrollBarEnabled(!this.k);
        setVerticalScrollBarEnabled(this.k);
    }

    private void h() {
        if (this.E == null) {
            this.E = new CheckForTap();
        }
        postDelayed(this.E, (long) ViewConfiguration.getTapTimeout());
    }

    private void i() {
        CheckForTap checkForTap = this.E;
        if (checkForTap != null) {
            removeCallbacks(checkForTap);
        }
    }

    /* access modifiers changed from: private */
    public void j() {
        if (this.F == null) {
            this.F = new CheckForLongPress();
        }
        this.F.rememberWindowAttachCount();
        postDelayed(this.F, (long) ViewConfiguration.getLongPressTimeout());
    }

    private void k() {
        CheckForLongPress checkForLongPress = this.F;
        if (checkForLongPress != null) {
            removeCallbacks(checkForLongPress);
        }
    }

    private boolean n(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i2;
        int childCount = getChildCount();
        if (childCount == 0) {
            return true;
        }
        View childAt = getChildAt(0);
        int top = this.k ? childAt.getTop() : childAt.getLeft();
        int i10 = childCount - 1;
        View childAt2 = getChildAt(i10);
        int bottom = this.k ? childAt2.getBottom() : childAt2.getRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i11 = this.k ? paddingTop : paddingLeft;
        int i12 = i11 - top;
        if (this.k) {
            i3 = getHeight() - paddingBottom;
        } else {
            i3 = getWidth() - paddingRight;
        }
        int i13 = bottom - i3;
        if (this.k) {
            i4 = (getHeight() - paddingBottom) - paddingTop;
        } else {
            i4 = (getWidth() - paddingRight) - paddingLeft;
        }
        if (i9 < 0) {
            i5 = Math.max(-(i4 - 1), i9);
        } else {
            i5 = Math.min(i4 - 1, i9);
        }
        int i14 = this.w;
        boolean z2 = i14 == 0 && top >= i11 && i5 >= 0;
        boolean z3 = i14 + childCount == this.s && bottom <= i3 && i5 <= 0;
        if (!z2 && !z3) {
            boolean isInTouchMode = isInTouchMode();
            if (isInTouchMode) {
                p();
            }
            boolean z4 = i5 < 0;
            if (!z4) {
                int i15 = i3 - i5;
                i7 = 0;
                int i16 = 0;
                while (i10 >= 0) {
                    View childAt3 = getChildAt(i10);
                    if ((this.k ? childAt3.getTop() : childAt3.getLeft()) <= i15) {
                        break;
                    }
                    i16 = i6 + 1;
                    this.f10537a.addScrapView(childAt3, i14 + i10);
                    int i17 = i10;
                    i10--;
                    i7 = i17;
                }
            } else {
                int i18 = (-i5) + i11;
                i6 = 0;
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt4 = getChildAt(i19);
                    if ((this.k ? childAt4.getBottom() : childAt4.getRight()) >= i18) {
                        break;
                    }
                    i6++;
                    this.f10537a.addScrapView(childAt4, i14 + i19);
                }
                i7 = 0;
            }
            this.n = true;
            if (i6 > 0) {
                detachViewsFromParent(i7, i6);
            }
            if (!l()) {
                invalidate();
            }
            q(i5);
            if (z4) {
                this.w += i6;
            }
            int abs = Math.abs(i5);
            if (i12 < abs || i13 < abs) {
                fillGap(z4);
            }
            if (isInTouchMode || (i8 = this.ad) == -1) {
                int i20 = this.N;
                if (i20 != -1) {
                    int i21 = i20 - this.w;
                    if (i21 >= 0 && i21 < getChildCount()) {
                        a(-1, getChildAt(i21));
                    }
                } else {
                    this.g.setEmpty();
                }
            } else {
                int i22 = i8 - this.w;
                if (i22 >= 0 && i22 < getChildCount()) {
                    a(this.ad, getChildAt(i22));
                }
            }
            this.n = false;
            e();
            return false;
        } else if (i5 != 0) {
            return true;
        } else {
            return false;
        }
    }

    @TargetApi(14)
    private final float getCurrVelocity() {
        if (Build.VERSION.SDK_INT >= 14) {
            return this.i.getCurrVelocity();
        }
        return 0.0f;
    }

    @TargetApi(5)
    private boolean l() {
        if (Build.VERSION.SDK_INT >= 5) {
            return super.awakenScrollBars();
        }
        return false;
    }

    public void computeScroll() {
        int i2;
        if (this.i.computeScrollOffset()) {
            if (this.k) {
                i2 = this.i.getCurrY();
            } else {
                i2 = this.i.getCurrX();
            }
            float f2 = (float) i2;
            int i3 = (int) (f2 - this.z);
            this.z = f2;
            boolean n2 = n(i3);
            if (n2 || this.i.isFinished()) {
                if (n2) {
                    if (ViewCompat.getMin(this) != 2) {
                        if ((i3 > 0 ? this.ap : this.aq).getMax(Math.abs((int) getCurrVelocity()))) {
                            ViewCompat.equals(this);
                        }
                    }
                    this.i.abortAnimation();
                }
                this.am = -1;
                g(0);
                return;
            }
            ViewCompat.equals(this);
        }
    }

    private void m() {
        getDrawerToggleDelegate getdrawertoggledelegate = this.ap;
        if (getdrawertoggledelegate != null) {
            getdrawertoggledelegate.setMin();
        }
        getDrawerToggleDelegate getdrawertoggledelegate2 = this.aq;
        if (getdrawertoggledelegate2 != null) {
            getdrawertoggledelegate2.setMin();
        }
    }

    private boolean a(Canvas canvas) {
        if (this.ap.setMax()) {
            return false;
        }
        if (this.k) {
            return this.ap.length(canvas);
        }
        int save = canvas.save();
        canvas.translate(0.0f, (float) ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        canvas.rotate(270.0f);
        boolean length = this.ap.length(canvas);
        canvas.restoreToCount(save);
        return length;
    }

    private boolean b(Canvas canvas) {
        if (this.aq.setMax()) {
            return false;
        }
        int save = canvas.save();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (this.k) {
            canvas.translate((float) (-width), (float) height);
            canvas.rotate(180.0f, (float) width, 0.0f);
        } else {
            canvas.translate((float) width, 0.0f);
            canvas.rotate(90.0f);
        }
        boolean length = this.aq.length(canvas);
        canvas.restoreToCount(save);
        return length;
    }

    private void c(Canvas canvas) {
        if (!this.g.isEmpty()) {
            Drawable drawable = this.M;
            drawable.setBounds(this.g);
            drawable.draw(canvas);
        }
    }

    private void n() {
        setSelector(getResources().getDrawable(17301602));
    }

    private boolean o() {
        return (hasFocus() && !isInTouchMode()) || q();
    }

    /* access modifiers changed from: private */
    public void a(int i2, View view) {
        if (i2 != -1) {
            this.N = i2;
        }
        this.g.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        boolean z2 = this.K;
        if (view.isEnabled() != z2) {
            this.K = !z2;
            if (getSelectedItemPosition() != -1) {
                refreshDrawableState();
            }
        }
    }

    private void p() {
        int i2 = this.ad;
        if (i2 != -1) {
            if (this.al != 4) {
                this.J = i2;
            }
            int i3 = this.ab;
            if (i3 >= 0 && i3 != this.ad) {
                this.J = i3;
            }
            setSelectedPositionInt(-1);
            setNextSelectedPositionInt(-1);
            this.aa = 0;
        }
    }

    private void setSelectedPositionInt(int i2) {
        this.ad = i2;
        this.ae = getItemIdAtPosition(i2);
    }

    private void setSelectionInt(int i2) {
        setNextSelectedPositionInt(i2);
        int i3 = this.ad;
        boolean z2 = true;
        if (i3 < 0 || !(i2 == i3 - 1 || i2 == i3 + 1)) {
            z2 = false;
        }
        x();
        if (z2) {
            l();
        }
    }

    private void setNextSelectedPositionInt(int i2) {
        this.ab = i2;
        long itemIdAtPosition = getItemIdAtPosition(i2);
        this.ac = itemIdAtPosition;
        if (this.S && this.T == 0 && i2 >= 0) {
            this.U = i2;
            this.V = itemIdAtPosition;
        }
    }

    private boolean q() {
        int i2 = this.am;
        return i2 == 1 || i2 == 2;
    }

    private void r() {
        if (isEnabled() && isClickable()) {
            Drawable drawable = this.M;
            Rect rect = this.g;
            if (drawable == null) {
                return;
            }
            if ((isFocused() || q()) && !rect.isEmpty()) {
                View childAt = getChildAt(this.ad - this.w);
                if (childAt != null) {
                    if (!childAt.hasFocusable()) {
                        childAt.setPressed(true);
                    } else {
                        return;
                    }
                }
                setPressed(true);
                boolean isLongClickable = isLongClickable();
                Drawable current = drawable.getCurrent();
                if (current != null && (current instanceof TransitionDrawable)) {
                    if (isLongClickable) {
                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                    } else {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                if (isLongClickable && !this.r) {
                    if (this.G == null) {
                        this.G = new CheckForKeyLongPress();
                    }
                    this.G.rememberWindowAttachCount();
                    postDelayed(this.G, (long) ViewConfiguration.getLongPressTimeout());
                }
            }
        }
    }

    private void s() {
        if (this.M == null) {
            return;
        }
        if (o()) {
            this.M.setState(getDrawableState());
        } else {
            this.M.setState(STATE_NOTHING);
        }
    }

    private void t() {
        if (this.ad != this.af || this.ae != this.ag) {
            u();
            this.af = this.ad;
            this.ag = this.ae;
        }
    }

    private void u() {
        if (getOnItemSelectedListener() != null) {
            if (this.m || this.n) {
                if (this.R == null) {
                    this.R = new SelectionNotifier();
                }
                post(this.R);
                return;
            }
            v();
            w();
        }
    }

    /* access modifiers changed from: private */
    public void v() {
        AdapterView.OnItemSelectedListener onItemSelectedListener = getOnItemSelectedListener();
        if (onItemSelectedListener != null) {
            int selectedItemPosition = getSelectedItemPosition();
            if (selectedItemPosition >= 0) {
                onItemSelectedListener.onItemSelected(this, getSelectedView(), selectedItemPosition, this.j.getItemId(selectedItemPosition));
                return;
            }
            onItemSelectedListener.onNothingSelected(this);
        }
    }

    /* access modifiers changed from: private */
    public void w() {
        if (getSelectedItemPosition() >= 0) {
            sendAccessibilityEvent(4);
        }
    }

    private int o(int i2) {
        return a(i2, true);
    }

    private int a(int i2, boolean z2) {
        int i3;
        ListAdapter listAdapter = this.j;
        if (listAdapter != null && !isInTouchMode()) {
            int i4 = this.s;
            if (!this.v) {
                if (z2) {
                    i3 = Math.max(0, i2);
                    while (i3 < i4 && !listAdapter.isEnabled(i3)) {
                        i3++;
                    }
                } else {
                    int min = Math.min(i2, i4 - 1);
                    while (i3 >= 0 && !listAdapter.isEnabled(i3)) {
                        min = i3 - 1;
                    }
                }
                if (i3 < 0 || i3 >= i4) {
                    return -1;
                }
                return i3;
            } else if (i2 < 0 || i2 >= i4) {
                return -1;
            } else {
                return i2;
            }
        }
        return -1;
    }

    private int p(int i2) {
        a(i2);
        int i3 = this.w;
        ListAdapter adapter = getAdapter();
        if (i2 == 130 || i2 == 66) {
            int i4 = this.ad;
            int i5 = i4 != -1 ? i4 + 1 : i3;
            if (i5 >= adapter.getCount()) {
                return -1;
            }
            if (i5 < i3) {
                i5 = i3;
            }
            int lastVisiblePosition = getLastVisiblePosition();
            while (i5 <= lastVisiblePosition) {
                if (adapter.isEnabled(i5) && getChildAt(i5 - i3).getVisibility() == 0) {
                    return i5;
                }
                i5++;
            }
        } else {
            int childCount = (getChildCount() + i3) - 1;
            int i6 = this.ad;
            if (i6 == -1) {
                i6 = getChildCount() + i3;
            }
            int i7 = i6 - 1;
            if (i7 < 0 || i7 >= adapter.getCount()) {
                return -1;
            }
            if (i7 <= childCount) {
                childCount = i7;
            }
            while (childCount >= i3) {
                if (adapter.isEnabled(childCount) && getChildAt(childCount - i3).getVisibility() == 0) {
                    return childCount;
                }
                childCount--;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        s();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        if (this.K) {
            return super.onCreateDrawableState(i2);
        }
        int i3 = ENABLED_STATE_SET[0];
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        int length = onCreateDrawableState.length - 1;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            } else if (onCreateDrawableState[length] == i3) {
                break;
            } else {
                length--;
            }
        }
        if (length >= 0) {
            System.arraycopy(onCreateDrawableState, length + 1, onCreateDrawableState, length, (onCreateDrawableState.length - length) - 1);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public boolean canAnimate() {
        return super.canAnimate() && this.s > 0;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        boolean z2 = this.L;
        if (!z2) {
            c(canvas);
        }
        super.dispatchDraw(canvas);
        if (z2) {
            c(canvas);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z2 = false;
        if (this.ap != null) {
            z2 = false | a(canvas);
        }
        if (this.aq != null) {
            z2 |= b(canvas);
        }
        if (z2) {
            ViewCompat.equals(this);
        }
    }

    public void requestLayout() {
        if (!this.m && !this.n) {
            super.requestLayout();
        }
    }

    public View getSelectedView() {
        int i2;
        if (this.s <= 0 || (i2 = this.ad) < 0) {
            return null;
        }
        return getChildAt(i2 - this.w);
    }

    public void setSelection(int i2) {
        setSelectionFromOffset(i2, 0);
    }

    public void setSelectionFromOffset(int i2, int i3) {
        if (this.j != null) {
            if (!isInTouchMode()) {
                i2 = o(i2);
                if (i2 >= 0) {
                    setNextSelectedPositionInt(i2);
                }
            } else {
                this.J = i2;
            }
            if (i2 >= 0) {
                this.al = 4;
                if (this.k) {
                    this.x = getPaddingTop() + i3;
                } else {
                    this.x = getPaddingLeft() + i3;
                }
                if (this.S) {
                    this.U = i2;
                    this.V = this.j.getItemId(i2);
                }
                requestLayout();
            }
        }
    }

    public void scrollBy(int i2) {
        n(i2);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        return (dispatchKeyEvent || getFocusedChild() == null || keyEvent.getAction() != 0) ? dispatchKeyEvent : onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        if (this.M == null) {
            n();
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        ListAdapter listAdapter = this.j;
        int i5 = 0;
        int count = listAdapter == null ? 0 : listAdapter.getCount();
        this.s = count;
        if (count <= 0 || !(mode == 0 || mode2 == 0)) {
            i4 = 0;
        } else {
            View a2 = a(0, this.mIsScrap);
            b(a2, 0, this.k ? i2 : i3);
            i5 = a2.getMeasuredWidth();
            i4 = a2.getMeasuredHeight();
            if (recycleOnMeasure()) {
                this.f10537a.addScrapView(a2, -1);
            }
        }
        if (mode == 0) {
            size = getPaddingLeft() + getPaddingRight() + i5;
            if (this.k) {
                size += getVerticalScrollbarWidth();
            }
        }
        int i6 = size;
        if (mode2 == 0) {
            size2 = getPaddingTop() + getPaddingBottom() + i4;
            if (!this.k && getChildCount() != 0) {
                size2 += getHorizontalScrollbarHeight();
            }
        }
        int i7 = size2;
        if (this.k && mode2 == Integer.MIN_VALUE) {
            i7 = a(i2, 0, -1, i7, -1);
        }
        int i8 = i7;
        if (!this.k && mode == Integer.MIN_VALUE) {
            i6 = b(i3, 0, -1, i6, -1);
        }
        setMeasuredDimension(i6, i8);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        this.m = true;
        if (z2) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                getChildAt(i6).forceLayout();
            }
            this.f10537a.markChildrenDirty();
        }
        x();
        this.m = false;
        int paddingLeft = ((i4 - i2) - getPaddingLeft()) - getPaddingRight();
        int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        getDrawerToggleDelegate getdrawertoggledelegate = this.ap;
        if (getdrawertoggledelegate != null && this.aq != null) {
            if (this.k) {
                getdrawertoggledelegate.getMin(paddingLeft, paddingTop);
                this.aq.getMin(paddingLeft, paddingTop);
                return;
            }
            getdrawertoggledelegate.getMin(paddingTop, paddingLeft);
            this.aq.getMin(paddingTop, paddingLeft);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a4 A[Catch:{ all -> 0x028a }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ab A[Catch:{ all -> 0x028a }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b5 A[SYNTHETIC, Splitter:B:56:0x00b5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x() {
        /*
            r18 = this;
            r7 = r18
            int r0 = r18.getWidth()
            if (r0 == 0) goto L_0x0293
            int r0 = r18.getHeight()
            if (r0 != 0) goto L_0x0010
            goto L_0x0293
        L_0x0010:
            boolean r8 = r7.n
            if (r8 != 0) goto L_0x0293
            r0 = 1
            r7.n = r0
            r9 = 0
            r18.invalidate()     // Catch:{ all -> 0x028a }
            android.widget.ListAdapter r1 = r7.j     // Catch:{ all -> 0x028a }
            if (r1 != 0) goto L_0x0029
            r18.resetState()     // Catch:{ all -> 0x028a }
            if (r8 != 0) goto L_0x0028
            r7.n = r9
            r7.r = r9
        L_0x0028:
            return
        L_0x0029:
            boolean r1 = r7.k     // Catch:{ all -> 0x028a }
            if (r1 == 0) goto L_0x0032
            int r1 = r18.getPaddingTop()     // Catch:{ all -> 0x028a }
            goto L_0x0036
        L_0x0032:
            int r1 = r18.getPaddingLeft()     // Catch:{ all -> 0x028a }
        L_0x0036:
            r5 = r1
            boolean r1 = r7.k     // Catch:{ all -> 0x028a }
            if (r1 == 0) goto L_0x0045
            int r1 = r18.getHeight()     // Catch:{ all -> 0x028a }
            int r2 = r18.getPaddingBottom()     // Catch:{ all -> 0x028a }
        L_0x0043:
            int r1 = r1 - r2
            goto L_0x004e
        L_0x0045:
            int r1 = r18.getWidth()     // Catch:{ all -> 0x028a }
            int r2 = r18.getPaddingRight()     // Catch:{ all -> 0x028a }
            goto L_0x0043
        L_0x004e:
            r6 = r1
            int r1 = r18.getChildCount()     // Catch:{ all -> 0x028a }
            int r2 = r7.al     // Catch:{ all -> 0x028a }
            r10 = 3
            if (r2 == r0) goto L_0x009c
            r4 = 2
            if (r2 == r4) goto L_0x008c
            if (r2 == r10) goto L_0x009c
            r4 = 4
            if (r2 == r4) goto L_0x009c
            r4 = 5
            if (r2 == r4) goto L_0x009c
            int r2 = r7.ad     // Catch:{ all -> 0x028a }
            int r4 = r7.w     // Catch:{ all -> 0x028a }
            int r2 = r2 - r4
            if (r2 < 0) goto L_0x0071
            if (r2 >= r1) goto L_0x0071
            android.view.View r4 = r7.getChildAt(r2)     // Catch:{ all -> 0x028a }
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            android.view.View r11 = r7.getChildAt(r9)     // Catch:{ all -> 0x028a }
            int r12 = r7.ab     // Catch:{ all -> 0x028a }
            if (r12 < 0) goto L_0x0080
            int r12 = r7.ab     // Catch:{ all -> 0x028a }
            int r13 = r7.ad     // Catch:{ all -> 0x028a }
            int r12 = r12 - r13
            goto L_0x0081
        L_0x0080:
            r12 = 0
        L_0x0081:
            int r2 = r2 + r12
            android.view.View r2 = r7.getChildAt(r2)     // Catch:{ all -> 0x028a }
            r17 = r4
            r4 = r2
            r2 = r17
            goto L_0x00a0
        L_0x008c:
            int r2 = r7.ab     // Catch:{ all -> 0x028a }
            int r4 = r7.w     // Catch:{ all -> 0x028a }
            int r2 = r2 - r4
            if (r2 < 0) goto L_0x009c
            if (r2 >= r1) goto L_0x009c
            android.view.View r2 = r7.getChildAt(r2)     // Catch:{ all -> 0x028a }
            r4 = r2
            r2 = 0
            goto L_0x009e
        L_0x009c:
            r2 = 0
            r4 = 0
        L_0x009e:
            r11 = 0
            r12 = 0
        L_0x00a0:
            boolean r13 = r7.r     // Catch:{ all -> 0x028a }
            if (r13 == 0) goto L_0x00a7
            r18.y()     // Catch:{ all -> 0x028a }
        L_0x00a7:
            int r14 = r7.s     // Catch:{ all -> 0x028a }
            if (r14 != 0) goto L_0x00b5
            r18.resetState()     // Catch:{ all -> 0x028a }
            if (r8 != 0) goto L_0x00b4
            r7.n = r9
            r7.r = r9
        L_0x00b4:
            return
        L_0x00b5:
            int r14 = r7.s     // Catch:{ all -> 0x028a }
            android.widget.ListAdapter r15 = r7.j     // Catch:{ all -> 0x028a }
            int r15 = r15.getCount()     // Catch:{ all -> 0x028a }
            if (r14 != r15) goto L_0x0253
            int r14 = r7.ab     // Catch:{ all -> 0x028a }
            r7.setSelectedPositionInt(r14)     // Catch:{ all -> 0x028a }
            int r14 = r7.w     // Catch:{ all -> 0x028a }
            com.alibaba.griver.ui.ant.basic.AUHorizontalListView$RecycleBin r15 = r7.f10537a     // Catch:{ all -> 0x028a }
            if (r13 == 0) goto L_0x00db
            r3 = 0
        L_0x00cb:
            if (r3 >= r1) goto L_0x00de
            android.view.View r10 = r7.getChildAt(r3)     // Catch:{ all -> 0x028a }
            int r9 = r14 + r3
            r15.addScrapView(r10, r9)     // Catch:{ all -> 0x028a }
            int r3 = r3 + 1
            r9 = 0
            r10 = 3
            goto L_0x00cb
        L_0x00db:
            r15.fillActiveViews(r1, r14)     // Catch:{ all -> 0x028a }
        L_0x00de:
            android.view.View r3 = r18.getFocusedChild()     // Catch:{ all -> 0x028a }
            if (r3 == 0) goto L_0x00fa
            if (r13 != 0) goto L_0x00f2
            android.view.View r9 = r18.findFocus()     // Catch:{ all -> 0x028a }
            if (r9 == 0) goto L_0x00ef
            r9.onStartTemporaryDetach()     // Catch:{ all -> 0x028a }
        L_0x00ef:
            r16 = r9
            goto L_0x00f5
        L_0x00f2:
            r3 = 0
            r16 = 0
        L_0x00f5:
            r18.requestFocus()     // Catch:{ all -> 0x028a }
            r9 = r3
            goto L_0x00fd
        L_0x00fa:
            r9 = 0
            r16 = 0
        L_0x00fd:
            r18.detachAllViewsFromParent()     // Catch:{ all -> 0x028a }
            int r3 = r7.al     // Catch:{ all -> 0x028a }
            switch(r3) {
                case 1: goto L_0x0152;
                case 2: goto L_0x0139;
                case 3: goto L_0x012d;
                case 4: goto L_0x0121;
                case 5: goto L_0x0117;
                case 6: goto L_0x010d;
                default: goto L_0x0105;
            }     // Catch:{ all -> 0x028a }
        L_0x0105:
            if (r1 != 0) goto L_0x0165
            r1 = 0
            int r2 = r7.o(r1)     // Catch:{ all -> 0x028a }
            goto L_0x015d
        L_0x010d:
            r1 = r18
            r3 = r4
            r4 = r12
            android.view.View r1 = r1.a((android.view.View) r2, (android.view.View) r3, (int) r4, (int) r5, (int) r6)     // Catch:{ all -> 0x028a }
            goto L_0x01a9
        L_0x0117:
            int r1 = r7.U     // Catch:{ all -> 0x028a }
            int r2 = r7.x     // Catch:{ all -> 0x028a }
            android.view.View r1 = r7.e(r1, r2)     // Catch:{ all -> 0x028a }
            goto L_0x01a9
        L_0x0121:
            int r1 = r18.z()     // Catch:{ all -> 0x028a }
            int r2 = r7.x     // Catch:{ all -> 0x028a }
            android.view.View r1 = r7.e(r1, r2)     // Catch:{ all -> 0x028a }
            goto L_0x01a9
        L_0x012d:
            int r1 = r7.s     // Catch:{ all -> 0x028a }
            int r1 = r1 - r0
            android.view.View r1 = r7.c(r1, r6)     // Catch:{ all -> 0x028a }
            r18.A()     // Catch:{ all -> 0x028a }
            goto L_0x01a9
        L_0x0139:
            if (r4 == 0) goto L_0x014d
            boolean r1 = r7.k     // Catch:{ all -> 0x028a }
            if (r1 == 0) goto L_0x0144
            int r1 = r4.getTop()     // Catch:{ all -> 0x028a }
            goto L_0x0148
        L_0x0144:
            int r1 = r4.getLeft()     // Catch:{ all -> 0x028a }
        L_0x0148:
            android.view.View r1 = r7.a((int) r1, (int) r5, (int) r6)     // Catch:{ all -> 0x028a }
            goto L_0x01a9
        L_0x014d:
            android.view.View r1 = r7.f(r5, r6)     // Catch:{ all -> 0x028a }
            goto L_0x01a9
        L_0x0152:
            r1 = 0
            r7.w = r1     // Catch:{ all -> 0x028a }
            android.view.View r1 = r7.r(r5)     // Catch:{ all -> 0x028a }
            r18.A()     // Catch:{ all -> 0x028a }
            goto L_0x01a9
        L_0x015d:
            r7.setSelectedPositionInt(r2)     // Catch:{ all -> 0x028a }
            android.view.View r1 = r7.r(r5)     // Catch:{ all -> 0x028a }
            goto L_0x01a9
        L_0x0165:
            int r1 = r7.ad     // Catch:{ all -> 0x028a }
            if (r1 < 0) goto L_0x0186
            int r1 = r7.ad     // Catch:{ all -> 0x028a }
            int r3 = r7.s     // Catch:{ all -> 0x028a }
            if (r1 >= r3) goto L_0x0186
            if (r2 == 0) goto L_0x017f
            boolean r1 = r7.k     // Catch:{ all -> 0x028a }
            if (r1 == 0) goto L_0x017a
            int r1 = r2.getTop()     // Catch:{ all -> 0x028a }
            goto L_0x017e
        L_0x017a:
            int r1 = r2.getLeft()     // Catch:{ all -> 0x028a }
        L_0x017e:
            r5 = r1
        L_0x017f:
            int r1 = r7.ad     // Catch:{ all -> 0x028a }
            android.view.View r1 = r7.e(r1, r5)     // Catch:{ all -> 0x028a }
            goto L_0x01a9
        L_0x0186:
            int r1 = r7.w     // Catch:{ all -> 0x028a }
            int r2 = r7.s     // Catch:{ all -> 0x028a }
            if (r1 >= r2) goto L_0x01a3
            if (r11 == 0) goto L_0x019c
            boolean r1 = r7.k     // Catch:{ all -> 0x028a }
            if (r1 == 0) goto L_0x0197
            int r1 = r11.getTop()     // Catch:{ all -> 0x028a }
            goto L_0x019b
        L_0x0197:
            int r1 = r11.getLeft()     // Catch:{ all -> 0x028a }
        L_0x019b:
            r5 = r1
        L_0x019c:
            int r1 = r7.w     // Catch:{ all -> 0x028a }
            android.view.View r1 = r7.e(r1, r5)     // Catch:{ all -> 0x028a }
            goto L_0x01a9
        L_0x01a3:
            r1 = 0
            android.view.View r2 = r7.e(r1, r5)     // Catch:{ all -> 0x028a }
            r1 = r2
        L_0x01a9:
            r15.scrapActiveViews()     // Catch:{ all -> 0x028a }
            if (r1 == 0) goto L_0x01fd
            boolean r2 = r7.q     // Catch:{ all -> 0x028a }
            r3 = -1
            if (r2 == 0) goto L_0x01ea
            boolean r2 = r18.hasFocus()     // Catch:{ all -> 0x028a }
            if (r2 == 0) goto L_0x01ea
            boolean r2 = r1.hasFocus()     // Catch:{ all -> 0x028a }
            if (r2 != 0) goto L_0x01ea
            if (r1 != r9) goto L_0x01c9
            if (r16 == 0) goto L_0x01c9
            boolean r2 = r16.requestFocus()     // Catch:{ all -> 0x028a }
            if (r2 != 0) goto L_0x01d1
        L_0x01c9:
            boolean r2 = r1.requestFocus()     // Catch:{ all -> 0x028a }
            if (r2 == 0) goto L_0x01d0
            goto L_0x01d1
        L_0x01d0:
            r0 = 0
        L_0x01d1:
            if (r0 != 0) goto L_0x01e0
            android.view.View r0 = r18.getFocusedChild()     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x01dc
            r0.clearFocus()     // Catch:{ all -> 0x028a }
        L_0x01dc:
            r7.a((int) r3, (android.view.View) r1)     // Catch:{ all -> 0x028a }
            goto L_0x01ed
        L_0x01e0:
            r2 = 0
            r1.setSelected(r2)     // Catch:{ all -> 0x028a }
            android.graphics.Rect r0 = r7.g     // Catch:{ all -> 0x028a }
            r0.setEmpty()     // Catch:{ all -> 0x028a }
            goto L_0x01ed
        L_0x01ea:
            r7.a((int) r3, (android.view.View) r1)     // Catch:{ all -> 0x028a }
        L_0x01ed:
            boolean r0 = r7.k     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x01f6
            int r0 = r1.getTop()     // Catch:{ all -> 0x028a }
            goto L_0x01fa
        L_0x01f6:
            int r0 = r1.getLeft()     // Catch:{ all -> 0x028a }
        L_0x01fa:
            r7.aa = r0     // Catch:{ all -> 0x028a }
            goto L_0x022a
        L_0x01fd:
            int r0 = r7.am     // Catch:{ all -> 0x028a }
            if (r0 <= 0) goto L_0x0217
            int r0 = r7.am     // Catch:{ all -> 0x028a }
            r1 = 3
            if (r0 >= r1) goto L_0x0217
            int r0 = r7.D     // Catch:{ all -> 0x028a }
            int r1 = r7.w     // Catch:{ all -> 0x028a }
            int r0 = r0 - r1
            android.view.View r0 = r7.getChildAt(r0)     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x021f
            int r1 = r7.D     // Catch:{ all -> 0x028a }
            r7.a((int) r1, (android.view.View) r0)     // Catch:{ all -> 0x028a }
            goto L_0x021f
        L_0x0217:
            r1 = 0
            r7.aa = r1     // Catch:{ all -> 0x028a }
            android.graphics.Rect r0 = r7.g     // Catch:{ all -> 0x028a }
            r0.setEmpty()     // Catch:{ all -> 0x028a }
        L_0x021f:
            boolean r0 = r18.hasFocus()     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x022a
            if (r16 == 0) goto L_0x022a
            r16.requestFocus()     // Catch:{ all -> 0x028a }
        L_0x022a:
            if (r16 == 0) goto L_0x0235
            android.os.IBinder r0 = r16.getWindowToken()     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x0235
            r16.onFinishTemporaryDetach()     // Catch:{ all -> 0x028a }
        L_0x0235:
            r1 = 0
            r7.al = r1     // Catch:{ all -> 0x028a }
            r7.r = r1     // Catch:{ all -> 0x028a }
            r7.S = r1     // Catch:{ all -> 0x028a }
            int r0 = r7.ad     // Catch:{ all -> 0x028a }
            r7.setNextSelectedPositionInt(r0)     // Catch:{ all -> 0x028a }
            int r0 = r7.s     // Catch:{ all -> 0x028a }
            if (r0 <= 0) goto L_0x0248
            r18.t()     // Catch:{ all -> 0x028a }
        L_0x0248:
            r18.e()     // Catch:{ all -> 0x028a }
            if (r8 != 0) goto L_0x0252
            r1 = 0
            r7.n = r1
            r7.r = r1
        L_0x0252:
            return
        L_0x0253:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x028a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x028a }
            java.lang.String r2 = "The content of the adapter has changed but TwoWayView did not receive a notification. Make sure the content of your adapter is not modified from a background thread, but only from the UI thread. [in TwoWayView("
            r1.<init>(r2)     // Catch:{ all -> 0x028a }
            int r2 = r18.getId()     // Catch:{ all -> 0x028a }
            r1.append(r2)     // Catch:{ all -> 0x028a }
            java.lang.String r2 = ", "
            r1.append(r2)     // Catch:{ all -> 0x028a }
            java.lang.Class r2 = r18.getClass()     // Catch:{ all -> 0x028a }
            r1.append(r2)     // Catch:{ all -> 0x028a }
            java.lang.String r2 = ") with Adapter("
            r1.append(r2)     // Catch:{ all -> 0x028a }
            android.widget.ListAdapter r2 = r7.j     // Catch:{ all -> 0x028a }
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x028a }
            r1.append(r2)     // Catch:{ all -> 0x028a }
            java.lang.String r2 = ")]"
            r1.append(r2)     // Catch:{ all -> 0x028a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x028a }
            r0.<init>(r1)     // Catch:{ all -> 0x028a }
            throw r0     // Catch:{ all -> 0x028a }
        L_0x028a:
            r0 = move-exception
            if (r8 != 0) goto L_0x0292
            r1 = 0
            r7.n = r1
            r7.r = r1
        L_0x0292:
            throw r0
        L_0x0293:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.ant.basic.AUHorizontalListView.x():void");
    }

    private void q(int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (this.k) {
                childAt.offsetTopAndBottom(i2);
            } else {
                childAt.offsetLeftAndRight(i2);
            }
        }
    }

    private View a(View view, View view2, int i2, int i3, int i4) {
        View view3;
        int i5 = this.ad;
        int top = this.k ? view.getTop() : view.getLeft();
        int bottom = this.k ? view.getBottom() : view.getRight();
        if (i2 > 0) {
            View a2 = a(i5 - 1, top, true, false);
            int i6 = this.l;
            view3 = a(i5, bottom + i6, true, true);
            int top2 = this.k ? view3.getTop() : view3.getLeft();
            int bottom2 = this.k ? view3.getBottom() : view3.getRight();
            if (bottom2 > i4) {
                int min = Math.min(Math.min(top2 - i3, bottom2 - i4), (i4 - i3) / 2);
                if (this.k) {
                    int i7 = -min;
                    a2.offsetTopAndBottom(i7);
                    view3.offsetTopAndBottom(i7);
                } else {
                    int i8 = -min;
                    a2.offsetLeftAndRight(i8);
                    view3.offsetLeftAndRight(i8);
                }
            }
            c(this.ad - 2, top2 - i6);
            A();
            d(this.ad + 1, bottom2 + i6);
        } else if (i2 < 0) {
            if (view2 != null) {
                view3 = a(i5, this.k ? view2.getTop() : view2.getLeft(), true, true);
            } else {
                view3 = a(i5, top, false, true);
            }
            int top3 = this.k ? view3.getTop() : view3.getLeft();
            int bottom3 = this.k ? view3.getBottom() : view3.getRight();
            if (top3 < i3) {
                int min2 = Math.min(Math.min(i3 - top3, i4 - bottom3), (i4 - i3) / 2);
                if (this.k) {
                    view3.offsetTopAndBottom(min2);
                } else {
                    view3.offsetLeftAndRight(min2);
                }
            }
            a(view3, i5);
        } else {
            view3 = a(i5, top, true, true);
            int top4 = this.k ? view3.getTop() : view3.getLeft();
            int bottom4 = this.k ? view3.getBottom() : view3.getRight();
            if (top < i3 && bottom4 < i3 + 20) {
                if (this.k) {
                    view3.offsetTopAndBottom(i3 - top4);
                } else {
                    view3.offsetLeftAndRight(i3 - top4);
                }
            }
            a(view3, i5);
        }
        return view3;
    }

    /* access modifiers changed from: package-private */
    public void confirmCheckedPositionsById() {
        boolean z2;
        this.aj.clear();
        int i2 = 0;
        while (true) {
            PlaybackStateCompat.ShuffleMode<Integer> shuffleMode = this.mCheckedIdStates;
            if (shuffleMode.getMin) {
                shuffleMode.getMin();
            }
            if (i2 < shuffleMode.length) {
                PlaybackStateCompat.ShuffleMode<Integer> shuffleMode2 = this.mCheckedIdStates;
                if (shuffleMode2.getMin) {
                    shuffleMode2.getMin();
                }
                long j2 = shuffleMode2.setMax[i2];
                PlaybackStateCompat.ShuffleMode<Integer> shuffleMode3 = this.mCheckedIdStates;
                if (shuffleMode3.getMin) {
                    shuffleMode3.getMin();
                }
                int intValue = ((Integer) shuffleMode3.setMin[i2]).intValue();
                if (j2 != this.j.getItemId(intValue)) {
                    int max = Math.max(0, intValue - 20);
                    int min = Math.min(intValue + 20, this.s);
                    while (true) {
                        if (max >= min) {
                            z2 = false;
                            break;
                        } else if (j2 == this.j.getItemId(max)) {
                            this.aj.put(max, true);
                            PlaybackStateCompat.ShuffleMode<Integer> shuffleMode4 = this.mCheckedIdStates;
                            Integer valueOf = Integer.valueOf(max);
                            if (shuffleMode4.getMin) {
                                shuffleMode4.getMin();
                            }
                            shuffleMode4.setMin[i2] = valueOf;
                            z2 = true;
                        } else {
                            max++;
                        }
                    }
                    if (!z2) {
                        this.mCheckedIdStates.getMin(j2);
                        i2--;
                        this.ai--;
                    }
                } else {
                    this.aj.put(intValue, true);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private void y() {
        ListAdapter listAdapter;
        if (!(this.ah.compareTo(ChoiceMode.NONE) == 0 || (listAdapter = this.j) == null || !listAdapter.hasStableIds())) {
            confirmCheckedPositionsById();
        }
        this.f10537a.clearTransientStateViews();
        int i2 = this.s;
        if (i2 > 0) {
            if (this.S) {
                this.S = false;
                this.y = null;
                int i3 = this.T;
                if (i3 != 0) {
                    if (i3 == 1) {
                        this.al = 5;
                        this.U = Math.min(Math.max(0, this.U), i2 - 1);
                        return;
                    }
                } else if (isInTouchMode()) {
                    this.al = 5;
                    this.U = Math.min(Math.max(0, this.U), i2 - 1);
                    return;
                } else {
                    int C2 = C();
                    if (C2 >= 0 && a(C2, true) == C2) {
                        this.U = C2;
                        if (this.W == ((long) getHeight())) {
                            this.al = 5;
                        } else {
                            this.al = 2;
                        }
                        setNextSelectedPositionInt(C2);
                        return;
                    }
                }
            }
            if (!isInTouchMode()) {
                int selectedItemPosition = getSelectedItemPosition();
                if (selectedItemPosition >= i2) {
                    selectedItemPosition = i2 - 1;
                }
                if (selectedItemPosition < 0) {
                    selectedItemPosition = 0;
                }
                int a2 = a(selectedItemPosition, true);
                if (a2 >= 0) {
                    setNextSelectedPositionInt(a2);
                    return;
                }
                int a3 = a(selectedItemPosition, false);
                if (a3 >= 0) {
                    setNextSelectedPositionInt(a3);
                    return;
                }
            } else if (this.J >= 0) {
                return;
            }
        }
        this.al = 1;
        this.ad = -1;
        this.ae = Long.MIN_VALUE;
        this.ab = -1;
        this.ac = Long.MIN_VALUE;
        this.S = false;
        this.y = null;
        this.N = -1;
        t();
    }

    private int z() {
        int i2 = this.ad;
        if (i2 < 0) {
            i2 = this.J;
        }
        return Math.min(Math.max(0, i2), this.s - 1);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cb A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean resurrectSelection() {
        /*
            r11 = this;
            int r0 = r11.getChildCount()
            r1 = 0
            if (r0 > 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r2 = r11.k
            if (r2 == 0) goto L_0x0011
            int r2 = r11.getPaddingTop()
            goto L_0x0015
        L_0x0011:
            int r2 = r11.getPaddingLeft()
        L_0x0015:
            boolean r3 = r11.k
            if (r3 == 0) goto L_0x0022
            int r3 = r11.getHeight()
            int r4 = r11.getPaddingBottom()
            goto L_0x002a
        L_0x0022:
            int r3 = r11.getWidth()
            int r4 = r11.getPaddingRight()
        L_0x002a:
            int r3 = r3 - r4
            int r4 = r11.w
            int r5 = r11.J
            r6 = 1
            if (r5 < r4) goto L_0x004a
            int r7 = r4 + r0
            if (r5 >= r7) goto L_0x004a
            int r0 = r5 - r4
            android.view.View r0 = r11.getChildAt(r0)
            boolean r2 = r11.k
            if (r2 == 0) goto L_0x0045
            int r0 = r0.getTop()
            goto L_0x006e
        L_0x0045:
            int r0 = r0.getLeft()
            goto L_0x006e
        L_0x004a:
            if (r5 >= r4) goto L_0x0070
            r3 = 0
            r5 = 0
        L_0x004e:
            if (r5 >= r0) goto L_0x006c
            android.view.View r7 = r11.getChildAt(r5)
            boolean r8 = r11.k
            if (r8 == 0) goto L_0x005d
            int r7 = r7.getTop()
            goto L_0x0061
        L_0x005d:
            int r7 = r7.getLeft()
        L_0x0061:
            if (r5 != 0) goto L_0x0064
            r3 = r7
        L_0x0064:
            if (r7 < r2) goto L_0x0069
            int r5 = r5 + r4
            r0 = r7
            goto L_0x006e
        L_0x0069:
            int r5 = r5 + 1
            goto L_0x004e
        L_0x006c:
            r0 = r3
            r5 = r4
        L_0x006e:
            r2 = 1
            goto L_0x00a5
        L_0x0070:
            int r2 = r4 + r0
            int r5 = r2 + -1
            int r0 = r0 - r6
            r7 = r0
            r2 = 0
        L_0x0077:
            if (r7 < 0) goto L_0x00a3
            android.view.View r8 = r11.getChildAt(r7)
            boolean r9 = r11.k
            if (r9 == 0) goto L_0x0086
            int r9 = r8.getTop()
            goto L_0x008a
        L_0x0086:
            int r9 = r8.getLeft()
        L_0x008a:
            boolean r10 = r11.k
            if (r10 == 0) goto L_0x0093
            int r8 = r8.getBottom()
            goto L_0x0097
        L_0x0093:
            int r8 = r8.getRight()
        L_0x0097:
            if (r7 != r0) goto L_0x009a
            r2 = r9
        L_0x009a:
            if (r8 > r3) goto L_0x00a0
            int r5 = r4 + r7
            r0 = r9
            goto L_0x00a4
        L_0x00a0:
            int r7 = r7 + -1
            goto L_0x0077
        L_0x00a3:
            r0 = r2
        L_0x00a4:
            r2 = 0
        L_0x00a5:
            r3 = -1
            r11.J = r3
            r11.am = r3
            r11.g(r1)
            r11.x = r0
            int r0 = r11.a((int) r5, (boolean) r2)
            if (r0 < r4) goto L_0x00c8
            int r2 = r11.getLastVisiblePosition()
            if (r0 > r2) goto L_0x00c8
            r2 = 4
            r11.al = r2
            r11.s()
            r11.setSelectionInt(r0)
            r11.e()
            r3 = r0
        L_0x00c8:
            if (r3 < 0) goto L_0x00cb
            return r6
        L_0x00cb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.ant.basic.AUHorizontalListView.resurrectSelection():boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean resurrectSelectionIfNeeded() {
        if (this.ad >= 0 || !resurrectSelection()) {
            return false;
        }
        s();
        return true;
    }

    private int a(LayoutParams layoutParams) {
        if (!this.k && layoutParams.width == -2) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        if (this.k) {
            return View.MeasureSpec.makeMeasureSpec((getWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
    }

    private int b(LayoutParams layoutParams) {
        if (this.k && layoutParams.height == -2) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        if (!this.k) {
            return View.MeasureSpec.makeMeasureSpec((getHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
    }

    private void c(View view) {
        a(view, (LayoutParams) view.getLayoutParams());
    }

    private void a(View view, LayoutParams layoutParams) {
        view.measure(a(layoutParams), b(layoutParams));
    }

    private void d(View view) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int top = view.getTop();
        view.layout(paddingLeft, top, measuredWidth + paddingLeft, measuredHeight + top);
    }

    private void b(View view, int i2, int i3) {
        int i4;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
            view.setLayoutParams(layoutParams);
        }
        layoutParams.viewType = this.j.getItemViewType(i2);
        layoutParams.forceAdd = true;
        if (this.k) {
            i4 = b(layoutParams);
        } else {
            int i5 = i3;
            i3 = a(layoutParams);
            i4 = i5;
        }
        view.measure(i3, i4);
    }

    private int a(int i2, int i3, int i4, int i5, int i6) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        ListAdapter listAdapter = this.j;
        if (listAdapter == null) {
            return paddingTop + paddingBottom;
        }
        int i7 = paddingTop + paddingBottom;
        int i8 = this.l;
        int i9 = 0;
        if (i4 == -1) {
            i4 = listAdapter.getCount() - 1;
        }
        RecycleBin recycleBin = this.f10537a;
        boolean recycleOnMeasure = recycleOnMeasure();
        boolean[] zArr = this.mIsScrap;
        while (i3 <= i4) {
            View a2 = a(i3, zArr);
            b(a2, i3, i2);
            if (i3 > 0) {
                i7 += i8;
            }
            if (recycleOnMeasure) {
                recycleBin.addScrapView(a2, -1);
            }
            i7 += a2.getMeasuredHeight();
            if (i7 >= i5) {
                return (i6 < 0 || i3 <= i6 || i9 <= 0 || i7 == i5) ? i5 : i9;
            }
            if (i6 >= 0 && i3 >= i6) {
                i9 = i7;
            }
            i3++;
        }
        return i7;
    }

    private int b(int i2, int i3, int i4, int i5, int i6) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        ListAdapter listAdapter = this.j;
        if (listAdapter == null) {
            return paddingLeft + paddingRight;
        }
        int i7 = paddingLeft + paddingRight;
        int i8 = this.l;
        int i9 = 0;
        if (i4 == -1) {
            i4 = listAdapter.getCount() - 1;
        }
        RecycleBin recycleBin = this.f10537a;
        boolean recycleOnMeasure = recycleOnMeasure();
        boolean[] zArr = this.mIsScrap;
        while (i3 <= i4) {
            View a2 = a(i3, zArr);
            b(a2, i3, i2);
            if (i3 > 0) {
                i7 += i8;
            }
            if (recycleOnMeasure) {
                recycleBin.addScrapView(a2, -1);
            }
            i7 += a2.getMeasuredHeight();
            if (i7 >= i5) {
                return (i6 < 0 || i3 <= i6 || i9 <= 0 || i7 == i5) ? i5 : i9;
            }
            if (i6 >= 0 && i3 >= i6) {
                i9 = i7;
            }
            i3++;
        }
        return i7;
    }

    private View a(int i2, int i3, boolean z2, boolean z3) {
        int i4;
        int i5;
        View activeView;
        int max = dispatchOnCancelled.setMax(i2);
        if (i2 != max) {
            onCanceled oncanceled = new onCanceled(i2, max, 1);
            onCancelLoad.setMax(-147204423, oncanceled);
            onCancelLoad.getMin(-147204423, oncanceled);
        }
        if (this.k) {
            i5 = i3;
            i4 = getPaddingLeft();
        } else {
            i4 = i3;
            i5 = getPaddingTop();
        }
        if (this.r || (activeView = this.f10537a.getActiveView(i2)) == null) {
            View a2 = a(i2, this.mIsScrap);
            a(a2, i2, i5, i4, z2, z3, this.mIsScrap[0]);
            return a2;
        }
        a(activeView, i2, i5, i4, z2, z3, true);
        return activeView;
    }

    @TargetApi(11)
    private void a(View view, int i2, int i3, int i4, boolean z2, boolean z3, boolean z4) {
        SparseBooleanArray sparseBooleanArray;
        int i5 = 0;
        boolean z5 = z3 && o();
        boolean z6 = z5 != view.isSelected();
        int i6 = this.am;
        boolean z7 = i6 > 0 && i6 < 3 && this.D == i2;
        boolean z8 = z7 != view.isPressed();
        boolean z9 = !z4 || z6 || view.isLayoutRequested();
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        layoutParams.viewType = this.j.getItemViewType(i2);
        if (!z4 || layoutParams.forceAdd) {
            layoutParams.forceAdd = false;
            if (z2) {
                i5 = -1;
            }
            addViewInLayout(view, i5, layoutParams, true);
        } else {
            if (z2) {
                i5 = -1;
            }
            attachViewToParent(view, i5, layoutParams);
        }
        if (z6) {
            view.setSelected(z5);
        }
        if (z8) {
            view.setPressed(z7);
        }
        if (!(this.ah.compareTo(ChoiceMode.NONE) == 0 || (sparseBooleanArray = this.aj) == null)) {
            if (view instanceof Checkable) {
                ((Checkable) view).setChecked(sparseBooleanArray.get(i2));
            } else if (getContext().getApplicationInfo().targetSdkVersion >= 11) {
                view.setActivated(this.aj.get(i2));
            }
        }
        if (z9) {
            a(view, layoutParams);
        } else {
            cleanupLayoutState(view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (this.k && !z2) {
            i3 -= measuredHeight;
        }
        if (!this.k && !z2) {
            i4 -= measuredWidth;
        }
        if (z9) {
            view.layout(i4, i3, measuredWidth + i4, measuredHeight + i3);
            return;
        }
        view.offsetLeftAndRight(i4 - view.getLeft());
        view.offsetTopAndBottom(i3 - view.getTop());
    }

    /* access modifiers changed from: package-private */
    public void fillGap(boolean z2) {
        int i2;
        int i3;
        int i4;
        try {
            int childCount = getChildCount();
            if (z2) {
                int paddingTop = this.k ? getPaddingTop() : getPaddingLeft();
                if (this.k) {
                    i4 = getChildAt(childCount - 1).getBottom();
                } else {
                    i4 = getChildAt(childCount - 1).getRight();
                }
                if (childCount > 0) {
                    paddingTop = this.l + i4;
                }
                d(this.w + childCount, paddingTop);
                s(getChildCount());
                return;
            }
            if (this.k) {
                i2 = getHeight() - getPaddingBottom();
                i3 = getChildAt(0).getTop();
            } else {
                i2 = getWidth() - getPaddingRight();
                i3 = getChildAt(0).getLeft();
            }
            if (childCount > 0) {
                i2 = i3 - this.l;
            }
            c(this.w - 1, i2);
            t(getChildCount());
        } catch (Exception unused) {
        }
    }

    private View c(int i2, int i3) {
        int i4;
        int i5;
        int paddingTop = this.k ? getPaddingTop() : getPaddingLeft();
        View view = null;
        while (true) {
            boolean z2 = true;
            if (i3 <= paddingTop || i2 < 0) {
                this.w = i2 + 1;
            } else {
                if (i2 != this.ad) {
                    z2 = false;
                }
                View a2 = a(i2, i3, false, z2);
                if (this.k) {
                    i5 = a2.getTop();
                    i4 = this.l;
                } else {
                    i5 = a2.getLeft();
                    i4 = this.l;
                }
                int i6 = i5 - i4;
                if (z2) {
                    view = a2;
                }
                i2--;
                i3 = i6;
            }
        }
        this.w = i2 + 1;
        return view;
    }

    private View d(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.k) {
            i5 = getHeight();
            i4 = getPaddingBottom();
        } else {
            i5 = getWidth();
            i4 = getPaddingRight();
        }
        int i8 = i5 - i4;
        View view = null;
        while (i3 < i8 && i2 < this.s) {
            boolean z2 = i2 == this.ad;
            View a2 = a(i2, i3, true, z2);
            if (this.k) {
                i7 = a2.getBottom();
                i6 = this.l;
            } else {
                i7 = a2.getRight();
                i6 = this.l;
            }
            int i9 = i7 + i6;
            if (z2) {
                view = a2;
            }
            i2++;
            i3 = i9;
        }
        return view;
    }

    private View e(int i2, int i3) {
        int i4;
        int i5;
        boolean z2 = i2 == this.ad;
        View a2 = a(i2, i3, true, z2);
        this.w = i2;
        int i6 = this.l;
        if (this.k) {
            i4 = a2.getTop();
        } else {
            i4 = a2.getLeft();
        }
        View c2 = c(i2 - 1, i4 - i6);
        A();
        if (this.k) {
            i5 = a2.getBottom();
        } else {
            i5 = a2.getRight();
        }
        View d2 = d(i2 + 1, i5 + i6);
        int childCount = getChildCount();
        if (childCount > 0) {
            s(childCount);
        }
        if (z2) {
            return a2;
        }
        return c2 != null ? c2 : d2;
    }

    private View r(int i2) {
        int min = Math.min(this.w, this.ad);
        this.w = min;
        int min2 = Math.min(min, this.s - 1);
        this.w = min2;
        if (min2 < 0) {
            this.w = 0;
        }
        return d(this.w, i2);
    }

    private View f(int i2, int i3) {
        int i4 = i3 - i2;
        int z2 = z();
        View a2 = a(z2, i2, true, true);
        this.w = z2;
        if (this.k) {
            int measuredHeight = a2.getMeasuredHeight();
            if (measuredHeight <= i4) {
                a2.offsetTopAndBottom((i4 - measuredHeight) / 2);
            }
        } else {
            int measuredWidth = a2.getMeasuredWidth();
            if (measuredWidth <= i4) {
                a2.offsetLeftAndRight((i4 - measuredWidth) / 2);
            }
        }
        a(a2, z2);
        s(getChildCount());
        return a2;
    }

    private void a(View view, int i2) {
        int i3;
        int i4;
        int i5 = this.l;
        if (this.k) {
            i3 = view.getTop();
        } else {
            i3 = view.getLeft();
        }
        c(i2 - 1, i3 - i5);
        A();
        if (this.k) {
            i4 = view.getBottom();
        } else {
            i4 = view.getRight();
        }
        d(i2 + 1, i4 + i5);
    }

    private View a(int i2, int i3, int i4) {
        int i5 = this.ad;
        View a2 = a(i5, i2, true, true);
        int top = this.k ? a2.getTop() : a2.getLeft();
        int bottom = this.k ? a2.getBottom() : a2.getRight();
        if (bottom > i4) {
            a2.offsetTopAndBottom(-Math.min(top - i3, bottom - i4));
        } else if (top < i3) {
            a2.offsetTopAndBottom(Math.min(i3 - top, i4 - bottom));
        }
        a(a2, i5);
        s(getChildCount());
        return a2;
    }

    private void s(int i2) {
        int i3;
        int i4;
        int i5;
        if ((this.w + i2) - 1 == this.s - 1 && i2 != 0) {
            View childAt = getChildAt(i2 - 1);
            if (this.k) {
                i3 = childAt.getBottom();
            } else {
                i3 = childAt.getRight();
            }
            int paddingTop = this.k ? getPaddingTop() : getPaddingLeft();
            if (this.k) {
                i5 = getHeight();
                i4 = getPaddingBottom();
            } else {
                i5 = getWidth();
                i4 = getPaddingRight();
            }
            int i6 = (i5 - i4) - i3;
            View childAt2 = getChildAt(0);
            int top = this.k ? childAt2.getTop() : childAt2.getLeft();
            if (i6 <= 0) {
                return;
            }
            if (this.w > 0 || top < paddingTop) {
                if (this.w == 0) {
                    i6 = Math.min(i6, paddingTop - top);
                }
                q(i6);
                if (this.w > 0) {
                    c(this.w - 1, (this.k ? childAt2.getTop() : childAt2.getLeft()) - this.l);
                    A();
                }
            }
        }
    }

    private void t(int i2) {
        int i3;
        int i4;
        if (this.w == 0 && i2 != 0) {
            View childAt = getChildAt(0);
            int top = this.k ? childAt.getTop() : childAt.getLeft();
            int paddingTop = this.k ? getPaddingTop() : getPaddingLeft();
            if (this.k) {
                i4 = getHeight();
                i3 = getPaddingBottom();
            } else {
                i4 = getWidth();
                i3 = getPaddingRight();
            }
            int i5 = i4 - i3;
            int i6 = top - paddingTop;
            View childAt2 = getChildAt(i2 - 1);
            int bottom = this.k ? childAt2.getBottom() : childAt2.getRight();
            int i7 = (this.w + i2) - 1;
            if (i6 > 0) {
                int i8 = this.s;
                if (i7 < i8 - 1 || bottom > i5) {
                    if (i7 == this.s - 1) {
                        i6 = Math.min(i6, bottom - i5);
                    }
                    q(-i6);
                    if (i7 < this.s - 1) {
                        d(i7 + 1, (this.k ? childAt2.getBottom() : childAt2.getRight()) + this.l);
                        A();
                    }
                } else if (i7 == i8 - 1) {
                    A();
                }
            }
        }
    }

    private void A() {
        int i2;
        int i3;
        if (getChildCount() != 0) {
            int i4 = 0;
            View childAt = getChildAt(0);
            if (this.k) {
                i3 = childAt.getTop() - getPaddingTop();
                i2 = this.l;
            } else {
                i3 = childAt.getLeft() - getPaddingLeft();
                i2 = this.l;
            }
            int i5 = i3 - i2;
            if (i5 >= 0) {
                i4 = i5;
            }
            if (i4 != 0) {
                q(-i4);
            }
        }
    }

    @TargetApi(14)
    private SparseBooleanArray B() {
        if (this.aj == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 14) {
            return this.aj.clone();
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i2 = 0; i2 < this.aj.size(); i2++) {
            sparseBooleanArray.put(this.aj.keyAt(i2), this.aj.valueAt(i2));
        }
        return sparseBooleanArray;
    }

    private int C() {
        int i2 = this.s;
        if (i2 == 0) {
            return -1;
        }
        long j2 = this.V;
        if (j2 == Long.MIN_VALUE) {
            return -1;
        }
        int i3 = i2 - 1;
        int min = Math.min(i3, Math.max(0, this.U));
        long uptimeMillis = SystemClock.uptimeMillis() + 100;
        ListAdapter listAdapter = this.j;
        if (listAdapter == null) {
            return -1;
        }
        int i4 = min;
        int i5 = i4;
        loop0:
        while (true) {
            boolean z2 = false;
            while (SystemClock.uptimeMillis() <= uptimeMillis) {
                if (listAdapter.getItemId(min) != j2) {
                    boolean z3 = i4 == i3;
                    boolean z4 = i5 == 0;
                    if (z3 && z4) {
                        break loop0;
                    } else if (z4 || (z2 && !z3)) {
                        i4++;
                        min = i4;
                    } else if (z3 || (!z2 && !z4)) {
                        i5--;
                        min = i5;
                        z2 = true;
                    }
                } else {
                    return min;
                }
            }
            break loop0;
        }
        return -1;
    }

    @TargetApi(16)
    private View a(int i2, boolean[] zArr) {
        View view;
        zArr[0] = false;
        View transientStateView = this.f10537a.getTransientStateView(i2);
        if (transientStateView != null) {
            return transientStateView;
        }
        View scrapView = this.f10537a.getScrapView(i2);
        if (scrapView != null) {
            view = this.j.getView(i2, scrapView, this);
            if (view != scrapView) {
                this.f10537a.addScrapView(scrapView, i2);
            } else {
                zArr[0] = true;
            }
        } else {
            view = this.j.getView(i2, (View) null, this);
        }
        if (ViewCompat.isInside(view) == 0) {
            ViewCompat.setMin(view, 1);
        }
        if (this.u) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
            } else if (!checkLayoutParams(layoutParams)) {
                layoutParams = generateLayoutParams((ViewGroup.LayoutParams) layoutParams);
            }
            layoutParams.f10542id = this.j.getItemId(i2);
            view.setLayoutParams(layoutParams);
        }
        if (this.au == null) {
            this.au = new ListItemAccessibilityDelegate();
        }
        ViewCompat.getMin(view, (setOnCancelListener) this.au);
        return view;
    }

    /* access modifiers changed from: package-private */
    public void resetState() {
        this.i.forceFinished(true);
        removeAllViewsInLayout();
        this.aa = 0;
        this.w = 0;
        this.r = false;
        this.S = false;
        this.y = null;
        this.af = -1;
        this.ag = Long.MIN_VALUE;
        this.O = 0;
        setSelectedPositionInt(-1);
        setNextSelectedPositionInt(-1);
        this.N = -1;
        this.g.setEmpty();
        invalidate();
    }

    /* access modifiers changed from: private */
    public void D() {
        if (getChildCount() != 0) {
            this.S = true;
            int i2 = this.ad;
            if (i2 >= 0) {
                View childAt = getChildAt(i2 - this.w);
                this.V = this.ac;
                this.U = this.ab;
                if (childAt != null) {
                    this.x = this.k ? childAt.getTop() : childAt.getLeft();
                }
                this.T = 0;
                return;
            }
            View childAt2 = getChildAt(0);
            ListAdapter adapter = getAdapter();
            int i3 = this.w;
            if (i3 < 0 || i3 >= adapter.getCount()) {
                this.V = -1;
            } else {
                this.V = adapter.getItemId(this.w);
            }
            this.U = this.w;
            if (childAt2 != null) {
                this.x = this.k ? childAt2.getTop() : childAt2.getLeft();
            }
            this.T = 1;
        }
    }

    private ContextMenu.ContextMenuInfo a(View view, int i2, long j2) {
        return new AdapterView.AdapterContextMenuInfo(view, i2, j2);
    }

    @TargetApi(11)
    private void E() {
        int i2 = this.w;
        int childCount = getChildCount();
        boolean z2 = getContext().getApplicationInfo().targetSdkVersion >= 11;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int i4 = i2 + i3;
            if (childAt instanceof Checkable) {
                ((Checkable) childAt).setChecked(this.aj.get(i4));
            } else if (z2) {
                childAt.setActivated(this.aj.get(i4));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean performItemClick(android.view.View r7, int r8, long r9) {
        /*
            r6 = this;
            com.alibaba.griver.ui.ant.basic.AUHorizontalListView$ChoiceMode r0 = r6.ah
            com.alibaba.griver.ui.ant.basic.AUHorizontalListView$ChoiceMode r1 = com.alibaba.griver.ui.ant.basic.AUHorizontalListView.ChoiceMode.MULTIPLE
            int r0 = r0.compareTo(r1)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0050
            android.util.SparseBooleanArray r0 = r6.aj
            boolean r0 = r0.get(r8, r1)
            r0 = r0 ^ r2
            android.util.SparseBooleanArray r1 = r6.aj
            r1.put(r8, r0)
            o.PlaybackStateCompat$ShuffleMode<java.lang.Integer> r1 = r6.mCheckedIdStates
            if (r1 == 0) goto L_0x0041
            android.widget.ListAdapter r1 = r6.j
            boolean r1 = r1.hasStableIds()
            if (r1 == 0) goto L_0x0041
            if (r0 == 0) goto L_0x0036
            o.PlaybackStateCompat$ShuffleMode<java.lang.Integer> r1 = r6.mCheckedIdStates
            android.widget.ListAdapter r3 = r6.j
            long r3 = r3.getItemId(r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r1.setMax(r3, r5)
            goto L_0x0041
        L_0x0036:
            o.PlaybackStateCompat$ShuffleMode<java.lang.Integer> r1 = r6.mCheckedIdStates
            android.widget.ListAdapter r3 = r6.j
            long r3 = r3.getItemId(r8)
            r1.getMin((long) r3)
        L_0x0041:
            if (r0 == 0) goto L_0x0049
            int r0 = r6.ai
            int r0 = r0 + r2
            r6.ai = r0
            goto L_0x004e
        L_0x0049:
            int r0 = r6.ai
            int r0 = r0 - r2
            r6.ai = r0
        L_0x004e:
            r1 = 1
            goto L_0x00a3
        L_0x0050:
            com.alibaba.griver.ui.ant.basic.AUHorizontalListView$ChoiceMode r0 = r6.ah
            com.alibaba.griver.ui.ant.basic.AUHorizontalListView$ChoiceMode r3 = com.alibaba.griver.ui.ant.basic.AUHorizontalListView.ChoiceMode.SINGLE
            int r0 = r0.compareTo(r3)
            if (r0 != 0) goto L_0x00a3
            android.util.SparseBooleanArray r0 = r6.aj
            boolean r0 = r0.get(r8, r1)
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0090
            android.util.SparseBooleanArray r0 = r6.aj
            r0.clear()
            android.util.SparseBooleanArray r0 = r6.aj
            r0.put(r8, r2)
            o.PlaybackStateCompat$ShuffleMode<java.lang.Integer> r0 = r6.mCheckedIdStates
            if (r0 == 0) goto L_0x008d
            android.widget.ListAdapter r0 = r6.j
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L_0x008d
            o.PlaybackStateCompat$ShuffleMode<java.lang.Integer> r0 = r6.mCheckedIdStates
            r0.setMin()
            o.PlaybackStateCompat$ShuffleMode<java.lang.Integer> r0 = r6.mCheckedIdStates
            android.widget.ListAdapter r1 = r6.j
            long r3 = r1.getItemId(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0.setMax(r3, r1)
        L_0x008d:
            r6.ai = r2
            goto L_0x004e
        L_0x0090:
            android.util.SparseBooleanArray r0 = r6.aj
            int r0 = r0.size()
            if (r0 == 0) goto L_0x00a0
            android.util.SparseBooleanArray r0 = r6.aj
            boolean r0 = r0.valueAt(r1)
            if (r0 != 0) goto L_0x004e
        L_0x00a0:
            r6.ai = r1
            goto L_0x004e
        L_0x00a3:
            if (r1 == 0) goto L_0x00a8
            r6.E()
        L_0x00a8:
            boolean r7 = super.performItemClick(r7, r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.ant.basic.AUHorizontalListView.performItemClick(android.view.View, int, long):boolean");
    }

    /* access modifiers changed from: private */
    public boolean b(View view, int i2, long j2) {
        AdapterView.OnItemLongClickListener onItemLongClickListener = getOnItemLongClickListener();
        boolean onItemLongClick = onItemLongClickListener != null ? onItemLongClickListener.onItemLongClick(this, view, i2, j2) : false;
        if (!onItemLongClick) {
            this.ak = a(view, i2, j2);
            onItemLongClick = super.showContextMenuForChild(this);
        }
        if (onItemLongClick) {
            performHapticFeedback(0);
        }
        return onItemLongClick;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        if (this.k) {
            return new LayoutParams(-1, -2);
        }
        return new LayoutParams(-2, -1);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ContextMenu.ContextMenuInfo getContextMenuInfo() {
        return this.ak;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.y;
        if (savedState2 != null) {
            savedState.selectedId = savedState2.selectedId;
            savedState.firstId = this.y.firstId;
            savedState.viewStart = this.y.viewStart;
            savedState.position = this.y.position;
            savedState.height = this.y.height;
            return savedState;
        }
        boolean z2 = getChildCount() > 0 && this.s > 0;
        long selectedItemId = getSelectedItemId();
        savedState.selectedId = selectedItemId;
        savedState.height = getHeight();
        if (selectedItemId >= 0) {
            savedState.viewStart = this.aa;
            savedState.position = getSelectedItemPosition();
            savedState.firstId = -1;
        } else if (!z2 || this.w <= 0) {
            savedState.viewStart = 0;
            savedState.firstId = -1;
            savedState.position = 0;
        } else {
            View childAt = getChildAt(0);
            savedState.viewStart = this.k ? childAt.getTop() : childAt.getLeft();
            int i2 = this.w;
            int i3 = this.s;
            if (i2 >= i3) {
                i2 = i3 - 1;
            }
            savedState.position = i2;
            savedState.firstId = this.j.getItemId(i2);
        }
        if (this.aj != null) {
            savedState.checkState = B();
        }
        if (this.mCheckedIdStates != null) {
            PlaybackStateCompat.ShuffleMode<Integer> shuffleMode = new PlaybackStateCompat.ShuffleMode<>();
            PlaybackStateCompat.ShuffleMode<Integer> shuffleMode2 = this.mCheckedIdStates;
            if (shuffleMode2.getMin) {
                shuffleMode2.getMin();
            }
            int i4 = shuffleMode2.length;
            for (int i5 = 0; i5 < i4; i5++) {
                PlaybackStateCompat.ShuffleMode<Integer> shuffleMode3 = this.mCheckedIdStates;
                if (shuffleMode3.getMin) {
                    shuffleMode3.getMin();
                }
                long j2 = shuffleMode3.setMax[i5];
                PlaybackStateCompat.ShuffleMode<Integer> shuffleMode4 = this.mCheckedIdStates;
                if (shuffleMode4.getMin) {
                    shuffleMode4.getMin();
                }
                shuffleMode.setMax(j2, shuffleMode4.setMin[i5]);
            }
            savedState.checkIdState = shuffleMode;
        }
        savedState.checkedItemCount = this.ai;
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.r = true;
        this.W = (long) savedState.height;
        if (savedState.selectedId >= 0) {
            this.S = true;
            this.y = savedState;
            this.V = savedState.selectedId;
            this.U = savedState.position;
            this.x = savedState.viewStart;
            this.T = 0;
        } else if (savedState.firstId >= 0) {
            setSelectedPositionInt(-1);
            setNextSelectedPositionInt(-1);
            this.N = -1;
            this.S = true;
            this.y = savedState;
            this.V = savedState.firstId;
            this.U = savedState.position;
            this.x = savedState.viewStart;
            this.T = 1;
        }
        if (savedState.checkState != null) {
            this.aj = savedState.checkState;
        }
        if (savedState.checkIdState != null) {
            this.mCheckedIdStates = savedState.checkIdState;
        }
        this.ai = savedState.checkedItemCount;
        requestLayout();
    }

    public void setEmptyView(View view) {
        super.setEmptyView(view);
        this.f10538at = view;
        G();
    }

    public void setFocusable(boolean z2) {
        ListAdapter adapter = getAdapter();
        boolean z3 = true;
        boolean z4 = adapter == null || adapter.getCount() == 0;
        this.P = z2;
        if (!z2) {
            this.Q = false;
        }
        if (!z2 || z4) {
            z3 = false;
        }
        super.setFocusable(z3);
    }

    public void setFocusableInTouchMode(boolean z2) {
        ListAdapter adapter = getAdapter();
        boolean z3 = false;
        boolean z4 = adapter == null || adapter.getCount() == 0;
        this.Q = z2;
        if (z2) {
            this.P = true;
        }
        if (z2 && !z4) {
            z3 = true;
        }
        super.setFocusableInTouchMode(z3);
    }

    /* access modifiers changed from: private */
    public void F() {
        ListAdapter adapter = getAdapter();
        boolean z2 = true;
        boolean z3 = adapter != null && adapter.getCount() > 0;
        super.setFocusableInTouchMode(z3 && this.Q);
        if (!z3 || !this.P) {
            z2 = false;
        }
        super.setFocusable(z2);
        if (this.f10538at != null) {
            G();
        }
    }

    private void G() {
        ListAdapter listAdapter = this.j;
        if (listAdapter == null || listAdapter.isEmpty()) {
            View view = this.f10538at;
            if (view != null) {
                view.setVisibility(0);
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            if (this.r) {
                layout(getLeft(), getTop(), getRight(), getBottom());
                return;
            }
            return;
        }
        View view2 = this.f10538at;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        setVisibility(0);
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        boolean forceAdd;

        /* renamed from: id  reason: collision with root package name */
        long f10542id = -1;
        int scrappedFromPosition;
        int viewType;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            if (this.width == -1) {
                this.width = -2;
            }
            if (this.height == -1) {
                this.height = -2;
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            if (this.width == -1) {
                this.width = -1;
            }
            if (this.height == -1) {
                this.height = -2;
            }
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (this.width == -1) {
                this.width = -2;
            }
            if (this.height == -1) {
                this.height = -2;
            }
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        PlaybackStateCompat.ShuffleMode<Integer> checkIdState;
        SparseBooleanArray checkState;
        int checkedItemCount;
        long firstId;
        int height;
        int position;
        long selectedId;
        int viewStart;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.selectedId = parcel.readLong();
            this.firstId = parcel.readLong();
            this.viewStart = parcel.readInt();
            this.position = parcel.readInt();
            this.height = parcel.readInt();
            this.checkedItemCount = parcel.readInt();
            this.checkState = parcel.readSparseBooleanArray();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                this.checkIdState = new PlaybackStateCompat.ShuffleMode<>();
                for (int i = 0; i < readInt; i++) {
                    this.checkIdState.setMax(parcel.readLong(), Integer.valueOf(parcel.readInt()));
                }
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.selectedId);
            parcel.writeLong(this.firstId);
            parcel.writeInt(this.viewStart);
            parcel.writeInt(this.position);
            parcel.writeInt(this.height);
            parcel.writeInt(this.checkedItemCount);
            parcel.writeSparseBooleanArray(this.checkState);
            PlaybackStateCompat.ShuffleMode<Integer> shuffleMode = this.checkIdState;
            if (shuffleMode != null) {
                if (shuffleMode.getMin) {
                    shuffleMode.getMin();
                }
                i2 = shuffleMode.length;
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                PlaybackStateCompat.ShuffleMode<Integer> shuffleMode2 = this.checkIdState;
                if (shuffleMode2.getMin) {
                    shuffleMode2.getMin();
                }
                parcel.writeLong(shuffleMode2.setMax[i3]);
                PlaybackStateCompat.ShuffleMode<Integer> shuffleMode3 = this.checkIdState;
                if (shuffleMode3.getMin) {
                    shuffleMode3.getMin();
                }
                parcel.writeInt(((Integer) shuffleMode3.setMin[i3]).intValue());
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TwoWayView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" selectedId=");
            sb.append(this.selectedId);
            sb.append(" firstId=");
            sb.append(this.firstId);
            sb.append(" viewStart=");
            sb.append(this.viewStart);
            sb.append(" height=");
            sb.append(this.height);
            sb.append(" position=");
            sb.append(this.position);
            sb.append(" checkState=");
            sb.append(this.checkState);
            sb.append("}");
            return sb.toString();
        }
    }

    static class ArrowScrollFocusResult {

        /* renamed from: a  reason: collision with root package name */
        private int f10541a;
        private int b;

        private ArrowScrollFocusResult() {
        }

        /* access modifiers changed from: package-private */
        public void populate(int i, int i2) {
            this.f10541a = i;
            this.b = i2;
        }

        public int getSelectedPosition() {
            return this.f10541a;
        }

        public int getAmountToScroll() {
            return this.b;
        }
    }

    class RecycleBin {

        /* renamed from: a  reason: collision with root package name */
        private RecyclerListener f10543a;
        private int b;
        private View[] c = new View[0];
        private ArrayList<View>[] d;
        private int e;
        private ArrayList<View> f;
        private IResultReceiver.Stub<View> g;

        public boolean shouldRecycleViewType(int i) {
            return i >= 0;
        }

        RecycleBin() {
        }

        public void setViewTypeCount(int i) {
            if (i > 0) {
                ArrayList<View>[] arrayListArr = new ArrayList[i];
                for (int i2 = 0; i2 < i; i2++) {
                    arrayListArr[i2] = new ArrayList<>();
                }
                this.e = i;
                this.f = arrayListArr[0];
                this.d = arrayListArr;
                return;
            }
            throw new IllegalArgumentException("Can't have a viewTypeCount < 1");
        }

        public void markChildrenDirty() {
            int i = this.e;
            if (i == 1) {
                ArrayList<View> arrayList = this.f;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.get(i2).forceLayout();
                }
            } else {
                for (int i3 = 0; i3 < i; i3++) {
                    ArrayList<View> arrayList2 = this.d[i3];
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        arrayList2.get(i4).forceLayout();
                    }
                }
            }
            IResultReceiver.Stub<View> stub = this.g;
            if (stub != null) {
                int min = stub.getMin();
                for (int i5 = 0; i5 < min; i5++) {
                    this.g.IsOverlapping(i5).forceLayout();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            int i = this.e;
            if (i == 1) {
                ArrayList<View> arrayList = this.f;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AUHorizontalListView.this.removeDetachedView(arrayList.remove((size - 1) - i2), false);
                }
            } else {
                for (int i3 = 0; i3 < i; i3++) {
                    ArrayList<View> arrayList2 = this.d[i3];
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        AUHorizontalListView.this.removeDetachedView(arrayList2.remove((size2 - 1) - i4), false);
                    }
                }
            }
            IResultReceiver.Stub<View> stub = this.g;
            if (stub != null) {
                stub.length();
            }
        }

        /* access modifiers changed from: package-private */
        public void fillActiveViews(int i, int i2) {
            if (this.c.length < i) {
                this.c = new View[i];
            }
            this.b = i2;
            View[] viewArr = this.c;
            for (int i3 = 0; i3 < i; i3++) {
                viewArr[i3] = AUHorizontalListView.this.getChildAt(i3);
            }
        }

        /* access modifiers changed from: package-private */
        public View getActiveView(int i) {
            int i2 = i - this.b;
            View[] viewArr = this.c;
            if (i2 < 0 || i2 >= viewArr.length) {
                return null;
            }
            View view = viewArr[i2];
            viewArr[i2] = null;
            return view;
        }

        /* access modifiers changed from: package-private */
        public View getTransientStateView(int i) {
            int equals;
            IResultReceiver.Stub<View> stub = this.g;
            if (stub == null || (equals = stub.equals(i)) < 0) {
                return null;
            }
            View IsOverlapping = this.g.IsOverlapping(equals);
            this.g.length(equals);
            return IsOverlapping;
        }

        /* access modifiers changed from: package-private */
        public void clearTransientStateViews() {
            IResultReceiver.Stub<View> stub = this.g;
            if (stub != null) {
                stub.length();
            }
        }

        /* access modifiers changed from: package-private */
        public View getScrapView(int i) {
            if (this.e == 1) {
                return retrieveFromScrap(this.f, i);
            }
            int itemViewType = AUHorizontalListView.this.j.getItemViewType(i);
            if (itemViewType < 0) {
                return null;
            }
            ArrayList<View>[] arrayListArr = this.d;
            if (itemViewType < arrayListArr.length) {
                return retrieveFromScrap(arrayListArr[itemViewType], i);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        @TargetApi(14)
        public void addScrapView(View view, int i) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.scrappedFromPosition = i;
                int i2 = layoutParams.viewType;
                boolean max = ViewCompat.getMax(view);
                if (shouldRecycleViewType(i2) && !max) {
                    if (this.e == 1) {
                        this.f.add(view);
                    } else {
                        this.d[i2].add(view);
                    }
                    if (Build.VERSION.SDK_INT >= 14) {
                        view.setAccessibilityDelegate((View.AccessibilityDelegate) null);
                    }
                    RecyclerListener recyclerListener = this.f10543a;
                    if (recyclerListener != null) {
                        recyclerListener.onMovedToScrapHeap(view);
                    }
                } else if (max) {
                    if (this.g == null) {
                        this.g = new IResultReceiver.Stub<>();
                    }
                    this.g.setMax(i, view);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @TargetApi(14)
        public void scrapActiveViews() {
            View[] viewArr = this.c;
            boolean z = this.e > 1;
            ArrayList<View> arrayList = this.f;
            for (int length = viewArr.length - 1; length >= 0; length--) {
                View view = viewArr[length];
                if (view != null) {
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    int i = layoutParams.viewType;
                    viewArr[length] = null;
                    boolean max = ViewCompat.getMax(view);
                    if (shouldRecycleViewType(i) && !max) {
                        if (z) {
                            arrayList = this.d[i];
                        }
                        layoutParams.scrappedFromPosition = this.b + length;
                        arrayList.add(view);
                        if (Build.VERSION.SDK_INT >= 14) {
                            view.setAccessibilityDelegate((View.AccessibilityDelegate) null);
                        }
                        RecyclerListener recyclerListener = this.f10543a;
                        if (recyclerListener != null) {
                            recyclerListener.onMovedToScrapHeap(view);
                        }
                    } else if (max) {
                        AUHorizontalListView.this.removeDetachedView(view, false);
                        if (this.g == null) {
                            this.g = new IResultReceiver.Stub<>();
                        }
                        this.g.setMax(this.b + length, view);
                    }
                }
            }
            a();
        }

        private void a() {
            int length = this.c.length;
            int i = this.e;
            ArrayList<View>[] arrayListArr = this.d;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                ArrayList<View> arrayList = arrayListArr[i3];
                int size = arrayList.size();
                int i4 = size - length;
                int i5 = size - 1;
                int i6 = 0;
                while (i6 < i4) {
                    AUHorizontalListView.this.removeDetachedView(arrayList.remove(i5), false);
                    i6++;
                    i5--;
                }
            }
            if (this.g != null) {
                while (i2 < this.g.getMin()) {
                    if (!ViewCompat.getMax(this.g.IsOverlapping(i2))) {
                        this.g.length(i2);
                        i2--;
                    }
                    i2++;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void reclaimScrapViews(List<View> list) {
            int i = this.e;
            if (i == 1) {
                list.addAll(this.f);
                return;
            }
            ArrayList<View>[] arrayListArr = this.d;
            for (int i2 = 0; i2 < i; i2++) {
                list.addAll(arrayListArr[i2]);
            }
        }

        /* access modifiers changed from: package-private */
        public View retrieveFromScrap(ArrayList<View> arrayList, int i) {
            int size = arrayList.size();
            if (size <= 0) {
                return null;
            }
            for (int i2 = 0; i2 < size; i2++) {
                View view = arrayList.get(i2);
                if (((LayoutParams) view.getLayoutParams()).scrappedFromPosition == i) {
                    arrayList.remove(i2);
                    return view;
                }
            }
            return arrayList.remove(size - 1);
        }
    }

    class AdapterDataSetObserver extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        private Parcelable f10540a;

        private AdapterDataSetObserver() {
            this.f10540a = null;
        }

        public void onChanged() {
            boolean unused = AUHorizontalListView.this.r = true;
            AUHorizontalListView aUHorizontalListView = AUHorizontalListView.this;
            int unused2 = aUHorizontalListView.t = aUHorizontalListView.s;
            AUHorizontalListView aUHorizontalListView2 = AUHorizontalListView.this;
            int unused3 = aUHorizontalListView2.s = aUHorizontalListView2.getAdapter().getCount();
            if (!AUHorizontalListView.this.u || this.f10540a == null || AUHorizontalListView.this.t != 0 || AUHorizontalListView.this.s <= 0) {
                AUHorizontalListView.this.D();
            } else {
                AUHorizontalListView.this.onRestoreInstanceState(this.f10540a);
                this.f10540a = null;
            }
            AUHorizontalListView.this.F();
            AUHorizontalListView.this.requestLayout();
        }

        public void onInvalidated() {
            boolean unused = AUHorizontalListView.this.r = true;
            if (AUHorizontalListView.this.u) {
                this.f10540a = AUHorizontalListView.this.onSaveInstanceState();
            }
            AUHorizontalListView aUHorizontalListView = AUHorizontalListView.this;
            int unused2 = aUHorizontalListView.t = aUHorizontalListView.s;
            int unused3 = AUHorizontalListView.this.s = 0;
            int unused4 = AUHorizontalListView.this.ad = -1;
            long unused5 = AUHorizontalListView.this.ae = Long.MIN_VALUE;
            int unused6 = AUHorizontalListView.this.ab = -1;
            long unused7 = AUHorizontalListView.this.ac = Long.MIN_VALUE;
            boolean unused8 = AUHorizontalListView.this.S = false;
            AUHorizontalListView.this.F();
            AUHorizontalListView.this.requestLayout();
        }
    }

    class SelectionNotifier implements Runnable {
        private SelectionNotifier() {
        }

        public void run() {
            if (!AUHorizontalListView.this.r) {
                AUHorizontalListView.this.v();
                AUHorizontalListView.this.w();
            } else if (AUHorizontalListView.this.j != null) {
                AUHorizontalListView.this.post(this);
            }
        }
    }

    class WindowRunnnable {

        /* renamed from: a  reason: collision with root package name */
        private int f10544a;

        private WindowRunnnable() {
        }

        public void rememberWindowAttachCount() {
            this.f10544a = AUHorizontalListView.this.getWindowAttachCount();
        }

        public boolean sameWindow() {
            return AUHorizontalListView.this.hasWindowFocus() && AUHorizontalListView.this.getWindowAttachCount() == this.f10544a;
        }
    }

    class PerformClick extends WindowRunnnable implements Runnable {
        int mClickMotionPosition;

        private PerformClick() {
            super();
        }

        public void run() {
            if (!AUHorizontalListView.this.r) {
                ListAdapter access$1400 = AUHorizontalListView.this.j;
                int i = this.mClickMotionPosition;
                if (access$1400 != null && AUHorizontalListView.this.s > 0 && i != -1 && i < access$1400.getCount() && sameWindow()) {
                    AUHorizontalListView aUHorizontalListView = AUHorizontalListView.this;
                    View childAt = aUHorizontalListView.getChildAt(i - aUHorizontalListView.w);
                    if (childAt != null) {
                        AUHorizontalListView.this.performItemClick(childAt, i, access$1400.getItemId(i));
                    }
                }
            }
        }
    }

    final class CheckForTap implements Runnable {
        private CheckForTap() {
        }

        public final void run() {
            Drawable current;
            if (AUHorizontalListView.this.am == 0) {
                int unused = AUHorizontalListView.this.am = 1;
                AUHorizontalListView aUHorizontalListView = AUHorizontalListView.this;
                View childAt = aUHorizontalListView.getChildAt(aUHorizontalListView.D - AUHorizontalListView.this.w);
                if (childAt != null && !childAt.hasFocusable()) {
                    int unused2 = AUHorizontalListView.this.al = 0;
                    if (!AUHorizontalListView.this.r) {
                        AUHorizontalListView.this.setPressed(true);
                        childAt.setPressed(true);
                        AUHorizontalListView.this.x();
                        AUHorizontalListView aUHorizontalListView2 = AUHorizontalListView.this;
                        aUHorizontalListView2.a(aUHorizontalListView2.D, childAt);
                        AUHorizontalListView.this.refreshDrawableState();
                        AUHorizontalListView aUHorizontalListView3 = AUHorizontalListView.this;
                        aUHorizontalListView3.a(aUHorizontalListView3.D, childAt);
                        AUHorizontalListView.this.refreshDrawableState();
                        boolean isLongClickable = AUHorizontalListView.this.isLongClickable();
                        if (!(AUHorizontalListView.this.M == null || (current = AUHorizontalListView.this.M.getCurrent()) == null || !(current instanceof TransitionDrawable))) {
                            if (isLongClickable) {
                                ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                            } else {
                                ((TransitionDrawable) current).resetTransition();
                            }
                        }
                        if (isLongClickable) {
                            AUHorizontalListView.this.j();
                        } else {
                            int unused3 = AUHorizontalListView.this.am = 2;
                        }
                    } else {
                        int unused4 = AUHorizontalListView.this.am = 2;
                    }
                }
            }
        }
    }

    class CheckForLongPress extends WindowRunnnable implements Runnable {
        private CheckForLongPress() {
            super();
        }

        public void run() {
            int access$3300 = AUHorizontalListView.this.D;
            AUHorizontalListView aUHorizontalListView = AUHorizontalListView.this;
            View childAt = aUHorizontalListView.getChildAt(access$3300 - aUHorizontalListView.w);
            if (childAt != null) {
                if ((!sameWindow() || AUHorizontalListView.this.r) ? false : AUHorizontalListView.this.b(childAt, access$3300, AUHorizontalListView.this.j.getItemId(AUHorizontalListView.this.D))) {
                    int unused = AUHorizontalListView.this.am = -1;
                    AUHorizontalListView.this.setPressed(false);
                    childAt.setPressed(false);
                    return;
                }
                int unused2 = AUHorizontalListView.this.am = 2;
            }
        }
    }

    class CheckForKeyLongPress extends WindowRunnnable implements Runnable {
        private CheckForKeyLongPress() {
            super();
        }

        public void run() {
            boolean z;
            if (AUHorizontalListView.this.isPressed() && AUHorizontalListView.this.ad >= 0) {
                View childAt = AUHorizontalListView.this.getChildAt(AUHorizontalListView.this.ad - AUHorizontalListView.this.w);
                if (!AUHorizontalListView.this.r) {
                    if (sameWindow()) {
                        AUHorizontalListView aUHorizontalListView = AUHorizontalListView.this;
                        z = aUHorizontalListView.b(childAt, aUHorizontalListView.ad, AUHorizontalListView.this.ae);
                    } else {
                        z = false;
                    }
                    if (z) {
                        AUHorizontalListView.this.setPressed(false);
                        childAt.setPressed(false);
                        return;
                    }
                    return;
                }
                AUHorizontalListView.this.setPressed(false);
                if (childAt != null) {
                    childAt.setPressed(false);
                }
            }
        }
    }

    class ListItemAccessibilityDelegate extends setOnCancelListener {
        private ListItemAccessibilityDelegate() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, onSupportActionModeFinished onsupportactionmodefinished) {
            super.onInitializeAccessibilityNodeInfo(view, onsupportactionmodefinished);
            int positionForView = AUHorizontalListView.this.getPositionForView(view);
            ListAdapter adapter = AUHorizontalListView.this.getAdapter();
            if (positionForView != -1 && adapter != null && AUHorizontalListView.this.isEnabled() && adapter.isEnabled(positionForView)) {
                if (positionForView == AUHorizontalListView.this.getSelectedItemPosition()) {
                    onsupportactionmodefinished.IsOverlapping(true);
                    onsupportactionmodefinished.setMin(8);
                } else {
                    onsupportactionmodefinished.setMin(4);
                }
                if (AUHorizontalListView.this.isClickable()) {
                    onsupportactionmodefinished.setMin(16);
                    onsupportactionmodefinished.equals(true);
                }
                if (AUHorizontalListView.this.isLongClickable()) {
                    onsupportactionmodefinished.setMin(32);
                    onsupportactionmodefinished.toFloatRange(true);
                }
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            int positionForView = AUHorizontalListView.this.getPositionForView(view);
            ListAdapter adapter = AUHorizontalListView.this.getAdapter();
            if (positionForView != -1 && adapter != null && AUHorizontalListView.this.isEnabled() && adapter.isEnabled(positionForView)) {
                long itemIdAtPosition = AUHorizontalListView.this.getItemIdAtPosition(positionForView);
                if (i != 4) {
                    if (i != 8) {
                        if (i != 16) {
                            if (i == 32 && AUHorizontalListView.this.isLongClickable()) {
                                return AUHorizontalListView.this.b(view, positionForView, itemIdAtPosition);
                            }
                            return false;
                        } else if (AUHorizontalListView.this.isClickable()) {
                            return AUHorizontalListView.this.performItemClick(view, positionForView, itemIdAtPosition);
                        } else {
                            return false;
                        }
                    } else if (AUHorizontalListView.this.getSelectedItemPosition() != positionForView) {
                        return false;
                    } else {
                        AUHorizontalListView.this.setSelection(-1);
                        return true;
                    }
                } else if (AUHorizontalListView.this.getSelectedItemPosition() != positionForView) {
                    AUHorizontalListView.this.setSelection(positionForView);
                    return true;
                }
            }
            return false;
        }
    }
}
