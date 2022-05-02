package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import o.ITrustedWebActivityCallback;
import o.getQueue;
import o.onRepeatModeChanged;
import o.onShuffleModeChanged;
import o.onSupportActionModeFinished;
import o.prepareFromUri;
import o.setNeutralButtonIcon;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActivityChooserView extends ViewGroup {
    private final int IsOverlapping;
    private ListPopupWindow equals;
    private final View getMax;
    private final Drawable getMin;
    private int isInside;
    private final ImageView length;
    final setMax mAdapter;
    final FrameLayout mDefaultActivityButton;
    final FrameLayout mExpandActivityOverflowButton;
    int mInitialActivityCount;
    boolean mIsSelectingDefaultActivity;
    final DataSetObserver mModelDataSetObserver;
    PopupWindow.OnDismissListener mOnDismissListener;
    setNeutralButtonIcon mProvider;
    private final ImageView setMax;
    private final length setMin;
    private final ViewTreeObserver.OnGlobalLayoutListener toFloatRange;
    private boolean toIntRange;

    public ActivityChooserView(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mModelDataSetObserver = new DataSetObserver() {
            public final void onChanged() {
                super.onChanged();
                ActivityChooserView.this.mAdapter.notifyDataSetChanged();
            }

            public final void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.mAdapter.notifyDataSetInvalidated();
            }
        };
        this.toFloatRange = new ViewTreeObserver.OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (!ActivityChooserView.this.isShowingPopup()) {
                    return;
                }
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().length();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().b_();
                if (ActivityChooserView.this.mProvider != null) {
                    ActivityChooserView.this.mProvider.getMax(true);
                }
            }
        };
        this.mInitialActivityCount = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ITrustedWebActivityCallback.Stub.toIntRange.asBinder, i, 0);
        ViewCompat.getMax(this, context, ITrustedWebActivityCallback.Stub.toIntRange.asBinder, attributeSet, obtainStyledAttributes, i, 0);
        this.mInitialActivityCount = obtainStyledAttributes.getInt(ITrustedWebActivityCallback.Stub.toIntRange.asInterface, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(ITrustedWebActivityCallback.Stub.toIntRange.ICustomTabsCallback$Stub);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(ITrustedWebActivityCallback.Stub.equals.length, this, true);
        this.setMin = new length();
        View findViewById = findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.IsOverlapping);
        this.getMax = findViewById;
        this.getMin = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.invoke);
        this.mDefaultActivityButton = frameLayout;
        frameLayout.setOnClickListener(this.setMin);
        this.mDefaultActivityButton.setOnLongClickListener(this.setMin);
        this.length = (ImageView) this.mDefaultActivityButton.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.create);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.Grayscale$Algorithm);
        frameLayout2.setOnClickListener(this.setMin);
        frameLayout2.setAccessibilityDelegate(new View.AccessibilityDelegate() {
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                onSupportActionModeFinished.getMin(accessibilityNodeInfo).hashCode(true);
            }
        });
        frameLayout2.setOnTouchListener(new getQueue(frameLayout2) {
            public final onRepeatModeChanged length() {
                return ActivityChooserView.this.getListPopupWindow();
            }

            public final boolean getMax() {
                ActivityChooserView.this.showPopup();
                return true;
            }

            public final boolean setMin() {
                ActivityChooserView.this.dismissPopup();
                return true;
            }
        });
        this.mExpandActivityOverflowButton = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.create);
        this.setMax = imageView;
        imageView.setImageDrawable(drawable);
        setMax setmax = new setMax();
        this.mAdapter = setmax;
        setmax.registerDataSetObserver(new DataSetObserver() {
            public final void onChanged() {
                super.onChanged();
                ActivityChooserView.this.updateAppearance();
            }
        });
        Resources resources = context.getResources();
        this.IsOverlapping = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(ITrustedWebActivityCallback.Stub.getMax.getMin));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setActivityChooserModel(onShuffleModeChanged onshufflemodechanged) {
        setMax setmax = this.mAdapter;
        onShuffleModeChanged onshufflemodechanged2 = ActivityChooserView.this.mAdapter.setMax;
        if (onshufflemodechanged2 != null && ActivityChooserView.this.isShown()) {
            onshufflemodechanged2.unregisterObserver(ActivityChooserView.this.mModelDataSetObserver);
        }
        setmax.setMax = onshufflemodechanged;
        if (onshufflemodechanged != null && ActivityChooserView.this.isShown()) {
            onshufflemodechanged.registerObserver(ActivityChooserView.this.mModelDataSetObserver);
        }
        setmax.notifyDataSetChanged();
        if (isShowingPopup()) {
            dismissPopup();
            showPopup();
        }
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.setMax.setImageDrawable(drawable);
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.setMax.setContentDescription(getContext().getString(i));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setProvider(setNeutralButtonIcon setneutralbuttonicon) {
        this.mProvider = setneutralbuttonicon;
    }

    public boolean showPopup() {
        if (isShowingPopup() || !this.toIntRange) {
            return false;
        }
        this.mIsSelectingDefaultActivity = false;
        showPopupUnchecked(this.mInitialActivityCount);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void showPopupUnchecked(int i) {
        if (this.mAdapter.setMax != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.toFloatRange);
            boolean z = this.mDefaultActivityButton.getVisibility() == 0;
            int length2 = this.mAdapter.setMax.length();
            if (i == Integer.MAX_VALUE || length2 <= i + (z ? 1 : 0)) {
                setMax setmax = this.mAdapter;
                if (setmax.getMax) {
                    setmax.getMax = false;
                    setmax.notifyDataSetChanged();
                }
                setMax setmax2 = this.mAdapter;
                if (setmax2.setMin != i) {
                    setmax2.setMin = i;
                    setmax2.notifyDataSetChanged();
                }
            } else {
                setMax setmax3 = this.mAdapter;
                if (!setmax3.getMax) {
                    setmax3.getMax = true;
                    setmax3.notifyDataSetChanged();
                }
                setMax setmax4 = this.mAdapter;
                int i2 = i - 1;
                if (setmax4.setMin != i2) {
                    setmax4.setMin = i2;
                    setmax4.notifyDataSetChanged();
                }
            }
            ListPopupWindow listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.getMin()) {
                if (this.mIsSelectingDefaultActivity || !z) {
                    setMax setmax5 = this.mAdapter;
                    if (!(setmax5.getMin && setmax5.length == z)) {
                        setmax5.getMin = true;
                        setmax5.length = z;
                        setmax5.notifyDataSetChanged();
                    }
                } else {
                    setMax setmax6 = this.mAdapter;
                    if (setmax6.getMin || setmax6.length) {
                        setmax6.getMin = false;
                        setmax6.length = false;
                        setmax6.notifyDataSetChanged();
                    }
                }
                listPopupWindow.equals(Math.min(this.mAdapter.setMin(), this.IsOverlapping));
                listPopupWindow.b_();
                setNeutralButtonIcon setneutralbuttonicon = this.mProvider;
                if (setneutralbuttonicon != null) {
                    setneutralbuttonicon.getMax(true);
                }
                listPopupWindow.c_().setContentDescription(getContext().getString(ITrustedWebActivityCallback.Stub.IsOverlapping.setMin));
                listPopupWindow.c_().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    public boolean dismissPopup() {
        if (!isShowingPopup()) {
            return true;
        }
        getListPopupWindow().length();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.toFloatRange);
        return true;
    }

    public boolean isShowingPopup() {
        return getListPopupWindow().getMin();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        onShuffleModeChanged onshufflemodechanged = this.mAdapter.setMax;
        if (onshufflemodechanged != null) {
            onshufflemodechanged.registerObserver(this.mModelDataSetObserver);
        }
        this.toIntRange = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onShuffleModeChanged onshufflemodechanged = this.mAdapter.setMax;
        if (onshufflemodechanged != null) {
            onshufflemodechanged.unregisterObserver(this.mModelDataSetObserver);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.toFloatRange);
        }
        if (isShowingPopup()) {
            dismissPopup();
        }
        this.toIntRange = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view = this.getMax;
        if (this.mDefaultActivityButton.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.getMax.layout(0, 0, i3 - i, i4 - i2);
        if (!isShowingPopup()) {
            dismissPopup();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public onShuffleModeChanged getDataModel() {
        return this.mAdapter.setMax;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setInitialActivityCount(int i) {
        this.mInitialActivityCount = i;
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.isInside = i;
    }

    /* access modifiers changed from: package-private */
    public ListPopupWindow getListPopupWindow() {
        if (this.equals == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.equals = listPopupWindow;
            listPopupWindow.setMax((ListAdapter) this.mAdapter);
            this.equals.setMax((View) this);
            this.equals.setMin(true);
            this.equals.setMax((AdapterView.OnItemClickListener) this.setMin);
            this.equals.length((PopupWindow.OnDismissListener) this.setMin);
        }
        return this.equals;
    }

    /* access modifiers changed from: package-private */
    public void updateAppearance() {
        if (this.mAdapter.getCount() > 0) {
            this.mExpandActivityOverflowButton.setEnabled(true);
        } else {
            this.mExpandActivityOverflowButton.setEnabled(false);
        }
        int length2 = this.mAdapter.setMax.length();
        int max = this.mAdapter.setMax.setMax();
        if (length2 == 1 || (length2 > 1 && max > 0)) {
            this.mDefaultActivityButton.setVisibility(0);
            ResolveInfo max2 = this.mAdapter.setMax.getMax();
            PackageManager packageManager = getContext().getPackageManager();
            this.length.setImageDrawable(max2.loadIcon(packageManager));
            if (this.isInside != 0) {
                CharSequence loadLabel = max2.loadLabel(packageManager);
                this.mDefaultActivityButton.setContentDescription(getContext().getString(this.isInside, new Object[]{loadLabel}));
            }
        } else {
            this.mDefaultActivityButton.setVisibility(8);
        }
        if (this.mDefaultActivityButton.getVisibility() == 0) {
            this.getMax.setBackgroundDrawable(this.getMin);
        } else {
            this.getMax.setBackgroundDrawable((Drawable) null);
        }
    }

    class length implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        length() {
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((setMax) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                ActivityChooserView.this.dismissPopup();
                if (!ActivityChooserView.this.mIsSelectingDefaultActivity) {
                    if (!ActivityChooserView.this.mAdapter.getMax()) {
                        i++;
                    }
                    Intent length = ActivityChooserView.this.mAdapter.setMax.length(i);
                    if (length != null) {
                        length.addFlags(524288);
                        ActivityChooserView.this.getContext().startActivity(length);
                    }
                } else if (i > 0) {
                    onShuffleModeChanged onshufflemodechanged = ActivityChooserView.this.mAdapter.setMax;
                    synchronized (onshufflemodechanged.getMin) {
                        boolean min = onshufflemodechanged.setMin() | onshufflemodechanged.isInside();
                        onshufflemodechanged.toFloatRange();
                        if (min) {
                            onshufflemodechanged.getMin();
                            onshufflemodechanged.notifyChanged();
                        }
                        onShuffleModeChanged.setMax setmax = onshufflemodechanged.setMax.get(i);
                        onShuffleModeChanged.setMax setmax2 = onshufflemodechanged.setMax.get(0);
                        onshufflemodechanged.getMin(new onShuffleModeChanged.length(new ComponentName(setmax.setMin.activityInfo.packageName, setmax.setMin.activityInfo.name), System.currentTimeMillis(), setmax2 != null ? (setmax2.setMax - setmax.setMax) + 5.0f : 1.0f));
                    }
                }
            } else if (itemViewType == 1) {
                ActivityChooserView.this.showPopupUnchecked(Integer.MAX_VALUE);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final void onClick(View view) {
            if (view == ActivityChooserView.this.mDefaultActivityButton) {
                ActivityChooserView.this.dismissPopup();
                Intent length = ActivityChooserView.this.mAdapter.setMax.length(ActivityChooserView.this.mAdapter.setMax.getMax(ActivityChooserView.this.mAdapter.setMax.getMax()));
                if (length != null) {
                    length.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(length);
                }
            } else if (view == ActivityChooserView.this.mExpandActivityOverflowButton) {
                ActivityChooserView.this.mIsSelectingDefaultActivity = false;
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                activityChooserView.showPopupUnchecked(activityChooserView.mInitialActivityCount);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final boolean onLongClick(View view) {
            if (view == ActivityChooserView.this.mDefaultActivityButton) {
                if (ActivityChooserView.this.mAdapter.getCount() > 0) {
                    ActivityChooserView.this.mIsSelectingDefaultActivity = true;
                    ActivityChooserView activityChooserView = ActivityChooserView.this;
                    activityChooserView.showPopupUnchecked(activityChooserView.mInitialActivityCount);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }

        public final void onDismiss() {
            if (ActivityChooserView.this.mOnDismissListener != null) {
                ActivityChooserView.this.mOnDismissListener.onDismiss();
            }
            if (ActivityChooserView.this.mProvider != null) {
                ActivityChooserView.this.mProvider.getMax(false);
            }
        }
    }

    class setMax extends BaseAdapter {
        boolean getMax;
        boolean getMin;
        boolean length;
        onShuffleModeChanged setMax;
        int setMin = 4;

        public long getItemId(int i) {
            return (long) i;
        }

        public int getViewTypeCount() {
            return 3;
        }

        setMax() {
        }

        public int getItemViewType(int i) {
            return (!this.getMax || i != getCount() - 1) ? 0 : 1;
        }

        public int getCount() {
            int length2 = this.setMax.length();
            if (!this.getMin && this.setMax.getMax() != null) {
                length2--;
            }
            int min = Math.min(length2, this.setMin);
            return this.getMax ? min + 1 : min;
        }

        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (!this.getMin && this.setMax.getMax() != null) {
                    i++;
                }
                return this.setMax.setMin(i);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != ITrustedWebActivityCallback.Stub.toFloatRange.b) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(ITrustedWebActivityCallback.Stub.equals.isInside, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.getCause)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.newSession)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.getMin || i != 0 || !this.length) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(ITrustedWebActivityCallback.Stub.equals.isInside, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.newSession)).setText(ActivityChooserView.this.getContext().getString(ITrustedWebActivityCallback.Stub.IsOverlapping.length));
                return inflate;
            }
        }

        public final int setMin() {
            int i = this.setMin;
            this.setMin = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, (ViewGroup) null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.setMin = i;
            return i2;
        }

        public final boolean getMax() {
            return this.getMin;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class InnerLayout extends LinearLayout {
        private static final int[] length = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            prepareFromUri min = prepareFromUri.setMin(context, attributeSet, length);
            setBackgroundDrawable(min.setMax(0));
            min.setMin.recycle();
        }
    }
}
