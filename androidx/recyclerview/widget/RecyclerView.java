package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView$FastBitmap$CoordinateSystem;
import androidx.recyclerview.widget.ViewBoundsCheck;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.StyleableRes;
import o.clearHeader;
import o.dispatchMenuItemSelected;
import o.findItemWithShortcutForKey;
import o.getOrdering;
import o.isShortcutsVisible;
import o.onDestroy;
import o.onItemActionRequestChanged;
import o.onStop;
import o.onSupportActionModeFinished;
import o.performItemAction;
import o.setInverseBackgroundForced;
import o.setOnCancelListener;
import o.setQwertyMode;
import o.setRecycleOnMeasureEnabled;
import o.setSingleChoiceItems;
import o.setView;

public class RecyclerView extends ViewGroup implements setRecycleOnMeasureEnabled, setInverseBackgroundForced {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = (Build.VERSION.SDK_INT >= 23);
    static final boolean ALLOW_THREAD_GAP_WORK = (Build.VERSION.SDK_INT >= 21);
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = (Build.VERSION.SDK_INT <= 15);
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = (Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20);
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = (Build.VERSION.SDK_INT <= 15);
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION = (Build.VERSION.SDK_INT >= 16);
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    onItemActionRequestChanged mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    public Adapter mAdapter;
    public setQwertyMode mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private length mChildDrawingOrderCallback;
    public isShortcutsVisible mChildHelper;
    boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    @NonNull
    private EdgeEffectFactory mEdgeEffectFactory;
    boolean mEnableFastScroller;
    @VisibleForTesting
    boolean mFirstLayoutComplete;
    findItemWithShortcutForKey mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private equals mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    ItemAnimator mItemAnimator;
    private ItemAnimator.length mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<getMax> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    @VisibleForTesting
    public IsOverlapping mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final toString mObserver;
    private List<isInside> mOnChildAttachStateListeners;
    private toFloatRange mOnFlingListener;
    private final ArrayList<equals> mOnItemTouchListeners;
    @VisibleForTesting
    final List<valueOf> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    boolean mPostedAnimatorRunner;
    public findItemWithShortcutForKey.setMin mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    public final toDoubleRange mRecycler;
    hashCode mRecyclerListener;
    final List<hashCode> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private toIntRange mScrollListener;
    private List<toIntRange> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private setView mScrollingChildHelper;
    public final RecyclerView$Mean$Arithmetic mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final invoke mViewFlinger;
    private final clearHeader.length mViewInfoProcessCallback;
    final clearHeader mViewInfoStore;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    public interface equals {
        void getMin(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        boolean setMax(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);
    }

    public interface length {
        int getMax(int i, int i2);
    }

    public static abstract class toFloatRange {
        public abstract boolean getMin(int i, int i2);
    }

    public static abstract class toIntRange {
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        }
    }

    public interface hashCode {
    }

    public interface isInside {
        void getMin(@NonNull View view);
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(@Px int i, @Px int i2) {
    }

    public void scrollTo(int i, int i2) {
    }

