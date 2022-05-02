package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.google.android.material.badge.BadgeDrawable;
import o.ITrustedWebActivityCallback;
import o.MediaMetadataCompat;
import o.onEvent;
import o.onQueueTitleChanged;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class prepareFromMediaId implements getMetadata {
    private boolean FastBitmap$CoordinateSystem;
    private View IsOverlapping;
    private Drawable equals;
    boolean getMax;
    Toolbar getMin;
    private CharSequence hashCode;
    private int invokeSuspend;
    private Drawable isInside;
    private int length;
    CharSequence setMax;
    Window.Callback setMin;
    private CharSequence toDoubleRange;
    private Drawable toFloatRange;
    private View toIntRange;
    private ActionMenuPresenter toString;
    private Drawable valueOf;
    private int values;

    public prepareFromMediaId(Toolbar toolbar, boolean z) {
        this(toolbar, z, ITrustedWebActivityCallback.Stub.IsOverlapping.getMax);
    }

    private prepareFromMediaId(Toolbar toolbar, boolean z, int i) {
        Drawable drawable;
        this.values = 0;
        this.invokeSuspend = 0;
        this.getMin = toolbar;
        this.setMax = toolbar.getTitle();
        this.toDoubleRange = toolbar.getSubtitle();
        this.FastBitmap$CoordinateSystem = this.setMax != null;
        this.toFloatRange = toolbar.getNavigationIcon();
        String str = null;
        prepareFromUri min = prepareFromUri.getMin(toolbar.getContext(), (AttributeSet) null, ITrustedWebActivityCallback.Stub.toIntRange.length, ITrustedWebActivityCallback.Stub.getMin.setMin, 0);
        this.valueOf = min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.toString);
        if (z) {
            CharSequence text = min.setMin.getText(ITrustedWebActivityCallback.Stub.toIntRange.Mean$Arithmetic);
            if (!TextUtils.isEmpty(text)) {
                this.FastBitmap$CoordinateSystem = true;
                this.setMax = text;
                if ((this.length & 8) != 0) {
                    this.getMin.setTitle(text);
                }
            }
            CharSequence text2 = min.setMin.getText(ITrustedWebActivityCallback.Stub.toIntRange.valueOf);
            if (!TextUtils.isEmpty(text2)) {
                this.toDoubleRange = text2;
                if ((this.length & 8) != 0) {
                    this.getMin.setSubtitle(text2);
                }
            }
            Drawable max = min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.FastBitmap$CoordinateSystem);
            if (max != null) {
                this.isInside = max;
                ICustomTabsCallback();
            }
            Drawable max2 = min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.hashCode);
            if (max2 != null) {
                this.equals = max2;
                ICustomTabsCallback();
            }
            if (this.toFloatRange == null && (drawable = this.valueOf) != null) {
                this.toFloatRange = drawable;
                getCause();
            }
            getMin(min.setMin.getInt(ITrustedWebActivityCallback.Stub.toIntRange.isInside, 0));
            int resourceId = min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.toIntRange, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(this.getMin.getContext()).inflate(resourceId, this.getMin, false);
                View view = this.toIntRange;
                if (!(view == null || (this.length & 16) == 0)) {
                    this.getMin.removeView(view);
                }
                this.toIntRange = inflate;
                if (!(inflate == null || (this.length & 16) == 0)) {
                    this.getMin.addView(inflate);
                }
                getMin(this.length | 16);
            }
            int layoutDimension = min.setMin.getLayoutDimension(ITrustedWebActivityCallback.Stub.toIntRange.toFloatRange, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.getMin.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.getMin.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = min.setMin.getDimensionPixelOffset(ITrustedWebActivityCallback.Stub.toIntRange.IsOverlapping, -1);
            int dimensionPixelOffset2 = min.setMin.getDimensionPixelOffset(ITrustedWebActivityCallback.Stub.toIntRange.setMin, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                this.getMin.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.Grayscale$Algorithm, 0);
            if (resourceId2 != 0) {
                Toolbar toolbar2 = this.getMin;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), resourceId2);
            }
            int resourceId3 = min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.invokeSuspend, 0);
            if (resourceId3 != 0) {
                Toolbar toolbar3 = this.getMin;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), resourceId3);
            }
            int resourceId4 = min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.values, 0);
            if (resourceId4 != 0) {
                this.getMin.setPopupTheme(resourceId4);
            }
        } else {
            int i2 = 11;
            if (this.getMin.getNavigationIcon() != null) {
                i2 = 15;
                this.valueOf = this.getMin.getNavigationIcon();
            }
            this.length = i2;
        }
        min.setMin.recycle();
        if (i != this.invokeSuspend) {
            this.invokeSuspend = i;
            if (TextUtils.isEmpty(this.getMin.getNavigationContentDescription())) {
                int i3 = this.invokeSuspend;
                this.hashCode = i3 != 0 ? this.getMin.getContext().getString(i3) : str;
                b();
            }
        }
        this.hashCode = this.getMin.getNavigationContentDescription();
        this.getMin.setNavigationOnClickListener(new View.OnClickListener() {
            final MediaMetadataCompat.LongKey setMax = new MediaMetadataCompat.LongKey(prepareFromMediaId.this.getMin.getContext(), prepareFromMediaId.this.setMax);

            public final void onClick(View view) {
                if (prepareFromMediaId.this.setMin != null && prepareFromMediaId.this.getMax) {
                    prepareFromMediaId.this.setMin.onMenuItemSelected(0, this.setMax);
                }
            }
        });
    }

    public final ViewGroup setMax() {
        return this.getMin;
    }

    public final Context getMin() {
        return this.getMin.getContext();
    }

    public final boolean length() {
        return this.getMin.hasExpandedActionView();
    }

    public final void getMax() {
        this.getMin.collapseActionView();
    }

    public final void setMax(Window.Callback callback) {
        this.setMin = callback;
    }

    public final void setMin(CharSequence charSequence) {
        if (!this.FastBitmap$CoordinateSystem) {
            this.setMax = charSequence;
            if ((this.length & 8) != 0) {
                this.getMin.setTitle(charSequence);
            }
        }
    }

    public final CharSequence setMin() {
        return this.getMin.getTitle();
    }

    public final void length(CharSequence charSequence) {
        this.FastBitmap$CoordinateSystem = true;
        this.setMax = charSequence;
        if ((this.length & 8) != 0) {
            this.getMin.setTitle(charSequence);
        }
    }

    public final boolean IsOverlapping() {
        return this.equals != null;
    }

    public final boolean equals() {
        return this.isInside != null;
    }

    public final void length(Drawable drawable) {
        this.equals = drawable;
        ICustomTabsCallback();
    }

    private void ICustomTabsCallback() {
        Drawable drawable;
        int i = this.length;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.isInside;
            if (drawable == null) {
                drawable = this.equals;
            }
        } else {
            drawable = this.equals;
        }
        this.getMin.setLogo(drawable);
    }

    public final boolean isInside() {
        return this.getMin.canShowOverflowMenu();
    }

    public final boolean toIntRange() {
        return this.getMin.isOverflowMenuShowing();
    }

    public final boolean toFloatRange() {
        return this.getMin.isOverflowMenuShowPending();
    }

    public final boolean FastBitmap$CoordinateSystem() {
        return this.getMin.showOverflowMenu();
    }

    public final boolean toDoubleRange() {
        return this.getMin.hideOverflowMenu();
    }

    public final void values() {
        this.getMax = true;
    }

    public final void setMin(Menu menu, onQueueTitleChanged.setMax setmax) {
        if (this.toString == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.getMin.getContext());
            this.toString = actionMenuPresenter;
            actionMenuPresenter.isInside = ITrustedWebActivityCallback.Stub.toFloatRange.isInside;
        }
        this.toString.setCallback(setmax);
        this.getMin.setMenu((onEvent) menu, this.toString);
    }

    public final void invoke() {
        this.getMin.dismissPopupMenus();
    }

    public final int valueOf() {
        return this.length;
    }

    public final void getMin(int i) {
        View view;
        int i2 = this.length ^ i;
        this.length = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                getCause();
            }
            if ((i2 & 3) != 0) {
                ICustomTabsCallback();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.getMin.setTitle(this.setMax);
                    this.getMin.setSubtitle(this.toDoubleRange);
                } else {
                    this.getMin.setTitle((CharSequence) null);
                    this.getMin.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.toIntRange) != null) {
                if ((i & 16) != 0) {
                    this.getMin.addView(view);
                } else {
                    this.getMin.removeView(view);
                }
            }
        }
    }

    public final void getMin(ScrollingTabContainerView scrollingTabContainerView) {
        Toolbar toolbar;
        View view = this.IsOverlapping;
        if (view != null && view.getParent() == (toolbar = this.getMin)) {
            toolbar.removeView(this.IsOverlapping);
        }
        this.IsOverlapping = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.values == 2) {
            this.getMin.addView(scrollingTabContainerView, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.IsOverlapping.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.setMin = BadgeDrawable.BOTTOM_START;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    public final void setMax(boolean z) {
        this.getMin.setCollapsible(z);
    }

    public final int Mean$Arithmetic() {
        return this.values;
    }

    public final invalidateOptionsMenu setMax(final int i, long j) {
        return ViewCompat.Grayscale$Algorithm(this.getMin).getMin(i == 0 ? 1.0f : 0.0f).getMin(j).length(new onTitleChanged() {
            private boolean setMin = false;

            public final void setMin(View view) {
                prepareFromMediaId.this.getMin.setVisibility(0);
            }

            public final void length(View view) {
                if (!this.setMin) {
                    prepareFromMediaId.this.getMin.setVisibility(i);
                }
            }

            public final void getMin(View view) {
                this.setMin = true;
            }
        });
    }

    private void getCause() {
        if ((this.length & 4) != 0) {
            Toolbar toolbar = this.getMin;
            Drawable drawable = this.toFloatRange;
            if (drawable == null) {
                drawable = this.valueOf;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.getMin.setNavigationIcon((Drawable) null);
    }

    private void b() {
        if ((this.length & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.hashCode)) {
            this.getMin.setNavigationContentDescription(this.invokeSuspend);
        } else {
            this.getMin.setNavigationContentDescription(this.hashCode);
        }
    }

    public final void getMax(SparseArray<Parcelable> sparseArray) {
        this.getMin.saveHierarchyState(sparseArray);
    }

    public final void getMin(SparseArray<Parcelable> sparseArray) {
        this.getMin.restoreHierarchyState(sparseArray);
    }

    public final int Grayscale$Algorithm() {
        return this.getMin.getHeight();
    }

    public final void getMax(int i) {
        this.getMin.setVisibility(i);
    }

    public final void getMax(onQueueTitleChanged.setMax setmax, onEvent.length length2) {
        this.getMin.setMenuCallbacks(setmax, length2);
    }

    public final Menu invokeSuspend() {
        return this.getMin.getMenu();
    }

    public final void length(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = cancelAll.getMin(this.getMin.getContext(), i);
        } else {
            drawable = null;
        }
        this.equals = drawable;
        ICustomTabsCallback();
    }

    public final void setMax(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = cancelAll.getMin(this.getMin.getContext(), i);
        } else {
            drawable = null;
        }
        this.isInside = drawable;
        ICustomTabsCallback();
    }

    public final void setMin(int i) {
        String str;
        if (i == 0) {
            str = null;
        } else {
            str = this.getMin.getContext().getString(i);
        }
        this.hashCode = str;
        b();
    }
}
