package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import o.ITrustedWebActivityCallback;
import o.MediaBrowserCompat$CustomActionResultReceiver;
import o.prepareFromUri;
import o.removeQueueItemAt;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final Interpolator equals = new DecelerateInterpolator();
    private getMax getMax;
    private boolean getMin;
    private int length;
    int mMaxTabWidth;
    int mStackedTabMaxWidth;
    LinearLayoutCompat mTabLayout;
    Runnable mTabSelector;
    protected final setMin mVisAnimListener = new setMin();
    protected ViewPropertyAnimator mVisibilityAnim;
    private Spinner setMax;
    private int setMin;

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public ScrollingTabContainerView(@NonNull Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        MediaBrowserCompat$CustomActionResultReceiver mediaBrowserCompat$CustomActionResultReceiver = new MediaBrowserCompat$CustomActionResultReceiver(context);
        setContentHeight(mediaBrowserCompat$CustomActionResultReceiver.length());
        this.mStackedTabMaxWidth = mediaBrowserCompat$CustomActionResultReceiver.getMin.getResources().getDimensionPixelSize(ITrustedWebActivityCallback.Stub.getMax.setMin);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), (AttributeSet) null, ITrustedWebActivityCallback.Stub.getMin.length);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        this.mTabLayout = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.mTabLayout.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.mMaxTabWidth = -1;
        } else {
            if (childCount > 2) {
                this.mMaxTabWidth = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.mMaxTabWidth = View.MeasureSpec.getSize(i) / 2;
            }
            this.mMaxTabWidth = Math.min(this.mMaxTabWidth, this.mStackedTabMaxWidth);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.setMin, 1073741824);
        if (z2 || !this.getMin) {
            z = false;
        }
        if (z) {
            this.mTabLayout.measure(0, makeMeasureSpec);
            if (this.mTabLayout.getMeasuredWidth() <= View.MeasureSpec.getSize(i)) {
                getMax();
            } else if (!length()) {
                if (this.setMax == null) {
                    AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, ITrustedWebActivityCallback.Stub.getMin.toIntRange);
                    appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
                    appCompatSpinner.setOnItemSelectedListener(this);
                    this.setMax = appCompatSpinner;
                }
                removeView(this.mTabLayout);
                addView(this.setMax, new ViewGroup.LayoutParams(-2, -1));
                if (this.setMax.getAdapter() == null) {
                    this.setMax.setAdapter(new length());
                }
                Runnable runnable = this.mTabSelector;
                if (runnable != null) {
                    removeCallbacks(runnable);
                    this.mTabSelector = null;
                }
                this.setMax.setSelection(this.length);
            }
        } else {
            getMax();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.length);
        }
    }

    private boolean length() {
        Spinner spinner = this.setMax;
        return spinner != null && spinner.getParent() == this;
    }

    public void setAllowCollapse(boolean z) {
        this.getMin = z;
    }

    private boolean getMax() {
        if (!length()) {
            return false;
        }
        removeView(this.setMax);
        addView(this.mTabLayout, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.setMax.getSelectedItemPosition());
        return false;
    }

    public void setTabSelected(int i) {
        this.length = i;
        int childCount = this.mTabLayout.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.mTabLayout.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                animateToTab(i);
            }
            i2++;
        }
        Spinner spinner = this.setMax;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    public void setContentHeight(int i) {
        this.setMin = i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MediaBrowserCompat$CustomActionResultReceiver mediaBrowserCompat$CustomActionResultReceiver = new MediaBrowserCompat$CustomActionResultReceiver(getContext());
        setContentHeight(mediaBrowserCompat$CustomActionResultReceiver.length());
        this.mStackedTabMaxWidth = mediaBrowserCompat$CustomActionResultReceiver.getMin.getResources().getDimensionPixelSize(ITrustedWebActivityCallback.Stub.getMax.setMin);
    }

    public void animateToVisibility(int i) {
        ViewPropertyAnimator viewPropertyAnimator = this.mVisibilityAnim;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ViewPropertyAnimator alpha = animate().alpha(1.0f);
            alpha.setDuration(200);
            alpha.setInterpolator(equals);
            alpha.setListener(this.mVisAnimListener.setMax(alpha, i));
            alpha.start();
            return;
        }
        ViewPropertyAnimator alpha2 = animate().alpha(0.0f);
        alpha2.setDuration(200);
        alpha2.setInterpolator(equals);
        alpha2.setListener(this.mVisAnimListener.setMax(alpha2, i));
        alpha2.start();
    }

    public void animateToTab(int i) {
        final View childAt = this.mTabLayout.getChildAt(i);
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        AnonymousClass2 r0 = new Runnable() {
            public final void run() {
                ScrollingTabContainerView.this.smoothScrollTo(childAt.getLeft() - ((ScrollingTabContainerView.this.getWidth() - childAt.getWidth()) / 2), 0);
                ScrollingTabContainerView.this.mTabSelector = null;
            }
        };
        this.mTabSelector = r0;
        post(r0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    public setMax createTabView(ActionBar.getMin getmin, boolean z) {
        setMax setmax = new setMax(getContext(), getmin, z);
        if (z) {
            setmax.setBackgroundDrawable((Drawable) null);
            setmax.setLayoutParams(new AbsListView.LayoutParams(-1, this.setMin));
        } else {
            setmax.setFocusable(true);
            if (this.getMax == null) {
                this.getMax = new getMax();
            }
            setmax.setOnClickListener(this.getMax);
        }
        return setmax;
    }

    public void addTab(ActionBar.getMin getmin, boolean z) {
        setMax createTabView = createTabView(getmin, false);
        this.mTabLayout.addView(createTabView, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.setMax;
        if (spinner != null) {
            ((length) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            createTabView.setSelected(true);
        }
        if (this.getMin) {
            requestLayout();
        }
    }

    public void addTab(ActionBar.getMin getmin, int i, boolean z) {
        setMax createTabView = createTabView(getmin, false);
        this.mTabLayout.addView(createTabView, i, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.setMax;
        if (spinner != null) {
            ((length) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            createTabView.setSelected(true);
        }
        if (this.getMin) {
            requestLayout();
        }
    }

    public void updateTab(int i) {
        ((setMax) this.mTabLayout.getChildAt(i)).getMin();
        Spinner spinner = this.setMax;
        if (spinner != null) {
            ((length) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.getMin) {
            requestLayout();
        }
    }

    public void removeTabAt(int i) {
        this.mTabLayout.removeViewAt(i);
        Spinner spinner = this.setMax;
        if (spinner != null) {
            ((length) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.getMin) {
            requestLayout();
        }
    }

    public void removeAllTabs() {
        this.mTabLayout.removeAllViews();
        Spinner spinner = this.setMax;
        if (spinner != null) {
            ((length) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.getMin) {
            requestLayout();
        }
    }

    class setMax extends LinearLayout {
        private View equals;
        private final int[] getMax;
        private TextView getMin;
        ActionBar.getMin length;
        private ImageView setMax;

        public setMax(Context context, ActionBar.getMin getmin, boolean z) {
            super(context, (AttributeSet) null, ITrustedWebActivityCallback.Stub.getMin.setMax);
            int[] iArr = {16842964};
            this.getMax = iArr;
            this.length = getmin;
            prepareFromUri min = prepareFromUri.getMin(context, (AttributeSet) null, iArr, ITrustedWebActivityCallback.Stub.getMin.setMax, 0);
            if (min.setMin(0)) {
                setBackgroundDrawable(min.setMax(0));
            }
            min.setMin.recycle();
            if (z) {
                setGravity(8388627);
            }
            getMin();
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.mMaxTabWidth > 0 && getMeasuredWidth() > ScrollingTabContainerView.this.mMaxTabWidth) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(ScrollingTabContainerView.this.mMaxTabWidth, 1073741824), i2);
            }
        }

        public final void getMin() {
            ActionBar.getMin getmin = this.length;
            View length2 = getmin.length();
            CharSequence charSequence = null;
            if (length2 != null) {
                ViewParent parent = length2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(length2);
                    }
                    addView(length2);
                }
                this.equals = length2;
                TextView textView = this.getMin;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.setMax;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.setMax.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.equals;
            if (view != null) {
                removeView(view);
                this.equals = null;
            }
            Drawable min = getmin.setMin();
            CharSequence max = getmin.getMax();
            if (min != null) {
                if (this.setMax == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.setMax = appCompatImageView;
                }
                this.setMax.setImageDrawable(min);
                this.setMax.setVisibility(0);
            } else {
                ImageView imageView2 = this.setMax;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.setMax.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(max);
            if (z) {
                if (this.getMin == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, ITrustedWebActivityCallback.Stub.getMin.equals);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.getMin = appCompatTextView;
                }
                this.getMin.setText(max);
                this.getMin.setVisibility(0);
            } else {
                TextView textView2 = this.getMin;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.getMin.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.setMax;
            if (imageView3 != null) {
                imageView3.setContentDescription(getmin.getMin());
            }
            if (!z) {
                charSequence = getmin.getMin();
            }
            removeQueueItemAt.setMax(this, charSequence);
        }
    }

    class length extends BaseAdapter {
        public final long getItemId(int i) {
            return (long) i;
        }

        length() {
        }

        public final int getCount() {
            return ScrollingTabContainerView.this.mTabLayout.getChildCount();
        }

        public final Object getItem(int i) {
            return ((setMax) ScrollingTabContainerView.this.mTabLayout.getChildAt(i)).length;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.createTabView((ActionBar.getMin) getItem(i), true);
            }
            setMax setmax = (setMax) view;
            setmax.length = (ActionBar.getMin) getItem(i);
            setmax.getMin();
            return view;
        }
    }

    class getMax implements View.OnClickListener {
        getMax() {
        }

        public final void onClick(View view) {
            int childCount = ScrollingTabContainerView.this.mTabLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ScrollingTabContainerView.this.mTabLayout.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    protected class setMin extends AnimatorListenerAdapter {
        private boolean getMin = false;
        private int setMax;

        protected setMin() {
        }

        public final setMin setMax(ViewPropertyAnimator viewPropertyAnimator, int i) {
            this.setMax = i;
            ScrollingTabContainerView.this.mVisibilityAnim = viewPropertyAnimator;
            return this;
        }

        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.getMin = false;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.getMin) {
                ScrollingTabContainerView.this.mVisibilityAnim = null;
                ScrollingTabContainerView.this.setVisibility(this.setMax);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.getMin = true;
        }
    }
}