    public RecyclerView(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, getOrdering.setMin.getMin);
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new toString();
        this.mRecycler = new toDoubleRange();
        this.mViewInfoStore = new clearHeader();
        this.mUpdateChildViewsRunnable = new Runnable() {
            public final void run() {
                if (RecyclerView.this.mFirstLayoutComplete && !RecyclerView.this.isLayoutRequested()) {
                    if (!RecyclerView.this.mIsAttached) {
                        RecyclerView.this.requestLayout();
                    } else if (RecyclerView.this.mLayoutSuppressed) {
                        RecyclerView.this.mLayoutWasDefered = true;
                    } else {
                        RecyclerView.this.consumePendingUpdateOperations();
                    }
                }
            }
        };
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new EdgeEffectFactory();
        this.mItemAnimator = new dispatchMenuItemSelected();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new invoke();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new findItemWithShortcutForKey.setMin() : null;
        this.mState = new RecyclerView$Mean$Arithmetic();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new getMin();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new Runnable() {
            public final void run() {
                if (RecyclerView.this.mItemAnimator != null) {
                    RecyclerView.this.mItemAnimator.getMax();
                }
                RecyclerView.this.mPostedAnimatorRunner = false;
            }
        };
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new clearHeader.length() {
            public final void length(valueOf valueof, @NonNull ItemAnimator.setMax setmax, @Nullable ItemAnimator.setMax setmax2) {
                RecyclerView.this.mRecycler.setMax(valueof);
                RecyclerView.this.animateDisappearance(valueof, setmax, setmax2);
            }

            public final void getMax(valueOf valueof, ItemAnimator.setMax setmax, ItemAnimator.setMax setmax2) {
                RecyclerView.this.animateAppearance(valueof, setmax, setmax2);
            }

            public final void setMin(valueOf valueof, @NonNull ItemAnimator.setMax setmax, @NonNull ItemAnimator.setMax setmax2) {
                valueof.setIsRecyclable(false);
                if (RecyclerView.this.mDataSetHasChangedAfterLayout) {
                    if (RecyclerView.this.mItemAnimator.setMin(valueof, valueof, setmax, setmax2)) {
                        RecyclerView.this.postAnimationRunner();
                    }
                } else if (RecyclerView.this.mItemAnimator.setMax(valueof, setmax, setmax2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            }

            public final void setMax(valueOf valueof) {
                RecyclerView.this.mLayout.removeAndRecycleView(valueof.itemView, RecyclerView.this.mRecycler);
            }
        };
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = onStop.getMin(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = onStop.setMin(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.toFloatRange = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (ViewCompat.isInside(this) == 0) {
            ViewCompat.setMin((View) this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new onItemActionRequestChanged(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getOrdering.getMax.toIntRange, i, 0);
        ViewCompat.getMax(this, context, getOrdering.getMax.toIntRange, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(getOrdering.getMax.hashCode);
        if (obtainStyledAttributes.getInt(getOrdering.getMax.isInside, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(getOrdering.getMax.toFloatRange, true);
        boolean z2 = obtainStyledAttributes.getBoolean(getOrdering.getMax.equals, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(getOrdering.getMax.toDoubleRange), obtainStyledAttributes.getDrawable(getOrdering.getMax.FastBitmap$CoordinateSystem), (StateListDrawable) obtainStyledAttributes.getDrawable(getOrdering.getMax.toString), obtainStyledAttributes.getDrawable(getOrdering.getMax.values));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i, 0);
            ViewCompat.getMax(this, context, NESTED_SCROLLING_ATTRS, attributeSet, obtainStyledAttributes2, i, 0);
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    /* access modifiers changed from: package-private */
    public String exceptionLabel() {
        StringBuilder sb = new StringBuilder(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.mAdapter);
        sb.append(", layout:");
        sb.append(this.mLayout);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (ViewCompat.setMin(this) == 0) {
            ViewCompat.length((View) this, 8);
        }
    }

    @Nullable
    public onItemActionRequestChanged getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void setAccessibilityDelegateCompat(@Nullable onItemActionRequestChanged onitemactionrequestchanged) {
        this.mAccessibilityDelegate = onitemactionrequestchanged;
        ViewCompat.getMin((View) this, (setOnCancelListener) onitemactionrequestchanged);
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(IsOverlapping.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((IsOverlapping) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    StringBuilder sb = new StringBuilder();
                    sb.append(attributeSet.getPositionDescription());
                    sb.append(": Error creating LayoutManager ");
                    sb.append(fullClassName);
                    throw new IllegalStateException(sb.toString(), e2);
                } catch (ClassNotFoundException e3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(attributeSet.getPositionDescription());
                    sb2.append(": Unable to find LayoutManager ");
                    sb2.append(fullClassName);
                    throw new IllegalStateException(sb2.toString(), e3);
                } catch (InvocationTargetException e4) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(attributeSet.getPositionDescription());
                    sb3.append(": Could not instantiate the LayoutManager: ");
                    sb3.append(fullClassName);
                    throw new IllegalStateException(sb3.toString(), e4);
                } catch (InstantiationException e5) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(attributeSet.getPositionDescription());
                    sb4.append(": Could not instantiate the LayoutManager: ");
                    sb4.append(fullClassName);
                    throw new IllegalStateException(sb4.toString(), e5);
                } catch (IllegalAccessException e6) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(attributeSet.getPositionDescription());
                    sb5.append(": Cannot access non-public constructor ");
                    sb5.append(fullClassName);
                    throw new IllegalStateException(sb5.toString(), e6);
                } catch (ClassCastException e7) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(attributeSet.getPositionDescription());
                    sb6.append(": Class is not a LayoutManager ");
                    sb6.append(fullClassName);
                    throw new IllegalStateException(sb6.toString(), e7);
                }
            }
        }
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            return sb.toString();
        } else if (str.contains(".")) {
            return str;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(RecyclerView.class.getPackage().getName());
            sb2.append('.');
            sb2.append(str);
            return sb2.toString();
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new isShortcutsVisible(new isShortcutsVisible.setMin() {
            public final int setMin() {
                return RecyclerView.this.getChildCount();
            }

            public final void length(View view, int i) {
                RecyclerView.this.addView(view, i);
                RecyclerView.this.dispatchChildAttached(view);
            }

            public final int setMax(View view) {
                return RecyclerView.this.indexOfChild(view);
            }

            public final void length(int i) {
                View childAt = RecyclerView.this.getChildAt(i);
                if (childAt != null) {
                    RecyclerView.this.dispatchChildDetached(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeViewAt(i);
            }

            public final View getMax(int i) {
                return RecyclerView.this.getChildAt(i);
            }

            public final valueOf length(View view) {
                return RecyclerView.getChildViewHolderInt(view);
            }

            public final void getMin(View view, int i, ViewGroup.LayoutParams layoutParams) {
                valueOf childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    if (childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                        childViewHolderInt.clearTmpDetachFlag();
                    } else {
                        StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                        sb.append(childViewHolderInt);
                        sb.append(RecyclerView.this.exceptionLabel());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                RecyclerView.this.attachViewToParent(view, i, layoutParams);
            }

            public final void setMin(View view) {
                valueOf childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
                }
            }

            public final void getMin(View view) {
                valueOf childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onLeftHiddenState(RecyclerView.this);
                }
            }

            public final void getMax() {
                int childCount = RecyclerView.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = RecyclerView.this.getChildAt(i);
                    RecyclerView.this.dispatchChildDetached(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }

            public final void setMax(int i) {
                valueOf childViewHolderInt;
                View childAt = RecyclerView.this.getChildAt(i);
                if (!(childAt == null || (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) == null)) {
                    if (!childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                        childViewHolderInt.addFlags(256);
                    } else {
                        StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                        sb.append(childViewHolderInt);
                        sb.append(RecyclerView.this.exceptionLabel());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                RecyclerView.this.detachViewFromParent(i);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void initAdapterManager() {
        this.mAdapterHelper = new setQwertyMode(new setQwertyMode.length() {
            public final valueOf setMax(int i) {
                valueOf findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
                if (findViewHolderForPosition != null && !RecyclerView.this.mChildHelper.setMin(findViewHolderForPosition.itemView)) {
                    return findViewHolderForPosition;
                }
                return null;
            }

            public final void getMax(int i, int i2) {
                RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
                RecyclerView.this.mItemsAddedOrRemoved = true;
                RecyclerView.this.mState.getMax += i2;
            }

            public final void length(int i, int i2) {
                RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            public final void length(int i, int i2, Object obj) {
                RecyclerView.this.viewRangeUpdate(i, i2, obj);
                RecyclerView.this.mItemsChanged = true;
            }

            public final void setMin(setQwertyMode.getMax getmax) {
                setMax(getmax);
            }

            private void setMax(setQwertyMode.getMax getmax) {
                int i = getmax.setMax;
                if (i == 1) {
                    RecyclerView.this.mLayout.onItemsAdded(RecyclerView.this, getmax.getMin, getmax.length);
                } else if (i == 2) {
                    RecyclerView.this.mLayout.onItemsRemoved(RecyclerView.this, getmax.getMin, getmax.length);
                } else if (i == 4) {
                    RecyclerView.this.mLayout.onItemsUpdated(RecyclerView.this, getmax.getMin, getmax.length, getmax.getMax);
                } else if (i == 8) {
                    RecyclerView.this.mLayout.onItemsMoved(RecyclerView.this, getmax.getMin, getmax.length, 1);
                }
            }

            public final void getMax(setQwertyMode.getMax getmax) {
                setMax(getmax);
            }

            public final void setMax(int i, int i2) {
                RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            public final void getMin(int i, int i2) {
                RecyclerView.this.offsetPositionRecordsForMove(i, i2);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }
        });
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void swapAdapter(@Nullable Adapter adapter, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void setAdapter(@Nullable Adapter adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void removeAndRecycleViews() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.length();
        }
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null) {
            isOverlapping.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        toDoubleRange todoublerange = this.mRecycler;
        todoublerange.getMin.clear();
        todoublerange.length();
    }

    private void setAdapterInternal(@Nullable Adapter adapter, boolean z, boolean z2) {
        Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        setQwertyMode setqwertymode = this.mAdapterHelper;
        setqwertymode.getMax((List<setQwertyMode.getMax>) setqwertymode.length);
        setqwertymode.getMax((List<setQwertyMode.getMax>) setqwertymode.getMin);
        setqwertymode.toFloatRange = 0;
        Adapter adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null) {
            isOverlapping.onAdapterChanged(adapter3, this.mAdapter);
        }
        toDoubleRange todoublerange = this.mRecycler;
        Adapter adapter4 = this.mAdapter;
        todoublerange.getMin.clear();
        todoublerange.length();
        if (todoublerange.toFloatRange == null) {
            todoublerange.toFloatRange = new RecyclerView$FastBitmap$CoordinateSystem();
        }
        RecyclerView$FastBitmap$CoordinateSystem recyclerView$FastBitmap$CoordinateSystem = todoublerange.toFloatRange;
        if (adapter3 != null) {
            recyclerView$FastBitmap$CoordinateSystem.setMax--;
        }
        if (!z && recyclerView$FastBitmap$CoordinateSystem.setMax == 0) {
            for (int i = 0; i < recyclerView$FastBitmap$CoordinateSystem.getMax.size(); i++) {
                recyclerView$FastBitmap$CoordinateSystem.getMax.valueAt(i).getMax.clear();
            }
        }
        if (adapter4 != null) {
            recyclerView$FastBitmap$CoordinateSystem.setMax++;
        }
        this.mState.isInside = true;
    }

    @Nullable
    public Adapter getAdapter() {
        return this.mAdapter;
    }

    @Deprecated
    public void setRecyclerListener(@Nullable hashCode hashcode) {
        this.mRecyclerListener = hashcode;
    }

    public void addRecyclerListener(@NonNull hashCode hashcode) {
        if (hashcode != null) {
            this.mRecyclerListeners.add(hashcode);
            return;
        }
        throw new IllegalArgumentException("'listener' arg cannot be null.");
    }

    public void removeRecyclerListener(@NonNull hashCode hashcode) {
        this.mRecyclerListeners.remove(hashcode);
    }

    public int getBaseline() {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null) {
            return isOverlapping.getBaseline();
        }
        return super.getBaseline();
    }

    public void addOnChildAttachStateChangeListener(@NonNull isInside isinside) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(isinside);
    }

    public void removeOnChildAttachStateChangeListener(@NonNull isInside isinside) {
        List<isInside> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(isinside);
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<isInside> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void setLayoutManager(@Nullable IsOverlapping isOverlapping) {
        if (isOverlapping != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                ItemAnimator itemAnimator = this.mItemAnimator;
                if (itemAnimator != null) {
                    itemAnimator.length();
                }
                this.mLayout.removeAndRecycleAllViews(this.mRecycler);
                this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
                toDoubleRange todoublerange = this.mRecycler;
                todoublerange.getMin.clear();
                todoublerange.length();
                if (this.mIsAttached) {
                    this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
                }
                this.mLayout.setRecyclerView((RecyclerView) null);
                this.mLayout = null;
            } else {
                toDoubleRange todoublerange2 = this.mRecycler;
                todoublerange2.getMin.clear();
                todoublerange2.length();
            }
            isShortcutsVisible isshortcutsvisible = this.mChildHelper;
            isShortcutsVisible.getMax getmax = isshortcutsvisible.length;
            getmax.setMin = 0;
            if (getmax.getMin != null) {
                isShortcutsVisible.getMax getmax2 = getmax.getMin;
                while (true) {
                    getmax2.setMin = 0;
                    if (getmax2.getMin == null) {
                        break;
                    }
                    getmax2 = getmax2.getMin;
                }
            }
            for (int size = isshortcutsvisible.setMin.size() - 1; size >= 0; size--) {
                isshortcutsvisible.getMin.getMin(isshortcutsvisible.setMin.get(size));
                isshortcutsvisible.setMin.remove(size);
            }
            isshortcutsvisible.getMin.getMax();
            this.mLayout = isOverlapping;
            if (isOverlapping != null) {
                if (isOverlapping.mRecyclerView == null) {
                    this.mLayout.setRecyclerView(this);
                    if (this.mIsAttached) {
                        this.mLayout.dispatchAttachedToWindow(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("LayoutManager ");
                    sb.append(isOverlapping);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(isOverlapping.mRecyclerView.exceptionLabel());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.mRecycler.getMin();
            requestLayout();
        }
    }

    public void setOnFlingListener(@Nullable toFloatRange tofloatrange) {
        this.mOnFlingListener = tofloatrange;
    }

    @Nullable
    public toFloatRange getOnFlingListener() {
        return this.mOnFlingListener;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.setMin = savedState2.setMin;
        } else {
            IsOverlapping isOverlapping = this.mLayout;
            if (isOverlapping != null) {
                savedState.setMin = isOverlapping.onSaveInstanceState();
            } else {
                savedState.setMin = null;
            }
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    private void addAnimatingView(valueOf valueof) {
        View view = valueof.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.setMax(getChildViewHolder(view));
        if (valueof.isTmpDetached()) {
            this.mChildHelper.setMax(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.getMax(view, -1, true);
        } else {
            isShortcutsVisible isshortcutsvisible = this.mChildHelper;
            int max = isshortcutsvisible.getMin.setMax(view);
            if (max >= 0) {
                isshortcutsvisible.length.length(max);
                isshortcutsvisible.setMin.add(view);
                isshortcutsvisible.getMin.setMin(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(view)));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean length2 = this.mChildHelper.length(view);
        if (length2) {
            valueOf childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.setMax(childViewHolderInt);
            this.mRecycler.setMin(childViewHolderInt);
        }
        stopInterceptRequestLayout(!length2);
        return length2;
    }

    @Nullable
    public IsOverlapping getLayoutManager() {
        return this.mLayout;
    }

    @NonNull
    public RecyclerView$FastBitmap$CoordinateSystem getRecycledViewPool() {
        toDoubleRange todoublerange = this.mRecycler;
        if (todoublerange.toFloatRange == null) {
            todoublerange.toFloatRange = new RecyclerView$FastBitmap$CoordinateSystem();
        }
        return todoublerange.toFloatRange;
    }

    public void setRecycledViewPool(@Nullable RecyclerView$FastBitmap$CoordinateSystem recyclerView$FastBitmap$CoordinateSystem) {
        toDoubleRange todoublerange = this.mRecycler;
        if (todoublerange.toFloatRange != null) {
            RecyclerView$FastBitmap$CoordinateSystem recyclerView$FastBitmap$CoordinateSystem2 = todoublerange.toFloatRange;
            recyclerView$FastBitmap$CoordinateSystem2.setMax--;
        }
        todoublerange.toFloatRange = recyclerView$FastBitmap$CoordinateSystem;
        if (todoublerange.toFloatRange != null && RecyclerView.this.getAdapter() != null) {
            todoublerange.toFloatRange.setMax++;
        }
    }

    public void setViewCacheExtension(@Nullable RecyclerView$Grayscale$Algorithm recyclerView$Grayscale$Algorithm) {
        this.mRecycler.isInside = recyclerView$Grayscale$Algorithm;
    }

    public void setItemViewCacheSize(int i) {
        toDoubleRange todoublerange = this.mRecycler;
        todoublerange.length = i;
        todoublerange.getMin();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.mScrollState) {
            this.mScrollState = i;
            if (i != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void addItemDecoration(@NonNull getMax getmax, int i) {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null) {
            isOverlapping.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(getmax);
        } else {
            this.mItemDecorations.add(i, getmax);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addItemDecoration(@NonNull getMax getmax) {
        addItemDecoration(getmax, -1);
    }

    @NonNull
    public getMax getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is an invalid index for size ");
        sb.append(itemDecorationCount);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" is an invalid index for size ");
            sb.append(itemDecorationCount);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeItemDecoration(@NonNull getMax getmax) {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null) {
            isOverlapping.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(getmax);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable length length2) {
        if (length2 != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = length2;
            setChildrenDrawingOrderEnabled(length2 != null);
        }
    }

    @Deprecated
    public void setOnScrollListener(@Nullable toIntRange tointrange) {
        this.mScrollListener = tointrange;
    }

    public void addOnScrollListener(@NonNull toIntRange tointrange) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tointrange);
    }

    public void removeOnScrollListener(@NonNull toIntRange tointrange) {
        List<toIntRange> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tointrange);
        }
    }

    public void clearOnScrollListeners() {
        List<toIntRange> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void scrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            IsOverlapping isOverlapping = this.mLayout;
            if (isOverlapping != null) {
                isOverlapping.scrollToPosition(i);
                awakenScrollBars();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    public void smoothScrollToPosition(int i) {
        IsOverlapping isOverlapping;
        if (!this.mLayoutSuppressed && (isOverlapping = this.mLayout) != null) {
            isOverlapping.smoothScrollToPosition(this, this.mState, i);
        }
    }

    public void scrollBy(int i, int i2) {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null && !this.mLayoutSuppressed) {
            boolean canScrollHorizontally = isOverlapping.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            if (canScrollHorizontally || canScrollVertically) {
                if (!canScrollHorizontally) {
                    i = 0;
                }
                if (!canScrollVertically) {
                    i2 = 0;
                }
                scrollByInternal(i, i2, (MotionEvent) null, 0);
            }
        }
    }

    public void nestedScrollBy(int i, int i2) {
        nestedScrollByInternal(i, i2, (MotionEvent) null, 1);
    }

    private void nestedScrollByInternal(int i, int i2, @Nullable MotionEvent motionEvent, int i3) {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null && !this.mLayoutSuppressed) {
            int[] iArr = this.mReusableIntPair;
            int i4 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean canScrollHorizontally = isOverlapping.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            startNestedScroll(canScrollVertically ? canScrollHorizontally | true : canScrollHorizontally ? 1 : 0, i3);
            if (dispatchNestedPreScroll(canScrollHorizontally ? i : 0, canScrollVertically ? i2 : 0, this.mReusableIntPair, this.mScrollOffset, i3)) {
                int[] iArr2 = this.mReusableIntPair;
                i -= iArr2[0];
                i2 -= iArr2[1];
            }
            int i5 = canScrollHorizontally ? i : 0;
            if (canScrollVertically) {
                i4 = i2;
            }
            scrollByInternal(i5, i4, motionEvent, i3);
            if (!(this.mGapWorker == null || (i == 0 && i2 == 0))) {
                this.mGapWorker.getMax(this, i, i2);
            }
            stopNestedScroll(i3);
        }
    }

    /* access modifiers changed from: package-private */
    public void scrollStep(int i, int i2, @Nullable int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        StyleableRes.setMax(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState) : 0;
        StyleableRes.getMin();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    /* access modifiers changed from: package-private */
    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            StyleableRes.setMax(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            StyleableRes.getMin();
        } else if (this.mAdapterHelper.getMin()) {
            if (this.mAdapterHelper.length(4) && !this.mAdapterHelper.length(11)) {
                StyleableRes.setMax(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.setMin();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.length();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                StyleableRes.getMin();
            } else if (this.mAdapterHelper.getMin()) {
                StyleableRes.setMax(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                StyleableRes.getMin();
            }
        }
    }

    private boolean hasUpdatedView() {
        isShortcutsVisible isshortcutsvisible = this.mChildHelper;
        int min = isshortcutsvisible.getMin.setMin() - isshortcutsvisible.setMin.size();
        for (int i = 0; i < min; i++) {
            isShortcutsVisible isshortcutsvisible2 = this.mChildHelper;
            valueOf childViewHolderInt = getChildViewHolderInt(isshortcutsvisible2.getMin.getMax(isshortcutsvisible2.getMin(i)));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int i9 = i2;
        MotionEvent motionEvent2 = motionEvent;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i8, i9, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            i7 = i11;
            i6 = i10;
            i5 = i8 - i10;
            i4 = i9 - i11;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i6, i7, i5, i4, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i12 = i5 - iArr4[0];
        int i13 = i4 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i14 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !setSingleChoiceItems.getMax(motionEvent2, 8194)) {
                pullGlows(motionEvent.getX(), (float) i12, motionEvent.getY(), (float) i13);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (!(i6 == 0 && i7 == 0)) {
            dispatchOnScrolled(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i6 == 0 && i7 == 0) ? false : true;
    }

    public int computeHorizontalScrollOffset() {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null && isOverlapping.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollExtent() {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null && isOverlapping.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null && isOverlapping.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null && isOverlapping.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null && isOverlapping.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null && isOverlapping.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth <= 0) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void smoothScrollBy(@Px int i, @Px int i2) {
        smoothScrollBy(i, i2, (Interpolator) null);
    }

    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator, int i3, boolean z) {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null && !this.mLayoutSuppressed) {
            int i4 = 0;
            if (!isOverlapping.canScrollHorizontally()) {
                i = 0;
            }
            if (!this.mLayout.canScrollVertically()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        startNestedScroll(i4, 1);
                    }
                    this.mViewFlinger.getMin(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    public boolean fling(int i, int i2) {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping == null || this.mLayoutSuppressed) {
            return false;
        }
        boolean canScrollHorizontally = isOverlapping.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        int i3 = (!canScrollHorizontally || Math.abs(i) < this.mMinFlingVelocity) ? 0 : i;
        int i4 = (!canScrollVertically || Math.abs(i2) < this.mMinFlingVelocity) ? 0 : i2;
        if (i3 == 0 && i4 == 0) {
            return false;
        }
        float f = (float) i3;
        float f2 = (float) i4;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = canScrollHorizontally || canScrollVertically;
            dispatchNestedFling(f, f2, z);
            toFloatRange tofloatrange = this.mOnFlingListener;
            if (tofloatrange != null && tofloatrange.getMin(i3, i4)) {
                return true;
            }
            if (z) {
                if (canScrollVertically) {
                    canScrollHorizontally |= true;
                }
                startNestedScroll(canScrollHorizontally ? 1 : 0, 1);
                int i5 = this.mMaxFlingVelocity;
                int max = Math.max(-i5, Math.min(i3, i5));
                int i6 = this.mMaxFlingVelocity;
                int max2 = Math.max(-i6, Math.min(i4, i6));
                invoke invoke2 = this.mViewFlinger;
                RecyclerView.this.setScrollState(2);
                invoke2.setMin = 0;
                invoke2.setMax = 0;
                Interpolator interpolator = invoke2.getMin;
                Interpolator interpolator2 = sQuinticInterpolator;
                if (interpolator != interpolator2) {
                    invoke2.getMin = interpolator2;
                    invoke2.length = new OverScroller(RecyclerView.this.getContext(), sQuinticInterpolator);
                }
                invoke2.length.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                if (invoke2.getMax) {
                    invoke2.isInside = true;
                } else {
                    RecyclerView.this.removeCallbacks(invoke2);
                    ViewCompat.getMax((View) RecyclerView.this, (Runnable) invoke2);
                }
                return true;
            }
        }
        return false;
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    private void stopScrollersInternal() {
        invoke invoke2 = this.mViewFlinger;
        RecyclerView.this.removeCallbacks(invoke2);
        invoke2.length.abortAnimation();
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null) {
            isOverlapping.stopSmoothScroller();
        }
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            o.getDrawerToggleDelegate.length(r3, r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            o.getDrawerToggleDelegate.length(r3, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            o.getDrawerToggleDelegate.length(r9, r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            o.getDrawerToggleDelegate.length(r9, r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            androidx.core.view.ViewCompat.equals(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void releaseGlows() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            ViewCompat.equals(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            ViewCompat.equals(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            ViewCompat.equals(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            EdgeEffect max = EdgeEffectFactory.getMax(this);
            this.mLeftGlow = max;
            if (this.mClipToPadding) {
                max.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                max.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureRightGlow() {
        if (this.mRightGlow == null) {
            EdgeEffect max = EdgeEffectFactory.getMax(this);
            this.mRightGlow = max;
            if (this.mClipToPadding) {
                max.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                max.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureTopGlow() {
        if (this.mTopGlow == null) {
            EdgeEffect max = EdgeEffectFactory.getMax(this);
            this.mTopGlow = max;
            if (this.mClipToPadding) {
                max.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                max.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            EdgeEffect max = EdgeEffectFactory.getMax(this);
            this.mBottomGlow = max;
            if (this.mClipToPadding) {
                max.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                max.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory edgeEffectFactory) {
        if (edgeEffectFactory != null) {
            this.mEdgeEffectFactory = edgeEffectFactory;
            invalidateGlows();
            return;
        }
        throw null;
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z2 = true;
        boolean z3 = this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            if (this.mLayout.canScrollVertically()) {
                int i2 = i == 2 ? TsExtractor.TS_STREAM_TYPE_HDMV_DTS : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.canScrollHorizontally()) {
                int i3 = (this.mLayout.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i3) != null) {
                    z2 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
                z = z2;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (isPreferredNextFocus(view, view2, i)) {
                return view2;
            }
            return super.focusSearch(view, i);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            requestChildOnScreen(view2, (View) null);
            return view;
        }
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c = 65535;
        int i3 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        if ((this.mTempRect.left < this.mTempRect2.left || this.mTempRect.right <= this.mTempRect2.left) && this.mTempRect.right < this.mTempRect2.right) {
            i2 = 1;
        } else {
            i2 = ((this.mTempRect.right > this.mTempRect2.right || this.mTempRect.left >= this.mTempRect2.right) && this.mTempRect.left > this.mTempRect2.left) ? -1 : 0;
        }
        if ((this.mTempRect.top < this.mTempRect2.top || this.mTempRect.bottom <= this.mTempRect2.top) && this.mTempRect.bottom < this.mTempRect2.bottom) {
            c = 1;
        } else if ((this.mTempRect.bottom <= this.mTempRect2.bottom && this.mTempRect.top < this.mTempRect2.bottom) || this.mTempRect.top <= this.mTempRect2.top) {
            c = 0;
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 < 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 > 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        StringBuilder sb = new StringBuilder("Invalid direction: ");
        sb.append(i);
        sb.append(exceptionLabel());
        throw new IllegalArgumentException(sb.toString());
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    private void requestChildOnScreen(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.mInsetsDirty) {
                Rect rect = layoutParams2.mDecorInsets;
                this.mTempRect.left -= rect.left;
                this.mTempRect.right += rect.right;
                this.mTempRect.top -= rect.top;
                this.mTempRect.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping == null || !isOverlapping.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z = false;
        }
        this.mFirstLayoutComplete = z;
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null) {
            isOverlapping.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            findItemWithShortcutForKey finditemwithshortcutforkey = findItemWithShortcutForKey.length.get();
            this.mGapWorker = finditemwithshortcutforkey;
            if (finditemwithshortcutforkey == null) {
                this.mGapWorker = new findItemWithShortcutForKey();
                Display ICustomTabsCallback$Stub$Proxy = ViewCompat.ICustomTabsCallback$Stub$Proxy(this);
                float f = 60.0f;
                if (!isInEditMode() && ICustomTabsCallback$Stub$Proxy != null) {
                    float refreshRate = ICustomTabsCallback$Stub$Proxy.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                this.mGapWorker.getMin = (long) (1.0E9f / f);
                findItemWithShortcutForKey.length.set(this.mGapWorker);
            }
            this.mGapWorker.setMax.add(this);
        }
    }

    public void onDetachedFromWindow() {
        findItemWithShortcutForKey finditemwithshortcutforkey;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.length();
        }
        stopScroll();
        this.mIsAttached = false;
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null) {
            isOverlapping.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        clearHeader.getMax();
        if (ALLOW_THREAD_GAP_WORK && (finditemwithshortcutforkey = this.mGapWorker) != null) {
            finditemwithshortcutforkey.setMax.remove(this);
            this.mGapWorker = null;
        }
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    /* access modifiers changed from: package-private */
    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            StringBuilder sb = new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling");
            sb.append(exceptionLabel());
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(exceptionLabel());
        throw new IllegalStateException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                StringBuilder sb = new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(exceptionLabel());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(exceptionLabel());
            new IllegalStateException(sb2.toString());
        }
    }

    public void addOnItemTouchListener(@NonNull equals equals2) {
        this.mOnItemTouchListeners.add(equals2);
    }

    public void removeOnItemTouchListener(@NonNull equals equals2) {
        this.mOnItemTouchListeners.remove(equals2);
        if (this.mInterceptingOnItemTouchListener == equals2) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        equals equals2 = this.mInterceptingOnItemTouchListener;
        if (equals2 != null) {
            equals2.getMin(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return findInterceptingOnItemTouchListener(motionEvent);
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        int i = 0;
        while (i < size) {
            equals equals2 = this.mOnItemTouchListeners.get(i);
            if (!equals2.setMax(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.mInterceptingOnItemTouchListener = equals2;
                return true;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping == null) {
            return false;
        }
        boolean canScrollHorizontally = isOverlapping.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            if (canScrollVertically) {
                canScrollHorizontally |= true;
            }
            startNestedScroll(canScrollHorizontally ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i = x2 - this.mInitialTouchX;
                int i2 = y2 - this.mInitialTouchY;
                if (!canScrollHorizontally || Math.abs(i) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (canScrollVertically && Math.abs(i2) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (this.mScrollState == 1) {
            return true;
        }
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.mLayoutSuppressed
            r8 = 0
            if (r0 != 0) goto L_0x01c6
            boolean r0 = r6.mIgnoreMotionEventTillDown
            if (r0 == 0) goto L_0x000f
            goto L_0x01c6
        L_0x000f:
            boolean r0 = r17.dispatchToOnItemTouchListeners(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.cancelScroll()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r0 = r6.mLayout
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r0 = r6.mLayout
            boolean r11 = r0.canScrollVertically()
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.mVelocityTracker = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.mNestedOffsets
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.mNestedOffsets
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x019a
            if (r0 == r9) goto L_0x0158
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01bb
        L_0x0066:
            r17.onPointerUp(r18)
            goto L_0x01bb
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.mScrollPointerId = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            goto L_0x01bb
        L_0x0087:
            r17.cancelScroll()
            goto L_0x01bb
        L_0x008c:
            int r0 = r6.mScrollPointerId
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x0095
            return r8
        L_0x0095:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.mLastTouchX
            int r0 = r0 - r13
            int r1 = r6.mLastTouchY
            int r1 = r1 - r14
            int r2 = r6.mScrollState
            if (r2 == r9) goto L_0x00de
            if (r10 == 0) goto L_0x00c2
            if (r0 <= 0) goto L_0x00b7
            int r2 = r6.mTouchSlop
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00be
        L_0x00b7:
            int r2 = r6.mTouchSlop
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00be:
            if (r0 == 0) goto L_0x00c2
            r2 = 1
            goto L_0x00c3
        L_0x00c2:
            r2 = 0
        L_0x00c3:
            if (r11 == 0) goto L_0x00d9
            if (r1 <= 0) goto L_0x00cf
            int r3 = r6.mTouchSlop
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00d6
        L_0x00cf:
            int r3 = r6.mTouchSlop
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00d6:
            if (r1 == 0) goto L_0x00d9
            r2 = 1
        L_0x00d9:
            if (r2 == 0) goto L_0x00de
            r6.setScrollState(r9)
        L_0x00de:
            r15 = r0
            r16 = r1
            int r0 = r6.mScrollState
            if (r0 != r9) goto L_0x01bb
            int[] r0 = r6.mReusableIntPair
            r0[r8] = r8
            r0[r9] = r8
            if (r10 == 0) goto L_0x00ef
            r1 = r15
            goto L_0x00f0
        L_0x00ef:
            r1 = 0
        L_0x00f0:
            if (r11 == 0) goto L_0x00f5
            r2 = r16
            goto L_0x00f6
        L_0x00f5:
            r2 = 0
        L_0x00f6:
            int[] r3 = r6.mReusableIntPair
            int[] r4 = r6.mScrollOffset
            r5 = 0
            r0 = r17
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0125
            int[] r0 = r6.mReusableIntPair
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.mNestedOffsets
            r1 = r0[r8]
            int[] r2 = r6.mScrollOffset
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0125:
            r0 = r16
            int[] r1 = r6.mScrollOffset
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.mLastTouchX = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.mLastTouchY = r14
            if (r10 == 0) goto L_0x0137
            r1 = r15
            goto L_0x0138
        L_0x0137:
            r1 = 0
        L_0x0138:
            if (r11 == 0) goto L_0x013c
            r2 = r0
            goto L_0x013d
        L_0x013c:
            r2 = 0
        L_0x013d:
            boolean r1 = r6.scrollByInternal(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x014a
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x014a:
            o.findItemWithShortcutForKey r1 = r6.mGapWorker
            if (r1 == 0) goto L_0x01bb
            if (r15 != 0) goto L_0x0152
            if (r0 == 0) goto L_0x01bb
        L_0x0152:
            o.findItemWithShortcutForKey r1 = r6.mGapWorker
            r1.getMax(r6, r15, r0)
            goto L_0x01bb
        L_0x0158:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.mMaxFlingVelocity
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x0174
            android.view.VelocityTracker r1 = r6.mVelocityTracker
            int r2 = r6.mScrollPointerId
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x0175
        L_0x0174:
            r1 = 0
        L_0x0175:
            if (r11 == 0) goto L_0x0181
            android.view.VelocityTracker r2 = r6.mVelocityTracker
            int r3 = r6.mScrollPointerId
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x0182
        L_0x0181:
            r2 = 0
        L_0x0182:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x018a
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0192
        L_0x018a:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.fling(r0, r1)
            if (r0 != 0) goto L_0x0195
        L_0x0192:
            r6.setScrollState(r8)
        L_0x0195:
            r17.resetScroll()
            r8 = 1
            goto L_0x01bb
        L_0x019a:
            int r0 = r7.getPointerId(r8)
            r6.mScrollPointerId = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            if (r11 == 0) goto L_0x01b8
            r10 = r10 | 2
        L_0x01b8:
            r6.startNestedScroll(r10, r8)
        L_0x01bb:
            if (r8 != 0) goto L_0x01c2
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
        L_0x01c2:
            r12.recycle()
            return r9
        L_0x01c6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.canScrollHorizontally()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        nestedScrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    f = motionEvent.getAxisValue(26);
                    if (this.mLayout.canScrollVertically()) {
                        f2 = -f;
                    } else if (this.mLayout.canScrollHorizontally()) {
                        f2 = 0.0f;
                        nestedScrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            nestedScrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent, 1);
        }
        return false;
    }

    public void onMeasure(int i, int i2) {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (isOverlapping.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (!z && this.mAdapter != null) {
                if (this.mState.length == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.setMeasureSpecs(i, i2);
                this.mState.toFloatRange = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
                if (this.mLayout.shouldMeasureTwice()) {
                    this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.toFloatRange = true;
                    dispatchLayoutStep2();
                    this.mLayout.setMeasuredDimensionFromChildren(i, i2);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                if (this.mState.toString) {
                    this.mState.equals = true;
                } else {
                    this.mAdapterHelper.setMax();
                    this.mState.equals = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.toString) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            Adapter adapter = this.mAdapter;
            if (adapter != null) {
                this.mState.setMin = adapter.getItemCount();
            } else {
                this.mState.setMin = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            stopInterceptRequestLayout(false);
            this.mState.equals = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(IsOverlapping.chooseSize(i, getPaddingLeft() + getPaddingRight(), ViewCompat.invokeSuspend(this)), IsOverlapping.chooseSize(i2, getPaddingTop() + getPaddingBottom(), ViewCompat.valueOf(this)));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    public void setItemAnimator(@Nullable ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.mItemAnimator;
        if (itemAnimator2 != null) {
            itemAnimator2.length();
            this.mItemAnimator.toFloatRange = null;
        }
        this.mItemAnimator = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.toFloatRange = this.mItemAnimatorListener;
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    /* access modifiers changed from: package-private */
    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i <= 0) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            AccessibilityEventCompat.getMin(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!isComputingLayout()) {
            return false;
        }
        int min = accessibilityEvent != null ? AccessibilityEventCompat.setMin(accessibilityEvent) : 0;
        if (min != 0) {
            i = min;
        }
        this.mEatenAccessibilityChangeFlags |= i;
        return true;
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Nullable
    public ItemAnimator getItemAnimator() {
        return this.mItemAnimator;
    }

    /* access modifiers changed from: package-private */
    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            ViewCompat.getMax((View) this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z = false;
        if (this.mDataSetHasChangedAfterLayout) {
            setQwertyMode setqwertymode = this.mAdapterHelper;
            setqwertymode.getMax((List<setQwertyMode.getMax>) setqwertymode.length);
            setqwertymode.getMax((List<setQwertyMode.getMax>) setqwertymode.getMin);
            setqwertymode.toFloatRange = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.setMin();
        } else {
            this.mAdapterHelper.setMax();
        }
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.IsOverlapping = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z2 || this.mLayout.mRequestedSimpleAnimations) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.hasStableIds());
        RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic = this.mState;
        if (recyclerView$Mean$Arithmetic.IsOverlapping && z2 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z = true;
        }
        recyclerView$Mean$Arithmetic.toString = z;
    }

    /* access modifiers changed from: package-private */
    public void dispatchLayout() {
        if (this.mAdapter != null && this.mLayout != null) {
            this.mState.toFloatRange = false;
            boolean z = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
            this.mLastAutoMeasureNonExactMeasuredWidth = 0;
            this.mLastAutoMeasureNonExactMeasuredHeight = 0;
            this.mLastAutoMeasureSkippedDueToExact = false;
            if (this.mState.length == 1) {
                dispatchLayoutStep1();
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            } else if (this.mAdapterHelper.getMax() || z || this.mLayout.getWidth() != getWidth() || this.mLayout.getHeight() != getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
            }
            dispatchLayoutStep3();
        }
    }

    private void saveFocusInfo() {
        int i;
        valueOf valueof = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            valueof = findContainingViewHolder(focusedChild);
        }
        if (valueof == null) {
            resetFocusInfo();
            return;
        }
        this.mState.hashCode = this.mAdapter.hasStableIds() ? valueof.getItemId() : -1;
        RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            i = -1;
        } else if (valueof.isRemoved()) {
            i = valueof.mOldPosition;
        } else {
            i = valueof.getAbsoluteAdapterPosition();
        }
        recyclerView$Mean$Arithmetic.values = i;
        this.mState.toDoubleRange = getDeepestFocusedViewWithId(valueof.itemView);
    }

    private void resetFocusInfo() {
        this.mState.hashCode = -1;
        this.mState.values = -1;
        this.mState.toDoubleRange = -1;
    }

    @Nullable
    private View findNextViewToFocus() {
        int i;
        valueOf findViewHolderForAdapterPosition;
        int i2 = this.mState.values != -1 ? this.mState.values : 0;
        RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic = this.mState;
        if (recyclerView$Mean$Arithmetic.equals) {
            i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i = recyclerView$Mean$Arithmetic.setMin;
        }
        int i3 = i2;
        while (i3 < i) {
            valueOf findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            } else {
                i3++;
            }
        }
        int min = Math.min(i, i2);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition.itemView;
            }
        }
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                        isShortcutsVisible isshortcutsvisible = this.mChildHelper;
                        if (isshortcutsvisible.getMin.setMin() - isshortcutsvisible.setMin.size() == 0) {
                            requestFocus();
                            return;
                        }
                    } else if (!this.mChildHelper.setMin(focusedChild)) {
                        return;
                    }
                }
                View view = null;
                valueOf findViewHolderForItemId = (this.mState.hashCode == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.hashCode);
                if (findViewHolderForItemId == null || this.mChildHelper.setMin(findViewHolderForItemId.itemView) || !findViewHolderForItemId.itemView.hasFocusable()) {
                    isShortcutsVisible isshortcutsvisible2 = this.mChildHelper;
                    if (isshortcutsvisible2.getMin.setMin() - isshortcutsvisible2.setMin.size() > 0) {
                        view = findNextViewToFocus();
                    }
                } else {
                    view = findViewHolderForItemId.itemView;
                }
                if (view != null) {
                    if (!(((long) this.mState.toDoubleRange) == -1 || (findViewById = view.findViewById(this.mState.toDoubleRange)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    /* access modifiers changed from: package-private */
    public final void fillRemainingScrollValues(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.length;
            recyclerView$Mean$Arithmetic.FastBitmap$CoordinateSystem = overScroller.getFinalX() - overScroller.getCurrX();
            recyclerView$Mean$Arithmetic.Mean$Arithmetic = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        recyclerView$Mean$Arithmetic.FastBitmap$CoordinateSystem = 0;
        recyclerView$Mean$Arithmetic.Mean$Arithmetic = 0;
    }

    private void dispatchLayoutStep1() {
        boolean z = true;
        this.mState.length(1);
        fillRemainingScrollValues(this.mState);
        this.mState.toFloatRange = false;
        startInterceptRequestLayout();
        clearHeader clearheader = this.mViewInfoStore;
        clearheader.length.clear();
        clearheader.setMin.setMin();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic = this.mState;
        if (!recyclerView$Mean$Arithmetic.IsOverlapping || !this.mItemsChanged) {
            z = false;
        }
        recyclerView$Mean$Arithmetic.toIntRange = z;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic2 = this.mState;
        recyclerView$Mean$Arithmetic2.equals = recyclerView$Mean$Arithmetic2.toString;
        this.mState.setMin = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.IsOverlapping) {
            isShortcutsVisible isshortcutsvisible = this.mChildHelper;
            int min = isshortcutsvisible.getMin.setMin() - isshortcutsvisible.setMin.size();
            for (int i = 0; i < min; i++) {
                isShortcutsVisible isshortcutsvisible2 = this.mChildHelper;
                valueOf childViewHolderInt = getChildViewHolderInt(isshortcutsvisible2.getMin.getMax(isshortcutsvisible2.getMin(i)));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    ItemAnimator.getMax(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    this.mViewInfoStore.getMax(childViewHolderInt, ItemAnimator.toFloatRange().setMin(childViewHolderInt));
                    if (this.mState.toIntRange && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.setMin.setMax(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.toString) {
            saveOldPositions();
            boolean z2 = this.mState.isInside;
            this.mState.isInside = false;
            this.mLayout.onLayoutChildren(this.mRecycler, this.mState);
            this.mState.isInside = z2;
            int i2 = 0;
            while (true) {
                isShortcutsVisible isshortcutsvisible3 = this.mChildHelper;
                if (i2 >= isshortcutsvisible3.getMin.setMin() - isshortcutsvisible3.setMin.size()) {
                    break;
                }
                isShortcutsVisible isshortcutsvisible4 = this.mChildHelper;
                valueOf childViewHolderInt2 = getChildViewHolderInt(isshortcutsvisible4.getMin.getMax(isshortcutsvisible4.getMin(i2)));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.setMax(childViewHolderInt2)) {
                    ItemAnimator.getMax(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    childViewHolderInt2.getUnmodifiedPayloads();
                    ItemAnimator.setMax min2 = ItemAnimator.toFloatRange().setMin(childViewHolderInt2);
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, min2);
                    } else {
                        clearHeader clearheader2 = this.mViewInfoStore;
                        clearHeader.getMax getmax = clearheader2.length.get(childViewHolderInt2);
                        if (getmax == null) {
                            getmax = clearHeader.getMax.length();
                            clearheader2.length.put(childViewHolderInt2, getmax);
                        }
                        getmax.getMin |= 2;
                        getmax.getMax = min2;
                    }
                }
                i2++;
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.length = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.length(6);
        this.mAdapterHelper.setMax();
        this.mState.setMin = this.mAdapter.getItemCount();
        this.mState.getMax = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            if (this.mPendingSavedState.setMin != null) {
                this.mLayout.onRestoreInstanceState(this.mPendingSavedState.setMin);
            }
            this.mPendingSavedState = null;
        }
        this.mState.equals = false;
        this.mLayout.onLayoutChildren(this.mRecycler, this.mState);
        this.mState.isInside = false;
        RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic = this.mState;
        recyclerView$Mean$Arithmetic.IsOverlapping = recyclerView$Mean$Arithmetic.IsOverlapping && this.mItemAnimator != null;
        this.mState.length = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.length(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.length = 1;
        if (this.mState.IsOverlapping) {
            isShortcutsVisible isshortcutsvisible = this.mChildHelper;
            for (int min = (isshortcutsvisible.getMin.setMin() - isshortcutsvisible.setMin.size()) - 1; min >= 0; min--) {
                isShortcutsVisible isshortcutsvisible2 = this.mChildHelper;
                valueOf childViewHolderInt = getChildViewHolderInt(isshortcutsvisible2.getMin.getMax(isshortcutsvisible2.getMin(min)));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    ItemAnimator.setMax min2 = ItemAnimator.toFloatRange().setMin(childViewHolderInt);
                    valueOf max = this.mViewInfoStore.setMin.getMax(changedHolderKey, null);
                    if (max != null && !max.shouldIgnore()) {
                        boolean length2 = this.mViewInfoStore.length(max);
                        boolean length3 = this.mViewInfoStore.length(childViewHolderInt);
                        if (!length2 || max != childViewHolderInt) {
                            ItemAnimator.setMax min3 = this.mViewInfoStore.getMin(max, 4);
                            this.mViewInfoStore.setMin(childViewHolderInt, min2);
                            ItemAnimator.setMax min4 = this.mViewInfoStore.getMin(childViewHolderInt, 8);
                            if (min3 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, max);
                            } else {
                                animateChange(max, childViewHolderInt, min3, min4, length2, length3);
                            }
                        }
                    }
                    this.mViewInfoStore.setMin(childViewHolderInt, min2);
                }
            }
            clearHeader clearheader = this.mViewInfoStore;
            clearHeader.length length4 = this.mViewInfoProcessCallback;
            for (int size = clearheader.length.size() - 1; size >= 0; size--) {
                valueOf valueof = (valueOf) clearheader.length.isInside[size << 1];
                clearHeader.getMax min5 = clearheader.length.setMin(size);
                if ((min5.getMin & 3) == 3) {
                    length4.setMax(valueof);
                } else if ((min5.getMin & 1) != 0) {
                    if (min5.getMax == null) {
                        length4.setMax(valueof);
                    } else {
                        length4.length(valueof, min5.getMax, min5.setMin);
                    }
                } else if ((min5.getMin & 14) == 14) {
                    length4.getMax(valueof, min5.getMax, min5.setMin);
                } else if ((min5.getMin & 12) == 12) {
                    length4.setMin(valueof, min5.getMax, min5.setMin);
                } else if ((min5.getMin & 4) != 0) {
                    length4.length(valueof, min5.getMax, (ItemAnimator.setMax) null);
                } else if ((min5.getMin & 8) != 0) {
                    length4.getMax(valueof, min5.getMax, min5.setMin);
                }
                clearHeader.getMax.length(min5);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic = this.mState;
        recyclerView$Mean$Arithmetic.setMax = recyclerView$Mean$Arithmetic.setMin;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mState.IsOverlapping = false;
        this.mState.toString = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        if (this.mRecycler.setMin != null) {
            this.mRecycler.setMin.clear();
        }
        if (this.mLayout.mPrefetchMaxObservedInInitialPrefetch) {
            this.mLayout.mPrefetchMaxCountObserved = 0;
            this.mLayout.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.getMin();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        clearHeader clearheader2 = this.mViewInfoStore;
        clearheader2.length.clear();
        clearheader2.setMin.setMin();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private void handleMissingPreInfoForChangeError(long j, valueOf valueof, valueOf valueof2) {
        isShortcutsVisible isshortcutsvisible = this.mChildHelper;
        int min = isshortcutsvisible.getMin.setMin() - isshortcutsvisible.setMin.size();
        int i = 0;
        while (i < min) {
            isShortcutsVisible isshortcutsvisible2 = this.mChildHelper;
            valueOf childViewHolderInt = getChildViewHolderInt(isshortcutsvisible2.getMin.getMax(isshortcutsvisible2.getMin(i)));
            if (childViewHolderInt == valueof || getChangedHolderKey(childViewHolderInt) != j) {
                i++;
            } else {
                Adapter adapter = this.mAdapter;
                if (adapter == null || !adapter.hasStableIds()) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(valueof);
                    sb.append(exceptionLabel());
                    throw new IllegalStateException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(valueof);
                sb2.append(exceptionLabel());
                throw new IllegalStateException(sb2.toString());
            }
        }
        exceptionLabel();
    }

    /* access modifiers changed from: package-private */
    public void recordAnimationInfoIfBouncedHiddenView(valueOf valueof, ItemAnimator.setMax setmax) {
        valueof.setFlags(0, 8192);
        if (this.mState.toIntRange && valueof.isUpdated() && !valueof.isRemoved() && !valueof.shouldIgnore()) {
            this.mViewInfoStore.setMin.setMax(getChangedHolderKey(valueof), valueof);
        }
        this.mViewInfoStore.getMax(valueof, setmax);
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        isShortcutsVisible isshortcutsvisible = this.mChildHelper;
        int min = isshortcutsvisible.getMin.setMin() - isshortcutsvisible.setMin.size();
        if (min == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < min; i3++) {
            isShortcutsVisible isshortcutsvisible2 = this.mChildHelper;
            valueOf childViewHolderInt = getChildViewHolderInt(isshortcutsvisible2.getMin.getMax(isshortcutsvisible2.getMin(i3)));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        valueOf childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                sb.append(exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    /* access modifiers changed from: package-private */
    public long getChangedHolderKey(valueOf valueof) {
        return this.mAdapter.hasStableIds() ? valueof.getItemId() : (long) valueof.mPosition;
    }

    /* access modifiers changed from: package-private */
    public void animateAppearance(@NonNull valueOf valueof, @Nullable ItemAnimator.setMax setmax, @NonNull ItemAnimator.setMax setmax2) {
        valueof.setIsRecyclable(false);
        if (this.mItemAnimator.setMin(valueof, setmax, setmax2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void animateDisappearance(@NonNull valueOf valueof, @NonNull ItemAnimator.setMax setmax, @Nullable ItemAnimator.setMax setmax2) {
        addAnimatingView(valueof);
        valueof.setIsRecyclable(false);
        if (this.mItemAnimator.getMin(valueof, setmax, setmax2)) {
            postAnimationRunner();
        }
    }

    private void animateChange(@NonNull valueOf valueof, @NonNull valueOf valueof2, @NonNull ItemAnimator.setMax setmax, @NonNull ItemAnimator.setMax setmax2, boolean z, boolean z2) {
        valueof.setIsRecyclable(false);
        if (z) {
            addAnimatingView(valueof);
        }
        if (valueof != valueof2) {
            if (z2) {
                addAnimatingView(valueof2);
            }
            valueof.mShadowedHolder = valueof2;
            addAnimatingView(valueof);
            this.mRecycler.setMax(valueof);
            valueof2.setIsRecyclable(false);
            valueof2.mShadowingHolder = valueof;
        }
        if (this.mItemAnimator.setMin(valueof, valueof2, setmax, setmax2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        StyleableRes.setMax(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        StyleableRes.getMin();
        this.mFirstLayoutComplete = true;
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void markItemDecorInsetsDirty() {
        int min = this.mChildHelper.getMin.setMin();
        for (int i = 0; i < min; i++) {
            ((LayoutParams) this.mChildHelper.getMin.getMax(i).getLayoutParams()).mInsetsDirty = true;
        }
        toDoubleRange todoublerange = this.mRecycler;
        int size = todoublerange.getMax.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutParams layoutParams = (LayoutParams) todoublerange.getMax.get(i2).itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.mInsetsDirty = true;
            }
        }
    }

    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.setMax()) {
            z3 = z;
        }
        if (z3) {
            ViewCompat.equals(this);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.mLayout.checkLayoutParams((LayoutParams) layoutParams);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null) {
            return isOverlapping.generateDefaultLayoutParams();
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(exceptionLabel());
        throw new IllegalStateException(sb.toString());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null) {
            return isOverlapping.generateLayoutParams(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(exceptionLabel());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null) {
            return isOverlapping.generateLayoutParams(layoutParams);
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(exceptionLabel());
        throw new IllegalStateException(sb.toString());
    }

    public boolean isAnimating() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator != null && itemAnimator.setMax();
    }

    /* access modifiers changed from: package-private */
    public void saveOldPositions() {
        int min = this.mChildHelper.getMin.setMin();
        for (int i = 0; i < min; i++) {
            valueOf childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getMin.getMax(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void clearOldPositions() {
        int min = this.mChildHelper.getMin.setMin();
        for (int i = 0; i < min; i++) {
            valueOf childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getMin.getMax(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        toDoubleRange todoublerange = this.mRecycler;
        int size = todoublerange.getMax.size();
        for (int i2 = 0; i2 < size; i2++) {
            todoublerange.getMax.get(i2).clearOldPosition();
        }
        int size2 = todoublerange.getMin.size();
        for (int i3 = 0; i3 < size2; i3++) {
            todoublerange.getMin.get(i3).clearOldPosition();
        }
        if (todoublerange.setMin != null) {
            int size3 = todoublerange.setMin.size();
            for (int i4 = 0; i4 < size3; i4++) {
                todoublerange.setMin.get(i4).clearOldPosition();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int min = this.mChildHelper.getMin.setMin();
        int i8 = -1;
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i9 = 0; i9 < min; i9++) {
            valueOf childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getMin.getMax(i9));
            if (childViewHolderInt != null && childViewHolderInt.mPosition >= i5 && childViewHolderInt.mPosition <= i4) {
                if (childViewHolderInt.mPosition == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i3, false);
                }
                this.mState.isInside = true;
            }
        }
        toDoubleRange todoublerange = this.mRecycler;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i8 = 1;
        }
        int size = todoublerange.getMax.size();
        for (int i10 = 0; i10 < size; i10++) {
            valueOf valueof = todoublerange.getMax.get(i10);
            if (valueof != null && valueof.mPosition >= i7 && valueof.mPosition <= i6) {
                if (valueof.mPosition == i) {
                    valueof.offsetPosition(i2 - i, false);
                } else {
                    valueof.offsetPosition(i8, false);
                }
            }
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForInsert(int i, int i2) {
        int min = this.mChildHelper.getMin.setMin();
        for (int i3 = 0; i3 < min; i3++) {
            valueOf childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getMin.getMax(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.isInside = true;
            }
        }
        toDoubleRange todoublerange = this.mRecycler;
        int size = todoublerange.getMax.size();
        for (int i4 = 0; i4 < size; i4++) {
            valueOf valueof = todoublerange.getMax.get(i4);
            if (valueof != null && valueof.mPosition >= i) {
                valueof.offsetPosition(i2, false);
            }
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int min = this.mChildHelper.getMin.setMin();
        for (int i4 = 0; i4 < min; i4++) {
            valueOf childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getMin.getMax(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                if (childViewHolderInt.mPosition >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.isInside = true;
                } else if (childViewHolderInt.mPosition >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.isInside = true;
                }
            }
        }
        toDoubleRange todoublerange = this.mRecycler;
        for (int size = todoublerange.getMax.size() - 1; size >= 0; size--) {
            valueOf valueof = todoublerange.getMax.get(size);
            if (valueof != null) {
                if (valueof.mPosition >= i3) {
                    valueof.offsetPosition(-i2, z);
                } else if (valueof.mPosition >= i) {
                    valueof.addFlags(8);
                    todoublerange.getMax(todoublerange.getMax.get(size), true);
                    todoublerange.getMax.remove(size);
                }
            }
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int min = this.mChildHelper.getMin.setMin();
        int i4 = i2 + i;
        for (int i5 = 0; i5 < min; i5++) {
            View max = this.mChildHelper.getMin.getMax(i5);
            valueOf childViewHolderInt = getChildViewHolderInt(max);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i && childViewHolderInt.mPosition < i4) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((LayoutParams) max.getLayoutParams()).mInsetsDirty = true;
            }
        }
        toDoubleRange todoublerange = this.mRecycler;
        for (int size = todoublerange.getMax.size() - 1; size >= 0; size--) {
            valueOf valueof = todoublerange.getMax.get(size);
            if (valueof != null && (i3 = valueof.mPosition) >= i && i3 < i4) {
                valueof.addFlags(2);
                todoublerange.getMax(todoublerange.getMax.get(size), true);
                todoublerange.getMax.remove(size);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean canReuseUpdatedViewHolder(valueOf valueof) {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator == null || itemAnimator.getMin(valueof, valueof.getUnmodifiedPayloads());
    }

    /* access modifiers changed from: package-private */
    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    /* access modifiers changed from: package-private */
    public void markKnownViewsInvalid() {
        int min = this.mChildHelper.getMin.setMin();
        for (int i = 0; i < min; i++) {
            valueOf childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getMin.getMax(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        toDoubleRange todoublerange = this.mRecycler;
        int size = todoublerange.getMax.size();
        for (int i2 = 0; i2 < size; i2++) {
            valueOf valueof = todoublerange.getMax.get(i2);
            if (valueof != null) {
                valueof.addFlags(6);
                valueof.addChangePayload((Object) null);
            }
        }
        if (RecyclerView.this.mAdapter == null || !RecyclerView.this.mAdapter.hasStableIds()) {
            todoublerange.length();
        }
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            IsOverlapping isOverlapping = this.mLayout;
            if (isOverlapping != null) {
                isOverlapping.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public valueOf getChildViewHolder(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    @Nullable
    public View findContainingItemView(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Nullable
    public valueOf findContainingViewHolder(@NonNull View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public static valueOf getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).mViewHolder;
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
        return getChildAdapterPosition(view);
    }

    public int getChildAdapterPosition(@NonNull View view) {
        valueOf childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public int getChildLayoutPosition(@NonNull View view) {
        valueOf childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    public long getChildItemId(@NonNull View view) {
        valueOf childViewHolderInt;
        Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1;
        }
        return childViewHolderInt.getItemId();
    }

    @Deprecated
    @Nullable
    public valueOf findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Nullable
    public valueOf findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Nullable
    public valueOf findViewHolderForAdapterPosition(int i) {
        valueOf valueof = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int min = this.mChildHelper.getMin.setMin();
        for (int i2 = 0; i2 < min; i2++) {
            valueOf childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getMin.getMax(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                if (!this.mChildHelper.setMin(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                valueof = childViewHolderInt;
            }
        }
        return valueof;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public valueOf findViewHolderForPosition(int i, boolean z) {
        int min = this.mChildHelper.getMin.setMin();
        valueOf valueof = null;
        for (int i2 = 0; i2 < min; i2++) {
            valueOf childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getMin.getMax(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i) {
                    continue;
                }
                if (!this.mChildHelper.setMin(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                valueof = childViewHolderInt;
            }
        }
        return valueof;
    }

    public valueOf findViewHolderForItemId(long j) {
        Adapter adapter = this.mAdapter;
        valueOf valueof = null;
        if (adapter != null && adapter.hasStableIds()) {
            int min = this.mChildHelper.getMin.setMin();
            for (int i = 0; i < min; i++) {
                valueOf childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getMin.getMax(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    if (!this.mChildHelper.setMin(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    valueof = childViewHolderInt;
                }
            }
        }
        return valueof;
    }

    @Nullable
    public View findChildViewUnder(float f, float f2) {
        isShortcutsVisible isshortcutsvisible = this.mChildHelper;
        for (int min = (isshortcutsvisible.getMin.setMin() - isshortcutsvisible.setMin.size()) - 1; min >= 0; min--) {
            isShortcutsVisible isshortcutsvisible2 = this.mChildHelper;
            View max = isshortcutsvisible2.getMin.getMax(isshortcutsvisible2.getMin(min));
            float translationX = max.getTranslationX();
            float translationY = max.getTranslationY();
            if (f >= ((float) max.getLeft()) + translationX && f <= ((float) max.getRight()) + translationX && f2 >= ((float) max.getTop()) + translationY && f2 <= ((float) max.getBottom()) + translationY) {
                return max;
            }
        }
        return null;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void offsetChildrenVertical(@Px int i) {
        isShortcutsVisible isshortcutsvisible = this.mChildHelper;
        int min = isshortcutsvisible.getMin.setMin() - isshortcutsvisible.setMin.size();
        for (int i2 = 0; i2 < min; i2++) {
            isShortcutsVisible isshortcutsvisible2 = this.mChildHelper;
            isshortcutsvisible2.getMin.getMax(isshortcutsvisible2.getMin(i2)).offsetTopAndBottom(i);
        }
    }

    public void offsetChildrenHorizontal(@Px int i) {
        isShortcutsVisible isshortcutsvisible = this.mChildHelper;
        int min = isshortcutsvisible.getMin.setMin() - isshortcutsvisible.setMin.size();
        for (int i2 = 0; i2 < min; i2++) {
            isShortcutsVisible isshortcutsvisible2 = this.mChildHelper;
            isshortcutsvisible2.getMin.getMax(isshortcutsvisible2.getMin(i2)).offsetLeftAndRight(i);
        }
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.mDecorInsets;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    /* access modifiers changed from: package-private */
    public Rect getItemDecorInsetsForChild(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.mInsetsDirty) {
            return layoutParams.mDecorInsets;
        }
        if (this.mState.setMax() && (layoutParams.isItemChanged() || layoutParams.isViewInvalid())) {
            return layoutParams.mDecorInsets;
        }
        Rect rect = layoutParams.mDecorInsets;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            rect.left += this.mTempRect.left;
            rect.top += this.mTempRect.top;
            rect.right += this.mTempRect.right;
            rect.bottom += this.mTempRect.bottom;
        }
        layoutParams.mInsetsDirty = false;
        return rect;
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        toIntRange tointrange = this.mScrollListener;
        if (tointrange != null) {
            tointrange.onScrolled(this, i, i2);
        }
        List<toIntRange> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrollStateChanged(int i) {
        IsOverlapping isOverlapping = this.mLayout;
        if (isOverlapping != null) {
            isOverlapping.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        toIntRange tointrange = this.mScrollListener;
        if (tointrange != null) {
            tointrange.onScrollStateChanged(this, i);
        }
        List<toIntRange> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.getMin();
    }

    class invoke implements Runnable {
        boolean getMax = false;
        Interpolator getMin = RecyclerView.sQuinticInterpolator;
        boolean isInside = false;
        OverScroller length;
        int setMax;
        int setMin;

        invoke() {
            this.length = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
        }

        public void run() {
            int i;
            int i2;
            int i3;
            if (RecyclerView.this.mLayout == null) {
                RecyclerView.this.removeCallbacks(this);
                this.length.abortAnimation();
                return;
            }
            this.isInside = false;
            this.getMax = true;
            RecyclerView.this.consumePendingUpdateOperations();
            OverScroller overScroller = this.length;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.setMax;
                int i5 = currY - this.setMin;
                this.setMax = currX;
                this.setMin = currY;
                RecyclerView.this.mReusableIntPair[0] = 0;
                RecyclerView.this.mReusableIntPair[1] = 0;
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.dispatchNestedPreScroll(i4, i5, recyclerView.mReusableIntPair, (int[]) null, 1)) {
                    i4 -= RecyclerView.this.mReusableIntPair[0];
                    i5 -= RecyclerView.this.mReusableIntPair[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i4, i5);
                }
                if (RecyclerView.this.mAdapter != null) {
                    RecyclerView.this.mReusableIntPair[0] = 0;
                    RecyclerView.this.mReusableIntPair[1] = 0;
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.scrollStep(i4, i5, recyclerView2.mReusableIntPair);
                    i2 = RecyclerView.this.mReusableIntPair[0];
                    i = RecyclerView.this.mReusableIntPair[1];
                    i4 -= i2;
                    i5 -= i;
                    values values = RecyclerView.this.mLayout.mSmoothScroller;
                    if (values != null && !values.isPendingInitialRun() && values.isRunning()) {
                        RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic = RecyclerView.this.mState;
                        if (recyclerView$Mean$Arithmetic.equals) {
                            i3 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
                        } else {
                            i3 = recyclerView$Mean$Arithmetic.setMin;
                        }
                        if (i3 == 0) {
                            values.stop();
                        } else {
                            if (values.getTargetPosition() >= i3) {
                                values.setTargetPosition(i3 - 1);
                            }
                            values.onAnimation(i2, i);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView.this.mReusableIntPair[0] = 0;
                RecyclerView.this.mReusableIntPair[1] = 0;
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.dispatchNestedScroll(i2, i, i4, i5, (int[]) null, 1, recyclerView3.mReusableIntPair);
                int i6 = i4 - RecyclerView.this.mReusableIntPair[0];
                int i7 = i5 - RecyclerView.this.mReusableIntPair[1];
                if (!(i2 == 0 && i == 0)) {
                    RecyclerView.this.dispatchOnScrolled(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                values values2 = RecyclerView.this.mLayout.mSmoothScroller;
                if ((values2 != null && values2.isPendingInitialRun()) || !z) {
                    if (this.getMax) {
                        this.isInside = true;
                    } else {
                        RecyclerView.this.removeCallbacks(this);
                        ViewCompat.getMax((View) RecyclerView.this, (Runnable) this);
                    }
                    if (RecyclerView.this.mGapWorker != null) {
                        RecyclerView.this.mGapWorker.getMax(RecyclerView.this, i2, i);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i8, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        findItemWithShortcutForKey.setMin setmin = RecyclerView.this.mPrefetchRegistry;
                        if (setmin.getMin != null) {
                            Arrays.fill(setmin.getMin, -1);
                        }
                        setmin.length = 0;
                    }
                }
            }
            values values3 = RecyclerView.this.mLayout.mSmoothScroller;
            if (values3 != null && values3.isPendingInitialRun()) {
                values3.onAnimation(0, 0);
            }
            this.getMax = false;
            if (this.isInside) {
                RecyclerView.this.removeCallbacks(this);
                ViewCompat.getMax((View) RecyclerView.this, (Runnable) this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }

        private void setMin() {
            if (this.getMax) {
                this.isInside = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            ViewCompat.getMax((View) RecyclerView.this, (Runnable) this);
        }

        public final void getMin(int i, int i2, int i3, @Nullable Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = getMin(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.getMin != interpolator) {
                this.getMin = interpolator;
                this.length = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.setMin = 0;
            this.setMax = 0;
            RecyclerView.this.setScrollState(2);
            this.length.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.length.computeScrollOffset();
            }
            setMin();
        }

        private int getMin(int i, int i2) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            return Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
        }
    }

    /* access modifiers changed from: package-private */
    public void repositionShadowingViews() {
        isShortcutsVisible isshortcutsvisible = this.mChildHelper;
        int min = isshortcutsvisible.getMin.setMin() - isshortcutsvisible.setMin.size();
        for (int i = 0; i < min; i++) {
            isShortcutsVisible isshortcutsvisible2 = this.mChildHelper;
            View max = isshortcutsvisible2.getMin.getMax(isshortcutsvisible2.getMin(i));
            valueOf childViewHolder = getChildViewHolder(max);
            if (!(childViewHolder == null || childViewHolder.mShadowingHolder == null)) {
                View view = childViewHolder.mShadowingHolder.itemView;
                int left = max.getLeft();
                int top = max.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    class toString extends setMin {
        toString() {
        }

        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            RecyclerView.this.mState.isInside = true;
            RecyclerView.this.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.getMin()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            if (RecyclerView.this.mAdapterHelper.setMax(i, i2, obj)) {
                setMin();
            }
        }

        public void onItemRangeInserted(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            if (RecyclerView.this.mAdapterHelper.setMin(i, i2)) {
                setMin();
            }
        }

        public void onItemRangeRemoved(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            if (RecyclerView.this.mAdapterHelper.length(i, i2)) {
                setMin();
            }
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            if (RecyclerView.this.mAdapterHelper.getMax(i, i2, i3)) {
                setMin();
            }
        }

        private void setMin() {
            if (!RecyclerView.POST_UPDATES_ON_ANIMATION || !RecyclerView.this.mHasFixedSize || !RecyclerView.this.mIsAttached) {
                RecyclerView.this.mAdapterUpdateDuringMeasure = true;
                RecyclerView.this.requestLayout();
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            ViewCompat.getMax((View) recyclerView, recyclerView.mUpdateChildViewsRunnable);
        }

        public void onStateRestorationPolicyChanged() {
            Adapter adapter;
            if (RecyclerView.this.mPendingSavedState != null && (adapter = RecyclerView.this.mAdapter) != null && adapter.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    public static class EdgeEffectFactory {

        @Retention(RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }

        @NonNull
        protected static EdgeEffect getMax(@NonNull RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    @Nullable
    static RecyclerView findNestedRecyclerView(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    static void clearNestedRecyclerViewIfNotNested(@NonNull valueOf valueof) {
        if (valueof.mNestedRecyclerView != null) {
            View view = valueof.mNestedRecyclerView.get();
            while (view != null) {
                if (view != valueof.itemView) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            valueof.mNestedRecyclerView = null;
        }
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    public final class toDoubleRange {
        int IsOverlapping = 2;
        final ArrayList<valueOf> getMax = new ArrayList<>();
        public final ArrayList<valueOf> getMin = new ArrayList<>();
        RecyclerView$Grayscale$Algorithm isInside;
        int length = 2;
        final List<valueOf> setMax = Collections.unmodifiableList(this.getMin);
        ArrayList<valueOf> setMin = null;
        RecyclerView$FastBitmap$CoordinateSystem toFloatRange;

        public toDoubleRange() {
        }

        public final void getMin() {
            this.IsOverlapping = this.length + (RecyclerView.this.mLayout != null ? RecyclerView.this.mLayout.mPrefetchMaxCountObserved : 0);
            for (int size = this.getMax.size() - 1; size >= 0 && this.getMax.size() > this.IsOverlapping; size--) {
                getMax(this.getMax.get(size), true);
                this.getMax.remove(size);
            }
        }

        private boolean length(valueOf valueof) {
            if (valueof.isRemoved()) {
                return RecyclerView.this.mState.setMax();
            }
            if (valueof.mPosition < 0 || valueof.mPosition >= RecyclerView.this.mAdapter.getItemCount()) {
                StringBuilder sb = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                sb.append(valueof);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (!RecyclerView.this.mState.setMax() && RecyclerView.this.mAdapter.getItemViewType(valueof.mPosition) != valueof.getItemViewType()) {
                return false;
            } else {
                if (!RecyclerView.this.mAdapter.hasStableIds() || valueof.getItemId() == RecyclerView.this.mAdapter.getItemId(valueof.mPosition)) {
                    return true;
                }
                return false;
            }
        }

        private boolean setMin(@NonNull valueOf valueof, int i, int i2, long j) {
            valueof.mBindingAdapter = null;
            valueof.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = valueof.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.toFloatRange.setMax(itemViewType, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.mAdapter.bindViewHolder(valueof, i);
            long nanoTime2 = RecyclerView.this.getNanoTime();
            RecyclerView$FastBitmap$CoordinateSystem.getMin max = this.toFloatRange.setMax(valueof.getItemViewType());
            max.setMin = RecyclerView$FastBitmap$CoordinateSystem.getMax(max.setMin, nanoTime2 - nanoTime);
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = valueof.itemView;
                if (ViewCompat.isInside(view) == 0) {
                    ViewCompat.setMin(view, 1);
                }
                if (RecyclerView.this.mAccessibilityDelegate != null) {
                    setOnCancelListener itemDelegate = RecyclerView.this.mAccessibilityDelegate.getItemDelegate();
                    if (itemDelegate instanceof onItemActionRequestChanged.getMin) {
                        onItemActionRequestChanged.getMin getmin = (onItemActionRequestChanged.getMin) itemDelegate;
                        setOnCancelListener length2 = ViewCompat.length(view);
                        if (!(length2 == null || length2 == getmin)) {
                            getmin.length.put(view, length2);
                        }
                    }
                    ViewCompat.getMin(view, itemDelegate);
                }
            }
            if (RecyclerView.this.mState.setMax()) {
                valueof.mPreLayoutPosition = i2;
            }
            return true;
        }

        public final int getMin(int i) {
            int i2;
            int i3;
            if (i >= 0) {
                RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic = RecyclerView.this.mState;
                if (recyclerView$Mean$Arithmetic.equals) {
                    i3 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
                } else {
                    i3 = recyclerView$Mean$Arithmetic.setMin;
                }
                if (i < i3) {
                    if (!RecyclerView.this.mState.setMax()) {
                        return i;
                    }
                    return RecyclerView.this.mAdapterHelper.getMax(i);
                }
            }
            StringBuilder sb = new StringBuilder("invalid position ");
            sb.append(i);
            sb.append(". State item count is ");
            RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic2 = RecyclerView.this.mState;
            if (recyclerView$Mean$Arithmetic2.equals) {
                i2 = recyclerView$Mean$Arithmetic2.setMax - recyclerView$Mean$Arithmetic2.getMax;
            } else {
                i2 = recyclerView$Mean$Arithmetic2.setMin;
            }
            sb.append(i2);
            sb.append(RecyclerView.this.exceptionLabel());
            throw new IndexOutOfBoundsException(sb.toString());
        }

        /* access modifiers changed from: package-private */
        public final View getMax(int i) {
            return setMax(i, Long.MAX_VALUE).itemView;
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x0209  */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x0217  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01b2  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x01d6  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x01d9  */
        @androidx.annotation.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.recyclerview.widget.RecyclerView.valueOf setMax(int r18, long r19) {
            /*
                r17 = this;
                r6 = r17
                r3 = r18
                if (r3 < 0) goto L_0x023a
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic r0 = r0.mState
                boolean r1 = r0.equals
                if (r1 == 0) goto L_0x0014
                int r1 = r0.setMax
                int r0 = r0.getMax
                int r1 = r1 - r0
                goto L_0x0016
            L_0x0014:
                int r1 = r0.setMin
            L_0x0016:
                if (r3 < r1) goto L_0x001a
                goto L_0x023a
            L_0x001a:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic r0 = r0.mState
                boolean r0 = r0.setMax()
                r1 = 0
                r7 = 1
                r8 = 0
                if (r0 == 0) goto L_0x002f
                androidx.recyclerview.widget.RecyclerView$valueOf r0 = r17.length((int) r18)
                if (r0 == 0) goto L_0x0030
                r2 = 1
                goto L_0x0031
            L_0x002f:
                r0 = r1
            L_0x0030:
                r2 = 0
            L_0x0031:
                if (r0 != 0) goto L_0x0063
                androidx.recyclerview.widget.RecyclerView$valueOf r0 = r17.setMin((int) r18)
                if (r0 == 0) goto L_0x0063
                boolean r4 = r6.length((androidx.recyclerview.widget.RecyclerView.valueOf) r0)
                if (r4 != 0) goto L_0x0062
                r4 = 4
                r0.addFlags(r4)
                boolean r4 = r0.isScrap()
                if (r4 == 0) goto L_0x0054
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r5 = r0.itemView
                r4.removeDetachedView(r5, r8)
                r0.unScrap()
                goto L_0x005d
            L_0x0054:
                boolean r4 = r0.wasReturnedFromScrap()
                if (r4 == 0) goto L_0x005d
                r0.clearReturnedFromScrapFlag()
            L_0x005d:
                r6.setMin((androidx.recyclerview.widget.RecyclerView.valueOf) r0)
                r0 = r1
                goto L_0x0063
            L_0x0062:
                r2 = 1
            L_0x0063:
                if (r0 != 0) goto L_0x0191
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                o.setQwertyMode r4 = r4.mAdapterHelper
                int r4 = r4.getMax((int) r3)
                if (r4 < 0) goto L_0x0154
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.mAdapter
                int r5 = r5.getItemCount()
                if (r4 < r5) goto L_0x007b
                goto L_0x0154
            L_0x007b:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.mAdapter
                int r5 = r5.getItemViewType(r4)
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.mAdapter
                boolean r9 = r9.hasStableIds()
                if (r9 == 0) goto L_0x009e
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.mAdapter
                long r9 = r0.getItemId(r4)
                androidx.recyclerview.widget.RecyclerView$valueOf r0 = r6.length(r9, r5)
                if (r0 == 0) goto L_0x009e
                r0.mPosition = r4
                r2 = 1
            L_0x009e:
                if (r0 != 0) goto L_0x00ed
                androidx.recyclerview.widget.RecyclerView$Grayscale$Algorithm r4 = r6.isInside
                if (r4 == 0) goto L_0x00ed
                android.view.View r4 = r4.getMax()
                if (r4 == 0) goto L_0x00ed
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$valueOf r0 = r0.getChildViewHolder(r4)
                if (r0 == 0) goto L_0x00d3
                boolean r4 = r0.shouldIgnore()
                if (r4 != 0) goto L_0x00b9
                goto L_0x00ed
            L_0x00b9:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.<init>(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00d3:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.<init>(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ed:
                if (r0 != 0) goto L_0x010c
                androidx.recyclerview.widget.RecyclerView$FastBitmap$CoordinateSystem r0 = r6.toFloatRange
                if (r0 != 0) goto L_0x00fa
                androidx.recyclerview.widget.RecyclerView$FastBitmap$CoordinateSystem r0 = new androidx.recyclerview.widget.RecyclerView$FastBitmap$CoordinateSystem
                r0.<init>()
                r6.toFloatRange = r0
            L_0x00fa:
                androidx.recyclerview.widget.RecyclerView$FastBitmap$CoordinateSystem r0 = r6.toFloatRange
                androidx.recyclerview.widget.RecyclerView$valueOf r0 = r0.setMin((int) r5)
                if (r0 == 0) goto L_0x010c
                r0.resetInternal()
                boolean r4 = androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
                if (r4 == 0) goto L_0x010c
                r6.getMax((androidx.recyclerview.widget.RecyclerView.valueOf) r0)
            L_0x010c:
                if (r0 != 0) goto L_0x0191
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r15 = r0.getNanoTime()
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
                if (r0 == 0) goto L_0x012a
                androidx.recyclerview.widget.RecyclerView$FastBitmap$CoordinateSystem r9 = r6.toFloatRange
                r10 = r5
                r11 = r15
                r13 = r19
                boolean r0 = r9.length(r10, r11, r13)
                if (r0 != 0) goto L_0x012a
                return r1
            L_0x012a:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.mAdapter
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$valueOf r0 = r0.createViewHolder(r1, r5)
                boolean r1 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r1 == 0) goto L_0x0147
                android.view.View r1 = r0.itemView
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(r1)
                if (r1 == 0) goto L_0x0147
                java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
                r4.<init>(r1)
                r0.mNestedRecyclerView = r4
            L_0x0147:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                long r9 = r1.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$FastBitmap$CoordinateSystem r1 = r6.toFloatRange
                long r9 = r9 - r15
                r1.setMin(r5, r9)
                goto L_0x0191
            L_0x0154:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.<init>(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic r2 = r2.mState
                boolean r3 = r2.equals
                if (r3 == 0) goto L_0x017b
                int r3 = r2.setMax
                int r2 = r2.getMax
                int r3 = r3 - r2
                goto L_0x017d
            L_0x017b:
                int r3 = r2.setMin
            L_0x017d:
                r1.append(r3)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0191:
                r9 = r0
                r10 = r2
                if (r10 == 0) goto L_0x01c6
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic r0 = r0.mState
                boolean r0 = r0.setMax()
                if (r0 != 0) goto L_0x01c6
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L_0x01c6
                r9.setFlags(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic r0 = r0.mState
                boolean r0 = r0.IsOverlapping
                if (r0 == 0) goto L_0x01c6
                androidx.recyclerview.widget.RecyclerView.ItemAnimator.getMax(r9)
                r9.getUnmodifiedPayloads()
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$setMax r0 = new androidx.recyclerview.widget.RecyclerView$ItemAnimator$setMax
                r0.<init>()
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$setMax r0 = r0.setMin(r9)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.recordAnimationInfoIfBouncedHiddenView(r9, r0)
            L_0x01c6:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic r0 = r0.mState
                boolean r0 = r0.setMax()
                if (r0 == 0) goto L_0x01d9
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x01d9
                r9.mPreLayoutPosition = r3
                goto L_0x01ec
            L_0x01d9:
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x01ee
                boolean r0 = r9.needsUpdate()
                if (r0 != 0) goto L_0x01ee
                boolean r0 = r9.isInvalid()
                if (r0 == 0) goto L_0x01ec
                goto L_0x01ee
            L_0x01ec:
                r0 = 0
                goto L_0x0201
            L_0x01ee:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                o.setQwertyMode r0 = r0.mAdapterHelper
                int r2 = r0.getMax((int) r3)
                r0 = r17
                r1 = r9
                r3 = r18
                r4 = r19
                boolean r0 = r0.setMin(r1, r2, r3, r4)
            L_0x0201:
                android.view.View r1 = r9.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x0217
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x022f
            L_0x0217:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x022d
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x022f
            L_0x022d:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            L_0x022f:
                r1.mViewHolder = r9
                if (r10 == 0) goto L_0x0236
                if (r0 == 0) goto L_0x0236
                goto L_0x0237
            L_0x0236:
                r7 = 0
            L_0x0237:
                r1.mPendingInvalidate = r7
                return r9
            L_0x023a:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Invalid item position "
                r1.<init>(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic r2 = r2.mState
                boolean r3 = r2.equals
                if (r3 == 0) goto L_0x0261
                int r3 = r2.setMax
                int r2 = r2.getMax
                int r3 = r3 - r2
                goto L_0x0263
            L_0x0261:
                int r3 = r2.setMin
            L_0x0263:
                r1.append(r3)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.toDoubleRange.setMax(int, long):androidx.recyclerview.widget.RecyclerView$valueOf");
        }

        private void getMax(valueOf valueof) {
            if (valueof.itemView instanceof ViewGroup) {
                getMax((ViewGroup) valueof.itemView, false);
            }
        }

        private void getMax(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    getMax((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public final void length(@NonNull View view) {
            valueOf childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            setMin(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
                RecyclerView.this.mItemAnimator.getMin(childViewHolderInt);
            }
        }

        public final void length() {
            for (int size = this.getMax.size() - 1; size >= 0; size--) {
                getMax(this.getMax.get(size), true);
                this.getMax.remove(size);
            }
            this.getMax.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                findItemWithShortcutForKey.setMin setmin = RecyclerView.this.mPrefetchRegistry;
                if (setmin.getMin != null) {
                    Arrays.fill(setmin.getMin, -1);
                }
                setmin.length = 0;
            }
        }

        private void getMax() {
            getMax(this.getMax.get(0), true);
            this.getMax.remove(0);
        }

        /* access modifiers changed from: package-private */
        public final void setMin(valueOf valueof) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (valueof.isScrap() || valueof.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(valueof.isScrap());
                sb.append(" isAttached:");
                if (valueof.itemView.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            } else if (valueof.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(valueof);
                sb2.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb2.toString());
            } else if (!valueof.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = valueof.doesTransientStatePreventRecycling();
                if ((RecyclerView.this.mAdapter != null && doesTransientStatePreventRecycling && RecyclerView.this.mAdapter.onFailedToRecycleView(valueof)) || valueof.isRecyclable()) {
                    if (this.IsOverlapping <= 0 || valueof.hasAnyOfTheFlags(526)) {
                        z = false;
                    } else {
                        int size = this.getMax.size();
                        if (size >= this.IsOverlapping && size > 0) {
                            getMax();
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.setMin(valueof.mPosition)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.mPrefetchRegistry.setMin(this.getMax.get(i).mPosition)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.getMax.add(size, valueof);
                        z = true;
                    }
                    if (!z) {
                        getMax(valueof, true);
                        z2 = z;
                        RecyclerView.this.mViewInfoStore.getMax(valueof);
                        if (!z2 && !z3 && doesTransientStatePreventRecycling) {
                            valueof.mBindingAdapter = null;
                            valueof.mOwnerRecyclerView = null;
                            return;
                        }
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.mViewInfoStore.getMax(valueof);
                if (!z2) {
                }
            } else {
                StringBuilder sb3 = new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                sb3.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb3.toString());
            }
        }

        public final void getMax(@NonNull valueOf valueof, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(valueof);
            View view = valueof.itemView;
            if (RecyclerView.this.mAccessibilityDelegate != null) {
                setOnCancelListener itemDelegate = RecyclerView.this.mAccessibilityDelegate.getItemDelegate();
                ViewCompat.getMin(view, itemDelegate instanceof onItemActionRequestChanged.getMin ? ((onItemActionRequestChanged.getMin) itemDelegate).length.remove(view) : null);
            }
            if (z) {
                getMin(valueof);
            }
            valueof.mBindingAdapter = null;
            valueof.mOwnerRecyclerView = null;
            if (this.toFloatRange == null) {
                this.toFloatRange = new RecyclerView$FastBitmap$CoordinateSystem();
            }
            this.toFloatRange.setMin(valueof);
        }

        /* access modifiers changed from: package-private */
        public final void setMin(View view) {
            valueOf childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.setMin == null) {
                    this.setMin = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.setMin.add(childViewHolderInt);
            } else if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || RecyclerView.this.mAdapter.hasStableIds()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.getMin.add(childViewHolderInt);
            } else {
                StringBuilder sb = new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* access modifiers changed from: package-private */
        public final void setMax(valueOf valueof) {
            if (valueof.mInChangeScrap) {
                this.setMin.remove(valueof);
            } else {
                this.getMin.remove(valueof);
            }
            valueof.mScrapContainer = null;
            valueof.mInChangeScrap = false;
            valueof.clearReturnedFromScrapFlag();
        }

        private valueOf length(int i) {
            int size;
            int min;
            ArrayList<valueOf> arrayList = this.setMin;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    valueOf valueof = this.setMin.get(i3);
                    if (valueof.wasReturnedFromScrap() || valueof.getLayoutPosition() != i) {
                        i3++;
                    } else {
                        valueof.addFlags(32);
                        return valueof;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (min = RecyclerView.this.mAdapterHelper.getMin(i, 0)) > 0 && min < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(min);
                    while (i2 < size) {
                        valueOf valueof2 = this.setMin.get(i2);
                        if (valueof2.wasReturnedFromScrap() || valueof2.getItemId() != itemId) {
                            i2++;
                        } else {
                            valueof2.addFlags(32);
                            return valueof2;
                        }
                    }
                }
            }
            return null;
        }

        private valueOf setMin(int i) {
            View view;
            int size = this.getMin.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                valueOf valueof = this.getMin.get(i3);
                if (valueof.wasReturnedFromScrap() || valueof.getLayoutPosition() != i || valueof.isInvalid() || (!RecyclerView.this.mState.equals && valueof.isRemoved())) {
                    i3++;
                } else {
                    valueof.addFlags(32);
                    return valueof;
                }
            }
            isShortcutsVisible isshortcutsvisible = RecyclerView.this.mChildHelper;
            int size2 = isshortcutsvisible.setMin.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    view = null;
                    break;
                }
                view = isshortcutsvisible.setMin.get(i4);
                valueOf length2 = isshortcutsvisible.getMin.length(view);
                if (length2.getLayoutPosition() == i && !length2.isInvalid() && !length2.isRemoved()) {
                    break;
                }
                i4++;
            }
            if (view != null) {
                valueOf childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                isShortcutsVisible isshortcutsvisible2 = RecyclerView.this.mChildHelper;
                int max = isshortcutsvisible2.getMin.setMax(view);
                if (max < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(view)));
                } else if (isshortcutsvisible2.length.setMin(max)) {
                    isshortcutsvisible2.length.getMax(max);
                    isshortcutsvisible2.getMin(view);
                    int max2 = RecyclerView.this.mChildHelper.getMax(view);
                    if (max2 != -1) {
                        RecyclerView.this.mChildHelper.setMin(max2);
                        setMin(view);
                        childViewHolderInt.addFlags(8224);
                        return childViewHolderInt;
                    }
                    StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                    sb.append(childViewHolderInt);
                    sb.append(RecyclerView.this.exceptionLabel());
                    throw new IllegalStateException(sb.toString());
                } else {
                    throw new RuntimeException("trying to unhide a view that was not hidden".concat(String.valueOf(view)));
                }
            } else {
                int size3 = this.getMax.size();
                while (i2 < size3) {
                    valueOf valueof2 = this.getMax.get(i2);
                    if (valueof2.isInvalid() || valueof2.getLayoutPosition() != i || valueof2.isAttachedToTransitionOverlay()) {
                        i2++;
                    } else {
                        this.getMax.remove(i2);
                        return valueof2;
                    }
                }
                return null;
            }
        }

        private valueOf length(long j, int i) {
            for (int size = this.getMin.size() - 1; size >= 0; size--) {
                valueOf valueof = this.getMin.get(size);
                if (valueof.getItemId() == j && !valueof.wasReturnedFromScrap()) {
                    if (i == valueof.getItemViewType()) {
                        valueof.addFlags(32);
                        if (valueof.isRemoved() && !RecyclerView.this.mState.setMax()) {
                            valueof.setFlags(2, 14);
                        }
                        return valueof;
                    }
                    this.getMin.remove(size);
                    RecyclerView.this.removeDetachedView(valueof.itemView, false);
                    valueOf childViewHolderInt = RecyclerView.getChildViewHolderInt(valueof.itemView);
                    childViewHolderInt.mScrapContainer = null;
                    childViewHolderInt.mInChangeScrap = false;
                    childViewHolderInt.clearReturnedFromScrapFlag();
                    setMin(childViewHolderInt);
                }
            }
            int size2 = this.getMax.size() - 1;
            while (size2 >= 0) {
                valueOf valueof2 = this.getMax.get(size2);
                if (valueof2.getItemId() != j || valueof2.isAttachedToTransitionOverlay()) {
                    size2--;
                } else if (i == valueof2.getItemViewType()) {
                    this.getMax.remove(size2);
                    return valueof2;
                } else {
                    getMax(this.getMax.get(size2), true);
                    this.getMax.remove(size2);
                    return null;
                }
            }
            return null;
        }

        private void getMin(@NonNull valueOf valueof) {
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.this.mRecyclerListeners.get(i);
            }
            if (RecyclerView.this.mAdapter != null) {
                RecyclerView.this.mAdapter.onViewRecycled(valueof);
            }
            if (RecyclerView.this.mState != null) {
                RecyclerView.this.mViewInfoStore.getMax(valueof);
            }
        }

        @NonNull
        public final View setMax(int i) {
            return setMax(i, Long.MAX_VALUE).itemView;
        }
    }

    public static abstract class Adapter<VH extends valueOf> {
        private boolean mHasStableIds = false;
        private final setMax mObservable = new setMax();
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter<? extends valueOf> adapter, @NonNull valueOf valueof, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(@NonNull VH vh, int i);

        @NonNull
        public abstract VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull VH vh) {
        }

        public void onViewDetachedFromWindow(@NonNull VH vh) {
        }

        public void onViewRecycled(@NonNull VH vh) {
        }

        public void onBindViewHolder(@NonNull VH vh, int i, @NonNull List<Object> list) {
            onBindViewHolder(vh, i);
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i) {
            try {
                StyleableRes.setMax(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                StyleableRes.getMin();
            }
        }

        public final void bindViewHolder(@NonNull VH vh, int i) {
            boolean z = vh.mBindingAdapter == null;
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                StyleableRes.setMax(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).mInsetsDirty = true;
                }
                StyleableRes.getMin();
            }
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final boolean hasObservers() {
            return this.mObservable.setMax();
        }

        public void registerAdapterDataObserver(@NonNull setMin setmin) {
            this.mObservable.registerObserver(setmin);
        }

        public void unregisterAdapterDataObserver(@NonNull setMin setmin) {
            this.mObservable.unregisterObserver(setmin);
        }

        public final void notifyDataSetChanged() {
            this.mObservable.length();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.setMax(i, 1);
        }

        public final void notifyItemChanged(int i, @Nullable Object obj) {
            this.mObservable.getMax(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.setMax(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2, @Nullable Object obj) {
            this.mObservable.getMax(i, i2, obj);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.getMax(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.setMin(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.getMax(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.length(i, 1);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.length(i, i2);
        }

        public void setStateRestorationPolicy(@NonNull StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.getMax();
        }

        @NonNull
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        /* access modifiers changed from: package-private */
        public boolean canRestoreState() {
            int i = AnonymousClass7.getMin[this.mStateRestorationPolicy.ordinal()];
            return i != 1 && (i != 2 || getItemCount() > 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$7  reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] getMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy[] r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMin = r0
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMin     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AnonymousClass7.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildDetached(View view) {
        valueOf childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.mAdapter;
        if (!(adapter == null || childViewHolderInt == null)) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<isInside> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildAttached(View view) {
        valueOf childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        Adapter adapter = this.mAdapter;
        if (!(adapter == null || childViewHolderInt == null)) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        List<isInside> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).getMin(view);
            }
        }
    }

    public static abstract class IsOverlapping {
        boolean mAutoMeasure = false;
        isShortcutsVisible mChildHelper;
        private int mHeight;
        private int mHeightMode;
        ViewBoundsCheck mHorizontalBoundCheck = new ViewBoundsCheck(this.mHorizontalBoundCheckCallback);
        private final ViewBoundsCheck.getMin mHorizontalBoundCheckCallback = new ViewBoundsCheck.getMin() {
            public final View setMin(int i) {
                return IsOverlapping.this.getChildAt(i);
            }

            public final int getMax() {
                return IsOverlapping.this.getPaddingLeft();
            }

            public final int setMin() {
                return IsOverlapping.this.getWidth() - IsOverlapping.this.getPaddingRight();
            }

            public final int setMin(View view) {
                return IsOverlapping.this.getDecoratedLeft(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            public final int setMax(View view) {
                return IsOverlapping.this.getDecoratedRight(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }
        };
        boolean mIsAttachedToWindow = false;
        private boolean mItemPrefetchEnabled = true;
        private boolean mMeasurementCacheEnabled = true;
        public int mPrefetchMaxCountObserved;
        public boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations = false;
        @Nullable
        values mSmoothScroller;
        ViewBoundsCheck mVerticalBoundCheck = new ViewBoundsCheck(this.mVerticalBoundCheckCallback);
        private final ViewBoundsCheck.getMin mVerticalBoundCheckCallback = new ViewBoundsCheck.getMin() {
            public final View setMin(int i) {
                return IsOverlapping.this.getChildAt(i);
            }

            public final int getMax() {
                return IsOverlapping.this.getPaddingTop();
            }

            public final int setMin() {
                return IsOverlapping.this.getHeight() - IsOverlapping.this.getPaddingBottom();
            }

            public final int setMin(View view) {
                return IsOverlapping.this.getDecoratedTop(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            public final int setMax(View view) {
                return IsOverlapping.this.getDecoratedBottom(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }
        };
        private int mWidth;
        private int mWidthMode;

        public interface getMax {
            void length(int i, int i2);
        }

        public static class setMax {
            public int getMax;
            public boolean length;
            public int setMax;
            public boolean setMin;
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, getMax getmax) {
        }

        public void collectInitialPrefetchPositions(int i, getMax getmax) {
        }

        public int computeHorizontalScrollExtent(@NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            return 0;
        }

        public int computeHorizontalScrollOffset(@NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            return 0;
        }

        public int computeHorizontalScrollRange(@NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            return 0;
        }

        public int computeVerticalScrollExtent(@NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            return 0;
        }

        public int computeVerticalScrollOffset(@NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            return 0;
        }

        public int computeVerticalScrollRange(@NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            return 0;
        }

        public abstract LayoutParams generateDefaultLayoutParams();

        public int getBaseline() {
            return -1;
        }

        public int getColumnCountForAccessibility(@NonNull toDoubleRange todoublerange, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            return -1;
        }

        public int getRowCountForAccessibility(@NonNull toDoubleRange todoublerange, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            return -1;
        }

        public int getSelectionModeForAccessibility(@NonNull toDoubleRange todoublerange, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            return 0;
        }

        public boolean isLayoutHierarchical(@NonNull toDoubleRange todoublerange, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            return false;
        }

        public void onAdapterChanged(@Nullable Adapter adapter, @Nullable Adapter adapter2) {
        }

        public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        @CallSuper
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        @Nullable
        public View onFocusSearchFailed(@NonNull View view, int i, @NonNull toDoubleRange todoublerange, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            return null;
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull toDoubleRange todoublerange, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, @NonNull View view, @NonNull onSupportActionModeFinished onsupportactionmodefinished) {
        }

        @Nullable
        public View onInterceptFocusSearch(@NonNull View view, int i) {
            return null;
        }

        public void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        }

        public void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        public void onLayoutChildren(toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        }

        public void onLayoutCompleted(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Nullable
        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        public boolean performAccessibilityActionForItem(@NonNull toDoubleRange todoublerange, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, @NonNull View view, int i, @Nullable Bundle bundle) {
            return false;
        }

        public int scrollHorizontallyBy(int i, toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            return 0;
        }

        public void scrollToPosition(int i) {
        }

        public int scrollVerticallyBy(int i, toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldMeasureTwice() {
            return false;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, int i) {
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        /* access modifiers changed from: package-private */
        public void setMeasureSpecs(int i, int i2) {
            this.mWidth = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mHeightMode = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mHeight = 0;
            }
        }

        /* access modifiers changed from: package-private */
        public void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                if (rect.left < i5) {
                    i5 = rect.left;
                }
                if (rect.right > i3) {
                    i3 = rect.right;
                }
                if (rect.top < i6) {
                    i6 = rect.top;
                }
                if (rect.bottom > i4) {
                    i4 = rect.bottom;
                }
            }
            this.mRecyclerView.mTempRect.set(i5, i6, i3, i4);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i2, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.getMin();
                }
            }
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        /* access modifiers changed from: package-private */
        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        /* access modifiers changed from: package-private */
        public void dispatchDetachedFromWindow(RecyclerView recyclerView, toDoubleRange todoublerange) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, todoublerange);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                ViewCompat.getMax((View) recyclerView, runnable);
            }
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        @CallSuper
        public void onDetachedFromWindow(RecyclerView recyclerView, toDoubleRange todoublerange) {
            onDetachedFromWindow(recyclerView);
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void startSmoothScroll(values values) {
            values values2 = this.mSmoothScroller;
            if (!(values2 == null || values == values2 || !values2.isRunning())) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = values;
            values.start(this.mRecyclerView, this);
        }

        public boolean isSmoothScrolling() {
            values values = this.mSmoothScroller;
            return values != null && values.isRunning();
        }

        public int getLayoutDirection() {
            return ViewCompat.IsOverlapping(this.mRecyclerView);
        }

        public void endAnimation(View view) {
            if (this.mRecyclerView.mItemAnimator != null) {
                this.mRecyclerView.mItemAnimator.getMin(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addDisappearingView(View view, int i) {
            addViewInt(view, i, true);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void addView(View view, int i) {
            addViewInt(view, i, false);
        }

        private void addViewInt(View view, int i, boolean z) {
            valueOf childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.setMin(childViewHolderInt);
            } else {
                clearHeader.getMax getmax = this.mRecyclerView.mViewInfoStore.length.get(childViewHolderInt);
                if (getmax != null) {
                    getmax.getMin &= -2;
                }
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.setMax(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int max = this.mChildHelper.getMax(view);
                if (i == -1) {
                    isShortcutsVisible isshortcutsvisible = this.mChildHelper;
                    i = isshortcutsvisible.getMin.setMin() - isshortcutsvisible.setMin.size();
                }
                if (max == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.mRecyclerView.indexOfChild(view));
                    sb.append(this.mRecyclerView.exceptionLabel());
                    throw new IllegalStateException(sb.toString());
                } else if (max != i) {
                    this.mRecyclerView.mLayout.moveView(max, i);
                }
            } else {
                this.mChildHelper.getMax(view, i, false);
                layoutParams.mInsetsDirty = true;
                values values = this.mSmoothScroller;
                if (values != null && values.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (layoutParams.mPendingInvalidate) {
                childViewHolderInt.itemView.invalidate();
                layoutParams.mPendingInvalidate = false;
            }
        }

        public void removeView(View view) {
            isShortcutsVisible isshortcutsvisible = this.mChildHelper;
            int max = isshortcutsvisible.getMin.setMax(view);
            if (max >= 0) {
                if (isshortcutsvisible.length.setMax(max)) {
                    isshortcutsvisible.getMin(view);
                }
                isshortcutsvisible.getMin.length(max);
            }
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.mChildHelper.setMax(i);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.setMax(childCount);
            }
        }

        public int getPosition(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        }

        public int getItemViewType(@NonNull View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        @Nullable
        public View findContainingItemView(@NonNull View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.setMin(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        @Nullable
        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                valueOf childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.setMax() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public void detachView(@NonNull View view) {
            int max = this.mChildHelper.getMax(view);
            if (max >= 0) {
                detachViewInternal(max, view);
            }
        }

        public void detachViewAt(int i) {
            detachViewInternal(i, getChildAt(i));
        }

        private void detachViewInternal(int i, @NonNull View view) {
            isShortcutsVisible isshortcutsvisible = this.mChildHelper;
            int min = isshortcutsvisible.getMin(i);
            isshortcutsvisible.length.setMax(min);
            isshortcutsvisible.getMin.setMax(min);
        }

        public void attachView(@NonNull View view, int i, LayoutParams layoutParams) {
            valueOf childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.setMin(childViewHolderInt);
            } else {
                clearHeader.getMax getmax = this.mRecyclerView.mViewInfoStore.length.get(childViewHolderInt);
                if (getmax != null) {
                    getmax.getMin &= -2;
                }
            }
            this.mChildHelper.setMax(view, i, layoutParams, childViewHolderInt.isRemoved());
        }

        public void attachView(@NonNull View view, int i) {
            attachView(view, i, (LayoutParams) view.getLayoutParams());
        }

        public void attachView(@NonNull View view) {
            attachView(view, -1);
        }

        public void removeDetachedView(@NonNull View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                detachViewAt(i);
                attachView(childAt, i2);
                return;
            }
            StringBuilder sb = new StringBuilder("Cannot move a child from non-existing index:");
            sb.append(i);
            sb.append(this.mRecyclerView.toString());
            throw new IllegalArgumentException(sb.toString());
        }

        public void detachAndScrapView(@NonNull View view, @NonNull toDoubleRange todoublerange) {
            scrapOrRecycleView(todoublerange, this.mChildHelper.getMax(view), view);
        }

        public void detachAndScrapViewAt(int i, @NonNull toDoubleRange todoublerange) {
            scrapOrRecycleView(todoublerange, i, getChildAt(i));
        }

        public void removeAndRecycleView(@NonNull View view, @NonNull toDoubleRange todoublerange) {
            removeView(view);
            todoublerange.length(view);
        }

        public void removeAndRecycleViewAt(int i, @NonNull toDoubleRange todoublerange) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            todoublerange.length(childAt);
        }

        public int getChildCount() {
            isShortcutsVisible isshortcutsvisible = this.mChildHelper;
            if (isshortcutsvisible != null) {
                return isshortcutsvisible.getMin.setMin() - isshortcutsvisible.setMin.size();
            }
            return 0;
        }

        @Nullable
        public View getChildAt(int i) {
            isShortcutsVisible isshortcutsvisible = this.mChildHelper;
            if (isshortcutsvisible == null) {
                return null;
            }
            return isshortcutsvisible.getMin.getMax(isshortcutsvisible.getMin(i));
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        @Px
        public int getWidth() {
            return this.mWidth;
        }

        @Px
        public int getHeight() {
            return this.mHeight;
        }

        @Px
        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @Px
        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        @Px
        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @Px
        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @Px
        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return ViewCompat.toString(recyclerView);
            }
            return 0;
        }

        @Px
        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return ViewCompat.FastBitmap$CoordinateSystem(recyclerView);
            }
            return 0;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        @Nullable
        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.setMin(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public void offsetChildrenHorizontal(@Px int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(@Px int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public void ignoreView(@NonNull View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                StringBuilder sb = new StringBuilder("View should be fully attached to be ignored");
                sb.append(this.mRecyclerView.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            valueOf childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.getMax(childViewHolderInt);
        }

        public void stopIgnoringView(@NonNull View view) {
            valueOf childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void detachAndScrapAttachedViews(@NonNull toDoubleRange todoublerange) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(todoublerange, childCount, getChildAt(childCount));
            }
        }

        private void scrapOrRecycleView(toDoubleRange todoublerange, int i, View view) {
            valueOf childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || this.mRecyclerView.mAdapter.hasStableIds()) {
                    detachViewAt(i);
                    todoublerange.setMin(view);
                    clearHeader.getMax getmax = this.mRecyclerView.mViewInfoStore.length.get(childViewHolderInt);
                    if (getmax != null) {
                        getmax.getMin &= -2;
                        return;
                    }
                    return;
                }
                removeViewAt(i);
                todoublerange.setMin(childViewHolderInt);
            }
        }

        public void measureChild(@NonNull View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i3, layoutParams.width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i4, layoutParams.height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean shouldReMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            return !this.mMeasurementCacheEnabled || !isMeasurementUpToDate(view.getMeasuredWidth(), i, layoutParams.width) || !isMeasurementUpToDate(view.getMeasuredHeight(), i2, layoutParams.height);
        }

        /* access modifiers changed from: package-private */
        public boolean shouldMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            return view.isLayoutRequested() || !this.mMeasurementCacheEnabled || !isMeasurementUpToDate(view.getWidth(), i, layoutParams.width) || !isMeasurementUpToDate(view.getHeight(), i2, layoutParams.height);
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public void measureChildWithMargins(@NonNull View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin + i3, layoutParams.width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + layoutParams.topMargin + layoutParams.bottomMargin + i4, layoutParams.height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            if (r3 >= 0) goto L_0x0011;
         */
        @java.lang.Deprecated
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L_0x000f
                if (r3 < 0) goto L_0x000d
                goto L_0x0011
            L_0x000d:
                r3 = 0
                goto L_0x0021
            L_0x000f:
                if (r3 < 0) goto L_0x0014
            L_0x0011:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L_0x0021
            L_0x0014:
                r4 = -1
                if (r3 != r4) goto L_0x001b
                r2 = 1073741824(0x40000000, float:2.0)
            L_0x0019:
                r3 = r1
                goto L_0x0021
            L_0x001b:
                r4 = -2
                if (r3 != r4) goto L_0x000d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0019
            L_0x0021:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.IsOverlapping.getChildMeasureSpec(int, int, int, boolean):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 != 1073741824) goto L_0x0034;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001e
                if (r7 < 0) goto L_0x0011
                goto L_0x0020
            L_0x0011:
                if (r7 != r1) goto L_0x001a
                if (r5 == r2) goto L_0x0025
                if (r5 == 0) goto L_0x0034
                if (r5 == r3) goto L_0x0025
                goto L_0x0034
            L_0x001a:
                if (r7 != r0) goto L_0x0034
                r7 = 0
                goto L_0x002f
            L_0x001e:
                if (r7 < 0) goto L_0x0023
            L_0x0020:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0036
            L_0x0023:
                if (r7 != r1) goto L_0x0027
            L_0x0025:
                r7 = r4
                goto L_0x0036
            L_0x0027:
                if (r7 != r0) goto L_0x0034
                if (r5 == r2) goto L_0x0031
                if (r5 != r3) goto L_0x002e
                goto L_0x0031
            L_0x002e:
                r7 = r4
            L_0x002f:
                r5 = 0
                goto L_0x0036
            L_0x0031:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0025
            L_0x0034:
                r5 = 0
                r7 = 0
            L_0x0036:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.IsOverlapping.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public int getDecoratedMeasuredWidth(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedMeasuredHeight(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void layoutDecorated(@NonNull View view, int i, int i2, int i3, int i4) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@NonNull View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.mDecorInsets;
            view.layout(i + rect.left + layoutParams.leftMargin, i2 + rect.top + layoutParams.topMargin, (i3 - rect.right) - layoutParams.rightMargin, (i4 - rect.bottom) - layoutParams.bottomMargin);
        }

        public void getTransformedBoundingBox(@NonNull View view, boolean z, @NonNull Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.mRecyclerView == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(@NonNull View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedTop(@NonNull View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public int getDecoratedRight(@NonNull View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedBottom(@NonNull View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public int getTopDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.top;
        }

        public int getBottomDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.bottom;
        }

        public int getLeftDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.left;
        }

        public int getRightDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.right;
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width2 - width;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i = childRectangleOnScreenScrollAmount[0];
            int i2 = childRectangleOnScreenScrollAmount[1];
            if ((z2 && !isFocusedChildVisibleAfterScrolling(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        public boolean isViewPartiallyVisible(@NonNull View view, boolean z, boolean z2) {
            boolean z3 = this.mHorizontalBoundCheck.length(view) && this.mVerticalBoundCheck.length(view);
            if (z) {
                return z3;
            }
            return !z3;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            if (rect.left - i >= width || rect.right - i <= paddingLeft || rect.top - i2 >= height || rect.bottom - i2 <= paddingTop) {
                return false;
            }
            return true;
        }

        @Deprecated
        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, @Nullable View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, @NonNull View view, @Nullable View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, @Nullable Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public void onMeasure(@NonNull toDoubleRange todoublerange, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, int i, int i2) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        @Px
        public int getMinimumWidth() {
            return ViewCompat.invokeSuspend(this.mRecyclerView);
        }

        @Px
        public int getMinimumHeight() {
            return ViewCompat.valueOf(this.mRecyclerView);
        }

        /* access modifiers changed from: package-private */
        public void stopSmoothScroller() {
            values values = this.mSmoothScroller;
            if (values != null) {
                values.stop();
            }
        }

        /* access modifiers changed from: package-private */
        public void onSmoothScrollerStopped(values values) {
            if (this.mSmoothScroller == values) {
                this.mSmoothScroller = null;
            }
        }

        public void removeAndRecycleAllViews(@NonNull toDoubleRange todoublerange) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, todoublerange);
                }
            }
        }

        public void onInitializeAccessibilityNodeInfo(onSupportActionModeFinished onsupportactionmodefinished) {
            onInitializeAccessibilityNodeInfo(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, onsupportactionmodefinished);
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull toDoubleRange todoublerange, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, @NonNull onSupportActionModeFinished onsupportactionmodefinished) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                onsupportactionmodefinished.setMin(8192);
                onsupportactionmodefinished.values(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                onsupportactionmodefinished.setMin(4096);
                onsupportactionmodefinished.values(true);
            }
            onsupportactionmodefinished.getMin((Object) onSupportActionModeFinished.getMax.length(getRowCountForAccessibility(todoublerange, recyclerView$Mean$Arithmetic), getColumnCountForAccessibility(todoublerange, recyclerView$Mean$Arithmetic), isLayoutHierarchical(todoublerange, recyclerView$Mean$Arithmetic), getSelectionModeForAccessibility(todoublerange, recyclerView$Mean$Arithmetic)));
        }

        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            onInitializeAccessibilityEvent(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityEvent(@NonNull toDoubleRange todoublerange, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                if (this.mRecyclerView.mAdapter != null) {
                    accessibilityEvent.setItemCount(this.mRecyclerView.mAdapter.getItemCount());
                }
            }
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, onSupportActionModeFinished onsupportactionmodefinished) {
            valueOf childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && !this.mChildHelper.setMin(childViewHolderInt.itemView)) {
                onInitializeAccessibilityNodeInfoForItem(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, view, onsupportactionmodefinished);
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public boolean performAccessibilityAction(int i, @Nullable Bundle bundle) {
            return performAccessibilityAction(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, i, bundle);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean performAccessibilityAction(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.toDoubleRange r8, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic r9, int r10, @androidx.annotation.Nullable android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.mRecyclerView
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.getHeight()
                int r11 = r7.getPaddingTop()
                int r8 = r8 - r11
                int r11 = r7.getPaddingBottom()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.mRecyclerView
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.getWidth()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.getHeight()
                int r10 = r7.getPaddingTop()
                int r8 = r8 - r10
                int r10 = r7.getPaddingBottom()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.mRecyclerView
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.getWidth()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = 0
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.mRecyclerView
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.smoothScrollBy(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.IsOverlapping.performAccessibilityAction(androidx.recyclerview.widget.RecyclerView$toDoubleRange, androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic, int, android.os.Bundle):boolean");
        }

        public boolean performAccessibilityActionForItem(@NonNull View view, int i, @Nullable Bundle bundle) {
            return performAccessibilityActionForItem(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, view, i, bundle);
        }

        public static setMax getProperties(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
            setMax setmax = new setMax();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getOrdering.getMax.toIntRange, i, i2);
            setmax.setMax = obtainStyledAttributes.getInt(getOrdering.getMax.IsOverlapping, 1);
            setmax.getMax = obtainStyledAttributes.getInt(getOrdering.getMax.Grayscale$Algorithm, 1);
            setmax.setMin = obtainStyledAttributes.getBoolean(getOrdering.getMax.valueOf, false);
            setmax.length = obtainStyledAttributes.getBoolean(getOrdering.getMax.invoke, false);
            obtainStyledAttributes.recycle();
            return setmax;
        }

        /* access modifiers changed from: package-private */
        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* access modifiers changed from: package-private */
        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void removeAndRecycleScrapInt(toDoubleRange todoublerange) {
            int size = todoublerange.getMin.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = todoublerange.getMin.get(i).itemView;
                valueOf childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    if (this.mRecyclerView.mItemAnimator != null) {
                        this.mRecyclerView.mItemAnimator.getMin(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    valueOf childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    todoublerange.setMin(childViewHolderInt2);
                }
            }
            todoublerange.getMin.clear();
            if (todoublerange.setMin != null) {
                todoublerange.setMin.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }
    }

    public static abstract class getMax {
        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            onDrawOver(canvas, recyclerView);
        }

        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), recyclerView);
        }
    }

    public static abstract class valueOf {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        @NonNull
        public final View itemView;
        Adapter<? extends valueOf> mBindingAdapter;
        int mFlags;
        boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        long mItemId = -1;
        int mItemViewType = -1;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads = null;
        @VisibleForTesting
        int mPendingAccessibilityState = -1;
        public int mPosition = -1;
        int mPreLayoutPosition = -1;
        toDoubleRange mScrapContainer = null;
        valueOf mShadowedHolder = null;
        valueOf mShadowingHolder = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public valueOf(@NonNull View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* access modifiers changed from: package-private */
        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        /* access modifiers changed from: package-private */
        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).mInsetsDirty = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: package-private */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Nullable
        public final Adapter<? extends valueOf> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        /* access modifiers changed from: package-private */
        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        /* access modifiers changed from: package-private */
        public void unScrap() {
            this.mScrapContainer.setMax(this);
        }

        /* access modifiers changed from: package-private */
        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: package-private */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        /* access modifiers changed from: package-private */
        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        /* access modifiers changed from: package-private */
        public void setScrapContainer(toDoubleRange todoublerange, boolean z) {
            this.mScrapContainer = todoublerange;
            this.mInChangeScrap = z;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        /* access modifiers changed from: package-private */
        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (i2 ^ -1));
        }

        /* access modifiers changed from: package-private */
        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        /* access modifiers changed from: package-private */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        /* access modifiers changed from: package-private */
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        /* access modifiers changed from: package-private */
        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        /* access modifiers changed from: package-private */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = ViewCompat.isInside(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder();
            sb.append(simpleName);
            sb.append("{");
            sb.append(Integer.toHexString(hashCode()));
            sb.append(" position=");
            sb.append(this.mPosition);
            sb.append(" id=");
            sb.append(this.mItemId);
            sb.append(", oldPos=");
            sb.append(this.mOldPosition);
            sb.append(", pLpos:");
            sb.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder sb3 = new StringBuilder(" not recyclable(");
                sb3.append(this.mIsRecyclableCount);
                sb3.append(")");
                sb2.append(sb3.toString());
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
            } else if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && this.mIsRecyclableCount == 0) {
                this.mFlags &= -17;
            }
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !ViewCompat.getMax(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && ViewCompat.getMax(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public boolean setChildImportantForAccessibilityInternal(valueOf valueof, int i) {
        if (isComputingLayout()) {
            valueof.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(valueof);
            return false;
        }
        ViewCompat.setMin(valueof.itemView, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            valueOf valueof = this.mPendingAccessibilityImportanceChange.get(size);
            if (valueof.itemView.getParent() == this && !valueof.shouldIgnore() && (i = valueof.mPendingAccessibilityState) != -1) {
                ViewCompat.setMin(valueof.itemView, i);
                valueof.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    /* access modifiers changed from: package-private */
    public int getAdapterPositionInRecyclerView(valueOf valueof) {
        if (valueof.hasAnyOfTheFlags(524) || !valueof.isBound()) {
            return -1;
        }
        setQwertyMode setqwertymode = this.mAdapterHelper;
        int i = valueof.mPosition;
        int size = setqwertymode.length.size();
        for (int i2 = 0; i2 < size; i2++) {
            setQwertyMode.getMax getmax = setqwertymode.length.get(i2);
            int i3 = getmax.setMax;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        if (getmax.getMin == i) {
                            i = getmax.length;
                        } else {
                            if (getmax.getMin < i) {
                                i--;
                            }
                            if (getmax.length <= i) {
                                i++;
                            }
                        }
                    }
                } else if (getmax.getMin > i) {
                    continue;
                } else if (getmax.getMin + getmax.length > i) {
                    return -1;
                } else {
                    i -= getmax.length;
                }
            } else if (getmax.getMin <= i) {
                i += getmax.length;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            StringBuilder sb = new StringBuilder("Trying to set fast scroller without both required drawables.");
            sb.append(exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }
        Resources resources = getContext().getResources();
        new performItemAction(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(getOrdering.setMax.setMax), resources.getDimensionPixelSize(getOrdering.setMax.getMin), resources.getDimensionPixelOffset(getOrdering.setMax.length));
    }

    public void setNestedScrollingEnabled(boolean z) {
        setView scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.setMin) {
            ViewCompat.asBinder(scrollingChildHelper.setMax);
        }
        scrollingChildHelper.setMin = z;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().getMin();
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().getMin(i);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().setMin(i, i2);
    }

    public void stopNestedScroll() {
        setView scrollingChildHelper = getScrollingChildHelper();
        ViewParent min = scrollingChildHelper.setMin(0);
        if (min != null) {
            onDestroy.setMin(min, scrollingChildHelper.setMax, 0);
            scrollingChildHelper.setMin(0, (ViewParent) null);
        }
    }

    public void stopNestedScroll(int i) {
        setView scrollingChildHelper = getScrollingChildHelper();
        ViewParent min = scrollingChildHelper.setMin(i);
        if (min != null) {
            onDestroy.setMin(min, scrollingChildHelper.setMax, i);
            scrollingChildHelper.setMin(i, (ViewParent) null);
        }
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().setMin();
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().getMax(i);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().setMax(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().getMax(i, i2, i3, i4, iArr, i5);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, @NonNull int[] iArr2) {
        getScrollingChildHelper().length(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().getMax(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().length(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().getMin(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().length(f, f2);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        final Rect mDecorInsets = new Rect();
        boolean mInsetsDirty = true;
        boolean mPendingInvalidate = false;
        public valueOf mViewHolder;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public boolean viewNeedsUpdate() {
            return this.mViewHolder.needsUpdate();
        }

        public boolean isViewInvalid() {
            return this.mViewHolder.isInvalid();
        }

        public boolean isItemRemoved() {
            return this.mViewHolder.isRemoved();
        }

        public boolean isItemChanged() {
            return this.mViewHolder.isUpdated();
        }

        @Deprecated
        public int getViewPosition() {
            return this.mViewHolder.getPosition();
        }

        public int getViewLayoutPosition() {
            return this.mViewHolder.getLayoutPosition();
        }

        @Deprecated
        public int getViewAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }

        public int getAbsoluteAdapterPosition() {
            return this.mViewHolder.getAbsoluteAdapterPosition();
        }

        public int getBindingAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }
    }

    public static abstract class setMin {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i, int i2) {
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            onItemRangeChanged(i, i2);
        }
    }

    public static abstract class values {
        private IsOverlapping mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private final getMin mRecyclingAction = new getMin((byte) 0);
        private boolean mRunning;
        private boolean mStarted;
        private int mTargetPosition = -1;
        private View mTargetView;

        public interface length {
            @Nullable
            PointF computeScrollVectorForPosition(int i);
        }

        /* access modifiers changed from: protected */
        public abstract void onSeekTargetStep(@Px int i, @Px int i2, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, @NonNull getMin getmin);

        /* access modifiers changed from: protected */
        public abstract void onStart();

        /* access modifiers changed from: protected */
        public abstract void onStop();

        /* access modifiers changed from: protected */
        public abstract void onTargetFound(@NonNull View view, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, @NonNull getMin getmin);

        /* access modifiers changed from: package-private */
        public void start(RecyclerView recyclerView, IsOverlapping isOverlapping) {
            invoke invoke = recyclerView.mViewFlinger;
            RecyclerView.this.removeCallbacks(invoke);
            invoke.length.abortAnimation();
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = isOverlapping;
            if (this.mTargetPosition != -1) {
                recyclerView.mState.getMin = this.mTargetPosition;
                this.mRunning = true;
                this.mPendingInitialRun = true;
                this.mTargetView = findViewByPosition(getTargetPosition());
                onStart();
                invoke invoke2 = this.mRecyclerView.mViewFlinger;
                if (invoke2.getMax) {
                    invoke2.isInside = true;
                } else {
                    RecyclerView.this.removeCallbacks(invoke2);
                    ViewCompat.getMax((View) RecyclerView.this, (Runnable) invoke2);
                }
                this.mStarted = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        @Nullable
        public PointF computeScrollVectorForPosition(int i) {
            IsOverlapping layoutManager = getLayoutManager();
            if (layoutManager instanceof length) {
                return ((length) layoutManager).computeScrollVectorForPosition(i);
            }
            Class<length> cls = length.class;
            return null;
        }

        @Nullable
        public IsOverlapping getLayoutManager() {
            return this.mLayoutManager;
        }

        /* access modifiers changed from: protected */
        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.getMin = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        /* access modifiers changed from: package-private */
        public void onAnimation(int i, int i2) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (!(!this.mPendingInitialRun || this.mTargetView != null || this.mLayoutManager == null || (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) == null || (computeScrollVectorForPosition.x == 0.0f && computeScrollVectorForPosition.y == 0.0f))) {
                recyclerView.scrollStep((int) Math.signum(computeScrollVectorForPosition.x), (int) Math.signum(computeScrollVectorForPosition.y), (int[]) null);
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.setMin(recyclerView);
                    stop();
                } else {
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                boolean min = this.mRecyclingAction.getMin();
                this.mRecyclingAction.setMin(recyclerView);
                if (min && this.mRunning) {
                    this.mPendingInitialRun = true;
                    invoke invoke = recyclerView.mViewFlinger;
                    if (invoke.getMax) {
                        invoke.isInside = true;
                        return;
                    }
                    RecyclerView.this.removeCallbacks(invoke);
                    ViewCompat.getMax((View) RecyclerView.this, (Runnable) invoke);
                }
            }
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.findViewByPosition(i);
        }

        @Deprecated
        public void instantScrollToPosition(int i) {
            this.mRecyclerView.scrollToPosition(i);
        }

        /* access modifiers changed from: protected */
        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        /* access modifiers changed from: protected */
        public void normalize(@NonNull PointF pointF) {
            float sqrt = (float) Math.sqrt((double) ((pointF.x * pointF.x) + (pointF.y * pointF.y)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public static class getMin {
            public boolean IsOverlapping;
            public int getMax;
            public int getMin;
            public int length;
            public int setMax;
            public Interpolator setMin;
            private int toIntRange;

            public getMin(byte b) {
                this();
            }

            private getMin() {
                this.length = -1;
                this.IsOverlapping = false;
                this.toIntRange = 0;
                this.setMax = 0;
                this.getMin = 0;
                this.getMax = Integer.MIN_VALUE;
                this.setMin = null;
            }

            /* access modifiers changed from: package-private */
            public final boolean getMin() {
                return this.length >= 0;
            }

            /* access modifiers changed from: package-private */
            public final void setMin(RecyclerView recyclerView) {
                int i = this.length;
                if (i >= 0) {
                    this.length = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.IsOverlapping = false;
                } else if (this.IsOverlapping) {
                    getMax();
                    recyclerView.mViewFlinger.getMin(this.setMax, this.getMin, this.getMax, this.setMin);
                    this.toIntRange++;
                    this.IsOverlapping = false;
                } else {
                    this.toIntRange = 0;
                }
            }

            private void getMax() {
                if (this.setMin != null && this.getMax <= 0) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.getMax <= 0) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }
        }
    }

    static class setMax extends Observable<setMin> {
        setMax() {
        }

        public final boolean setMax() {
            return !this.mObservers.isEmpty();
        }

        public final void length() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((setMin) this.mObservers.get(size)).onChanged();
            }
        }

        public final void getMax() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((setMin) this.mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }

        public final void setMax(int i, int i2) {
            getMax(i, i2, (Object) null);
        }

        public final void getMax(int i, int i2, @Nullable Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((setMin) this.mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        public final void getMax(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((setMin) this.mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        public final void length(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((setMin) this.mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }

        public final void setMin(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((setMin) this.mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        };
        Parcelable setMin;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.setMin = parcel.readParcelable(classLoader == null ? IsOverlapping.class.getClassLoader() : classLoader);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.setMin, 0);
        }
    }

    class getMin implements ItemAnimator.length {
        getMin() {
        }

        public final void length(valueOf valueof) {
            valueof.setIsRecyclable(true);
            if (valueof.mShadowedHolder != null && valueof.mShadowingHolder == null) {
                valueof.mShadowedHolder = null;
            }
            valueof.mShadowingHolder = null;
            if (!valueof.shouldBeKeptAsChild() && !RecyclerView.this.removeAnimatingView(valueof.itemView) && valueof.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(valueof.itemView, false);
            }
        }
    }

    public static abstract class ItemAnimator {
        public long IsOverlapping = 250;
        private ArrayList<Object> getMax = new ArrayList<>();
        private long length = 120;
        public long toDoubleRange = 250;
        public length toFloatRange = null;
        public long toIntRange = 120;

        @Retention(RetentionPolicy.SOURCE)
        public @interface AdapterChanges {
        }

        public interface length {
            void length(@NonNull valueOf valueof);
        }

        public abstract void getMax();

        public abstract void getMin(@NonNull valueOf valueof);

        public abstract boolean getMin(@NonNull valueOf valueof, @NonNull setMax setmax, @Nullable setMax setmax2);

        public abstract void length();

        public abstract boolean setMax();

        public boolean setMax(@NonNull valueOf valueof) {
            return true;
        }

        public abstract boolean setMax(@NonNull valueOf valueof, @NonNull setMax setmax, @NonNull setMax setmax2);

        public abstract boolean setMin(@NonNull valueOf valueof, @Nullable setMax setmax, @NonNull setMax setmax2);

        public abstract boolean setMin(@NonNull valueOf valueof, @NonNull valueOf valueof2, @NonNull setMax setmax, @NonNull setMax setmax2);

        public final long getMin() {
            return this.length;
        }

        static int getMax(valueOf valueof) {
            int i = valueof.mFlags & 14;
            if (valueof.isInvalid()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int oldPosition = valueof.getOldPosition();
            int absoluteAdapterPosition = valueof.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i : i | 2048;
        }

        public boolean getMin(@NonNull valueOf valueof, @NonNull List<Object> list) {
            return setMax(valueof);
        }

        public final void setMin() {
            int size = this.getMax.size();
            for (int i = 0; i < size; i++) {
                this.getMax.get(i);
            }
            this.getMax.clear();
        }

        @NonNull
        public static setMax toFloatRange() {
            return new setMax();
        }

        public static class setMax {
            public int getMax;
            public int getMin;
            public int length;
            public int setMax;

            @NonNull
            public final setMax setMin(@NonNull valueOf valueof) {
                View view = valueof.itemView;
                this.getMin = view.getLeft();
                this.setMax = view.getTop();
                this.getMax = view.getRight();
                this.length = view.getBottom();
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        length length2 = this.mChildDrawingOrderCallback;
        if (length2 == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return length2.getMax(i, i2);
    }

    private setView getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new setView(this);
        }
        return this.mScrollingChildHelper;
    }
}
